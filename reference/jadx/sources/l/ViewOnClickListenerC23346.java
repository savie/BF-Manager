package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4HK */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC23346 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75642;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75643;

    public /* synthetic */ ViewOnClickListenerC23346(int i, Object obj) {
        this.f75642 = i;
        this.f75643 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f75642) {
            case 0:
                AbstractC1472.m5116((AbstractC1472) this.f75643);
                break;
            case 1:
                DialogInterfaceOnDismissListenerC8913.m23199((DialogInterfaceOnDismissListenerC8913) this.f75643);
                break;
            case 2:
                C6936.m18615((C6936) this.f75643, view);
                break;
            default:
                C8067 c8067BuildDialog = ((AbstractActivityC12483) this.f75643).buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21253(R.string.MT_Protector);
                c8067BuildDialog.m21251(R.string.MT_Protector, null);
                C23250.m51307(c8067BuildDialog.m21269());
                break;
        }
    }
}
