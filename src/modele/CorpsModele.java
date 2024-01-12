package modele;

public class CorpsModele {
	private String nomCorps;
	private String desCorps;
        private String idCorps;
        public String getIdCorps(){
            return idCorps;
        }
        public void setIdCorps(String idC){
            this.idCorps = idC;
        }
	public String getNomCorps() {
		return nomCorps;
	}
	public void setNomCorps(String corps) {
		this.nomCorps = corps;
	}
	public String getDesCorps() {
		return desCorps;
	}
	public void setDesCorps(String description) {
		this.desCorps = description;
	}
	

}
