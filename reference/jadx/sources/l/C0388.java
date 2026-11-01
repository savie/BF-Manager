package l;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.֡ۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: X426 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0388 extends AbstractQueue {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public LinkedList f1869 = new LinkedList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16617 f1870;

    public C0388(C16617 c16617) {
        this.f1870 = c16617;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        C4603 c4603 = (C4603) obj;
        if (!this.f1869.offer(c4603)) {
            return false;
        }
        this.f1870.f53325.add(c4603);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f1869.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f1869.size();
    }

    @Override // java.util.Queue
    public final Object poll() {
        LinkedList linkedList = this.f1869;
        if (linkedList.size() == 0) {
            return null;
        }
        C4603 c4603 = (C4603) linkedList.remove(0);
        this.f1870.f53325.remove(c4603);
        return c4603;
    }

    @Override // java.util.Queue
    public final Object peek() {
        LinkedList linkedList = this.f1869;
        if (linkedList.size() == 0) {
            return null;
        }
        return (C4603) linkedList.get(0);
    }
}
