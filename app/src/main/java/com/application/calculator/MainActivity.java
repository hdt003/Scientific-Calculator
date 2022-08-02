package com.application.calculator;


import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.application.calculator.databinding.ActivityMainBinding;

import java.util.Stack;
public class MainActivity extends AppCompatActivity {

    Context context;
    ActivityMainBinding binding;
    String str="";
    String copy="";
    Configuration configuration;
    int mode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setTitle(Html.fromHtml("<font color=#919191>" + getString(R.string.app_name) + "</font>"));


        binding.sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    str+="sin(";
                    copy+="sin(";
                }
                else if(str.charAt(str.length()-1)=='\u00d7' || str.charAt(str.length()-1)=='+' ||str.charAt(str.length()-1)=='\u00f7' ||str.charAt(str.length()-1)=='-' ||str.charAt(str.length()-1)=='^'   || str.charAt(str.length()-1)=='(')
                {
                    str+="sin(";
                    copy+="sin(";
                }
                else if(str.charAt(str.length()-1)=='.')
                {
                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
                else{
                str+="\u00d7sin(";
                copy+="\u00d7sin(";}
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });

        binding.cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    str+="cos(";
                    copy+="cos(";
                }
                else if(str.charAt(str.length()-1)=='\u00d7' || str.charAt(str.length()-1)=='+' ||str.charAt(str.length()-1)=='\u00f7' ||str.charAt(str.length()-1)=='-' ||str.charAt(str.length()-1)=='^'   || str.charAt(str.length()-1)=='(')
                {
                    str+="cos(";
                    copy+="cos(";
                }
                else if(str.charAt(str.length()-1)=='.')
                {
                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
                else
                {
                    str+="\u00d7cos(";
                    copy+="\u00d7cos(";
                }
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });

        binding.tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    str+="tan(";
                    copy+="tan(";
                }
                else if(str.charAt(str.length()-1)=='\u00d7' || str.charAt(str.length()-1)=='+' ||str.charAt(str.length()-1)=='\u00f7' ||str.charAt(str.length()-1)=='-' ||str.charAt(str.length()-1)=='^'   || str.charAt(str.length()-1)=='(')
                {
                    str+="tan(";
                    copy+="tan(";
                }
                else if(str.charAt(str.length()-1)=='.')
                {
                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
                else
                {
                    str+="\u00d7tan(";
                    copy+="\u00d7tan(";
                }
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });

        binding.ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    str+="ln(";
                    copy+="ln(";
                }
                else if(str.charAt(str.length()-1)=='\u00d7' || str.charAt(str.length()-1)=='+' ||str.charAt(str.length()-1)=='\u00f7' ||str.charAt(str.length()-1)=='-' ||str.charAt(str.length()-1)=='^'   || str.charAt(str.length()-1)=='(')
                {
                    str+="ln(";
                    copy+="ln(";
                }
                else if(str.charAt(str.length()-1)=='.')
                {
                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
                else{
                    str+="\u00d7ln(";
                copy+="\u00d7ln(";}
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });
        binding.log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    str+="log(";
                    copy+="log(";
                }
                else if(str.charAt(str.length()-1)=='\u00d7' || str.charAt(str.length()-1)=='+' ||str.charAt(str.length()-1)=='\u00f7' ||str.charAt(str.length()-1)=='-' ||str.charAt(str.length()-1)=='^'   || str.charAt(str.length()-1)=='(')
                {
                    str+="log(";
                    copy+="log(";
                }
                else if(str.charAt(str.length()-1)=='.')
                {
                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
                else{
                    str+="\u00d7log(";
                    copy+="\u00d7log(";}
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });
        binding.e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    str+="2.718281828459045";
                    copy+="e";
                }
                else if(str.charAt(str.length()-1)=='\u00d7' || str.charAt(str.length()-1)=='+' ||str.charAt(str.length()-1)=='\u00f7' ||str.charAt(str.length()-1)=='-' ||str.charAt(str.length()-1)=='^'  ||str.charAt(str.length()-1)=='.' || str.charAt(str.length()-1)=='(')
                {
                    str+="2.718281828459045";
                    copy+="e";
                }
                else if(str.charAt(str.length()-1)>='0' && str.charAt(str.length()-1)<='9')
                {
                    str+="\u00d72.718281828459045";
                    copy+="\u00d7e";
                }
                else {
                    str += "\u00d72.718281828459045(";
                    copy+="\u00d7e";
                }
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });



