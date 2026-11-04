package l;

import android.content.Context;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷᩻۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q98G */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC22412 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72590;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f72591;

    public /* synthetic */ ViewOnClickListenerC22412(AbstractActivityC17204 abstractActivityC17204, int i) {
        this.f72590 = i;
        this.f72591 = abstractActivityC17204;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f72590) {
            case 0:
                C2361 c2361BuildDialog = this.f72591.buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                c2361BuildDialog.m8000(R.string.MT_Protector);
                c2361BuildDialog.m8026(R.string.MT_Protector, null);
                C5416.m16141(c2361BuildDialog.m8016());
                break;
            default:
                ActivityC20934.m47864((Context) this.f72591, C13047.m32501(), false);
                break;
        }
    }
}
