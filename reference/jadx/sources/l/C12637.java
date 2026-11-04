package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۨ᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes4.dex */
public class C12637 extends AbstractC18847 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C21332 f40543;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m31418() {
        return (this.f61224 == null || this.f40543 == null) ? false : true;
    }

    public C12637(EnumC3185 enumC3185, C21332 c21332, C7660 c7660) {
        super(enumC3185, c7660);
        this.f40543 = c21332;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21332 m31417() {
        return this.f40543;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31416(C21332 c21332, int i) {
        this.f40543 = c21332;
        c21332.f67820 = i;
    }

    @Override // l.AbstractC18847
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C12637) && super.equals(obj)) {
            return this.f40543.equals(((C12637) obj).f40543);
        }
        return false;
    }

    @Override // l.AbstractC18847
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5226(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C12637) && super.mo5226(obj)) {
            return this.f40543.m48559(((C12637) obj).f40543);
        }
        return false;
    }

    @Override // l.AbstractC18847
    public final int hashCode() {
        return (super.hashCode() * 31) + this.f40543.hashCode();
    }

    @Override // l.AbstractC18847
    public final String toString() {
        return super.toString() + "{" + this.f40543 + "," + this.f61224 + l.d;
    }

    @Override // l.AbstractC18847
    /* JADX INFO: renamed from: ۙ */
    public final void mo3026(InterfaceC9397 interfaceC9397) throws IOException {
        super.mo3026(interfaceC9397);
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28740(this.f40543.f67820);
        c11388.m28740(((C7660) this.f61224).f67820);
    }
}
