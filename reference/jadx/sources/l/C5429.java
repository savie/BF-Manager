package l;

/* JADX INFO: renamed from: l.ۚۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes3.dex */
public final class C5429 implements InterfaceC25320 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3191 f18920;

    public C5429(AbstractC3191 abstractC3191) {
        this.f18920 = abstractC3191;
    }

    @Override // l.InterfaceC25320
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo16160(Object obj) {
        C11893 c11893 = (C11893) obj;
        AbstractC3191 abstractC3191 = this.f18920;
        C16615 c16615 = (C16615) abstractC3191.f10389.pollFirst();
        if (c16615 == null) {
            return;
        }
        String str = c16615.f53736;
        int i = c16615.f53735;
        ComponentCallbacksC11612 componentCallbacksC11612M3827 = abstractC3191.f10410.m3827(str);
        if (componentCallbacksC11612M3827 == null) {
            return;
        }
        componentCallbacksC11612M3827.onActivityResult(i, c11893.m29771(), c11893.m29770());
    }
}
