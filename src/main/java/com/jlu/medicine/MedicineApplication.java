package com.jlu.medicine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.jlu.medicine.mapper")
public class MedicineApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(MedicineApplication.class, args);
    }


}
