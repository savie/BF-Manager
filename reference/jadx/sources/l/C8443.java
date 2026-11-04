package l;

/* JADX INFO: renamed from: l.۠ۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C8443 extends AbstractC10919 {
    @Override // l.AbstractC10919
    /* JADX INFO: renamed from: ۙ */
    public final long[] mo15749(Object obj) {
        C18257 c18257 = (C18257) obj;
        return new long[]{c18257.getSeconds(), c18257.getNano()};
    }

    @Override // l.AbstractC10919
    /* JADX INFO: renamed from: ۙ */
    public final Object mo15748(long[] jArr) {
        return C18257.ofSeconds(jArr[0], jArr[1]);
    }
}
