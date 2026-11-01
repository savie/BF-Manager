package l;

import android.content.ClipboardManager;
import android.os.Vibrator;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ᩴ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18401 extends C2172 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22959 f58647 = C22959.m50799(250);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public WeakReference f58648;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42685(C19107 c19107) {
        if (m42682() != c19107) {
            this.f58648 = new WeakReference(c19107);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C19107 m42682() {
        WeakReference weakReference = this.f58648;
        if (weakReference == null) {
            return null;
        }
        return (C19107) weakReference.get();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m42686() {
        C19107 c19107M42682 = m42682();
        if (c19107M42682 != null) {
            c19107M42682.m43908();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42684(String str) {
        ClipboardManager clipboardManager;
        C19107 c19107M42682 = m42682();
        if (c19107M42682 == null || (clipboardManager = (ClipboardManager) c19107M42682.getContext().getSystemService("clipboard")) == null) {
            return;
        }
        try {
            clipboardManager.setText(str);
            C15829.m37611(R.string.MT_Protector);
        } catch (Throwable unused) {
            C15829.m37611(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42683() {
        C19107 c19107M42682 = m42682();
        if (c19107M42682 == null || !this.f58647.m50802()) {
            return;
        }
        Vibrator vibrator = (Vibrator) c19107M42682.getContext().getSystemService("vibrator");
        try {
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(new long[]{0, 10}, -1);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42687() {
        C19107 c19107M42682 = m42682();
        if (c19107M42682 != null) {
            c19107M42682.m43908();
        }
    }
}
