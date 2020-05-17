package com.brothers.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    @NotNull(message = "{user.name.notNull}")
    @Size(min=3, max=120, message = "{user.name.size}")
    private String name;

    @NotNull(message = "{user.age.notNull}")
    @Positive
    private Integer age;
}
