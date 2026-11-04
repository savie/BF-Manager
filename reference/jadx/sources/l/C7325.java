package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۜᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7325 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11536[] f24135;

    public C7325(InterfaceC11536[] interfaceC11536Arr) {
        this.f24135 = interfaceC11536Arr;
    }

    private final Object readResolve() {
        InterfaceC11536[] interfaceC11536Arr = this.f24135;
        InterfaceC11536 interfaceC11536Mo5006 = C24963.f80840;
        for (InterfaceC11536 interfaceC11536 : interfaceC11536Arr) {
            interfaceC11536Mo5006 = interfaceC11536Mo5006.mo5006(interfaceC11536);
        }
        return interfaceC11536Mo5006;
    }
}
