package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC22904 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74457;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74458;

    public /* synthetic */ ViewOnClickListenerC22904(int i, Object obj) {
        this.f74457 = i;
        this.f74458 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f74457;
        Object obj = this.f74458;
        switch (i) {
            case 0:
                int i2 = ViewOnClickListenerC8793.f30222;
                ((ViewOnClickListenerC8793) obj).finish();
                break;
            case 1:
                C8067 c8067BuildDialog = ((AbstractActivityC12483) obj).buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21253(R.string.MT_Protector);
                c8067BuildDialog.m21251(R.string.MT_Protector, null);
                C23250.m51307(c8067BuildDialog.m21269());
                break;
            default:
                C11613.m28943((C11613) obj);
                break;
        }
    }
}
