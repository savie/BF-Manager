package l;

import java.util.AbstractQueue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ܽۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: X426 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16617 extends AbstractQueue {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C16576 f53323 = new C16576();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public HashMap f53324;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public LinkedList f53325;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public LinkedList f53326;

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        C4603 c4603 = (C4603) obj;
        if (!this.f53325.add(c4603)) {
            return false;
        }
        if (this.f53326 == null) {
            return true;
        }
        m39077(c4603);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16617 m39076(C12343 c12343) {
        C16576 c16576 = f53323;
        C16617 c16617 = (C16617) c12343.m30656(c16576);
        if (c16617 != null) {
            return c16617;
        }
        C16617 c16618 = new C16617();
        c16618.f53325 = new LinkedList();
        c12343.m30659(c16576, c16618);
        return c16618;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f53325.iterator();
    }

    @Override // java.util.Queue
    public final Object peek() {
        LinkedList linkedList = this.f53325;
        if (linkedList.size() == 0) {
            return null;
        }
        return (C4603) linkedList.get(0);
    }

    @Override // java.util.Queue
    public final Object poll() {
        LinkedList linkedList = this.f53325;
        if (linkedList.size() == 0) {
            return null;
        }
        C4603 c4603 = (C4603) linkedList.remove(0);
        if (this.f53326 != null) {
            m39078(c4603);
        }
        return c4603;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f53325.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39079(HashSet hashSet) {
        Iterator it = this.f53325.iterator();
        while (it.hasNext()) {
            C4603 c4603 = (C4603) it.next();
            if (!hashSet.contains(c4603.f16295.f34725)) {
                if (this.f53326 != null) {
                    m39078(c4603);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedList m39080() {
        if (this.f53326 == null) {
            this.f53326 = new LinkedList();
            Iterator it = this.f53325.iterator();
            while (it.hasNext()) {
                m39077((C4603) it.next());
            }
        }
        return this.f53326;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39077(C4603 c4603) {
        InterfaceC2173 interfaceC2173 = c4603.f16295.f34725;
        if (this.f53324 == null) {
            this.f53324 = new HashMap();
        }
        C0388 c0388 = (C0388) this.f53324.get(interfaceC2173);
        if (c0388 == null) {
            c0388 = new C0388(this);
            this.f53324.put(interfaceC2173, c0388);
            this.f53326.add(c0388);
        }
        c0388.f1869.add(c4603);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m39078(C4603 c4603) {
        InterfaceC2173 interfaceC2173 = c4603.f16295.f34725;
        C0388 c0388 = (C0388) this.f53324.get(interfaceC2173);
        if (c0388 != null && c0388.f1869.remove(c4603) && c0388.isEmpty()) {
            this.f53324.remove(interfaceC2173);
            this.f53326.remove(c0388);
        }
    }
}
