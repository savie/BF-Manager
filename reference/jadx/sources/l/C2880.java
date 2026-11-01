package l;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۗ֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: UAYG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2880 implements InterfaceC22407 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f10863;

    public C2880(C21701 c21701) {
        this.f10863 = new AtomicReference(c21701);
    }

    @Override // l.InterfaceC22407
    public final Iterator iterator() {
        InterfaceC22407 interfaceC22407 = (InterfaceC22407) this.f10863.getAndSet(null);
        if (interfaceC22407 == null) {
            throw new IllegalStateException("This sequence can be consumed only once.");
        }
        return interfaceC22407.iterator();
    }
}
