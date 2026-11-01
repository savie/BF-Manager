package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.AttributeSet;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩸ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8VJ */
/* JADX INFO: loaded from: classes5.dex */
public class C21696 extends AbstractC18168 {
    public C21696(Context context) {
        super(context);
        m13145((InterfaceC3485) new C3184());
    }

    public C21696(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13145((InterfaceC3485) new C3184());
    }

    public C21696(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13145((InterfaceC3485) new C3184());
    }

    public C21696(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m13145((InterfaceC3485) new C3184());
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m48443() {
        PackageManager packageManagerM39292 = C16737.m39292();
        try {
            ComponentName componentNameM48441 = m48441(packageManagerM39292);
            if (componentNameM48441 != null) {
                return m48442(packageManagerM39292, componentNameM48441);
            }
        } catch (Exception unused) {
            ApplicationC0716.f2992.edit().remove("dsai").apply();
        }
        try {
            return m48442(packageManagerM39292, m48444(packageManagerM39292));
        } catch (Exception unused2) {
            return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48442(PackageManager packageManager, ComponentName componentName) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 0);
        String string = activityInfo.applicationInfo.loadLabel(packageManager).toString();
        String string2 = activityInfo.loadLabel(packageManager).toString();
        if (string.contains(string2)) {
            StringBuilder sbM8976 = C3012.m8976(string, " (");
            sbM8976.append(componentName.getPackageName());
            sbM8976.append(MotionUtils.EASING_TYPE_FORMAT_END);
            return sbM8976.toString();
        }
        return string + " - " + string2 + " (" + componentName.getPackageName() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // l.AbstractC18168
    /* JADX INFO: renamed from: ۙ */
    public final void mo950(AbstractActivityC12483 abstractActivityC12483) {
        C17901.m41535(abstractActivityC12483, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ComponentName m48441(PackageManager packageManager) {
        String string = ApplicationC0716.f2992.getString("dsai", null);
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
                    ApplicationC0716.f2992.edit().remove("dsai").apply();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ComponentName m48444(PackageManager packageManager) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(C11904.f39938.m46690("a.apk").m46712(), "application/vnd.android.package-archive");
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

    @Override // l.C4751
    /* JADX INFO: renamed from: ܿ */
    public final void mo8453() {
        super.mo8453();
    }
}
