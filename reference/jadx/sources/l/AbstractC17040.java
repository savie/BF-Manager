package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܺᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V52N */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17040 extends AbstractC4516 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f55683;

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo3004(Object obj);

    public AbstractC17040(Object obj) {
        this.f55683 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f55683 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f55683;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.f55683 = mo3004(obj);
        return obj;
    }
}
