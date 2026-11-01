package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 590L */
/* JADX INFO: loaded from: classes4.dex */
public final class C15113 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C15113 f49355;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final char f49356;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f49357;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C15113 f49358;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f49359;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f49360;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f49361;

    public C15113(ArrayList arrayList, char c, boolean z, boolean z2, C15113 c15113) {
        this.f49359 = arrayList;
        this.f49356 = c;
        this.f49360 = z;
        this.f49357 = z2;
        this.f49355 = c15113;
        this.f49361 = arrayList.size();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m36203() {
        return this.f49360;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36200() {
        return this.f49357;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m36198() {
        return this.f49361;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17250 m36201() {
        return (C17250) C19084.m43861(this.f49359, 1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m36202(int i) {
        ArrayList arrayList = this.f49359;
        if (i < 1 || i > arrayList.size()) {
            throw new IllegalArgumentException("length must be between 1 and " + arrayList.size() + ", was " + i);
        }
        return arrayList.subList(arrayList.size() - i, arrayList.size());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m36199(int i) {
        ArrayList arrayList = this.f49359;
        if (i < 1 || i > arrayList.size()) {
            throw new IllegalArgumentException("length must be between 1 and " + arrayList.size() + ", was " + i);
        }
        return arrayList.subList(0, i);
    }
}
