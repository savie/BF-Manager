package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes.dex */
public final class C24780 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f80221;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23288 f80222;

    public C24780(ActivityC23288 activityC23288, boolean z) {
        this.f80222 = activityC23288;
        this.f80221 = z;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f80222, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        ActivityC23288 activityC23288 = this.f80222;
        byte[] bArrM35988 = activityC23288.f75446.f51488.m35988();
        AbstractC22044 abstractC22044 = activityC23288.f75446.f51481;
        abstractC22044.getClass();
        abstractC22044.m49843(new C10350(0, bArrM35988));
        activityC23288.f75446.f51490 = false;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f80221) {
            this.f80222.finish();
        } else {
            C22673.m51152(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f80222.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
