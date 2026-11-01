package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes3.dex */
public final class C5305 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC8128 f18339;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f18340;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Bitmap f18341;

    public C5305(DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128, AbstractC20745 abstractC20745) {
        this.f18339 = dialogInterfaceOnClickListenerC8128;
        this.f18340 = abstractC20745;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128 = this.f18339;
        m10246(dialogInterfaceOnClickListenerC8128.f28458.m28824(), R.string.MT_Protector);
        this.f18341 = DialogInterfaceOnClickListenerC8128.m21396(dialogInterfaceOnClickListenerC8128.f28459.m42529());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128 = this.f18339;
        C2455 c2455 = new C2455(dialogInterfaceOnClickListenerC8128.f28457);
        try {
            try {
                C22918 c22918 = new C22918(this.f18340);
                try {
                    c22918.m50725("icon.png");
                    this.f18341.compress(Bitmap.CompressFormat.PNG, 90, c22918.m50720());
                    if (dialogInterfaceOnClickListenerC8128.f28459.m42534() != 0) {
                        C6037 c6037 = new C6037(0, new C1493(c2455.m7475(c2455.m7470("resources.arsc"), (C8516) null)));
                        C22785 c22785M50438 = C22785.m50438();
                        DialogInterfaceOnClickListenerC8128.m21398(c2455, c22918, c6037, dialogInterfaceOnClickListenerC8128.f28459.m42534(), false, c22785M50438);
                        if (c22785M50438.mo5141() != 0) {
                            c22918.m50725("resources.arsc");
                            c22785M50438.m50440(c22918.m50720());
                        }
                        c22918.close();
                        c2455.close();
                        return;
                    }
                    c22918.close();
                    c2455.close();
                    return;
                } catch (Throwable th) {
                    try {
                        c22918.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                c2455.close();
                throw th3;
            }
            c2455.close();
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
        throw th3;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128 = this.f18339;
        dialogInterfaceOnClickListenerC8128.f28460.dismiss();
        dialogInterfaceOnClickListenerC8128.f28458.m28787(this.f18340);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f18339.f28458.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
        this.f18340.mo24647();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
        C21094.m47530();
    }
}
