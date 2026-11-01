package l;

/* JADX INFO: renamed from: l.᩹ۨܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8NZ */
/* JADX INFO: loaded from: classes.dex */
public final class C22267 implements InterfaceC23035 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC14113 f72773;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f72774;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C9058 f72775;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C18378 f72776;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20723 f72777;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C7648 f72778;

    @Override // l.InterfaceC23035
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC23035 mo5444() {
        return this;
    }

    @Override // l.InterfaceC23035
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC23035 mo5445(C11164 c11164) {
        return this;
    }

    @Override // l.InterfaceC23035
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC23035 mo5447(boolean z) {
        return this;
    }

    @Override // l.InterfaceC23035
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ InterfaceC23035 mo5446(InterfaceC14113 interfaceC14113) {
        m49434(interfaceC14113);
        return this;
    }

    public C22267(InterfaceC20723 interfaceC20723, InterfaceC0166 interfaceC0166) {
        C9058 c9058 = new C9058(interfaceC0166);
        C18378 c18378 = new C18378();
        C1619 c1619 = new C1619();
        this.f72777 = interfaceC20723;
        this.f72775 = c9058;
        this.f72776 = c18378;
        this.f72773 = c1619;
        this.f72774 = 1048576;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49434(InterfaceC14113 interfaceC14113) {
        C2023.m6505(interfaceC14113, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f72773 = interfaceC14113;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49433(C7648 c7648) {
        this.f72778 = c7648;
    }

    @Override // l.InterfaceC23035
    /* JADX INFO: renamed from: ۙ */
    public final C1099 mo5443(C13689 c13689) {
        c13689.f45157.getClass();
        return new C1099(c13689, this.f72777, this.f72775, this.f72776.m42661(c13689), this.f72773, this.f72774, this.f72778);
    }
}
