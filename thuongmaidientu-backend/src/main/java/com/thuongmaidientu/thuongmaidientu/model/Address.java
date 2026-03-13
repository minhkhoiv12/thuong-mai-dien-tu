package com.thuongmaidientu.thuongmaidientu.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "addresses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @NotBlank
    @Size(min = 5, message = "Tên đường tối thiểu từ 5 ký tự")
    private String street;

    @NotBlank
    @Size(min = 5, message = "Tên tòa nhà phải có ít nhất 5 ký tự")
    private String buildingName;

    @NotBlank
    @Size(min = 4, message = "Tên thành phố phải có ít nhất 4 ký tự")
    private String city;

    @NotBlank
    @Size(min = 2, message = "Tên tỉnh phải có ít nhất 2 ký tự")
    private String state;

    @NotBlank
    @Size(min = 2, message = "Tên quốc gia phải có ít nhất 2 ký tự")
    private String country;

    @NotBlank
    @Size(min = 5, message = "Mã bưu điện phải có ít nhất 5 ký tự")
    private String pincode;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Address(String street, String buildingName, String city, String state, String country, String pincode) {
        this.street = street;
        this.buildingName = buildingName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
}
