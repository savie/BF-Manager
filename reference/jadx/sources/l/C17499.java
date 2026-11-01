package l;

/* JADX INFO: renamed from: l.ܿܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Z71W */
/* JADX INFO: loaded from: classes5.dex */
public final class C17499 implements InterfaceC1976 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final CharSequence f55653;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f55654;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f55655;

    public C17499(int i, int i2, CharSequence charSequence) {
        int length = charSequence.length();
        if (i < 0 || i2 > length || i > i2) {
            StringBuilder sbM2791 = C0589.m2791("start = ", i, ", end = ", ", length = ", i2);
            sbM2791.append(length);
            throw new IndexOutOfBoundsException(sbM2791.toString());
        }
        if (charSequence instanceof C17499) {
            C17499 c17499 = (C17499) charSequence;
            this.f55653 = c17499.f55653;
            this.f55655 = c17499.f55655 + i;
        } else {
            this.f55653 = charSequence;
            this.f55655 = i;
        }
        this.f55654 = i2 - i;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f55654;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f55654;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C2271.m6967("index = ", i, i2, ", length = "));
        }
        return this.f55653.charAt(this.f55655 + i);
    }

    @Override // l.InterfaceC1976
    public final int indexOf(char c, int i, int i2) {
        int i3 = this.f55654;
        if (i < 0 || i2 > i3 || i > i2) {
            StringBuilder sbM2791 = C0589.m2791("start = ", i, ", end = ", ", length = ", i2);
            sbM2791.append(i3);
            throw new IndexOutOfBoundsException(sbM2791.toString());
        }
        if (i == i2) {
            return -1;
        }
        CharSequence charSequence = this.f55653;
        boolean z = charSequence instanceof InterfaceC1976;
        int i4 = this.f55655;
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
        int iIndexOf = ((InterfaceC1976) charSequence).indexOf(c, i5, i6);
        if (iIndexOf < -1 || (iIndexOf >= 0 && (iIndexOf < i5 || iIndexOf >= i6))) {
            throw new IllegalStateException("Searchable character sequence returned an invalid index");
        }
        if (iIndexOf < 0) {
            return -1;
        }
        return iIndexOf - i4;
    }

    @Override // l.InterfaceC1976
    public final int lastIndexOf(char c, int i, int i2) {
        int i3 = this.f55654;
        if (i < 0 || i2 > i3 || i > i2) {
            StringBuilder sbM2791 = C0589.m2791("start = ", i, ", end = ", ", length = ", i2);
            sbM2791.append(i3);
            throw new IndexOutOfBoundsException(sbM2791.toString());
        }
        if (i != i2) {
            CharSequence charSequence = this.f55653;
            boolean z = charSequence instanceof InterfaceC1976;
            int i4 = this.f55655;
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
            int iLastIndexOf = ((InterfaceC1976) charSequence).lastIndexOf('\n', i5, i6);
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
        int i3 = this.f55654;
        if (i < 0 || i2 > i3 || i > i2) {
            StringBuilder sbM2791 = C0589.m2791("start = ", i, ", end = ", ", length = ", i2);
            sbM2791.append(i3);
            throw new IndexOutOfBoundsException(sbM2791.toString());
        }
        if (i == 0 && i2 == i3) {
            return this;
        }
        int i4 = this.f55655;
        return new C17499(i + i4, i4 + i2, this.f55653);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.f55654;
        if (i == 0) {
            return "";
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = this.f55653.charAt(this.f55655 + i2);
        }
        return new String(cArr);
    }
}
