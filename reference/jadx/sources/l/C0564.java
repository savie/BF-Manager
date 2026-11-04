package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.֡ܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: MIVV */
/* JADX INFO: loaded from: classes2.dex */
public final class C0564 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f2297;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C18463 f2299;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final LinkedList f2298 = new LinkedList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f2300 = true;

    public C0564(ApplicationC17729 applicationC17729) {
        this.f2297 = applicationC17729.getApplicationContext();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList m2577() {
        ArrayList arrayList;
        synchronized (this.f2298) {
            arrayList = new ArrayList(this.f2298);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m2576() {
        return this.f2299 != null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m2578() {
        this.f2300 = true;
        this.f2299 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2574() {
        synchronized (this.f2298) {
            this.f2298.clear();
        }
        this.f2299 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m2572(ActivityInfo activityInfo) {
        CharSequence charSequenceLoadLabel = activityInfo.loadLabel(this.f2297.getPackageManager());
        if (TextUtils.isEmpty(charSequenceLoadLabel) || charSequenceLoadLabel.toString().trim().isEmpty()) {
            return m2573(activityInfo.packageName);
        }
        return charSequenceLoadLabel.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m2573(String str) {
        PackageManager packageManager = this.f2297.getPackageManager();
        try {
            return packageManager.getApplicationInfo(str, 0).loadLabel(packageManager).toString();
        } catch (Exception unused) {
            return "null";
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0114  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2575(AccessibilityEvent accessibilityEvent) {
        ActivityInfo activityInfo;
        boolean z;
        String strM2572;
        boolean z2;
        String strM46451;
        C18463 c18463;
        if (accessibilityEvent.getEventType() != 32 || accessibilityEvent.getClassName() == null || accessibilityEvent.getPackageName() == null) {
            return false;
        }
        String string = accessibilityEvent.getClassName().toString();
        String string2 = accessibilityEvent.getPackageName().toString();
        boolean zEquals = string2.equals(this.f2297.getPackageName());
        if (zEquals && this.f2300) {
            return false;
        }
        if (!this.f2300 && (c18463 = this.f2299) != null && string2.equals(c18463.f60091) && string.equals(this.f2299.f60090)) {
            return false;
        }
        try {
            activityInfo = this.f2297.getPackageManager().getActivityInfo(new ComponentName(string2, string), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            activityInfo = null;
        }
        if (zEquals) {
            if (activityInfo == null) {
                return false;
            }
            String str = activityInfo.targetActivity;
            if (str == null) {
                str = activityInfo.name;
            }
            if (ActivityC13220.class.getName().equals(str)) {
                return false;
            }
        }
        if (activityInfo == null) {
            InterfaceC24911 interfaceC24911M21117 = C7756.m21117();
            if (interfaceC24911M21117 == null || !interfaceC24911M21117.mo6266()) {
                z = true;
                z2 = false;
                strM46451 = null;
            } else {
                C11484 c11484Mo6261 = interfaceC24911M21117.mo6261(600L, "dumpsys activity activities");
                if (c11484Mo6261.f36124.isEmpty()) {
                    String[] strArr = c11484Mo6261.f36125;
                    int length = strArr.length;
                    int i = 0;
                    boolean z3 = false;
                    while (true) {
                        if (i < length) {
                            String str2 = strArr[i];
                            if (z3) {
                                if (str2.contains("ActivityRecord")) {
                                    if (str2.contains(" " + string2 + "/")) {
                                        String[] strArrSplit = str2.split(" ");
                                        int length2 = strArrSplit.length;
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 < length2) {
                                                String str3 = strArrSplit[i2];
                                                z2 = false;
                                                if (str3.startsWith(string2.concat("/"))) {
                                                    strM46451 = str3.substring(string2.length() + 1);
                                                    if (strM46451.startsWith(".")) {
                                                        strM46451 = string2.concat(strM46451);
                                                    }
                                                    z = true;
                                                } else {
                                                    i2++;
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                } else if (str2.isEmpty()) {
                                    z = true;
                                    z2 = false;
                                    strM46451 = null;
                                }
                            } else if (str2.contains("Running activities")) {
                                z3 = true;
                            }
                            i++;
                        } else {
                            z = true;
                            z2 = false;
                            strM46451 = null;
                        }
                    }
                } else {
                    z = true;
                    z2 = false;
                    strM46451 = null;
                }
            }
            if (strM46451 == null) {
                try {
                    ClassLoader.getSystemClassLoader().loadClass(string);
                    return z2;
                } catch (ClassNotFoundException unused2) {
                    strM2572 = m2573(string2);
                }
            } else {
                try {
                    activityInfo = this.f2297.getPackageManager().getActivityInfo(new ComponentName(string2, strM46451), 0);
                } catch (PackageManager.NameNotFoundException unused3) {
                    activityInfo = null;
                }
                if (activityInfo == null) {
                    try {
                        ClassLoader.getSystemClassLoader().loadClass(string);
                        return false;
                    } catch (ClassNotFoundException unused4) {
                        strM2572 = m2573(string2);
                    }
                } else {
                    try {
                        ClassLoader.getSystemClassLoader().loadClass(string);
                    } catch (ClassNotFoundException unused5) {
                        strM46451 = C20196.m46451(strM46451, " > ", string);
                    }
                    String str4 = strM46451;
                    strM2572 = m2572(activityInfo);
                    string = str4;
                }
            }
        } else {
            z = true;
            strM2572 = m2572(activityInfo);
        }
        if (!zEquals && activityInfo != null) {
            this.f2300 = false;
        }
        C18463 c18464 = this.f2299;
        if (c18464 != null && string2.equals(c18464.f60091) && string.equals(this.f2299.f60090)) {
            return false;
        }
        C18463 c18465 = new C18463(strM2572, string2, string);
        synchronized (this.f2298) {
            if (this.f2298.size() > 30) {
                this.f2298.removeLast();
            }
            this.f2298.addFirst(c18465);
        }
        this.f2299 = c18465;
        return z;
    }
}
