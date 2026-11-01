package l;

/* JADX INFO: renamed from: l.ۗܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: T70E */
/* JADX INFO: loaded from: classes2.dex */
public final class C3311 implements InterfaceC1976 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final CharSequence f12231;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4910 f12232;

    @Override // l.InterfaceC1976
    public final int lastIndexOf(char c, int i, int i2) {
        int iMax = Math.max(0, i);
        int iMin = Math.min(this.f12232.f17219, i2);
        while (iMin > iMax) {
            iMin--;
            if (charAt(iMin) == '\n') {
                return iMin;
            }
        }
        return -1;
    }

    public C3311(C4910 c4910, CharSequence charSequence) {
        this.f12232 = c4910;
        this.f12231 = charSequence;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f12232.f17219;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        char cCharAt = this.f12231.charAt(i);
        C4910.m13644(this.f12232, i, i + 1);
        return cCharAt;
    }

    @Override // l.InterfaceC1976
    public final int indexOf(char c, int i, int i2) {
        int iMax = Math.max(0, i);
        C4910 c4910 = this.f12232;
        int iMin = Math.min(c4910.f17219, i2);
        int i3 = -1;
        if (iMax >= iMin) {
            return -1;
        }
        CharSequence charSequence = this.f12231;
        if (charSequence instanceof InterfaceC1976) {
            int iIndexOf = ((InterfaceC1976) charSequence).indexOf(c, iMax, iMin);
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
        C4910.m13644(c4910, iMax, iMin);
        return i3;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C17499(i, i2, this);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        CharSequence charSequence = this.f12231;
        boolean z = charSequence instanceof String;
        C4910 c4910 = this.f12232;
        if (z) {
            String str = (String) charSequence;
            C4910.m13644(c4910, 0, c4910.f17219);
            return str;
        }
        return new C17499(0, c4910.f17219, this).toString();
    }
}
