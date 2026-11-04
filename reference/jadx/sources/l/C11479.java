package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۧ۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56FA */
/* JADX INFO: loaded from: classes3.dex */
public final class C11479 implements Map {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f36105 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f36106;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12971 f36107;

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return (Map) this.f36106.put((C5514) obj, (Map) obj2);
    }

    public C11479(C12971 c12971, int i) {
        this.f36107 = c12971;
        this.f36106 = new HashMap(i);
    }

    @Override // java.util.Map
    public final void clear() {
        this.f36106.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f36106.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof C5514)) {
            return false;
        }
        return this.f36106.containsKey((C5514) obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f36106.entrySet();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return (Map) this.f36106.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f36106.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f36106.keySet();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f36106.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return (Map) this.f36106.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f36106.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f36106.values();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m28851() {
        return this.f36105;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap m28852(C2551 c2551) {
        ArrayList<C4869> arrayList;
        List list;
        List list2;
        C4869 c4869;
        C4869 c48610;
        HashMap map = new HashMap();
        LinkedList<C5514> linkedList = new LinkedList();
        HashMap map2 = this.f36106;
        Iterator it = map2.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.f36105;
            if (!zHasNext) {
                break;
            }
            C5514 c5514 = (C5514) it.next();
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    c4869 = null;
                    break;
                }
                c4869 = (C4869) it2.next();
            } while (c4869.m14926() != c5514);
            if (c4869 == null) {
                Map map3 = (Map) map2.get(c5514);
                ArrayList arrayList2 = new ArrayList(map3.size());
                for (C5514 c5515 : map3.keySet()) {
                    Iterator it3 = arrayList.iterator();
                    do {
                        if (!it3.hasNext()) {
                            c48610 = null;
                            break;
                        }
                        c48610 = (C4869) it3.next();
                    } while (c48610.m14926() != c5515);
                    if (c48610 == null || c48610.m14925() != c5514) {
                        C21943 c21943 = (C21943) map3.get(c5515);
                        if (c21943 == null) {
                            linkedList.add(c5515);
                        } else {
                            arrayList2.add(c21943);
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    C21943 c21943M52201 = C23231.m52201(arrayList2);
                    if (map.containsKey(c21943M52201)) {
                        ((List) map.get(c21943M52201)).add(c5514);
                    } else {
                        LinkedList linkedList2 = new LinkedList();
                        linkedList2.add(c5514);
                        map.put(c21943M52201, linkedList2);
                    }
                }
            }
        }
        loop4: for (C5514 c5516 : linkedList) {
            Iterator it4 = map.values().iterator();
            while (it4.hasNext()) {
                if (((List) it4.next()).contains(c5516)) {
                    break loop4;
                }
            }
            C21943 c21943M52159 = C23231.m52159((List) C23231.m52148(c2551, c5516.m16419(), true), false);
            if (c21943M52159 == null) {
                throw new C8597("Could not find bottom clean successor for isolated try edge");
            }
            if (map.containsKey(c21943M52159)) {
                list2 = (List) map.get(c21943M52159);
            } else {
                LinkedList linkedList3 = new LinkedList();
                map.put(c21943M52159, linkedList3);
                list2 = linkedList3;
            }
            list2.add(c5516);
        }
        if (map.size() == 1) {
            for (C4869 c48611 : arrayList) {
                C5514 c5517 = (C5514) c48611.m14925();
                C5514 c5518 = (C5514) c48611.m14926();
                boolean zM16418 = c5517.m16418();
                C12971 c12971 = this.f36107;
                if (!zM16418 || c12971.m32377().contains(c5517.m16417())) {
                    if (!c5518.m16418() || c12971.m32377().contains(c5518.m16417())) {
                        if (!c5517.m16420() || !c5518.m16420()) {
                            for (List list3 : map.values()) {
                                if (list3.contains(c5517)) {
                                    list3.remove(c5517);
                                }
                            }
                            C21943 c21944 = (C21943) ((Map) map2.get(c5517)).get(c5518);
                            if (!map.containsKey(c21944)) {
                                LinkedList linkedList4 = new LinkedList();
                                linkedList4.add(c5517);
                                map.put(c21944, linkedList4);
                                list = linkedList4;
                            } else {
                                list = (List) map.get(c21944);
                            }
                            list.add(c5518);
                        }
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28853(HashMap map) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(map.entrySet());
        LinkedList linkedList = new LinkedList();
        int i = 0;
        while (i < arrayList2.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                linkedList.add(new C4869(new C1785((C5514) ((Map.Entry) arrayList2.get(i)).getKey(), (C21943) ((Map.Entry) arrayList2.get(i)).getValue()), new C1785((C5514) ((Map.Entry) arrayList2.get(i3)).getKey(), (C21943) ((Map.Entry) arrayList2.get(i3)).getValue())));
            }
            i = i2;
        }
        HashMap map2 = new HashMap(map);
        int i4 = 0;
        while (true) {
            int size = linkedList.size();
            arrayList = this.f36105;
            if (i4 >= size) {
                break;
            }
            C4869 c4869 = (C4869) linkedList.get(i4);
            C1785 c1785 = (C1785) c4869.m14925();
            C1785 c1786 = (C1785) c4869.m14926();
            C21943 c21943 = c1785.f6091;
            C21943 c21944 = c1786.f6091;
            if (C23231.m52193(c21943, c21944) || C23231.m52193(c21944, c21943)) {
                Object[] objArr = {c21943, c21944};
                ArrayList arrayList3 = new ArrayList(2);
                int iM9136 = 0;
                while (iM9136 < 2) {
                    Object obj = objArr[iM9136];
                    iM9136 = C2764.m9136(obj, arrayList3, obj, iM9136, 1);
                }
                C21943 c21943M52159 = C23231.m52159(C4681.unmodifiableList(arrayList3), false);
                C5514 c5514 = c21943 != c21943M52159 ? c1785.f6092 : c1786.f6092;
                C5514 c5515 = c21943 == c21943M52159 ? c1785.f6092 : c1786.f6092;
                map2.remove(c5514);
                linkedList.remove(i4);
                arrayList.add(new C4869(c5515, c5514));
            } else {
                i4++;
            }
        }
        for (C5514 c5516 : map.keySet()) {
            C21943 c21945 = (C21943) map.get(c5516);
            HashMap map3 = new HashMap(map.size() - 1);
            for (C5514 c5517 : map.keySet()) {
                if (c5516 != c5517) {
                    C21943 c21943M49648 = (C21943) map.get(c5517);
                    boolean z = c5516.m16418() || c5517.m16418();
                    if (c21943M49648 != c21945 || !z) {
                        c21943M49648.getClass();
                        EnumC1763 enumC1763 = EnumC1763.MTH_EXIT_BLOCK;
                        if (c21943M49648.mo17865(enumC1763)) {
                            map3.put(c5517, c21943M49648);
                            arrayList.clear();
                        } else {
                            c21945.getClass();
                            if (c21945.mo17865(enumC1763)) {
                                map3.put(c5517, c21945);
                                arrayList.clear();
                            } else {
                                BitSet bitSet = (BitSet) c21945.m49637().clone();
                                BitSet bitSetM49637 = c21943M49648.m49637();
                                if (!bitSet.isEmpty() && !bitSetM49637.isEmpty()) {
                                    bitSet.and(bitSetM49637);
                                    LinkedList linkedList2 = new LinkedList();
                                    for (C21943 c21943M49649 = c21945; c21943M49649 != null; c21943M49649 = c21943M49649.m49648()) {
                                        linkedList2.add(c21943M49649);
                                    }
                                    while (true) {
                                        if (c21943M49648 == null) {
                                            c21943M49648 = null;
                                            break;
                                        } else if (linkedList2.contains(c21943M49648)) {
                                            break;
                                        } else {
                                            c21943M49648 = c21943M49648.m49648();
                                        }
                                    }
                                    map3.put(c5517, c21943M49648);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
