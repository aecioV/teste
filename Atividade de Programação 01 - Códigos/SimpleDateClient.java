import java.awt.*;
import javax.swing.JFrame;

public class SimpleDateClient extends JFrame{
  private String action = "";

  private int animationPause = 2; // 2 segundos entre animações

  private SimpleDate dateObj;

  public void workWithDates( ){
    animate( "dateObj reference declared" );

    /***** Adicione seu código aqui *****/
    /**** 1. Instancie um dateObj usando lista de argumentos vazia  */


    //animate( "dateObj Instanciado - lista de argumentos vazia" );

    /***** 2. Set o mês com o mês que você nasceu */


    //animate( "Set mês com o mês de nascimento" );


    /***** 3. Set o dia com o dia em que você nasceu */


    //animate( "Set dia com o dia de nascimento" );


    /***** 4. Set o ano com o ano em que você nasceu */


    //animate( "Set ano com o ano de nascimento" );


    /***** 5. Chame o método nextDay */


    //animate( "Set a data para o próximo dia" );


    /***** 6. Set o dia para 32, um valor ilegal */


    //animate( "Set dia para 32" );


    /***** 7. Set o mês para 13, um valor ilegal */


    //animate( "Set mês para 13" );


    /***** 8. Atribua o valor nulo para dateObj */


    //animate( "Set referência de objeto para null" );


    /***** 9. Tente setar o mês para 1 */

  }

  public SimpleDateClient( ){
    super( "Um objeto SimpleDate" );
    setSize( 300, 300 );
    setVisible( true );
  }

  public void paint( Graphics g ){
    super.paint( g );

    // mostra ação
    g.drawString( action, 50, 250 );

    // referência a objeto
    int sX = 50, sY = 75;
    int boxL = 75, boxH = 20;
    g.drawRect( sX, sY, boxL, boxH );
    g.drawString( "dateObj", sX, sY - 10 );

    if ( dateObj != null )
       draw( g );
    else
      g.drawString( "null", sX + 15, sY + 15 );
  }

  public void draw( Graphics g ){
    int sX = 50, sY = 75;
    int boxL = 75, boxH = 20;

	//setinha
    g.drawLine( sX + boxL, sY + boxH / 2,
                sX + boxL + 25, sY + boxH / 2 );
    g.drawLine( sX + boxL + 25, sY + boxH / 2,
                sX + boxL + 25, sY + boxH * 2 );
    g.drawLine( sX + boxL + 25 - 5, sY + boxH * 2 - 5,
                sX + boxL + 25, sY + boxH * 2 );
    g.drawLine( sX + boxL + 25 + 5, sY + boxH * 2 - 5,
                sX + boxL + 25, sY + boxH * 2 );


    // mês
    g.drawString( "month", sX + boxL - 50, sY + 2 * boxH + 15 );
    g.drawRect( sX + boxL, sY + 2 * boxH, boxL, boxH );
    g.drawString( Integer.toString( dateObj.getMonth( ) ),
                   sX + boxL + 5, sY + 2 * boxH + 15 );

    // dia
    g.drawString( "day", sX + boxL - 50, sY + 3 * boxH + 15 );
    g.drawRect( sX + boxL, sY + 3 * boxH, boxL, boxH );
    g.drawString( Integer.toString( dateObj.getDay( ) ),
                  sX + boxL + 5, sY + 3 * boxH + 15 );

    // ano
    g.drawString( "year", sX + boxL - 50, sY + 4 * boxH + 15 );
    g.drawRect( sX + boxL, sY + 4 * boxH, boxL, boxH );
    g.drawString( Integer.toString( dateObj.getYear( ) ),
                  sX + boxL + 5, sY + 4 * boxH + 15 );
  }

  public void animate( String a ){
    action = a;
    repaint( );
    Pause.wait( (double) animationPause );
  }

  public static void main( String [] args ){
    SimpleDateClient app = new SimpleDateClient( );
    app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    app.workWithDates( );
  }
}
