package l;

/* JADX INFO: renamed from: l.۟ۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 72T0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7260 extends AbstractC22436 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20666 f24165;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC6533 f24166;

    public C7260(C20666 c20666, InterfaceC6533 interfaceC6533) {
        this.f24165 = c20666;
        this.f24166 = interfaceC6533;
    }

    @Override // l.InterfaceC6533
    public final String getName() {
        return this.f24166.getName();
    }

    @Override // l.InterfaceC6533
    public final InterfaceC10975 getValue() {
        return (InterfaceC10975) this.f24165.f67253.m29874().mo1014(this.f24166.getValue());
    }
}
