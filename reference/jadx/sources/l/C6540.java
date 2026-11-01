package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۜۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes3.dex */
public final class C6540 implements InterfaceC14260, Map.Entry, InterfaceC14924 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f22015;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7952 f22016;

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۖ */
    public final Object mo7335() {
        return mo7339();
    }

    public C6540(C7952 c7952, int i) {
        this.f22016 = c7952;
        this.f22015 = i;
    }

    public C6540(C7952 c7952) {
        this.f22016 = c7952;
    }

    @Override // l.InterfaceC14260
    /* JADX INFO: renamed from: ۚ */
    public final char mo14566() {
        return this.f22016.f26123[this.f22015];
    }

    @Override // l.InterfaceC14924
    public final Object first() {
        return Character.valueOf(this.f22016.f26123[this.f22015]);
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۨ */
    public final Object mo7338() {
        return Character.valueOf(this.f22016.f26123[this.f22015]);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f22016.f26116[this.f22015];
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ᩹ */
    public final Object mo7339() {
        return this.f22016.f26116[this.f22015];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f22016.f26116;
        int i = this.f22015;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Character.valueOf(this.f22016.f26123[this.f22015]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C7952 c7952 = this.f22016;
        return c7952.f26123[this.f22015] == ((Character) entry.getKey()).charValue() && C13638.equals(c7952.f26116[this.f22015], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C7952 c7952 = this.f22016;
        char[] cArr = c7952.f26123;
        int i = this.f22015;
        char c = cArr[i];
        Object obj = c7952.f26116[i];
        return (obj == null ? 0 : obj.hashCode()) ^ c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C7952 c7952 = this.f22016;
        sb.append(c7952.f26123[this.f22015]);
        sb.append("=>");
        sb.append(c7952.f26116[this.f22015]);
        return sb.toString();
    }
}
