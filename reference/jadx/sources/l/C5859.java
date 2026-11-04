package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۚᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 3922 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5859 implements InterfaceC11078 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC22267 f20098;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f20099 = new HashMap();

    @Override // l.InterfaceC11078
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11078 mo17052(Class cls, InterfaceC23013 interfaceC23013) {
        this.f20099.put(cls, interfaceC23013);
        return this;
    }

    @Override // l.InterfaceC11078
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11078 mo17053(InterfaceC22267 interfaceC22267) {
        this.f20098 = interfaceC22267;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20029 m17054(C10420 c10420, InterfaceC17045 interfaceC17045) {
        InterfaceC22267 c4455 = this.f20098;
        if (c4455 == null) {
            c4455 = new C4455();
        }
        return new C2130(c10420, interfaceC17045, new C20775(), C4681.unmodifiableMap(this.f20099), c4455);
    }
}
