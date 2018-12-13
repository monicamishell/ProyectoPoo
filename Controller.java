package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import  java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private ImageView botonverde;
    @FXML private ImageView botonamarillo;
    @FXML private AnchorPane main;
    @FXML private AnchorPane peces;
    @FXML private ImageView playbtn;
    @FXML private ImageView playbtnverde;
    @FXML private AnchorPane play;
    @FXML private ImageView backbtn;
    @FXML private ImageView backbtnverde;
    @FXML private TextField name_pez;
    @FXML private ImageView botonAyudaAmarillo;
    @FXML private ImageView botonAyudaVerde;
    @FXML private ImageView instructivo;
    //CUADRO GANAR Y PERDER/////////////////////
    @FXML private ImageView cuadrowin;
    @FXML private ImageView cuadrolose;
    //VIDAS/////////////////////////////////////
    @FXML private ImageView vida3;
    @FXML private ImageView vida2;
    @FXML private ImageView vida1;
    @FXML private ImageView vida0;
    //CUADRO PARA RESULTADO/////////////////////
    @FXML private ImageView cuadrovacio;
    //SIMBOLOS//////////////////////////////////
    @FXML private ImageView suma;
    @FXML private ImageView resta;
    //CUADROS DE REVISION///////////////////////
    @FXML private ImageView revisasuma;
    @FXML private ImageView revisaresta;
    //BOTONES DE VOLVER A MENU O JUGAR OTRA VEZ//
    @FXML private ImageView volverjugar;
    @FXML private ImageView volvermenu;
    //RESULTADO//////////////////////////////////
    @FXML private ImageView c0;
    @FXML private ImageView c1;
    @FXML private ImageView c2;
    @FXML private ImageView c3;
    @FXML private ImageView c4;
    @FXML private ImageView c5;
    @FXML private ImageView c6;
    @FXML private ImageView c7;
    @FXML private ImageView c8;
    @FXML private ImageView c9;
    @FXML private ImageView c10;
    @FXML private ImageView c11;
    @FXML private ImageView c12;
    @FXML private ImageView c13;
    @FXML private ImageView c14;
    @FXML private ImageView c15;
    @FXML private ImageView c16;
    @FXML private ImageView c17;
    @FXML private ImageView c18;
    @FXML private ImageView c19;
    @FXML private ImageView c20;
    //DIGITOS DE B///////////////////////////////
    @FXML private ImageView b1;
    @FXML private ImageView b2;
    @FXML private ImageView b3;
    @FXML private ImageView b4;
    @FXML private ImageView b5;
    @FXML private ImageView b6;
    @FXML private ImageView b7;
    @FXML private ImageView b8;
    @FXML private ImageView b9;
    @FXML private ImageView b10;
    //////////////////////////////////
    private burbujas burbuja = new burbujas();
    private int resultado=0;
    private int numero;
    private int nivel=1;
    private int vida=3;
    private int op=0;
    //////////////////////////////////

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        name_pez.addEventFilter(KeyEvent.ANY,letters);

    }
