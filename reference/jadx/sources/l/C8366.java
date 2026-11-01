package l;

import java.util.Map;

/* JADX INFO: renamed from: l.۠ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8366 implements InterfaceC12599, Map.Entry, InterfaceC14924 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f29028;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7660 f29029;

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ᩹ */
    public final Object mo7339() {
        return Integer.valueOf(m21900());
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۖ */
    public final Object mo7335() {
        return Integer.valueOf(m21900());
    }

    @Override // l.InterfaceC14924
    public final Object first() {
        return mo7338();
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.f29029.f25319;
        int i = this.f29028;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    public C8366(C7660 c7660) {
        this.f29029 = c7660;
    }

    public C8366(C7660 c7660, int i) {
        this.f29029 = c7660;
        this.f29028 = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f29029.f25323[this.f29028];
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۨ */
    public final Object mo7338() {
        return this.f29029.f25323[this.f29028];
    }

    @Override // l.InterfaceC12599
    /* JADX INFO: renamed from: ۘ */
    public final int mo7336() {
        return this.f29029.f25319[this.f29028];
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m21900() {
        return this.f29029.f25319[this.f29028];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Integer.valueOf(this.f29029.f25319[this.f29028]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C7660 c7660 = this.f29029;
        return C13638.equals(c7660.f25323[this.f29028], entry.getKey()) && c7660.f25319[this.f29028] == ((Integer) entry.getValue()).intValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C7660 c7660 = this.f29029;
        Object obj = c7660.f25323[this.f29028];
        return c7660.f25319[this.f29028] ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C7660 c7660 = this.f29029;
        sb.append(c7660.f25323[this.f29028]);
        sb.append("=>");
        sb.append(c7660.f25319[this.f29028]);
        return sb.toString();
    }
}
