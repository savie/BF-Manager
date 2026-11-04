package l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes3.dex */
public final class C9220 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f30039;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f30040;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f30041;

    public C9220(Iterator it, Predicate predicate) {
        Object next;
        this.f30041 = it;
        this.f30040 = predicate;
        do {
            C2509 c2509 = (C2509) it;
            if (!c2509.hasNext()) {
                next = null;
                break;
            }
            next = c2509.next();
        } while (!this.f30040.test(next));
        this.f30039 = next;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30039 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next;
        Object obj = this.f30039;
        do {
            C2509 c2509 = (C2509) this.f30041;
            if (!c2509.hasNext()) {
                next = null;
                break;
            }
            next = c2509.next();
        } while (!this.f30040.test(next));
        this.f30039 = next;
        return obj;
    }
}
