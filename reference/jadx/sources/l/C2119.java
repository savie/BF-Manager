package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.AttributeSet;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֫ᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8VJ */
/* JADX INFO: loaded from: classes3.dex */
public class C2119 extends AbstractC11813 {
    public C2119(Context context) {
        super(context);
        m12575((InterfaceC24044) new C12669(9));
    }

    public C2119(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12575((InterfaceC24044) new C12669(9));
    }

    public C2119(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12575((InterfaceC24044) new C12669(9));
    }

    public C2119(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m12575((InterfaceC24044) new C12669(9));
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m7304() {
        PackageManager packageManagerM49081 = C21576.m49081();
        try {
            ComponentName componentNameM7302 = m7302(packageManagerM49081);
            if (componentNameM7302 != null) {
                return m7303(packageManagerM49081, componentNameM7302);
            }
        } catch (Exception unused) {
            ApplicationC17729.f58258.edit().remove("dsai").apply();
        }
        try {
            return m7303(packageManagerM49081, m7305(packageManagerM49081));
        } catch (Exception unused2) {
            return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m7303(PackageManager packageManager, ComponentName componentName) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 0);
        String string = activityInfo.applicationInfo.loadLabel(packageManager).toString();
        String string2 = activityInfo.loadLabel(packageManager).toString();
        if (string.contains(string2)) {
            StringBuilder sbM10405 = C3188.m10405(string, " (");
            sbM10405.append(componentName.getPackageName());
            sbM10405.append(MotionUtils.EASING_TYPE_FORMAT_END);
            return sbM10405.toString();
        }
        return string + " - " + string2 + " (" + componentName.getPackageName() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // l.AbstractC11813
    /* JADX INFO: renamed from: ۙ */
    public final void mo2388(AbstractActivityC17204 abstractActivityC17204) {
        C25093.m55920(abstractActivityC17204, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ComponentName m7302(PackageManager packageManager) {
        String string = ApplicationC17729.f58258.getString("dsai", null);
        if (string != null && !string.isEmpty()) {
            String[] strArrSplit = string.split("/", 2);
            if (strArrSplit.length == 2) {
                try {
                    ComponentName componentName = new ComponentName(strArrSplit[0], strArrSplit[1]);
                    if (packageManager != null) {
                        packageManager.getActivityInfo(componentName, 0);
                    }
                    return componentName;
                } catch (Exception unused) {
                    ApplicationC17729.f58258.edit().remove("dsai").apply();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ComponentName m7305(PackageManager packageManager) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(C6382.f21568.m49876("a.apk").m49878(), "application/vnd.android.package-archive");
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo.packageName.equals("android")) {
                return null;
            }
            ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void mo7306() {
        super.mo7306();
    }
}
