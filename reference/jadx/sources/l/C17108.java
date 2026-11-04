package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܺ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7IUA */
/* JADX INFO: loaded from: classes4.dex */
public final class C17108 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943[] m40274(ArrayList arrayList, Function function) {
        int id;
        C21943 c21943;
        int size = arrayList.size();
        C21943[] c21943Arr = new C21943[size];
        c21943Arr[0] = (C21943) arrayList.get(0);
        boolean z = true;
        while (z) {
            z = false;
            for (int i = 1; i < size; i++) {
                C21943 c21944 = (C21943) arrayList.get(i);
                List<C21943> list = (List) function.apply(c21944);
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        id = -1;
                        c21943 = null;
                        break;
                    }
                    c21943 = (C21943) it.next();
                    id = c21943.getId();
                } while (c21943Arr[id] == null);
                if (c21943 == null) {
                    throw new C8597("No immediate dominator for block: " + c21944);
                }
                for (C21943 c21945 : list) {
                    int id2 = c21945.getId();
                    if (id2 != id && c21943Arr[id2] != null) {
                        int id3 = c21945.getId();
                        int id4 = c21943.getId();
                        while (id3 != id4) {
                            while (id3 > id4) {
                                id3 = c21943Arr[id3].getId();
                            }
                            while (id4 > id3) {
                                id4 = c21943Arr[id4].getId();
                            }
                        }
                        c21943 = (C21943) arrayList.get(id3);
                    }
                }
                if (c21943Arr[i] != c21943) {
                    c21943Arr[i] = c21943;
                    z = true;
                }
            }
        }
        return c21943Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static BitSet m40272(C21943[] c21943Arr, C21943 c21943) {
        BitSet bitSet = new BitSet(c21943Arr.length);
        while (true) {
            int id = c21943.getId();
            if (bitSet.get(id)) {
                return bitSet;
            }
            bitSet.set(id);
            BitSet bitSetM49651 = c21943.m49651();
            if (bitSetM49651 != null) {
                bitSet.or(bitSetM49651);
                return bitSet;
            }
            c21943 = c21943Arr[id];
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40273(C2551 c2551) {
        List<C21943> listM8508 = c2551.m8508();
        Iterator it = listM8508.iterator();
        while (it.hasNext()) {
            ((C21943) it.next()).m49634((BitSet) null);
        }
        int size = listM8508.size();
        for (C21943 c21943 : listM8508) {
            List<C21943> listM49643 = c21943.m49643();
            if (listM49643.size() >= 2) {
                C21943 c21943M49642 = c21943.m49642();
                for (C21943 c21943M49643 : listM49643) {
                    for (; c21943M49643 != c21943M49642; c21943M49643 = c21943M49643.m49642()) {
                        BitSet bitSetM49638 = c21943M49643.m49638();
                        if (bitSetM49638 == null) {
                            bitSetM49638 = new BitSet(size);
                            c21943M49643.m49634(bitSetM49638);
                        }
                        bitSetM49638.set(c21943.getId());
                    }
                }
            }
        }
        for (C21943 c21944 : listM8508) {
            BitSet bitSetM49639 = c21944.m49638();
            if (bitSetM49639 == null || bitSetM49639.isEmpty()) {
                c21944.m49634(C20247.f65032);
            }
        }
    }
}
