package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 690O */
/* JADX INFO: loaded from: classes2.dex */
public final class C6061 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C13262 f20563;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f20564;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f20565;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f20566;

    public C6061(C13262 c13262) {
        this.f20563 = c13262;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16464() {
        this.f20564 = null;
        this.f20566 = false;
        this.f20565 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16461(C6061 c6061, InterfaceC12061 interfaceC12061, AbstractC13723 abstractC13723) {
        int length = interfaceC12061.length();
        interfaceC12061.mo29972(abstractC13723);
        if (c6061.f20564 != null) {
            C2657 c2657Builder = interfaceC12061.builder();
            int length2 = c2657Builder.length();
            boolean z = length2 > 0 && '\n' != c2657Builder.charAt(length2 - 1);
            if (z) {
                interfaceC12061.mo29963();
            }
            c2657Builder.append((char) 160);
            C4794 c4794 = new C4794(c6061.f20563, c6061.f20564, c6061.f20566, c6061.f20565 % 2 == 1);
            c6061.f20565 = c6061.f20566 ? 0 : c6061.f20565 + 1;
            if (z) {
                length++;
            }
            interfaceC12061.mo29966(length, c4794);
            c6061.f20564 = null;
        }
    }
}
