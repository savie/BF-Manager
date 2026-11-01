package l;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: l.᩸۟ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8GM */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC21437 implements InterfaceC19333, View.OnClickListener, InterfaceC10232 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18615 f69702;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object f69703;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20039 f69704 = new C20039();

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ void mo2571(int i) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ void mo2573(boolean z) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2576(int i) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2595(List list) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2597(C0987 c0987) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2598(C5221 c5221) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2600(C8044 c8044) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2606(C13689 c13689, int i) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2607(C14395 c14395) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2609(C15100 c15100) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2610(AbstractC16511 abstractC16511, int i) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2612(C18627 c18627) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2614(C21449 c21449) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2615(boolean z) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ void mo2621(boolean z) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo2623(int i) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo2628(int i, boolean z) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo2636(C15100 c15100) {
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo2637(boolean z) {
    }

    public ViewOnClickListenerC21437(C18615 c18615) {
        this.f69702 = c18615;
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final void mo2611(C16841 c16841) {
        C18615 c18615 = this.f69702;
        if (c18615.f59247 != null) {
            c18615.f59247.m44303(c16841.f53889);
        }
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final void mo2605(C13314 c13314) {
        if (c13314.equals(C13314.f44192)) {
            return;
        }
        C18615 c18615 = this.f69702;
        if (c18615.f59223 == null || c18615.f59223.mo25808() == 1) {
            return;
        }
        c18615.m43044();
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final void mo2577(int i, int i2) {
        if (Build.VERSION.SDK_INT == 34) {
            View unused = this.f69702.f59239;
        }
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۖ */
    public final void mo2570() {
        C18615 c18615 = this.f69702;
        if (c18615.f59231 != null) {
            c18615.f59231.setVisibility(4);
            if (c18615.m43035()) {
                C18615.m43034(c18615);
            } else {
                c18615.m43021();
            }
        }
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final void mo2601(C9456 c9456) {
        AbstractC16511 abstractC16511Mo25828;
        C18615 c18615 = this.f69702;
        InterfaceC10161 interfaceC10161 = c18615.f59223;
        interfaceC10161.getClass();
        if (interfaceC10161.mo25841(17)) {
            abstractC16511Mo25828 = interfaceC10161.mo25828();
        } else {
            abstractC16511Mo25828 = AbstractC16511.f53035;
        }
        if (abstractC16511Mo25828.m38828()) {
            this.f69703 = null;
        } else {
            boolean zMo25841 = interfaceC10161.mo25841(30);
            C20039 c20039 = this.f69704;
            if (zMo25841 && !interfaceC10161.mo25847().m24215()) {
                this.f69703 = abstractC16511Mo25828.mo5920(interfaceC10161.mo25824(), c20039, true).f64174;
            } else {
                Object obj = this.f69703;
                if (obj != null) {
                    int iMo14959 = abstractC16511Mo25828.mo14959(obj);
                    if (iMo14959 != -1) {
                        if (interfaceC10161.mo25810() == abstractC16511Mo25828.mo5920(iMo14959, c20039, false).f64168) {
                            return;
                        }
                    }
                    this.f69703 = null;
                }
            }
        }
        c18615.m43020(false);
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۨ */
    public final void mo2617(int i) {
        C18615 c18615 = this.f69702;
        c18615.m43039();
        C18615.m43042(c18615);
        C18615.m43040(c18615);
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final void mo2588(int i, boolean z) {
        C18615 c18615 = this.f69702;
        c18615.m43039();
        C18615.m43040(c18615);
    }

    @Override // l.InterfaceC19333
    /* JADX INFO: renamed from: ۙ */
    public final void mo2580(int i, C8750 c8750, C8750 c8751) {
        C18615 c18615 = this.f69702;
        if (c18615.m43029() && c18615.f59233) {
            c18615.m43050();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f69702.m43037();
    }

    @Override // l.InterfaceC10232
    /* JADX INFO: renamed from: ܰ */
    public final void mo26025() {
        this.f69702.m43041();
    }
}
