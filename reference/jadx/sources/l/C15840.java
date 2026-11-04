package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܶۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes5.dex */
public final class C15840 implements InterfaceC4654, Map.Entry, InterfaceC0550 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f51511;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24046 f51512;

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        float[] fArr = this.f51512.f77775;
        int i = this.f51511;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    public C15840(C24046 c24046, int i) {
        this.f51512 = c24046;
        this.f51511 = i;
    }

    public C15840(C24046 c24046) {
        this.f51512 = c24046;
    }

    @Override // l.InterfaceC4654
    /* JADX INFO: renamed from: ۙ */
    public final int mo14508() {
        return this.f51512.f77781[this.f51511];
    }

    @Override // l.InterfaceC0550
    public final Object first() {
        return Integer.valueOf(this.f51512.f77781[this.f51511]);
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ۤ */
    public final Object mo2556() {
        return Integer.valueOf(this.f51512.f77781[this.f51511]);
    }

    @Override // l.InterfaceC4654
    /* JADX INFO: renamed from: ۧ */
    public final float mo14509() {
        return this.f51512.f77775[this.f51511];
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ܳ */
    public final Object mo2557() {
        return Float.valueOf(this.f51512.f77775[this.f51511]);
    }

    @Override // l.InterfaceC0550
    /* JADX INFO: renamed from: ᩸ */
    public final Object mo2558() {
        return Float.valueOf(this.f51512.f77775[this.f51511]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f51512.f77781[this.f51511]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Float.valueOf(this.f51512.f77775[this.f51511]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C24046 c24046 = this.f51512;
        return c24046.f77781[this.f51511] == ((Integer) entry.getKey()).intValue() && Float.floatToRawIntBits(c24046.f77775[this.f51511]) == Float.floatToRawIntBits(((Float) entry.getValue()).floatValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C24046 c24046 = this.f51512;
        int[] iArr = c24046.f77781;
        int i = this.f51511;
        return Float.floatToRawIntBits(c24046.f77775[i]) ^ iArr[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C24046 c24046 = this.f51512;
        sb.append(c24046.f77781[this.f51511]);
        sb.append("=>");
        sb.append(c24046.f77775[this.f51511]);
        return sb.toString();
    }
}
