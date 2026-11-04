package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.᩸ܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66H7 */
/* JADX INFO: loaded from: classes.dex */
public final class C22917 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f74480;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f74481;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C10982 f74482;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f74483;

    public C22917(ApplicationC17729 applicationC17729) {
        this.f74480 = applicationC17729;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51670(AccessibilityEvent accessibilityEvent) {
        ActivityInfo activityInfo;
        CharSequence packageName = accessibilityEvent.getPackageName();
        CharSequence className = accessibilityEvent.getClassName();
        if (packageName == null || className == null) {
            return;
        }
        if (TextUtils.equals(this.f74483, packageName) && TextUtils.equals(this.f74481, className)) {
            return;
        }
        String string = packageName.toString();
        Context context = this.f74480;
        boolean zEquals = string.equals(context.getPackageName());
        String string2 = className.toString();
        try {
            activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(string, string2), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            activityInfo = null;
        }
        this.f74483 = string;
        this.f74481 = string2;
        if (activityInfo != null) {
            String str = activityInfo.targetActivity;
            if (str == null) {
                str = activityInfo.name;
            }
            if (zEquals && ActivityC13220.class.getName().equals(str)) {
                return;
            }
        } else if (zEquals) {
            return;
        } else {
            string2 = null;
        }
        this.f74482 = new C10982(string, string2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10982 m51672() {
        return this.f74482;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51669() {
        this.f74482 = null;
        m51671();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m51671() {
        this.f74481 = null;
        this.f74483 = null;
    }
}
