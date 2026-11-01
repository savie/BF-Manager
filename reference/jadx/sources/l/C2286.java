package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۖۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L978 */
/* JADX INFO: loaded from: classes2.dex */
public class C2286 implements Map {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC21803 f8162;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f8161 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f8158 = 16;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f8159 = (int) Math.floor(((double) 16) * 0.75d);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public LinkedList[] f8160 = new LinkedList[8];

    public C2286(AbstractC21803 abstractC21803) {
        this.f8162 = abstractC21803;
    }

    @Override // java.util.Map
    public final void clear() {
        int i = this.f8158;
        this.f8160 = new LinkedList[i];
        this.f8161 = 0;
        this.f8159 = (int) Math.floor(((double) i) * 0.75d);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        AbstractC21803 abstractC21803 = this.f8162;
        int iMo14892 = abstractC21803.mo14892(obj);
        LinkedList[] linkedListArr = this.f8160;
        LinkedList<C11460> linkedList = linkedListArr[iMo14892 & (linkedListArr.length - 1)];
        if (linkedList == null) {
            return null;
        }
        for (C11460 c11460 : linkedList) {
            if (abstractC21803.mo14893(c11460.f38568, obj)) {
                return c11460.f38569;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        C11460 c11460;
        if (obj == null) {
            return null;
        }
        int i = this.f8161;
        if (i > this.f8159) {
            LinkedList[] linkedListArr = this.f8160;
            int length = linkedListArr.length * 2;
            this.f8160 = new LinkedList[length];
            this.f8159 = (int) (((double) length) * 0.75d);
            for (LinkedList linkedList : linkedListArr) {
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext() && (c11460 = (C11460) it.next()) != null) {
                        put(c11460.f38568, c11460.f38569);
                    }
                }
            }
            this.f8161 = i;
        }
        AbstractC21803 abstractC21803 = this.f8162;
        int iMo14892 = abstractC21803.mo14892(obj);
        LinkedList[] linkedListArr2 = this.f8160;
        int length2 = iMo14892 & (linkedListArr2.length - 1);
        LinkedList<C11460> linkedList2 = linkedListArr2[length2];
        if (linkedList2 == null) {
            linkedList2 = new LinkedList();
            linkedListArr2[length2] = linkedList2;
        }
        for (C11460 c11461 : linkedList2) {
            if (abstractC21803.mo14893(c11461.f38568, obj)) {
                Object obj3 = c11461.f38569;
                c11461.f38569 = obj2;
                this.f8161++;
                return obj3;
            }
        }
        linkedList2.add(new C11460(obj, obj2));
        this.f8161++;
        return null;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Collection values() {
        ArrayList arrayList = new ArrayList(this.f8161);
        for (LinkedList linkedList : this.f8160) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C11460) it.next()).f38569);
                }
            }
        }
        return arrayList;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int hashCode() {
        C11460 c11460;
        int iM13217 = 0;
        for (LinkedList linkedList : this.f8160) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext() && (c11460 = (C11460) it.next()) != null) {
                    iM13217 = C4758.m13217(iM13217, this.f8162.mo14892(c11460.f38568));
                }
            }
        }
        return C4758.m13213(iM13217, this.f8161);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f8161;
    }

    public final String toString() {
        C11460 c11460;
        if (this.f8161 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (LinkedList linkedList : this.f8160) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext() && (c11460 = (C11460) it.next()) != null) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(c11460.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f8161 == 0;
    }
}
