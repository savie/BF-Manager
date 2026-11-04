package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩵ᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes5.dex */
public final class C20753 implements InterfaceC8074, Map.Entry, InterfaceC0550 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f66497;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4345 f66498;

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ᩸ */
    public final Object mo2558() {
        return mo2557();
    }

    public C20753(C4345 c4345) {
        this.f66498 = c4345;
    }

    public C20753(C4345 c4345, int i) {
        this.f66498 = c4345;
        this.f66497 = i;
    }

    @Override // l.InterfaceC8074
    /* JADX INFO: renamed from: ܺ */
    public final long mo21967() {
        return this.f66498.f15719[this.f66497];
    }

    @Override // l.InterfaceC0550
    public final Object first() {
        return Long.valueOf(this.f66498.f15719[this.f66497]);
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ۤ */
    public final Object mo2556() {
        return Long.valueOf(this.f66498.f15719[this.f66497]);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f66498.f15715[this.f66497];
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ܳ */
    public final Object mo2557() {
        return this.f66498.f15715[this.f66497];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f66498.f15715;
        int i = this.f66497;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Long.valueOf(this.f66498.f15719[this.f66497]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C4345 c4345 = this.f66498;
        return c4345.f15719[this.f66497] == ((Long) entry.getKey()).longValue() && C17359.equals(c4345.f15715[this.f66497], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C4345 c4345 = this.f66498;
        long[] jArr = c4345.f15719;
        int i = this.f66497;
        long j = jArr[i];
        int i2 = (int) (j ^ (j >>> 32));
        Object obj = c4345.f15715[i];
        return (obj == null ? 0 : obj.hashCode()) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C4345 c4345 = this.f66498;
        sb.append(c4345.f15719[this.f66497]);
        sb.append("=>");
        sb.append(c4345.f15715[this.f66497]);
        return sb.toString();
    }
}
