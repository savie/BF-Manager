package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.alipay.sdk.app.H5PayActivity$$ExternalSyntheticLambda0;

/* JADX INFO: renamed from: l.ۘۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3747 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f13580;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Context f13581;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f13582;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2708 f13583;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C0925 f13584;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C6570 f13585;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22093 f13586;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final H5PayActivity$$ExternalSyntheticLambda0 f13587;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2336 f13588;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Handler f13589;

    public C3747(Context context, H5PayActivity$$ExternalSyntheticLambda0 h5PayActivity$$ExternalSyntheticLambda0, C2708 c2708, C6570 c6570) {
        Context applicationContext = context.getApplicationContext();
        this.f13581 = applicationContext;
        this.f13587 = h5PayActivity$$ExternalSyntheticLambda0;
        this.f13583 = c2708;
        this.f13585 = c6570;
        String str = C17983.f57504;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f13589 = handler;
        this.f13586 = Build.VERSION.SDK_INT >= 23 ? new C22093(this) : null;
        this.f13580 = new C12921(this);
        C2336 c2336 = C2336.f8268;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f13584 = uriFor != null ? new C0925(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10975(C2336 c2336) {
        m10972(c2336);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10976(C2708 c2708) {
        this.f13583 = c2708;
        m10972(C2336.m7089(this.f13581, c2708, this.f13585));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10974(AudioDeviceInfo audioDeviceInfo) {
        C6570 c6570 = this.f13585;
        if (C13638.equals(audioDeviceInfo, c6570 == null ? null : c6570.f22122)) {
            return;
        }
        C6570 c6571 = audioDeviceInfo != null ? new C6570(audioDeviceInfo) : null;
        this.f13585 = c6571;
        m10972(C2336.m7089(this.f13581, this.f13583, c6571));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2336 m10973() {
        C22093 c22093;
        if (this.f13582) {
            C2336 c2336 = this.f13588;
            c2336.getClass();
            return c2336;
        }
        this.f13582 = true;
        C0925 c0925 = this.f13584;
        if (c0925 != null) {
            c0925.m3674();
        }
        int i = Build.VERSION.SDK_INT;
        Handler handler = this.f13589;
        Context context = this.f13581;
        if (i >= 23 && (c22093 = this.f13586) != null) {
            C5159.m14306(context, c22093, handler);
        }
        C2336 c2336M7088 = C2336.m7088(context, context.registerReceiver(this.f13580, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), this.f13583, this.f13585);
        this.f13588 = c2336M7088;
        return c2336M7088;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10977() {
        C22093 c22093;
        if (this.f13582) {
            this.f13588 = null;
            int i = Build.VERSION.SDK_INT;
            Context context = this.f13581;
            if (i >= 23 && (c22093 = this.f13586) != null) {
                C5159.m14305(context, c22093);
            }
            context.unregisterReceiver(this.f13580);
            C0925 c0925 = this.f13584;
            if (c0925 != null) {
                c0925.m3675();
            }
            this.f13582 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m10972(C2336 c2336) {
        if (!this.f13582 || c2336.equals(this.f13588)) {
            return;
        }
        this.f13588 = c2336;
        ((C7421) this.f13587.f$0).m19882(c2336);
    }
}
