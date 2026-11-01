package l;

import android.content.Context;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16259 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static int f52418;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C22235 f52419;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f52420 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean f52421;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C3070 f52422;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C10833 f52423 = new C10833(new C19787());

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String f52424;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m38411(int i) {
        return (i == 0 || i == 16777216) ? i : i | (-16777216);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static synchronized void m38408() {
        String strM38413;
        int i = ApplicationC0716.f2992.getInt("amp", 8787);
        f52418 = C15945.m37906(i) ? i : 8787;
        String string = ApplicationC0716.f2992.getString("amop", null);
        try {
            if (TextUtils.isEmpty(string)) {
                strM38413 = m38413();
            } else {
                try {
                    strM38413 = C6370.m17479(string, "homePath");
                } catch (C12731 unused) {
                    throw new C21197(EnumC7792.PRIMARY_STORAGE);
                }
            }
            if (m38407(strM38413) != null) {
                strM38413 = m38413();
            }
        } catch (C21197 unused2) {
            strM38413 = m38413();
        }
        f52424 = strM38413;
        String string2 = ApplicationC0716.f2992.getString("amfa", null);
        C22235 c22235M49362 = C22235.m49362(string2);
        f52419 = c22235M49362;
        f52422 = null;
        if (string2 != null && !c22235M49362.f72695 && !string2.equals(c22235M49362.m49366())) {
            ApplicationC0716.f2992.edit().putString("amfa", f52419.m49366()).apply();
        }
        if (string != null && !strM38413.equals(string)) {
            ApplicationC0716.f2992.edit().putString("amop", strM38413).apply();
        }
        f52421 = ApplicationC0716.f2992.getBoolean("amfw", false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m38415(String str, String str2) {
        if (str.equals("/") || str2.equals("/")) {
            throw new IllegalArgumentException("Root rule cannot be reordered");
        }
        ArrayList arrayList = new ArrayList(f52419.f72696);
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((C9422) arrayList.get(i3)).f31925.equals(str)) {
                i = i3;
            }
            if (((C9422) arrayList.get(i3)).f31925.equals(str2)) {
                i2 = i3;
            }
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("File access rule no longer exists");
        }
        if (i == i2) {
            return;
        }
        arrayList.add(i2, (C9422) arrayList.remove(i));
        m38418(new C22235(arrayList, false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m38416(String str, EnumC23533 enumC23533) {
        ArrayList arrayList = new ArrayList(f52419.f72696);
        for (int i = 0; i < arrayList.size(); i++) {
            C9422 c9422 = (C9422) arrayList.get(i);
            if (c9422.f31925.equals(str)) {
                EnumC13197 enumC13197 = c9422.f31923;
                C13638.requireNonNull(enumC23533);
                arrayList.set(i, new C9422(str, enumC13197, enumC23533, false));
                m38418(new C22235(arrayList, false));
            }
        }
        throw new IllegalArgumentException("File access rule no longer exists");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m38417(C9422 c9422, EnumC23533 enumC23533) {
        m38410(c9422.f31925);
        ArrayList arrayList = new ArrayList(f52419.f72696);
        String str = c9422.f31925;
        EnumC13197 enumC13197 = c9422.f31923;
        C13638.requireNonNull(enumC23533);
        arrayList.add(0, new C9422(str, enumC13197, enumC23533, false));
        m38418(new C22235(arrayList, false));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m38421() {
        return f52419.f72695;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static synchronized AbstractC20745 m38422() {
        return C5553.m15313(f52424, new String[0]);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static synchronized void m38423(String str) {
        if (str.equals("/")) {
            throw new IllegalArgumentException("Root rule cannot be removed");
        }
        ArrayList arrayList = new ArrayList(f52419.f72696);
        C9030.removeIf(arrayList, new C9204(0, str));
        m38418(new C22235(arrayList, false));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static synchronized C3070 m38424() {
        List listM27154 = f52423.m27154();
        C3070 c3070 = f52422;
        if (c3070 == null || !c3070.f11564.equals(f52424) || !f52422.f11563.equals(listM27154)) {
            f52422 = f52419.m49367(f52424, listM27154);
        }
        return f52422;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static synchronized void m38426(String str) {
        Integer numM37905 = C15945.m37905(str);
        if (numM37905 == null) {
            throw new IllegalArgumentException("Invalid MCP port");
        }
        f52418 = numM37905.intValue();
        ApplicationC0716.f2992.edit().mo4065(numM37905.intValue(), "amp").apply();
    }

    static {
        m38408();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m38409() {
        return f52418;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C9422 m38425(String str) {
        EnumC13197 enumC13197;
        String strM17479 = C6370.m17479(str, MotionUtils.EASING_TYPE_PATH);
        synchronized (C16259.class) {
            m38410(strM17479);
        }
        int i = C10615.f36277[C5553.m15313(strM17479, new String[0]).mo33989().mo8394().m16196().ordinal()];
        if (i == 1) {
            enumC13197 = EnumC13197.FILE;
        } else if (i == 2) {
            enumC13197 = EnumC13197.DIRECTORY;
        } else {
            throw new IllegalArgumentException("Rule target must be an existing file or directory");
        }
        return new C9422(strM17479, enumC13197, EnumC23533.DENY, false);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m38410(String str) {
        if (C22235.m49364(str, f52424, f52423.m27154())) {
            throw new IllegalArgumentException("File access rule is shadowed by Home or managed paths");
        }
        Iterator it = f52419.f72696.iterator();
        while (it.hasNext()) {
            if (((C9422) it.next()).f31925.equals(str)) {
                throw new IllegalArgumentException("Duplicate file access rule path");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38418(C22235 c22235) {
        ApplicationC0716.f2992.edit().putString("amfa", c22235.m49366()).apply();
        f52419 = c22235;
        f52422 = null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m38427() {
        return f52421;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m38412(Context context, int i) {
        int iM38411 = m38411(i);
        if (iM38411 != 0 && iM38411 != 16777216) {
            return iM38411;
        }
        return C16135.m38193(new ContextThemeWrapper(context, C2666.m8210()).getTheme(), iM38411 == 16777216 ? R.attr.MT_Protector : R.attr.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38419(boolean z, boolean z2) {
        f52421 = z;
        ApplicationC0716.f2992.edit().putBoolean("amfw", z).putBoolean("floating_button_stick_to_edge", z2).apply();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m38420(String str) {
        String strM38414 = m38414(str);
        AbstractC20745 abstractC20745M15313 = C5553.m15313(strM38414, new String[0]);
        if (!abstractC20745M15313.mo33975()) {
            try {
                abstractC20745M15313.m46739();
                C15157.m36345();
            } catch (Exception unused) {
                throw new C21197(EnumC7792.CREATE_FAILED);
            }
        }
        if (abstractC20745M15313.mo33974()) {
            synchronized (C16259.class) {
                f52424 = strM38414;
                ApplicationC0716.f2992.edit().putString("amop", strM38414).apply();
            }
            return;
        }
        throw new C21197(EnumC7792.CREATE_FAILED);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38414(String str) {
        String strM17479;
        if (TextUtils.isEmpty(str)) {
            strM17479 = m38413();
        } else {
            try {
                strM17479 = C6370.m17479(str, "homePath");
            } catch (C12731 unused) {
                throw new C21197(EnumC7792.PRIMARY_STORAGE);
            }
        }
        EnumC7792 enumC7792M38407 = m38407(strM17479);
        if (enumC7792M38407 == null) {
            return strM17479;
        }
        throw new C21197(enumC7792M38407);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static EnumC7792 m38407(String str) {
        Iterator it = f52423.m27154().iterator();
        while (it.hasNext()) {
            if (C6370.m17477(str, (String) it.next())) {
                return EnumC7792.MANAGED_PATH;
            }
        }
        if (C6370.m17476(str)) {
            return EnumC7792.ANDROID_DATA;
        }
        if (!C5553.m15304(str)) {
            return EnumC7792.PRIMARY_STORAGE;
        }
        AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
        if (!abstractC20745M15313.mo33975() || abstractC20745M15313.mo33974()) {
            return null;
        }
        return EnumC7792.FILE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38413() {
        return C5553.m15323(C11904.f39934.m46690("MT2").m46690("mcp").mo33986());
    }
}
