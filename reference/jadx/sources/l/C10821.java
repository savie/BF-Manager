package l;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۤۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X426 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10821 extends AbstractQueue {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public LinkedList f34303 = new LinkedList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22756 f34304;

    public C10821(C22756 c22756) {
        this.f34304 = c22756;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        C3168 c3168 = (C3168) obj;
        if (!this.f34303.offer(c3168)) {
            return false;
        }
        this.f34304.f73829.add(c3168);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f34303.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f34303.size();
    }

    @Override // java.util.Queue
    public final Object poll() {
        LinkedList linkedList = this.f34303;
        if (linkedList.size() == 0) {
            return null;
        }
        C3168 c3168 = (C3168) linkedList.remove(0);
        this.f34304.f73829.remove(c3168);
        return c3168;
    }

    @Override // java.util.Queue
    public final Object peek() {
        LinkedList linkedList = this.f34303;
        if (linkedList.size() == 0) {
            return null;
        }
        return (C3168) linkedList.get(0);
    }
}
