package l;

import java.util.Map;

/* JADX INFO: renamed from: l.۬ۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13602 implements InterfaceC18078, Map.Entry, InterfaceC15730 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f43199;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15399 f43200;

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ۤ */
    public final Object mo2556() {
        return Integer.valueOf(mo33344());
    }

    @Override // l.InterfaceC15730
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int mo33343() {
        return mo33344();
    }

    @Override // l.InterfaceC0550
    public final Object first() {
        return Integer.valueOf(mo33343());
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ܳ */
    public final Object mo2557() {
        return Integer.valueOf(mo33342());
    }

    @Override // l.InterfaceC15730
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int mo33341() {
        return mo33342();
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ᩸ */
    public final Object mo2558() {
        return Integer.valueOf(mo33341());
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.f43200.f50195;
        int i = this.f43199;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    public C13602(C15399 c15399, int i) {
        this.f43200 = c15399;
        this.f43199 = i;
    }

    public C13602(C15399 c15399) {
        this.f43200 = c15399;
    }

    @Override // l.InterfaceC18078
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo33340() {
        return this.f43200.f50196[this.f43199];
    }

    @Override // l.InterfaceC15730
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int mo33344() {
        return this.f43200.f50196[this.f43199];
    }

    @Override // l.InterfaceC18078
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo33339() {
        return this.f43200.f50195[this.f43199];
    }

    @Override // l.InterfaceC15730
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo33342() {
        return this.f43200.f50195[this.f43199];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f43200.f50196[this.f43199]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Integer.valueOf(this.f43200.f50195[this.f43199]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C15399 c15399 = this.f43200;
        return c15399.f50196[this.f43199] == ((Integer) entry.getKey()).intValue() && c15399.f50195[this.f43199] == ((Integer) entry.getValue()).intValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C15399 c15399 = this.f43200;
        int[] iArr = c15399.f50196;
        int i = this.f43199;
        return c15399.f50195[i] ^ iArr[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C15399 c15399 = this.f43200;
        sb.append(c15399.f50196[this.f43199]);
        sb.append("=>");
        sb.append(c15399.f50195[this.f43199]);
        return sb.toString();
    }
}
