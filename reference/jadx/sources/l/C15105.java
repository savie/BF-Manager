package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܳۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes5.dex */
public final class C15105 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f49296;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16597 f49297;

    public C15105(ActivityC16597 activityC16597, boolean z) {
        this.f49297 = activityC16597;
        this.f49296 = z;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8192(this.f49297, R.string.MT_Protector, 100);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        ActivityC16597 activityC16597 = this.f49297;
        C15425 c15425 = new C15425(activityC16597.f53682.m49865());
        activityC16597.f53686.m4752(c15425);
        AbstractC22044 abstractC22044 = activityC16597.f53685;
        byte[] bArrM36954 = c15425.m36954();
        abstractC22044.getClass();
        abstractC22044.m49843(new C10350(0, bArrM36954));
        activityC16597.f53688 = true;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C22673.m51152(R.string.MT_Protector);
        boolean z = this.f49296;
        ActivityC16597 activityC16597 = this.f49297;
        if (z) {
            activityC16597.finish();
        } else {
            activityC16597.f53686.m4753(false);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f49297.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
