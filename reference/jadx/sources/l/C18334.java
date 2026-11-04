package l;

/* JADX INFO: renamed from: l.ܿ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z71W */
/* JADX INFO: loaded from: classes5.dex */
public final class C18334 implements InterfaceC1181 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f59802;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CharSequence f59803;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f59804;

    public C18334(int i, int i2, CharSequence charSequence) {
        int length = charSequence.length();
        if (i < 0 || i2 > length || i > i2) {
            StringBuilder sbM5126 = C1402.m5126("start = ", i, ", end = ", ", length = ", i2);
            sbM5126.append(length);
            throw new IndexOutOfBoundsException(sbM5126.toString());
        }
        if (charSequence instanceof C18334) {
            C18334 c18334 = (C18334) charSequence;
            this.f59803 = c18334.f59803;
            this.f59804 = c18334.f59804 + i;
        } else {
            this.f59803 = charSequence;
            this.f59804 = i;
        }
        this.f59802 = i2 - i;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f59802;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f59802;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C6934.m19217("index = ", i, i2, ", length = "));
        }
        return this.f59803.charAt(this.f59804 + i);
    }

    @Override // l.InterfaceC1181
    public final int indexOf(char c, int i, int i2) {
        int i3 = this.f59802;
        if (i < 0 || i2 > i3 || i > i2) {
            StringBuilder sbM5126 = C1402.m5126("start = ", i, ", end = ", ", length = ", i2);
            sbM5126.append(i3);
            throw new IndexOutOfBoundsException(sbM5126.toString());
        }
        if (i == i2) {
            return -1;
        }
        CharSequence charSequence = this.f59803;
        boolean z = charSequence instanceof InterfaceC1181;
        int i4 = this.f59804;
        if (!z) {
            while (i < i2) {
                if (charSequence.charAt(i4 + i) == c) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i5 = i + i4;
        int i6 = i2 + i4;
        int iIndexOf = ((InterfaceC1181) charSequence).indexOf(c, i5, i6);
        if (iIndexOf < -1 || (iIndexOf >= 0 && (iIndexOf < i5 || iIndexOf >= i6))) {
            throw new IllegalStateException("Searchable character sequence returned an invalid index");
        }
        if (iIndexOf < 0) {
            return -1;
        }
        return iIndexOf - i4;
    }

    @Override // l.InterfaceC1181
    public final int lastIndexOf(char c, int i, int i2) {
        int i3 = this.f59802;
        if (i < 0 || i2 > i3 || i > i2) {
            StringBuilder sbM5126 = C1402.m5126("start = ", i, ", end = ", ", length = ", i2);
            sbM5126.append(i3);
            throw new IndexOutOfBoundsException(sbM5126.toString());
        }
        if (i != i2) {
            CharSequence charSequence = this.f59803;
            boolean z = charSequence instanceof InterfaceC1181;
            int i4 = this.f59804;
            if (!z) {
                do {
                    i2--;
                    if (i2 >= i) {
                    }
                } while (charSequence.charAt(i4 + i2) != '\n');
                return i2;
            }
            int i5 = i + i4;
            int i6 = i2 + i4;
            int iLastIndexOf = ((InterfaceC1181) charSequence).lastIndexOf('\n', i5, i6);
            if (iLastIndexOf < -1 || (iLastIndexOf >= 0 && (iLastIndexOf < i5 || iLastIndexOf >= i6))) {
                throw new IllegalStateException("Searchable character sequence returned an invalid index");
            }
            if (iLastIndexOf >= 0) {
                return iLastIndexOf - i4;
            }
        }
        return -1;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = this.f59802;
        if (i < 0 || i2 > i3 || i > i2) {
            StringBuilder sbM5126 = C1402.m5126("start = ", i, ", end = ", ", length = ", i2);
            sbM5126.append(i3);
            throw new IndexOutOfBoundsException(sbM5126.toString());
        }
        if (i == 0 && i2 == i3) {
            return this;
        }
        int i4 = this.f59804;
        return new C18334(i + i4, i4 + i2, this.f59803);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.f59802;
        if (i == 0) {
            return "";
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = this.f59803.charAt(this.f59804 + i2);
        }
        return new String(cArr);
    }
}
