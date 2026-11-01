package l;

/* JADX INFO: renamed from: l.֫ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes2.dex */
public final class C1891 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17414 f7133;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f7134;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9654 f7135;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f7136;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f7137;

    public C1891(C9654 c9654, AbstractC12476 abstractC12476) {
        this.f7135 = c9654;
        try {
            this.f7133 = new C17414(c9654, (AbstractC12476) ((C8948) c9654.m24547()).get(abstractC12476.mo2352()));
            int iMo2349 = abstractC12476.mo2349();
            this.f7136 = iMo2349;
            int iMo2353 = abstractC12476.mo2353();
            this.f7137 = iMo2353;
            int iMo2351 = abstractC12476.mo2351() / iMo2353;
            this.f7134 = iMo2351;
            if ((iMo2351 * iMo2353) + iMo2349 > c9654.length()) {
                throw new C7536("Symbol table extends past end of file");
            }
        } catch (IndexOutOfBoundsException unused) {
            throw new C7536("String table section index is invalid");
        }
    }
}
