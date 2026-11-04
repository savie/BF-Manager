package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes.dex */
public final class C24744 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f80125;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC14300 f80126;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Bitmap f80127;

    public C24744(DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300, AbstractC22044 abstractC22044) {
        this.f80126 = dialogInterfaceOnClickListenerC14300;
        this.f80125 = abstractC22044;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300 = this.f80126;
        m8191(dialogInterfaceOnClickListenerC14300.f45154.m23233(), R.string.MT_Protector);
        this.f80127 = DialogInterfaceOnClickListenerC14300.m34706(dialogInterfaceOnClickListenerC14300.f45158.m28713());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300 = this.f80126;
        C22941 c22941 = new C22941(dialogInterfaceOnClickListenerC14300.f45155);
        try {
            try {
                C25179 c25179 = new C25179(this.f80125);
                try {
                    c25179.m56124("icon.png");
                    this.f80127.compress(Bitmap.CompressFormat.PNG, 90, c25179.m56119());
                    if (dialogInterfaceOnClickListenerC14300.f45158.m28720() != 0) {
                        C21246 c21246 = new C21246(0, new C24296(c22941.m51731(c22941.m51724("resources.arsc"), (C3374) null)));
                        C23001 c23001M51886 = C23001.m51886();
                        DialogInterfaceOnClickListenerC14300.m34721(c22941, c25179, c21246, dialogInterfaceOnClickListenerC14300.f45158.m28720(), false, c23001M51886);
                        if (c23001M51886.mo15674() != 0) {
                            c25179.m56124("resources.arsc");
                            c23001M51886.m51892(c25179.m56119());
                        }
                        c25179.close();
                        c22941.close();
                        return;
                    }
                    c25179.close();
                    c22941.close();
                    return;
                } catch (Throwable th) {
                    try {
                        c25179.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                c22941.close();
                throw th3;
            }
            c22941.close();
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
        throw th3;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300 = this.f80126;
        dialogInterfaceOnClickListenerC14300.f45152.dismiss();
        dialogInterfaceOnClickListenerC14300.f45154.m23186(this.f80125);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f80126.f45154.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
        this.f80125.mo4296();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
        C6331.m18055();
    }
}
