package l;

import java.util.LinkedList;

/* JADX INFO: renamed from: l.ܽ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1GV */
/* JADX INFO: loaded from: classes4.dex */
public final class C17853 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedList f58544 = new LinkedList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f58545;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long m41707() {
        return this.f58545;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m41709() {
        return !this.f58544.isEmpty();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17107 m41708() {
        LinkedList linkedList = this.f58544;
        if (linkedList.isEmpty()) {
            return null;
        }
        return (C17107) linkedList.getLast();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17107 m41706() {
        LinkedList linkedList = this.f58544;
        if (linkedList.isEmpty()) {
            return null;
        }
        this.f58545++;
        return (C17107) linkedList.removeLast();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41704(C17107 c17107) {
        this.f58545++;
        LinkedList linkedList = this.f58544;
        linkedList.addLast(c17107);
        if (linkedList.size() > 100) {
            linkedList.removeFirst();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41702() {
        LinkedList linkedList = this.f58544;
        if (!linkedList.isEmpty()) {
            this.f58545++;
        }
        linkedList.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41703(C6178 c6178) {
        c6178.writeInt(-1568513661);
        LinkedList<C17107> linkedList = this.f58544;
        c6178.mo17812(linkedList.size());
        for (C17107 c17107 : linkedList) {
            c6178.writeInt(c17107.f55832);
            c6178.writeInt(c17107.f55831);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41705(C20348 c20348) {
        this.f58545++;
        LinkedList linkedList = this.f58544;
        linkedList.clear();
        if (c20348.m46746(-1568513661)) {
            int iM46749 = c20348.m46749();
            for (int i = 0; i < iM46749; i++) {
                linkedList.addLast(new C17107(c20348.readInt(), c20348.readInt()));
            }
        }
    }
}
