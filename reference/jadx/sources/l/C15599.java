package l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܳ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y169 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15599 extends AbstractC20075 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Drawable f50703;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f50704;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Drawable f50705;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f50706;

    public C15599(C11870 c11870, Drawable drawable, Drawable drawable2) {
        super(c11870);
        this.f50706 = true;
        this.f50705 = drawable;
        this.f50703 = drawable2;
        mo17146();
    }

    @Override // l.AbstractC20075
    /* JADX INFO: renamed from: ۙ */
    public final void mo17143(Canvas canvas, Rect rect, float f, float f2) {
        int i = (int) ((1.0f - f) * f2 * (this.f50706 ? 153 : 51));
        int i2 = (int) (f * f2 * 153);
        if (i != 0) {
            Drawable drawable = this.f50705;
            drawable.setAlpha(i);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
        if (i2 != 0) {
            Drawable drawable2 = this.f50703;
            drawable2.setAlpha(i2);
            drawable2.setBounds(rect);
            drawable2.draw(canvas);
        }
    }

    @Override // l.AbstractC20075
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo17145() {
        int i = C23059.f74810[this.f64537.f38278.ordinal()];
        if (i == 1 || i == 2) {
            return this.f50706;
        }
        return i == 3 || i == 4;
    }

    @Override // l.AbstractC20075
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo17148() {
        int i = C23059.f74810[this.f64537.f38278.ordinal()];
        if (i == 1 || i == 2) {
            return this.f50706 || this.f50704;
        }
        return i == 3 || i == 4;
    }

    @Override // l.AbstractC20075
    /* JADX INFO: renamed from: ᩴ */
    public final void mo17146() {
        C11870 c11870 = this.f64537;
        this.f50705.setColorFilter(c11870.f38259);
        this.f50703.setColorFilter(c11870.f38259);
    }

    @Override // l.AbstractC20075
    /* JADX INFO: renamed from: ᩷ */
    public final int mo17147() {
        return Math.max(this.f50705.getIntrinsicWidth(), this.f50703.getIntrinsicWidth());
    }

    @Override // l.AbstractC20075
    /* JADX INFO: renamed from: ۙ */
    public final int mo17142() {
        return Math.max(this.f50705.getIntrinsicHeight(), this.f50703.getIntrinsicHeight());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37327(boolean z) {
        this.f50706 = z;
        this.f64537.invalidate();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m37328() {
        this.f50704 = true;
    }
}
