package l;

/* JADX INFO: renamed from: l.ۙ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BHK */
/* JADX INFO: loaded from: classes2.dex */
public final class C5239 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C1028 f18442;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f18443;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20946 f18444;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC13662 f18445;

    public C5239(int i, EnumC13662 enumC13662, C20946 c20946) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        if (enumC13662 == null) {
            throw new NullPointerException("disposition == null");
        }
        try {
            if (c20946.m47896() == null) {
                throw new NullPointerException("spec.getLocalItem() == null");
            }
            this.f18443 = i;
            this.f18445 = enumC13662;
            this.f18444 = c20946;
            this.f18442 = C1028.m3931(c20946.getType());
        } catch (NullPointerException unused) {
            throw new NullPointerException("spec == null");
        }
    }

    public final String toString() {
        return Integer.toHexString(this.f18443) + " " + this.f18445 + " " + this.f18444;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5239) && compareTo((C5239) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C5239 c5239) {
        int i = c5239.f18443;
        int i2 = this.f18443;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        boolean zM15739 = m15739();
        if (zM15739 != c5239.m15739()) {
            return zM15739 ? 1 : -1;
        }
        return this.f18444.compareTo(c5239.f18444);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15740() {
        return this.f18443;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC13662 m15747() {
        return this.f18445;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m15739() {
        return this.f18445 == EnumC13662.START;
    }

    public final C9976 getName() {
        return this.f18444.m47896().getName();
    }

    public final C9976 getSignature() {
        return this.f18444.m47896().getSignature();
    }

    public final C1028 getType() {
        return this.f18442;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m15745() {
        return this.f18444.m47903();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C20946 m15744() {
        return this.f18444;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15743(C20946 c20946) {
        return this.f18444.m47900(c20946);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m15746(C5239 c5239) {
        return this.f18444.m47900(c5239.f18444);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5239 m15742(EnumC13662 enumC13662) {
        return enumC13662 == this.f18445 ? this : new C5239(this.f18443, enumC13662, this.f18444);
    }
}
