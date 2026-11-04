package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15122 implements InterfaceC9155 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f49353;

    public C15122(C22010 c22010) {
        this.f49353 = c22010;
    }

    @Override // l.InterfaceC9155
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo24290(AbstractC22664 abstractC22664, C14769 c14769, C14769 c147610) {
        if (abstractC22664.mo9329() || AbstractC22664.m51062(c14769)) {
            return false;
        }
        return c147610 == null || !AbstractC22664.m51062(c147610);
    }

    @Override // l.InterfaceC9155
    /* JADX INFO: renamed from: ۙ */
    public final C14769 mo24289(AbstractC11781 abstractC11781, C14769 c14769) {
        EnumC16124 enumC16124 = EnumC16124.SPECULATIVE;
        C22010 c22010 = this.f49353;
        EnumC20234 enumC20234 = c22010.f71022.f40879;
        C12863 c12863 = c22010.f71035;
        C17359.requireNonNull(c12863);
        return c14769.m35547((Function) new C9046(c12863, enumC16124, abstractC11781, enumC20234));
    }
}
