package l;

/* JADX INFO: renamed from: l.ܶۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes5.dex */
public final class C15144 extends C10094 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f49476;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21493 f49477;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15144(C4943 c4943, C21493 c21493) {
        super(c4943);
        this.f49477 = c21493;
    }

    @Override // l.AbstractC7060
    /* JADX INFO: renamed from: ܶ */
    public final void mo3207() {
        super.mo3207();
        this.f49476--;
    }

    @Override // l.AbstractC7060
    /* JADX INFO: renamed from: ܰ */
    public final void mo3206(C23289 c23289) {
        super.mo3206(c23289);
        this.f49476--;
    }

    @Override // l.AbstractC7060
    /* JADX INFO: renamed from: ۙ */
    public final void mo3204(C23289 c23289, int i, int i2) {
        this.f49477.m48131();
        int i3 = this.f49476 + 1;
        this.f49476 = i3;
        if (i3 <= 256) {
            super.mo3204(c23289, i, i2);
            return;
        }
        throw C8794.m22909(EnumC19377.LIMIT, "Parser nesting limit exceeded");
    }

    @Override // l.AbstractC7060
    /* JADX INFO: renamed from: ۙ */
    public final void mo3205(C23289 c23289, int i, int i2, int i3) {
        this.f49477.m48131();
        int i4 = this.f49476 + 1;
        this.f49476 = i4;
        if (i4 <= 256) {
            super.mo3205(c23289, i, i2, 0);
            return;
        }
        throw C8794.m22909(EnumC19377.LIMIT, "Parser nesting limit exceeded");
    }
}
