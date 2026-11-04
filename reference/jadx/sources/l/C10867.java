package l;

import bin.mt.json.JSON;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۤ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P776 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10867 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22209 f34408 = new C22209(C20015.m46048(), C20015.m46049());

    /* JADX WARN: Code duplicated, block: B:99:0x0168  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22056 m27605(String str, int i, int i2, boolean z) throws C10186 {
        String strM2304;
        List listAsList;
        int i3;
        String strM55860;
        String str2 = str;
        C22209 c22209 = this.f34408;
        if (str2 == null) {
            throw m27604(str2, "prefix must be a string");
        }
        int i4 = 1;
        if (!str.isEmpty()) {
            if (str2.charAt(0) != '/' && str2.indexOf(92) < 0 && str2.indexOf(0) < 0) {
                int iIndexOf = str2.indexOf(58);
                if (iIndexOf > 0) {
                    int i5 = 0;
                    while (true) {
                        if (i5 < iIndexOf) {
                            char cCharAt = str2.charAt(i5);
                            if (i5 == 0) {
                                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                                    break;
                                }
                                i5++;
                                i4 = 1;
                            } else {
                                if ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '+' && cCharAt != '-' && cCharAt != '.'))) {
                                    break;
                                }
                                i5++;
                                i4 = 1;
                            }
                        }
                    }
                }
                String[] strArrSplit = str2.split("/", -1);
                for (int i6 = 0; i6 < strArrSplit.length; i6++) {
                    String str3 = strArrSplit[i6];
                    if (!(i6 == strArrSplit.length - i4 && str3.isEmpty()) && (str3.isEmpty() || ".".equals(str3) || "..".equals(str3))) {
                        throw m27604(str2, "prefix must not contain empty, dot, or parent segments");
                    }
                }
            }
            throw m27604(str2, "prefix must be a relative path prefix");
        }
        str2 = "";
        String str4 = str2;
        C9113 c9113M51885 = C20015.m46048().m51885();
        String str5 = c9113M51885.f29601;
        c9113M51885.m24268(str5);
        C4902 c4902M27603 = null;
        if (z && str4.isEmpty() && (strM55860 = C25040.m55860()) != null) {
            try {
                strM2304 = C0470.m2304(strM55860, MotionUtils.EASING_TYPE_PATH);
            } catch (C10186 unused) {
                strM2304 = null;
            }
        } else {
            strM2304 = null;
        }
        if (strM2304 == null) {
            listAsList = Collections.singletonList(str5);
        } else {
            listAsList = Arrays.asList(str5, strM2304);
        }
        AbstractC22044 abstractC22044M35193 = C14584.m35193(str5, new String[0]);
        C19225 c19225M26485 = C20015.m46049().m26485(listAsList);
        try {
            c22209.m50230(abstractC22044M35193);
            if (!abstractC22044M35193.mo2934()) {
                throw C10186.m26298(null, "AVAILABLE_APK_DIRECTORY_NOT_FOUND", "Available APK directory does not exist.", "warning");
            }
            if (!abstractC22044M35193.mo4281()) {
                throw C10186.m26305("AVAILABLE_APK_DIRECTORY_NOT_DIRECTORY", "Available APK path is not a directory.");
            }
            if (!abstractC22044M35193.mo4302()) {
                throw C10186.m26298(null, "AVAILABLE_APK_DIRECTORY_UNREADABLE", "Available APK directory is not readable.", "warning");
            }
            ArrayList arrayListM27602 = m27602(abstractC22044M35193, c9113M51885, str4);
            C12884.sort(arrayListM27602, C2661.comparing(new C8695()));
            int iMax = Math.max(0, Math.min(i2, arrayListM27602.size()));
            int i7 = 1;
            ArrayList arrayList = new ArrayList(i);
            if (z && iMax == 0 && str4.isEmpty()) {
                if (strM2304 != null) {
                    AbstractC22044 abstractC22044M35194 = C14584.m35193(strM2304, new String[0]);
                    try {
                        c22209.m50230(abstractC22044M35194);
                        if (abstractC22044M35194.mo2934() && abstractC22044M35194.mo4304()) {
                            c4902M27603 = m27603(new C13915(abstractC22044M35194, "mt://current-apk", abstractC22044M35194.mo4285(), abstractC22044M35194.mo4286()));
                        }
                    } catch (C10186 unused2) {
                    }
                }
                if (c4902M27603 != null) {
                    arrayList.add(c4902M27603);
                    i3 = i - 1;
                } else {
                    i7 = 0;
                    i3 = i;
                }
            } else {
                i7 = 0;
                i3 = i;
            }
            int iMin = Math.min(i3 + iMax, arrayListM27602.size());
            while (iMax < iMin) {
                arrayList.add(m27603((C13915) arrayListM27602.get(iMax)));
                iMax++;
            }
            C22056 c22056 = new C22056(str4, arrayList, arrayListM27602.size(), arrayListM27602.size() + i7, i, iMin);
            c19225M26485.close();
            return c22056;
        } catch (Throwable th) {
            try {
                c19225M26485.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m27602(AbstractC22044 abstractC22044, C9113 c9113, String str) {
        String string;
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C7204(abstractC22044, ""));
        while (!linkedList.isEmpty()) {
            C7204 c7204 = (C7204) linkedList.removeFirst();
            AbstractC22044 abstractC22045 = c7204.f23778;
            String str2 = c7204.f23779;
            for (AbstractC22044 abstractC22046 : abstractC22045.mo4299(true)) {
                if (c9113.m24267(abstractC22046.mo4294()).f31730.m20826()) {
                    if (str2.isEmpty()) {
                        string = abstractC22046.getName();
                    } else {
                        StringBuilder sbM10405 = C3188.m10405(str2, "/");
                        sbM10405.append(abstractC22046.getName());
                        string = sbM10405.toString();
                    }
                    String str3 = string;
                    if (abstractC22046.mo4281()) {
                        if (!abstractC22046.m49860()) {
                            linkedList.addLast(new C7204(abstractC22046, str3));
                        }
                    } else if (abstractC22046.mo4304() && !abstractC22046.m49860() && abstractC22046.getName().toLowerCase(Locale.ROOT).endsWith(".apk") && str3.startsWith(str)) {
                        arrayList.add(new C13915(abstractC22046, str3, abstractC22046.mo4285(), abstractC22046.mo4286()));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C4902 m27603(C13915 c13915) {
        C7139 c7139M14548;
        Long lValueOf;
        int i = 0;
        try {
            this.f34408.m50230(c13915.f44127);
            C22941 c22941 = new C22941(c13915.f44127);
            try {
                c7139M14548 = C4684.m14548(c22941);
                c22941.close();
                String str = c7139M14548.f23603;
                if (str == null) {
                    str = c7139M14548.f23610;
                }
                String str2 = str;
                String str3 = c13915.f44128;
                long j = c13915.f44130;
                long j2 = c13915.f44129;
                String str4 = c7139M14548.f23607;
                String str5 = c7139M14548.f23606;
                String str6 = c7139M14548.f23602;
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
                return new C4902(str3, j, j2, str2, str4, str5, lValueOf, c7139M14548.f23605, c7139M14548.f23611);
            } catch (Throwable th) {
                try {
                    c22941.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception e) {
            String message = e.getMessage() == null ? "Failed to parse APK manifest." : e.getMessage();
            C7139 c7139 = new C7139();
            c7139.f23605 = false;
            c7139.f23611 = message;
            c7139M14548 = c7139;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m27604(String str, String str2) {
        return C10186.m26301(str2, "prefix", str == null ? null : JSON.value(str), JSON.array(), JSON.object().add("prefix", ""));
    }
}
