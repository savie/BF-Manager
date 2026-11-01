package l;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: l.ۖ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2379 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f8404;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f8405;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f8406;

    public /* synthetic */ ViewOnClickListenerC2379(int i, Object obj, Object obj2) {
        this.f8405 = i;
        this.f8406 = obj;
        this.f8404 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8405) {
            case 0:
                C5202.m14377((C5202) this.f8406, (AbstractActivityC12483) this.f8404);
                break;
            default:
                ((C14063) this.f8406).f46208.startActivity(new Intent("android.intent.action.DELETE", Uri.fromParts("package", ((C9436) this.f8404).f31946, null)));
                break;
        }
    }
}
