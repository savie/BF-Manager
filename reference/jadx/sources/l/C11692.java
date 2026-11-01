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

/* JADX INFO: renamed from: l.ۨ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 63RK */
/* JADX INFO: loaded from: classes3.dex */
public final class C11692 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static volatile ArrayList f39308;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static volatile AbstractC13809 f39309;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29193(Context context, String str) {
        context.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            C0242.m1614(context.getSystemService(C5038.m14057())).reportShortcutUsed(str);
        }
        for (AbstractC14639 abstractC14639 : (ArrayList) m29198(context)) {
            Collections.singletonList(str);
            abstractC14639.getClass();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29196(AbstractActivityC12483 abstractActivityC12483, ArrayList arrayList) {
        abstractActivityC12483.getClass();
        List listM29192 = m29192(arrayList);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList2 = (ArrayList) listM29192;
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((C3348) it.next()).m9956());
            }
            if (!((ShortcutManager) abstractActivityC12483.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList3)) {
                return false;
            }
        }
        m29190(abstractActivityC12483).getClass();
        m29190(abstractActivityC12483).getClass();
        Iterator it2 = ((ArrayList) m29198(abstractActivityC12483)).iterator();
        while (it2.hasNext()) {
            ((AbstractC14639) it2.next()).getClass();
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m29200(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            return C0242.m1614(context.getSystemService(C5038.m14057())).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m29201(Context context, C3348 c3348) {
        context.getClass();
        c3348.getClass();
        int i = Build.VERSION.SDK_INT;
        int iM29200 = m29200(context);
        if (iM29200 != 0) {
            if (i <= 29) {
                m29195(context, c3348);
            }
            String str = null;
            int i2 = -1;
            if (i >= 30) {
                C0242.m1614(context.getSystemService(C5038.m14057())).pushDynamicShortcut(c3348.m9956());
            } else if (i >= 25) {
                ShortcutManager shortcutManagerM1614 = C0242.m1614(context.getSystemService(C5038.m14057()));
                if (!shortcutManagerM1614.isRateLimitingActive()) {
                    List<ShortcutInfo> dynamicShortcuts = shortcutManagerM1614.getDynamicShortcuts();
                    if (dynamicShortcuts.size() >= iM29200) {
                        int rank = -1;
                        String id = null;
                        for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                            if (shortcutInfo.getRank() > rank) {
                                id = shortcutInfo.getId();
                                rank = shortcutInfo.getRank();
                            }
                        }
                        shortcutManagerM1614.removeDynamicShortcuts(Arrays.asList(id));
                    }
                    shortcutManagerM1614.addDynamicShortcuts(Arrays.asList(c3348.m9956()));
                }
            }
            try {
                m29190(context).getClass();
                ArrayList<C3348> arrayList = new ArrayList();
                if (arrayList.size() >= iM29200) {
                    for (C3348 c3349 : arrayList) {
                        int i3 = c3349.f12382;
                        if (i3 > i2) {
                            str = c3349.f12372;
                            i2 = i3;
                        }
                    }
                    Arrays.asList(str);
                }
                Arrays.asList(c3348);
                return true;
            } catch (Exception unused) {
                return false;
            } finally {
                for (AbstractC14639 abstractC14639 : (ArrayList) m29198(context)) {
                    Collections.singletonList(c3348);
                    abstractC14639.getClass();
                }
                m29193(context, c3348.f12372);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m29203(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0242.m1614(context.getSystemService(C5038.m14057())).isRequestPinShortcutSupported();
        }
        if (C10405.m26300(context, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m29199(Context context, C3348 c3348) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 32) {
            c3348.getClass();
        }
        if (i >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(c3348.m9956(), null);
        }
        if (!m29203(context)) {
            return false;
        }
        Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        Intent[] intentArr = c3348.f12379;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", c3348.f12374.toString());
        C16775 c16775 = c3348.f12383;
        if (c16775 != null) {
            c16775.m39341(intent, (Drawable) null, c3348.f12378);
        }
        context.sendBroadcast(intent);
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static List m29197(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return C3348.m9955(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(4));
        }
        if (i >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(shortcutManager.getPinnedShortcuts());
            return C3348.m9955(context, arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m29191(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
            while (it.hasNext()) {
                arrayList.add(new C9700(context, it.next()).m24662());
            }
            return arrayList;
        }
        try {
            m29190(context).getClass();
            return new ArrayList();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m29202(AbstractActivityC12483 abstractActivityC12483, ArrayList arrayList) {
        List listM29192 = m29192(arrayList);
        if (Build.VERSION.SDK_INT <= 29) {
            for (C3348 c3348 : new ArrayList(listM29192)) {
                if (!m29195(abstractActivityC12483, c3348)) {
                    ((ArrayList) listM29192).remove(c3348);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((ArrayList) listM29192).iterator();
            while (it.hasNext()) {
                arrayList2.add(((C3348) it.next()).m9956());
            }
            if (!((ShortcutManager) abstractActivityC12483.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList2)) {
                return false;
            }
        }
        m29190(abstractActivityC12483).getClass();
        Iterator it2 = ((ArrayList) m29198(abstractActivityC12483)).iterator();
        while (it2.hasNext()) {
            ((AbstractC14639) it2.next()).getClass();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29195(Context context, C3348 c3348) {
        Bitmap bitmapDecodeStream;
        C16775 c16775M39337;
        C16775 c16775 = c3348.f12383;
        if (c16775 == null) {
            return false;
        }
        int i = c16775.f53695;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream inputStreamM39340 = c16775.m39340(context);
        if (inputStreamM39340 == null || (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamM39340)) == null) {
            return false;
        }
        if (i == 6) {
            c16775M39337 = C16775.m39335(bitmapDecodeStream);
        } else {
            c16775M39337 = C16775.m39337(bitmapDecodeStream);
        }
        c3348.f12383 = c16775M39337;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29194(AbstractActivityC12483 abstractActivityC12483, List list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) abstractActivityC12483.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        m29190(abstractActivityC12483).getClass();
        Iterator it = ((ArrayList) m29198(abstractActivityC12483)).iterator();
        while (it.hasNext()) {
            ((AbstractC14639) it.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static AbstractC13809 m29190(Context context) {
        if (f39309 == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    f39309 = (AbstractC13809) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, C11692.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (f39309 == null) {
                f39309 = new C4635();
            }
        }
        return f39309;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static List m29198(Context context) {
        Bundle bundle;
        String string;
        if (f39308 == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((AbstractC14639) Class.forName(string, false, C11692.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f39308 == null) {
                f39308 = arrayList;
            }
        }
        return f39308;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m29192(ArrayList arrayList) {
        if (Build.VERSION.SDK_INT > 32) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C3348) it.next()).getClass();
        }
        return arrayList2;
    }
}
