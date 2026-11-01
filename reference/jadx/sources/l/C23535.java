package l;

import com.alipay.sdk.m.y.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩻ۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5A8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23535 extends C18947 implements Comparable, InterfaceC19653 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C6143 f76216;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC14363 f76217;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TreeMap f76218;

    public C23535(C6143 c6143, EnumC14363 enumC14363) {
        if (c6143 == null) {
            throw new NullPointerException("type == null");
        }
        if (enumC14363 == null) {
            throw new NullPointerException("visibility == null");
        }
        this.f76216 = c6143;
        this.f76217 = enumC14363;
        this.f76218 = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23535)) {
            return false;
        }
        C23535 c23535 = (C23535) obj;
        if (this.f76216.equals(c23535.f76216) && this.f76217 == c23535.f76217) {
            return this.f76218.equals(c23535.f76218);
        }
        return false;
    }

    public final int hashCode() {
        return this.f76217.hashCode() + ((this.f76218.hashCode() + (this.f76216.hashCode() * 31)) * 31);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C23535 c23535) {
        int iCompareTo = this.f76216.compareTo((AbstractC9901) c23535.f76216);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f76217.compareTo(c23535.f76217);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        Iterator it = this.f76218.values().iterator();
        Iterator it2 = c23535.f76218.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo3 = ((C3072) it.next()).compareTo((C3072) it2.next());
            if (iCompareTo3 != 0) {
                return iCompareTo3;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }

    public final String toString() {
        return mo2376();
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f76217.mo2376());
        sb.append("-annotation ");
        sb.append(this.f76216.mo2376());
        sb.append(" {");
        boolean z = true;
        for (C3072 c3072 : this.f76218.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c3072.getName().mo2376());
            sb.append(": ");
            sb.append(c3072.getValue().mo2376());
        }
        sb.append(l.d);
        return sb.toString();
    }

    public final C6143 getType() {
        return this.f76216;
    }

    public final EnumC14363 getVisibility() {
        return this.f76217;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51862(C3072 c3072) {
        m43641();
        this.f76218.put(c3072.getName(), c3072);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51860(C3072 c3072) {
        m43641();
        C17432 name = c3072.getName();
        TreeMap treeMap = this.f76218;
        if (treeMap.get(name) != null) {
            throw new IllegalArgumentException("name already added: " + name);
        }
        treeMap.put(name, c3072);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Collection m51861() {
        return C0561.unmodifiableCollection(this.f76218.values());
    }
}
