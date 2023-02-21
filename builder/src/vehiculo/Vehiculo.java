package vehiculo;

public class Vehiculo {

	public Rueda tipoRuedas;
	public Carroceria tipoCarroceria;
	public IMotor motor;
	public boolean cierreCentralizado;
	public String color;
	public boolean direccionAsistida;
	public String marca;
	public String modelo;

	public Vehiculo() {

	}

	public Rueda getTipoRuedas() {
		return tipoRuedas;
	}

	public void setTipoRuedas(Rueda tipoRuedas) {
		this.tipoRuedas = tipoRuedas;
	}

	public Carroceria getTipoCarroceria() {
		return tipoCarroceria;
	}

	public void setTipoCarroceria(Carroceria tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}

	public IMotor getMotor() {
		return motor;
	}

	public void setMotor(IMotor motor) {
		this.motor = motor;
	}

	public boolean isCierreCentralizado() {
		return cierreCentralizado;
	}

	public void setCierreCentralizado(boolean cierreCentralizado) {
		this.cierreCentralizado = cierreCentralizado;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isDireccionAsistida() {
		return direccionAsistida;
	}

	public void setDireccionAsistida(boolean direccionAsistida) {
		this.direccionAsistida = direccionAsistida;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPrestaciones() {

		StringBuilder sb = new StringBuilder();
		String n1 = "\n";
		sb.append(" El vehiculo es un ").append(marca).append(" y el modelo es ").append(modelo);
		sb.append(" estilo ").append(tipoCarroceria.getTipoCarroceria()).append(" color  ").append(color).append(n1);
		sb.append(" Carroceria ").append(tipoCarroceria.getMaterial()).append(n1);
		sb.append(" Rueda con llanta ").append(tipoRuedas.getLlanta()).append(n1);
		sb.append(" Rueda con neumaticos ").append(tipoRuedas.getNeomatico()).append(n1);
		sb.append(" Rueda con diametro ").append(tipoRuedas.getDiametro()).append(n1);
		sb.append(" Y el motor seria  ").append(motor.inyectarCombustible(100)).append(n1);
		return sb.toString();
	}

}
