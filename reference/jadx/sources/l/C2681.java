package l;

import android.content.DialogInterface;
import android.widget.Spinner;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۖܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5PI */
/* JADX INFO: loaded from: classes2.dex */
public final class C2681 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23144 f10355;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12562 f10356;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12562 f10357;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f10358;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f10359;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1777 f10360;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f10361;

    public C2681(C23144 c23144, Spinner spinner, Main main, C12562 c12562, C12562 c12563, C11545 c11545) {
        this.f10355 = c23144;
        this.f10361 = spinner;
        this.f10358 = main;
        this.f10356 = c12562;
        this.f10357 = c12563;
        this.f10359 = c11545;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        ApplicationC0716.f2992.edit().mo4065(this.f10361.getSelectedItemPosition(), "dex_fixer_dex_version");
        C1777 c1777 = new C1777(this.f10358);
        c1777.mo5828((Runnable) null);
        c1777.m5837(R.string.MT_Protector);
        c1777.m5830(R.string.MT_Protector);
        c1777.mo5843();
        this.f10360 = c1777;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C11855 c11855 = new C11855(this);
        C23144 c23144 = this.f10355;
        c23144.f75142 = c11855;
        C23144.m51140(c23144.f75140, c23144.f75141, this.f10361.getSelectedItemPosition(), this.f10356.isChecked(), this.f10357.isChecked(), c23144.f75142);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() throws IOException {
        boolean zM5824 = this.f10360.m5824();
        C23144 c23144 = this.f10355;
        if (zM5824) {
            c23144.f75141.mo24647();
            return;
        }
        if (ApplicationC0716.f2992.getBoolean("dfb", true)) {
            c23144.f75140.m46687();
        } else {
            c23144.f75140.mo24644();
        }
        c23144.f75141.m46699(c23144.f75140, (Runnable) null);
        this.f10359.m28763(c23144.f75140.getName());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        boolean zIsChecked = this.f10357.isChecked();
        Main main = this.f10358;
        if (!zIsChecked) {
            for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
                String message = cause.getMessage();
                if (message != null && message.contains("Invalid element width")) {
                    exc = new Exception(main.getString(R.string.MT_Protector, main.getString(R.string.MT_Protector)), exc);
                    break;
                }
            }
        }
        main.m31002(exc, (DialogInterface.OnDismissListener) null);
        this.f10355.f75141.mo24647();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f10360.m5825();
        C21094.m47530();
    }
}
