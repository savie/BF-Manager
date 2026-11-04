package l;

/* JADX INFO: renamed from: l.ܰ᩺ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AID */
/* JADX INFO: loaded from: classes4.dex */
public final class C14929 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C18257 f48757 = C18257.ofMillis(C25227.FOREVER_NS);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18257 f48758;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f48759;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18257 f48760;

    public C14929(C18257 c18257, C18257 c18258, int i) {
        boolean zM39247 = C16576.m39247(c18257);
        C18257 c18259 = f48757;
        this.f48758 = zM39247 ? c18257 : c18259;
        this.f48760 = C16576.m39247(c18258) ? c18258 : c18259;
        this.f48759 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18257 m35908() {
        return this.f48758;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18257 m35910() {
        return this.f48760;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m35909() {
        return this.f48759;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EvictionConfig [idleEvictDuration=");
        sb.append(this.f48758);
        sb.append(", idleSoftEvictDuration=");
        sb.append(this.f48760);
        sb.append(", minIdle=");
        return C12669.m31437(this.f48759, "]", sb);
    }
}
