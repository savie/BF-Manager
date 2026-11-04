package l;

import com.alipay.sdk.m.y.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.۠ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5A8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8791 extends C20222 implements Comparable, InterfaceC6052 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final EnumC7300 f28645;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C1028 f28646;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TreeMap f28647;

    public C8791(C1028 c1028, EnumC7300 enumC7300) {
        if (c1028 == null) {
            throw new NullPointerException("type == null");
        }
        if (enumC7300 == null) {
            throw new NullPointerException("visibility == null");
        }
        this.f28646 = c1028;
        this.f28645 = enumC7300;
        this.f28647 = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8791)) {
            return false;
        }
        C8791 c8791 = (C8791) obj;
        if (this.f28646.equals(c8791.f28646) && this.f28645 == c8791.f28645) {
            return this.f28647.equals(c8791.f28647);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28645.hashCode() + ((this.f28647.hashCode() + (this.f28646.hashCode() * 31)) * 31);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C8791 c8791) {
        int iCompareTo = this.f28646.compareTo((AbstractC13487) c8791.f28646);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f28645.compareTo(c8791.f28645);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        Iterator it = this.f28647.values().iterator();
        Iterator it2 = c8791.f28647.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo3 = ((C21692) it.next()).compareTo((C21692) it2.next());
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
        return mo1843();
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28645.mo1843());
        sb.append("-annotation ");
        sb.append(this.f28646.mo1843());
        sb.append(" {");
        boolean z = true;
        for (C21692 c21692 : this.f28647.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c21692.getName().mo1843());
            sb.append(": ");
            sb.append(c21692.getValue().mo1843());
        }
        sb.append(l.d);
        return sb.toString();
    }

    public final C1028 getType() {
        return this.f28646;
    }

    public final EnumC7300 getVisibility() {
        return this.f28645;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m23589(C21692 c21692) {
        m46490();
        this.f28647.put(c21692.getName(), c21692);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23587(C21692 c21692) {
        m46490();
        C9976 name = c21692.getName();
        TreeMap treeMap = this.f28647;
        if (treeMap.get(name) != null) {
            throw new IllegalArgumentException("name already added: " + name);
        }
        treeMap.put(name, c21692);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Collection m23588() {
        return C4681.unmodifiableCollection(this.f28647.values());
    }
}
