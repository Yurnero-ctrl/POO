package Visao;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

import Modelos.ArrayListConsultas;
import Modelos.Cliente;
import Modelos.Consulta;
import Persistencia.ClienteDAO;
import Persistencia.ConsultaDAO;


public class FXMLLoginPetShopController implements Initializable{
	
	private ClienteDAO cliDAO = new ClienteDAO();
	private ConsultaDAO conDAO = new ConsultaDAO();
	//private Cliente c;
	private ObservableList<String> nomesClientes = FXCollections.observableArrayList();
	private ObservableList<String> nomesConsultas = FXCollections.observableArrayList();
	//ArrayListConsultas con
	//con = new ArrayListConsultas();
	//ClienteDAO cliDAO = new ClienteDAO();
	//ConsultaDAO conDAO = new ConsultaDAO();
	//ArrayList Cliente = new ArrayCliente();
	//ArrayList<Consulta> lista1;
	//int i, e;
	
	@FXML
    private AnchorPane apnLogin;

    @FXML
    private Label lblPetShoPataDeGorila;

    @FXML
    private Label lblLogin, lblPetShopPataDeGorila;

    @FXML
    private Label lblSenha;

    @FXML
    private Button btnEntrar;

    @FXML
    private PasswordField fieldSenha;

    @FXML
    private TextField fieldLogin;

    @FXML
    private AnchorPane apnMenu;

    @FXML
    private Label lblPetShoPataDeGorila1;

    @FXML
    private Button btnCadastrarCliente;

    @FXML
    private Button btnMarcarConsulta;

    @FXML
    private Button btnRemoverConsultas;

    @FXML
    private Button btnVerCliente;

    @FXML
    private Button btnVerConsultas;

    @FXML
    private AnchorPane apnCadastrarCliente;

    @FXML
    private Label lblCadastrarCliente;

    @FXML
    private Label lblNome;

    @FXML
    private Label lblEndereco;

    @FXML
    private Label lblCpf;

    @FXML
    private Label lblTelefone;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField fieldNome;

    @FXML
    private TextField fieldEndereco;

    @FXML
    private TextField fieldCpf;

    @FXML
    private TextField fieldTelefone;

    @FXML
    private AnchorPane apnMarcarConsulta;

    @FXML
    private Label lblMarcarConsulta;

    @FXML
    private Label lblNomePet;

    @FXML
    private Label lblEspecie;

    @FXML
    private Label lblRaca;

    @FXML
    private Label lblSexo;

    @FXML
    private Button btnCadastrarConsulta;

    @FXML
    private Button btnVoltarConsulta;

    @FXML
    private TextField fieldNomePet;

    @FXML
    private TextField fieldEspecie;

    @FXML
    private TextField fieldRaca;

    @FXML
    private TextField fieldSexo;

    @FXML
    private TextField fieldAtendimento;
    
    @FXML
    private TextField fieldIdPet;

    @FXML
    private Label lblAtendimento;

    @FXML
    private AnchorPane apnClienteCadastrados;

    @FXML
    private Label lblClientesCadastrados;

    @FXML
    private Button btnVoltaClienteCadastrados;

    @FXML
    private AnchorPane apnClienteCadastrados1,apnConsultasCadastradas;

    @FXML
    private Label lblConsultasCadastradas;

    @FXML
    private Button btnVoltarConsultasCadastradas;

    @FXML
    private AnchorPane apnRemoverConsultas,apnLoginPet;

    @FXML
    private Label lblRemoverConsultas;

    @FXML
    private Button btnVoltarRemoverConsultas;

    @FXML
    private Label lblId;

    @FXML
    private TextField fieldId;
    
    @FXML
    private ComboBox<String> cbxClientes, cbxConsultas, cbxIdRemover;

