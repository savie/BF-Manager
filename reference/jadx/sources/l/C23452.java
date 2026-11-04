package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩹ۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes.dex */
public final class C23452 implements InterfaceC10771, Map.Entry, InterfaceC0550 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f75903;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4060 f75904;

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ܳ */
    public final Object mo2557() {
        return Integer.valueOf(m52663());
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ᩸ */
    public final Object mo2558() {
        return Integer.valueOf(m52663());
    }

    @Override // l.InterfaceC0550
    public final Object first() {
        return mo2556();
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.f75904.f13854;
        int i = this.f75903;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    public C23452(C4060 c4060, int i) {
        this.f75904 = c4060;
        this.f75903 = i;
    }

    public C23452(C4060 c4060) {
        this.f75904 = c4060;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f75904.f13849[this.f75903];
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ۤ */
    public final Object mo2556() {
        return this.f75904.f13849[this.f75903];
    }

    @Override // l.InterfaceC10771
    /* JADX INFO: renamed from: ֫ */
    public final int mo27440() {
        return this.f75904.f13854[this.f75903];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m52663() {
        return this.f75904.f13854[this.f75903];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Integer.valueOf(this.f75904.f13854[this.f75903]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C4060 c4060 = this.f75904;
        return C17359.equals(c4060.f13849[this.f75903], entry.getKey()) && c4060.f13854[this.f75903] == ((Integer) entry.getValue()).intValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C4060 c4060 = this.f75904;
        Object obj = c4060.f13849[this.f75903];
        return c4060.f13854[this.f75903] ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C4060 c4060 = this.f75904;
        sb.append(c4060.f13849[this.f75903]);
        sb.append("=>");
        sb.append(c4060.f13854[this.f75903]);
        return sb.toString();
    }
}
