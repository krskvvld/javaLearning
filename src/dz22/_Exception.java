package dz22;

public class _Exception {
    public static void main(String[] args) throws NoWaterException {
        Tiger tiger = new Tiger();
        tiger.eat("meet");
        try {
            tiger.drink("water");
            try {
                tiger.drink("beer");
            } catch (NoWaterException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Это внутренний финальный блок");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class NoMeetException extends RuntimeException {
    public NoMeetException(String str) {
        super(str);
    }
}

class NoWaterException extends Exception {
    public NoWaterException(String str) {
        super(str);
    }
}

class Tiger {
    public void eat(String food) {
        if (!food.equals("meet")) {
            throw new NoMeetException("Тигр не ест " + food);
        } else {
            System.out.println("Тигр ест мясо");
        }
    }

    public void drink(String drink) throws NoWaterException{
        if (!drink.equals("water")) {
            throw new NoWaterException("Тигр не пьёт " + drink);
        } else {
            System.out.println("Тигр пьёт воду");
        }
    }
}