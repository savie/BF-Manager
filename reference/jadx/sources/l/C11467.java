package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U75B */
/* JADX INFO: loaded from: classes3.dex */
public final class C11467 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C16373 f38605;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16373 f38606;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f38607;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16373 f38608;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16373 f38609;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f38610;

    public C11467(ArrayList arrayList, ArrayList arrayList2, C16373 c16373, C16373 c16374, C16373 c16375, C16373 c16376, int i, int i2) {
        this.f38607 = C2293.m7019(arrayList);
        this.f38610 = C2293.m7019(arrayList2);
        this.f38606 = C2293.m7015(c16373);
        this.f38609 = C2293.m7015(c16374);
        this.f38608 = c16375 == null ? new C16373(0, i) : C2293.m7015(c16375);
        this.f38605 = c16376 == null ? new C16373(0, i2) : C2293.m7015(c16376);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28652(C11467 c11467) {
        return m28650(this.f38607, c11467.f38607) && m28650(this.f38610, c11467.f38610) && m28651(this.f38606, c11467.f38606) && m28651(this.f38609, c11467.f38609) && m28651(this.f38608, c11467.f38608) && m28651(this.f38605, c11467.f38605);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m28650(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() == arrayList2.size()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (m28651((C16373) arrayList.get(i), (C16373) arrayList2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m28651(C16373 c16373, C16373 c16374) {
        if (c16373 == null || c16374 == null) {
            return c16373 == c16374;
        }
        return c16373.f52692 == c16374.f52692 && c16373.f52691 == c16374.f52691;
    }
}
