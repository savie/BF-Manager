package l;

/* JADX INFO: renamed from: l.ۘ۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes2.dex */
public final class C3953 implements InterfaceC3639 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8894 f14698;

    public C3953(AbstractC8894 abstractC8894) {
        this.f14698 = abstractC8894;
    }

    @Override // l.InterfaceC3639
    /* JADX INFO: renamed from: ۙ */
    public final void mo10739(Object obj) {
        C12813 c12813 = (C12813) obj;
        AbstractC8894 abstractC8894 = this.f14698;
        C18065 c18065 = (C18065) abstractC8894.f30497.pollFirst();
        if (c18065 == null) {
            return;
        }
        String str = c18065.f57776;
        int i = c18065.f57775;
        ComponentCallbacksC22654 componentCallbacksC22654M34976 = abstractC8894.f30509.m34976(str);
        if (componentCallbacksC22654M34976 == null) {
            return;
        }
        componentCallbacksC22654M34976.onActivityResult(i, c12813.m31806(), c12813.m31805());
    }
}
