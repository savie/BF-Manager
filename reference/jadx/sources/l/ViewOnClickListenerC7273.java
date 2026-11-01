package l;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC7273 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24196;

    public /* synthetic */ ViewOnClickListenerC7273(int i) {
        this.f24196 = i;
    }

    public /* synthetic */ ViewOnClickListenerC7273(Context context) {
        this.f24196 = 2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f24196) {
            case 0:
                if (!ServiceC8498.m22208()) {
                    Application applicationM39277 = C16737.m39277();
                    C10405.m26303(applicationM39277, new Intent(applicationM39277, (Class<?>) ServiceC8498.class));
                } else {
                    Application applicationM39278 = C16737.m39277();
                    applicationM39278.stopService(new Intent(applicationM39278, (Class<?>) ServiceC8498.class));
                }
                break;
            case 1:
                int i = C1192.f5292;
                break;
            default:
                C15829.m37617(R.string.MT_Protector, 0).m37622();
                break;
        }
    }
}
