package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩷֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes.dex */
public final class C21743 extends AbstractC15029 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1606 f69352;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21743(C1606 c1606, EnumC5335 enumC5335, float f) {
        super(c1606, enumC5335, Float.valueOf(f));
        this.f69352 = c1606;
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ۤ */
    public final String mo14388() {
        boolean z = this.f69352.f5515.f67139;
        Object obj = this.f49068;
        if (!z) {
            String string = ((Float) obj).toString();
            return (((Float) obj).isNaN() || ((Float) obj).isInfinite()) ? string : C14483.m34972(string, "f");
        }
        return "bits " + C7754.m21094(Float.floatToIntBits(((Float) obj).floatValue()));
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
