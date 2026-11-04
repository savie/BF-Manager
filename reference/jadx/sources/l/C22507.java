package l;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩸ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UAYG */
/* JADX INFO: loaded from: classes.dex */
public final class C22507 implements InterfaceC1624 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f72815;

    public C22507(C3115 c3115) {
        this.f72815 = new AtomicReference(c3115);
    }

    @Override // l.InterfaceC1624
    public final Iterator iterator() {
        InterfaceC1624 interfaceC1624 = (InterfaceC1624) this.f72815.getAndSet(null);
        if (interfaceC1624 == null) {
            throw new IllegalStateException("This sequence can be consumed only once.");
        }
        return interfaceC1624.iterator();
    }
}
