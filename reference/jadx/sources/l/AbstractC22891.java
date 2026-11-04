package l;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩸ܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91EO */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22891 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f74366;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f74367;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f74368;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f74369;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6856(C6178 c6178, HashMap map);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6857(C20348 c20348, SparseArray sparseArray);

    /* JADX INFO: renamed from: ܳ */
    public abstract boolean mo6861();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2008 m51622() {
        if (!mo6861()) {
            throw new UnsupportedOperationException();
        }
        return (C2008) this;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m51626() {
        return this.f74367;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m51625() {
        return this.f74366;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m51624() {
        return this.f74369;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m51623() {
        return this.f74368;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51621(C6178 c6178, HashMap map, String str) {
        C17359.requireNonNull(str);
        Integer numValueOf = (Integer) map.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(map.size());
            map.put(str, numValueOf);
        }
        c6178.m17809(numValueOf.intValue());
    }
}
