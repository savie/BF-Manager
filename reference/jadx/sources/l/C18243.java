package l;

/* JADX INFO: renamed from: l.ܿۢ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 673L */
/* JADX INFO: loaded from: classes5.dex */
public final class C18243 implements InterfaceC14075 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f59556;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8547 f59557;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f59558;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59559;

    public C18243(String str, String str2, int i, C8547 c8547) {
        this.f59558 = str;
        this.f59556 = str2;
        this.f59559 = i;
        this.f59557 = c8547;
    }

    @Override // l.InterfaceC14075
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7364 mo3080(int i) {
        return new C21227(i, this.f59558, this.f59556, this.f59559, this.f59557);
    }

    @Override // l.InterfaceC14075
    public final void cancel() {
        this.f59557.m22866();
    }
}
