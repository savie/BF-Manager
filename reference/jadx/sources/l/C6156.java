package l;

import com.alipay.sdk.m.u0.b;

/* JADX INFO: renamed from: l.ۛۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAPG */
/* JADX INFO: loaded from: classes3.dex */
public final class C6156 extends AbstractC12121 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16596 f20986;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object f20987;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f20988;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC20326 f20989;

    public C6156(Object obj, EnumC20326 enumC20326, C16596 c16596) {
        C15243.m36590(obj, b.d);
        this.f20987 = obj;
        this.f20988 = "SidecarAdapter";
        this.f20989 = enumC20326;
        this.f20986 = c16596;
    }

    @Override // l.AbstractC12121
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12121 mo17753(String str, InterfaceC3071 interfaceC3071) {
        if (((Boolean) interfaceC3071.invoke(this.f20987)).booleanValue()) {
            return this;
        }
        return new C23310(this.f20987, this.f20988, str, this.f20986, this.f20989);
    }

    @Override // l.AbstractC12121
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo17752() {
        return this.f20987;
    }
}
