package l;

/* JADX INFO: renamed from: l.ۧۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes3.dex */
public final class C10739 implements InterfaceC23715 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12938 f36616;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2976 f36617;

    @Override // l.InterfaceC23715
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo26980(AbstractC17364 abstractC17364) {
    }

    public C10739(C12938 c12938, C2976 c2976) {
        this.f36616 = c12938;
        this.f36617 = c2976;
    }

    @Override // l.InterfaceC23715
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo26978(AbstractC17364 abstractC17364) {
        C12938 c12938 = this.f36616;
        String str = c12938.f43003;
        String strMo40397 = abstractC17364.mo40397();
        AbstractC11015 abstractC11015Mo40399 = abstractC17364.mo40399();
        String strM44254 = C19288.m44254(str, strMo40397, abstractC11015Mo40399 == null ? null : abstractC11015Mo40399.mo1655(), abstractC17364.getName());
        String strM44255 = C19288.m44254(c12938.f43003, abstractC17364.mo40397(), (String) null, abstractC17364.getName());
        if (C19288.m44271(c12938, abstractC17364.mo40397(), strM44254, strM44255)) {
            this.f36617.m8869(strM44254, strM44255);
        }
    }

    @Override // l.InterfaceC23715
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo26979(AbstractC17364 abstractC17364) {
        C14267 c14267M44260;
        C13644 c13644M44258 = C19288.m44258(abstractC17364.mo40399());
        if (c13644M44258 == null || (c14267M44260 = C19288.m44260(this.f36616, abstractC17364, c13644M44258)) == null) {
            return;
        }
        this.f36617.m8870(c14267M44260.f46695, c14267M44260.f46693, c14267M44260.f46694, c14267M44260.f46696);
    }
}
