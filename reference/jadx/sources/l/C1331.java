package l;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.֨᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 88WZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1331 implements InterfaceC19408 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char f5637;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f5639 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public LinkedList f5638 = new LinkedList();

    public C1331(char c) {
        this.f5637 = c;
    }

    @Override // l.InterfaceC19408
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final char mo4732() {
        return this.f5637;
    }

    @Override // l.InterfaceC19408
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char mo4729() {
        return this.f5637;
    }

    @Override // l.InterfaceC19408
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo4733() {
        return this.f5639;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4731(InterfaceC19408 interfaceC19408) {
        int iMo4733 = interfaceC19408.mo4733();
        LinkedList linkedList = this.f5638;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            InterfaceC19408 interfaceC19409 = (InterfaceC19408) listIterator.next();
            int iMo4734 = interfaceC19409.mo4733();
            if (iMo4733 > iMo4734) {
                listIterator.previous();
                listIterator.add(interfaceC19408);
                return;
            } else if (iMo4733 == iMo4734) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f5637 + "' and minimum length " + iMo4733 + "; conflicting processors: " + interfaceC19409 + ", " + interfaceC19408);
            }
        }
        linkedList.add(interfaceC19408);
        this.f5639 = iMo4733;
    }

    @Override // l.InterfaceC19408
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo4730(C15113 c15113, C15113 c15114) {
        int size = c15113.f49359.size();
        LinkedList<InterfaceC19408> linkedList = this.f5638;
        for (InterfaceC19408 interfaceC19408 : linkedList) {
            if (interfaceC19408.mo4733() <= size) {
                return interfaceC19408.mo4730(c15113, c15114);
            }
        }
        interfaceC19408 = (InterfaceC19408) linkedList.getFirst();
        return interfaceC19408.mo4730(c15113, c15114);
    }
}
