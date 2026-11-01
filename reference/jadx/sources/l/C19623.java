package l;

/* JADX INFO: renamed from: l.᩵ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWL */
/* JADX INFO: loaded from: classes5.dex */
public final class C19623 implements InterfaceC8334 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f62984;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f62985;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f62986;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC8334 interfaceC8334 = (InterfaceC8334) obj;
        if (interfaceC8334 instanceof C9040) {
            return 1;
        }
        if (interfaceC8334 instanceof C19623) {
            return -this.f62985.compareTo(((C19623) interfaceC8334).f62985);
        }
        throw new RuntimeException();
    }

    public C19623(String str, boolean z, boolean z2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f62985 = str;
        this.f62984 = z;
        this.f62986 = z2;
    }

    @Override // l.InterfaceC8334
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo21763(InterfaceC2916 interfaceC2916, int i, int i2) {
        C18917.m43578(i, i2, interfaceC2916);
        int iM43579 = C18917.m43579(i, i2, interfaceC2916);
        if (iM43579 == i2) {
            return true;
        }
        int i3 = i2 - iM43579;
        String str = this.f62985;
        if (i3 < str.length()) {
            return false;
        }
        String string = interfaceC2916.subSequence(iM43579, str.length() + iM43579).toString();
        if (this.f62986) {
            return string.equalsIgnoreCase(str);
        }
        return string.equals(str);
    }

    @Override // l.InterfaceC8334
    /* JADX INFO: renamed from: ܰ */
    public final int mo21764(C16031 c16031, int i, int i2, int[] iArr) {
        C18917.m43578(i, i2, c16031);
        int iM43579 = C18917.m43579(i, i2, c16031);
        if (iM43579 == i2) {
            return 0;
        }
        boolean z = this.f62984;
        String strM37076 = this.f62985;
        if (z) {
            strM37076 = C15489.m37076(strM37076, " ");
        }
        c16031.m38022(iM43579, 0, strM37076.length(), strM37076);
        int length = strM37076.length();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            if (i4 >= iM43579) {
                iArr[i3] = i4 + length;
            }
        }
        return length;
    }

    @Override // l.InterfaceC8334
    /* JADX INFO: renamed from: ۙ */
    public final int mo21762(C16031 c16031, int i, int i2, int[] iArr) {
        C18917.m43578(i, i2, c16031);
        int iM43579 = C18917.m43579(i, i2, c16031);
        String str = this.f62985;
        int length = str.length() + iM43579;
        if (length <= i2) {
            String string = c16031.subSequence(iM43579, length).toString();
            if (!this.f62986 ? string.equals(str) : string.equalsIgnoreCase(str)) {
                if (length != i2 && c16031.charAt(length) == ' ') {
                    length++;
                }
                c16031.delete(iM43579, length);
                int i3 = length - iM43579;
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    int i5 = iArr[i4];
                    if (i5 > iM43579) {
                        iArr[i4] = i5 - Math.min(i3, i5 - iM43579);
                    }
                }
                return i3;
            }
        }
        return 0;
    }

    public final String toString() {
        return "{start='" + this.f62985 + "', insertSpace=" + this.f62984 + '}';
    }
}
