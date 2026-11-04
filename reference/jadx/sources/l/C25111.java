package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.᩻ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes.dex */
public final class C25111 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f81213 = new ArrayDeque();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11684 m55979() {
        ArrayDeque arrayDeque = this.f81213;
        C0630 c0630 = (C0630) arrayDeque.peekLast();
        return new C11684(arrayDeque.size(), c0630 == null ? 0 : c0630.length());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13856 m55980(int i, byte[] bArr) {
        if (i == 0) {
            return null;
        }
        int i2 = 0;
        C13856 c13856M45249 = null;
        while (i > 0) {
            ArrayDeque arrayDeque = this.f81213;
            C0630 c0630 = (C0630) arrayDeque.peekLast();
            if (c0630 == null || c0630.m2793() == 0) {
                c0630 = new C0630(65536);
                arrayDeque.addLast(c0630);
            }
            int iMin = Math.min(i, c0630.m2793());
            c13856M45249 = C19606.m45249(c13856M45249, C19606.m45213(new C8636(c0630, c0630.m2794(i2, iMin, bArr), iMin, null)));
            i2 += iMin;
            i -= iMin;
        }
        return c13856M45249;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55981(C11684 c11684) {
        ArrayDeque arrayDeque;
        while (true) {
            arrayDeque = this.f81213;
            if (arrayDeque.size() <= c11684.f37843) {
                break;
            } else {
                arrayDeque.removeLast();
            }
        }
        C0630 c0630 = (C0630) arrayDeque.peekLast();
        if (c0630 != null) {
            c0630.m2789(c11684.f37844);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55982() {
        while (true) {
            ArrayDeque arrayDeque = this.f81213;
            if (arrayDeque.size() <= 1) {
                return;
            } else {
                arrayDeque.removeFirst();
            }
        }
    }
}
