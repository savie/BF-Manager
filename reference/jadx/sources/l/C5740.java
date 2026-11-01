package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1F3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5740 implements InterfaceC16261 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC23380 f19523;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1777 f19524;

    public C5740(ViewOnClickListenerC23380 viewOnClickListenerC23380, C1777 c1777) {
        this.f19523 = viewOnClickListenerC23380;
        this.f19524 = c1777;
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo15792() {
        return this.f19524.m5824();
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ActivityC5677 mo15793() {
        return this.f19523.f75748;
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo15795(int i) {
        this.f19524.m5840(i);
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15791(int i, int i2) {
        ViewOnClickListenerC23380 viewOnClickListenerC23380 = this.f19523;
        viewOnClickListenerC23380.f75748.m30997(R.string.MT_Protector, viewOnClickListenerC23380.f75748.getString(R.string.MT_Protector, Integer.valueOf(i2), Integer.valueOf(i)), false);
        if (i2 > 0) {
            ((C18377) new C16717(viewOnClickListenerC23380.f75748).m39205(C18377.class)).m42657();
        }
    }

    @Override // l.InterfaceC16261
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo15794() {
        this.f19524.m5825();
    }
}
