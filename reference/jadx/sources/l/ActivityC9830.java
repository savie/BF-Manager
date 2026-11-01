package l;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import bin.mt.plus.ShortcutActivity;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: U92X */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC9830 extends ActivityC11220 {
    @Override // android.app.Activity
    public final void finish() {
        if (isTaskRoot()) {
            finishAndRemoveTask();
            if (((int) C9030.stream(((ActivityManager) getSystemService("activity")).getAppTasks()).filter(new C1612(1)).count()) == 1) {
                System.out.println("Kill self process");
                C6696.m18086();
                Process.killProcess(Process.myPid());
                return;
            }
            return;
        }
        super.finish();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m24937(ActivityManager.AppTask appTask) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return appTask.getTaskInfo().isRunning;
        }
        return i < 23 || appTask.getTaskInfo().topActivity != null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:42:0x0112  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m24938(Context context, Intent intent) {
        String str;
        String str2;
        String[] strArr;
        Iterator it;
        Intent intentM9959;
        String str3;
        String stringExtra;
        String str4;
        Iterator it2;
        String str5 = "operation";
        String stringExtra2 = intent.getStringExtra("operation");
        if (!"exec-script".equals(stringExtra2)) {
            return false;
        }
        String stringExtra3 = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH);
        boolean booleanExtra = intent.getBooleanExtra("eae", false);
        String str6 = "ewrp";
        boolean booleanExtra2 = intent.getBooleanExtra("ewrp", false);
        boolean booleanExtra3 = intent.getBooleanExtra("ewse", true);
        String strM24935 = m24935(stringExtra2, stringExtra3, booleanExtra, booleanExtra2, booleanExtra3);
        String[] strArrMo16349 = ApplicationC0716.f2992.mo16349("eama", (String[]) null);
        if (strArrMo16349 != null && Arrays.asList(strArrMo16349).contains(strM24935)) {
            m24936(strM24935, strArrMo16349);
            return true;
        }
        if (ShortcutActivity.m139()) {
            Iterator it3 = C11692.m29197(context).iterator();
            while (it3.hasNext()) {
                Intent intentM99510 = ((C3348) it3.next()).m9959();
                if ("bin.mt.plus.ACTION_SHORTCUT".equals(intentM99510.getAction())) {
                    String stringExtra4 = intentM99510.getStringExtra("operation");
                    it2 = it3;
                    String stringExtra5 = intentM99510.getStringExtra(MotionUtils.EASING_TYPE_PATH);
                    str = strM24935;
                    strArr = strArrMo16349;
                    boolean booleanExtra4 = intentM99510.getBooleanExtra("eae", false);
                    boolean booleanExtra5 = intentM99510.getBooleanExtra(str6, false);
                    str4 = str6;
                    boolean booleanExtra6 = intentM99510.getBooleanExtra("ewse", true);
                    if (!"exec-script".equals(stringExtra4) || !C13638.equals(stringExtra3, stringExtra5) || booleanExtra != booleanExtra4 || booleanExtra2 != booleanExtra5 || booleanExtra3 != booleanExtra6) {
                    }
                } else {
                    str = strM24935;
                    str4 = str6;
                    it2 = it3;
                    strArr = strArrMo16349;
                }
                it3 = it2;
                strM24935 = str;
                strArrMo16349 = strArr;
                str6 = str4;
            }
            str = strM24935;
            str2 = str6;
            strArr = strArrMo16349;
            it = C11692.m29191(context).iterator();
            while (it.hasNext()) {
                intentM9959 = ((C3348) it.next()).m9959();
                if ("bin.mt.plus.ACTION_SHORTCUT".equals(intentM9959.getAction())) {
                    stringExtra = intentM9959.getStringExtra(str5);
                    String stringExtra6 = intentM9959.getStringExtra(MotionUtils.EASING_TYPE_PATH);
                    boolean booleanExtra7 = intentM9959.getBooleanExtra("eae", false);
                    str3 = str5;
                    boolean booleanExtra8 = intentM9959.getBooleanExtra(str2, false);
                    boolean booleanExtra9 = intentM9959.getBooleanExtra("ewse", true);
                    if (!"exec-script".equals(stringExtra) || !C13638.equals(stringExtra3, stringExtra6) || booleanExtra != booleanExtra7 || booleanExtra2 != booleanExtra8 || booleanExtra3 != booleanExtra9) {
                    }
                } else {
                    str3 = str5;
                }
                str = str;
                strArr = strArr;
                str5 = str3;
            }
            return false;
        }
        str = strM24935;
        str2 = str6;
        strArr = strArrMo16349;
        it = C11692.m29191(context).iterator();
        while (it.hasNext()) {
            intentM9959 = ((C3348) it.next()).m9959();
            if ("bin.mt.plus.ACTION_SHORTCUT".equals(intentM9959.getAction())) {
                stringExtra = intentM9959.getStringExtra(str5);
                String stringExtra7 = intentM9959.getStringExtra(MotionUtils.EASING_TYPE_PATH);
                boolean booleanExtra10 = intentM9959.getBooleanExtra("eae", false);
                str3 = str5;
                boolean booleanExtra11 = intentM9959.getBooleanExtra(str2, false);
                boolean booleanExtra12 = intentM9959.getBooleanExtra("ewse", true);
                if (!"exec-script".equals(stringExtra)) {
                    continue;
                }
            } else {
                str3 = str5;
            }
            str = str;
            strArr = strArr;
            str5 = str3;
        }
        return false;
        m24936(str, strArr);
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m24939(Intent intent) {
        String stringExtra = intent.getStringExtra("operation");
        if ("exec-script".equals(stringExtra)) {
            m24936(m24935(stringExtra, intent.getStringExtra(MotionUtils.EASING_TYPE_PATH), intent.getBooleanExtra("eae", false), intent.getBooleanExtra("ewrp", false), intent.getBooleanExtra("ewse", true)), ApplicationC0716.f2992.mo16349("eama", (String[]) null));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m24935(String str, String str2, boolean z, boolean z2, boolean z3) {
        return C22253.m49423(str + ":" + str2 + ":" + z + ":" + z2 + ":" + z3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24936(String str, String[] strArr) {
        ArrayList arrayList;
        if (strArr == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(Arrays.asList(strArr));
        }
        arrayList.remove(str);
        arrayList.add(0, str);
        if (arrayList.size() > 50) {
            arrayList = new ArrayList(arrayList.subList(0, 50));
        }
        ApplicationC0716.f2992.edit().mo4069("eama", (String[]) arrayList.toArray(new String[0])).apply();
    }
}
