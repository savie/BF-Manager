package l;

/* JADX INFO: renamed from: l.ܰۚܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13615 extends AbstractC2324 implements Comparable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f44920;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f44921;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f44922;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f44923;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f44924;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f44925;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f44926;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f44927;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f44928;

    @Override // l.AbstractC2324
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ boolean mo3635(AbstractC2324 abstractC2324) {
        return false;
    }

    public C13615(int i, C17216 c17216, int i2, C1536 c1536, int i3, String str, String str2) {
        AbstractC22433 abstractC22433Of;
        int iM31987;
        super(i, c17216, i2);
        int i4 = 0;
        this.f44924 = C13958.m33815(i3, false);
        int i5 = this.f8252.f25243;
        int i6 = c1536.f47171;
        AbstractC22433 abstractC22433 = c1536.f47185;
        int i7 = i5 & (~i6);
        this.f44927 = (i7 & 1) != 0;
        this.f44922 = (i7 & 2) != 0;
        if (str2 != null) {
            abstractC22433Of = AbstractC22433.of((Object) str2);
        } else {
            abstractC22433Of = abstractC22433.isEmpty() ? AbstractC22433.of((Object) "") : abstractC22433;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= abstractC22433Of.size()) {
                i8 = Integer.MAX_VALUE;
                iM31987 = 0;
                break;
            } else {
                iM31987 = C12909.m31987(this.f8252, (String) abstractC22433Of.get(i8), c1536.f47187);
                if (iM31987 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f44928 = i8;
        this.f44926 = iM31987;
        int i9 = str2 != null ? 1088 : c1536.f47191;
        int i10 = this.f8252.f25244;
        int i11 = C12909.f42906;
        int iBitCount = (i10 == 0 || i10 != i9) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.f44920 = iBitCount;
        this.f44925 = (1088 & this.f8252.f25244) != 0;
        int iM31988 = C12909.m31987(this.f8252, str, C12909.m31989(str) == null);
        this.f44923 = iM31988;
        boolean z = iM31987 > 0 || (abstractC22433.isEmpty() && iBitCount > 0) || this.f44927 || (this.f44922 && iM31988 > 0);
        if (C13958.m33815(i3, c1536.f6243) && z) {
            i4 = 1;
        }
        this.f44921 = i4;
    }

    @Override // l.AbstractC2324
    /* JADX INFO: renamed from: ۙ */
    public final int mo3634() {
        return this.f44921;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C13615 c13615) {
        AbstractC13116 abstractC13116Mo4145 = AbstractC13116.m32469().mo4146(this.f44924, c13615.f44924).mo4145(Integer.valueOf(this.f44928), Integer.valueOf(c13615.f44928), AbstractC10959.m27714().mo27718());
        int i = c13615.f44926;
        int i2 = this.f44926;
        AbstractC13116 abstractC13116Mo4143 = abstractC13116Mo4145.mo4143(i2, i);
        int i3 = c13615.f44920;
        int i4 = this.f44920;
        AbstractC13116 abstractC13116Mo4144 = abstractC13116Mo4143.mo4143(i4, i3).mo4146(this.f44927, c13615.f44927).mo4145(Boolean.valueOf(this.f44922), Boolean.valueOf(c13615.f44922), i2 == 0 ? AbstractC10959.m27714() : AbstractC10959.m27714().mo27718()).mo4143(this.f44923, c13615.f44923);
        if (i4 == 0) {
            abstractC13116Mo4144 = abstractC13116Mo4144.mo4147(this.f44925, c13615.f44925);
        }
        return abstractC13116Mo4144.mo4142();
    }
}
