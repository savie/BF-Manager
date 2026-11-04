package l;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;

/* JADX INFO: renamed from: l.ۖۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7UD */
/* JADX INFO: loaded from: classes2.dex */
public final class C2379 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18412 f7651;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f7652;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f7653;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AudioManager.OnAudioFocusChangeListener f7654;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Handler f7655;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f7656;

    public C2379(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C18412 c18412, boolean z) {
        this.f7652 = i;
        this.f7655 = handler;
        this.f7651 = c18412;
        this.f7653 = z;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.f7654 = new C9090(onAudioFocusChangeListener, handler);
        } else {
            this.f7654 = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.f7656 = new AudioFocusRequest.Builder(i).setAudioAttributes(c18412.m42921().f68157).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f7656 = null;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m8083() {
        return this.f7652;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18412 m8084() {
        return this.f7651;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m8081() {
        return this.f7653;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AudioManager.OnAudioFocusChangeListener m8082() {
        return this.f7654;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Handler m8085() {
        return this.f7655;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9836 m8079() {
        return new C9836(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2379)) {
            return false;
        }
        C2379 c2379 = (C2379) obj;
        return this.f7652 == c2379.f7652 && this.f7653 == c2379.f7653 && C17359.equals(this.f7654, c2379.f7654) && C17359.equals(this.f7655, c2379.f7655) && C17359.equals(this.f7651, c2379.f7651);
    }

    public final int hashCode() {
        return C17359.hash(Integer.valueOf(this.f7652), this.f7654, this.f7655, this.f7651, Boolean.valueOf(this.f7653));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AudioFocusRequest m8080() {
        Object obj = this.f7656;
        obj.getClass();
        return (AudioFocusRequest) obj;
    }
}
