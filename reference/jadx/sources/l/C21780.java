package l;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: renamed from: l.᩸᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7TV */
/* JADX INFO: loaded from: classes4.dex */
public final class C21780 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AudioManager f70564;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized AudioManager m48542(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            f70564 = null;
        }
        AudioManager audioManager = f70564;
        if (audioManager != null) {
            return audioManager;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
            C22176 c22176 = new C22176();
            C13672.m33379().execute(new RunnableC10945(1, applicationContext, c22176));
            c22176.m49200();
            AudioManager audioManager2 = f70564;
            audioManager2.getClass();
            return audioManager2;
        }
        AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
        f70564 = audioManager3;
        audioManager3.getClass();
        return audioManager3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48543(Context context, C22176 c22176) {
        f70564 = (AudioManager) context.getSystemService("audio");
        c22176.m49198();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m48545(AudioManager audioManager, C15431 c15431) {
        if (Build.VERSION.SDK_INT >= 26) {
            return audioManager.requestAudioFocus(c15431.m36907());
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListenerM36909 = c15431.m36909();
        c15431.m36908().getClass();
        return audioManager.requestAudioFocus(onAudioFocusChangeListenerM36909, 3, c15431.m36906());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48544(AudioManager audioManager, C15431 c15431) {
        if (Build.VERSION.SDK_INT >= 26) {
            audioManager.abandonAudioFocusRequest(c15431.m36907());
        } else {
            audioManager.abandonAudioFocus(c15431.m36909());
        }
    }
}
