package co.pragra.learning.first_spring_proj.dec22;

import java.util.Objects;

public class PhoneNumber {

    public int phNumber;

    public int getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(int phNumber) {
        this.phNumber = phNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return phNumber == that.phNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(phNumber);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phNumber=" + phNumber +
                '}';
    }

    public PhoneNumber(int phNumber) {
        this.phNumber=phNumber;
    }
}
