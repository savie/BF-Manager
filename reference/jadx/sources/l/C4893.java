package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes3.dex */
public final class C4893 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f17101;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ResultCallback f17102;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC22047 f17103;

    public C4893(AbstractActivityC22047 abstractActivityC22047, boolean z, ResultCallback resultCallback) {
        this.f17103 = abstractActivityC22047;
        this.f17101 = z;
        this.f17102 = resultCallback;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f17103, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        AbstractActivityC22047 abstractActivityC22047 = this.f17103;
        abstractActivityC22047.mo1387(abstractActivityC22047.f71108.m54021().toString());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C22673.m51152(R.string.MT_Protector);
        boolean z = this.f17101;
        AbstractActivityC22047 abstractActivityC22047 = this.f17103;
        if (z) {
            abstractActivityC22047.finish();
        } else {
            abstractActivityC22047.f71108.m54016(false);
        }
        ResultCallback resultCallback = this.f17102;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        AbstractActivityC22047 abstractActivityC22047 = this.f17103;
        abstractActivityC22047.m40401(exc, (DialogInterface.OnDismissListener) null);
        abstractActivityC22047.mo1385(exc);
        ResultCallback resultCallback = this.f17102;
        if (resultCallback != null) {
            resultCallback.onFailure(C22327.m50390(exc));
        }
    }
}
