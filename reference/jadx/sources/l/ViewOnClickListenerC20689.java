package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: l.᩷ۛ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC20689 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67282;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f67283;

    public /* synthetic */ ViewOnClickListenerC20689(int i, Object obj) {
        this.f67282 = i;
        this.f67283 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f67282;
        Object obj = this.f67283;
        switch (i) {
            case 0:
                ActivityC10957.m27692((ActivityC10957) obj);
                break;
            case 1:
                ActivityC3541 activityC3541 = (ActivityC3541) obj;
                int i2 = ActivityC3541.f13037;
                try {
                    activityC3541.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C1355.m4774())));
                } catch (Throwable th) {
                    activityC3541.m31002(th, (DialogInterface.OnDismissListener) null);
                    return;
                }
                break;
            default:
                C16548.m38951((C16548) obj);
                break;
        }
    }
}
