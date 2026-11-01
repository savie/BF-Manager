package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: l.ۙ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAIU */
/* JADX INFO: loaded from: classes2.dex */
public final class C4638 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f16386;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ComponentName f16387;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ComponentName f16388;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ComponentName f16389;

    public C4638(Context context) {
        ComponentName componentName = new ComponentName(context, "bin.mt.plus.MainLightIcon");
        this.f16389 = componentName;
        ComponentName componentName2 = new ComponentName(context, "bin.mt.plus.MainDarkIcon");
        this.f16387 = componentName2;
        this.f16388 = new ComponentName(context, "bin.mt.plus.MainNoBgIcon");
        PackageManager packageManagerM39292 = C16737.m39292();
        int componentEnabledSetting = packageManagerM39292.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting == 0 || componentEnabledSetting == 1) {
            this.f16386 = 0;
        } else if (packageManagerM39292.getComponentEnabledSetting(componentName2) == 1) {
            this.f16386 = 1;
        } else {
            this.f16386 = 2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ComponentName m12809() {
        int i = this.f16386;
        if (i == 0) {
            return this.f16389;
        }
        if (i == 1) {
            return this.f16387;
        }
        if (i == 2) {
            return this.f16388;
        }
        throw new RuntimeException();
    }
}
