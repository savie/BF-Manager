package l;

/* JADX INFO: renamed from: l.۬ۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13089 implements InterfaceC7506 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21825 f43596;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f43597;

    public C13089(C20145 c20145, C21825 c21825) {
        this.f43597 = c20145;
        this.f43596 = c21825;
    }

    @Override // l.InterfaceC7506
    /* JADX INFO: renamed from: ۙ */
    public final void mo20004(C4603 c4603, C12926 c12926, C21825 c21825, C21825 c21826, C10391 c10391) {
        AbstractC23903 abstractC23903 = c12926.f42951;
        int iM48596 = c21825.m48596();
        boolean zM29179 = c12926.f42957.m29179();
        C20145 c20145 = this.f43597;
        C21825 c21825M45528 = c20145.m45528(c21826, abstractC23903, iM48596, zM29179);
        while (c21825M45528.m48595()) {
            AbstractC16579 abstractC16579 = (AbstractC16579) c21825M45528.f70876;
            AbstractC16579 abstractC165710 = (AbstractC16579) this.f43596.f70876;
            C6761 c6761 = c20145.f65406;
            C13638.requireNonNull(c6761);
            C21059 c21059 = C21059.f68594;
            C1093 c1093 = new C1093(this, c12926, c10391, abstractC165710);
            EnumC1946 enumC1946 = EnumC1946.f7332;
            c6761.f22834.m47266((InterfaceC12260) null, (AbstractC16579) c21825.f70876, abstractC16579, c1093);
            c21825 = c21825.f70877;
            c21825M45528 = c21825M45528.f70877;
            this.f43596 = this.f43596.isEmpty() ? this.f43596 : this.f43596.f70877;
        }
    }

    @Override // l.InterfaceC7506
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7506 mo2275(C21825 c21825) {
        C6171.m17174("Cannot get here!");
        throw null;
    }
}
