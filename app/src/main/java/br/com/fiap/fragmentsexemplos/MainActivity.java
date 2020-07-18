package br.com.fiap.fragmentsexemplos;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout fragment_c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment_c = (FrameLayout)findViewById(R.id.fragment_c);

    }

    public void alterarFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_c, fragment).addToBackStack(null).commit();
    }

    public void exibirCarro1(View view) {

        alterarFragment(new Carro1Fragment());
    }

    public void exibirCarro2(View view) {
        alterarFragment(new Carro2Fragment());
    }


}
