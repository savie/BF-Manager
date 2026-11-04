package l;

import android.view.View;
import com.tencent.connect.auth.a;

/* JADX INFO: renamed from: l.ۙۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC4676 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ a f16505;

    public ViewOnClickListenerC4676(a aVar) {
        this.f16505 = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar = this.f16505;
        aVar.dismiss();
        if (aVar.f868 || aVar.f874 == null) {
            return;
        }
        aVar.f874.mo2046();
    }
}
