package l;

/* JADX INFO: renamed from: l.ۘۙ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes3.dex */
public final class C3921 implements InterfaceC18837 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f13382;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC18837 f13383;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f13384;

    public C3921(InterfaceC18837 interfaceC18837, AbstractActivityC17204 abstractActivityC17204, String str) {
        this.f13383 = interfaceC18837;
        this.f13382 = abstractActivityC17204;
        this.f13384 = str;
    }

    @Override // l.InterfaceC18837
    /* JADX INFO: renamed from: ۙ */
    public final void mo1269(C9651 c9651, boolean z) {
        this.f13383.mo1269(c9651, z);
    }

    @Override // l.InterfaceC18837
    /* JADX INFO: renamed from: ۙ */
    public final void mo1268() {
        this.f13383.mo1268();
    }

    @Override // l.InterfaceC18837
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1270(Exception exc) {
        AbstractActivityC17204 abstractActivityC17204;
        boolean z = exc instanceof C20774;
        InterfaceC18837 interfaceC18837 = this.f13383;
        if (z && (abstractActivityC17204 = this.f13382) != null) {
            C21576.m49068(new RunnableC24059(abstractActivityC17204, this.f13384, interfaceC18837, 0));
            return true;
        }
        return interfaceC18837.mo1270(exc);
    }
}
