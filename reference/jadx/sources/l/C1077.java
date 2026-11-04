package l;

import java.util.Map;

/* JADX INFO: renamed from: l.֨ۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1077 implements InterfaceC10575, Map.Entry, InterfaceC0550 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f3858;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7043 f3859;

    @Override // l.InterfaceC0550
    public final Object first() {
        return mo2556();
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ᩸ */
    public final Object mo2558() {
        return mo2557();
    }

    public C1077(C7043 c7043) {
        this.f3859 = c7043;
    }

    public C1077(C7043 c7043, int i) {
        this.f3859 = c7043;
        this.f3858 = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3859.f23237[this.f3858];
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ۤ */
    public final Object mo2556() {
        return this.f3859.f23237[this.f3858];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3859.f23233[this.f3858];
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ܳ */
    public final Object mo2557() {
        return this.f3859.f23233[this.f3858];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f3859.f23233;
        int i = this.f3858;
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
        C7043 c7043 = this.f3859;
        return C17359.equals(c7043.f23237[this.f3858], entry.getKey()) && C17359.equals(c7043.f23233[this.f3858], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C7043 c7043 = this.f3859;
        Object obj = c7043.f23237[this.f3858];
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = c7043.f23233[this.f3858];
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C7043 c7043 = this.f3859;
        sb.append(c7043.f23237[this.f3858]);
        sb.append("=>");
        sb.append(c7043.f23233[this.f3858]);
        return sb.toString();
    }
}
