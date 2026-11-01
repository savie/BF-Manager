package l;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.᩺᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7UD */
/* JADX INFO: loaded from: classes.dex */
public final class C23192 implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Handler f75258;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AudioManager.OnAudioFocusChangeListener f75259;

    public C23192(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f75259 = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = C17983.f57504;
        this.f75258 = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        C17983.m41836(this.f75258, new Runnable() { // from class: l.ۜ᩵ۙ
            @Override // java.lang.Runnable
            public final void run() {
                this.f23399.f75259.onAudioFocusChange(i);
            }
        });
    }
}
