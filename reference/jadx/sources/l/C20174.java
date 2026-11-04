package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴ᩻۫, reason: contains not printable characters */
/* JADX INFO: compiled from: H8A7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20174 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Set f64790;

    static {
        m46412();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m46412() {
        String string = ApplicationC17729.f58258.getString("mhf", null);
        if (!C24276.m54286((CharSequence) string)) {
            f64790 = m46410(string);
        } else {
            f64790 = Collections.EMPTY_SET;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m46415() {
        return ApplicationC17729.f58258.getBoolean("smhf", false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46408(boolean z) {
        C6421.m18184(ApplicationC17729.f58258, "smhf", z);
        m46416();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m46411() {
        return ApplicationC17729.f58258.getBoolean("sshf", true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m46414(boolean z) {
        C6421.m18184(ApplicationC17729.f58258, "sshf", z);
        m46416();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m46409(String str) {
        return f64790.contains(m46413(str));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m46413(String str) {
        if (str.startsWith("/sdcard/")) {
            str = C6382.f21566 + str.substring(7);
        }
        while (str.length() > 1 && str.endsWith("/")) {
            str = C1402.m5124(1, 0, str);
        }
        return str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46407(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (m46415()) {
            C6421.m18184(ApplicationC17729.f58258, "smhf", false);
        }
        HashSet hashSet = new HashSet(f64790);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(m46413((String) it.next()));
        }
        m46406(hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46404() {
        return m46405(f64790);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m46417(String str) {
        m46406(m46410(str));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static HashSet m46410(String str) {
        HashSet hashSet = new HashSet();
        for (String str2 : str.split("\n")) {
            if (str2.startsWith("/")) {
                hashSet.add(m46413(str2));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46406(HashSet hashSet) {
        String strM46405 = m46405((Set) hashSet);
        InterfaceC18752 interfaceC18752Edit = ApplicationC17729.f58258.edit();
        if (strM46405.endsWith("\n")) {
            strM46405 = C1402.m5124(1, 0, strM46405);
        }
        interfaceC18752Edit.putString("mhf", strM46405).apply();
        f64790 = hashSet;
        m46416();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m46416() {
        if (C22415.m50557()) {
            C6331.m18055();
        } else {
            C21576.m49068(new RunnableC22951(1));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46405(Set set) {
        ArrayList arrayList = new ArrayList(set);
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append('\n');
        }
        return sb.toString();
    }
}