//////////////////////////////////////////////////////////////
//OnMouseClicked de cada una de las burbujas
public void tocaBurbuja0(MouseEvent event) {

    burbuja.setValor(0);

}
public void tocaBurbuja1(MouseEvent event) {

    burbuja.setValor(1);

}


    public void tocaBurbuja2(MouseEvent event) {

        burbuja.setValor(2);

    }


    public void tocaBurbuja3(MouseEvent event) {

        burbuja.setValor(3);

    }


    public void tocaBurbuja4(MouseEvent event) {

        burbuja.setValor(4);

    }



    public void tocaBurbuja5(MouseEvent event) {

        burbuja.setValor(5);

    }



    public void tocaBurbuja6(MouseEvent event) {

        burbuja.setValor(6);


    }


    public void tocaBurbuja7(MouseEvent event) {

        burbuja.setValor(7);

    }


    public void tocaBurbuja8(MouseEvent event) {

        burbuja.setValor(8);


    }



    public void tocaBurbuja9(MouseEvent event) {

        burbuja.setValor(9);


    }



    public void tocaBurbuja10(MouseEvent event) {

        burbuja.setValor(10);


    }



    public void tocaBurbuja11(MouseEvent event) {

        burbuja.setValor(11);


    }



    public void tocaBurbuja12(MouseEvent event) {

        burbuja.setValor(12);


    }


    public void tocaBurbuja13(MouseEvent event) {

        burbuja.setValor(13);


    }



    public void tocaBurbuja14(MouseEvent event) {

        burbuja.setValor(14);

    }



    public void tocaBurbuja15(MouseEvent event) {

        burbuja.setValor(15);

    }



    public void tocaBurbuja16(MouseEvent event) {

        burbuja.setValor(16);

    }


    public void tocaBurbuja17(MouseEvent event) {

        burbuja.setValor(17);

    }



    public void tocaBurbuja18(MouseEvent event) {

        burbuja.setValor(18);

    }



    public void tocaBurbuja19(MouseEvent event) {

        burbuja.setValor(19);

    }



    public void tocaBurbuja20(MouseEvent event) {

        burbuja.setValor(20);

    }


    public void generaNumeroResultadoSuma(){

        Random aleatorio=new Random(System.currentTimeMillis());
          this.resultado=((aleatorio.nextInt(10))+1)+this.numero;
        aleatorio.setSeed(System.currentTimeMillis());

        switch (this.resultado){
            case 1: c1.setVisible(true); break;
            case 2: c2.setVisible(true); break;
            case 3: c3.setVisible(true); break;
            case 4: c4.setVisible(true); break;
            case 5: c5.setVisible(true); break;
            case 6: c6.setVisible(true); break;
            case 7: c7.setVisible(true); break;
            case 8: c8.setVisible(true); break;
            case 9: c9.setVisible(true); break;
            case 10: c10.setVisible(true); break;
            case 11: c11.setVisible(true); break;
            case 12: c12.setVisible(true); break;
            case 13: c13.setVisible(true); break;
            case 14: c14.setVisible(true); break;
            case 15: c15.setVisible(true); break;
            case 16: c16.setVisible(true); break;
            case 17: c17.setVisible(true); break;
            case 18: c18.setVisible(true); break;
            case 19: c19.setVisible(true); break;
            case 20: c20.setVisible(true); break;
        }

    }

    public void generaNumeroResultadoResta(){

        Random aleatorio=new Random(System.currentTimeMillis());
       // this.resultado=((aleatorio.nextInt(15))+1);
        this.resultado=((aleatorio.nextInt(9))+10)-this.numero;
       // this.resultado= (int)(Math.random()*8+10);
        //this.resultado= this.resultado-this.numero;
        aleatorio.setSeed(System.currentTimeMillis());

        switch (this.resultado){
            case 1: c1.setVisible(true); break;
            case 2: c2.setVisible(true); break;
            case 3: c3.setVisible(true); break;
            case 4: c4.setVisible(true); break;
            case 5: c5.setVisible(true); break;
            case 6: c6.setVisible(true); break;
            case 7: c7.setVisible(true); break;
            case 8: c8.setVisible(true); break;
            case 9: c9.setVisible(true); break;
            case 10: c10.setVisible(true); break;
            case 11: c11.setVisible(true); break;
            case 12: c12.setVisible(true); break;
            case 13: c13.setVisible(true); break;
            case 14: c14.setVisible(true); break;
            case 15: c15.setVisible(true); break;
            //
            case 16: c16.setVisible(true); break;
            case 17: c17.setVisible(true); break;
            case 18: c18.setVisible(true); break;
            case 19: c19.setVisible(true); break;
            case 20: c20.setVisible(true); break;
        }



    }



    public void generaNumeroOperaciones(){

        Random aleatorio=new Random(System.currentTimeMillis());
        this.numero=((aleatorio.nextInt(9))+1);

        switch (this.numero){
            case 1: b1.setVisible(true); break;
            case 2: b2.setVisible(true); break;
            case 3: b3.setVisible(true); break;
            case 4: b4.setVisible(true); break;
            case 5: b5.setVisible(true); break;
            case 6: b6.setVisible(true); break;
            case 7: b7.setVisible(true); break;
            case 8: b8.setVisible(true); break;
            case 9: b9.setVisible(true); break;
            case 10: b10.setVisible(true); break;

        }

    }


    //OnMouseClicked del btn de revisa suma
    public void revisaResultadoSuma(MouseEvent event){

        if(this.op==0){
            generaNumeroOperaciones();
            generaNumeroResultadoSuma();
            this.op++;
        }


        else{


            int operacion= burbuja.valor+numero;

            if(operacion==resultado){
                apagaNums();
                generaNumeroOperaciones();
                generaNumeroResultadoSuma();
                this.nivel=this.nivel+1;

                if(this.nivel==7){
                    apagaNums();
                    generaNumeroResultadoResta();
                    generaNumeroOperaciones();
                    revisasuma.setVisible(false);
                    revisaresta.setVisible(true);
                    resta.setVisible(true);
                    suma.setVisible(false);
                }

            }
            else{

                this.vida=this.vida-1;

                switch (this.vida){

                    case 0: vida0.setVisible(true);
                        vida1.setVisible(false);
                        vida2.setVisible(false);
                        vida3.setVisible(false);
                        cuadrolose.setVisible(true);
                        volvermenu.setVisible(true);
                        volverjugar.setVisible(true);
                        break;

                    case 1: vida1.setVisible(true);
                        vida0.setVisible(false);
                        vida2.setVisible(false);
                        vida3.setVisible(false);
                        break;

                    case 2: vida2.setVisible(true);
                        vida0.setVisible(false);
                        vida1.setVisible(false);
                        vida3.setVisible(false);
                        break;


                }
                apagaNums();
                generaNumeroResultadoSuma();
                generaNumeroOperaciones();
            }
        }

    }

    //OnMouseClick del btn de revisa resta
    public void revisaResultadoResta(MouseEvent event){


            int operacion= burbuja.valor-numero;
            if(operacion==resultado){
                apagaNums();
                generaNumeroOperaciones();
                generaNumeroResultadoResta();
                this.nivel=this.nivel+1;

                if(this.nivel==14){
                    revisaresta.setVisible(false);
                    suma.setVisible(false);
                    resta.setVisible(false);
                    cuadrowin.setVisible(true);
                    volverjugar.setVisible(true);
                    volvermenu.setVisible(true);

                }

            }
            else{

                this.vida=this.vida-1;

                switch (this.vida){

                    case 0: vida0.setVisible(true);
                        vida1.setVisible(false);
                        vida2.setVisible(false);
                        vida3.setVisible(false);
                        cuadrolose.setVisible(true);
                        volvermenu.setVisible(true);
                        volverjugar.setVisible(true);
                        break;

                    case 1: vida1.setVisible(true);
                        vida0.setVisible(false);
                        vida2.setVisible(false);
                        vida3.setVisible(false);
                        break;

                    case 2: vida2.setVisible(true);
                        vida0.setVisible(false);
                        vida1.setVisible(false);
                        vida3.setVisible(false);
                        break;


                }
                apagaNums();
                generaNumeroResultadoResta();
                generaNumeroOperaciones();
            }

    }



    public void apagaNums(){

        c0.setVisible(false);
        c1.setVisible(false);
        c2.setVisible(false);
        c3.setVisible(false);
        c4.setVisible(false);
        c5.setVisible(false);
        c6.setVisible(false);
        c7.setVisible(false);
        c8.setVisible(false);
        c9.setVisible(false);
        c10.setVisible(false);
        c11.setVisible(false);
        c12.setVisible(false);
        c13.setVisible(false);
        c14.setVisible(false);
        c15.setVisible(false);
        c16.setVisible(false);
        c17.setVisible(false);
        c18.setVisible(false);
        c19.setVisible(false);
        c20.setVisible(false);


        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        b5.setVisible(false);
        b6.setVisible(false);
        b7.setVisible(false);
        b8.setVisible(false);
        b9.setVisible(false);
        b10.setVisible(false);



    }

    //OnMouseClicker del btn de volver al menu
    public void volveralMenuc(MouseEvent event){

        play.setVisible(false);
        playbtn.setVisible(true);
        playbtnverde.setVisible(false);
        peces.setVisible(true);

        apagaNums();
        cuadrowin.setVisible(false);
        cuadrolose.setVisible(false);
        revisasuma.setVisible(true);
        //revisadiv.setVisible(false);
        revisaresta.setVisible(false);
        volvermenu.setVisible(false);
        volverjugar.setVisible(false);

        vida3.setVisible(true);
        vida2.setVisible(false);
        vida1.setVisible(false);
        vida0.setVisible(false);

        suma.setVisible(true);
        resta.setVisible(false);
        //nmul.setVisible(false);

        this.nivel=1;
        this.vida=3;
        this.op=0;



    }

    //OnMouseClicked del btn de volver a jugar
    public void volveraAJugar(MouseEvent event){

        apagaNums();
        cuadrowin.setVisible(false);
        cuadrolose.setVisible(false);
        revisasuma.setVisible(true);
        //revisadiv.setVisible(false);
        revisaresta.setVisible(false);
        volvermenu.setVisible(false);
        volverjugar.setVisible(false);

        vida3.setVisible(true);
        vida2.setVisible(false);
        vida1.setVisible(false);
        vida0.setVisible(false);

        suma.setVisible(true);
        resta.setVisible(false);
        //nmul.setVisible(false);

        this.nivel=1;
        this.vida=3;
        this.op=0;



    }
