package l;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC17519 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56946 = 1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56947;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56948;

    public /* synthetic */ ViewOnClickListenerC17519(C1101 c1101, AbstractActivityC17204 abstractActivityC17204, List list) {
        this.f56948 = abstractActivityC17204;
        this.f56947 = list;
    }

    public /* synthetic */ ViewOnClickListenerC17519(C8614 c8614, InterfaceC2386 interfaceC2386) {
        this.f56948 = c8614;
        this.f56947 = interfaceC2386;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f56946) {
            case 0:
                C10060.m25998((C8614) this.f56948, (InterfaceC2386) this.f56947);
                break;
            default:
                C1101.m4110((AbstractActivityC17204) this.f56948, (List) this.f56947);
                break;
        }
    }
}
