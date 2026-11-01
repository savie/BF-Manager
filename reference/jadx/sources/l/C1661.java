package l;

import com.alipay.sdk.m.y.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.֫ۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBH9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1661 extends C18947 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C1661 f6627;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TreeMap f6628 = new TreeMap();

    static {
        C1661 c1661 = new C1661();
        f6627 = c1661;
        c1661.mo9637();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1661 m5564(C1661 c1661, C23535 c23535) {
        C1661 c1662 = new C1661();
        c1662.m5565(c1661);
        c1662.m5566(c23535);
        c1662.mo9637();
        return c1662;
    }

    public final int hashCode() {
        return this.f6628.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1661) {
            return this.f6628.equals(((C1661) obj).f6628);
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C1661 c1661) {
        Iterator it = this.f6628.values().iterator();
        Iterator it2 = c1661.f6628.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iM51859 = ((C23535) it.next()).compareTo((C23535) it2.next());
            if (iM51859 != 0) {
                return iM51859;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("annotations{");
        boolean z = true;
        for (C23535 c23535 : this.f6628.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c23535.mo2376());
        }
        sb.append(l.d);
        return sb.toString();
    }

    public final int size() {
        return this.f6628.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5566(C23535 c23535) {
        m43641();
        if (c23535 == null) {
            throw new NullPointerException("annotation == null");
        }
        C6143 type = c23535.getType();
        TreeMap treeMap = this.f6628;
        if (treeMap.containsKey(type)) {
            throw new IllegalArgumentException("duplicate type: " + type.mo2376());
        }
        treeMap.put(type, c23535);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5565(C1661 c1661) {
        m43641();
        if (c1661 == null) {
            throw new NullPointerException("toAdd == null");
        }
        Iterator it = c1661.f6628.values().iterator();
        while (it.hasNext()) {
            m5566((C23535) it.next());
        }
    }

    public final Collection getAnnotations() {
        return C0561.unmodifiableCollection(this.f6628.values());
    }
}
