package radiobutton.cursoandroid.com.radiobutton;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private RadioButton radioButtonEscolhido;
    private RadioGroup  radioGroup;
    private Button      botaoEscolher;
    private TextView    textoExibicao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGrupoId);
        botaoEscolher = (Button) findViewById(R.id.botaoEscolherId);
        textoExibicao = (TextView) findViewById(R.id.textoExibicaoId);

        botaoEscolher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idRadioButtonEscolhido = radioGroup.getCheckedRadioButtonId();
                if(idRadioButtonEscolhido > 0){
                    radioButtonEscolhido = (RadioButton) findViewById( idRadioButtonEscolhido )  ;

                    textoExibicao.setText(radioButtonEscolhido.getText());
                }else{
                    Toast.makeText(MainActivity.this, "Você não escolheu nenhuma opção", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
