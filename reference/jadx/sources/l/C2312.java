package l;

/* JADX INFO: renamed from: l.ۖۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes2.dex */
public final class C2312 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C5135 f8227;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f8228;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f8229;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final char[] f8230;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f8231;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f8232;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f8233;

    public C2312(String str, C5135 c5135) {
        this.f8233 = str;
        this.f8227 = c5135;
        int[] iArr = new int[str.length()];
        int i = 0;
        for (int i2 = 1; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            while (i > 0 && str.charAt(i) != cCharAt) {
                i = iArr[i - 1];
            }
            if (str.charAt(i) == cCharAt) {
                i++;
            }
            iArr[i2] = i;
        }
        this.f8229 = iArr;
        this.f8230 = new char[str.length()];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7054() {
        m7053(0);
        this.f8228 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7055(char c) {
        String str;
        int i = this.f8231;
        char[] cArr = this.f8230;
        if (i == cArr.length) {
            throw new IllegalStateException("Separator matcher buffer is full");
        }
        int length = this.f8232 + i;
        if (length >= cArr.length) {
            length -= cArr.length;
        }
        cArr[length] = c;
        this.f8231 = i + 1;
        while (true) {
            int i2 = this.f8228;
            str = this.f8233;
            if (i2 <= 0 || str.charAt(i2) == c) {
                break;
            }
            this.f8228 = this.f8229[this.f8228 - 1];
        }
        if (str.charAt(this.f8228) == c) {
            this.f8228++;
        }
        if (this.f8228 != str.length()) {
            m7053(this.f8228);
            return;
        }
        this.f8232 = 0;
        this.f8231 = 0;
        this.f8227.m14293(str);
        this.f8228 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m7053(int i) {
        while (true) {
            int i2 = this.f8231;
            if (i2 <= i) {
                return;
            }
            if (i2 == 0) {
                throw new IllegalStateException("Separator matcher buffer is empty");
            }
            int i3 = this.f8232;
            char[] cArr = this.f8230;
            char c = cArr[i3];
            int i4 = i3 + 1;
            if (i4 == cArr.length) {
                i4 = 0;
            }
            this.f8232 = i4;
            this.f8231 = i2 - 1;
            this.f8227.m14292(c);
        }
    }
}
