package l;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܿܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8WD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17474 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final float[] f55593 = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f55594;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f55595;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final float[] f55596;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f55597;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f55598;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f55599;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f55600;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f55601;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f55602;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f55603;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f55604;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f55605;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12536 m40659(Context context) {
        C3633 c3633 = new C3633(context.getResources().getDisplayMetrics().density);
        C12536 c12536 = new C12536();
        c12536.m31167(c3633.m10737(8));
        c12536.m31165(c3633.m10737(24));
        c12536.m31172(c3633.m10737(4));
        c12536.m31169(c3633.m10737(1));
        c12536.m31161(c3633.m10737(1));
        c12536.m31163(c3633.m10737(4));
        return c12536;
    }

    public C17474(C12536 c12536) {
        this.f55599 = c12536.f41973;
        this.f55597 = c12536.f41971;
        this.f55602 = c12536.f41976;
        this.f55600 = c12536.f41974;
        this.f55598 = c12536.f41972;
        this.f55604 = c12536.f41978;
        this.f55601 = c12536.f41975;
        this.f55594 = c12536.f41968;
        this.f55596 = c12536.f41970;
        this.f55605 = c12536.f41979;
        this.f55603 = c12536.f41977;
        this.f55595 = c12536.f41969;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40665(TextPaint textPaint) {
        if (this.f55599) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(textPaint.linkColor);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40670(Paint paint) {
        if (this.f55599) {
            paint.setUnderlineText(true);
        }
        if (paint instanceof TextPaint) {
            paint.setColor(((TextPaint) paint).linkColor);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40662() {
        return this.f55597;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m40669() {
        int i = this.f55602;
        return i == 0 ? (int) ((this.f55597 * 0.25f) + 0.5f) : i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m40668(Paint paint) {
        paint.setColor(paint.getColor());
        int i = this.f55600;
        if (i != 0) {
            paint.setStrokeWidth(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40663(int i) {
        int iMin = Math.min(this.f55597, i) / 2;
        int i2 = this.f55598;
        return (i2 == 0 || i2 > iMin) ? iMin : i2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m40667() {
        return this.f55595;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m40660() {
        return this.f55604;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40666(TextPaint textPaint, int i) {
        textPaint.setFakeBoldText(true);
        float[] fArr = this.f55596;
        if (fArr == null) {
            fArr = f55593;
        }
        if (fArr.length >= i) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i - 1]);
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalStateException("Supplied heading level: " + i + " is invalid, where configured heading sizes are: `" + Arrays.toString(fArr) + "`");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40664(Paint paint) {
        int iM31802 = this.f55594;
        if (iM31802 == 0) {
            iM31802 = AbstractC12807.m31802(paint.getColor(), 75);
        }
        paint.setColor(iM31802);
        paint.setStyle(Paint.Style.FILL);
        int i = this.f55601;
        if (i >= 0) {
            paint.setStrokeWidth(i);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m40661(Paint paint) {
        int iM31802 = this.f55605;
        if (iM31802 == 0) {
            iM31802 = AbstractC12807.m31802(paint.getColor(), 25);
        }
        paint.setColor(iM31802);
        paint.setStyle(Paint.Style.FILL);
        int i = this.f55603;
        if (i >= 0) {
            paint.setStrokeWidth(i);
        }
    }
}
