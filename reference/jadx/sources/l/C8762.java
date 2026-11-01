package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۡ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8762 implements InterfaceC12290, Map.Entry, InterfaceC14924 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f30121;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15818 f30122;

    @Override // l.InterfaceC14924
    public final Object first() {
        return mo7338();
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۖ */
    public final Object mo7335() {
        return mo7339();
    }

    public C8762(C15818 c15818) {
        this.f30122 = c15818;
    }

    public C8762(C15818 c15818, int i) {
        this.f30122 = c15818;
        this.f30121 = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f30122.f51195[this.f30121];
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۨ */
    public final Object mo7338() {
        return this.f30122.f51195[this.f30121];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f30122.f51191[this.f30121];
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ᩹ */
    public final Object mo7339() {
        return this.f30122.f51191[this.f30121];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f30122.f51191;
        int i = this.f30121;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C15818 c15818 = this.f30122;
        return C13638.equals(c15818.f51195[this.f30121], entry.getKey()) && C13638.equals(c15818.f51191[this.f30121], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C15818 c15818 = this.f30122;
        Object obj = c15818.f51195[this.f30121];
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = c15818.f51191[this.f30121];
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C15818 c15818 = this.f30122;
        sb.append(c15818.f51195[this.f30121]);
        sb.append("=>");
        sb.append(c15818.f51191[this.f30121]);
        return sb.toString();
    }
}
