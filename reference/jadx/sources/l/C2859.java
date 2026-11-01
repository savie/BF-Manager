package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۖ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes2.dex */
public class C2859 extends AbstractC21536 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C6574 f10797;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m8624() {
        return (this.f69953 == null || this.f10797 == null) ? false : true;
    }

    public C2859(EnumC13776 enumC13776, C6574 c6574, C15187 c15187) {
        super(enumC13776, c15187);
        this.f10797 = c6574;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6574 m8627() {
        return this.f10797;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8625(C6574 c6574, int i) {
        this.f10797 = c6574;
        c6574.f43854 = i;
    }

    @Override // l.AbstractC21536
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2859) && super.equals(obj)) {
            return this.f10797.equals(((C2859) obj).f10797);
        }
        return false;
    }

    @Override // l.AbstractC21536
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo8626(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2859) && super.mo8626(obj)) {
            return this.f10797.m17814(((C2859) obj).f10797);
        }
        return false;
    }

    @Override // l.AbstractC21536
    public final int hashCode() {
        return (super.hashCode() * 31) + this.f10797.hashCode();
    }

    @Override // l.AbstractC21536
    public final String toString() {
        return super.toString() + "{" + this.f10797 + "," + this.f69953 + l.d;
    }

    @Override // l.AbstractC21536
    /* JADX INFO: renamed from: ۙ */
    public final void mo3209(InterfaceC19275 interfaceC19275) throws IOException {
        super.mo3209(interfaceC19275);
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51770(this.f10797.f43854);
        c23509.m51770(((C15187) this.f69953).f43854);
    }
}
