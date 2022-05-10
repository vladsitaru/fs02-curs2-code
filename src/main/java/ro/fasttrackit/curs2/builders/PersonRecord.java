package ro.fasttrackit.curs2.builders;

import java.util.function.Consumer;

record Address(String city){
    public static AddressBuilder builder(){
        return new AddressBuilder();
    }
    public static class AddressBuilder{
        private String city;

        public AddressBuilder city(String city){
            this.city=city;
            return this;
        }

        public Address build(){
            return new Address(city);
        }
    }
}
public record PersonRecord(String name, int age, Address address) {

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }
    public static class PersonBuilder{
        private String name;
        private int age;
        private Address address;

        public PersonBuilder name(String name){
            this.name = name;
            return this;
        }

        public PersonBuilder age(int age){
            this.age = age;
            return this;
        }

        public PersonBuilder address(Consumer<Address.AddressBuilder> addressBuilder){
            Address.AddressBuilder aBuilder = Address.builder();
            addressBuilder.accept(aBuilder);
            this.address=aBuilder.build();
            return this;
        }

        public PersonRecord build(){
            return new PersonRecord(this.name, this.age, this.address);
        }
    }
}
