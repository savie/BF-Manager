package l;

/* JADX INFO: renamed from: l.ܰ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14266 implements InterfaceC6919 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14769 f45077;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f45078;

    public C14266(C22010 c22010, C14769 c14769) {
        this.f45078 = c22010;
        this.f45077 = c14769;
    }

    @Override // l.InterfaceC6919
    /* JADX INFO: renamed from: ۙ */
    public final void mo16157(C3168 c3168, C4192 c4192, C14769 c14769, C14769 c147610, C1083 c1083) {
        AbstractC11781 abstractC11781 = c4192.f15336;
        int iM35551 = c14769.m35551();
        boolean zM46507 = c4192.f15333.m46507();
        C22010 c22010 = this.f45078;
        C14769 c14769M49783 = c22010.m49783(c147610, abstractC11781, iM35551, zM46507);
        while (c14769M49783.m35550()) {
            AbstractC22664 abstractC22664 = (AbstractC22664) c14769M49783.f48335;
            AbstractC22664 abstractC22665 = (AbstractC22664) this.f45077.f48335;
            C0310 c0310 = c22010.f71016;
            C17359.requireNonNull(c0310);
            C22114 c22114 = C22114.f71274;
            C3826 c3826 = new C3826(this, c4192, c1083, abstractC22665);
            EnumC17463 enumC17463 = EnumC17463.f56782;
            c0310.f1698.m49970((InterfaceC5075) null, (AbstractC22664) c14769.f48335, abstractC22664, c3826);
            c14769 = c14769.f48336;
            c14769M49783 = c14769M49783.f48336;
            this.f45077 = this.f45077.isEmpty() ? this.f45077 : this.f45077.f48336;
        }
    }

    @Override // l.InterfaceC6919
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6919 mo16156(C14769 c14769) {
        C11972.m30024("Cannot get here!");
        throw null;
    }
}
