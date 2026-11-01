package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܿۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17268 implements InterfaceC11437, Map.Entry, InterfaceC14924 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f55010;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14447 f55011;

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        char cCharValue = ((Character) obj).charValue();
        char[] cArr = this.f55011.f47385;
        int i = this.f55010;
        char c = cArr[i];
        cArr[i] = cCharValue;
        return Character.valueOf(c);
    }

    public C17268(C14447 c14447) {
        this.f55011 = c14447;
    }

    public C17268(C14447 c14447, int i) {
        this.f55011 = c14447;
        this.f55010 = i;
    }

    @Override // l.InterfaceC11437
    /* JADX INFO: renamed from: ۚ */
    public final char mo28551() {
        return this.f55011.f47389[this.f55010];
    }

    @Override // l.InterfaceC14924
    public final Object first() {
        return Character.valueOf(this.f55011.f47389[this.f55010]);
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۨ */
    public final Object mo7338() {
        return Character.valueOf(this.f55011.f47389[this.f55010]);
    }

    @Override // l.InterfaceC11437
    /* JADX INFO: renamed from: ᩺ */
    public final char mo28552() {
        return this.f55011.f47385[this.f55010];
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۖ */
    public final Object mo7335() {
        return Character.valueOf(this.f55011.f47385[this.f55010]);
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ᩹ */
    public final Object mo7339() {
        return Character.valueOf(this.f55011.f47385[this.f55010]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Character.valueOf(this.f55011.f47389[this.f55010]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Character.valueOf(this.f55011.f47385[this.f55010]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C14447 c14447 = this.f55011;
        return c14447.f47389[this.f55010] == ((Character) entry.getKey()).charValue() && c14447.f47385[this.f55010] == ((Character) entry.getValue()).charValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C14447 c14447 = this.f55011;
        char[] cArr = c14447.f47389;
        int i = this.f55010;
        return c14447.f47385[i] ^ cArr[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C14447 c14447 = this.f55011;
        sb.append(c14447.f47389[this.f55010]);
        sb.append("=>");
        sb.append(c14447.f47385[this.f55010]);
        return sb.toString();
    }
}
