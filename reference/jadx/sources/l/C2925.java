package l;

/* JADX INFO: renamed from: l.ۗ֫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2925 implements InterfaceC5614 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f10992;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC5614 f10993;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f10994;

    public /* synthetic */ C2925(InterfaceC5614 interfaceC5614, boolean z, AbstractActivityC12483 abstractActivityC12483) {
        this.f10993 = interfaceC5614;
        this.f10994 = z;
        this.f10992 = abstractActivityC12483;
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        if (this.f10993.mo2357()) {
            return true;
        }
        if (!this.f10994) {
            return false;
        }
        AbstractActivityC12483 abstractActivityC12483 = this.f10992;
        return abstractActivityC12483.isFinishing() || abstractActivityC12483.isDestroyed();
    }
}
