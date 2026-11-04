package l;

import android.content.DialogInterface;
import android.widget.Spinner;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩸᩷۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5PI */
/* JADX INFO: loaded from: classes.dex */
public final class C23070 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1255 f74838;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f74839;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1255 f74840;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25308 f74841;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10745 f74842;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f74843;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f74844;

    public C23070(C25308 c25308, Spinner spinner, Main main, C1255 c1255, C1255 c1256, C8614 c8614) {
        this.f74841 = c25308;
        this.f74844 = spinner;
        this.f74839 = main;
        this.f74838 = c1255;
        this.f74840 = c1256;
        this.f74843 = c8614;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        ApplicationC17729.f58258.edit().mo3486(this.f74844.getSelectedItemPosition(), "dex_fixer_dex_version");
        C10745 c10745 = new C10745(this.f74839);
        c10745.mo25916((Runnable) null);
        c10745.m27397(R.string.MT_Protector);
        c10745.m27391(R.string.MT_Protector);
        c10745.mo25931();
        this.f74842 = c10745;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C11135 c11135 = new C11135(this);
        C25308 c25308 = this.f74841;
        c25308.f81759 = c11135;
        C25308.m56570(c25308.f81757, c25308.f81758, this.f74844.getSelectedItemPosition(), this.f74838.isChecked(), this.f74840.isChecked(), c25308.f81759);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() throws IOException {
        boolean zM27399 = this.f74842.m27399();
        C25308 c25308 = this.f74841;
        if (zM27399) {
            c25308.f81758.mo4296();
            return;
        }
        if (ApplicationC17729.f58258.getBoolean("dfb", true)) {
            c25308.f81757.m49867();
        } else {
            c25308.f81757.mo4287();
        }
        c25308.f81758.m49845(c25308.f81757, (Runnable) null);
        this.f74843.m23230(c25308.f81757.getName());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        boolean zIsChecked = this.f74840.isChecked();
        Main main = this.f74839;
        if (!zIsChecked) {
            for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
                String message = cause.getMessage();
                if (message != null && message.contains("Invalid element width")) {
                    exc = new Exception(main.getString(R.string.MT_Protector, main.getString(R.string.MT_Protector)), exc);
                    break;
                }
            }
        }
        main.m40401(exc, (DialogInterface.OnDismissListener) null);
        this.f74841.f81758.mo4296();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f74842.m27405();
        C6331.m18055();
    }
}
