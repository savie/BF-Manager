package l;

/* JADX INFO: renamed from: l.ۢۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BHK */
/* JADX INFO: loaded from: classes3.dex */
public final class C9383 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16251 f31758;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f31759;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6143 f31760;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC1620 f31761;

    public C9383(int i, EnumC1620 enumC1620, C16251 c16251) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        if (enumC1620 == null) {
            throw new NullPointerException("disposition == null");
        }
        try {
            if (c16251.m38386() == null) {
                throw new NullPointerException("spec.getLocalItem() == null");
            }
            this.f31759 = i;
            this.f31761 = enumC1620;
            this.f31758 = c16251;
            this.f31760 = C6143.m17126(c16251.getType());
        } catch (NullPointerException unused) {
            throw new NullPointerException("spec == null");
        }
    }

    public final String toString() {
        return Integer.toHexString(this.f31759) + " " + this.f31761 + " " + this.f31758;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C9383) && compareTo((C9383) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C9383 c9383) {
        int i = c9383.f31759;
        int i2 = this.f31759;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        boolean zM24064 = m24064();
        if (zM24064 != c9383.m24064()) {
            return zM24064 ? 1 : -1;
        }
        return this.f31758.compareTo(c9383.f31758);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24065() {
        return this.f31759;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC1620 m24070() {
        return this.f31761;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m24064() {
        return this.f31761 == EnumC1620.START;
    }

    public final C17432 getName() {
        return this.f31758.m38386().getName();
    }

    public final C17432 getSignature() {
        return this.f31758.m38386().getSignature();
    }

    public final C6143 getType() {
        return this.f31760;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m24069() {
        return this.f31758.m38400();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C16251 m24063() {
        return this.f31758;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24068(C16251 c16251) {
        return this.f31758.m38398(c16251);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m24071(C9383 c9383) {
        return this.f31758.m38398(c9383.f31758);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9383 m24067(EnumC1620 enumC1620) {
        return enumC1620 == this.f31761 ? this : new C9383(this.f31759, enumC1620, this.f31758);
    }
}
