package l;

/* JADX INFO: renamed from: l.۟֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BAL */
/* JADX INFO: loaded from: classes4.dex */
public final class C7521 extends C20222 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20946[] f24845;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f24846;

    static {
        new C7521(0);
    }

    public C7521(int i) {
        super(i != 0);
        this.f24845 = new C20946[i];
        this.f24846 = 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7521)) {
            return false;
        }
        C7521 c7521 = (C7521) obj;
        C20946[] c20946Arr = c7521.f24845;
        C20946[] c20946Arr2 = this.f24845;
        int length = c20946Arr2.length;
        if (length != c20946Arr.length || size() != c7521.size()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            C20946 c20946 = c20946Arr2[i];
            Object obj2 = c20946Arr[i];
            if (c20946 != obj2 && (c20946 == null || !c20946.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        C20946[] c20946Arr = this.f24845;
        int length = c20946Arr.length;
        int iHashCode = 0;
        for (int i = 0; i < length; i++) {
            C20946 c20946 = c20946Arr[i];
            iHashCode = (iHashCode * 31) + (c20946 == null ? 0 : c20946.hashCode());
        }
        return iHashCode;
    }

    public final String toString() {
        C20946[] c20946Arr = this.f24845;
        StringBuilder sb = new StringBuilder(c20946Arr.length * 25);
        sb.append('{');
        boolean z = false;
        for (C20946 c20946 : c20946Arr) {
            if (c20946 != null) {
                if (z) {
                    sb.append(", ");
                } else {
                    z = true;
                }
                sb.append(c20946);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m20590() {
        return this.f24845.length;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20591(C7521 c7521) {
        int length = c7521.f24845.length;
        for (int i = 0; i < length; i++) {
            C20946 c20946 = c7521.get(i);
            if (c20946 != null) {
                m20592(c20946);
            }
        }
    }

    public final int size() {
        int i = this.f24846;
        if (i >= 0) {
            return i;
        }
        int i2 = 0;
        for (C20946 c20946 : this.f24845) {
            if (c20946 != null) {
                i2++;
            }
        }
        this.f24846 = i2;
        return i2;
    }

    public final C20946 get(int i) {
        try {
            return this.f24845[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20946 m20586(C20946 c20946) {
        for (C20946 c20947 : this.f24845) {
            if (c20947 != null && c20946.m47902(c20947)) {
                return c20947;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20946 m20585(C3046 c3046) {
        for (C20946 c20946 : this.f24845) {
            if (c20946 != null && c3046.equals(c20946.m47896())) {
                return c20946;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m20589(C20946 c20946) {
        try {
            this.f24845[c20946.m47903()] = null;
            this.f24846 = -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20592(C20946 c20946) {
        int i;
        C20946 c20947;
        C20946[] c20946Arr = this.f24845;
        m46490();
        if (c20946 == null) {
            throw new NullPointerException("spec == null");
        }
        this.f24846 = -1;
        try {
            int iM47903 = c20946.m47903();
            c20946Arr[iM47903] = c20946;
            if (iM47903 > 0 && (c20947 = c20946Arr[(i = iM47903 - 1)]) != null && c20947.m47901() == 2) {
                c20946Arr[i] = null;
            }
            if (c20946.m47901() == 2) {
                c20946Arr[iM47903 + 1] = null;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("spec.getReg() out of range");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20587(C7521 c7521) {
        C20946 c20946M47894;
        m46490();
        C20946[] c20946Arr = c7521.f24845;
        C20946[] c20946Arr2 = this.f24845;
        int length = c20946Arr2.length;
        int iMin = Math.min(length, c20946Arr.length);
        this.f24846 = -1;
        for (int i = 0; i < iMin; i++) {
            C20946 c20946 = c20946Arr2[i];
            if (c20946 != null && (c20946M47894 = c20946.m47894(c20946Arr[i])) != c20946) {
                c20946Arr2[i] = c20946M47894;
            }
        }
        while (iMin < length) {
            c20946Arr2[iMin] = null;
            iMin++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7521 m20584(int i) {
        C20946[] c20946Arr = this.f24845;
        C7521 c7521 = new C7521(c20946Arr.length + i);
        for (C20946 c20946 : c20946Arr) {
            if (c20946 != null) {
                c7521.m20592(c20946.m47890(i));
            }
        }
        c7521.f24846 = this.f24846;
        if (m46487()) {
            c7521.mo15005();
        }
        return c7521;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C7521 m20588() {
        C20946[] c20946Arr = this.f24845;
        C7521 c7521 = new C7521(c20946Arr.length);
        for (C20946 c20946 : c20946Arr) {
            if (c20946 != null) {
                c7521.m20592(c20946);
            }
        }
        c7521.f24846 = this.f24846;
        return c7521;
    }
}
