package l;

/* JADX INFO: renamed from: l.ۧۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QN */
/* JADX INFO: loaded from: classes3.dex */
public final class C11447 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f35967;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15045 f35968;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C17414.f56614.info("Invalid key for map field.");
        return -1;
    }

    public C11447(C7323 c7323, Object obj) {
        if (obj instanceof C15045) {
            this.f35968 = (C15045) obj;
        } else {
            this.f35967 = obj;
        }
        ((C7323) c7323.m20093().getFields().get(0)).m20086();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m28807() {
        C15045 c15045 = this.f35968;
        return c15045 != null ? c15045 : this.f35967;
    }
}
