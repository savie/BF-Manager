package l;

/* JADX INFO: renamed from: l.ܽ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J1MI */
/* JADX INFO: loaded from: classes5.dex */
public final class C17244 extends AbstractC5530 implements InterfaceC19597 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15752 f56184;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17244(C15752 c15752, int i) {
        super(i);
        this.f56184 = c15752;
    }

    @Override // l.AbstractC12987
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo1294(int i) {
        C15752 c15752 = this.f56184;
        return c15752.f51223.get(c15752.f51221 + i);
    }

    @Override // l.AbstractC5530
    /* JADX INFO: renamed from: ۙ */
    public final void mo1292(int i, Object obj) {
        this.f56184.add(i, obj);
    }

    @Override // l.AbstractC5530
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1295(int i, Object obj) {
        this.f56184.set(i, obj);
    }

    @Override // l.AbstractC12987
    /* JADX INFO: renamed from: ۤ */
    public final void mo1293(int i) {
        this.f56184.remove(i);
    }

    @Override // l.AbstractC12987
    /* JADX INFO: renamed from: ۙ */
    public final int mo1291() {
        C15752 c15752 = this.f56184;
        return c15752.f51222 - c15752.f51221;
    }
}
