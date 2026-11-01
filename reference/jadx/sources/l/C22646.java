package l;

/* JADX INFO: renamed from: l.᩺֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes.dex */
public final class C22646 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f73780;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f73781;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C14885[] f73782;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f73783;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50180(C22646 c22646, C4651 c4651) {
        c22646.getClass();
        C14885[] c14885Arr = c22646.f73782;
        int length = c14885Arr.length;
        int i = c22646.f73783;
        if (i > -1) {
            length *= -1;
        }
        c4651.m12838(length);
        for (C14885 c14885 : c14885Arr) {
            C14885.m35581(c14885, c4651);
        }
        if (i > -1) {
            c4651.m12842(i);
        }
    }

    public C22646(C14885[] c14885Arr, int i) {
        this.f73782 = c14885Arr;
        this.f73783 = i;
    }

    public C22646(C12063 c12063, C13825 c13825) {
        int iM33641 = c13825.m33641();
        if (iM33641 < 0) {
            this.f73782 = new C14885[iM33641 * (-1)];
        } else {
            this.f73782 = new C14885[iM33641];
        }
        int i = 0;
        while (true) {
            C14885[] c14885Arr = this.f73782;
            if (i >= c14885Arr.length) {
                break;
            }
            try {
                c14885Arr[i] = new C14885(c12063, c13825);
                i++;
            } catch (Exception e) {
                throw C11708.m29248("Error while reading EncodedTypeAddrPair at index " + i, e);
            }
        }
        if (iM33641 <= 0) {
            this.f73783 = c13825.m33647();
        } else {
            this.f73783 = -1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50181() {
        return this.f73783;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50179(C22646 c22646) {
        return c22646.f73780 - c22646.f73781;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50178(int i, int i2, C22646 c22646) {
        c22646.f73780 = i;
        c22646.f73781 = i2;
        C14885[] c14885Arr = c22646.f73782;
        int length = c14885Arr.length;
        int i3 = c22646.f73783;
        if (i3 > -1) {
            length *= -1;
            i += C13530.m33072(i3);
        }
        int iM33056 = C13530.m33056(length) + i;
        for (C14885 c14885 : c14885Arr) {
            iM33056 += C14885.m35580(c14885);
        }
        return iM33056;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (C14885 c14885 : this.f73782) {
            iHashCode = (iHashCode * 31) + c14885.hashCode();
        }
        return (iHashCode * 31) + this.f73783;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22646.class.equals(obj.getClass())) {
            C22646 c22646 = (C22646) obj;
            C14885[] c14885Arr = c22646.f73782;
            C14885[] c14885Arr2 = this.f73782;
            if (c14885Arr2.length == c14885Arr.length && this.f73783 == c22646.f73783) {
                for (int i = 0; i < c14885Arr2.length; i++) {
                    if (!c14885Arr2[i].equals(c14885Arr[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
