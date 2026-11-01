package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۧ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3922 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10650 implements InterfaceC0065 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19822 f36334;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f36335 = new HashMap();

    @Override // l.InterfaceC0065
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC0065 mo983(Class cls, InterfaceC16294 interfaceC16294) {
        this.f36335.put(cls, interfaceC16294);
        return this;
    }

    @Override // l.InterfaceC0065
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC0065 mo984(InterfaceC19822 interfaceC19822) {
        this.f36334 = interfaceC19822;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12061 m26839(C18410 c18410, InterfaceC9239 interfaceC9239) {
        InterfaceC19822 c12766 = this.f36334;
        if (c12766 == null) {
            c12766 = new C12766();
        }
        return new C23350(c18410, interfaceC9239, new C2657(), C0561.unmodifiableMap(this.f36335), c12766);
    }
}
