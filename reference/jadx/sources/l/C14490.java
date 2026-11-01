package l;

/* JADX INFO: renamed from: l.ܳۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 84VE */
/* JADX INFO: loaded from: classes4.dex */
public final class C14490 implements InterfaceC2568 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f47469;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5171 f47470;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC13639 f47471;

    public C14490(AbstractC13639 abstractC13639, int i, C5171 c5171) {
        this.f47471 = abstractC13639;
        this.f47469 = i;
        this.f47470 = c5171;
    }

    @Override // l.InterfaceC2568
    public final int getKey() {
        return this.f47469;
    }

    @Override // l.InterfaceC2568
    /* JADX INFO: renamed from: ۙ */
    public final int mo8019() {
        return this.f47470.m14323() - this.f47471.m33339().m36034();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5171 m34886() {
        return this.f47470;
    }
}
