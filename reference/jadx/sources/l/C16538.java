package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܺۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes5.dex */
public final class C16538 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53535;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f53536;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC14300 f53537;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Bitmap f53538;

    public C16538(DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300, AbstractC22044 abstractC22044, int i) {
        this.f53537 = dialogInterfaceOnClickListenerC14300;
        this.f53536 = abstractC22044;
        this.f53535 = i;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300 = this.f53537;
        m8191(dialogInterfaceOnClickListenerC14300.f45154.m23233(), R.string.MT_Protector);
        this.f53538 = DialogInterfaceOnClickListenerC14300.m34706(dialogInterfaceOnClickListenerC14300.f45158.m28713());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        OutputStream outputStreamMo4289 = this.f53536.mo4289(false);
        try {
            int i = this.f53535;
            if (i == 1) {
                this.f53538.compress(Bitmap.CompressFormat.PNG, 90, outputStreamMo4289);
            } else if (i == 2) {
                this.f53538.compress(Bitmap.CompressFormat.WEBP, 90, outputStreamMo4289);
            }
            if (outputStreamMo4289 != null) {
                outputStreamMo4289.close();
            }
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
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300 = this.f53537;
        dialogInterfaceOnClickListenerC14300.f45152.dismiss();
        dialogInterfaceOnClickListenerC14300.f45154.m23186(this.f53536);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f53537.f45154.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
        this.f53536.mo4296();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
        C6331.m18055();
    }
}
