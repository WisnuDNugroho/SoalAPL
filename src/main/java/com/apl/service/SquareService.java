package com.apl.service;

import com.apl.model.SquareResponse;
import org.springframework.stereotype.Service;

@Service
public class SquareService {

    public SquareResponse squareFunction(Integer N){

        StringBuilder result = new StringBuilder();

        if (N < 3){
            result = new StringBuilder("Nilai terlalu kecil");
        } else if (N > 9){
            result = new StringBuilder("Nilai terlalu besar");
        } else {
            for (int i = 0; i < N-1; i++) {
                if (i == 0) {
                    for (int j = 0; j < N; j++) {
                        result.append("=");
                    }
                } else {
                    for (int j = 0; j < N; j++) {
                        if (j == 0 || j == N - 1) {
                            result.append("|");
                        } else {
                            result.append(" ");
                        }
                    }
                }
            }

            for (int j = 0; j < N; j++) {
                result.append("=");
            }
        }

        return SquareResponse.builder()
                .square(result.toString())
                .build();
    }
}
