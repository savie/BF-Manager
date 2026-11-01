package l;

/* JADX INFO: renamed from: l.ۖᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AID */
/* JADX INFO: loaded from: classes2.dex */
public final class C2700 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C21813 f10397 = C21813.ofMillis(C17492.FOREVER_NS);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21813 f10398;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f10399;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21813 f10400;

    public C2700(C21813 c21813, C21813 c21814, int i) {
        boolean zM40778 = C17517.m40778(c21813);
        C21813 c21815 = f10397;
        this.f10398 = zM40778 ? c21813 : c21815;
        this.f10400 = C17517.m40778(c21814) ? c21814 : c21815;
        this.f10399 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21813 m8233() {
        return this.f10398;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21813 m8235() {
        return this.f10400;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m8234() {
        return this.f10399;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EvictionConfig [idleEvictDuration=");
        sb.append(this.f10398);
        sb.append(", idleSoftEvictDuration=");
        sb.append(this.f10400);
        sb.append(", minIdle=");
        return C12441.m30911(this.f10399, "]", sb);
    }
}
