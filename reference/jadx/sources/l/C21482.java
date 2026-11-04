package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩶ᩳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: TISQ */
/* JADX INFO: loaded from: classes.dex */
public final class C21482 extends AbstractC17072 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final BitSet f68692;

    public C21482(C2551 c2551) {
        this.f68692 = new BitSet(c2551.mo8532().m49705());
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC2157 mo1791() {
        return C11457.f36005;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m48888(C2551 c2551, int i) {
        C21482 c21482 = (C21482) c2551.mo17862(C11457.f36005);
        if (c21482 == null) {
            c21482 = new C21482(c2551);
            c2551.mo17864(c21482);
        }
        c21482.f68692.set(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48887(C2551 c2551, int i) {
        if (c2551 == null) {
            return false;
        }
        if (i == 0 && c2551.mo17865(EnumC1763.SKIP_FIRST_ARG)) {
            return true;
        }
        C21482 c21482 = (C21482) c2551.mo17862((InterfaceC2157) C11457.f36005);
        if (c21482 == null) {
            return false;
        }
        return c21482.f68692.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48890(int i) {
        return this.f68692.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m48889() {
        return this.f68692.cardinality();
    }

    public final String toString() {
        return "SKIP_MTH_ARGS: " + this.f68692;
    }
}
