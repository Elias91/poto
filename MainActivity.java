package com.moda.fashiontouch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public void alert(String msg){
        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
    }
    public void entrar(int opc){
        Intent opcion;
        switch (opc)
        {
            case R.id.btnPerfil:
                opcion = new Intent(MainActivity.this,PerfilActivity.class);
                startActivity(opcion);
                break;
            case R.id.btnMenu:
                opcion = new Intent(MainActivity.this,MenuActivity.class);
                startActivity(opcion);;
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botonperfil = (Button) findViewById(R.id.btnPerfil);
        botonperfil.setOnClickListener(this);
        Button botonmenu = (Button) findViewById(R.id.btnMenu);
        botonmenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    entrar(v.getId());
    }



/*
    public void datosUsuario(View v){
        Intent perfilAct = new Intent(MainActivity.this,PerfilActivity.class);
        startActivity(perfilAct);
    }

    public void verProbador(View v){
        Intent probadorAct = new Intent(MainActivity.this,ProbadorActivity.class);
        startActivity(probadorAct);
    }
    */
}
