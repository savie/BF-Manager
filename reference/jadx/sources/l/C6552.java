package l;

/* JADX INFO: renamed from: l.ۛܿ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M7HK */
/* JADX INFO: loaded from: classes3.dex */
public final class C6552 implements InterfaceC0808, InterfaceC20945 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f21995;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f21996;

    public C6552(String str, String str2) {
        this.f21996 = str;
        this.f21995 = str2;
    }

    @Override // l.InterfaceC0808
    /* JADX INFO: renamed from: ۙ */
    public final String mo3246() {
        return this.f21995;
    }

    @Override // l.InterfaceC0808
    public final String getPassword() {
        return this.f21996;
    }

    @Override // l.InterfaceC0808
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo3248() {
        return this.f21996 != null;
    }

    @Override // l.InterfaceC0808
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo3247() {
        return this.f21995 != null;
    }

    @Override // l.InterfaceC20945
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] mo18443(String[] strArr) {
        String str = this.f21996;
        if (str == null || strArr.length <= 0) {
            return null;
        }
        return new String[]{str};
    }
}
