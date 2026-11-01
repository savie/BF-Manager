package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5P7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC10491 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35945;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35946;

    public /* synthetic */ ViewOnClickListenerC10491(int i, Object obj) {
        this.f35945 = i;
        this.f35946 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f35945;
        Object obj = this.f35946;
        switch (i) {
            case 0:
                int i2 = ActivityC21073.f68632;
                ((ActivityC21073) obj).finish();
                break;
            case 1:
                ActivityC20431 activityC20431 = ((C8437) obj).f29292;
                C8067 c8067BuildDialog = activityC20431.buildDialog();
                c8067BuildDialog.m21277(activityC20431.f41645.getTitle());
                c8067BuildDialog.m21261(activityC20431.f41645.getSubtitle());
                c8067BuildDialog.m21251(R.string.MT_Protector, null);
                c8067BuildDialog.m21269();
                break;
            case 2:
                int i3 = ActivityC15472.f50406;
                ((ActivityC15472) obj).getOnBackPressedDispatcher().m34906();
                break;
            default:
                C4160.m11803((C4160) obj);
                break;
        }
    }
}
