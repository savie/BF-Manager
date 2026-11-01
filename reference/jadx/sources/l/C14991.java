package l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܶۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Y169 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14991 extends AbstractC22752 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f48916;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f48917;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Drawable f48918;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Drawable f48919;

    public C14991(C7935 c7935, Drawable drawable, Drawable drawable2) {
        super(c7935);
        this.f48916 = true;
        this.f48919 = drawable;
        this.f48918 = drawable2;
        mo35970();
    }

    @Override // l.AbstractC22752
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo35968(Canvas canvas, Rect rect, float f, float f2) {
        int i = (int) ((1.0f - f) * f2 * (this.f48916 ? 153 : 51));
        int i2 = (int) (f * f2 * 153);
        if (i != 0) {
            Drawable drawable = this.f48919;
            drawable.setAlpha(i);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
        if (i2 != 0) {
            Drawable drawable2 = this.f48918;
            drawable2.setAlpha(i2);
            drawable2.setBounds(rect);
            drawable2.draw(canvas);
        }
    }

    @Override // l.AbstractC22752
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo35971() {
        int i = C6523.f21978[this.f74098.f26090.ordinal()];
        if (i == 1 || i == 2) {
            return this.f48916;
        }
        return i == 3 || i == 4;
    }

    @Override // l.AbstractC22752
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean mo35966() {
        int i = C6523.f21978[this.f74098.f26090.ordinal()];
        if (i == 1 || i == 2) {
            return this.f48916 || this.f48917;
        }
        return i == 3 || i == 4;
    }

    @Override // l.AbstractC22752
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo35970() {
        C7935 c7935 = this.f74098;
        this.f48919.setColorFilter(c7935.f26077);
        this.f48918.setColorFilter(c7935.f26077);
    }

    @Override // l.AbstractC22752
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo35972() {
        return Math.max(this.f48919.getIntrinsicWidth(), this.f48918.getIntrinsicWidth());
    }

    @Override // l.AbstractC22752
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo35967() {
        return Math.max(this.f48919.getIntrinsicHeight(), this.f48918.getIntrinsicHeight());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35969(boolean z) {
        this.f48916 = z;
        this.f74098.invalidate();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m35973() {
        this.f48917 = true;
    }
}
