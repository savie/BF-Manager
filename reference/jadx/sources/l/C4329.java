package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L42O */
/* JADX INFO: loaded from: classes2.dex */
public final class C4329 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14769 f15681;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15681.f48336 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C14769 c14769 = this.f15681;
        C14769 c147610 = c14769.f48336;
        if (c147610 == null) {
            throw new NoSuchElementException();
        }
        Object obj = c14769.f48335;
        this.f15681 = c147610;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
