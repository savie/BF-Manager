package l;

import android.content.ClipboardManager;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1XC */
/* JADX INFO: loaded from: classes3.dex */
public final class C12277 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ClipboardManager f39476 = (ClipboardManager) C21576.m49084().getSystemService("clipboard");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractDialogInterfaceOnClickListenerC8552 f39477;

    public C12277(C8614 c8614) {
        C20482 c20482 = new C20482(c8614.m23233(), c8614);
        c20482.m22945(R.string.MT_Protector);
        c20482.m22924((CharSequence) C18969.m44060(2000, c8614.m23204()));
        c20482.m22957(2);
        c20482.m22959();
        this.f39477 = c20482;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30666(C12277 c12277) {
        ClipboardManager clipboardManager = c12277.f39476;
        if (clipboardManager.hasPrimaryClip()) {
            CharSequence text = clipboardManager.getText();
            AbstractDialogInterfaceOnClickListenerC8552 abstractDialogInterfaceOnClickListenerC8552 = c12277.f39477;
            abstractDialogInterfaceOnClickListenerC8552.m22924((CharSequence) (text == null ? "" : text.toString()));
            abstractDialogInterfaceOnClickListenerC8552.m22916();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30667() {
        AbstractDialogInterfaceOnClickListenerC8552 abstractDialogInterfaceOnClickListenerC8552 = this.f39477;
        abstractDialogInterfaceOnClickListenerC8552.m22955(true);
        abstractDialogInterfaceOnClickListenerC8552.m22928().setOnClickListener(new ViewOnClickListenerC3673(2, this));
    }
}
