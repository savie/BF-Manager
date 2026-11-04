package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܿܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: OIRX */
/* JADX INFO: loaded from: classes5.dex */
public final class C18431 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogC7990 f60017;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f60018;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f60019;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f60020;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8614 f60021;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bitmap f60022;

    public C18431(DialogC7990 dialogC7990, String str, Bitmap bitmap) {
        this.f60017 = dialogC7990;
        this.f60019 = str;
        this.f60022 = bitmap;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C20065 c20065M117;
        Main mainM18052 = C6331.m18052();
        if (mainM18052 == null || !mainM18052.getLifecycle().mo23076().m8762(EnumC2619.STARTED) || (c20065M117 = mainM18052.m117()) == null) {
            return;
        }
        C8614 c8614M46155 = c20065M117.m46155();
        this.f60021 = c8614M46155;
        this.f60020 = c8614M46155.m23170(this.f60019, false);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        if (this.f60020 == null) {
            this.f60020 = C6382.m18134().m49876(this.f60019.replaceAll("[:\\\\/*?<>\"|]", "_").replaceAll("\\s", " "));
        }
        Bitmap bitmap = this.f60022;
        AbstractC22044 abstractC22044M49839 = this.f60020.m49839(true);
        if (!abstractC22044M49839.mo4283()) {
            throw new IOException(C1402.m5125(abstractC22044M49839, new StringBuilder("Could not create cover image: ")));
        }
        try {
            OutputStream outputStreamMo4289 = abstractC22044M49839.mo4289(false);
            try {
                if (!bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamMo4289)) {
                    throw new IOException("Could not encode cover image");
                }
                if (outputStreamMo4289 != null) {
                    outputStreamMo4289.close();
                }
                this.f60018 = abstractC22044M49839;
                return;
            } catch (Throwable th) {
                if (outputStreamMo4289 != null) {
                    try {
                        outputStreamMo4289.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            abstractC22044M49839.mo4296();
            throw th3;
        }
        abstractC22044M49839.mo4296();
        throw th3;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C6331.m18055();
        DialogC7990 dialogC7990 = this.f60017;
        if (DialogC7990.m21782(dialogC7990)) {
            C8614 c8614 = this.f60021;
            if (c8614 != null) {
                c8614.m23186(this.f60018);
            }
            C2361 c2361BuildDialog = dialogC7990.f26538.buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8008(dialogC7990.f26538.getString(R.string.MT_Protector, this.f60018.mo4294()));
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
            dialogC7990.f26537 = c2361BuildDialog.m8016();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        DialogC7990 dialogC7990 = this.f60017;
        if (DialogC7990.m21782(dialogC7990)) {
            dialogC7990.f26538.m40401(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        DialogC7990 dialogC7990 = this.f60017;
        dialogC7990.f26539.setEnabled(dialogC7990.f26540 != null);
    }
}
