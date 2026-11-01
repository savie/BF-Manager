package l;

/* JADX INFO: renamed from: l.۫ۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12188 implements InterfaceC19010 {
    @Override // l.InterfaceC19010
    public final boolean apply(Object obj) {
        InterfaceC0723 interfaceC0723 = (InterfaceC0723) obj;
        if (!(interfaceC0723 instanceof InterfaceC5433)) {
            return false;
        }
        InterfaceC22510 interfaceC22510M30935 = C12457.m30935((InterfaceC5433) interfaceC0723);
        InterfaceC5046 interfaceC5046Of = C11397.of((Object[]) new String[]{"stream", "parallelStream", "toBuilder"});
        C13638.requireNonNull(interfaceC22510M30935);
        return interfaceC5046Of.anyMatch(new C18402(1, interfaceC22510M30935));
    }
}
