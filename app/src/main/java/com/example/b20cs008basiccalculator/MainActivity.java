package com.example.b20cs008basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{
    //Object declarations are mandatory
    EditText num1,num2;
    TextView result;
    Button btnplus,btnminus,btnmulti,btndivide,btnsin,btncos,btntan,btnlog,btncosec,btnsec,btncot,btnpower,btnsquare,btncube,btnsqrt,btnreset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.txtnum1);
        num2=(EditText)findViewById(R.id.txtnum2);
        result=(TextView) findViewById(R.id.txtresult);
        btnplus=(Button)findViewById(R.id.plus);
        btnminus=(Button)findViewById(R.id.minus);
        btnsin=(Button)findViewById(R.id.sin);
        btnmulti=(Button)findViewById(R.id.multiply);
        btndivide=(Button)findViewById(R.id.division);
        btncos=(Button)findViewById(R.id.cos);
        btntan=(Button)findViewById(R.id.tan);
        btnlog=(Button)findViewById(R.id.log);
        btncosec=(Button)findViewById(R.id.cosec);
        btnsec=(Button)findViewById(R.id.sec);
        btncot=(Button)findViewById(R.id.cot);
        btnpower=(Button)findViewById(R.id.power);
        btnsquare=(Button)findViewById(R.id.square);
        btncube=(Button)findViewById(R.id.cube);
        btnsqrt=(Button)findViewById(R.id.sqrt);
        btnreset=(Button)findViewById(R.id.reset);

        btnplus.setOnClickListener(this);
        btnminus.setOnClickListener(this);
        btnsin.setOnClickListener(this);
        btnmulti.setOnClickListener(this);
        btndivide.setOnClickListener(this);
        btncos.setOnClickListener(this);
        btntan.setOnClickListener(this);
        btnlog.setOnClickListener(this);
        btncosec.setOnClickListener(this);
        btnsec.setOnClickListener(this);
        btncot.setOnClickListener(this);
        btnpower.setOnClickListener(this);
        btnsquare.setOnClickListener(this);
        btncube.setOnClickListener(this);
        btnsqrt.setOnClickListener(this);
        btnreset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.plus:
                //Add the two number
                int number1,number2,out;
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                out = number1+number2;
                result.setText(String.valueOf(out));
                break;
            case R.id.minus:
                int numberm1,numberm2,outm;
                numberm1 = Integer.parseInt(num1.getText().toString());
                numberm2 = Integer.parseInt(num2.getText().toString());
                outm = numberm1-numberm2;
                result.setText(String.valueOf(outm));
                break;
            case R.id.multiply:
                int numberml1,numberml2,outml;
                numberml1 = Integer.parseInt(num1.getText().toString());
                numberml2 = Integer.parseInt(num2.getText().toString());
                outml = numberml1*numberml2;
                result.setText(String.valueOf(outml));
                break;
            case R.id.division:
                int numberd1,numberd2,outd;
                numberd1 = Integer.parseInt(num1.getText().toString());
                numberd2 = Integer.parseInt(num2.getText().toString());
                outd = numberd1/numberd2;
                result.setText(String.valueOf(outd));
                break;
            case R.id.sin:
                int numbersin=0;
                double outsin;
                numbersin = Integer.parseInt(num1.getText().toString());
                outsin = Math.sin(numbersin);
                result.setText(String.valueOf(outsin));
                break;
            case R.id.tan:
                int numbertan=0;
                double outtan;
                numbertan = Integer.parseInt(num1.getText().toString());
                outtan = Math.tan(numbertan);
                result.setText(String.valueOf(outtan));
                break;
            case R.id.cos:
                int numbercos=0;
                double outcos;
                numbercos = Integer.parseInt(num1.getText().toString());
                outcos = Math.cos(numbercos);
                result.setText(String.valueOf(outcos));
                break;
            case R.id.log:
                int numberlog=0;
                double outlog;
                numberlog = Integer.parseInt(num1.getText().toString());
                outlog = Math.log(numberlog);
                result.setText(String.valueOf(outlog));
                break;
            case R.id.cosec:
                int numbercosec=0;
                double outcosec;
                numbercosec = Integer.parseInt(num1.getText().toString());
                outcosec = 1.0/Math.sin(numbercosec);
                result.setText(String.valueOf(outcosec));
                break;
            case R.id.cot:
                int numbercot=0;
                double outcot;
                numbercot = Integer.parseInt(num1.getText().toString());
                outcot = 1.0/Math.tan(numbercot);
                result.setText(String.valueOf(outcot));
                break;
            case R.id.sec:
                int numbersec=0;
                double outsec;
                numbersec = Integer.parseInt(num1.getText().toString());
                outsec = 1.0/Math.cos(numbersec);
                result.setText(String.valueOf(outsec));
                break;
            case R.id.power:
                int  numberp1,numberp2;
                double s1,s2,outp;
                numberp1 = Integer.parseInt(num1.getText().toString());
                s1=numberp1;
                numberp2 = Integer.parseInt(num2.getText().toString());
                s2=numberp2;
                outp = Math.pow(s1,s2);
                result.setText(String.valueOf(outp));
                break;
            case R.id.square:
                int numbers1;
                double sw,outs;
                double s=2;
                numbers1 = Integer.parseInt(num1.getText().toString());
                sw=numbers1;
                outs = Math.pow(numbers1,s);
                result.setText(String.valueOf(outs));
                break;
            case R.id.cube:
                int  numberc1;
                double sss,outc;
                double c=3;
                numberc1 = Integer.parseInt(num1.getText().toString());
                sss=numberc1;
                outc = Math.pow(numberc1,c);
                result.setText(String.valueOf(outc));
                break;
            case R.id.sqrt:
                int numberr1;
                double ss ,outr;
                numberr1 = Integer.parseInt(num1.getText().toString());
                ss=numberr1;
                outr = Math.sqrt(ss);
                result.setText(String.valueOf(outr));
                break;
            case R.id.reset:
                num1.setText(" ");
                num2.setText(" ");
                result.setText(" ");
                break;
//
//            default:
//                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }
}