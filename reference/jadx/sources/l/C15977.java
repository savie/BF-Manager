package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܺܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C15977 extends AbstractC12449 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11038 f51748;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15977(C11038 c11038, EnumC6098 enumC6098, float f) {
        super(c11038, enumC6098, Float.valueOf(f));
        this.f51748 = c11038;
    }

    @Override // l.AbstractC12449
    /* JADX INFO: renamed from: ۨ */
    public final String mo2278() {
        boolean z = this.f51748.f37492.f22699;
        Object obj = this.f41511;
        if (!z) {
            String string = ((Float) obj).toString();
            return (((Float) obj).isNaN() || ((Float) obj).isInfinite()) ? string : C15489.m37076(string, "f");
        }
        return "bits " + C1115.m4131(Float.floatToIntBits(((Float) obj).floatValue()));
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
