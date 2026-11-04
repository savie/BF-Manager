package l;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܳܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8WD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15421 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final float[] f50248 = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float[] f50249;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f50250;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f50251;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f50252;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f50253;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f50254;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f50255;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f50256;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f50257;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f50258;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f50259;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f50260;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19897 m36925(Context context) {
        C14719 c14719 = new C14719(context.getResources().getDisplayMetrics().density);
        C19897 c19897 = new C19897();
        c19897.m45826(c14719.m35415(8));
        c19897.m45819(c14719.m35415(24));
        c19897.m45828(c14719.m35415(4));
        c19897.m45823(c14719.m35415(1));
        c19897.m45824(c14719.m35415(1));
        c19897.m45817(c14719.m35415(4));
        return c19897;
    }

    public C15421(C19897 c19897) {
        this.f50253 = c19897.f64045;
        this.f50250 = c19897.f64042;
        this.f50258 = c19897.f64050;
        this.f50252 = c19897.f64044;
        this.f50257 = c19897.f64049;
        this.f50255 = c19897.f64047;
        this.f50251 = c19897.f64043;
        this.f50254 = c19897.f64046;
        this.f50249 = c19897.f64041;
        this.f50260 = c19897.f64052;
        this.f50256 = c19897.f64048;
        this.f50259 = c19897.f64051;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36929(TextPaint textPaint) {
        if (this.f50253) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(textPaint.linkColor);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36934(Paint paint) {
        if (this.f50253) {
            paint.setUnderlineText(true);
        }
        if (paint instanceof TextPaint) {
            paint.setColor(((TextPaint) paint).linkColor);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36926() {
        return this.f50250;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m36933() {
        int i = this.f50258;
        return i == 0 ? (int) ((this.f50250 * 0.25f) + 0.5f) : i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m36932(Paint paint) {
        paint.setColor(paint.getColor());
        int i = this.f50252;
        if (i != 0) {
            paint.setStrokeWidth(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36927(int i) {
        int iMin = Math.min(this.f50250, i) / 2;
        int i2 = this.f50257;
        return (i2 == 0 || i2 > iMin) ? iMin : i2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m36931() {
        return this.f50259;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m36935() {
        return this.f50255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36930(TextPaint textPaint, int i) {
        textPaint.setFakeBoldText(true);
        float[] fArr = this.f50249;
        if (fArr == null) {
            fArr = f50248;
        }
        if (fArr.length >= i) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i - 1]);
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalStateException("Supplied heading level: " + i + " is invalid, where configured heading sizes are: `" + Arrays.toString(fArr) + "`");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36928(Paint paint) {
        int iM13638 = this.f50254;
        if (iM13638 == 0) {
            iM13638 = AbstractC4279.m13638(paint.getColor(), 75);
        }
        paint.setColor(iM13638);
        paint.setStyle(Paint.Style.FILL);
        int i = this.f50251;
        if (i >= 0) {
            paint.setStrokeWidth(i);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m36936(Paint paint) {
        int iM13638 = this.f50260;
        if (iM13638 == 0) {
            iM13638 = AbstractC4279.m13638(paint.getColor(), 25);
        }
        paint.setColor(iM13638);
        paint.setStyle(Paint.Style.FILL);
        int i = this.f50256;
        if (i >= 0) {
            paint.setStrokeWidth(i);
        }
    }
}
