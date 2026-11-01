package l;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩺ᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91EO */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23157 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f75168;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f75169;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f75170;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f75171;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo21782(C11018 c11018, HashMap map);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo21783(C17367 c17367, SparseArray sparseArray);

    /* JADX INFO: renamed from: ᩹ */
    public abstract boolean mo21788();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8340 m51156() {
        if (!mo21788()) {
            throw new UnsupportedOperationException();
        }
        return (C8340) this;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m51155() {
        return this.f75170;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m51159() {
        return this.f75169;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m51157() {
        return this.f75168;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m51158() {
        return this.f75171;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51154(C11018 c11018, HashMap map, String str) {
        C13638.requireNonNull(str);
        Integer numValueOf = (Integer) map.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(map.size());
            map.put(str, numValueOf);
        }
        c11018.m27775(numValueOf.intValue());
    }
}
