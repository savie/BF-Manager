package l;

/* JADX INFO: renamed from: l.᩺ᩳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: LIYN */
/* JADX INFO: loaded from: classes.dex */
public final class C24466 implements InterfaceC11851 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f79412;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 f79413;

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean mo1794() {
        return false;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC2157 mo1791() {
        return C11457.f36008;
    }

    public C24466(AbstractC1566 abstractC1566, String str) {
        this.f79413 = abstractC1566;
        this.f79412 = str;
    }

    @Override // l.InterfaceC11851
    /* JADX INFO: renamed from: ֡ */
    public final String mo1790() {
        return toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m54716() {
        return this.f79412;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m54717() {
        return this.f79413;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C24466.class == obj.getClass()) {
            C24466 c24466 = (C24466) obj;
            if (C17359.equals(this.f79413, c24466.f79413) && C17359.equals(this.f79412, c24466.f79412)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hash(this.f79413, this.f79412);
    }

    public final String toString() {
        return "D('" + this.f79412 + "' " + this.f79413 + ')';
    }
}
