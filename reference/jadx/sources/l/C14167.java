package l;

/* JADX INFO: renamed from: l.۬᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14167 implements InterfaceC7456 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f44793;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f44794;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f44795;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC7456 interfaceC7456 = (InterfaceC7456) obj;
        if (interfaceC7456 instanceof C4628) {
            return 1;
        }
        if (interfaceC7456 instanceof C14167) {
            return -this.f44793.compareTo(((C14167) interfaceC7456).f44793);
        }
        throw new RuntimeException();
    }

    public C14167(String str, boolean z, boolean z2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f44793 = str;
        this.f44794 = z;
        this.f44795 = z2;
    }

    @Override // l.InterfaceC7456
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo14441(InterfaceC19106 interfaceC19106, int i, int i2) {
        C8947.m23912(i, i2, interfaceC19106);
        int iM23914 = C8947.m23914(i, i2, interfaceC19106);
        if (iM23914 == i2) {
            return true;
        }
        int i3 = i2 - iM23914;
        String str = this.f44793;
        if (i3 < str.length()) {
            return false;
        }
        String string = interfaceC19106.subSequence(iM23914, str.length() + iM23914).toString();
        if (this.f44795) {
            return string.equalsIgnoreCase(str);
        }
        return string.equals(str);
    }

    @Override // l.InterfaceC7456
    /* JADX INFO: renamed from: ᩷ */
    public final int mo14442(C10375 c10375, int i, int i2, int[] iArr) {
        C8947.m23912(i, i2, c10375);
        int iM23914 = C8947.m23914(i, i2, c10375);
        if (iM23914 == i2) {
            return 0;
        }
        boolean z = this.f44794;
        String strM34972 = this.f44793;
        if (z) {
            strM34972 = C14483.m34972(strM34972, " ");
        }
        c10375.m26682(iM23914, 0, strM34972.length(), strM34972);
        int length = strM34972.length();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            if (i4 >= iM23914) {
                iArr[i3] = i4 + length;
            }
        }
        return length;
    }

    @Override // l.InterfaceC7456
    /* JADX INFO: renamed from: ۙ */
    public final int mo14440(C10375 c10375, int i, int i2, int[] iArr) {
        C8947.m23912(i, i2, c10375);
        int iM23914 = C8947.m23914(i, i2, c10375);
        String str = this.f44793;
        int length = str.length() + iM23914;
        if (length <= i2) {
            String string = c10375.subSequence(iM23914, length).toString();
            if (!this.f44795 ? string.equals(str) : string.equalsIgnoreCase(str)) {
                if (length != i2 && c10375.charAt(length) == ' ') {
                    length++;
                }
                c10375.delete(iM23914, length);
                int i3 = length - iM23914;
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    int i5 = iArr[i4];
                    if (i5 > iM23914) {
                        iArr[i4] = i5 - Math.min(i3, i5 - iM23914);
                    }
                }
                return i3;
            }
        }
        return 0;
    }

    public final String toString() {
        return "{start='" + this.f44793 + "', insertSpace=" + this.f44794 + '}';
    }
}
