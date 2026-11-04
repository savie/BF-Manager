package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۤ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C10554 extends AbstractC15029 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1606 f33540;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10554(C1606 c1606, EnumC5335 enumC5335, int i) {
        super(c1606, enumC5335, Integer.valueOf(i));
        this.f33540 = c1606;
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ۤ */
    public final String mo14388() {
        boolean z = this.f33540.f5515.f67139;
        Integer num = (Integer) this.f49068;
        return z ? C7754.m21094(num.intValue()) : num.toString();
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
