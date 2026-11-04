package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩹ۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23256 implements InterfaceC10575, Map.Entry, InterfaceC0550 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f75362;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3864 f75363;

    @Override // l.InterfaceC0550
    public final Object first() {
        return mo2556();
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ᩸ */
    public final Object mo2558() {
        return mo2557();
    }

    public C23256(C3864 c3864, int i) {
        this.f75363 = c3864;
        this.f75362 = i;
    }

    public C23256(C3864 c3864) {
        this.f75363 = c3864;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f75363.f13181[this.f75362];
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ۤ */
    public final Object mo2556() {
        return this.f75363.f13181[this.f75362];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f75363.f13184[this.f75362];
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ܳ */
    public final Object mo2557() {
        return this.f75363.f13184[this.f75362];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f75363.f13184;
        int i = this.f75362;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C3864 c3864 = this.f75363;
        return c3864.f13186.mo25786(c3864.f13181[this.f75362], entry.getKey()) && C17359.equals(c3864.f13184[this.f75362], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C3864 c3864 = this.f75363;
        int iMo25785 = c3864.f13186.mo25785(c3864.f13181[this.f75362]);
        Object obj = c3864.f13184[this.f75362];
        return (obj == null ? 0 : obj.hashCode()) ^ iMo25785;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C3864 c3864 = this.f75363;
        sb.append(c3864.f13181[this.f75362]);
        sb.append("=>");
        sb.append(c3864.f13184[this.f75362]);
        return sb.toString();
    }
}
