package l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U15W */
/* JADX INFO: loaded from: classes2.dex */
public final class C2299 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HashSet f8181 = new HashSet();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashSet f8179 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f8180 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f8182 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m7033() {
        return this.f8179.size();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m7030() {
        return this.f8181.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m7027() {
        return this.f8180;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m7031() {
        return this.f8182;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m7032(C11473 c11473) {
        this.f8181.addAll(c11473.f38620);
        this.f8179.addAll(c11473.f38621);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7028(C11473 c11473) {
        HashSet hashSet = this.f8181;
        int size = hashSet.size();
        HashSet hashSet2 = this.f8179;
        int size2 = hashSet2.size();
        Iterator it = c11473.f38620.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains((C22056) it.next())) {
                size++;
            }
        }
        Iterator it2 = c11473.f38621.iterator();
        while (it2.hasNext()) {
            if (!hashSet2.contains((C0888) it2.next())) {
                size2++;
            }
        }
        this.f8180 = size;
        this.f8182 = size2;
    }

    public final String toString() {
        return "DexEmulator{fields=" + this.f8181.size() + ", methods=" + this.f8179.size() + '}';
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m7029() {
        return this.f8179.size() > 65536 || this.f8181.size() > 65536;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m7026() {
        return this.f8182 > 65536 || this.f8180 > 65536;
    }
}
