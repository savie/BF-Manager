package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۖ֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes3.dex */
public final class C2176 extends AbstractC11350 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8528 f7889;

    @Override // l.AbstractC11350
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11350 mo6775(C4603 c4603, AbstractC5930 abstractC5930) {
        C7341 c7341 = (C7341) this.f38291;
        Map map = this.f38293;
        return new C2176(this.f7889, (C7341) abstractC5930, c4603, c7341, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2176(C8528 c8528, C7341 c7341, C4603 c4603, C7341 c7342, Map map) {
        super(c8528, c7341, c4603, c7342, map);
        this.f7889 = c8528;
    }

    @Override // l.AbstractC11350
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 mo6776(C1116 c1116) {
        C8528 c8528 = this.f7889;
        C6761 c6761 = c8528.f29530;
        InterfaceC18195 interfaceC18195 = c1116.f5037;
        AbstractC16579 abstractC16579 = c1116.f5036;
        c6761.getClass();
        C1116 c1116Mo4136 = c1116.mo4136(new C0535(c6761, interfaceC18195));
        AbstractC5930 abstractC5930 = this.f38291;
        C7341 c7341 = (C7341) abstractC5930;
        if (c7341.mo16201()) {
            return c1116Mo4136.mo4137(abstractC5930, c7341.f30190);
        }
        if (abstractC16579.m39001(EnumC6617.VOID)) {
            c1116.f5037.mo2545(this.f34494, c8528.f29530.f22831.m51910(C14707.f48108));
            return c8528.f29530.f22802.m52440(abstractC16579);
        }
        AbstractC5930 abstractC5931 = c7341.f24393;
        C8528.m22276(abstractC5931, abstractC5931.f30190, c1116Mo4136);
        AbstractC5930 abstractC5932 = c7341.f24392;
        C8528.m22276(abstractC5932, abstractC5932.f30190, c1116Mo4136);
        return c1116Mo4136.f5036;
    }
}
