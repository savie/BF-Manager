package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶ܿ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC20314 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65798;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65799;

    public /* synthetic */ ViewOnClickListenerC20314(int i, Object obj) {
        this.f65798 = i;
        this.f65799 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f65798;
        Object obj = this.f65799;
        switch (i) {
            case 0:
                ActivityC10957.m27636((ActivityC10957) obj, view);
                break;
            case 1:
                ((C11545) obj).m28824().m30996(R.string.MT_Protector, R.string.MT_Protector, false);
                break;
            default:
                C16609 c16609 = ActivityC14555.f47653;
                ((ActivityC14555) obj).finish();
                break;
        }
    }
}
