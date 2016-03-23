package com.baricio.secretshake;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Fabricio on 15/03/2016.
 */
public class EstudoView extends View {

    private int menorLadoDisplay = 0;
    private int unidade = 0;

    public EstudoView(Context context) {
        super(context);
    }

    public EstudoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if(getHeight() > getWidth()){
            setMenorLadoDisplay(getWidth());
        }else{
            setMenorLadoDisplay(getHeight());
        }

        setUnidade(getMenorLadoDisplay() / 10);
    }


    public int getMenorLadoDisplay() {
        return menorLadoDisplay;
    }

    public void setMenorLadoDisplay(int menorLadoDisplay) {
        this.menorLadoDisplay = menorLadoDisplay;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }
}
