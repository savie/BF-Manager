package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۛ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L978 */
/* JADX INFO: loaded from: classes3.dex */
public class C6705 implements Map {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC4279 f22301;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f22297 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f22300 = 16;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f22298 = (int) Math.floor(((double) 16) * 0.75d);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public LinkedList[] f22299 = new LinkedList[8];

    public C6705(AbstractC4279 abstractC4279) {
        this.f22301 = abstractC4279;
    }

    @Override // java.util.Map
    public final void clear() {
        int i = this.f22300;
        this.f22299 = new LinkedList[i];
        this.f22297 = 0;
        this.f22298 = (int) Math.floor(((double) i) * 0.75d);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        AbstractC4279 abstractC4279 = this.f22301;
        int iMo13639 = abstractC4279.mo13639(obj);
        LinkedList[] linkedListArr = this.f22299;
        LinkedList<C12670> linkedList = linkedListArr[iMo13639 & (linkedListArr.length - 1)];
        if (linkedList == null) {
            return null;
        }
        for (C12670 c12670 : linkedList) {
            if (abstractC4279.mo13640(c12670.f40593, obj)) {
                return c12670.f40594;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        C12670 c12670;
        if (obj == null) {
            return null;
        }
        int i = this.f22297;
        if (i > this.f22298) {
            LinkedList[] linkedListArr = this.f22299;
            int length = linkedListArr.length * 2;
            this.f22299 = new LinkedList[length];
            this.f22298 = (int) (((double) length) * 0.75d);
            for (LinkedList linkedList : linkedListArr) {
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext() && (c12670 = (C12670) it.next()) != null) {
                        put(c12670.f40593, c12670.f40594);
                    }
                }
            }
            this.f22297 = i;
        }
        AbstractC4279 abstractC4279 = this.f22301;
        int iMo13639 = abstractC4279.mo13639(obj);
        LinkedList[] linkedListArr2 = this.f22299;
        int length2 = iMo13639 & (linkedListArr2.length - 1);
        LinkedList<C12670> linkedList2 = linkedListArr2[length2];
        if (linkedList2 == null) {
            linkedList2 = new LinkedList();
            linkedListArr2[length2] = linkedList2;
        }
        for (C12670 c12671 : linkedList2) {
            if (abstractC4279.mo13640(c12671.f40593, obj)) {
                Object obj3 = c12671.f40594;
                c12671.f40594 = obj2;
                this.f22297++;
                return obj3;
            }
        }
        linkedList2.add(new C12670(obj, obj2));
        this.f22297++;
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
        ArrayList arrayList = new ArrayList(this.f22297);
        for (LinkedList linkedList : this.f22299) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C12670) it.next()).f40594);
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
        C12670 c12670;
        int iM19447 = 0;
        for (LinkedList linkedList : this.f22299) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext() && (c12670 = (C12670) it.next()) != null) {
                    iM19447 = C7103.m19447(iM19447, this.f22301.mo13639(c12670.f40593));
                }
            }
        }
        return C7103.m19444(iM19447, this.f22297);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f22297;
    }

    public final String toString() {
        C12670 c12670;
        if (this.f22297 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (LinkedList linkedList : this.f22299) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext() && (c12670 = (C12670) it.next()) != null) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(c12670.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f22297 == 0;
    }
}
