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

/* JADX INFO: renamed from: l.᩹ۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: U92X */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityC23324 extends ActivityC11563 {
    @Override // android.app.Activity
    public final void finish() {
        if (isTaskRoot()) {
            finishAndRemoveTask();
            if (((int) C1170.stream(((ActivityManager) getSystemService("activity")).getAppTasks()).filter(new C18297(1)).count()) == 1) {
                System.out.println("Kill self process");
                C7756.m21099();
                Process.killProcess(Process.myPid());
                return;
            }
            return;
        }
        super.finish();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52477(ActivityManager.AppTask appTask) {
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
    public static boolean m52478(Context context, Intent intent) {
        String str;
        String str2;
        String[] strArr;
        Iterator it;
        Intent intentM36532;
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
        String strM52475 = m52475(stringExtra2, stringExtra3, booleanExtra, booleanExtra2, booleanExtra3);
        String[] strArrMo7905 = ApplicationC17729.f58258.mo7905("eama", (String[]) null);
        if (strArrMo7905 != null && Arrays.asList(strArrMo7905).contains(strM52475)) {
            m52476(strM52475, strArrMo7905);
            return true;
        }
        if (ShortcutActivity.m131()) {
            Iterator it3 = C1761.m6211(context).iterator();
            while (it3.hasNext()) {
                Intent intentM36533 = ((C15184) it3.next()).m36532();
                if ("bin.mt.plus.ACTION_SHORTCUT".equals(intentM36533.getAction())) {
                    String stringExtra4 = intentM36533.getStringExtra("operation");
                    it2 = it3;
                    String stringExtra5 = intentM36533.getStringExtra(MotionUtils.EASING_TYPE_PATH);
                    str = strM52475;
                    strArr = strArrMo7905;
                    boolean booleanExtra4 = intentM36533.getBooleanExtra("eae", false);
                    boolean booleanExtra5 = intentM36533.getBooleanExtra(str6, false);
                    str4 = str6;
                    boolean booleanExtra6 = intentM36533.getBooleanExtra("ewse", true);
                    if (!"exec-script".equals(stringExtra4) || !C17359.equals(stringExtra3, stringExtra5) || booleanExtra != booleanExtra4 || booleanExtra2 != booleanExtra5 || booleanExtra3 != booleanExtra6) {
                    }
                } else {
                    str = strM52475;
                    str4 = str6;
                    it2 = it3;
                    strArr = strArrMo7905;
                }
                it3 = it2;
                strM52475 = str;
                strArrMo7905 = strArr;
                str6 = str4;
            }
            str = strM52475;
            str2 = str6;
            strArr = strArrMo7905;
            it = C1761.m6202(context).iterator();
            while (it.hasNext()) {
                intentM36532 = ((C15184) it.next()).m36532();
                if ("bin.mt.plus.ACTION_SHORTCUT".equals(intentM36532.getAction())) {
                    stringExtra = intentM36532.getStringExtra(str5);
                    String stringExtra6 = intentM36532.getStringExtra(MotionUtils.EASING_TYPE_PATH);
                    boolean booleanExtra7 = intentM36532.getBooleanExtra("eae", false);
                    str3 = str5;
                    boolean booleanExtra8 = intentM36532.getBooleanExtra(str2, false);
                    boolean booleanExtra9 = intentM36532.getBooleanExtra("ewse", true);
                    if (!"exec-script".equals(stringExtra) || !C17359.equals(stringExtra3, stringExtra6) || booleanExtra != booleanExtra7 || booleanExtra2 != booleanExtra8 || booleanExtra3 != booleanExtra9) {
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
        str = strM52475;
        str2 = str6;
        strArr = strArrMo7905;
        it = C1761.m6202(context).iterator();
        while (it.hasNext()) {
            intentM36532 = ((C15184) it.next()).m36532();
            if ("bin.mt.plus.ACTION_SHORTCUT".equals(intentM36532.getAction())) {
                stringExtra = intentM36532.getStringExtra(str5);
                String stringExtra7 = intentM36532.getStringExtra(MotionUtils.EASING_TYPE_PATH);
                boolean booleanExtra10 = intentM36532.getBooleanExtra("eae", false);
                str3 = str5;
                boolean booleanExtra11 = intentM36532.getBooleanExtra(str2, false);
                boolean booleanExtra12 = intentM36532.getBooleanExtra("ewse", true);
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
        m52476(str, strArr);
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m52479(Intent intent) {
        String stringExtra = intent.getStringExtra("operation");
        if ("exec-script".equals(stringExtra)) {
            m52476(m52475(stringExtra, intent.getStringExtra(MotionUtils.EASING_TYPE_PATH), intent.getBooleanExtra("eae", false), intent.getBooleanExtra("ewrp", false), intent.getBooleanExtra("ewse", true)), ApplicationC17729.f58258.mo7905("eama", (String[]) null));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m52475(String str, String str2, boolean z, boolean z2, boolean z3) {
        return C15022.m36181(str + ":" + str2 + ":" + z + ":" + z2 + ":" + z3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52476(String str, String[] strArr) {
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
        ApplicationC17729.f58258.edit().mo3490("eama", (String[]) arrayList.toArray(new String[0])).apply();
    }
}
