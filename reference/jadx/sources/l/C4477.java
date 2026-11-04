package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۘ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes3.dex */
public final class C4477 implements InterfaceC5969, Map.Entry, InterfaceC0550 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f16015;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19393 f16016;

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ᩸ */
    public final Object mo2558() {
        return mo2557();
    }

    public C4477(C19393 c19393, int i) {
        this.f16016 = c19393;
        this.f16015 = i;
    }

    public C4477(C19393 c19393) {
        this.f16016 = c19393;
    }

    @Override // l.InterfaceC5969
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final char mo14179() {
        return this.f16016.f62668[this.f16015];
    }

    @Override // l.InterfaceC0550
    public final Object first() {
        return Character.valueOf(this.f16016.f62668[this.f16015]);
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ۤ */
    public final Object mo2556() {
        return Character.valueOf(this.f16016.f62668[this.f16015]);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f16016.f62673[this.f16015];
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ܳ */
    public final Object mo2557() {
        return this.f16016.f62673[this.f16015];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f16016.f62673;
        int i = this.f16015;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Character.valueOf(this.f16016.f62668[this.f16015]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C19393 c19393 = this.f16016;
        return c19393.f62668[this.f16015] == ((Character) entry.getKey()).charValue() && C17359.equals(c19393.f62673[this.f16015], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C19393 c19393 = this.f16016;
        char[] cArr = c19393.f62668;
        int i = this.f16015;
        char c = cArr[i];
        Object obj = c19393.f62673[i];
        return (obj == null ? 0 : obj.hashCode()) ^ c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C19393 c19393 = this.f16016;
        sb.append(c19393.f62668[this.f16015]);
        sb.append("=>");
        sb.append(c19393.f62673[this.f16015]);
        return sb.toString();
    }
}
