package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ܳۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14272 implements InterfaceC5673 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4475 f46792;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f46793;

    @Override // l.InterfaceC5673
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo2812(String str) {
    }

    public C14272(C4475 c4475, TextView textView) {
        this.f46792 = c4475;
        this.f46793 = textView;
    }

    @Override // l.InterfaceC5673
    /* JADX INFO: renamed from: ۙ */
    public final void mo2810(String str) {
        this.f46792.f15922.m5371(str);
    }

    @Override // l.InterfaceC5673
    /* JADX INFO: renamed from: ۙ */
    public final void mo2811(EnumC22607 enumC22607) {
        this.f46793.setVisibility(enumC22607.m50115() ? 4 : 0);
    }
}
