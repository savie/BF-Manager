package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.᩵۟۠, reason: contains not printable characters */
/* JADX INFO: compiled from: VAXH */
/* JADX INFO: loaded from: classes5.dex */
public final class C19316 implements InterfaceC5204, Serializable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC4871 f62317;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile Object f62316 = C8733.f30000;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Object f62315 = this;

    public C19316(InterfaceC4871 interfaceC4871) {
        this.f62317 = interfaceC4871;
    }

    @Override // l.InterfaceC5204
    public final Object getValue() {
        Object objMo3788;
        Object obj = this.f62316;
        C8733 c8733 = C8733.f30000;
        if (obj != c8733) {
            return obj;
        }
        synchronized (this.f62315) {
            objMo3788 = this.f62316;
            if (objMo3788 == c8733) {
                InterfaceC4871 interfaceC4871 = this.f62317;
                C13465.m32962(interfaceC4871);
                objMo3788 = interfaceC4871.mo3788();
                this.f62316 = objMo3788;
                this.f62317 = null;
            }
        }
        return objMo3788;
    }

    public final String toString() {
        return this.f62316 != C8733.f30000 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new C2381(getValue());
    }
}
