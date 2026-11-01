package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۧ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11243 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22386[] f38033;

    public C11243(InterfaceC22386[] interfaceC22386Arr) {
        this.f38033 = interfaceC22386Arr;
    }

    private final Object readResolve() {
        InterfaceC22386[] interfaceC22386Arr = this.f38033;
        InterfaceC22386 interfaceC22386Mo4417 = C1218.f5350;
        for (InterfaceC22386 interfaceC22386 : interfaceC22386Arr) {
            interfaceC22386Mo4417 = interfaceC22386Mo4417.mo4417(interfaceC22386);
        }
        return interfaceC22386Mo4417;
    }
}
