package ro.fasttrackit.curs2.builders;

import lombok.Builder;

@Builder
public record NewPersonRecord(String name, int age) {
}
