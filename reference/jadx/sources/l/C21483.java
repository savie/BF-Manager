package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩶ᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A41S */
/* JADX INFO: loaded from: classes.dex */
public final class C21483 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14769 f68693;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f68693.isEmpty();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f68693.isEmpty()) {
            throw new NoSuchElementException();
        }
        C14769 c14769 = this.f68693;
        Object obj = c14769.f48335;
        this.f68693 = c14769.f48336;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
