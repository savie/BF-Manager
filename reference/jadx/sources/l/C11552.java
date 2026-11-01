package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۨ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes4.dex */
public final class C11552 implements InterfaceC5673 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12963 f38846;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f38847;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f38848;

    @Override // l.InterfaceC5673
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo2812(String str) {
    }

    public C11552(C12963 c12963, View view, View view2) {
        this.f38846 = c12963;
        this.f38848 = view;
        this.f38847 = view2;
    }

    @Override // l.InterfaceC5673
    /* JADX INFO: renamed from: ۙ */
    public final void mo2810(String str) {
        this.f38846.m32096(str);
    }

    @Override // l.InterfaceC5673
    /* JADX INFO: renamed from: ۙ */
    public final void mo2811(EnumC22607 enumC22607) {
        boolean zM50115 = enumC22607.m50115();
        View view = this.f38847;
        View view2 = this.f38848;
        if (zM50115) {
            view2.setVisibility(8);
            view.setVisibility(4);
        } else {
            view2.setVisibility(0);
            view.setVisibility(0);
        }
    }
}
