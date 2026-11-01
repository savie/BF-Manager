package l;

import android.content.Context;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC16222 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f52347;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f52348;

    public /* synthetic */ ViewOnClickListenerC16222(int i, Object obj) {
        this.f52347 = i;
        this.f52348 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f52347) {
            case 0:
                ((AbstractActivityC12483) this.f52348).m30996(R.string.MT_Protector, R.string.MT_Protector, false);
                break;
            default:
                ActivityC14082.m34069((Context) ((ViewOnClickListenerC0201) this.f52348).f1352, C1355.m4779(), false);
                break;
        }
    }
}
