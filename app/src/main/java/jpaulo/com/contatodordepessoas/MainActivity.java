package jpaulo.com.contatodordepessoas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // Variavel de quantidade de mulehres
    private int mulheres = 0;
    // Variavel de quantidade de homens
    private int homens = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instacia o botão de adição de quantidade de homens.
        final Button btnAddH = (Button) findViewById(R.id.btnaddhomens);
        // Instancia o botão de adição de quantidade de mulheres.
        final Button btnAddM = (Button) findViewById(R.id.btnaddmulheres);
        // Instacia o botão de zerar
        Button btnZera = (Button) findViewById(R.id.btnzerar);
        // Instacia o texto que exibe o total de homens e mulheres
        final TextView total = (TextView) findViewById(R.id.totalpessoas);
        // Ação de adicionar mulheres
        btnAddM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mulheres++;
                btnAddM.setText(Integer.toString(mulheres));
                total.setText("O total de pessoas é: "+(mulheres+homens));
            }
        });
        // Ação de adicionar homens
        btnAddH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homens++;
                btnAddH.setText(Integer.toString(homens));
                total.setText("O total de pessoas é: "+(mulheres+homens));
            }
        });
        // Ação de zerar todos os contadores
        btnZera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total.setText("O total de pessoas é: 0");
                mulheres = 0;btnAddM.setText(Integer.toString(mulheres));
                homens = 0;btnAddH.setText(Integer.toString(homens));

            }
        });
    }


}
