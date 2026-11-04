package l;

/* JADX INFO: renamed from: l.۠ۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C92A */
/* JADX INFO: loaded from: classes4.dex */
public final class C8329 extends C13461 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C8329 f27318 = new C8329();

    @Override // l.C13461
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 mo22441(InterfaceC2386 interfaceC2386) {
        int iIndexOf;
        AbstractC22044 abstractC22044Mo8093 = interfaceC2386.mo8093();
        String strMo4294 = abstractC22044Mo8093.mo4294();
        return (!strMo4294.startsWith("/data/media/") || (iIndexOf = strMo4294.indexOf(47, 12) + 1) == 0) ? abstractC22044Mo8093 : C6382.f21566.m49876(strMo4294.substring(iIndexOf));
    }
}
