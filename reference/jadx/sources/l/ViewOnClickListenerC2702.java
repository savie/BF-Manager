package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2702 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10404;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10405;

    public /* synthetic */ ViewOnClickListenerC2702(int i, Object obj) {
        this.f10404 = i;
        this.f10405 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f10404;
        Object obj = this.f10405;
        switch (i) {
            case 0:
                C6936.m18613((C6936) obj, view);
                break;
            case 1:
                int i2 = ActivityC20293.f65753;
                ((ActivityC20293) obj).finish();
                break;
            case 2:
                DialogInterfaceOnDismissListenerC8913.m23189((DialogInterfaceOnDismissListenerC8913) obj);
                break;
            case 3:
                C8067 c8067BuildDialog = ((AbstractActivityC12483) obj).buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21253(R.string.MT_Protector);
                c8067BuildDialog.m21251(R.string.MT_Protector, null);
                C23250.m51307(c8067BuildDialog.m21269());
                break;
            default:
                C16737.m39272((CharSequence) ((C12107) obj).m30132().getName());
                break;
        }
    }
}
