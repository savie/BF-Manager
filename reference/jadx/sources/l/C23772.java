package l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹᩵۫, reason: contains not printable characters */
/* JADX INFO: compiled from: TAHS */
/* JADX INFO: loaded from: classes.dex */
public final class C23772 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f77018;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6618 f77019;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f77020;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f77021;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC5631 f77022;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23772(C6618 c6618, Main main, View view, CheckBox checkBox, CheckBox checkBox2, RunnableC5631 runnableC5631) {
        super(main, R.string.MT_Protector);
        this.f77019 = c6618;
        this.f77020 = view;
        this.f77021 = checkBox;
        this.f77018 = checkBox2;
        this.f77022 = runnableC5631;
        if (c6618.f22116) {
            FrameLayout frameLayoutM22941 = m22941();
            frameLayoutM22941.setVisibility(0);
            frameLayoutM22941.addView(view);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
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
        C6618 c6618 = this.f77019;
        boolean z = c6618.f22116 && this.f77021.isChecked();
        boolean z2 = c6618.f22116 && this.f77018.isChecked();
        if (c6618.f22117 || z || z2 || jM50717 != ((InterfaceC2386) c6618.f22118.get(0)).getTime()) {
            C6618.m18550(c6618, this.f77022, jM50717, z, z2);
        }
        m22951();
    }
}
