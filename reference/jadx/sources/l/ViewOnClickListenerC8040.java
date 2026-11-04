package l;

import android.view.View;

/* JADX INFO: renamed from: l.۟ܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4HK */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC8040 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26663;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f26664;

    public /* synthetic */ ViewOnClickListenerC8040(int i, Object obj) {
        this.f26663 = i;
        this.f26664 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f26663) {
            case 0:
                AbstractC10276.m26488((AbstractC10276) this.f26664);
                break;
            case 1:
                ((ActivityC23288) this.f26664).m52410();
                break;
            default:
                ((AbstractActivityC10144) this.f26664).m26230();
                break;
        }
    }
}
