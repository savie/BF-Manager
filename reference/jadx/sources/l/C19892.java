package l;

import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩶ۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1GV */
/* JADX INFO: loaded from: classes4.dex */
public final class C19892 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedList f63783 = new LinkedList();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m45150() {
        return !this.f63783.isEmpty();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15659 m45156() {
        LinkedList linkedList = this.f63783;
        if (linkedList.isEmpty()) {
            return null;
        }
        return (C15659) linkedList.getLast();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15659 m45155() {
        LinkedList linkedList = this.f63783;
        if (linkedList.isEmpty()) {
            return null;
        }
        return (C15659) linkedList.removeLast();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45153(C15659 c15659) {
        LinkedList linkedList = this.f63783;
        linkedList.addLast(c15659);
        if (linkedList.size() > 100) {
            linkedList.removeFirst();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45151() {
        this.f63783.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45152(C11018 c11018) {
        c11018.writeInt(-1568513661);
        LinkedList<C15659> linkedList = this.f63783;
        c11018.mo24508(linkedList.size());
        for (C15659 c15659 : linkedList) {
            c11018.writeInt(c15659.f50867);
            c11018.writeInt(c15659.f50866);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45154(C17367 c17367) {
        LinkedList linkedList = this.f63783;
        linkedList.clear();
        if (c17367.m40447(-1568513661)) {
            int iM40462 = c17367.m40462();
            for (int i = 0; i < iM40462; i++) {
                linkedList.addLast(new C15659(c17367.readInt(), c17367.readInt()));
            }
        }
    }
}
