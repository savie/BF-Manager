package l;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.۬ۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8BO */
/* JADX INFO: loaded from: classes4.dex */
public final class C13682 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TreeMap f43426 = new TreeMap();

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized List m33472(C4930 c4930) {
        List list;
        if (this.f43426.isEmpty()) {
            list = null;
        } else {
            C4930 c4931 = (C4930) this.f43426.firstKey();
            if (c4931.compareTo(c4930) <= 0) {
                list = (List) this.f43426.remove(c4931);
            } else {
                list = null;
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m33473(C4930 c4930, InterfaceC6971 interfaceC6971) {
        List linkedList = (List) this.f43426.get(c4930);
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.f43426.put(c4930, linkedList);
        }
        linkedList.add(interfaceC6971);
    }
}
