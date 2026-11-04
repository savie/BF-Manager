package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ܿ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBH4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17962 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f58834 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f58835;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C0063 f58836;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final BitSet f58837;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0063 f58838;

    public C17962(C0063 c0063, BitSet bitSet, boolean z) {
        this.f58838 = c0063;
        this.f58837 = bitSet;
        this.f58836 = new C0063(c0063.size());
        this.f58835 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41915(C17962 c17962, int i) {
        C20946 c20946M47899 = (C20946) c17962.f58838.m31593(i);
        BitSet bitSet = c17962.f58837;
        if (bitSet == null || !bitSet.get(i)) {
            c20946M47899 = c20946M47899.m47899(c17962.f58834);
            if (!c17962.f58835) {
                c17962.f58834 = c20946M47899.m47901() + c17962.f58834;
            }
        }
        c17962.f58835 = false;
        c17962.f58836.m31596(i, (Object) c20946M47899);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0063 m41914(C17962 c17962) {
        C0063 c0063 = c17962.f58836;
        if (c17962.f58838.m46487()) {
            c0063.mo15005();
        }
        return c0063;
    }
}
