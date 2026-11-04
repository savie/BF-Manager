package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.plus.R;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܿ᩶֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes5.dex */
public final class C18563 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f60315;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10358 f60316;

    public C18563(ActivityC10358 activityC10358, View view) {
        this.f60316 = activityC10358;
        this.f60315 = view;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f60316, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C3090 {
        ReentrantLock reentrantLock = C11650.f37690;
        C13778 c13778M8688 = C2592.m8672(4213).m8688();
        if (!c13778M8688.m33676()) {
            throw new C3090(C1364.m5010(c13778M8688, R.string.MT_Protector));
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C2361 c2361BuildDialog = this.f60316.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8000(R.string.MT_Protector);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        C5416.m16141(c2361BuildDialog.m8016());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f60315.setEnabled(true);
        this.f60316.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
