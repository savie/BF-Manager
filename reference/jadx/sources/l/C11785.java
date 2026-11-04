package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۧᩳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9IU6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11785 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21943 f38081;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashSet f38082;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C21943 f38083;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f38084;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C11785 f38085;

    public C11785(C21943 c21943, C21943 c21944, HashSet hashSet) {
        this.f38083 = c21943;
        this.f38081 = c21944;
        this.f38082 = hashSet;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21943 m29616() {
        return this.f38083;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21943 m29613() {
        return this.f38081;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Set m29620() {
        return this.f38082;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashSet m29617() {
        HashSet hashSet = new HashSet();
        HashSet<C21943> hashSet2 = this.f38082;
        for (C21943 c21943 : hashSet2) {
            for (C21943 c21944 : c21943.m49646()) {
                if (!hashSet2.contains(c21944) && !c21944.mo17867(C11457.f36036)) {
                    hashSet.add(c21943);
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList m29621() {
        ArrayList arrayList = new ArrayList();
        HashSet<C21943> hashSet = this.f38082;
        for (C21943 c21943 : hashSet) {
            for (C21943 c21944 : c21943.m49646()) {
                if (!hashSet.contains(c21944) && !C23231.m52191(c21944)) {
                    arrayList.add(new C16721(c21943, c21944, false));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21943 m29618() {
        return C23231.m52166(this.f38081, this.f38083.m49643());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m29623() {
        return this.f38084;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29614(int i) {
        this.f38084 = i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11785 m29619() {
        return this.f38085;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29622(C11785 c11785) {
        this.f38085 = c11785;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29615(C11785 c11785) {
        for (C11785 c11786 = this.f38085; c11786 != null; c11786 = c11786.f38085) {
            if (c11786 == c11785) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "LOOP:" + this.f38084 + ": " + this.f38083 + "->" + this.f38081;
    }
}
