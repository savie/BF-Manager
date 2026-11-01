package l;

import android.graphics.Canvas;

/* JADX INFO: renamed from: l.ۙۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5IM */
/* JADX INFO: loaded from: classes2.dex */
public final class C4555 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f16178;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f16179;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f16180;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12696(Canvas canvas, int i, int i2, int i3, float f, boolean z, C4916 c4916, InterfaceC13855 interfaceC13855, C1590 c1590) {
        if (this.f16178) {
            int i4 = this.f16179;
            int i5 = this.f16180;
            if ((i > i4 || i2 < i4) && ((i > i5 || i2 < i5) && (i <= i4 || i2 >= i5))) {
                return;
            }
            int iMax = Math.max(i, i4);
            int iMin = Math.min(i2, i5);
            C0363 c0363 = (C0363) interfaceC13855;
            float fM2080 = c0363.m2080(i, 0.0f, iMax);
            float fM2081 = c0363.m2080(i, 0.0f, iMin);
            if (i2 < i5 && (!z || i2 == i3)) {
                fM2081 += c1590.f6375;
            }
            float f2 = fM2081;
            float fM17864 = c1590.m17864();
            float fM17851 = (0.08f * fM17864) + c1590.m17851() + f;
            c4916.setColor(c1590.m17875() & (-1426063361));
            c4916.setStrokeWidth(fM17864 * 0.04f);
            canvas.drawLine(fM2080, fM17851, f2, fM17851, c4916);
            c4916.setStrokeWidth(0.0f);
        }
    }
}
