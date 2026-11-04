package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴۧ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: SAKA */
/* JADX INFO: loaded from: classes5.dex */
public final class C19779 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f63624;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5609 f63625;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f63626;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f63627;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC3547 f63628;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19779(C5609 c5609, Main main, View view, CheckBox checkBox, CheckBox checkBox2, RunnableC3547 runnableC3547) {
        super(main, R.string.MT_Protector);
        this.f63625 = c5609;
        this.f63626 = view;
        this.f63627 = checkBox;
        this.f63624 = checkBox2;
        this.f63628 = runnableC3547;
        if (c5609.f19437) {
            FrameLayout frameLayoutM22941 = m22941();
            frameLayoutM22941.setVisibility(0);
            frameLayoutM22941.addView(view);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        C5609 c5609 = this.f63625;
        String strTrim = m22914().trim();
        if (strTrim.isEmpty()) {
            m22951();
            return;
        }
        long jM50717 = C22482.m50717(strTrim);
        if (jM50717 < 0) {
            m22952(R.string.MT_Protector);
            return;
        }
        try {
            C6265.m17912(c5609.f19440.m23192(), EnumC12230.MODIFY_DIRECTORY_LINKED);
            boolean z = false;
            boolean z2 = c5609.f19437 && this.f63627.isChecked();
            if (c5609.f19437 && this.f63624.isChecked()) {
                z = true;
            }
            if (c5609.f19438 || z2 || z || jM50717 != ((InterfaceC2386) c5609.f19439.get(0)).getTime()) {
                new C15303(c5609, jM50717, z2, z, this.f63628).m8197();
            }
            m22951();
        } catch (C4866 e) {
            c5609.f19440.m23233().m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
