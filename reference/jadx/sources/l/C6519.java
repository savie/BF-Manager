package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۜۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6519 implements InterfaceC14551, Map.Entry, InterfaceC14924 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f21968;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7931 f21969;

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۨ */
    public final Object mo7338() {
        return Integer.valueOf(m17727());
    }

    @Override // l.InterfaceC14924
    public final Object first() {
        return Integer.valueOf(m17727());
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۖ */
    public final Object mo7335() {
        return mo7339();
    }

    public C6519(C7931 c7931, int i) {
        this.f21969 = c7931;
        this.f21968 = i;
    }

    public C6519(C7931 c7931) {
        this.f21969 = c7931;
    }

    @Override // l.InterfaceC14551
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo17726() {
        return this.f21969.f26054[this.f21968];
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int m17727() {
        return this.f21969.f26054[this.f21968];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f21969.f26047[this.f21968];
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ᩹ */
    public final Object mo7339() {
        return this.f21969.f26047[this.f21968];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f21969.f26047;
        int i = this.f21968;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f21969.f26054[this.f21968]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C7931 c7931 = this.f21969;
        return c7931.f26054[this.f21968] == ((Integer) entry.getKey()).intValue() && C13638.equals(c7931.f26047[this.f21968], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C7931 c7931 = this.f21969;
        int[] iArr = c7931.f26054;
        int i = this.f21968;
        int i2 = iArr[i];
        Object obj = c7931.f26047[i];
        return (obj == null ? 0 : obj.hashCode()) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C7931 c7931 = this.f21969;
        sb.append(c7931.f26054[this.f21968]);
        sb.append("=>");
        sb.append(c7931.f26047[this.f21968]);
        return sb.toString();
    }
}
