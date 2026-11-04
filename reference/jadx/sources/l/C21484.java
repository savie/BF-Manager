package l;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.os.Handler;

/* JADX INFO: renamed from: l.᩶ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SZ */
/* JADX INFO: loaded from: classes.dex */
public final class C21484 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48892(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
        C8345.m22450(context).registerAudioDeviceCallback(audioDeviceCallback, handler);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48891(Context context, AudioDeviceCallback audioDeviceCallback) {
        C8345.m22450(context).unregisterAudioDeviceCallback(audioDeviceCallback);
    }
}
