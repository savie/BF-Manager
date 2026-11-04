package l;

/* JADX INFO: renamed from: l.ۧ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 866M */
/* JADX INFO: loaded from: classes3.dex */
public final class C11622 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f36460;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object f36461;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f36462;

    public C11622(Object obj, Object obj2, Object obj3) {
        this.f36460 = obj;
        this.f36462 = obj2;
        this.f36461 = obj3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IllegalArgumentException m29190() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f36460;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f36462);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f36461);
        return new IllegalArgumentException(sb.toString());
    }
}
