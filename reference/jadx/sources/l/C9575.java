package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: l.ۡᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAIU */
/* JADX INFO: loaded from: classes3.dex */
public final class C9575 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ComponentName f30989;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ComponentName f30990;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ComponentName f30991;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f30992;

    public C9575(Context context) {
        ComponentName componentName = new ComponentName(context, "bin.mt.plus.MainLightIcon");
        this.f30991 = componentName;
        ComponentName componentName2 = new ComponentName(context, "bin.mt.plus.MainDarkIcon");
        this.f30989 = componentName2;
        this.f30990 = new ComponentName(context, "bin.mt.plus.MainNoBgIcon");
        PackageManager packageManagerM49081 = C21576.m49081();
        int componentEnabledSetting = packageManagerM49081.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting == 0 || componentEnabledSetting == 1) {
            this.f30992 = 0;
        } else if (packageManagerM49081.getComponentEnabledSetting(componentName2) == 1) {
            this.f30992 = 1;
        } else {
            this.f30992 = 2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ComponentName m25005() {
        int i = this.f30992;
        if (i == 0) {
            return this.f30991;
        }
        if (i == 1) {
            return this.f30989;
        }
        if (i == 2) {
            return this.f30990;
        }
        throw new RuntimeException();
    }
}
