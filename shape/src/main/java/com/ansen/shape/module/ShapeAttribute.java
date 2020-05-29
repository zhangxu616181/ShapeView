package com.ansen.shape.module;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;

/**
 * 自定义属性
 * @author Ansen
 * @create time 2019-10-28
 */
public class ShapeAttribute {
    public ShapeAttribute(){

    }

    public boolean selected=false;//是否选中

    public int solidColor;//填充颜色
    public int selectSolidColor;//选中填充色

    public int startColor;//开始渐变颜色
    public int centerColor;//中间渐变色
    public int endColor;//结束渐变色

    public int selectStartColor;
    public int selectCenterColor;
    public int selectEndColor;

    public int pressedSolidColor;//按下填充色

    //按下渐变色
    public int pressedStartColor;
    public int pressedCenterColor;
    public int pressedEndColor;

    public int colorOrientation;//颜色渐变方向

    public int strokeColor;//边框
    public int selectStrokeColor;//选中边框颜色

    public float strokeWidth;//边框宽度
    public float strokeSpace;//描边与图片间距

    public float selectStrokeWidth;//选中边框宽度
    public int strokeDirection;//那个方向需要边框 默认全部

    public float cornersRadius;//四个角弧度
    public float topLeftRadius;//左上角
    public float topRightRadius;//右上角
    public float bottomLeftRadius;//左下角
    public float bottomRightRadius;//右下角

    public int shape;//形状

    //TextView/EditView属性
    public String text;
    public String selectText;
    public int textColor;
    public int selectTextColor;

    public Drawable unselectDrawable;
    public Drawable selectDrawable;
    public int drawableDirection;//图标方向

    public boolean pressed=false;

    public boolean borderGradient=false;//边框渐变
    public boolean textGradient=false;//文字渐变

    public int scaleType;//图片才有的属性

    public int getSolidColor() {
        if(pressed){//优先返回按压颜色
            return pressedSolidColor;
        }

        if(selected && selectSolidColor!=0){
            return selectSolidColor;
        }
        return solidColor;
    }

    public int getStartColor() {
        if(pressed){//优先返回按压颜色
            return pressedStartColor;
        }

        if(selected && selectStartColor!=0){
            return selectStartColor;
        }
        return startColor;
    }

    public int getCenterColor() {
        if(pressed){//优先返回按压颜色
            return pressedCenterColor;
        }

        if(selected && selectCenterColor!=0){
            return selectCenterColor;
        }
        return centerColor;
    }

    public int getEndColor() {
        if(pressed){//优先返回按压颜色
            return pressedEndColor;
        }

        if(selected && selectEndColor!=0){
            return selectEndColor;
        }
        return endColor;
    }

    public int getStrokeColor() {
        if(selected && selectStrokeColor!=0){
            return selectStrokeColor;
        }
        return strokeColor;
    }

    public float getStrokeWidth() {
        if(selected && selectStrokeWidth!=0){
            return selectStrokeWidth;
        }
        return strokeWidth;
    }

    public int getTextColor() {
        if(selected && selectTextColor!=0){
            return selectTextColor;
        }
        return textColor;
    }

    public String getText() {
        if(selected && !TextUtils.isEmpty(selectText)){
            return selectText;
        }
        return text;
    }

    public Drawable getDrawable() {
        if(selected && selectDrawable!=null){
            return selectDrawable;
        }
        return unselectDrawable;
    }

    public int getPressedSolidColor() {
        return pressedSolidColor;
    }

    /**
     * @return true:有按下效果 false:没有按下效果
     */
    public boolean isPressed(){
        if(pressedSolidColor!=0||pressedStartColor!=0||pressedEndColor!=0){
            return true;
        }
        return false;
    }
}
