package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۟ۙ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H7CN */
/* JADX INFO: loaded from: classes4.dex */
public final class C7660 extends C21259 implements InterfaceC5597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC18847 f25232;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EnumC19767 f25233;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f25234;

    public C7660() {
        throw null;
    }

    @Override // l.InterfaceC3359
    public final int getLength() {
        return 2;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    public C7660(int i, AbstractC18847 abstractC18847) {
        this.f25233 = EnumC19767.NO;
        this.f67820 = i;
        this.f25232 = abstractC18847;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m20874() {
        return this.f25234;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20870(int i) {
        this.f25234 = i;
    }

    @Override // l.C21259
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo20871() {
        if (!super.mo20871()) {
            return false;
        }
        AbstractC18847 abstractC18847 = this.f25232;
        return !(abstractC18847 == null || abstractC18847.f61224 == null) || (abstractC18847 instanceof C22751);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC3185 m20873() {
        AbstractC18847 abstractC18847 = this.f25232;
        return abstractC18847 == null ? EnumC3185.f10350 : abstractC18847.f61223;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        ((C11388) interfaceC9397).m28740(this.f67820);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7660)) {
            return false;
        }
        C7660 c7660 = (C7660) obj;
        return C17359.equals(this.f25232, c7660.f25232) && this.f25233 == c7660.f25233 && this.f67820 == c7660.f67820;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20872(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7660)) {
            return false;
        }
        AbstractC18847 abstractC18847 = this.f25232;
        AbstractC18847 abstractC18848 = ((C7660) obj).f25232;
        if (abstractC18847 == abstractC18848) {
            return true;
        }
        if (abstractC18847 == null) {
            return C17359.equals(abstractC18847, abstractC18848);
        }
        if (abstractC18848 != null) {
            return abstractC18847.mo5226(abstractC18848);
        }
        return false;
    }

    @Override // l.C21259
    public final int hashCode() {
        int iHashCode = super.hashCode();
        AbstractC18847 abstractC18847 = this.f25232;
        return (iHashCode + (abstractC18847 != null ? abstractC18847.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("#");
        int i = this.f67820;
        sb.append(i == -1 ? "?" : Integer.valueOf(i));
        sb.append("=");
        sb.append(this.f25232);
        return sb.toString();
    }

    @Override // l.InterfaceC5597
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC3359 mo7367(C15291 c15291) {
        C13054.m32520(this, c15291);
        return this;
    }
}
