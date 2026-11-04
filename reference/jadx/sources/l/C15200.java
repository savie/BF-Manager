package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ܳ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAXH */
/* JADX INFO: loaded from: classes5.dex */
public final class C15200 implements InterfaceC0812, Serializable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f49613 = AtomicReferenceFieldUpdater.newUpdater(C15200.class, Object.class, "ܰ");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile Object f49614 = C5506.f19160;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC19479 f49615;

    public C15200(InterfaceC19479 interfaceC19479) {
        this.f49615 = interfaceC19479;
    }

    @Override // l.InterfaceC0812
    public final Object getValue() {
        Object obj = this.f49614;
        C5506 c5506 = C5506.f19160;
        if (obj != c5506) {
            return obj;
        }
        InterfaceC19479 interfaceC19479 = this.f49615;
        if (interfaceC19479 != null) {
            Object objMo4064 = interfaceC19479.mo4064();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f49613;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c5506, objMo4064)) {
                if (atomicReferenceFieldUpdater.get(this) != c5506) {
                }
            }
            this.f49615 = null;
            return objMo4064;
        }
        return this.f49614;
    }

    public final String toString() {
        return this.f49614 != C5506.f19160 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new C9760(getValue());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
