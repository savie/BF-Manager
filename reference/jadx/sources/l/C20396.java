package l;

/* JADX INFO: renamed from: l.᩶᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 440F */
/* JADX INFO: loaded from: classes5.dex */
public final class C20396 extends C22220 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17573 f66083;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C11867 f66084;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6761 f66085;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3836 f66086;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C4603 f66087;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C11492 f66088;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21017 f66089;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C11867 f66090;

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
        C4603 c4603 = this.f66087;
        this.f66087 = this.f66088.m28678(c8753.f30086);
        try {
            mo7248(c8753.f30089);
        } finally {
            this.f66087 = c4603;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3925(C5224 c5224) {
        AbstractC8774 abstractC8774 = c5224.f18121;
        AbstractC16579 abstractC16579 = abstractC8774.f30190;
        C3836 c3836 = this.f66086;
        if (abstractC16579 == null) {
            C4603 c4603 = this.f66087;
            C6761 c6761 = this.f66085;
            c6761.getClass();
            AbstractC16579 abstractC16579M18326 = c6761.m18326(abstractC8774, c4603, AbstractC16579.f53219);
            AbstractC8774 abstractC8775 = c5224.f18121;
            abstractC8775.getClass();
            AbstractC16579 abstractC165710 = c3836.f14266;
            C21017 c21017 = this.f66089;
            AbstractC16579 abstractC16579M47266 = c21017.m47266(abstractC8775, abstractC16579M18326, abstractC165710, c21017.f68418);
            abstractC8775.f30190 = abstractC16579M47266;
            abstractC16579 = abstractC16579M47266;
        }
        AbstractC16579 abstractC165711 = c3836.f14231;
        C17573 c17573 = this.f66083;
        if (abstractC16579 == abstractC165711) {
            this.f66090 = c17573.m40866(c5224, abstractC165711, this.f66087);
            return;
        }
        AbstractC16579 abstractC165712 = c3836.f14222;
        if (abstractC16579 == abstractC165712) {
            this.f66084 = c17573.m40866(c5224, abstractC165712, this.f66087);
        }
    }

    public C20396(C17573 c17573, C6761 c6761, C21017 c21017, C3836 c3836, C11492 c11492) {
        this.f66083 = c17573;
        this.f66085 = c6761;
        this.f66089 = c21017;
        this.f66086 = c3836;
        this.f66088 = c11492;
    }
}
