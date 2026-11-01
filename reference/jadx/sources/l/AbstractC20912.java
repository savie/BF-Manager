package l;

/* JADX INFO: renamed from: l.᩷ܰ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20912 implements InterfaceC18195 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f67948;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12926 f67949;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f67950;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C10391 f67951;

    public final String toString() {
        return "MethodCheckContext";
    }

    public AbstractC20912(C20145 c20145, boolean z, C12926 c12926, C10391 c10391) {
        this.f67948 = c20145;
        this.f67950 = z;
        this.f67949 = c12926;
        this.f67951 = c10391;
    }

    @Override // l.InterfaceC18195
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2933(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C10391 c10391) {
        C19524 c19524 = this.f67949.f42956;
        boolean z = this.f67950;
        C20145 c20145 = this.f67948;
        if (z) {
            return c20145.f65444.m52400(c19524.m44602(abstractC16579), c19524.m44602(abstractC165710), c10391);
        }
        return c20145.f65444.m52363(c19524.m44602(abstractC16579), c19524.m44602(abstractC165710), c10391);
    }

    @Override // l.InterfaceC18195
    /* JADX INFO: renamed from: ۙ */
    public void mo2545(InterfaceC12260 interfaceC12260, C11948 c11948) {
        throw new C1155(c11948);
    }

    @Override // l.InterfaceC18195
    /* JADX INFO: renamed from: ۙ */
    public final C10391 mo4573(InterfaceC12260 interfaceC12260, AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        return this.f67951;
    }

    @Override // l.InterfaceC18195
    /* JADX INFO: renamed from: ۙ */
    public final C19524 mo4574() {
        return this.f67949.f42956;
    }

    @Override // l.InterfaceC18195
    /* JADX INFO: renamed from: ܰ */
    public final C12926 mo4575() {
        return this.f67949;
    }
}