    @FXML
    void btnEntrar(ActionEvent event) {

    }

    
    int op;
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
    	apnLoginPet.setVisible(true);
        apnMenu.setVisible(false);
        apnCadastrarCliente.setVisible(false);
        apnMarcarConsulta.setVisible(false);
        apnClienteCadastrados.setVisible(false);
        apnConsultasCadastradas.setVisible(false);
        apnRemoverConsultas.setVisible(false);
	}
	@FXML
    private void btnEntrarAction() {
    	String login = "matheus";
    	String senha = "123";
    	if(fieldLogin.getText().equals(login) && fieldSenha.getText().equals(senha)) {
    		apnLoginPet.setVisible(false);
       		apnMenu.setVisible(true);
	        op = 0;
	        configurarTela();
    	} else {
	       	fieldLogin.setText("");
	       	fieldSenha.setText("");
            fieldLogin.requestFocus();
    	}
    	
    	apnLoginPet.setVisible(false);
        apnMenu.setVisible(true);
        apnCadastrarCliente.setVisible(false);
        apnMarcarConsulta.setVisible(false);
        apnClienteCadastrados.setVisible(false);
        apnConsultasCadastradas.setVisible(false);
        apnRemoverConsultas.setVisible(false);
    }
	private void configurarTela() {
		
	}
	//botão para cadastrar cliente
	@FXML
    void btnCadastrarClienteAction(ActionEvent event) {
		
		//to do
		
    	apnLoginPet.setVisible(false);
        apnMenu.setVisible(false);
        apnCadastrarCliente.setVisible(true);
    }
	//botão para marcar consultas
	@FXML
    void btnMarcarConsultaAction(ActionEvent event) {
		
    	apnLoginPet.setVisible(false);
        apnMenu.setVisible(false);
        apnCadastrarCliente.setVisible(false);
        apnMarcarConsulta.setVisible(true);
    }
	//botão para ver clientes
	@FXML
    void btnVerClienteAction(ActionEvent event) {
		
		nomesClientes.clear();
        cbxClientes.getSelectionModel().clearSelection();
        cbxClientes.getItems().clear();
        nomesClientes.addAll(cliDAO.ClienteGeral2());
        cbxClientes.setItems(nomesClientes);
        cbxClientes.getSelectionModel().selectFirst();
        
    	apnLoginPet.setVisible(false);
        apnMenu.setVisible(false);
        apnCadastrarCliente.setVisible(false);
        apnMarcarConsulta.setVisible(false);
        apnClienteCadastrados.setVisible(true);
    }
	//botão para ver consultas
	@FXML
    void btnVerConsultasAction(ActionEvent event) {
		
		nomesConsultas.clear();
		cbxConsultas.getSelectionModel().clearSelection();
		cbxConsultas.getItems().clear();
        nomesConsultas.addAll(conDAO.ConsultaGeral2());
        cbxConsultas.setItems(nomesConsultas);
        cbxConsultas.getSelectionModel().selectFirst();
        
    	apnLoginPet.setVisible(false);
        apnMenu.setVisible(false);
        apnCadastrarCliente.setVisible(false);
        apnMarcarConsulta.setVisible(false);
        apnClienteCadastrados.setVisible(false);
        apnConsultasCadastradas.setVisible(true);
    }
	//botão para remover consultas
	@FXML
    void btnRemoverConsultasAction(ActionEvent event) {
		//todo
		
		nomesConsultas.clear();
		cbxIdRemover.getSelectionModel().clearSelection();
		cbxIdRemover.getItems().clear();
        nomesConsultas.addAll(conDAO.ConsultaGeral2());
        cbxIdRemover.setItems(nomesConsultas);
        cbxIdRemover.getSelectionModel().selectFirst();
        
        
		
    	apnLoginPet.setVisible(false);
        apnMenu.setVisible(false);
        apnCadastrarCliente.setVisible(false);
        apnMarcarConsulta.setVisible(false);
        apnClienteCadastrados.setVisible(false);
        apnConsultasCadastradas.setVisible(false);
        apnRemoverConsultas.setVisible(true);
    }
	@FXML
    void btnRemoverAction(ActionEvent event) {
		//todo
		
		String Consulta = cbxIdRemover.getSelectionModel().getSelectedItem().toString();
        String[] arrOfStr = Consulta.split("/");
        conDAO.exclusao(Integer.parseInt(arrOfStr[0]));
		
    	apnLoginPet.setVisible(false);
        apnMenu.setVisible(true);
        apnCadastrarCliente.setVisible(false);
        apnMarcarConsulta.setVisible(false);
        apnClienteCadastrados.setVisible(false);
        apnConsultasCadastradas.setVisible(false);
        apnRemoverConsultas.setVisible(false);
    }
	//botões para voltar
	//botão de voltar 
	@FXML
    void btnVoltarAction() {
	apnLoginPet.setVisible(false);
    apnMenu.setVisible(true);
    apnCadastrarCliente.setVisible(false);
    apnMarcarConsulta.setVisible(false);
    apnClienteCadastrados.setVisible(false);
    apnConsultasCadastradas.setVisible(false);
    apnRemoverConsultas.setVisible(false);
	}
	@FXML
	void btnVoltarConsultaAction() {
	apnLoginPet.setVisible(false);
	apnMenu.setVisible(true);
	apnCadastrarCliente.setVisible(false);
	apnMarcarConsulta.setVisible(false);
	apnClienteCadastrados.setVisible(false);
	apnConsultasCadastradas.setVisible(false);
	apnRemoverConsultas.setVisible(false);
	}
	@FXML
	void btnVoltaClienteCadastradosAction() {
	apnLoginPet.setVisible(false);
	apnMenu.setVisible(true);
	apnCadastrarCliente.setVisible(false);
	apnMarcarConsulta.setVisible(false);
	apnClienteCadastrados.setVisible(false);
	apnConsultasCadastradas.setVisible(false);
	apnRemoverConsultas.setVisible(false);
	}
	@FXML
	void btnVoltarConsultasCadastradasAction() {
	apnLoginPet.setVisible(false);
	apnMenu.setVisible(true);
	apnCadastrarCliente.setVisible(false);
	apnMarcarConsulta.setVisible(false);
	apnClienteCadastrados.setVisible(false);
	apnConsultasCadastradas.setVisible(false);
	apnRemoverConsultas.setVisible(false);
	}
	@FXML
	void btnVoltarRemoverConsultasAction() {
	apnLoginPet.setVisible(false);
	apnMenu.setVisible(true);
	apnCadastrarCliente.setVisible(false);
	apnMarcarConsulta.setVisible(false);
	apnClienteCadastrados.setVisible(false);
	apnConsultasCadastradas.setVisible(false);
	apnRemoverConsultas.setVisible(false);
	}
	
	public void btnCadastrarAction() {
		
		String nome = fieldNome.getText();
        String endereco = fieldEndereco.getText();
        int cpf = Integer.parseInt(fieldCpf.getText());
        int telefone = Integer.parseInt(fieldTelefone.getText());

     Cliente usuario = new Cliente(nome,endereco,cpf,telefone);
     

     cliDAO.inclusaocliente(usuario);
		
		apnLoginPet.setVisible(false);
		apnMenu.setVisible(true);
		apnCadastrarCliente.setVisible(false);
		apnMarcarConsulta.setVisible(false);
		apnClienteCadastrados.setVisible(false);
		apnConsultasCadastradas.setVisible(false);
		apnRemoverConsultas.setVisible(false);

	}
	
	public void btnCadastrarConsultaAction() {
		
		String nomepet = fieldNomePet.getText();
        String especie = fieldEspecie.getText();
        String raca = fieldRaca.getText();
        String sexo = fieldSexo.getText();
        String atendimento = fieldAtendimento.getText();
        int idPet = Integer.parseInt(fieldIdPet.getText());
        

     Consulta consulta = new Consulta(nomepet,especie,raca,sexo,atendimento,idPet);

     conDAO.inclusao(consulta);
		
		apnLoginPet.setVisible(false);
		apnMenu.setVisible(true);
		apnCadastrarCliente.setVisible(false);
		apnMarcarConsulta.setVisible(false);
		apnClienteCadastrados.setVisible(false);
		apnConsultasCadastradas.setVisible(false);
		apnRemoverConsultas.setVisible(false);

	}
	
	
}
