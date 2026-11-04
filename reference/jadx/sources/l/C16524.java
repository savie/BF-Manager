package l;

import android.content.DialogInterface;
import android.os.SystemClock;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.widget.CheckBox;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes4.dex */
public final class C16524 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f53492;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final JsResult f53493;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3846 f53494;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final CheckBox f53495;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f53496;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C17270 f53497;

    public C16524(ActivityC3846 activityC3846, C17270 c17270, JsResult jsResult) {
        this.f53494 = activityC3846;
        this.f53497 = c17270;
        this.f53493 = jsResult;
        this.f53495 = c17270.f56260 >= 3 ? (CheckBox) activityC3846.m40395(R.layout.MT_Protector) : null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39152(final C16524 c16524, DialogInterfaceC8327 dialogInterfaceC8327) {
        c16524.f53496 = dialogInterfaceC8327;
        dialogInterfaceC8327.m22426(new DialogInterface.OnDismissListener() { // from class: l.᩻ۖ֫
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f80043.m39150(null, false, true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m39150(String str, boolean z, boolean z2) {
        CheckBox checkBox;
        if (this.f53492) {
            return;
        }
        this.f53492 = true;
        C17270 c17270 = this.f53497;
        if (z2 && (checkBox = this.f53495) != null && checkBox.isChecked()) {
            c17270.f56258 = true;
        }
        c17270.f56259 = SystemClock.elapsedRealtime();
        ActivityC3846 activityC3846 = this.f53494;
        if (activityC3846.f13146 == this) {
            activityC3846.f13146 = null;
        }
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f53496;
        if (dialogInterfaceC8327 != null) {
            dialogInterfaceC8327.dismiss();
        }
        JsResult jsResult = this.f53493;
        if (!z) {
            jsResult.cancel();
        } else if (jsResult instanceof JsPromptResult) {
            ((JsPromptResult) jsResult).confirm(str);
        } else {
            jsResult.confirm();
        }
    }
}
