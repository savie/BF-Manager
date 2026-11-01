package l;

import bin.mt.json.JSON;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۙܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4698 {
    /* JADX WARN: Code duplicated, block: B:96:0x015c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3557 m13014(String str, int i, int i2, boolean z) throws C12731 {
        String strM17479;
        List listAsList;
        int i3;
        int i4;
        String strM33715;
        String str2 = str;
        if (str2 == null) {
            throw m13016(str2, "prefix must be a string");
        }
        int i5 = 1;
        if (!str.isEmpty()) {
            if (str2.charAt(0) != '/' && str2.indexOf(92) < 0 && str2.indexOf(0) < 0) {
                int iIndexOf = str2.indexOf(58);
                if (iIndexOf > 0) {
                    int i6 = 0;
                    while (true) {
                        if (i6 < iIndexOf) {
                            char cCharAt = str2.charAt(i6);
                            if (i6 == 0) {
                                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                                    break;
                                }
                                i6++;
                                i5 = 1;
                            } else {
                                if ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '+' && cCharAt != '-' && cCharAt != '.'))) {
                                    break;
                                }
                                i6++;
                                i5 = 1;
                            }
                        }
                    }
                }
                String[] strArrSplit = str2.split("/", -1);
                for (int i7 = 0; i7 < strArrSplit.length; i7++) {
                    String str3 = strArrSplit[i7];
                    if (!(i7 == strArrSplit.length - i5 && str3.isEmpty()) && (str3.isEmpty() || ".".equals(str3) || "..".equals(str3))) {
                        throw m13016(str2, "prefix must not contain empty, dot, or parent segments");
                    }
                }
            }
            throw m13016(str2, "prefix must be a relative path prefix");
        }
        str2 = "";
        String str4 = str2;
        C3070 c3070M37800 = C20119.m45481().m37800();
        String str5 = c3070M37800.f11564;
        c3070M37800.m9209(str5);
        C9909 c9909M13015 = null;
        if (z && str4.isEmpty() && (strM33715 = C13872.m33715()) != null) {
            try {
                strM17479 = C6370.m17479(strM33715, MotionUtils.EASING_TYPE_PATH);
            } catch (C12731 unused) {
                strM17479 = null;
            }
        } else {
            strM17479 = null;
        }
        if (strM17479 == null) {
            listAsList = Collections.singletonList(str5);
        } else {
            listAsList = Arrays.asList(str5, strM17479);
        }
        AbstractC20745 abstractC20745M15313 = C5553.m15313(str5, new String[0]);
        C11268 c11268M52811 = C20119.m45482().m52811(listAsList);
        try {
            if (!abstractC20745M15313.mo33975()) {
                throw C12731.m31623(null, "AVAILABLE_APK_DIRECTORY_NOT_FOUND", "Available APK directory does not exist.", "warning");
            }
            if (!abstractC20745M15313.mo33974()) {
                throw C12731.m31630("AVAILABLE_APK_DIRECTORY_NOT_DIRECTORY", "Available APK path is not a directory.");
            }
            if (!abstractC20745M15313.mo8449()) {
                throw C12731.m31623(null, "AVAILABLE_APK_DIRECTORY_UNREADABLE", "Available APK directory is not readable.", "warning");
            }
            ArrayList arrayListM13013 = m13013(abstractC20745M15313, c3070M37800, str4);
            C23846.sort(arrayListM13013, C7618.comparing(new C24020()));
            int iMax = Math.max(0, Math.min(i2, arrayListM13013.size()));
            ArrayList arrayList = new ArrayList(i);
            if (z && iMax == 0 && str4.isEmpty()) {
                if (strM17479 != null) {
                    AbstractC20745 abstractC20745M15314 = C5553.m15313(strM17479, new String[0]);
                    if (abstractC20745M15314.mo33975() && abstractC20745M15314.mo33971()) {
                        c9909M13015 = m13015(new C2146(abstractC20745M15314, "mt://current-apk", abstractC20745M15314.mo33964(), abstractC20745M15314.mo33991()));
                    }
                }
                if (c9909M13015 != null) {
                    arrayList.add(c9909M13015);
                    i3 = i - 1;
                    i4 = 1;
                } else {
                    i3 = i;
                    i4 = 0;
                }
            } else {
                i3 = i;
                i4 = 0;
            }
            int iMin = Math.min(i3 + iMax, arrayListM13013.size());
            while (iMax < iMin) {
                arrayList.add(m13015((C2146) arrayListM13013.get(iMax)));
                iMax++;
            }
            C3557 c3557 = new C3557(str4, arrayList, arrayListM13013.size(), i4 + arrayListM13013.size(), i, iMin);
            c11268M52811.close();
            return c3557;
        } catch (Throwable th) {
            try {
                c11268M52811.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m13013(AbstractC20745 abstractC20745, C3070 c3070, String str) {
        String string;
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C14848(abstractC20745, ""));
        while (!linkedList.isEmpty()) {
            C14848 c14848 = (C14848) linkedList.removeFirst();
            AbstractC20745 abstractC20746 = c14848.f48528;
            String str2 = c14848.f48529;
            for (AbstractC20745 abstractC20747 : abstractC20746.mo33983(true)) {
                if (c3070.m9208(abstractC20747.mo33986()).f6625.m51848()) {
                    if (str2.isEmpty()) {
                        string = abstractC20747.getName();
                    } else {
                        StringBuilder sbM8976 = C3012.m8976(str2, "/");
                        sbM8976.append(abstractC20747.getName());
                        string = sbM8976.toString();
                    }
                    String str3 = string;
                    if (abstractC20747.mo33974()) {
                        if (!abstractC20747.m46723()) {
                            linkedList.addLast(new C14848(abstractC20747, str3));
                        }
                    } else if (abstractC20747.mo33971() && !abstractC20747.m46723() && abstractC20747.getName().toLowerCase(Locale.ROOT).endsWith(".apk") && str3.startsWith(str)) {
                        arrayList.add(new C2146(abstractC20747, str3, abstractC20747.mo33964(), abstractC20747.mo33991()));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9909 m13015(C2146 c2146) {
        C0465 c0465;
        Long lValueOf;
        int i = 0;
        try {
            C2455 c2455 = new C2455(c2146.f7812);
            try {
                c0465 = C12461.m30940(c2455);
                c2455.close();
            } catch (Throwable th) {
                try {
                    c2455.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            String message = e.getMessage() == null ? "Failed to parse APK manifest." : e.getMessage();
            c0465 = new C0465();
            c0465.f2099 = false;
            c0465.f2094 = message;
        }
        String str = c0465.f2096;
        if (str == null) {
            str = c0465.f2101;
        }
        String str2 = str;
        String str3 = c2146.f7813;
        long j = c2146.f7811;
        long j2 = c2146.f7814;
        String str4 = c0465.f2093;
        String str5 = c0465.f2098;
        String str6 = c0465.f2095;
        if (str6 == null || str6.isEmpty()) {
            lValueOf = null;
        } else {
            while (true) {
                if (i < str6.length()) {
                    char cCharAt = str6.charAt(i);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    i++;
                } else {
                    try {
                        lValueOf = Long.valueOf(Long.parseLong(str6));
                    } catch (NumberFormatException unused) {
                        lValueOf = null;
                    }
                }
            }
            lValueOf = null;
        }
        return new C9909(str3, j, j2, str2, str4, str5, lValueOf, c0465.f2099, c0465.f2094);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m13016(String str, String str2) {
        return C12731.m31626(str2, "prefix", str == null ? null : JSON.value(str), JSON.array(), JSON.object().add("prefix", ""));
    }
}
