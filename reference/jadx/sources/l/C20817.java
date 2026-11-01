package l;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩷ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8BO */
/* JADX INFO: loaded from: classes4.dex */
public final class C20817 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TreeMap f67659 = new TreeMap();

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized List m46815(C15879 c15879) {
        List list;
        if (this.f67659.isEmpty()) {
            list = null;
        } else {
            C15879 c158710 = (C15879) this.f67659.firstKey();
            if (c158710.compareTo(c15879) <= 0) {
                list = (List) this.f67659.remove(c158710);
            } else {
                list = null;
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m46816(C15879 c15879, InterfaceC7411 interfaceC7411) {
        List linkedList = (List) this.f67659.get(c15879);
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.f67659.put(c15879, linkedList);
        }
        linkedList.add(interfaceC7411);
    }
}
