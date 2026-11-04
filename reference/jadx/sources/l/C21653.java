package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩶᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes.dex */
public final class C21653 implements InterfaceC17923, Map.Entry, InterfaceC0550 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f69122;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1516 f69123;

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        byte bByteValue = ((Byte) obj).byteValue();
        byte[] bArr = this.f69123.f5289;
        int i = this.f69122;
        byte b = bArr[i];
        bArr[i] = bByteValue;
        return Byte.valueOf(b);
    }

    public C21653(C1516 c1516, int i) {
        this.f69123 = c1516;
        this.f69122 = i;
    }

    public C21653(C1516 c1516) {
        this.f69123 = c1516;
    }

    @Override // l.InterfaceC17923
    /* JADX INFO: renamed from: ۙ */
    public final int mo41837() {
        return this.f69123.f5295[this.f69122];
    }

    @Override // l.InterfaceC0550
    public final Object first() {
        return Integer.valueOf(this.f69123.f5295[this.f69122]);
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ۤ */
    public final Object mo2556() {
        return Integer.valueOf(this.f69123.f5295[this.f69122]);
    }

    @Override // l.InterfaceC17923
    /* JADX INFO: renamed from: ۘ */
    public final byte mo41836() {
        return this.f69123.f5289[this.f69122];
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ܳ */
    public final Object mo2557() {
        return Byte.valueOf(this.f69123.f5289[this.f69122]);
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ᩸ */
    public final Object mo2558() {
        return Byte.valueOf(this.f69123.f5289[this.f69122]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f69123.f5295[this.f69122]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Byte.valueOf(this.f69123.f5289[this.f69122]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C1516 c1516 = this.f69123;
        return c1516.f5295[this.f69122] == ((Integer) entry.getKey()).intValue() && c1516.f5289[this.f69122] == ((Byte) entry.getValue()).byteValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C1516 c1516 = this.f69123;
        int[] iArr = c1516.f5295;
        int i = this.f69122;
        return c1516.f5289[i] ^ iArr[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C1516 c1516 = this.f69123;
        sb.append(c1516.f5295[this.f69122]);
        sb.append("=>");
        sb.append((int) c1516.f5289[this.f69122]);
        return sb.toString();
    }
}
