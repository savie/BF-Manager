package l;

/* JADX INFO: renamed from: l.֨ܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 866M */
/* JADX INFO: loaded from: classes2.dex */
public final class C1265 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f5484;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f5485;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f5486;

    public C1265(Object obj, Object obj2, Object obj3) {
        this.f5484 = obj;
        this.f5486 = obj2;
        this.f5485 = obj3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IllegalArgumentException m4589() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f5484;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f5486);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f5485);
        return new IllegalArgumentException(sb.toString());
    }
}
