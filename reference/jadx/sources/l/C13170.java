package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.۬ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: SAKT */
/* JADX INFO: loaded from: classes3.dex */
public class C13170 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f43843;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f43844;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f43845;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Paint f43846;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f43847;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f43848;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f43849;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Paint f43850;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f43851;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f43852;

    public C13170(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43852 = getResources().getDisplayMetrics().density * 2.0f;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f43850 = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f43846 = paint2;
        m32561(C17403.m40553());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32561(int i) {
        this.f43844 = i;
        this.f43847 = i + 1 + this.f43852;
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32560() {
        return this.f43844;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32562(int i, int i2) {
        this.f43843 = i;
        this.f43849 = i2;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f43850;
        paint.setColor(-2135180357);
        canvas.drawCircle(this.f43848, this.f43851, this.f43845, paint);
        paint.setColor(Integer.MIN_VALUE);
        canvas.drawCircle(this.f43848, this.f43851, this.f43845 - this.f43852, paint);
        float f = this.f43848 + this.f43843;
        float f2 = this.f43851 + this.f43849;
        float f3 = this.f43847 + this.f43852;
        Paint paint2 = this.f43846;
        canvas.drawCircle(f, f2, f3, paint2);
        paint.setColor(-2138535800);
        canvas.drawCircle(f, f2, this.f43847 + this.f43852, paint);
        canvas.drawCircle(f, f2, (this.f43852 / 2.0f) + this.f43847, paint2);
        paint.setColor(-2131824914);
        canvas.drawCircle(f, f2, (this.f43852 / 2.0f) + this.f43847, paint);
        canvas.drawCircle(f, f2, this.f43847, paint2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f43845 = Math.min(i, i2) / 2.0f;
        this.f43848 = i / 2.0f;
        this.f43851 = i2 / 2.0f;
    }
}
