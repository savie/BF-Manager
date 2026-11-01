package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1814 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f6972;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3992 f6973;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13955 f6974;

    public C1814(C13955 c13955, C3992 c3992, DialogInterfaceC19356 dialogInterfaceC19356) {
        this.f6974 = c13955;
        this.f6973 = c3992;
        this.f6972 = dialogInterfaceC19356;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10252(this.f6974.f45918, 300);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        int i = ServiceC8498.f29454;
        C18375 c18375 = new C18375(0);
        int i2 = C22609.f73678;
        C7845.m20693(this.f6973, new C5675(0, c18375));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f6972;
        C13955 c13955 = this.f6974;
        C13955.m33806(c13955, dialogInterfaceC19356);
        new C14516(c13955).m10243();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        C15829.m37613((CharSequence) this.f6974.f45918.getString(R.string.MT_Protector, exc.getMessage()));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
