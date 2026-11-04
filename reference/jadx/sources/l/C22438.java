package l;

/* JADX INFO: renamed from: l.᩸֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PBDW */
/* JADX INFO: loaded from: classes.dex */
public final class C22438 implements InterfaceC17238 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15724 f72639;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f72640;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f72641;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C24698 f72642;

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public C22438(int i, C15724 c15724, C24698 c24698, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        try {
            c15724.m46488();
            int size = c15724.size();
            if (size == 0) {
                throw new IllegalArgumentException("insns.size() == 0");
            }
            int i3 = size - 2;
            while (true) {
                if (i3 < 0) {
                    if (c15724.m31617get(size - 1).m40434().m43508() == 1) {
                        throw new IllegalArgumentException("insns does not end with a branch or throwing instruction");
                    }
                    try {
                        c24698.m46488();
                        if (i2 < -1) {
                            throw new IllegalArgumentException("primarySuccessor < -1");
                        }
                        if (i2 >= 0) {
                            int iM55043 = c24698.m55043(i2);
                            if (!((iM55043 >= 0 ? iM55043 : -1) >= 0)) {
                                throw new IllegalArgumentException("primarySuccessor " + i2 + " not in successors " + c24698);
                            }
                        }
                        this.f72641 = i;
                        this.f72639 = c15724;
                        this.f72642 = c24698;
                        this.f72640 = i2;
                        return;
                    } catch (NullPointerException unused) {
                        throw new NullPointerException("successors == null");
                    }
                }
                if (c15724.m31617get(i3).m40434().m43508() != 1) {
                    throw new IllegalArgumentException(C14442.m34864(i3, "insns[", "] is a branch or can throw"));
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

    @Override // l.InterfaceC17238
    /* JADX INFO: renamed from: ۙ */
    public final int mo31292() {
        return this.f72641;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C15724 m50596() {
        return this.f72639;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C24698 m50590() {
        return this.f72642;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m50593() {
        return this.f72640;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m50592() {
        C24698 c24698 = this.f72642;
        if (c24698.size() != 2) {
            throw new UnsupportedOperationException("block doesn't have exactly two successors");
        }
        int i = c24698.get(0);
        return i == this.f72640 ? c24698.get(1) : i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC17216 m50591() {
        return this.f72639.m31617get(0);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC17216 m50594() {
        return this.f72639.m37632();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m50595() {
        return this.f72639.m37632().m40439();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50589() {
        return this.f72639.m37632().mo7781().size() != 0;
    }

    public final String toString() {
        return "{" + C5306.m15934(this.f72641) + '}';
    }
}
