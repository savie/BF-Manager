package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩻۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAYZ */
/* JADX INFO: loaded from: classes.dex */
public final class C24898 implements InterfaceC0812, Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f80570 = C5506.f19160;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC19479 f80571;

    public C24898(InterfaceC19479 interfaceC19479) {
        this.f80571 = interfaceC19479;
    }

    @Override // l.InterfaceC0812
    public final Object getValue() {
        if (this.f80570 == C5506.f19160) {
            InterfaceC19479 interfaceC19479 = this.f80571;
            C15243.m36586(interfaceC19479);
            this.f80570 = interfaceC19479.mo4064();
            this.f80571 = null;
        }
        return this.f80570;
    }

    public final String toString() {
        return this.f80570 != C5506.f19160 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new C9760(getValue());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
