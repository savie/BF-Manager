package l;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.ۙۚܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes2.dex */
public final class C4441 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Spatializer f15814;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Handler f15815;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f15816;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Spatializer.OnSpatializerStateChangedListener f15817;

    public C4441(Context context, C12909 c12909, Boolean bool) {
        AudioManager audioManagerM48542 = context == null ? null : C21780.m48542(context);
        if (audioManagerM48542 == null || (bool != null && bool.booleanValue())) {
            this.f15814 = null;
            this.f15816 = false;
            this.f15815 = null;
            this.f15817 = null;
            return;
        }
        Spatializer spatializer = audioManagerM48542.getSpatializer();
        this.f15814 = spatializer;
        this.f15816 = spatializer.getImmersiveAudioLevel() != 0;
        C2947 c2947 = new C2947(c12909);
        this.f15817 = c2947;
        Looper looperMyLooper = Looper.myLooper();
        C2023.m6508(looperMyLooper);
        Handler handler = new Handler(looperMyLooper);
        this.f15815 = handler;
        spatializer.addOnSpatializerStateChangedListener(new ExecutorC19416(handler), c2947);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m12395() {
        return this.f15816;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12393() {
        Spatializer spatializer = this.f15814;
        spatializer.getClass();
        return spatializer.isAvailable();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m12396() {
        Spatializer spatializer = this.f15814;
        spatializer.getClass();
        return spatializer.isEnabled();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12394(C2708 c2708, C7648 c7648) {
        String str = c7648.f25265;
        String str2 = c7648.f25265;
        int i = c7648.f25249;
        if (C13638.equals(str, "audio/eac3-joc")) {
            if (i == 16) {
                i = 12;
            }
        } else if (C13638.equals(str2, "audio/iamf")) {
            if (i == -1) {
                i = 6;
            }
        } else if (C13638.equals(str2, "audio/ac4") && (i == 18 || i == 21)) {
            i = 24;
        }
        int iM41854 = C17983.m41854(i);
        if (iM41854 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iM41854);
        int i2 = c7648.f25260;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.f15814;
        spatializer.getClass();
        return spatializer.canBeSpatialized(c2708.m8258().f39861, channelMask.build());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m12392() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.f15814;
        if (spatializer == null || (onSpatializerStateChangedListener = this.f15817) == null || (handler = this.f15815) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        handler.removeCallbacksAndMessages(null);
    }
}
