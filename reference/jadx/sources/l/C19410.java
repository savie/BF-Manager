package l;

import android.content.ClipboardManager;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵ۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1XC */
/* JADX INFO: loaded from: classes4.dex */
public final class C19410 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ClipboardManager f62559 = (ClipboardManager) C16737.m39277().getSystemService("clipboard");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractDialogInterfaceOnClickListenerC17341 f62560;

    public C19410(C11545 c11545) {
        C8121 c8121 = new C8121(c11545.m28824(), c11545);
        c8121.m40376(R.string.MT_Protector);
        c8121.m40346((CharSequence) C13012.m32189(2000, c11545.m28799()));
        c8121.m40336(2);
        c8121.m40355();
        this.f62560 = c8121;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44460(C19410 c19410) {
        ClipboardManager clipboardManager = c19410.f62559;
        if (clipboardManager.hasPrimaryClip()) {
            CharSequence text = clipboardManager.getText();
            AbstractDialogInterfaceOnClickListenerC17341 abstractDialogInterfaceOnClickListenerC17341 = c19410.f62560;
            abstractDialogInterfaceOnClickListenerC17341.m40346((CharSequence) (text == null ? "" : text.toString()));
            abstractDialogInterfaceOnClickListenerC17341.m40371();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44461() {
        AbstractDialogInterfaceOnClickListenerC17341 abstractDialogInterfaceOnClickListenerC17341 = this.f62560;
        abstractDialogInterfaceOnClickListenerC17341.m40368(true);
        abstractDialogInterfaceOnClickListenerC17341.m40338().setOnClickListener(new View.OnClickListener() { // from class: l.ᩴۤ᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19410.m44460(this.f60676);
            }
        });
    }
}