//        pi not working in app
        binding.pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    str+="3.141592653589793";
                    copy+="\u03c0";
                }
                else if(str.charAt(str.length()-1)=='\u00d7' || str.charAt(str.length()-1)=='+' ||str.charAt(str.length()-1)=='\u00f7' ||str.charAt(str.length()-1)=='-' ||str.charAt(str.length()-1)=='^'  ||str.charAt(str.length()-1)=='.' || str.charAt(str.length()-1)=='(')
                {
                    str+="3.141592653589793";
                    copy+="\u03c0";
                }
                else if(str.charAt(str.length()-1)>='0' && str.charAt(str.length()-1)<='9')
                {
                    str+="\u00d73.141592653589793";
                    copy+="\u00d7\u03c0";
                }
                else {
                    str += "\u00d73.141592653589793(";
                    copy+="\u00d7\u03c0";
                }

                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });
        binding.zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty()) {
                    str += '0';
                    copy += "0";
                }
                else if(str.charAt(str.length()-1)==')')
                {
                    str+="\u00d70";
                    copy+="\u00d70";
                }
                else{
                str+='0';
                copy+="0";}
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });
        binding.one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty()){
                str+='1';
                copy+="1";}
                else if(str.charAt(str.length()-1)==')')
                {
                    str+="\u00d71";
                    copy+="\u00d71";
                }
                else{
                    str+='1';
                    copy+="1";}
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });
        binding.two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    str+='2';
                    copy+="2";
                }
                else if(str.charAt(str.length()-1)==')')
                {
                    str+="\u00d72";
                    copy+="\u00d72";
                }
                else{
                    str+='2';
                    copy+="2";
                }
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });
        binding.three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                str+='3';
                copy+="3";}
                else if(str.charAt(str.length()-1)==')')
                {
                    str+="\u00d73";
                    copy+="\u00d73";
                }
                else {
                    str += '3';
                    copy += "3";
                }
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }

        });
        binding.four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    str+='4';
                    copy+="4";
                }
                else if(str.charAt(str.length()-1)==')')
                {
                    str+="\u00d74";
                    copy+="\u00d74";
                }
                else{
                    str+='4';
                    copy+="4";
                }
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });
        binding.five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    str+='5';
                    copy+="5";
                }
                else if(str.charAt(str.length()-1)==')')
                {
                    str+="\u00d75";
                    copy+="\u00d75";
                }
                else{
                    str+='5';
                    copy+="5";
                }
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });
        binding.six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    str+='6';
                    copy+="6";
                }
                else if(str.charAt(str.length()-1)==')')
                {
                    str+="\u00d76";
                    copy+="\u00d76";
                }
                else{
                    str+='6';
                    copy+="6";
                }
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });
        binding.seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    str+='7';
                    copy+="7";
                }
                else if(str.charAt(str.length()-1)==')')
                {
                    str+="\u00d77";
                    copy+="\u00d77";
                }
                else{
                    str+='7';
                    copy+="7";
                }
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });
        binding.eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    str+='8';
                    copy+="8";
                }
                else if(str.charAt(str.length()-1)==')')
                {
                    str+="\u00d78";
                    copy+="\u00d78";
                }
                else{
                    str+='8';
                    copy+="8";
                }
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });
        binding.nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    str+='9';
                    copy+="9";
                }
                else if(str.charAt(str.length()-1)==')')
                {
                    str+="\u00d79";
                    copy+="\u00d79";
                }
                else{
                    str+='9';
                    copy+="9";
                }
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });
        binding.point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    str+="0.";
                    copy+="0.";
                }
                else
                if(str.charAt(str.length()-1)=='\u00d7' || str.charAt(str.length()-1)=='+' ||str.charAt(str.length()-1)=='\u00f7' ||str.charAt(str.length()-1)=='-' ||str.charAt(str.length()-1)=='^'   ||str.charAt(str.length()-1)=='(')
                {
                    str+="0.";
                    copy+="0.";
//                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
                else if(findDot(copy))
                {
                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
                else
                {
                    str += '.';
                    copy += ".";
                }
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });
        binding.divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
                else
                if(str.charAt(str.length()-1)=='\u00d7' || str.charAt(str.length()-1)=='+' ||str.charAt(str.length()-1)=='\u00f7' ||str.charAt(str.length()-1)=='-' ||str.charAt(str.length()-1)=='^'  ||str.charAt(str.length()-1)=='.' ||str.charAt(str.length()-1)=='(')
                {
                    str+="";
                    copy+="";
                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
                else{
                str+='\u00f7';
                copy+="\u00f7";}
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });
        binding.multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (str.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
                else if (str.charAt(str.length() - 1) == '\u00d7' || str.charAt(str.length() - 1) == '+' || str.charAt(str.length() - 1) == '\u00f7' || str.charAt(str.length() - 1) == '-' || str.charAt(str.length() - 1) == '^' || str.charAt(str.length() - 1) == '.' || str.charAt(str.length() - 1) == '(') {
                    str += "";
                    copy += "";
                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
                else
                {
                    str += '\u00d7';
                    copy += "\u00d7";
                }
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });
        binding.subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
                else
                if(str.charAt(str.length()-1)=='\u00d7' || str.charAt(str.length()-1)=='+' ||str.charAt(str.length()-1)=='\u00f7' ||str.charAt(str.length()-1)=='-' ||str.charAt(str.length()-1)=='^'  ||str.charAt(str.length()-1)=='.' ||str.charAt(str.length()-1)=='(')
                {
                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
                else{
                str+='-';
                copy+="-";}
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });
        binding.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
                else if(str.charAt(str.length()-1)=='\u00d7' || str.charAt(str.length()-1)=='+' ||str.charAt(str.length()-1)=='\u00f7' ||str.charAt(str.length()-1)=='-' ||str.charAt(str.length()-1)=='^'  ||str.charAt(str.length()-1)=='.' ||str.charAt(str.length()-1)=='(')
                {
                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
                else{
                    str+='+';
                copy+="+";}
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });

        binding.exponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
                else
                if(str.charAt(str.length()-1)=='\u00d7' || str.charAt(str.length()-1)=='+' ||str.charAt(str.length()-1)=='\u00f7' ||str.charAt(str.length()-1)=='-' ||str.charAt(str.length()-1)=='^'  ||str.charAt(str.length()-1)=='.'  ||str.charAt(str.length()-1)=='(')
                {
                    str+="";
                    copy+="";
                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
                else{
                str+='^';
                copy+="^";}
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });
        //\u00d7
        binding.parenthesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(str.equals(""))
                {
                    str+='(';
                    copy+="(";
//                    Toast.makeText(MainActivity.this, "1", Toast.LENGTH_LONG).show();
                }
                else if(str.charAt(str.length()-1)=='.')
                {
                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
                else if(checkPar(str) && !(str.charAt(str.length()-1)=='\u00d7' || str.charAt(str.length()-1)=='+' ||str.charAt(str.length()-1)=='\u00f7' ||str.charAt(str.length()-1)=='-' ||str.charAt(str.length()-1)=='^'  ||str.charAt(str.length()-1)=='.'))
                {
                    Log.d("str p",str);
                    str+="\u00d7(";
                    Log.d("str e",str);
                    copy+="\u00d7(";
//                    Toast.makeText(MainActivity.this, "2", Toast.LENGTH_LONG).show();
                }
                else if(str.charAt(str.length()-1)=='(')
                {
                    str+='(';
                    copy+="(";
//                    Toast.makeText(MainActivity.this, "3", Toast.LENGTH_LONG).show();
                }
                else if((str.charAt(str.length()-1)=='\u00d7' || str.charAt(str.length()-1)=='+' ||str.charAt(str.length()-1)=='\u00f7' ||str.charAt(str.length()-1)=='-' ||str.charAt(str.length()-1)=='^'  ||str.charAt(str.length()-1)=='.') )
                {
                    str+="(";
                    copy+="(";
//                    Toast.makeText(MainActivity.this, "4", Toast.LENGTH_LONG).show();
                }

               else if(str.charAt(str.length()-1)>='0' && str.charAt(str.length()-1)<='9' && !checkPar(str)) {
                    str += ')';
                    copy+=")";
//                    Toast.makeText(MainActivity.this, "5", Toast.LENGTH_LONG).show();
                }
               else if(str.charAt(str.length()-1)==')' && checkPar(str))
                {
                    str+="";
                    copy+="";
                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
                else if(str.charAt(str.length()-1)==')' && !checkPar(str))
                {
                    str+=")";
                    copy+=")";
//                    Toast.makeText(MainActivity.this, "6 "+checkPar(str), Toast.LENGTH_LONG).show();
                }
                else if(str.charAt(str.length()-1)==')' && checkPar(str))
                {
                    str+="\u00d7(";
                    copy+="\u00d7(";
//                    Toast.makeText(MainActivity.this, "9 "+checkPar(str), Toast.LENGTH_LONG).show();
                }
                else if(checkPar(str))
                {
                    str+="\u00d7(";
                    copy+="\u00d7(";
//                    Toast.makeText(MainActivity.this, "7", Toast.LENGTH_LONG).show();
                }
                else if(!checkPar(str) )
                {
                    str+=")";
                    copy+=")";
//                    Toast.makeText(MainActivity.this, "8", Toast.LENGTH_LONG).show();
                }
                else {
                    str += '(';
                    copy+="(";
//                    Toast.makeText(MainActivity.this, "0", Toast.LENGTH_LONG).show();
                }
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });
        binding.clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.isEmpty())
                {
                    binding.expressionBox.setText("Expression Will Show Here");
                    binding.answerBox.setText("Answer Will Show Here");
                }
                else
                {
                    str="";
                    copy="";
                    binding.expressionBox.setText("Expression Will Show Here");
                    binding.answerBox.setText("Answer Will Show Here");
                }
            }
        });
        binding.backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(str.isEmpty()) {
                    binding.expressionBox.setText("Expression Will Show Here");
                }
                else
                {
                    str=removeLastChar(copy,str);
                    copy=removeForCopyLastChar(copy);
                    binding.expressionBox.setText(copy);
//                    binding.mainStringText.setText(str);
                }
            }
        });
        binding.equalTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter Expression to evaluate", Toast.LENGTH_LONG).show();
                }
                else if(checkPar(str))
                {
                    double ans = evaluateInfix(str);
                    binding.answerBox.setText(String.valueOf(ans));
                }
                else {
                    Toast.makeText(MainActivity.this, "Enter Valid Expression", Toast.LENGTH_LONG).show();
                }
            }
        });
