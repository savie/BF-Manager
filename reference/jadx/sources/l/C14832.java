package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳ᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C14832 extends AbstractC3492 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC9893 f48477;

    public C14832(ViewOnClickListenerC9893 viewOnClickListenerC9893) {
        this.f48477 = viewOnClickListenerC9893;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f48477.f33775, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C4987 {
        C11780 c11780 = this.f48477.f33772;
        C4723.m13086();
        C2724 c2724M8305 = C2724.m8305(4168);
        c2724M8305.m8325(c11780.f39571);
        C1313 c1313M8314 = c2724M8305.m8314();
        if (!c1313M8314.m4686()) {
            throw new C4987(C4820.m13401(c1313M8314, R.string.MT_Protector));
        }
        c11780.f39566 = 0;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        ViewOnClickListenerC9893 viewOnClickListenerC9893 = this.f48477;
        ActivityC3541 activityC3541 = viewOnClickListenerC9893.f33775;
        new RunnableC8482(activityC3541);
        ActivityC3541.m10450(activityC3541, viewOnClickListenerC9893.f33772, viewOnClickListenerC9893.f33774);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f48477.f33775.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
