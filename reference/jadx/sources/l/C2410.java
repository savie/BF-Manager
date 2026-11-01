package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۖ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes2.dex */
public final class C2410 implements InterfaceC12599, Map.Entry, InterfaceC14924 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f9686;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6644 f9687;

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object mo7339() {
        return Integer.valueOf(m7337());
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object mo7335() {
        return Integer.valueOf(m7337());
    }

    @Override // l.InterfaceC14924
    public final Object first() {
        return mo7338();
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.f9687.f22435;
        int i = this.f9686;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    public C2410(C6644 c6644, int i) {
        this.f9687 = c6644;
        this.f9686 = i;
    }

    public C2410(C6644 c6644) {
        this.f9687 = c6644;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f9687.f22442[this.f9686];
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object mo7338() {
        return this.f9687.f22442[this.f9686];
    }

    @Override // l.InterfaceC12599
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int mo7336() {
        return this.f9687.f22435[this.f9686];
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m7337() {
        return this.f9687.f22435[this.f9686];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Integer.valueOf(this.f9687.f22435[this.f9686]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C6644 c6644 = this.f9687;
        return C13638.equals(c6644.f22442[this.f9686], entry.getKey()) && c6644.f22435[this.f9686] == ((Integer) entry.getValue()).intValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C6644 c6644 = this.f9687;
        Object obj = c6644.f22442[this.f9686];
        return c6644.f22435[this.f9686] ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C6644 c6644 = this.f9687;
        sb.append(c6644.f22442[this.f9686]);
        sb.append("=>");
        sb.append(c6644.f22435[this.f9686]);
        return sb.toString();
    }
}
