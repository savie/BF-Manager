package l;

import java.util.Map;

/* JADX INFO: renamed from: l.۠ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8687 implements InterfaceC5903, Map.Entry, InterfaceC0550 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f28350;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22311 f28351;

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ۤ */
    public final Object mo2556() {
        return Integer.valueOf(m23377());
    }

    @Override // l.InterfaceC0550
    public final Object first() {
        return Integer.valueOf(m23377());
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ᩸ */
    public final Object mo2558() {
        return mo2557();
    }

    public C8687(C22311 c22311) {
        this.f28351 = c22311;
    }

    public C8687(C22311 c22311, int i) {
        this.f28351 = c22311;
        this.f28350 = i;
    }

    @Override // l.InterfaceC5903
    /* JADX INFO: renamed from: ۙ */
    public final int mo3870() {
        return this.f28351.f72233[this.f28350];
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m23377() {
        return this.f28351.f72233[this.f28350];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f28351.f72229[this.f28350];
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ܳ */
    public final Object mo2557() {
        return this.f28351.f72229[this.f28350];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f28351.f72229;
        int i = this.f28350;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f28351.f72233[this.f28350]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C22311 c22311 = this.f28351;
        return c22311.f72233[this.f28350] == ((Integer) entry.getKey()).intValue() && C17359.equals(c22311.f72229[this.f28350], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C22311 c22311 = this.f28351;
        int[] iArr = c22311.f72233;
        int i = this.f28350;
        int i2 = iArr[i];
        Object obj = c22311.f72229[i];
        return (obj == null ? 0 : obj.hashCode()) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C22311 c22311 = this.f28351;
        sb.append(c22311.f72233[this.f28350]);
        sb.append("=>");
        sb.append(c22311.f72229[this.f28350]);
        return sb.toString();
    }
}
