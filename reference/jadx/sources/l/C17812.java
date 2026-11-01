package l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ᩳۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Y169 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17812 extends AbstractC22752 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f56440;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f56441;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Drawable f56442;

    public C17812(C7935 c7935, Drawable drawable, int i) {
        super(c7935);
        this.f56441 = true;
        this.f56442 = drawable;
        this.f56440 = i;
        mo35970();
    }

    @Override // l.AbstractC22752
    /* JADX INFO: renamed from: ۙ */
    public final void mo35968(Canvas canvas, Rect rect, float f, float f2) {
        int i = (int) ((this.f56441 ? 153 : 51) * f2);
        Drawable drawable = this.f56442;
        drawable.setAlpha(i);
        drawable.setBounds(rect);
        float f3 = this.f56440;
        if (f3 != 0.0f) {
            C7935 c7935 = this.f74098;
            if (c7935.f26090 == EnumC18518.STATE_1_2) {
                if (f < 0.0f) {
                    f = 0.0f;
                } else if (f > 1.0f) {
                    f = 1.0f;
                }
                f = (float) Math.sin(f * 1.5707964f);
            } else if (c7935.f26090 == EnumC18518.STATE_2_1) {
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

    @Override // l.AbstractC22752
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo35971() {
        return this.f56441;
    }

    @Override // l.AbstractC22752
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo35966() {
        return this.f56441;
    }

    @Override // l.AbstractC22752
    /* JADX INFO: renamed from: ۚ */
    public final void mo35970() {
        this.f56442.setColorFilter(this.f74098.f26077);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41398(boolean z) {
        this.f56441 = z;
        this.f74098.invalidate();
    }

    @Override // l.AbstractC22752
    /* JADX INFO: renamed from: ܰ */
    public final int mo35972() {
        return this.f56442.getIntrinsicWidth();
    }

    @Override // l.AbstractC22752
    /* JADX INFO: renamed from: ۙ */
    public final int mo35967() {
        return this.f56442.getIntrinsicHeight();
    }
}
