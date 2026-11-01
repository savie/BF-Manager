package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: SAKA */
/* JADX INFO: loaded from: classes2.dex */
public final class C2291 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f8164;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0880 f8165;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f8166;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC10138 f8167;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f8168;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2291(C0880 c0880, Main main, View view, CheckBox checkBox, CheckBox checkBox2, RunnableC10138 runnableC10138) {
        super(main, R.string.MT_Protector);
        this.f8165 = c0880;
        this.f8164 = view;
        this.f8166 = checkBox;
        this.f8168 = checkBox2;
        this.f8167 = runnableC10138;
        if (c0880.f3570) {
            FrameLayout frameLayoutM40333 = m40333();
            frameLayoutM40333.setVisibility(0);
            frameLayoutM40333.addView(view);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        C0880 c0880 = this.f8165;
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
        try {
            C2462.m7541(c0880.f3569.m28801(), EnumC11636.MODIFY_DIRECTORY_LINKED);
            boolean z = false;
            boolean z2 = c0880.f3570 && this.f8166.isChecked();
            if (c0880.f3570 && this.f8168.isChecked()) {
                z = true;
            }
            if (c0880.f3571 || z2 || z || jM14743 != ((InterfaceC2557) c0880.f3572.get(0)).getTime()) {
                new C5114(c0880, jM14743, z2, z, this.f8167).m10243();
            }
            m40364();
        } catch (C4987 e) {
            c0880.f3569.m28824().m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
