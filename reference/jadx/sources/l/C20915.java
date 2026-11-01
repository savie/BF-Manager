package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩷ܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20915 extends AbstractC12449 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11038 f67952;

    @Override // l.AbstractC12449
    /* JADX INFO: renamed from: ܰ */
    public final int mo2279() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20915(C11038 c11038, EnumC6098 enumC6098, double d) {
        super(c11038, enumC6098, Double.valueOf(d));
        this.f67952 = c11038;
    }

    @Override // l.AbstractC12449
    /* JADX INFO: renamed from: ۨ */
    public final String mo2278() {
        boolean z = this.f67952.f37492.f22699;
        Object obj = this.f41511;
        if (!z) {
            Double d = (Double) obj;
            String string = d.toString();
            return (d.isNaN() || d.isInfinite()) ? string : C15489.m37076(string, "d");
        }
        StringBuilder sb = new StringBuilder("bits ");
        long jDoubleToLongBits = Double.doubleToLongBits(((Double) obj).doubleValue());
        int i = C1115.f5034;
        int i2 = 16;
        while (i2 > 0 && (jDoubleToLongBits >> ((i2 - 1) * 4)) == 0) {
            i2--;
        }
        sb.append(C1115.m4132(i2, jDoubleToLongBits));
        sb.append('l');
        return sb.toString();
    }

    @Override // l.AbstractC12449
    /* JADX INFO: renamed from: ۙ */
    public final void mo2277(InterfaceC10434 interfaceC10434, int i) {
        super.mo2277(interfaceC10434, i);
        interfaceC10434.mo18527(mo2278() + l.b);
    }

    @Override // l.AbstractC12449
    /* JADX INFO: renamed from: ܰ */
    public final void mo2280(InterfaceC10434 interfaceC10434, int i) {
        super.mo2280(interfaceC10434, i);
        interfaceC10434.mo18527(mo2278() + l.b);
    }
}
