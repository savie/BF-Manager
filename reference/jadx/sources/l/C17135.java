package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5G5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17135 implements InterfaceC16261 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC10786 f54649;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1777 f54650;

    public C17135(ViewOnClickListenerC10786 viewOnClickListenerC10786, C1777 c1777) {
        this.f54649 = viewOnClickListenerC10786;
        this.f54650 = c1777;
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15792() {
        return this.f54650.m5824();
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ۨ */
    public final ActivityC5677 mo15793() {
        return this.f54649.f36747;
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ܰ */
    public final void mo15795(int i) {
        this.f54650.m5840(i);
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ۙ */
    public final void mo15791(int i, int i2) {
        ViewOnClickListenerC10786 viewOnClickListenerC10786 = this.f54649;
        viewOnClickListenerC10786.f36747.m30997(R.string.MT_Protector, viewOnClickListenerC10786.f36747.getString(R.string.MT_Protector, Integer.valueOf(i2), Integer.valueOf(i)), false);
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ܰ */
    public final void mo15794() {
        this.f54650.m5825();
    }
}
