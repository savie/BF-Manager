package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩷۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20900 implements InterfaceC14551, Map.Entry, InterfaceC14924 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f67924;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16667 f67925;

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۨ */
    public final Object mo7338() {
        return Integer.valueOf(m47008());
    }

    @Override // l.InterfaceC14924
    public final Object first() {
        return Integer.valueOf(m47008());
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۖ */
    public final Object mo7335() {
        return mo7339();
    }

    public C20900(C16667 c16667) {
        this.f67925 = c16667;
    }

    public C20900(C16667 c16667, int i) {
        this.f67925 = c16667;
        this.f67924 = i;
    }

    @Override // l.InterfaceC14551
    /* JADX INFO: renamed from: ۙ */
    public final int mo17726() {
        return this.f67925.f53439[this.f67924];
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int m47008() {
        return this.f67925.f53439[this.f67924];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f67925.f53435[this.f67924];
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ᩹ */
    public final Object mo7339() {
        return this.f67925.f53435[this.f67924];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f67925.f53435;
        int i = this.f67924;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f67925.f53439[this.f67924]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C16667 c16667 = this.f67925;
        return c16667.f53439[this.f67924] == ((Integer) entry.getKey()).intValue() && C13638.equals(c16667.f53435[this.f67924], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C16667 c16667 = this.f67925;
        int[] iArr = c16667.f53439;
        int i = this.f67924;
        int i2 = iArr[i];
        Object obj = c16667.f53435[i];
        return (obj == null ? 0 : obj.hashCode()) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C16667 c16667 = this.f67925;
        sb.append(c16667.f53439[this.f67924]);
        sb.append("=>");
        sb.append(c16667.f53435[this.f67924]);
        return sb.toString();
    }
}
