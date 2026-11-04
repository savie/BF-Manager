package l;

import android.content.Context;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0305 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1635;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f1636;

    public /* synthetic */ ViewOnClickListenerC0305(AbstractActivityC17204 abstractActivityC17204, int i) {
        this.f1635 = i;
        this.f1636 = abstractActivityC17204;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1635) {
            case 0:
                ServiceC10702.m27276(this.f1636);
                break;
            case 1:
                boolean zM14714 = C4767.m14714();
                AbstractActivityC17204 abstractActivityC17204 = this.f1636;
                if (!zM14714) {
                    ActivityC20934.m47864((Context) abstractActivityC17204, C13047.m32497(), false);
                } else {
                    ActivityC20934.m47864((Context) abstractActivityC17204, C13047.m32499(), false);
                }
                break;
            default:
                C2361 c2361BuildDialog = this.f1636.buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                c2361BuildDialog.m8000(R.string.MT_Protector);
                c2361BuildDialog.m8026(R.string.MT_Protector, null);
                C5416.m16141(c2361BuildDialog.m8016());
                break;
        }
    }
}
