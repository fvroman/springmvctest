package com.taiga;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

class Person {
     String firstName = "Borya";

     @NotNull(message = "Required!")
     @Size(min = 1, message = "Required!")
     String lastName = "Borievich";

     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }

     public String getFirstName() {
         return firstName;
     }

     public void setLastName(String lastName) {
         this.lastName = lastName;
     }

     public String getLastName() {
         return lastName;
     }
}
