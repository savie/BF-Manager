package l;

import com.alipay.sdk.m.y.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.۬ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBH9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14011 extends C20222 implements Comparable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C14011 f44380;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TreeMap f44381 = new TreeMap();

    static {
        C14011 c14011 = new C14011();
        f44380 = c14011;
        c14011.mo15005();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14011 m34102(C14011 c14011, C8791 c8791) {
        C14011 c14012 = new C14011();
        c14012.m34104(c14011);
        c14012.m34103(c8791);
        c14012.mo15005();
        return c14012;
    }

    public final int hashCode() {
        return this.f44381.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14011) {
            return this.f44381.equals(((C14011) obj).f44381);
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C14011 c14011) {
        Iterator it = this.f44381.values().iterator();
        Iterator it2 = c14011.f44381.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iM23586 = ((C8791) it.next()).compareTo((C8791) it2.next());
            if (iM23586 != 0) {
                return iM23586;
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
        for (C8791 c8791 : this.f44381.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c8791.mo1843());
        }
        sb.append(l.d);
        return sb.toString();
    }

    public final int size() {
        return this.f44381.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34103(C8791 c8791) {
        m46490();
        if (c8791 == null) {
            throw new NullPointerException("annotation == null");
        }
        C1028 type = c8791.getType();
        TreeMap treeMap = this.f44381;
        if (treeMap.containsKey(type)) {
            throw new IllegalArgumentException("duplicate type: " + type.mo1843());
        }
        treeMap.put(type, c8791);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34104(C14011 c14011) {
        m46490();
        if (c14011 == null) {
            throw new NullPointerException("toAdd == null");
        }
        Iterator it = c14011.f44381.values().iterator();
        while (it.hasNext()) {
            m34103((C8791) it.next());
        }
    }

    public final Collection getAnnotations() {
        return C4681.unmodifiableCollection(this.f44381.values());
    }
}
