package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ᩴܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19919 implements InterfaceC23649, Map.Entry, InterfaceC0550 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f64081;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2020 f64082;

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        char cCharValue = ((Character) obj).charValue();
        char[] cArr = this.f64082.f6732;
        int i = this.f64081;
        char c = cArr[i];
        cArr[i] = cCharValue;
        return Character.valueOf(c);
    }

    public C19919(C2020 c2020) {
        this.f64082 = c2020;
    }

    public C19919(C2020 c2020, int i) {
        this.f64082 = c2020;
        this.f64081 = i;
    }

    @Override // l.InterfaceC23649
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final char mo45846() {
        return this.f64082.f6736[this.f64081];
    }

    @Override // l.InterfaceC0550
    public final Object first() {
        return Character.valueOf(this.f64082.f6736[this.f64081]);
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ۤ */
    public final Object mo2556() {
        return Character.valueOf(this.f64082.f6736[this.f64081]);
    }

    @Override // l.InterfaceC23649
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final char mo45847() {
        return this.f64082.f6732[this.f64081];
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ܳ */
    public final Object mo2557() {
        return Character.valueOf(this.f64082.f6732[this.f64081]);
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ᩸ */
    public final Object mo2558() {
        return Character.valueOf(this.f64082.f6732[this.f64081]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Character.valueOf(this.f64082.f6736[this.f64081]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Character.valueOf(this.f64082.f6732[this.f64081]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C2020 c2020 = this.f64082;
        return c2020.f6736[this.f64081] == ((Character) entry.getKey()).charValue() && c2020.f6732[this.f64081] == ((Character) entry.getValue()).charValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C2020 c2020 = this.f64082;
        char[] cArr = c2020.f6736;
        int i = this.f64081;
        return c2020.f6732[i] ^ cArr[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C2020 c2020 = this.f64082;
        sb.append(c2020.f6736[this.f64081]);
        sb.append("=>");
        sb.append(c2020.f6732[this.f64081]);
        return sb.toString();
    }
}
