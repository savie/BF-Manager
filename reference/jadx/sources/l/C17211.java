package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes5.dex */
public final class C17211 extends AbstractC2432 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC23179 f56105;

    public C17211(ViewOnClickListenerC23179 viewOnClickListenerC23179) {
        this.f56105 = viewOnClickListenerC23179;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f56105.f75115, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C4866 {
        C6025 c6025 = this.f56105.f75111;
        C20195.m46445();
        C2592 c2592M8672 = C2592.m8672(4168);
        c2592M8672.m8686(c6025.f20606);
        C13778 c13778M8688 = c2592M8672.m8688();
        if (!c13778M8688.m33676()) {
            throw new C4866(C1364.m5010(c13778M8688, R.string.MT_Protector));
        }
        c6025.f20612 = 0;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        ViewOnClickListenerC23179 viewOnClickListenerC23179 = this.f56105;
        ActivityC3041 activityC3041 = viewOnClickListenerC23179.f75115;
        new RunnableC14006(activityC3041);
        ActivityC3041.m9882(activityC3041, viewOnClickListenerC23179.f75111, viewOnClickListenerC23179.f75110);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f56105.f75115.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
