package l;

/* JADX INFO: renamed from: l.᩹᩸ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes.dex */
public final class C23834 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f77186;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f77187;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3696 f77188;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f77189;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11899 f77190;

    public C23834(C3696 c3696, AbstractC2205 abstractC2205) {
        this.f77188 = c3696;
        try {
            this.f77190 = new C11899(c3696, (AbstractC2205) ((C5188) c3696.m12009()).get(abstractC2205.mo7530()));
            int iMo7533 = abstractC2205.mo7533();
            this.f77187 = iMo7533;
            int iMo7532 = abstractC2205.mo7532();
            this.f77189 = iMo7532;
            int iMo7531 = abstractC2205.mo7531() / iMo7532;
            this.f77186 = iMo7531;
            if ((iMo7531 * iMo7532) + iMo7533 > c3696.length()) {
                throw new C11153("Symbol table extends past end of file");
            }
        } catch (IndexOutOfBoundsException unused) {
            throw new C11153("String table section index is invalid");
        }
    }
}
