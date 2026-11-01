package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۨ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public final class C11377 implements InterfaceC0708, Map.Entry, InterfaceC14924 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f38366;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3614 f38367;

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object setValue(Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        float[] fArr = this.f38367.f13289;
        int i = this.f38366;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    public C11377(C3614 c3614, int i) {
        this.f38367 = c3614;
        this.f38366 = i;
    }

    public C11377(C3614 c3614) {
        this.f38367 = c3614;
    }

    @Override // l.InterfaceC0708
    /* JADX INFO: renamed from: ۙ */
    public final int mo3125() {
        return this.f38367.f13284[this.f38366];
    }

    @Override // l.InterfaceC14924
    public final Object first() {
        return Integer.valueOf(this.f38367.f13284[this.f38366]);
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۨ */
    public final Object mo7338() {
        return Integer.valueOf(this.f38367.f13284[this.f38366]);
    }

    @Override // l.InterfaceC0708
    /* JADX INFO: renamed from: ۜ */
    public final float mo3126() {
        return this.f38367.f13289[this.f38366];
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۖ */
    public final Object mo7335() {
        return Float.valueOf(this.f38367.f13289[this.f38366]);
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ᩹ */
    public final Object mo7339() {
        return Float.valueOf(this.f38367.f13289[this.f38366]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Integer.valueOf(this.f38367.f13284[this.f38366]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getValue() {
        return Float.valueOf(this.f38367.f13289[this.f38366]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C3614 c3614 = this.f38367;
        return c3614.f13284[this.f38366] == ((Integer) entry.getKey()).intValue() && Float.floatToRawIntBits(c3614.f13289[this.f38366]) == Float.floatToRawIntBits(((Float) entry.getValue()).floatValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C3614 c3614 = this.f38367;
        int[] iArr = c3614.f13284;
        int i = this.f38366;
        return Float.floatToRawIntBits(c3614.f13289[i]) ^ iArr[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C3614 c3614 = this.f38367;
        sb.append(c3614.f13284[this.f38366]);
        sb.append("=>");
        sb.append(c3614.f13289[this.f38366]);
        return sb.toString();
    }
}
