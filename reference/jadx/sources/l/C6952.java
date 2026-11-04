package l;

/* JADX INFO: renamed from: l.ۜۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6952 extends AbstractC10919 {
    @Override // l.AbstractC10919
    /* JADX INFO: renamed from: ۙ */
    public final long[] mo15749(Object obj) {
        C0358 c0358 = (C0358) obj;
        return new long[]{c0358.getEpochSecond(), c0358.getNano()};
    }

    @Override // l.AbstractC10919
    /* JADX INFO: renamed from: ۙ */
    public final Object mo15748(long[] jArr) {
        return C0358.ofEpochSecond(jArr[0], jArr[1]);
    }
}
