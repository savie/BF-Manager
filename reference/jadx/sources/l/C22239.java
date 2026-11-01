package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩹ۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes.dex */
public final class C22239 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC8128 f72701;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72702;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f72703;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Bitmap f72704;

    public C22239(DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128, AbstractC20745 abstractC20745, int i) {
        this.f72701 = dialogInterfaceOnClickListenerC8128;
        this.f72703 = abstractC20745;
        this.f72702 = i;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128 = this.f72701;
        m10246(dialogInterfaceOnClickListenerC8128.f28458.m28824(), R.string.MT_Protector);
        this.f72704 = DialogInterfaceOnClickListenerC8128.m21396(dialogInterfaceOnClickListenerC8128.f28459.m42529());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        OutputStream outputStreamMo33976 = this.f72703.mo33976(false);
        try {
            int i = this.f72702;
            if (i == 1) {
                this.f72704.compress(Bitmap.CompressFormat.PNG, 90, outputStreamMo33976);
            } else if (i == 2) {
                this.f72704.compress(Bitmap.CompressFormat.WEBP, 90, outputStreamMo33976);
            }
            if (outputStreamMo33976 != null) {
                outputStreamMo33976.close();
            }
        } catch (Throwable th) {
            if (outputStreamMo33976 != null) {
                try {
                    outputStreamMo33976.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128 = this.f72701;
        dialogInterfaceOnClickListenerC8128.f28460.dismiss();
        dialogInterfaceOnClickListenerC8128.f28458.m28787(this.f72703);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f72701.f28458.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
        this.f72703.mo24647();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
        C21094.m47530();
    }
}
