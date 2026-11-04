package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۬ۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C13647 extends AbstractC15029 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1606 f43335;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13647(C1606 c1606, EnumC5335 enumC5335, int i) {
        super(c1606, enumC5335, Integer.valueOf(i));
        this.f43335 = c1606;
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ۤ */
    public final String mo14388() {
        int iOrdinal = this.f49067.ordinal();
        C1606 c1606 = this.f43335;
        if (iOrdinal == 6) {
            return C1606.m5618(c1606.m5627(this), c1606.f5515.f1449);
        }
        Object obj = this.f49068;
        if (iOrdinal == 7 || iOrdinal == 13) {
            return c1606.m5644(((Integer) obj).intValue());
        }
        return (iOrdinal == 16 || iOrdinal == 17) ? c1606.m5640(((Integer) obj).intValue(), new C0652(4)) : "UnknownTag";
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ۙ */
    public final void mo14387(InterfaceC13676 interfaceC13676, int i) {
        super.mo14387(interfaceC13676, i);
        m33402();
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14390(InterfaceC13676 interfaceC13676, int i) {
        super.mo14390(interfaceC13676, i);
        m33402();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m33402() {
        int iOrdinal = this.f49067.ordinal();
        if (iOrdinal == 6 || iOrdinal == 7 || iOrdinal == 13 || iOrdinal == 16 || iOrdinal == 17) {
            C1606 c1606 = this.f43335;
            boolean z = c1606.f67146;
            Object obj = this.f49068;
            if (z) {
                c1606.m48006("#" + obj + l.b);
                return;
            }
            c1606.m48005(this.f49066, "#" + obj + l.b);
            StringBuilder sb = new StringBuilder(" // ");
            sb.append(mo14388());
            c1606.m48006(sb.toString());
        }
    }
}
