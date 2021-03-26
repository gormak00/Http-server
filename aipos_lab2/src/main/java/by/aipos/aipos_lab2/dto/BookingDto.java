package by.aipos.aipos_lab2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Setter
@Getter
public class BookingDto {
    @NotNull(message = "Empty clientId field")
    private int clientId;

    @NotNull(message = "Empty carId field")
    private int carId;

    @NotNull(message = "Empty dateStart field")
    @Size(message = "DateStart is too long (max = 10)", max = 10) //format "2021-12-30"
    private String dateStart;

    @NotNull(message = "Empty dateEnd field")
    @Size(message = "DateEnd is too long (max = 10)", max = 10) //format "2021-12-30"
    private String dateEnd;
}
