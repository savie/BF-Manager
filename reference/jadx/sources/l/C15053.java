package l;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ܳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5Q6 */
/* JADX INFO: loaded from: classes4.dex */
public class C15053 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C21767 f49122;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21767 f49123;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final WeakHashMap f49125 = new WeakHashMap();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f49124 = 0;

    public C21767 get(Object obj) {
        C21767 c21767 = this.f49122;
        while (c21767 != null && !c21767.f69413.equals(obj)) {
            c21767 = c21767.f69415;
        }
        return c21767;
    }

    /* JADX INFO: renamed from: ᩷ */
    public Object mo20394(Object obj, Object obj2) {
        C21767 c21767 = get(obj);
        if (c21767 != null) {
            return c21767.f69412;
        }
        m36205(obj, obj2);
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21767 m36205(Object obj, Object obj2) {
        C21767 c21767 = new C21767(obj, obj2);
        this.f49124++;
        C21767 c21768 = this.f49123;
        if (c21768 == null) {
            this.f49122 = c21767;
            this.f49123 = c21767;
            return c21767;
        }
        c21768.f69415 = c21767;
        c21767.f69414 = c21768;
        this.f49123 = c21767;
        return c21767;
    }

    public Object remove(Object obj) {
        C21767 c21767 = get(obj);
        if (c21767 == null) {
            return null;
        }
        this.f49124--;
        WeakHashMap weakHashMap = this.f49125;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC19529) it.next()).mo27034(c21767);
            }
        }
        C21767 c21768 = c21767.f69414;
        if (c21768 != null) {
            c21768.f69415 = c21767.f69415;
        } else {
            this.f49122 = c21767.f69415;
        }
        C21767 c21769 = c21767.f69415;
        if (c21769 != null) {
            c21769.f69414 = c21768;
        } else {
            this.f49123 = c21768;
        }
        c21767.f69415 = null;
        c21767.f69414 = null;
        return c21767.f69412;
    }

    public final int size() {
        return this.f49124;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C14152 c14152 = new C14152(this.f49122, this.f49123);
        this.f49125.put(c14152, Boolean.FALSE);
        return c14152;
    }

    public final Iterator descendingIterator() {
        C4613 c4613 = new C4613(this.f49123, this.f49122);
        this.f49125.put(c4613, Boolean.FALSE);
        return c4613;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10578 m36206() {
        C10578 c10578 = new C10578(this);
        this.f49125.put(c10578, Boolean.FALSE);
        return c10578;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map.Entry m36207() {
        return this.f49122;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Map.Entry m36208() {
        return this.f49123;
    }

    public final boolean equals(Object obj) {
        AbstractC22513 abstractC22513;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15053)) {
            return false;
        }
        C15053 c15053 = (C15053) obj;
        if (this.f49124 != c15053.f49124) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c15053.iterator();
        while (true) {
            abstractC22513 = (AbstractC22513) it;
            if (!abstractC22513.hasNext()) {
                break;
            }
            AbstractC22513 abstractC22514 = (AbstractC22513) it2;
            if (!abstractC22514.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) abstractC22513.next();
            Object next = abstractC22514.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (abstractC22513.hasNext() || ((AbstractC22513) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            AbstractC22513 abstractC22513 = (AbstractC22513) it;
            if (!abstractC22513.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) abstractC22513.next()).hashCode();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            AbstractC22513 abstractC22513 = (AbstractC22513) it;
            if (abstractC22513.hasNext()) {
                sb.append(((Map.Entry) abstractC22513.next()).toString());
                if (abstractC22513.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
