package l;

/* JADX INFO: renamed from: l.۠ܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes3.dex */
public final class C8766 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f28498;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f28499;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C7275 f28500;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f28501;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final char[] f28502;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f28503;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f28504;

    public C8766(String str, C7275 c7275) {
        this.f28501 = str;
        this.f28500 = c7275;
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
        this.f28498 = iArr;
        this.f28502 = new char[str.length()];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23461() {
        m23460(0);
        this.f28504 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23462(char c) {
        String str;
        int i = this.f28499;
        char[] cArr = this.f28502;
        if (i == cArr.length) {
            throw new IllegalStateException("Separator matcher buffer is full");
        }
        int length = this.f28503 + i;
        if (length >= cArr.length) {
            length -= cArr.length;
        }
        cArr[length] = c;
        this.f28499 = i + 1;
        while (true) {
            int i2 = this.f28504;
            str = this.f28501;
            if (i2 <= 0 || str.charAt(i2) == c) {
                break;
            }
            this.f28504 = this.f28498[this.f28504 - 1];
        }
        if (str.charAt(this.f28504) == c) {
            this.f28504++;
        }
        if (this.f28504 != str.length()) {
            m23460(this.f28504);
            return;
        }
        this.f28503 = 0;
        this.f28499 = 0;
        this.f28500.m19917(str);
        this.f28504 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23460(int i) {
        while (true) {
            int i2 = this.f28499;
            if (i2 <= i) {
                return;
            }
            if (i2 == 0) {
                throw new IllegalStateException("Separator matcher buffer is empty");
            }
            int i3 = this.f28503;
            char[] cArr = this.f28502;
            char c = cArr[i3];
            int i4 = i3 + 1;
            if (i4 == cArr.length) {
                i4 = 0;
            }
            this.f28503 = i4;
            this.f28499 = i2 - 1;
            this.f28500.m19916(c);
        }
    }
}
