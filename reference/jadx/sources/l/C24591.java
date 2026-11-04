package l;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.᩺᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes.dex */
public final class C24591 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Handler f79678;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f79679;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Spatializer.OnSpatializerStateChangedListener f79680;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Spatializer f79681;

    public C24591(Context context, C19369 c19369, Boolean bool) {
        AudioManager audioManagerM22450 = context == null ? null : C8345.m22450(context);
        if (audioManagerM22450 == null || (bool != null && bool.booleanValue())) {
            this.f79681 = null;
            this.f79679 = false;
            this.f79678 = null;
            this.f79680 = null;
            return;
        }
        Spatializer spatializer = audioManagerM22450.getSpatializer();
        this.f79681 = spatializer;
        this.f79679 = spatializer.getImmersiveAudioLevel() != 0;
        C6691 c6691 = new C6691(c19369);
        this.f79680 = c6691;
        Looper looperMyLooper = Looper.myLooper();
        C20782.m47566(looperMyLooper);
        Handler handler = new Handler(looperMyLooper);
        this.f79678 = handler;
        spatializer.addOnSpatializerStateChangedListener(new ExecutorC21243(handler), c6691);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m54909() {
        return this.f79679;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m54907() {
        Spatializer spatializer = this.f79681;
        spatializer.getClass();
        return spatializer.isAvailable();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m54910() {
        Spatializer spatializer = this.f79681;
        spatializer.getClass();
        return spatializer.isEnabled();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m54908(C18412 c18412, C15648 c15648) {
        String str = c15648.f50848;
        String str2 = c15648.f50848;
        int i = c15648.f50843;
        if (C17359.equals(str, "audio/eac3-joc")) {
            if (i == 16) {
                i = 12;
            }
        } else if (C17359.equals(str2, "audio/iamf")) {
            if (i == -1) {
                i = 6;
            }
        } else if (C17359.equals(str2, "audio/ac4") && (i == 18 || i == 21)) {
            i = 24;
        }
        int iM19504 = C7116.m19504(i);
        if (iM19504 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iM19504);
        int i2 = c15648.f50829;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.f79681;
        spatializer.getClass();
        return spatializer.canBeSpatialized(c18412.m42921().f68157, channelMask.build());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m54911() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.f79681;
        if (spatializer == null || (onSpatializerStateChangedListener = this.f79680) == null || (handler = this.f79678) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        handler.removeCallbacksAndMessages(null);
    }
}
