package l;

import java.util.AbstractQueue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩸ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X426 */
/* JADX INFO: loaded from: classes.dex */
public final class C22756 extends AbstractQueue {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C13477 f73828 = new C13477();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public LinkedList f73829;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f73830;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public LinkedList f73831;

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        C3168 c3168 = (C3168) obj;
        if (!this.f73829.add(c3168)) {
            return false;
        }
        if (this.f73831 == null) {
            return true;
        }
        m51292(c3168);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22756 m51291(C4747 c4747) {
        C13477 c13477 = f73828;
        C22756 c22756 = (C22756) c4747.m14643(c13477);
        if (c22756 != null) {
            return c22756;
        }
        C22756 c22757 = new C22756();
        c22757.f73829 = new LinkedList();
        c4747.m14646(c13477, c22757);
        return c22757;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f73829.iterator();
    }

    @Override // java.util.Queue
    public final Object peek() {
        LinkedList linkedList = this.f73829;
        if (linkedList.size() == 0) {
            return null;
        }
        return (C3168) linkedList.get(0);
    }

    @Override // java.util.Queue
    public final Object poll() {
        LinkedList linkedList = this.f73829;
        if (linkedList.size() == 0) {
            return null;
        }
        C3168 c3168 = (C3168) linkedList.remove(0);
        if (this.f73831 != null) {
            m51293(c3168);
        }
        return c3168;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f73829.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51294(HashSet hashSet) {
        Iterator it = this.f73829.iterator();
        while (it.hasNext()) {
            C3168 c3168 = (C3168) it.next();
            if (!hashSet.contains(c3168.f10275.f61856)) {
                if (this.f73831 != null) {
                    m51293(c3168);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedList m51295() {
        if (this.f73831 == null) {
            this.f73831 = new LinkedList();
            Iterator it = this.f73829.iterator();
            while (it.hasNext()) {
                m51292((C3168) it.next());
            }
        }
        return this.f73831;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51292(C3168 c3168) {
        InterfaceC15976 interfaceC15976 = c3168.f10275.f61856;
        if (this.f73830 == null) {
            this.f73830 = new HashMap();
        }
        C10821 c10821 = (C10821) this.f73830.get(interfaceC15976);
        if (c10821 == null) {
            c10821 = new C10821(this);
            this.f73830.put(interfaceC15976, c10821);
            this.f73831.add(c10821);
        }
        c10821.f34303.add(c3168);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m51293(C3168 c3168) {
        InterfaceC15976 interfaceC15976 = c3168.f10275.f61856;
        C10821 c10821 = (C10821) this.f73830.get(interfaceC15976);
        if (c10821 != null && c10821.f34303.remove(c3168) && c10821.isEmpty()) {
            this.f73830.remove(interfaceC15976);
            this.f73831.remove(c10821);
        }
    }
}
