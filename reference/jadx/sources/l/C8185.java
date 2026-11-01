package l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: TAHS */
/* JADX INFO: loaded from: classes3.dex */
public final class C8185 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f28532;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7479 f28533;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f28534;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC3681 f28535;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f28536;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8185(C7479 c7479, Main main, View view, CheckBox checkBox, CheckBox checkBox2, RunnableC3681 runnableC3681) {
        super(main, R.string.MT_Protector);
        this.f28533 = c7479;
        this.f28532 = view;
        this.f28534 = checkBox;
        this.f28536 = checkBox2;
        this.f28535 = runnableC3681;
        if (c7479.f24914) {
            FrameLayout frameLayoutM40333 = m40333();
            frameLayoutM40333.setVisibility(0);
            frameLayoutM40333.addView(view);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strTrim = m40352().trim();
        if (strTrim.isEmpty()) {
            m40364();
            return;
        }
        long jM14743 = C5319.m14743(strTrim);
        if (jM14743 < 0) {
            m40365(R.string.MT_Protector);
            return;
        }
        C7479 c7479 = this.f28533;
        boolean z = c7479.f24914 && this.f28534.isChecked();
        boolean z2 = c7479.f24914 && this.f28536.isChecked();
        if (c7479.f24915 || z || z2 || jM14743 != ((InterfaceC2557) c7479.f24916.get(0)).getTime()) {
            C7479.m19974(c7479, this.f28535, jM14743, z, z2);
        }
        m40364();
    }
}
