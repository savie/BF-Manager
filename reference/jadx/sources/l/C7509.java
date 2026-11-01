package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۟ܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C7509 extends AbstractC12449 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11038 f24988;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7509(C11038 c11038, EnumC6098 enumC6098, int i) {
        super(c11038, enumC6098, Integer.valueOf(i));
        this.f24988 = c11038;
    }

    @Override // l.AbstractC12449
    /* JADX INFO: renamed from: ۨ */
    public final String mo2278() {
        int iOrdinal = this.f41512.ordinal();
        C11038 c11038 = this.f24988;
        if (iOrdinal == 6) {
            return C11038.m27808(c11038.m27817(this), c11038.f37492.f14766);
        }
        Object obj = this.f41511;
        if (iOrdinal == 7 || iOrdinal == 13) {
            return c11038.m27831(((Integer) obj).intValue());
        }
        return (iOrdinal == 16 || iOrdinal == 17) ? c11038.m27826(((Integer) obj).intValue(), new C14235(1)) : "UnknownTag";
    }

    @Override // l.AbstractC12449
    /* JADX INFO: renamed from: ۙ */
    public final void mo2277(InterfaceC10434 interfaceC10434, int i) {
        super.mo2277(interfaceC10434, i);
        m20005();
    }

    @Override // l.AbstractC12449
    /* JADX INFO: renamed from: ܰ */
    public final void mo2280(InterfaceC10434 interfaceC10434, int i) {
        super.mo2280(interfaceC10434, i);
        m20005();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m20005() {
        int iOrdinal = this.f41512.ordinal();
        if (iOrdinal == 6 || iOrdinal == 7 || iOrdinal == 13 || iOrdinal == 16 || iOrdinal == 17) {
            C11038 c11038 = this.f24988;
            boolean z = c11038.f22704;
            Object obj = this.f41511;
            if (z) {
                c11038.m18219("#" + obj + l.b);
                return;
            }
            c11038.m18218(this.f41510, "#" + obj + l.b);
            StringBuilder sb = new StringBuilder(" // ");
            sb.append(mo2278());
            c11038.m18219(sb.toString());
        }
    }
}
