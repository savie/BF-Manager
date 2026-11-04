package l;

/* JADX INFO: renamed from: l.ᩳ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L79Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C19072 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f61760;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f61761;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public CharSequence f61762 = "";

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f61763;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f61764;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44172(CharSequence charSequence) {
        this.f61762 = charSequence;
        this.f61764 = 0;
        this.f61763 = 0;
        this.f61761 = 0;
        this.f61760 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7885 m44171(int i) {
        int iMax = Math.max(0, Math.min(i, this.f61762.length()));
        if (iMax < this.f61764) {
            m44172(this.f61762);
        }
        while (true) {
            int i2 = this.f61764;
            if (i2 < iMax) {
                char cCharAt = this.f61762.charAt(i2);
                if (cCharAt == '\n') {
                    int i3 = this.f61764 + 1;
                    this.f61764 = i3;
                    this.f61763++;
                    this.f61761 = i3;
                    this.f61760 = 0;
                } else {
                    int i4 = this.f61764;
                    if (!Character.isLowSurrogate(cCharAt) || i4 <= this.f61761 || !Character.isHighSurrogate(this.f61762.charAt(i4 - 1))) {
                        this.f61760++;
                    }
                    this.f61764++;
                }
            } else {
                return new C7885(this.f61763, this.f61760);
            }
        }
    }
}
