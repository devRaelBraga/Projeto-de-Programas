package escola;

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
	
	public void mostrarData() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano );
	}
	
	public String getData() {
		String date = this.dia +"/"+ this.mes +"/"+ this.ano;
		return date;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
}

