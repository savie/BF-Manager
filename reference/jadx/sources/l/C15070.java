package l;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܳۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B8H5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15070 implements InterfaceC24393 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final HashMap f49209;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C7458 f49210;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long[] f49211;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f49212;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Map f49213;

    public C15070(C7458 c7458, HashMap map, HashMap map2, HashMap map3) {
        this.f49210 = c7458;
        this.f49209 = map2;
        this.f49212 = map3;
        this.f49213 = C4681.unmodifiableMap(map);
        this.f49211 = c7458.m20477();
    }

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۙ */
    public final int mo21768(long j) {
        long[] jArr = this.f49211;
        int iM19472 = C7116.m19472(jArr, j, false);
        if (iM19472 < jArr.length) {
            return iM19472;
        }
        return -1;
    }

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۙ */
    public final int mo21767() {
        return this.f49211.length;
    }

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۙ */
    public final long mo21769(int i) {
        return this.f49211[i];
    }

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۤ */
    public final List mo21771(long j) {
        return this.f49210.m20473(j, this.f49213, this.f49209, this.f49212);
    }
}
