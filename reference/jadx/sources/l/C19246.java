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

/* JADX INFO: renamed from: l.ᩳᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19246 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f62256;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18412 f62257;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C19403 f62258;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18500 f62259;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C10295 f62260;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f62261;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Handler f62262;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C0601 f62263;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C14770 f62264;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Context f62265;

    public C19246(Context context, C19403 c19403, C18412 c18412, C10295 c10295) {
        Context applicationContext = context.getApplicationContext();
        this.f62265 = applicationContext;
        this.f62258 = c19403;
        this.f62257 = c18412;
        this.f62260 = c10295;
        String str = C7116.f23455;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f62262 = handler;
        this.f62259 = Build.VERSION.SDK_INT >= 23 ? new C18500(this) : null;
        this.f62261 = new C8059(this);
        C14770 c14770 = C14770.f48339;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f62263 = uriFor != null ? new C0601(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44587(C14770 c14770) {
        m44583(c14770);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44588(C18412 c18412) {
        this.f62257 = c18412;
        m44583(C14770.m35557(this.f62265, c18412, this.f62260));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44586(AudioDeviceInfo audioDeviceInfo) {
        C10295 c10295 = this.f62260;
        if (C17359.equals(audioDeviceInfo, c10295 == null ? null : c10295.f32872)) {
            return;
        }
        C10295 c10296 = audioDeviceInfo != null ? new C10295(audioDeviceInfo) : null;
        this.f62260 = c10296;
        m44583(C14770.m35557(this.f62265, this.f62257, c10296));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14770 m44585() {
        C18500 c18500;
        if (this.f62256) {
            C14770 c14770 = this.f62264;
            c14770.getClass();
            return c14770;
        }
        this.f62256 = true;
        C0601 c0601 = this.f62263;
        if (c0601 != null) {
            c0601.m2705();
        }
        int i = Build.VERSION.SDK_INT;
        Handler handler = this.f62262;
        Context context = this.f62265;
        if (i >= 23 && (c18500 = this.f62259) != null) {
            C21484.m48892(context, c18500, handler);
        }
        C14770 c14770M35556 = C14770.m35556(context, context.registerReceiver(this.f62261, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), this.f62257, this.f62260);
        this.f62264 = c14770M35556;
        return c14770M35556;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44589() {
        C18500 c18500;
        if (this.f62256) {
            this.f62264 = null;
            int i = Build.VERSION.SDK_INT;
            Context context = this.f62265;
            if (i >= 23 && (c18500 = this.f62259) != null) {
                C21484.m48891(context, c18500);
            }
            context.unregisterReceiver(this.f62261);
            C0601 c0601 = this.f62263;
            if (c0601 != null) {
                c0601.m2706();
            }
            this.f62256 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m44583(C14770 c14770) {
        if (!this.f62256 || c14770.equals(this.f62264)) {
            return;
        }
        this.f62264 = c14770;
        ((C14991) this.f62258.f62703).m36079(c14770);
    }
}
