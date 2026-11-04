package l;

import android.content.Context;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XK */
/* JADX INFO: loaded from: classes2.dex */
public final class C0492 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2135 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C9113 f2136;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static int f2137;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String f2138;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean f2139;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C0165 f2140 = new C0165(new C24359());

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C4441 f2141;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m2365(int i) {
        return (i == 0 || i == 16777216) ? i : i | (-16777216);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m2369(String str, String str2) {
        if (str.equals("/") || str2.equals("/")) {
            throw new IllegalArgumentException("Root rule cannot be reordered");
        }
        ArrayList arrayList = new ArrayList(f2141.f15907);
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((C0911) arrayList.get(i3)).f3413.equals(str)) {
                i = i3;
            }
            if (((C0911) arrayList.get(i3)).f3413.equals(str2)) {
                i2 = i3;
            }
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("File access rule no longer exists");
        }
        if (i == i2) {
            return;
        }
        arrayList.add(i2, (C0911) arrayList.remove(i));
        m2372(new C4441(arrayList, false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m2370(String str, EnumC7623 enumC7623) {
        ArrayList arrayList = new ArrayList(f2141.f15907);
        for (int i = 0; i < arrayList.size(); i++) {
            C0911 c0911 = (C0911) arrayList.get(i);
            if (c0911.f3413.equals(str)) {
                EnumC20059 enumC20059 = c0911.f3415;
                C17359.requireNonNull(enumC7623);
                arrayList.set(i, new C0911(str, enumC20059, enumC7623, false));
                m2372(new C4441(arrayList, false));
            }
        }
        throw new IllegalArgumentException("File access rule no longer exists");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m2371(C0911 c0911, EnumC7623 enumC7623) {
        m2385(c0911.f3413);
        ArrayList arrayList = new ArrayList(f2141.f15907);
        String str = c0911.f3413;
        EnumC20059 enumC20059 = c0911.f3415;
        C17359.requireNonNull(enumC7623);
        arrayList.add(0, new C0911(str, enumC20059, enumC7623, false));
        m2372(new C4441(arrayList, false));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static synchronized AbstractC22044 m2374() {
        return C14584.m35193(f2138, new String[0]);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static synchronized void m2375(String str) {
        if (str.equals("/")) {
            throw new IllegalArgumentException("Root rule cannot be removed");
        }
        ArrayList arrayList = new ArrayList(f2141.f15907);
        C1170.removeIf(arrayList, new C4221(0, str));
        m2372(new C4441(arrayList, false));
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static synchronized void m2377() {
        String strM2367;
        int i = ApplicationC17729.f58258.getInt("amp", 8787);
        f2137 = C18856.m43746(i) ? i : 8787;
        String string = ApplicationC17729.f58258.getString("amop", null);
        try {
            if (TextUtils.isEmpty(string)) {
                strM2367 = m2367();
            } else {
                try {
                    strM2367 = C0470.m2304(string, "homePath");
                } catch (C10186 unused) {
                    throw new C18391(EnumC21375.PRIMARY_STORAGE);
                }
            }
            if (m2376(strM2367) != null) {
                strM2367 = m2367();
            }
        } catch (C18391 unused2) {
            strM2367 = m2367();
        }
        f2138 = strM2367;
        String string2 = ApplicationC17729.f58258.getString("amfa", null);
        C4441 c4441M14132 = C4441.m14132(string2);
        f2141 = c4441M14132;
        f2136 = null;
        if (string2 != null && !c4441M14132.f15906 && !string2.equals(c4441M14132.m14136())) {
            ApplicationC17729.f58258.edit().putString("amfa", f2141.m14136()).apply();
        }
        if (string != null && !strM2367.equals(string)) {
            ApplicationC17729.f58258.edit().putString("amop", strM2367).apply();
        }
        f2139 = ApplicationC17729.f58258.getBoolean("amfw", false);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static synchronized void m2378(String str) {
        Integer numM43756 = C18856.m43756(str);
        if (numM43756 == null) {
            throw new IllegalArgumentException("Invalid MCP port");
        }
        f2137 = numM43756.intValue();
        ApplicationC17729.f58258.edit().mo3486(numM43756.intValue(), "amp").apply();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m2381() {
        return f2141.f15906;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static synchronized C9113 m2383() {
        List listM1382 = f2140.m1382();
        C9113 c9113 = f2136;
        if (c9113 == null || !c9113.f29601.equals(f2138) || !f2136.f29599.equals(listM1382)) {
            f2136 = f2141.m14137(f2138, listM1382);
        }
        return f2136;
    }

    static {
        m2377();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m2384() {
        return f2137;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C0911 m2382(String str) throws C10186 {
        EnumC20059 enumC20059;
        String strM2304 = C0470.m2304(str, MotionUtils.EASING_TYPE_PATH);
        synchronized (C0492.class) {
            m2385(strM2304);
        }
        int i = C14661.f47947[C14584.m35193(strM2304, new String[0]).mo4298().mo8790().m6567().ordinal()];
        if (i == 1) {
            enumC20059 = EnumC20059.FILE;
        } else if (i == 2) {
            enumC20059 = EnumC20059.DIRECTORY;
        } else {
            throw new IllegalArgumentException("Rule target must be an existing file or directory");
        }
        return new C0911(strM2304, enumC20059, EnumC7623.DENY, false);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m2385(String str) {
        if (C4441.m14134(str, f2138, f2140.m1382())) {
            throw new IllegalArgumentException("File access rule is shadowed by Home or managed paths");
        }
        Iterator it = f2141.f15907.iterator();
        while (it.hasNext()) {
            if (((C0911) it.next()).f3413.equals(str)) {
                throw new IllegalArgumentException("Duplicate file access rule path");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2372(C4441 c4441) {
        ApplicationC17729.f58258.edit().putString("amfa", c4441.m14136()).apply();
        f2141 = c4441;
        f2136 = null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m2379() {
        return f2139;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m2366(Context context, int i) {
        int iM2365 = m2365(i);
        if (iM2365 != 0 && iM2365 != 16777216) {
            return iM2365;
        }
        return C23434.m52632(new ContextThemeWrapper(context, C7207.m19791()).getTheme(), iM2365 == 16777216 ? R.attr.MT_Protector : R.attr.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2373(boolean z, boolean z2) {
        f2139 = z;
        ApplicationC17729.f58258.edit().putBoolean("amfw", z).putBoolean("floating_button_stick_to_edge", z2).apply();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m2380(String str) {
        String strM2368 = m2368(str);
        AbstractC22044 abstractC22044M35193 = C14584.m35193(strM2368, new String[0]);
        if (!abstractC22044M35193.mo2934()) {
            try {
                abstractC22044M35193.m49853();
                C22099.m50062();
            } catch (Exception unused) {
                throw new C18391(EnumC21375.CREATE_FAILED);
            }
        }
        if (abstractC22044M35193.mo4281()) {
            synchronized (C0492.class) {
                f2138 = strM2368;
                ApplicationC17729.f58258.edit().putString("amop", strM2368).apply();
            }
            return;
        }
        throw new C18391(EnumC21375.CREATE_FAILED);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m2368(String str) {
        String strM2304;
        if (TextUtils.isEmpty(str)) {
            strM2304 = m2367();
        } else {
            try {
                strM2304 = C0470.m2304(str, "homePath");
            } catch (C10186 unused) {
                throw new C18391(EnumC21375.PRIMARY_STORAGE);
            }
        }
        EnumC21375 enumC21375M2376 = m2376(strM2304);
        if (enumC21375M2376 == null) {
            return strM2304;
        }
        throw new C18391(enumC21375M2376);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static EnumC21375 m2376(String str) {
        Iterator it = f2140.m1382().iterator();
        while (it.hasNext()) {
            if (C0470.m2302(str, (String) it.next())) {
                return EnumC21375.MANAGED_PATH;
            }
        }
        if (C0470.m2301(str)) {
            return EnumC21375.ANDROID_DATA;
        }
        if (!C14584.m35214(str)) {
            return EnumC21375.PRIMARY_STORAGE;
        }
        AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
        if (!abstractC22044M35193.mo2934() || abstractC22044M35193.mo4281()) {
            return null;
        }
        return EnumC21375.FILE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m2367() {
        return C14584.m35207(C6382.f21566.m49876("MT2").m49876("mcp").mo4294());
    }
}
