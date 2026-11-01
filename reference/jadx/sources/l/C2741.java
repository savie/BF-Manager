package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۖ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2741 implements InterfaceC12290, Map.Entry, InterfaceC14924 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f10536;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6975 f10537;

    @Override // l.InterfaceC14924
    public final Object first() {
        return mo7338();
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۖ */
    public final Object mo7335() {
        return mo7339();
    }

    public C2741(C6975 c6975, int i) {
        this.f10537 = c6975;
        this.f10536 = i;
    }

    public C2741(C6975 c6975) {
        this.f10537 = c6975;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f10537.f23476[this.f10536];
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ۨ */
    public final Object mo7338() {
        return this.f10537.f23476[this.f10536];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10537.f23471[this.f10536];
    }

    @Override // l.InterfaceC14924
    /* JADX INFO: renamed from: ᩹ */
    public final Object mo7339() {
        return this.f10537.f23471[this.f10536];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f10537.f23471;
        int i = this.f10536;
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
        C6975 c6975 = this.f10537;
        return c6975.f23468.mo3247(c6975.f23476[this.f10536], entry.getKey()) && C13638.equals(c6975.f23471[this.f10536], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C6975 c6975 = this.f10537;
        int iMo3246 = c6975.f23468.mo3246(c6975.f23476[this.f10536]);
        Object obj = c6975.f23471[this.f10536];
        return (obj == null ? 0 : obj.hashCode()) ^ iMo3246;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C6975 c6975 = this.f10537;
        sb.append(c6975.f23476[this.f10536]);
        sb.append("=>");
        sb.append(c6975.f23471[this.f10536]);
        return sb.toString();
    }
}
