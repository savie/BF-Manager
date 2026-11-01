package l;

/* JADX INFO: renamed from: l.ۡᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AWM */
/* JADX INFO: loaded from: classes3.dex */
public final class C9040 implements InterfaceC8334 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f30848;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f30849;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f30850;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f30851;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC8334 interfaceC8334 = (InterfaceC8334) obj;
        if (interfaceC8334 instanceof C19623) {
            return 1;
        }
        if (interfaceC8334 instanceof C9040) {
            C9040 c9040 = (C9040) interfaceC8334;
            int i = -this.f30851.compareTo(c9040.f30851);
            return i == 0 ? -this.f30849.compareTo(c9040.f30849) : i;
        }
        throw new RuntimeException();
    }

    public C9040(String str, String str2, boolean z, boolean z2) {
        if (str == null || str.isEmpty() || str2.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f30851 = str;
        this.f30849 = str2;
        this.f30850 = z;
        this.f30848 = z2;
    }

    @Override // l.InterfaceC8334
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo21763(InterfaceC2916 interfaceC2916, int i, int i2) {
        C18917.m43578(i, i2, interfaceC2916);
        int iM43579 = C18917.m43579(i, i2, interfaceC2916);
        int iM43580 = C18917.m43580(iM43579, i2, interfaceC2916);
        if (iM43579 == iM43580) {
            return true;
        }
        int i3 = iM43580 - iM43579;
        String str = this.f30851;
        int length = str.length();
        String str2 = this.f30849;
        if (i3 < str2.length() + length) {
            return false;
        }
        String string = interfaceC2916.subSequence(iM43579, str.length() + iM43579).toString();
        String string2 = interfaceC2916.subSequence(iM43580 - str2.length(), iM43580).toString();
        if (this.f30848) {
            return string.equalsIgnoreCase(str) && string2.equalsIgnoreCase(str2);
        }
        return string.equals(str) && string2.equals(str2);
    }

    @Override // l.InterfaceC8334
    /* JADX INFO: renamed from: ܰ */
    public final int mo21764(C16031 c16031, int i, int i2, int[] iArr) {
        C18917.m43578(i, i2, c16031);
        int iM43579 = C18917.m43579(i, i2, c16031);
        int iM43580 = C18917.m43580(iM43579, i2, c16031);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30851);
        boolean z = this.f30850;
        sb.append(z ? " " : "");
        String string = sb.toString();
        String strConcat = (z ? " " : "").concat(this.f30849);
        c16031.m38022(iM43579, 0, string.length(), string);
        int length = string.length();
        int i3 = iM43580 + length;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 >= iM43579) {
                iArr[i4] = i5 + length;
            }
        }
        c16031.m38022(i3, 0, strConcat.length(), strConcat);
        int length2 = strConcat.length();
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 > i3) {
                iArr[i6] = i7 + length2;
            }
        }
        return length + length2;
    }

    @Override // l.InterfaceC8334
    /* JADX INFO: renamed from: ۙ */
    public final int mo21762(C16031 c16031, int i, int i2, int[] iArr) {
        C18917.m43578(i, i2, c16031);
        int iM43579 = C18917.m43579(i, i2, c16031);
        int iM43580 = C18917.m43580(iM43579, i2, c16031);
        int i3 = iM43580 - iM43579;
        String str = this.f30851;
        int length = str.length();
        String str2 = this.f30849;
        int length2 = str2.length() + length;
        if (i3 >= length2) {
            String string = c16031.subSequence(iM43579, str.length() + iM43579).toString();
            String string2 = c16031.subSequence(iM43580 - str2.length(), iM43580).toString();
            if (!this.f30848 ? !(!string.equals(str) || !string2.equals(str2)) : !(!string.equalsIgnoreCase(str) || !string2.equalsIgnoreCase(str2))) {
                int length3 = str.length() + iM43579;
                int length4 = iM43580 - str2.length();
                boolean z = this.f30850;
                if (z && length3 < length4 && c16031.charAt(length3) == ' ') {
                    length3++;
                }
                if (z && length3 < length4 && c16031.charAt(length4 - 1) == ' ') {
                    length4--;
                }
                c16031.delete(iM43579, length3);
                int i4 = length3 - iM43579;
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    int i6 = iArr[i5];
                    if (i6 > iM43579) {
                        iArr[i5] = i6 - Math.min(i4, i6 - iM43579);
                    }
                }
                int i7 = length4 - i4;
                int i8 = iM43580 - i4;
                c16031.delete(i7, i8);
                int i9 = i8 - i7;
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    int i11 = iArr[i10];
                    if (i11 > i7) {
                        iArr[i10] = i11 - Math.min(i9, i11 - i7);
                    }
                }
                return i4 + i9;
            }
        }
        return 0;
    }

    public final String toString() {
        return "{start='" + this.f30851 + "', end='" + this.f30849 + "', addBlank=" + this.f30850 + '}';
    }
}
