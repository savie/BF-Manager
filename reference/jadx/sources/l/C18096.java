package l;

/* JADX INFO: renamed from: l.ܿۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18096 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0197 f59217;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f59218;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18842 f59219;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f59221;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f59222;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f59220 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14366 f59223 = new C14366();

    public C18096(C18842 c18842) {
        this.f59219 = c18842;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14366 m42205(int i) {
        int i2;
        int i3;
        C18842 c18842 = this.f59219;
        c18842.m43710(i);
        if (this.f59220 != c18842.f61208 || i < (i3 = this.f59218) || i >= i3 + this.f59217.f1330) {
            C0197 c0197 = c18842.f61207;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                C0197 c0198 = c0197.f1324;
                int i7 = c0198 == null ? 0 : c0198.f1331;
                i2 = i4 + i7;
                if (i < i2) {
                    i5 += c0197.f1329;
                    i6 += c0197.f1325;
                    c0197 = c0198;
                } else {
                    int i8 = c0197.f1330;
                    if (i < i2 + i8) {
                        break;
                    }
                    i4 += i7 + i8;
                    i5 += c0197.f1329;
                    i6 += c0197.f1325;
                    c0197 = c0197.f1326;
                }
            }
            this.f59217 = c0197;
            this.f59218 = i2;
            this.f59222 = i5 + c0197.f1319;
            this.f59221 = i6 + c0197.f1317;
            this.f59220 = c18842.f61208;
        }
        int i9 = i - this.f59218;
        int iM1584 = this.f59217.m1584(i9) + this.f59222;
        C0197 c0199 = this.f59217;
        char[] cArr = c0199.f1320;
        int i10 = cArr != null ? cArr[i9] : c0199.f1323[i9];
        int iM1580 = c0199.m1580(i9) + this.f59221;
        C14366 c14366 = this.f59223;
        c14366.m34800(iM1584, i10 + iM1584, iM1580);
        c14366.m34802(this.f59217.m1583(i9));
        return c14366;
    }
}
