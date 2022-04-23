import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


import com.google.gson.Gson;

@ManagedBean(name = "cepTeste")
@RequestScoped
public class CepBean {
		
		private ViaCep cep = new ViaCep();
		  
		private String cepFormatado = "";
		
		private Boolean indexModal = Boolean.FALSE;
		
		public void PesquisarCep() {
			
			System.out.println(cep.getCep());
			
			
			/*
			 * try { System.out.println("Cep digitado: " + cep.getCep());
			 * 
			 * URL url = new URL("https://viacep.com.br/ws/" + getCepFormatado() +
			 * "/json/"); URLConnection connection = url.openConnection(); InputStream is =
			 * connection.getInputStream(); BufferedReader br = new BufferedReader(new
			 * InputStreamReader(is, "UTF-8"));
			 * 
			 * StringBuilder jsonCep = new StringBuilder();
			 * 
			 * String cepTamanho;
			 * 
			 * while((cepTamanho = br.readLine()) != null) { jsonCep.append(cepTamanho); }
			 * 
			 * ViaCep viaCepAuxiliar = new Gson().fromJson(jsonCep.toString(),
			 * ViaCep.class);
			 * 
			 * cep.setCep(viaCepAuxiliar.getCep()); cep.setUf(viaCepAuxiliar.getUf());
			 * cep.setLocalidade(viaCepAuxiliar.getLocalidade());
			 * cep.setBairro(viaCepAuxiliar.getBairro());
			 * cep.setLogradouro(viaCepAuxiliar.getLogradouro());
			 * 
			 * 
			 * 
			 * }catch(Exception e){ System.out.println("Deu ruim \n Erro: " + e); new
			 * PrimeFacesContext(null).addMessage("Ocorreu um erro com o Cep.", null); }
			 */
		

		}

		public ViaCep getCep() {
			return cep;
		}

		public void setCep(ViaCep cep) {
			this.cep = cep;
		}

		public String getCepFormatado() {
			if (cep.getCep().length() > 1) {
			 setCepFormatado(cep.getCep().split("-")[0] + cep.getCep().split("-")[1]);	 
			}
			return cepFormatado;
		}
		
		public void setCepFormatado(String cepFormatado) {
			this.cepFormatado = cepFormatado;
		}

		public Boolean getIndexModal() {
			return indexModal;
		}

		public void setIndexModal(Boolean indexModal) {
			this.indexModal = indexModal;
		}
		
}
