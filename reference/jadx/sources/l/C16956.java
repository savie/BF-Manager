package l;

/* JADX INFO: renamed from: l.ܽ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BAL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16956 extends C18947 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16251[] f54249;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f54250;

    static {
        new C16956(0);
    }

    public C16956(int i) {
        super(i != 0);
        this.f54249 = new C16251[i];
        this.f54250 = 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16956)) {
            return false;
        }
        C16956 c16956 = (C16956) obj;
        C16251[] c16251Arr = c16956.f54249;
        C16251[] c16251Arr2 = this.f54249;
        int length = c16251Arr2.length;
        if (length != c16251Arr.length || size() != c16956.size()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            C16251 c16251 = c16251Arr2[i];
            Object obj2 = c16251Arr[i];
            if (c16251 != obj2 && (c16251 == null || !c16251.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        C16251[] c16251Arr = this.f54249;
        int length = c16251Arr.length;
        int iHashCode = 0;
        for (int i = 0; i < length; i++) {
            C16251 c16251 = c16251Arr[i];
            iHashCode = (iHashCode * 31) + (c16251 == null ? 0 : c16251.hashCode());
        }
        return iHashCode;
    }

    public final String toString() {
        C16251[] c16251Arr = this.f54249;
        StringBuilder sb = new StringBuilder(c16251Arr.length * 25);
        sb.append('{');
        boolean z = false;
        for (C16251 c16251 : c16251Arr) {
            if (c16251 != null) {
                if (z) {
                    sb.append(", ");
                } else {
                    z = true;
                }
                sb.append(c16251);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m39743() {
        return this.f54249.length;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m39747(C16956 c16956) {
        int length = c16956.f54249.length;
        for (int i = 0; i < length; i++) {
            C16251 c16251 = c16956.get(i);
            if (c16251 != null) {
                m39746(c16251);
            }
        }
    }

    public final int size() {
        int i = this.f54250;
        if (i >= 0) {
            return i;
        }
        int i2 = 0;
        for (C16251 c16251 : this.f54249) {
            if (c16251 != null) {
                i2++;
            }
        }
        this.f54250 = i2;
        return i2;
    }

    public final C16251 get(int i) {
        try {
            return this.f54249[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16251 m39739(C16251 c16251) {
        for (C16251 c16252 : this.f54249) {
            if (c16252 != null && c16251.m38387(c16252)) {
                return c16252;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16251 m39740(C19073 c19073) {
        for (C16251 c16251 : this.f54249) {
            if (c16251 != null && c19073.equals(c16251.m38386())) {
                return c16251;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m39745(C16251 c16251) {
        try {
            this.f54249[c16251.m38400()] = null;
            this.f54250 = -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m39746(C16251 c16251) {
        int i;
        C16251 c16252;
        C16251[] c16251Arr = this.f54249;
        m43641();
        if (c16251 == null) {
            throw new NullPointerException("spec == null");
        }
        this.f54250 = -1;
        try {
            int iM38400 = c16251.m38400();
            c16251Arr[iM38400] = c16251;
            if (iM38400 > 0 && (c16252 = c16251Arr[(i = iM38400 - 1)]) != null && c16252.m38396() == 2) {
                c16251Arr[i] = null;
            }
            if (c16251.m38396() == 2) {
                c16251Arr[iM38400 + 1] = null;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("spec.getReg() out of range");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39742(C16956 c16956) {
        C16251 c16251M38395;
        m43641();
        C16251[] c16251Arr = c16956.f54249;
        C16251[] c16251Arr2 = this.f54249;
        int length = c16251Arr2.length;
        int iMin = Math.min(length, c16251Arr.length);
        this.f54250 = -1;
        for (int i = 0; i < iMin; i++) {
            C16251 c16251 = c16251Arr2[i];
            if (c16251 != null && (c16251M38395 = c16251.m38395(c16251Arr[i])) != c16251) {
                c16251Arr2[i] = c16251M38395;
            }
        }
        while (iMin < length) {
            c16251Arr2[iMin] = null;
            iMin++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16956 m39741(int i) {
        C16251[] c16251Arr = this.f54249;
        C16956 c16956 = new C16956(c16251Arr.length + i);
        for (C16251 c16251 : c16251Arr) {
            if (c16251 != null) {
                c16956.m39746(c16251.m38389(i));
            }
        }
        c16956.f54250 = this.f54250;
        if (m43639()) {
            c16956.mo9637();
        }
        return c16956;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16956 m39744() {
        C16251[] c16251Arr = this.f54249;
        C16956 c16956 = new C16956(c16251Arr.length);
        for (C16251 c16251 : c16251Arr) {
            if (c16251 != null) {
                c16956.m39746(c16251);
            }
        }
        c16956.f54250 = this.f54250;
        return c16956;
    }
}
