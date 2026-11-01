package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC17445 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f55546;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f55547;

    public /* synthetic */ ViewOnClickListenerC17445(int i, Object obj) {
        this.f55546 = i;
        this.f55547 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f55546;
        Object obj = this.f55547;
        switch (i) {
            case 0:
                ViewOnLayoutChangeListenerC3333.m9904((ViewOnLayoutChangeListenerC3333) obj);
                break;
            case 1:
                AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) obj;
                C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21253(R.string.MT_Protector);
                c8067BuildDialog.m21251(R.string.MT_Protector, null);
                c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8067BuildDialog.m21269().m44361().setOnClickListener(new ViewOnClickListenerC12024(2, abstractActivityC12483));
                break;
            case 2:
                int i2 = ActivityC12499.f41793;
                ((ActivityC12499) obj).finish();
                break;
            case 3:
                ((C22418) obj).m49705(view);
                break;
            default:
                C23566 c23566 = (C23566) obj;
                c23566.getClass();
                C23566.m51966(c23566, R.string.MT_Protector, null, null, 14);
                break;
        }
    }
}
