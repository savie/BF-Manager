package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 590L */
/* JADX INFO: loaded from: classes2.dex */
public final class C2711 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f9054;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f9055;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2711 f9056;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f9057;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C2711 f9058;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f9059;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final char f9060;

    public C2711(ArrayList arrayList, char c, boolean z, boolean z2, C2711 c2711) {
        this.f9055 = arrayList;
        this.f9060 = c;
        this.f9059 = z;
        this.f9054 = z2;
        this.f9056 = c2711;
        this.f9057 = arrayList.size();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m9032() {
        return this.f9059;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9029() {
        return this.f9054;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m9033() {
        return this.f9057;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24672 m9030() {
        return (C24672) j$$ExternalSyntheticOutline0.m(this.f9055, 1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m9031(int i) {
        ArrayList arrayList = this.f9055;
        if (i < 1 || i > arrayList.size()) {
            throw new IllegalArgumentException("length must be between 1 and " + arrayList.size() + ", was " + i);
        }
        return arrayList.subList(arrayList.size() - i, arrayList.size());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m9028(int i) {
        ArrayList arrayList = this.f9055;
        if (i < 1 || i > arrayList.size()) {
            throw new IllegalArgumentException("length must be between 1 and " + arrayList.size() + ", was " + i);
        }
        return arrayList.subList(0, i);
    }
}
