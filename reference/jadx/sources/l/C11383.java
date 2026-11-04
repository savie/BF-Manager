package l;

/* JADX INFO: renamed from: l.ۧۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11383 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1689 f35831;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f35832;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17350 f35833;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f35834;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f35835 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f35836;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f35837;

    public C11383(C17350 c17350) {
        this.f35833 = c17350;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m28730(int i) {
        if (i < 0) {
            return false;
        }
        C17350 c17350 = this.f35833;
        if (i >= c17350.f56463) {
            return false;
        }
        if (this.f35835 != c17350.f56461 || i < this.f35834 || i >= this.f35832) {
            this.f35836 = c17350.m40737(i);
            this.f35831 = (C1689) c17350.f56462.get(this.f35836);
            int iM40730 = c17350.m40730(this.f35836);
            this.f35834 = iM40730;
            this.f35832 = iM40730 + this.f35831.f5804;
            this.f35835 = c17350.f56461;
        }
        this.f35837 = i - this.f35834;
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m28729() {
        return this.f35831.f5801[this.f35837] & 65535;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m28727() {
        return (char) (this.f35831.f5801[this.f35837] >>> 16);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m28731() {
        return this.f35831.m6044(this.f35837) - this.f35831.m6046(this.f35837);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m28732(int i) {
        C1689 c1689 = this.f35831;
        return c1689.f5803[C17359.checkIndex(i, m28731()) + c1689.m6046(this.f35837)];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28728(int i) {
        int iM6044 = this.f35831.m6044(this.f35837);
        for (int iM6046 = this.f35831.m6046(this.f35837); iM6046 < iM6044; iM6046++) {
            if (this.f35831.f5803[iM6046] == i) {
                return true;
            }
        }
        return false;
    }
}
