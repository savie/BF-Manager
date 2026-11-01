package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.۠۟۠, reason: contains not printable characters */
/* JADX INFO: compiled from: VAXH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8027 implements InterfaceC5204, Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f26284 = AtomicReferenceFieldUpdater.newUpdater(C8027.class, Object.class, "ܺ");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile Object f26285 = C8733.f30000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC4871 f26286;

    public C8027(InterfaceC4871 interfaceC4871) {
        this.f26286 = interfaceC4871;
    }

    @Override // l.InterfaceC5204
    public final Object getValue() {
        Object obj = this.f26285;
        C8733 c8733 = C8733.f30000;
        if (obj != c8733) {
            return obj;
        }
        InterfaceC4871 interfaceC4871 = this.f26286;
        if (interfaceC4871 != null) {
            Object objMo3788 = interfaceC4871.mo3788();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26284;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c8733, objMo3788)) {
                if (atomicReferenceFieldUpdater.get(this) != c8733) {
                }
            }
            this.f26286 = null;
            return objMo3788;
        }
        return this.f26285;
    }

    public final String toString() {
        return this.f26285 != C8733.f30000 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new C2381(getValue());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
