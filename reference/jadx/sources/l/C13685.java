package l;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N5Q6 */
/* JADX INFO: loaded from: classes3.dex */
public class C13685 implements Iterable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C1998 f45147;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C1998 f45148;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final WeakHashMap f45149 = new WeakHashMap();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f45146 = 0;

    public C1998 get(Object obj) {
        C1998 c1998 = this.f45148;
        while (c1998 != null && !c1998.f7458.equals(obj)) {
            c1998 = c1998.f7460;
        }
        return c1998;
    }

    /* JADX INFO: renamed from: ܰ */
    public Object mo28103(Object obj, Object obj2) {
        C1998 c1998 = get(obj);
        if (c1998 != null) {
            return c1998.f7459;
        }
        m33391(obj, obj2);
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1998 m33391(Object obj, Object obj2) {
        C1998 c1998 = new C1998(obj, obj2);
        this.f45146++;
        C1998 c1999 = this.f45147;
        if (c1999 == null) {
            this.f45148 = c1998;
            this.f45147 = c1998;
            return c1998;
        }
        c1999.f7460 = c1998;
        c1998.f7457 = c1999;
        this.f45147 = c1998;
        return c1998;
    }

    public Object remove(Object obj) {
        C1998 c1998 = get(obj);
        if (c1998 == null) {
            return null;
        }
        this.f45146--;
        WeakHashMap weakHashMap = this.f45149;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC4511) it.next()).mo10109(c1998);
            }
        }
        C1998 c1999 = c1998.f7457;
        if (c1999 != null) {
            c1999.f7460 = c1998.f7460;
        } else {
            this.f45148 = c1998.f7460;
        }
        C1998 c19910 = c1998.f7460;
        if (c19910 != null) {
            c19910.f7457 = c1999;
        } else {
            this.f45147 = c1999;
        }
        c1998.f7460 = null;
        c1998.f7457 = null;
        return c1998.f7459;
    }

    public final int size() {
        return this.f45146;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C23872 c23872 = new C23872(this.f45148, this.f45147);
        this.f45149.put(c23872, Boolean.FALSE);
        return c23872;
    }

    public final Iterator descendingIterator() {
        C14700 c14700 = new C14700(this.f45147, this.f45148);
        this.f45149.put(c14700, Boolean.FALSE);
        return c14700;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9761 m33392() {
        C9761 c9761 = new C9761(this);
        this.f45149.put(c9761, Boolean.FALSE);
        return c9761;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map.Entry m33393() {
        return this.f45148;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Map.Entry m33390() {
        return this.f45147;
    }

    public final boolean equals(Object obj) {
        AbstractC3409 abstractC3409;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13685)) {
            return false;
        }
        C13685 c13685 = (C13685) obj;
        if (this.f45146 != c13685.f45146) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c13685.iterator();
        while (true) {
            abstractC3409 = (AbstractC3409) it;
            if (!abstractC3409.hasNext()) {
                break;
            }
            AbstractC3409 abstractC34010 = (AbstractC3409) it2;
            if (!abstractC34010.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) abstractC3409.next();
            Object next = abstractC34010.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (abstractC3409.hasNext() || ((AbstractC3409) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            AbstractC3409 abstractC3409 = (AbstractC3409) it;
            if (!abstractC3409.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) abstractC3409.next()).hashCode();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            AbstractC3409 abstractC3409 = (AbstractC3409) it;
            if (abstractC3409.hasNext()) {
                sb.append(((Map.Entry) abstractC3409.next()).toString());
                if (abstractC3409.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
