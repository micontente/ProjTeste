import java.util.Calendar;
import java.util.GregorianCalendar;

public class Teste {

	public static void main(String[] args) {
		
//		GregorianCalendar diaSeguinte = new GregorianCalendar (ano,mes,dia);
//		Calendar dataEntrega = Calendar.getInstance();
//		Calendar dataHoje = Calendar.getInstance();
		
		GregorianCalendar dataEntrega = new GregorianCalendar (2015,12,28);
		GregorianCalendar diaSeguinte = new GregorianCalendar (2015,2,28);
		GregorianCalendar diaSeguinte2 = new GregorianCalendar (2015,3,28);

//		GregorianCalendar dataEntrega = dataHoje;

		dataEntrega.add(GregorianCalendar.DAY_OF_MONTH,3);
		diaSeguinte.add(GregorianCalendar.DAY_OF_MONTH,3);
		diaSeguinte2.add(GregorianCalendar.DAY_OF_MONTH,3);
		//public void add(int field, int amount)

//		dataEntrega.add(10, 2);
//		dataEntrega.add(GregorianCalendar.DAY_OF_MONTH, 1);;
//		diaSeguinte.add(GregorianCalendar.DAY_OF_MONTH, 1);

		System.out.printf("%d/%d/%d\n",dataEntrega.get(GregorianCalendar.DAY_OF_MONTH),dataEntrega.get(GregorianCalendar.MONTH)+1, dataEntrega.get(GregorianCalendar.YEAR));

		System.out.printf("%d/%d/%d\n",diaSeguinte.get(GregorianCalendar.DAY_OF_MONTH),diaSeguinte.get(GregorianCalendar.MONTH), diaSeguinte.get(GregorianCalendar.YEAR));
		System.out.printf("%d/%d/%d\n",diaSeguinte2.get(GregorianCalendar.DAY_OF_MONTH),diaSeguinte2.get(GregorianCalendar.MONTH), diaSeguinte2.get(GregorianCalendar.YEAR));

	
	}

}
