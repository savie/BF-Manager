package l;

/* JADX INFO: renamed from: l.ۙۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AWM */
/* JADX INFO: loaded from: classes3.dex */
public final class C4628 implements InterfaceC7456 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f16387;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f16388;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f16389;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f16390;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC7456 interfaceC7456 = (InterfaceC7456) obj;
        if (interfaceC7456 instanceof C14167) {
            return 1;
        }
        if (interfaceC7456 instanceof C4628) {
            C4628 c4628 = (C4628) interfaceC7456;
            int i = -this.f16390.compareTo(c4628.f16390);
            return i == 0 ? -this.f16388.compareTo(c4628.f16388) : i;
        }
        throw new RuntimeException();
    }

    public C4628(String str, String str2, boolean z, boolean z2) {
        if (str == null || str.isEmpty() || str2.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f16390 = str;
        this.f16388 = str2;
        this.f16387 = z;
        this.f16389 = z2;
    }

    @Override // l.InterfaceC7456
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo14441(InterfaceC19106 interfaceC19106, int i, int i2) {
        C8947.m23912(i, i2, interfaceC19106);
        int iM23914 = C8947.m23914(i, i2, interfaceC19106);
        int iM23915 = C8947.m23915(iM23914, i2, interfaceC19106);
        if (iM23914 == iM23915) {
            return true;
        }
        int i3 = iM23915 - iM23914;
        String str = this.f16390;
        int length = str.length();
        String str2 = this.f16388;
        if (i3 < str2.length() + length) {
            return false;
        }
        String string = interfaceC19106.subSequence(iM23914, str.length() + iM23914).toString();
        String string2 = interfaceC19106.subSequence(iM23915 - str2.length(), iM23915).toString();
        if (this.f16389) {
            return string.equalsIgnoreCase(str) && string2.equalsIgnoreCase(str2);
        }
        return string.equals(str) && string2.equals(str2);
    }

    @Override // l.InterfaceC7456
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo14442(C10375 c10375, int i, int i2, int[] iArr) {
        C8947.m23912(i, i2, c10375);
        int iM23914 = C8947.m23914(i, i2, c10375);
        int iM23915 = C8947.m23915(iM23914, i2, c10375);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16390);
        boolean z = this.f16387;
        sb.append(z ? " " : "");
        String string = sb.toString();
        String strConcat = (z ? " " : "").concat(this.f16388);
        c10375.m26682(iM23914, 0, string.length(), string);
        int length = string.length();
        int i3 = iM23915 + length;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 >= iM23914) {
                iArr[i4] = i5 + length;
            }
        }
        c10375.m26682(i3, 0, strConcat.length(), strConcat);
        int length2 = strConcat.length();
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 > i3) {
                iArr[i6] = i7 + length2;
            }
        }
        return length + length2;
    }

    @Override // l.InterfaceC7456
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo14440(C10375 c10375, int i, int i2, int[] iArr) {
        C8947.m23912(i, i2, c10375);
        int iM23914 = C8947.m23914(i, i2, c10375);
        int iM23915 = C8947.m23915(iM23914, i2, c10375);
        int i3 = iM23915 - iM23914;
        String str = this.f16390;
        int length = str.length();
        String str2 = this.f16388;
        int length2 = str2.length() + length;
        if (i3 >= length2) {
            String string = c10375.subSequence(iM23914, str.length() + iM23914).toString();
            String string2 = c10375.subSequence(iM23915 - str2.length(), iM23915).toString();
            if (!this.f16389 ? !(!string.equals(str) || !string2.equals(str2)) : !(!string.equalsIgnoreCase(str) || !string2.equalsIgnoreCase(str2))) {
                int length3 = str.length() + iM23914;
                int length4 = iM23915 - str2.length();
                boolean z = this.f16387;
                if (z && length3 < length4 && c10375.charAt(length3) == ' ') {
                    length3++;
                }
                if (z && length3 < length4 && c10375.charAt(length4 - 1) == ' ') {
                    length4--;
                }
                c10375.delete(iM23914, length3);
                int i4 = length3 - iM23914;
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    int i6 = iArr[i5];
                    if (i6 > iM23914) {
                        iArr[i5] = i6 - Math.min(i4, i6 - iM23914);
                    }
                }
                int i7 = length4 - i4;
                int i8 = iM23915 - i4;
                c10375.delete(i7, i8);
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
        return "{start='" + this.f16390 + "', end='" + this.f16388 + "', addBlank=" + this.f16387 + '}';
    }
}
