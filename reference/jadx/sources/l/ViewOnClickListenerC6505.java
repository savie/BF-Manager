package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6505 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21918;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21919;

    public /* synthetic */ ViewOnClickListenerC6505(int i, Object obj) {
        this.f21918 = i;
        this.f21919 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f21918;
        Object obj = this.f21919;
        switch (i) {
            case 0:
                int i2 = ActivityC4471.f15883;
                ((ActivityC4471) obj).finish();
                break;
            case 1:
                C8067 c8067BuildDialog = ((AbstractActivityC12483) obj).buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21253(R.string.MT_Protector);
                c8067BuildDialog.m21251(R.string.MT_Protector, null);
                c8067BuildDialog.m21269();
                break;
            case 2:
                ViewOnClickListenerC0744.m3215((ViewOnClickListenerC0744) obj);
                break;
            case 3:
                ((AbstractViewOnClickListenerC8744) obj).m22684(view);
                break;
            case 4:
                ((AbstractDialogInterfaceOnClickListenerC17341) obj).m40346((CharSequence) C5319.m14744(System.currentTimeMillis()));
                break;
            case 5:
                ActivityC5760 activityC5760 = (ActivityC5760) obj;
                ActivityC5054.m14079(activityC5760, activityC5760.f19568.m42734());
                break;
            case 6:
                ActivityC5677 activityC5677 = (ActivityC5677) obj;
                activityC5677.f19359.smoothScrollToPosition(activityC5677.f19362);
                break;
            case 7:
                ViewOnClickListenerC11989.m29848((ViewOnClickListenerC11989) obj);
                break;
            default:
                C9160.m23494((C9160) obj);
                break;
        }
    }
}
