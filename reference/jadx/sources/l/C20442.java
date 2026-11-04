package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.᩵۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: SAKT */
/* JADX INFO: loaded from: classes5.dex */
public class C20442 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f65466;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f65467;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f65468;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Paint f65469;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f65470;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f65471;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f65472;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f65473;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Paint f65474;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f65475;

    public C20442(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f65470 = getResources().getDisplayMetrics().density * 2.0f;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f65474 = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f65469 = paint2;
        m46873(C22637.m51028());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46873(int i) {
        this.f65471 = i;
        this.f65468 = i + 1 + this.f65470;
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m46872() {
        return this.f65471;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46874(int i, int i2) {
        this.f65473 = i;
        this.f65466 = i2;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f65474;
        paint.setColor(-2135180357);
        canvas.drawCircle(this.f65472, this.f65475, this.f65467, paint);
        paint.setColor(Integer.MIN_VALUE);
        canvas.drawCircle(this.f65472, this.f65475, this.f65467 - this.f65470, paint);
        float f = this.f65472 + this.f65473;
        float f2 = this.f65475 + this.f65466;
        float f3 = this.f65468 + this.f65470;
        Paint paint2 = this.f65469;
        canvas.drawCircle(f, f2, f3, paint2);
        paint.setColor(-2138535800);
        canvas.drawCircle(f, f2, this.f65468 + this.f65470, paint);
        canvas.drawCircle(f, f2, (this.f65470 / 2.0f) + this.f65468, paint2);
        paint.setColor(-2131824914);
        canvas.drawCircle(f, f2, (this.f65470 / 2.0f) + this.f65468, paint);
        canvas.drawCircle(f, f2, this.f65468, paint2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f65467 = Math.min(i, i2) / 2.0f;
        this.f65472 = i / 2.0f;
        this.f65475 = i2 / 2.0f;
    }
}
