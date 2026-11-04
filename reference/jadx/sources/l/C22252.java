package l;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: l.᩷ᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB2A */
/* JADX INFO: loaded from: classes.dex */
public final class C22252 extends AbstractC21594 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public TextPaint f71662;

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length == 1 && characterStyleArr[0] == this) {
                    if (paint2 instanceof TextPaint) {
                        textPaint = (TextPaint) paint2;
                    }
                } else {
                    TextPaint textPaint2 = this.f71662;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f71662 = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            } else if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + m49129(), i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        C2203.m7520().getClass();
        C5098 c5098M49128 = m49128();
        float f2 = i4;
        if (textPaint3 != null) {
            paint2 = textPaint3;
        }
        c5098M49128.m15412(canvas, f, f2, paint2);
    }
}
