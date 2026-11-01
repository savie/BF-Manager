package l;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤ۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8H5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10170 implements InterfaceC9753 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final HashMap f34743;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C15109 f34744;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long[] f34745;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f34746;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Map f34747;

    public C10170(C15109 c15109, HashMap map, HashMap map2, HashMap map3) {
        this.f34744 = c15109;
        this.f34746 = map2;
        this.f34743 = map3;
        this.f34747 = C0561.unmodifiableMap(map);
        this.f34745 = c15109.m36194();
    }

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۙ */
    public final int mo15244(long j) {
        long[] jArr = this.f34745;
        int iM41825 = C17983.m41825(jArr, j, false);
        if (iM41825 < jArr.length) {
            return iM41825;
        }
        return -1;
    }

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۙ */
    public final int mo15243() {
        return this.f34745.length;
    }

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۙ */
    public final long mo15245(int i) {
        return this.f34745[i];
    }

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۨ */
    public final List mo15247(long j) {
        return this.f34744.m36190(j, this.f34747, this.f34746, this.f34743);
    }
}
