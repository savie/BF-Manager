package l;

/* JADX INFO: renamed from: l.ۨ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: PBDW */
/* JADX INFO: loaded from: classes4.dex */
public final class C12018 implements InterfaceC23181 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C4129 f40257;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21895 f40258;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f40259;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f40260;

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public C12018(int i, C21895 c21895, C4129 c4129, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        try {
            c21895.m43642();
            int size = c21895.size();
            if (size == 0) {
                throw new IllegalArgumentException("insns.size() == 0");
            }
            int i3 = size - 2;
            while (true) {
                if (i3 < 0) {
                    if (c21895.m15274get(size - 1).m37181().m31577() == 1) {
                        throw new IllegalArgumentException("insns does not end with a branch or throwing instruction");
                    }
                    try {
                        c4129.m43642();
                        if (i2 < -1) {
                            throw new IllegalArgumentException("primarySuccessor < -1");
                        }
                        if (i2 >= 0) {
                            int iM11755 = c4129.m11755(i2);
                            if (!((iM11755 >= 0 ? iM11755 : -1) >= 0)) {
                                throw new IllegalArgumentException("primarySuccessor " + i2 + " not in successors " + c4129);
                            }
                        }
                        this.f40260 = i;
                        this.f40258 = c21895;
                        this.f40257 = c4129;
                        this.f40259 = i2;
                        return;
                    } catch (NullPointerException unused) {
                        throw new NullPointerException("successors == null");
                    }
                }
                if (c21895.m15274get(i3).m37181().m31577() != 1) {
                    throw new IllegalArgumentException(C2271.m6966(i3, "insns[", "] is a branch or can throw"));
                }
                i3--;
            }
        } catch (NullPointerException unused2) {
            throw new NullPointerException("insns == null");
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // l.InterfaceC23181
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo29913() {
        return this.f40260;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21895 m29911() {
        return this.f40258;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C4129 m29916() {
        return this.f40257;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m29918() {
        return this.f40259;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m29910() {
        C4129 c4129 = this.f40257;
        if (c4129.size() != 2) {
            throw new UnsupportedOperationException("block doesn't have exactly two successors");
        }
        int i = c4129.get(0);
        return i == this.f40259 ? c4129.get(1) : i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC15546 m29915() {
        return this.f40258.m15274get(0);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC15546 m29914() {
        return this.f40258.m48689();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m29917() {
        return this.f40258.m48689().m37184();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m29912() {
        return this.f40258.m48689().mo6700().size() != 0;
    }

    public final String toString() {
        return "{" + C22475.m49982(this.f40260) + '}';
    }
}
