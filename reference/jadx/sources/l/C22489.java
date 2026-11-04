package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩸֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes.dex */
public final class C22489 extends AbstractC15029 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1606 f72774;

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ᩷ */
    public final int mo14389() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22489(C1606 c1606, EnumC5335 enumC5335, long j) {
        super(c1606, enumC5335, Long.valueOf(j));
        this.f72774 = c1606;
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ۤ */
    public final String mo14388() {
        StringBuilder sb;
        String string;
        boolean z = this.f72774.f5515.f67139;
        Object obj = this.f49068;
        if (z) {
            sb = new StringBuilder();
            long jLongValue = ((Long) obj).longValue();
            int i = C7754.f25519;
            int i2 = 16;
            while (i2 > 0 && (jLongValue >> ((i2 - 1) * 4)) == 0) {
                i2--;
            }
            string = C7754.m21095(i2, jLongValue);
        } else {
            sb = new StringBuilder();
            string = ((Long) obj).toString();
        }
        sb.append(string);
        sb.append('l');
        return sb.toString();
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ۙ */
    public final void mo14387(InterfaceC13676 interfaceC13676, int i) {
        super.mo14387(interfaceC13676, i);
        interfaceC13676.mo3881(mo14388() + l.b);
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14390(InterfaceC13676 interfaceC13676, int i) {
        super.mo14390(interfaceC13676, i);
        interfaceC13676.mo3881(mo14388() + l.b);
    }
}
