package l;

import android.content.ComponentName;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ܳ֡۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RF */
/* JADX INFO: loaded from: classes3.dex */
public final class C14170 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ComponentName f46504;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f46505 = 1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f46506;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bundle m34254(C14170 c14170) {
        c14170.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("shizuku:user-service-arg-component", c14170.f46504);
        bundle.putBoolean("shizuku:user-service-arg-debuggable", false);
        bundle.putInt("shizuku:user-service-arg-version-code", c14170.f46505);
        bundle.putBoolean("shizuku:user-service-arg-daemon", true);
        bundle.putBoolean("shizuku:user-service-arg-use-32-bit-app-process", false);
        String str = c14170.f46506;
        C13638.requireNonNull(str, "process name suffix must not be null");
        bundle.putString("shizuku:user-service-arg-process-name", str);
        return bundle;
    }

    public C14170(ComponentName componentName) {
        this.f46504 = componentName;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34256() {
        this.f46505 = 26101061;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34255() {
        this.f46506 = "cmd";
    }
}
