package l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ۫ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: U15W */
/* JADX INFO: loaded from: classes2.dex */
public final class C4157 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HashSet f14118 = new HashSet();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashSet f14120 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f14117 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f14119 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m13317() {
        return this.f14120.size();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m13316() {
        return this.f14118.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m13314() {
        return this.f14117;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m13319() {
        return this.f14119;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13320(C24295 c24295) {
        this.f14118.addAll(c24295.f78631);
        this.f14120.addAll(c24295.f78632);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13315(C24295 c24295) {
        HashSet hashSet = this.f14118;
        int size = hashSet.size();
        HashSet hashSet2 = this.f14120;
        int size2 = hashSet2.size();
        Iterator it = c24295.f78631.iterator();
        while (true) {
            AbstractC7596 abstractC7596 = (AbstractC7596) it;
            if (!abstractC7596.hasNext()) {
                break;
            } else if (!hashSet.contains((C21311) abstractC7596.next())) {
                size++;
            }
        }
        Iterator it2 = c24295.f78632.iterator();
        while (true) {
            AbstractC7596 abstractC7597 = (AbstractC7596) it2;
            if (abstractC7597.hasNext()) {
                if (!hashSet2.contains((C18327) abstractC7597.next())) {
                    size2++;
                }
            } else {
                this.f14117 = size;
                this.f14119 = size2;
                return;
            }
        }
    }

    public final String toString() {
        return "DexEmulator{fields=" + this.f14118.size() + ", methods=" + this.f14120.size() + '}';
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m13318() {
        return this.f14120.size() > 65536 || this.f14118.size() > 65536;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m13321() {
        return this.f14119 > 65536 || this.f14117 > 65536;
    }
}
