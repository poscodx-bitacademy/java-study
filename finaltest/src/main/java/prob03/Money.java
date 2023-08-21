package prob03;

import java.util.Objects;

public class Money {
	private int amount;
    
    public Money(int amount) {
    	this.amount = amount;
    }

	public Money add(Money money) {
		return new Money(amount + money.amount);
	}

	public Money minus(Money money) {
		return new Money(amount - money.amount);
	}

	public Money multiply(Money money) {
		return new Money(amount * money.amount);
	}

	public Money devide(Money money) {
		return new Money(amount / money.amount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		return amount == other.amount;
	}
}
