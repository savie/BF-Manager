package l;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.os.Handler;

/* JADX INFO: renamed from: l.ۚۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5159 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14306(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
        C21780.m48542(context).registerAudioDeviceCallback(audioDeviceCallback, handler);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14305(Context context, AudioDeviceCallback audioDeviceCallback) {
        C21780.m48542(context).unregisterAudioDeviceCallback(audioDeviceCallback);
    }
}
