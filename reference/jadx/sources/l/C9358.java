package l;

/* JADX INFO: renamed from: l.ۡۨ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes4.dex */
public final class C9358 implements InterfaceC6492 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1728 f30421;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4711 f30422;

    @Override // l.InterfaceC6492
    /* JADX INFO: renamed from: ᩷ */
    public final void mo9705(AbstractC3508 abstractC3508) {
    }

    public C9358(C1728 c1728, C4711 c4711) {
        this.f30421 = c1728;
        this.f30422 = c4711;
    }

    @Override // l.InterfaceC6492
    /* JADX INFO: renamed from: ۙ */
    public final void mo9703(AbstractC3508 abstractC3508) {
        C1728 c1728 = this.f30421;
        String str = c1728.f5904;
        String strMo11501 = abstractC3508.mo11501();
        AbstractC12457 abstractC12457Mo11502 = abstractC3508.mo11502();
        String strM30407 = C12168.m30407(str, strMo11501, abstractC12457Mo11502 == null ? null : abstractC12457Mo11502.mo30941(), abstractC3508.getName());
        String strM30408 = C12168.m30407(c1728.f5904, abstractC3508.mo11501(), (String) null, abstractC3508.getName());
        if (C12168.m30424(c1728, abstractC3508.mo11501(), strM30407, strM30408)) {
            this.f30422.m14599(strM30407, strM30408);
        }
    }

    @Override // l.InterfaceC6492
    /* JADX INFO: renamed from: ۤ */
    public final void mo9704(AbstractC3508 abstractC3508) {
        C8613 c8613M30411;
        C10676 c10676M30412 = C12168.m30412(abstractC3508.mo11502());
        if (c10676M30412 == null || (c8613M30411 = C12168.m30411(this.f30421, abstractC3508, c10676M30412)) == null) {
            return;
        }
        this.f30422.m14600(c8613M30411.f28128, c8613M30411.f28127, c8613M30411.f28129, c8613M30411.f28130);
    }
}
