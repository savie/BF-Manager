package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۫۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAXH */
/* JADX INFO: loaded from: classes4.dex */
public final class C12963 implements InterfaceC0812, Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile Object f41561 = C5506.f19160;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f41562 = this;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC19479 f41563;

    public C12963(InterfaceC19479 interfaceC19479) {
        this.f41563 = interfaceC19479;
    }

    @Override // l.InterfaceC0812
    public final Object getValue() {
        Object objMo4064;
        Object obj = this.f41561;
        C5506 c5506 = C5506.f19160;
        if (obj != c5506) {
            return obj;
        }
        synchronized (this.f41562) {
            objMo4064 = this.f41561;
            if (objMo4064 == c5506) {
                InterfaceC19479 interfaceC19479 = this.f41563;
                C15243.m36586(interfaceC19479);
                objMo4064 = interfaceC19479.mo4064();
                this.f41561 = objMo4064;
                this.f41563 = null;
            }
        }
        return objMo4064;
    }

    public final String toString() {
        return this.f41561 != C5506.f19160 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new C9760(getValue());
    }
}