//        parenthesis checker function make
        binding.plusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (str.isEmpty()) {
                    str += "(-";
                    copy += "(-";
                }
                else if (str.charAt(str.length() - 1) == ')') {
                    str += "\u00d7(-";
                    copy += "\u00d7(-";
                }
                else if (str.charAt(str.length() - 1) >= '0' && str.charAt(str.length() - 1) <= '9') {
                    int i;
                    for (i = str.length() - 1; i >= 0; i--) {
                        if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9'))
                            break;
                    }
                    str = insertString(str, "(-", i);
                    int j;
                    for (j = (copy.length() - 1); j >= 0; j--) {
                        if (!(copy.charAt(j) >= '0' && copy.charAt(j) <= '9'))
                            break;
                    }

                    copy=insertString(copy, "(-", j);

                } else{
                    str += "(-";
                copy += "(-";
            }
                binding.expressionBox.setText(copy);
//                binding.mainStringText.setText(str);
            }
        });
    }

    public static String insertString(
            String originalString,
            String stringToBeInserted,
            int index)
    {

        // Create a new string
        String newString = originalString.substring(0, index + 1)
                + stringToBeInserted
                + originalString.substring(index + 1);

        // return the modified String
        return newString;
    }

    static boolean checkPar(String s)
    {
        Stack<Character> stk = new Stack<>();
        //check parenthesis
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stk.push('(');
            }
            else if(s.charAt(i)==')')
            {
                stk.pop();
            }
        }
        // check for last character
        if(s.charAt(s.length()-1)=='\u00d7' || s.charAt(s.length()-1)=='+' ||s.charAt(s.length()-1)=='\u00f7' ||s.charAt(s.length()-1)=='-' ||s.charAt(s.length()-1)=='^'   ||s.charAt(s.length()-1)=='(' |s.charAt(s.length()-1)=='.')
        {
            return false;
        }
            if(stk.empty())
        {
            return true;
        }
        else
            return false;//top par chhe, print ')'

    }

    public static String removeForCopyLastChar(String s)
    {
        return (s.isEmpty() || s.length() == 0)
                ? null
                : (s.substring(0, s.length() - 1));
    }

    public static String removeLastChar(String s,String s2)
    {
        if(s.charAt(s.length()-1)=='e' || s.charAt(s.length()-1)=='\u03c0')
        {//17 lenghth
                return (s2.substring(0, s2.length() -17));
        }
        else
                return (s2.substring(0, s2.length() - 1));
    }

    public  static Boolean findDot(String s)
    {
        int operatorIndx=Integer.MAX_VALUE;

        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='\u00d7' || s.charAt(i)=='+' ||s.charAt(i)=='\u00f7' ||s.charAt(i)=='-' ||s.charAt(i)=='^'   ||s.charAt(i)=='(' |s.charAt(i)=='.')
            {
            operatorIndx=i;
            break;
            }
        }
        Log.d("opidx",String.valueOf(operatorIndx));

        if(operatorIndx==Integer.MAX_VALUE)
        {
            return false;
        }
        else {
            for (int i = s.length() - 1; i >= operatorIndx; i--) {
                if (s.charAt(i) == '.')
                    return true;
            }
            return false;
        }
    }

