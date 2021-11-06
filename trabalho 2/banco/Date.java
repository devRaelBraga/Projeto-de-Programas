package banco;

public class Date {
	private String dia;
	private String mes;
	private String ano;
	

	public Date(String day, String month, String year){
		this.dia = day;
		this.mes = month;
		this.ano = year;
	}
	
	public String getDay(){
		return this.dia;
	}
	
	public String getMonth(){
		return this.mes;
	}

	public String getYear(){
		return this.ano;
	}
}
