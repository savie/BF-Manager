package l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֫۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 63RK */
/* JADX INFO: loaded from: classes2.dex */
public final class C1761 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static volatile ArrayList f5998;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static volatile AbstractC5490 f5999;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6204(Context context, String str) {
        context.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            C6421.m18183(context.getSystemService(C16076.m38223())).reportShortcutUsed(str);
        }
        for (AbstractC10709 abstractC10709 : (ArrayList) m6208(context)) {
            Collections.singletonList(str);
            abstractC10709.getClass();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m6207(AbstractActivityC17204 abstractActivityC17204, ArrayList arrayList) {
        abstractActivityC17204.getClass();
        List listM6203 = m6203(arrayList);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList2 = (ArrayList) listM6203;
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((C15184) it.next()).m36533());
            }
            if (!((ShortcutManager) abstractActivityC17204.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList3)) {
                return false;
            }
        }
        m6215(abstractActivityC17204).getClass();
        m6215(abstractActivityC17204).getClass();
        Iterator it2 = ((ArrayList) m6208(abstractActivityC17204)).iterator();
        while (it2.hasNext()) {
            ((AbstractC10709) it2.next()).getClass();
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m6212(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            return C6421.m18183(context.getSystemService(C16076.m38223())).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m6213(Context context, C15184 c15184) {
        context.getClass();
        c15184.getClass();
        int i = Build.VERSION.SDK_INT;
        int iM6212 = m6212(context);
        if (iM6212 != 0) {
            if (i <= 29) {
                m6206(context, c15184);
            }
            String str = null;
            int i2 = -1;
            if (i >= 30) {
                C6421.m18183(context.getSystemService(C16076.m38223())).pushDynamicShortcut(c15184.m36533());
            } else if (i >= 25) {
                ShortcutManager shortcutManagerM18183 = C6421.m18183(context.getSystemService(C16076.m38223()));
                if (!shortcutManagerM18183.isRateLimitingActive()) {
                    List<ShortcutInfo> dynamicShortcuts = shortcutManagerM18183.getDynamicShortcuts();
                    if (dynamicShortcuts.size() >= iM6212) {
                        int rank = -1;
                        String id = null;
                        for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                            if (shortcutInfo.getRank() > rank) {
                                id = shortcutInfo.getId();
                                rank = shortcutInfo.getRank();
                            }
                        }
                        shortcutManagerM18183.removeDynamicShortcuts(Arrays.asList(id));
                    }
                    shortcutManagerM18183.addDynamicShortcuts(Arrays.asList(c15184.m36533()));
                }
            }
            try {
                m6215(context).getClass();
                ArrayList<C15184> arrayList = new ArrayList();
                if (arrayList.size() >= iM6212) {
                    for (C15184 c15185 : arrayList) {
                        int i3 = c15185.f49575;
                        if (i3 > i2) {
                            str = c15185.f49572;
                            i2 = i3;
                        }
                    }
                    Arrays.asList(str);
                }
                Arrays.asList(c15184);
                return true;
            } catch (Exception unused) {
                return false;
            } finally {
                for (AbstractC10709 abstractC10709 : (ArrayList) m6208(context)) {
                    Collections.singletonList(c15184);
                    abstractC10709.getClass();
                }
                m6204(context, c15184.f49572);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m6210(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C6421.m18183(context.getSystemService(C16076.m38223())).isRequestPinShortcutSupported();
        }
        if (C7508.m20559(context, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
            return false;
        }
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.permission;
            if (TextUtils.isEmpty(str) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m6209(Context context, C15184 c15184) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 32) {
            c15184.getClass();
        }
        if (i >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(c15184.m36533(), null);
        }
        if (!m6210(context)) {
            return false;
        }
        Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        Intent[] intentArr = c15184.f49569;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", c15184.f49567.toString());
        C9545 c9545 = c15184.f49573;
        if (c9545 != null) {
            c9545.m24965(intent, (Drawable) null, c15184.f49570);
        }
        context.sendBroadcast(intent);
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static List m6211(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return C15184.m36529(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(4));
        }
        if (i >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(shortcutManager.getPinnedShortcuts());
            return C15184.m36529(context, arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m6202(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
            while (it.hasNext()) {
                arrayList.add(new C19660(context, it.next()).m45322());
            }
            return arrayList;
        }
        try {
            m6215(context).getClass();
            return new ArrayList();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m6214(AbstractActivityC17204 abstractActivityC17204, ArrayList arrayList) {
        List listM6203 = m6203(arrayList);
        if (Build.VERSION.SDK_INT <= 29) {
            for (C15184 c15184 : new ArrayList(listM6203)) {
                if (!m6206(abstractActivityC17204, c15184)) {
                    ((ArrayList) listM6203).remove(c15184);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((ArrayList) listM6203).iterator();
            while (it.hasNext()) {
                arrayList2.add(((C15184) it.next()).m36533());
            }
            if (!((ShortcutManager) abstractActivityC17204.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList2)) {
                return false;
            }
        }
        m6215(abstractActivityC17204).getClass();
        Iterator it2 = ((ArrayList) m6208(abstractActivityC17204)).iterator();
        while (it2.hasNext()) {
            ((AbstractC10709) it2.next()).getClass();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m6206(Context context, C15184 c15184) {
        Bitmap bitmapDecodeStream;
        C9545 c9545M24962;
        C9545 c9545 = c15184.f49573;
        if (c9545 == null) {
            return false;
        }
        int i = c9545.f30901;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream inputStreamM24964 = c9545.m24964(context);
        if (inputStreamM24964 == null || (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamM24964)) == null) {
            return false;
        }
        if (i == 6) {
            c9545M24962 = C9545.m24961(bitmapDecodeStream);
        } else {
            c9545M24962 = C9545.m24962(bitmapDecodeStream);
        }
        c15184.f49573 = c9545M24962;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6205(AbstractActivityC17204 abstractActivityC17204, List list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) abstractActivityC17204.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        m6215(abstractActivityC17204).getClass();
        Iterator it = ((ArrayList) m6208(abstractActivityC17204)).iterator();
        while (it.hasNext()) {
            ((AbstractC10709) it.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static AbstractC5490 m6215(Context context) {
        if (f5999 == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    f5999 = (AbstractC5490) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, C1761.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (f5999 == null) {
                f5999 = new C12947();
            }
        }
        return f5999;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static List m6208(Context context) {
        Bundle bundle;
        String string;
        if (f5998 == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((AbstractC10709) Class.forName(string, false, C1761.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f5998 == null) {
                f5998 = arrayList;
            }
        }
        return f5998;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m6203(ArrayList arrayList) {
        if (Build.VERSION.SDK_INT > 32) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C15184) it.next()).getClass();
        }
        return arrayList2;
    }
}
