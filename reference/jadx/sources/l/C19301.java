package l;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ᩳ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19301 implements InterfaceC2192, InterfaceC1733, InterfaceC21100, InterfaceC17544, InterfaceC12761, InterfaceC22491 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62378;

    public /* synthetic */ C19301(Object obj) {
        this.f62378 = obj;
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public void mo1209(int i) {
        ((C25352) this.f62378).mo16839(i);
    }

    @Override // l.InterfaceC2192
    /* JADX INFO: renamed from: ۙ */
    public void mo7499(int i, int i2, int i3, int i4) {
        C24943.m55634((C24943) this.f62378, i2, i3, i4);
    }

    @Override // l.InterfaceC22491
    public C3977 onApplyWindowInsets(View view, C3977 c3977) {
        C16390 c16390 = (C16390) this.f62378;
        C13275 c13275M12832 = c3977.m12832(135);
        c16390.setPadding(c13275M12832.f42407, c13275M12832.f42408, c13275M12832.f42406, 0);
        return c3977;
    }

    @Override // l.InterfaceC12761
    /* JADX INFO: renamed from: ۙ */
    public void mo19441(TextView textView, Button button) {
        ViewOnClickListenerC15284.m36687(textView, ((C9097) this.f62378).m24245());
        button.setVisibility(4);
    }

    @Override // l.InterfaceC11427
    /* JADX INFO: renamed from: ۙ */
    public void mo14029(AbstractC22044 abstractC22044) {
        abstractC22044.m49844((C6178) this.f62378);
    }

    @Override // l.InterfaceC21100
    /* JADX INFO: renamed from: ᩷ */
    public Bitmap mo6272() {
        return C8275.m22342((C18716) this.f62378);
    }
}
