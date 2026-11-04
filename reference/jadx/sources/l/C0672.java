package l;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.֡᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88WZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C0672 implements InterfaceC21907 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char f2547;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f2549 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public LinkedList f2548 = new LinkedList();

    public C0672(char c) {
        this.f2547 = c;
    }

    @Override // l.InterfaceC21907
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final char mo2907() {
        return this.f2547;
    }

    @Override // l.InterfaceC21907
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char mo2904() {
        return this.f2547;
    }

    @Override // l.InterfaceC21907
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo2908() {
        return this.f2549;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2906(InterfaceC21907 interfaceC21907) {
        int iMo2908 = interfaceC21907.mo2908();
        LinkedList linkedList = this.f2548;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            InterfaceC21907 interfaceC21908 = (InterfaceC21907) listIterator.next();
            int iMo2909 = interfaceC21908.mo2908();
            if (iMo2908 > iMo2909) {
                listIterator.previous();
                listIterator.add(interfaceC21907);
                return;
            } else if (iMo2908 == iMo2909) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f2547 + "' and minimum length " + iMo2908 + "; conflicting processors: " + interfaceC21908 + ", " + interfaceC21907);
            }
        }
        linkedList.add(interfaceC21907);
        this.f2549 = iMo2908;
    }

    @Override // l.InterfaceC21907
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo2905(C2711 c2711, C2711 c2712) {
        int size = c2711.f9055.size();
        LinkedList<InterfaceC21907> linkedList = this.f2548;
        for (InterfaceC21907 interfaceC21907 : linkedList) {
            if (interfaceC21907.mo2908() <= size) {
                return interfaceC21907.mo2905(c2711, c2712);
            }
        }
        interfaceC21907 = (InterfaceC21907) linkedList.getFirst();
        return interfaceC21907.mo2905(c2711, c2712);
    }
}
