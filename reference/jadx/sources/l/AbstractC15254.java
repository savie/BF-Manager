package l;

/* JADX INFO: renamed from: l.ܶ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBCX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15254 extends AbstractC21603 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f49728 = -1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m36531() {
        return this.f49728 >= 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m36534() {
        int i = this.f49728;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("index not yet set");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36533(int i) {
        if (this.f49728 != -1) {
            throw new RuntimeException("index already set");
        }
        this.f49728 = i;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m36532() {
        return "[" + Integer.toHexString(this.f49728) + ']';
    }
}
