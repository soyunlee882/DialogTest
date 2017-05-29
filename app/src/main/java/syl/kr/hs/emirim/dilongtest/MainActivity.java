package syl.kr.hs.emirim.dilongtest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    String[] itemArr={"서은광","이민혁","이창섭","임현식","프니엘","정일훈","육성재"};
    Button butDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butDialog=(Button)findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("first Dialog");
        dialog.setIcon(R.mipmap.ic_launcher);
     /*   dialog.setMessage("여기는 메세지를 쓰는 곳입니다");
        dialog.setItems(itemArr, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                butDialog.setText(itemArr[i]);
            }
        });
    ctrl+shift+/ ==> 주석
        //라디오 버튼
        dialog.setSingleChoiceItems(itemArr,0,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                butDialog.setText(itemArr[i]);
            }
        });
      //  dialog.setPositiveButton("Ok",null);*/

     //체크박스 목록
        //선택여부 배열
        boolean[] checkedItems={true,false,true,false};
        dialog.setMultiChoiceItems(itemArr, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                if(b){
                butDialog.setText(itemArr[i]);}

            }
        });

        dialog.show();

    }

}
