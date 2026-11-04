package l;

/* JADX INFO: renamed from: l.ۛܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: T70E */
/* JADX INFO: loaded from: classes3.dex */
public final class C6491 implements InterfaceC1181 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CharSequence f21809;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24391 f21810;

    @Override // l.InterfaceC1181
    public final int lastIndexOf(char c, int i, int i2) {
        int iMax = Math.max(0, i);
        int iMin = Math.min(this.f21810.f79120, i2);
        while (iMin > iMax) {
            iMin--;
            if (charAt(iMin) == '\n') {
                return iMin;
            }
        }
        return -1;
    }

    public C6491(C24391 c24391, CharSequence charSequence) {
        this.f21810 = c24391;
        this.f21809 = charSequence;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f21810.f79120;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        char cCharAt = this.f21809.charAt(i);
        C24391.m54506(this.f21810, i, i + 1);
        return cCharAt;
    }

    @Override // l.InterfaceC1181
    public final int indexOf(char c, int i, int i2) {
        int iMax = Math.max(0, i);
        C24391 c24391 = this.f21810;
        int iMin = Math.min(c24391.f79120, i2);
        int i3 = -1;
        if (iMax >= iMin) {
            return -1;
        }
        CharSequence charSequence = this.f21809;
        if (charSequence instanceof InterfaceC1181) {
            int iIndexOf = ((InterfaceC1181) charSequence).indexOf(c, iMax, iMin);
            if (iIndexOf < -1 || (iIndexOf >= 0 && (iIndexOf < iMax || iIndexOf >= iMin))) {
                throw new IllegalStateException("Searchable syntax text returned an invalid index");
            }
            i3 = iIndexOf;
        } else {
            for (int i4 = iMax; i4 < iMin; i4++) {
                if (charSequence.charAt(i4) == c) {
                    i3 = i4;
                    break;
                }
            }
        }
        if (i3 >= 0) {
            iMin = i3 + 1;
        }
        C24391.m54506(c24391, iMax, iMin);
        return i3;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C18334(i, i2, this);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        CharSequence charSequence = this.f21809;
        boolean z = charSequence instanceof String;
        C24391 c24391 = this.f21810;
        if (z) {
            String str = (String) charSequence;
            C24391.m54506(c24391, 0, c24391.f79120);
            return str;
        }
        return new C18334(0, c24391.f79120, this).toString();
    }
}
