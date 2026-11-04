package l;

import android.content.ComponentName;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ܳۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RF */
/* JADX INFO: loaded from: classes4.dex */
public final class C15034 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ComponentName f49074;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f49075 = 1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f49076;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bundle m36188(C15034 c15034) {
        c15034.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("shizuku:user-service-arg-component", c15034.f49074);
        bundle.putBoolean("shizuku:user-service-arg-debuggable", false);
        bundle.putInt("shizuku:user-service-arg-version-code", c15034.f49075);
        bundle.putBoolean("shizuku:user-service-arg-daemon", true);
        bundle.putBoolean("shizuku:user-service-arg-use-32-bit-app-process", false);
        String str = c15034.f49076;
        C17359.requireNonNull(str, "process name suffix must not be null");
        bundle.putString("shizuku:user-service-arg-process-name", str);
        return bundle;
    }

    public C15034(ComponentName componentName) {
        this.f49074 = componentName;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36190() {
        this.f49075 = 26110365;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36189() {
        this.f49076 = "cmd";
    }
}
