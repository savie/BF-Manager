package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܶۧۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7CN */
/* JADX INFO: loaded from: classes5.dex */
public final class C15187 extends C13173 implements InterfaceC6387 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public EnumC16971 f49577;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC21536 f49578;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f49579;

    public C15187() {
        throw null;
    }

    @Override // l.InterfaceC4705
    public final int getLength() {
        return 2;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    public C15187(int i, AbstractC21536 abstractC21536) {
        this.f49577 = EnumC16971.NO;
        this.f43854 = i;
        this.f49578 = abstractC21536;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m36401() {
        return this.f49579;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36399(int i) {
        this.f49579 = i;
    }

    @Override // l.C13173
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo32563() {
        if (!super.mo32563()) {
            return false;
        }
        AbstractC21536 abstractC21536 = this.f49578;
        return !(abstractC21536 == null || abstractC21536.f69953 == null) || (abstractC21536 instanceof C0742);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC13776 m36398() {
        AbstractC21536 abstractC21536 = this.f49578;
        return abstractC21536 == null ? EnumC13776.f45407 : abstractC21536.f69952;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        ((C23509) interfaceC19275).m51770(this.f43854);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15187)) {
            return false;
        }
        C15187 c15187 = (C15187) obj;
        return C13638.equals(this.f49578, c15187.f49578) && this.f49577 == c15187.f49577 && this.f43854 == c15187.f43854;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36400(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15187)) {
            return false;
        }
        AbstractC21536 abstractC21536 = this.f49578;
        AbstractC21536 abstractC21537 = ((C15187) obj).f49578;
        if (abstractC21536 == abstractC21537) {
            return true;
        }
        if (abstractC21536 == null) {
            return C13638.equals(abstractC21536, abstractC21537);
        }
        if (abstractC21537 != null) {
            return abstractC21536.mo8626(abstractC21537);
        }
        return false;
    }

    @Override // l.C13173
    public final int hashCode() {
        int iHashCode = super.hashCode();
        AbstractC21536 abstractC21536 = this.f49578;
        return (iHashCode + (abstractC21536 != null ? abstractC21536.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("#");
        int i = this.f43854;
        sb.append(i == -1 ? "?" : Integer.valueOf(i));
        sb.append("=");
        sb.append(this.f49578);
        return sb.toString();
    }

    @Override // l.InterfaceC6387
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4705 mo15810(C12738 c12738) {
        C17676.m41157(this, c12738);
        return this;
    }
}
