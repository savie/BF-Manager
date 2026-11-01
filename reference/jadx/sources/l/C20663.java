package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.᩷ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBMC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20663 implements InterfaceC5673 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC0201 f67249;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f67250;

    @Override // l.InterfaceC5673
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo2812(String str) {
    }

    public C20663(ViewOnClickListenerC0201 viewOnClickListenerC0201, TextView textView) {
        this.f67249 = viewOnClickListenerC0201;
        this.f67250 = textView;
    }

    @Override // l.InterfaceC5673
    /* JADX INFO: renamed from: ۙ */
    public final void mo2810(String str) {
        this.f67249.f1355.m37451(str);
    }

    @Override // l.InterfaceC5673
    /* JADX INFO: renamed from: ۙ */
    public final void mo2811(EnumC22607 enumC22607) {
        this.f67250.setVisibility(enumC22607.m50115() ? 4 : 0);
    }
}
