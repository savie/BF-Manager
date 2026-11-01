package l;

import android.view.View;
import com.tencent.connect.auth.a;

/* JADX INFO: renamed from: l.᩶۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC20029 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ a f64139;

    public ViewOnClickListenerC20029(a aVar) {
        this.f64139 = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar = this.f64139;
        aVar.dismiss();
        if (aVar.f871 || aVar.f884 == null) {
            return;
        }
        aVar.f884.mo16213();
    }
}
