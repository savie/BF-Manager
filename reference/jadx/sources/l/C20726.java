package l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩷۟۟, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes4.dex */
public final class C20726 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f67448;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object f67449;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f67450;

    public C20726(Iterator it, Predicate predicate) {
        Object next;
        this.f67450 = it;
        this.f67448 = predicate;
        do {
            C15788 c15788 = (C15788) it;
            if (!c15788.hasNext()) {
                next = null;
                break;
            }
            next = c15788.next();
        } while (!this.f67448.test(next));
        this.f67449 = next;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f67449 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next;
        Object obj = this.f67449;
        do {
            C15788 c15788 = (C15788) this.f67450;
            if (!c15788.hasNext()) {
                next = null;
                break;
            }
            next = c15788.next();
        } while (!this.f67448.test(next));
        this.f67449 = next;
        return obj;
    }
}
