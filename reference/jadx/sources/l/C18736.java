package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18736 implements InterfaceC10771, Map.Entry, InterfaceC0550 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f60893;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2329 f60894;

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ܳ */
    public final Object mo2557() {
        return Integer.valueOf(m43547());
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ᩸ */
    public final Object mo2558() {
        return Integer.valueOf(m43547());
    }

    @Override // l.InterfaceC0550
    public final Object first() {
        return mo2556();
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.f60894.f7511;
        int i = this.f60893;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    public C18736(C2329 c2329) {
        this.f60894 = c2329;
    }

    public C18736(C2329 c2329, int i) {
        this.f60894 = c2329;
        this.f60893 = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f60894.f7515[this.f60893];
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ۤ */
    public final Object mo2556() {
        return this.f60894.f7515[this.f60893];
    }

    @Override // l.InterfaceC10771
    /* JADX INFO: renamed from: ֫ */
    public final int mo27440() {
        return this.f60894.f7511[this.f60893];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m43547() {
        return this.f60894.f7511[this.f60893];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Integer.valueOf(this.f60894.f7511[this.f60893]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C2329 c2329 = this.f60894;
        return C17359.equals(c2329.f7515[this.f60893], entry.getKey()) && c2329.f7511[this.f60893] == ((Integer) entry.getValue()).intValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C2329 c2329 = this.f60894;
        Object obj = c2329.f7515[this.f60893];
        return c2329.f7511[this.f60893] ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C2329 c2329 = this.f60894;
        sb.append(c2329.f7515[this.f60893]);
        sb.append("=>");
        sb.append(c2329.f7511[this.f60893]);
        return sb.toString();
    }
}
