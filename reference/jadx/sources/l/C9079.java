package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes3.dex */
public final class C9079 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ResultCallback f30948;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f30949;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC10490 f30950;

    public C9079(AbstractActivityC10490 abstractActivityC10490, boolean z, ResultCallback resultCallback) {
        this.f30950 = abstractActivityC10490;
        this.f30949 = z;
        this.f30948 = resultCallback;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f30950, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        AbstractActivityC10490 abstractActivityC10490 = this.f30950;
        abstractActivityC10490.mo7996(abstractActivityC10490.f35938.m17000().toString());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C15829.m37611(R.string.MT_Protector);
        boolean z = this.f30949;
        AbstractActivityC10490 abstractActivityC10490 = this.f30950;
        if (z) {
            abstractActivityC10490.finish();
        } else {
            abstractActivityC10490.f35938.m17057(false);
        }
        ResultCallback resultCallback = this.f30948;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        AbstractActivityC10490 abstractActivityC10490 = this.f30950;
        abstractActivityC10490.m31002(exc, (DialogInterface.OnDismissListener) null);
        abstractActivityC10490.mo7993(exc);
        ResultCallback resultCallback = this.f30948;
        if (resultCallback != null) {
            resultCallback.onFailure(C2641.m8151(exc));
        }
    }
}
