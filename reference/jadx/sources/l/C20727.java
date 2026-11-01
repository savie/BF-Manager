package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩷۟۠, reason: contains not printable characters */
/* JADX INFO: compiled from: NAYZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20727 implements InterfaceC5204, Serializable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object f67451 = C8733.f30000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC4871 f67452;

    public C20727(InterfaceC4871 interfaceC4871) {
        this.f67452 = interfaceC4871;
    }

    @Override // l.InterfaceC5204
    public final Object getValue() {
        if (this.f67451 == C8733.f30000) {
            InterfaceC4871 interfaceC4871 = this.f67452;
            C13465.m32962(interfaceC4871);
            this.f67451 = interfaceC4871.mo3788();
            this.f67452 = null;
        }
        return this.f67451;
    }

    public final String toString() {
        return this.f67451 != C8733.f30000 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new C2381(getValue());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
