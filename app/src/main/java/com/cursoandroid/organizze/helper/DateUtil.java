package com.cursoandroid.organizze.helper;

import java.text.SimpleDateFormat;

public class DateUtil {
    public static String dataAtual (){
        Long data = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(" dd/MM/yyyy  ");
        String dataString = simpleDateFormat.format(data);
        return dataString;
    }
    public static String mesAnoDataEscolhida(String data){
       String retornoData[] =  data.split("/");
        String dia = retornoData[0]; //dia 23
        String mes = retornoData[1]; //mes 03
        String ano = retornoData[2]; //ano 2022
        String mesAno = mes + ano;
        return mesAno;
    }
}
