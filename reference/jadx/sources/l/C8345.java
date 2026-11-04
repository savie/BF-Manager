package l;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: renamed from: l.۠ۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7TV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8345 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AudioManager f27338;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized AudioManager m22450(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            f27338 = null;
        }
        AudioManager audioManager = f27338;
        if (audioManager != null) {
            return audioManager;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
            C0645 c0645 = new C0645();
            C15300.m36732().execute(new RunnableC11879(1, applicationContext, c0645));
            c0645.m2834();
            AudioManager audioManager2 = f27338;
            audioManager2.getClass();
            return audioManager2;
        }
        AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
        f27338 = audioManager3;
        audioManager3.getClass();
        return audioManager3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22451(Context context, C0645 c0645) {
        f27338 = (AudioManager) context.getSystemService("audio");
        c0645.m2833();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m22453(AudioManager audioManager, C2379 c2379) {
        if (Build.VERSION.SDK_INT >= 26) {
            return audioManager.requestAudioFocus(c2379.m8080());
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListenerM8082 = c2379.m8082();
        c2379.m8084().getClass();
        return audioManager.requestAudioFocus(onAudioFocusChangeListenerM8082, 3, c2379.m8083());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22452(AudioManager audioManager, C2379 c2379) {
        if (Build.VERSION.SDK_INT >= 26) {
            audioManager.abandonAudioFocusRequest(c2379.m8080());
        } else {
            audioManager.abandonAudioFocus(c2379.m8082());
        }
    }
}
