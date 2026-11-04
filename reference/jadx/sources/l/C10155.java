package l;

import android.graphics.Canvas;

/* JADX INFO: renamed from: l.ۢ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J5IM */
/* JADX INFO: loaded from: classes3.dex */
public final class C10155 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f32517;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f32518;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f32519;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26265(Canvas canvas, int i, int i2, int i3, float f, boolean z, C10232 c10232, InterfaceC7829 interfaceC7829, C14540 c14540) {
        if (this.f32517) {
            int i4 = this.f32518;
            int i5 = this.f32519;
            if ((i > i4 || i2 < i4) && ((i > i5 || i2 < i5) && (i <= i4 || i2 >= i5))) {
                return;
            }
            int iMax = Math.max(i, i4);
            int iMin = Math.min(i2, i5);
            C8533 c8533 = (C8533) interfaceC7829;
            float fM22846 = c8533.m22846(i, 0.0f, iMax);
            float fM22847 = c8533.m22846(i, 0.0f, iMin);
            if (i2 < i5 && (!z || i2 == i3)) {
                fM22847 += c14540.f45786;
            }
            float f2 = fM22847;
            float fM16211 = c14540.m16211();
            float fM16203 = (0.08f * fM16211) + c14540.m16203() + f;
            c10232.setColor(c14540.m16212() & (-1426063361));
            c10232.setStrokeWidth(fM16211 * 0.04f);
            canvas.drawLine(fM22846, fM16203, f2, fM16203, c10232);
            c10232.setStrokeWidth(0.0f);
        }
    }
}
