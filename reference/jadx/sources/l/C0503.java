package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֡ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HIUX */
/* JADX INFO: loaded from: classes3.dex */
public final class C0503 implements InterfaceC12435 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3319 f2177;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1610 f2178;

    public C0503(C1610 c1610, C3319 c3319) {
        this.f2178 = c1610;
        this.f2177 = c3319;
    }

    @Override // l.InterfaceC20640
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC15418 mo2468() {
        return EnumC15418.ASSIGN;
    }

    @Override // l.InterfaceC12435
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 mo2467(C7150 c7150) {
        C3319 c3319 = this.f2177;
        AbstractC1566 abstractC1566M19714 = c7150.m19714(c3319.mo44035(0));
        AbstractC1566 abstractC1566M10936 = c3319.m10936();
        return this.f2178.m5687().m23403(abstractC1566M19714, abstractC1566M10936).m19812() ? abstractC1566M19714 : abstractC1566M10936;
    }

    @Override // l.InterfaceC20640
    public final AbstractC1566 getType() {
        C3319 c3319 = this.f2177;
        AbstractC1566 type = c3319.mo44035(0).getType();
        AbstractC1566 abstractC1566M10936 = c3319.m10936();
        return this.f2178.m5687().m23403(type, abstractC1566M10936).m19812() ? type : abstractC1566M10936;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3319 m2469() {
        return this.f2177;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CHECK_CAST_ASSIGN{(");
        C3319 c3319 = this.f2177;
        sb.append(c3319.m10937());
        sb.append(") ");
        sb.append(c3319.mo44035(0).getType());
        sb.append(l.d);
        return sb.toString();
    }
}
