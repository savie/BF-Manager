package l;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.ۡۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7UD */
/* JADX INFO: loaded from: classes3.dex */
public final class C9090 implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Handler f29528;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AudioManager.OnAudioFocusChangeListener f29529;

    public C9090(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f29529 = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = C7116.f23455;
        this.f29528 = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        C7116.m19483(this.f29528, new Runnable() { // from class: l.֨ۗۙ
            @Override // java.lang.Runnable
            public final void run() {
                this.f3306.f29529.onAudioFocusChange(i);
            }
        });
    }
}
