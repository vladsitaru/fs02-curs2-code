package ro.fasttrackit.curs2.builders;

public class PersonMain {
    public static void main(String[] args) {
        Person person = Person.builder()
                .name("Ana")
                .age(33)
                .married(true)
                .address("Oradea")
                .build();
        System.out.println(person);

        System.out.println(PersonRecord.builder()
                .age(3)
                .name("Laurentiu")
                .build());

        PersonRecord.builder()
                .name("Adi")
                .address(addressBuilder -> addressBuilder.city("Oradea"))
                .age(3)
                .build();

        System.out.println(NewPerson.builder()
                .name("Marius")
                .age(33)
                .build());

        System.out.println(NewPersonRecord.builder()
                .name("Alin")
                .build());

        var maria = PersonLombok.builder()
                .name("Maria")
                .age(22)
                .build();

        System.out.println(maria);
        System.out.println(maria.withAge(23));
        System.out.println(maria);
    }
}
