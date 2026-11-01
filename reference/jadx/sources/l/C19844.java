package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩶֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19844 implements InterfaceC21254, Map.Entry, InterfaceC2846 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f63663;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10672 f63664;

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۨ */
    public final Object mo7338() {
        return Integer.valueOf(mo8610());
    }

    @Override // l.InterfaceC2846
    /* JADX INFO: renamed from: ᩵ */
    public final int mo8613() {
        return mo8610();
    }

    @Override // l.InterfaceC14924
    public final Object first() {
        return Integer.valueOf(mo8613());
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ᩹ */
    public final Object mo7339() {
        return Integer.valueOf(mo8611());
    }

    @Override // l.InterfaceC2846
    /* JADX INFO: renamed from: ۤ */
    public final int mo8612() {
        return mo8611();
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۖ */
    public final Object mo7335() {
        return Integer.valueOf(mo8612());
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.f63664.f36413;
        int i = this.f63663;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    public C19844(C10672 c10672, int i) {
        this.f63664 = c10672;
        this.f63663 = i;
    }

    public C19844(C10672 c10672) {
        this.f63664 = c10672;
    }

    @Override // l.InterfaceC21254
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo45097() {
        return this.f63664.f36415[this.f63663];
    }

    @Override // l.InterfaceC2846
    /* JADX INFO: renamed from: ۟ */
    public final int mo8610() {
        return this.f63664.f36415[this.f63663];
    }

    @Override // l.InterfaceC21254
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int mo45096() {
        return this.f63664.f36413[this.f63663];
    }

    @Override // l.InterfaceC2846
    /* JADX INFO: renamed from: ۡ */
    public final int mo8611() {
        return this.f63664.f36413[this.f63663];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f63664.f36415[this.f63663]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Integer.valueOf(this.f63664.f36413[this.f63663]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C10672 c10672 = this.f63664;
        return c10672.f36415[this.f63663] == ((Integer) entry.getKey()).intValue() && c10672.f36413[this.f63663] == ((Integer) entry.getValue()).intValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C10672 c10672 = this.f63664;
        int[] iArr = c10672.f36415;
        int i = this.f63663;
        return c10672.f36413[i] ^ iArr[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C10672 c10672 = this.f63664;
        sb.append(c10672.f36415[this.f63663]);
        sb.append("=>");
        sb.append(c10672.f36413[this.f63663]);
        return sb.toString();
    }
}
