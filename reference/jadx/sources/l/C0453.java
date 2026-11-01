package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֡ܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes2.dex */
public final class C0453 extends AbstractC12449 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11038 f2068;

    @Override // l.AbstractC12449
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo2279() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0453(C11038 c11038, EnumC6098 enumC6098, long j) {
        super(c11038, enumC6098, Long.valueOf(j));
        this.f2068 = c11038;
    }

    @Override // l.AbstractC12449
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String mo2278() {
        StringBuilder sb;
        String string;
        boolean z = this.f2068.f37492.f22699;
        Object obj = this.f41511;
        if (z) {
            sb = new StringBuilder();
            long jLongValue = ((Long) obj).longValue();
            int i = C1115.f5034;
            int i2 = 16;
            while (i2 > 0 && (jLongValue >> ((i2 - 1) * 4)) == 0) {
                i2--;
            }
            string = C1115.m4132(i2, jLongValue);
        } else {
            sb = new StringBuilder();
            string = ((Long) obj).toString();
        }
        sb.append(string);
        sb.append('l');
        return sb.toString();
    }

    @Override // l.AbstractC12449
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2277(InterfaceC10434 interfaceC10434, int i) {
        super.mo2277(interfaceC10434, i);
        interfaceC10434.mo18527(mo2278() + l.b);
    }

    @Override // l.AbstractC12449
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo2280(InterfaceC10434 interfaceC10434, int i) {
        super.mo2280(interfaceC10434, i);
        interfaceC10434.mo18527(mo2278() + l.b);
    }
}
