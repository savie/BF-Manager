package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۘ᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes3.dex */
public final class C4411 implements InterfaceC5903, Map.Entry, InterfaceC0550 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f15841;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19327 f15842;

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ۤ */
    public final Object mo2556() {
        return Integer.valueOf(m14030());
    }

    @Override // l.InterfaceC0550
    public final Object first() {
        return Integer.valueOf(m14030());
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ᩸ */
    public final Object mo2558() {
        return mo2557();
    }

    public C4411(C19327 c19327, int i) {
        this.f15842 = c19327;
        this.f15841 = i;
    }

    public C4411(C19327 c19327) {
        this.f15842 = c19327;
    }

    @Override // l.InterfaceC5903
    /* JADX INFO: renamed from: ۙ */
    public final int mo3870() {
        return this.f15842.f62429[this.f15841];
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m14030() {
        return this.f15842.f62429[this.f15841];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15842.f62434[this.f15841];
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ܳ */
    public final Object mo2557() {
        return this.f15842.f62434[this.f15841];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f15842.f62434;
        int i = this.f15841;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f15842.f62429[this.f15841]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C19327 c19327 = this.f15842;
        return c19327.f62429[this.f15841] == ((Integer) entry.getKey()).intValue() && C17359.equals(c19327.f62434[this.f15841], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C19327 c19327 = this.f15842;
        int[] iArr = c19327.f62429;
        int i = this.f15841;
        int i2 = iArr[i];
        Object obj = c19327.f62434[i];
        return (obj == null ? 0 : obj.hashCode()) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C19327 c19327 = this.f15842;
        sb.append(c19327.f62429[this.f15841]);
        sb.append("=>");
        sb.append(c19327.f62434[this.f15841]);
        return sb.toString();
    }
}
