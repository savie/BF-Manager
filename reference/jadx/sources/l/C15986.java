package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ܺܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C15986 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f51767 = new ArrayDeque();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20924 m37964() {
        ArrayDeque arrayDeque = this.f51767;
        C2578 c2578 = (C2578) arrayDeque.peekLast();
        return new C20924(arrayDeque.size(), c2578 == null ? 0 : c2578.length());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22710 m37965(int i, byte[] bArr) {
        if (i == 0) {
            return null;
        }
        int i2 = 0;
        C22710 c22710M20831 = null;
        while (i > 0) {
            ArrayDeque arrayDeque = this.f51767;
            C2578 c2578 = (C2578) arrayDeque.peekLast();
            if (c2578 == null || c2578.m8036() == 0) {
                c2578 = new C2578(65536);
                arrayDeque.addLast(c2578);
            }
            int iMin = Math.min(i, c2578.m8036());
            c22710M20831 = C7893.m20831(c22710M20831, C7893.m20844(new C3658(c2578, c2578.m8034(i2, iMin, bArr), iMin, null)));
            i2 += iMin;
            i -= iMin;
        }
        return c22710M20831;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37966(C20924 c20924) {
        ArrayDeque arrayDeque;
        while (true) {
            arrayDeque = this.f51767;
            if (arrayDeque.size() <= c20924.f67980) {
                break;
            } else {
                arrayDeque.removeLast();
            }
        }
        C2578 c2578 = (C2578) arrayDeque.peekLast();
        if (c2578 != null) {
            c2578.m8033(c20924.f67981);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37967() {
        while (true) {
            ArrayDeque arrayDeque = this.f51767;
            if (arrayDeque.size() <= 1) {
                return;
            } else {
                arrayDeque.removeFirst();
            }
        }
    }
}