//////////////////////////////////////////////////////
    public void onButtonGreenAyuda(MouseEvent event){
        botonAyudaVerde.setVisible(true);
        botonAyudaAmarillo.setVisible(false);
        instructivo.setVisible(true);
    }

    public void offButtonGreenAyuda(MouseEvent event){
        botonAyudaVerde.setVisible(false);
        botonAyudaAmarillo.setVisible(true);
        instructivo.setVisible(false);
    }

    public void onStartButtonClick(MouseEvent event) {

        botonverde.setVisible(true);
        botonamarillo.setVisible(false);
    }

    public void onBacktButtonClick(MouseEvent event) {

        backbtnverde.setVisible(true);
        backbtn.setVisible(false);
    }

    public void onPlayButtonClick(MouseEvent event) {

        playbtn.setVisible(false);
        playbtnverde.setVisible(true);
    }

    public void changeWindow(MouseEvent event) {

        main.setVisible(true);
        peces.setVisible(true);
        playbtn.setVisible(true);
        playbtnverde.setVisible(false);
        backbtn.setVisible(true);
        backbtnverde.setVisible(false);

    }

    public void backWindowMain(MouseEvent event) {

        main.setVisible(true);
        peces.setVisible(false);
        botonverde.setVisible(false);
        botonamarillo.setVisible(true);
    }

    public void changeWindowPlay(MouseEvent event) {

        main.setVisible(true);
        peces.setVisible(false);


            play.setVisible(true);


    }


    EventHandler<KeyEvent> letters = new EventHandler<KeyEvent>() {

        private boolean willConsume = false;

        @Override
        public void handle(KeyEvent event) {
            Object temp = event.getSource();
            if (willConsume) {
                event.consume();
            }

            String name = event.getCode().toString();
            if (!event.getCode().toString().matches("[a-zA-Z]") && event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.SHIFT) {
                if (event.getEventType() == KeyEvent.KEY_PRESSED) {
                    willConsume = true;
                } else if (event.getEventType() == KeyEvent.KEY_RELEASED) {
                    willConsume = false;
                }
            }

        }
    };




}





