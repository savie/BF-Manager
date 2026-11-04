package l;

import android.content.ClipboardManager;
import android.os.Vibrator;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۡۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UC */
/* JADX INFO: loaded from: classes4.dex */
public final class C9325 extends C6344 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24720 f30304 = C24720.m55194(250);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public WeakReference f30305;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24565(C8580 c8580) {
        if (m24562() != c8580) {
            this.f30305 = new WeakReference(c8580);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private C8580 m24562() {
        WeakReference weakReference = this.f30305;
        if (weakReference == null) {
            return null;
        }
        return (C8580) weakReference.get();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m24566() {
        C8580 c8580M24562 = m24562();
        if (c8580M24562 != null) {
            c8580M24562.m23066();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24564(String str) {
        ClipboardManager clipboardManager;
        C8580 c8580M24562 = m24562();
        if (c8580M24562 == null || (clipboardManager = (ClipboardManager) c8580M24562.getContext().getSystemService("clipboard")) == null) {
            return;
        }
        try {
            clipboardManager.setText(str);
            C22673.m51152(R.string.MT_Protector);
        } catch (Throwable unused) {
            C22673.m51152(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24563() {
        C8580 c8580M24562 = m24562();
        if (c8580M24562 == null || !this.f30304.m55199()) {
            return;
        }
        Vibrator vibrator = (Vibrator) c8580M24562.getContext().getSystemService("vibrator");
        try {
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(new long[]{0, 10}, -1);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24567() {
        C8580 c8580M24562 = m24562();
        if (c8580M24562 != null) {
            c8580M24562.m23066();
        }
    }
}
