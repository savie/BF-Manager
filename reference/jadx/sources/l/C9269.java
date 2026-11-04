package l;

/* JADX INFO: renamed from: l.ۡۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes3.dex */
public final class C9269 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f30149;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2558[] f30150;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f30151;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f30152;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24458(C9269 c9269, C24166 c24166) {
        c9269.getClass();
        C2558[] c2558Arr = c9269.f30150;
        int length = c2558Arr.length;
        int i = c9269.f30151;
        if (i > -1) {
            length *= -1;
        }
        c24166.m54136(length);
        for (C2558 c2558 : c2558Arr) {
            C2558.m8592(c2558, c24166);
        }
        if (i > -1) {
            c24166.m54135(i);
        }
    }

    public C9269(C2558[] c2558Arr, int i) {
        this.f30150 = c2558Arr;
        this.f30151 = i;
    }

    public C9269(C24738 c24738, C4028 c4028) {
        int iM12999 = c4028.m12999();
        if (iM12999 < 0) {
            this.f30150 = new C2558[iM12999 * (-1)];
        } else {
            this.f30150 = new C2558[iM12999];
        }
        int i = 0;
        while (true) {
            C2558[] c2558Arr = this.f30150;
            if (i >= c2558Arr.length) {
                break;
            }
            try {
                c2558Arr[i] = new C2558(c24738, c4028);
                i++;
            } catch (Exception e) {
                throw C14468.m34931("Error while reading EncodedTypeAddrPair at index " + i, e);
            }
        }
        if (iM12999 <= 0) {
            this.f30151 = c4028.m12998();
        } else {
            this.f30151 = -1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24459() {
        return this.f30151;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24457(C9269 c9269) {
        return c9269.f30152 - c9269.f30149;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24456(int i, int i2, C9269 c9269) {
        c9269.f30152 = i;
        c9269.f30149 = i2;
        C2558[] c2558Arr = c9269.f30150;
        int length = c2558Arr.length;
        int i3 = c9269.f30151;
        if (i3 > -1) {
            length *= -1;
            i += C6929.m19213(i3);
        }
        int iM19207 = C6929.m19207(length) + i;
        for (C2558 c2558 : c2558Arr) {
            iM19207 += C2558.m8591(c2558);
        }
        return iM19207;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (C2558 c2558 : this.f30150) {
            iHashCode = (iHashCode * 31) + c2558.hashCode();
        }
        return (iHashCode * 31) + this.f30151;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9269.class.equals(obj.getClass())) {
            C9269 c9269 = (C9269) obj;
            C2558[] c2558Arr = c9269.f30150;
            C2558[] c2558Arr2 = this.f30150;
            if (c2558Arr2.length == c2558Arr.length && this.f30151 == c9269.f30151) {
                for (int i = 0; i < c2558Arr2.length; i++) {
                    if (!c2558Arr2[i].equals(c2558Arr[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
