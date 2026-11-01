package l;

/* JADX INFO: renamed from: l.ۜۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8MM */
/* JADX INFO: loaded from: classes3.dex */
public final class C6662 implements InterfaceC2428 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11634 f22515 = new C11634(new byte[4], 4);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15130 f22516;

    @Override // l.InterfaceC2428
    /* JADX INFO: renamed from: ۙ */
    public final void mo7415(C6694 c6694, InterfaceC15690 interfaceC15690, C8074 c8074) {
    }

    public C6662(C15130 c15130) {
        this.f22516 = c15130;
    }

    @Override // l.InterfaceC2428
    /* JADX INFO: renamed from: ۙ */
    public final void mo7414(C2460 c2460) {
        C15130 c15130;
        if (c2460.m7516() == 0 && (c2460.m7516() & 128) != 0) {
            c2460.m7535(6);
            int iM7503 = c2460.m7503() / 4;
            int i = 0;
            while (true) {
                c15130 = this.f22516;
                if (i >= iM7503) {
                    break;
                }
                C11634 c11634 = this.f22515;
                c2460.m7507(0, 4, c11634.f39082);
                c11634.m29029(0);
                int iM29039 = c11634.m29039(16);
                c11634.m29034(3);
                if (iM29039 == 0) {
                    c11634.m29034(13);
                } else {
                    int iM290310 = c11634.m29039(13);
                    if (c15130.f49428.get(iM290310) == null) {
                        c15130.f49428.put(iM290310, new C5251(new C22891(c15130, iM290310)));
                        c15130.f49435++;
                    }
                }
                i++;
            }
            if (c15130.f49422 != 2) {
                c15130.f49428.remove(0);
            }
        }
    }
}
