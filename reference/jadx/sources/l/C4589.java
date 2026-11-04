package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۙ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C4589 extends AbstractC15029 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1606 f16306;

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo14389() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4589(C1606 c1606, EnumC5335 enumC5335, double d) {
        super(c1606, enumC5335, Double.valueOf(d));
        this.f16306 = c1606;
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String mo14388() {
        boolean z = this.f16306.f5515.f67139;
        Object obj = this.f49068;
        if (!z) {
            Double d = (Double) obj;
            String string = d.toString();
            return (d.isNaN() || d.isInfinite()) ? string : C14483.m34972(string, "d");
        }
        StringBuilder sb = new StringBuilder("bits ");
        long jDoubleToLongBits = Double.doubleToLongBits(((Double) obj).doubleValue());
        int i = C7754.f25519;
        int i2 = 16;
        while (i2 > 0 && (jDoubleToLongBits >> ((i2 - 1) * 4)) == 0) {
            i2--;
        }
        sb.append(C7754.m21095(i2, jDoubleToLongBits));
        sb.append('l');
        return sb.toString();
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14387(InterfaceC13676 interfaceC13676, int i) {
        super.mo14387(interfaceC13676, i);
        interfaceC13676.mo3881(mo14388() + l.b);
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo14390(InterfaceC13676 interfaceC13676, int i) {
        super.mo14390(interfaceC13676, i);
        interfaceC13676.mo3881(mo14388() + l.b);
    }
}
