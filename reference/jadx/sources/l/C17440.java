package l;

/* JADX INFO: renamed from: l.ܿܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C92A */
/* JADX INFO: loaded from: classes5.dex */
public final class C17440 extends C3971 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C17440 f55541 = new C17440();

    @Override // l.C3971
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC20745 mo11463(InterfaceC2557 interfaceC2557) {
        int iIndexOf;
        AbstractC20745 abstractC20745Mo7989 = interfaceC2557.mo7989();
        String strMo33986 = abstractC20745Mo7989.mo33986();
        return (!strMo33986.startsWith("/data/media/") || (iIndexOf = strMo33986.indexOf(47, 12) + 1) == 0) ? abstractC20745Mo7989 : C11904.f39934.m46690(strMo33986.substring(iIndexOf));
    }
}
