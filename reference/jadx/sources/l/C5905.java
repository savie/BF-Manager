package l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۚ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y169 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5905 extends AbstractC20075 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f20213;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Drawable f20214;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f20215;

    public C5905(C11870 c11870, Drawable drawable, int i) {
        super(c11870);
        this.f20213 = true;
        this.f20214 = drawable;
        this.f20215 = i;
        mo17146();
    }

    @Override // l.AbstractC20075
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17143(Canvas canvas, Rect rect, float f, float f2) {
        int i = (int) ((this.f20213 ? 153 : 51) * f2);
        Drawable drawable = this.f20214;
        drawable.setAlpha(i);
        drawable.setBounds(rect);
        float f3 = this.f20215;
        if (f3 != 0.0f) {
            C11870 c11870 = this.f64537;
            if (c11870.f38278 == EnumC2176.STATE_1_2) {
                if (f < 0.0f) {
                    f = 0.0f;
                } else if (f > 1.0f) {
                    f = 1.0f;
                }
                f = (float) Math.sin(f * 1.5707964f);
            } else if (c11870.f38278 == EnumC2176.STATE_2_1) {
                if (f < 0.0f) {
                    f = 0.0f;
                } else if (f > 1.0f) {
                    f = 1.0f;
                }
                f = 1.0f - ((float) Math.cos(f * 1.5707964f));
            }
            f3 *= f;
        }
        float f4 = (rect.left + rect.right) / 2.0f;
        float f5 = (rect.top + rect.bottom) / 2.0f;
        canvas.rotate(f3, f4, f5);
        drawable.draw(canvas);
        canvas.rotate(-f3, f4, f5);
    }

    @Override // l.AbstractC20075
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo17145() {
        return this.f20213;
    }

    @Override // l.AbstractC20075
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo17148() {
        return this.f20213;
    }

    @Override // l.AbstractC20075
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo17146() {
        this.f20214.setColorFilter(this.f64537.f38259);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17144(boolean z) {
        this.f20213 = z;
        this.f64537.invalidate();
    }

    @Override // l.AbstractC20075
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo17147() {
        return this.f20214.getIntrinsicWidth();
    }

    @Override // l.AbstractC20075
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo17142() {
        return this.f20214.getIntrinsicHeight();
    }
}