/////////////////////////////////////////////////////////////////////////////////////////
    //Algorithm also works for advance calculator properties like square root,sin,cos,tan
    static boolean isMatching(char a, char b){
        return ((a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}'));
    }
    static boolean isOpening(char a){
        return (a=='(' || a=='[' || a=='{');
    }
    public  static boolean findParenthesisExistOrNot(String s)
    {
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)==')')
            {
                return true;
            }
        }
        return false;
    }

    public static double evaluateInfix(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

//             Grammar:
//             expression = term | expression `+` term | expression `-` term
//             term = factor | term `\u00d7` factor | term `/` factor
//             factor = `+` factor | `-` factor | `(` expression `)` | number
//                    | functionName `(` expression `)` | functionName factor
//                    | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('\u00d7')) x *= parseFactor(); // multiplication
                    else if (eat('\u00f7')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return +parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('('))
                { // parentheses
                    x = parseExpression();
                    if (!eat(')')) throw new RuntimeException("Missing ')'");
                }
                else if ((ch >= '0' && ch <= '9') || ch == '.' )
                { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.' )
                        nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                }
                else if (ch >= 'a' && ch <= 'z')
                { // functions
                    while (ch >= 'a' && ch <= 'z')
                        nextChar();
                    String func = str.substring(startPos, this.pos);
                    if (eat('('))
                    {
                        x = parseExpression();
                        if (!eat(')'))
                            throw new RuntimeException("Missing ')' after argument to " + func);
                    }
                    else {
                        x = parseFactor();
                    }
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("ln")) x =  Math.log(x);
                    else if (func.equals("log")) x =Math.log10(x);
                    else if (func.equals("e")) x =Math.E;
                    else throw new RuntimeException("Unknown function: " + func);
                }
                else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
////////////////////////////////////////////////////////////////////





}