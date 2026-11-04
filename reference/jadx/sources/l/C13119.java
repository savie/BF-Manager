package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 690O */
/* JADX INFO: loaded from: classes4.dex */
public final class C13119 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f41924;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f41925;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f41926;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4170 f41927;

    public C13119(C4170 c4170) {
        this.f41927 = c4170;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32597() {
        this.f41924 = null;
        this.f41926 = false;
        this.f41925 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32594(C13119 c13119, InterfaceC20029 interfaceC20029, AbstractC24451 abstractC24451) {
        int length = interfaceC20029.length();
        interfaceC20029.mo7364(abstractC24451);
        if (c13119.f41924 != null) {
            C20775 c20775Builder = interfaceC20029.builder();
            int length2 = c20775Builder.length();
            boolean z = length2 > 0 && '\n' != c20775Builder.charAt(length2 - 1);
            if (z) {
                interfaceC20029.mo7365();
            }
            c20775Builder.append((char) 160);
            C16102 c16102 = new C16102(c13119.f41927, c13119.f41924, c13119.f41926, c13119.f41925 % 2 == 1);
            c13119.f41925 = c13119.f41926 ? 0 : c13119.f41925 + 1;
            if (z) {
                length++;
            }
            interfaceC20029.mo7335(length, c16102);
            c13119.f41924 = null;
        }
    }
}
