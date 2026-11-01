package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩹᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes.dex */
public final class C22561 implements InterfaceC19033, Map.Entry, InterfaceC14924 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f73533;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7038 f73534;

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۖ */
    public final Object mo7335() {
        return mo7339();
    }

    public C22561(C7038 c7038) {
        this.f73534 = c7038;
    }

    public C22561(C7038 c7038, int i) {
        this.f73534 = c7038;
        this.f73533 = i;
    }

    @Override // l.InterfaceC19033
    /* JADX INFO: renamed from: ܶ */
    public final long mo43767() {
        return this.f73534.f23649[this.f73533];
    }

    @Override // l.InterfaceC14924
    public final Object first() {
        return Long.valueOf(this.f73534.f23649[this.f73533]);
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۨ */
    public final Object mo7338() {
        return Long.valueOf(this.f73534.f23649[this.f73533]);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f73534.f23645[this.f73533];
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ᩹ */
    public final Object mo7339() {
        return this.f73534.f23645[this.f73533];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f73534.f23645;
        int i = this.f73533;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Long.valueOf(this.f73534.f23649[this.f73533]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C7038 c7038 = this.f73534;
        return c7038.f23649[this.f73533] == ((Long) entry.getKey()).longValue() && C13638.equals(c7038.f23645[this.f73533], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C7038 c7038 = this.f73534;
        long[] jArr = c7038.f23649;
        int i = this.f73533;
        long j = jArr[i];
        int i2 = (int) (j ^ (j >>> 32));
        Object obj = c7038.f23645[i];
        return (obj == null ? 0 : obj.hashCode()) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C7038 c7038 = this.f73534;
        sb.append(c7038.f23649[this.f73533]);
        sb.append("=>");
        sb.append(c7038.f23645[this.f73533]);
        return sb.toString();
    }
}
