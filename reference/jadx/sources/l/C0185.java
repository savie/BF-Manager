package l;

import com.alipay.sdk.m.u0.b;

/* JADX INFO: renamed from: l.֡ۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAPG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0185 extends AbstractC19942 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC15709 f1299;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19236 f1300;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f1301;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f1302;

    public C0185(Object obj, EnumC15709 enumC15709, C19236 c19236) {
        C13465.m32966(obj, b.d);
        this.f1301 = obj;
        this.f1302 = "SidecarAdapter";
        this.f1299 = enumC15709;
        this.f1300 = c19236;
    }

    @Override // l.AbstractC19942
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19942 mo1388(String str, InterfaceC15456 interfaceC15456) {
        if (((Boolean) interfaceC15456.invoke(this.f1301)).booleanValue()) {
            return this;
        }
        return new C7241(this.f1301, this.f1302, str, this.f1300, this.f1299);
    }

    @Override // l.AbstractC19942
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo1387() {
        return this.f1301;
    }
}
