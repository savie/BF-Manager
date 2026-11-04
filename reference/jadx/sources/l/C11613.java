package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۧ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66FP */
/* JADX INFO: loaded from: classes3.dex */
public final class C11613 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C1919 m29183(String str) {
        String strSubstring = str.substring(19);
        if (!strSubstring.isEmpty() && strSubstring.length() <= 255 && strSubstring.charAt(0) != '.' && !strSubstring.endsWith(".")) {
            boolean z = false;
            for (int i = 0; i < strSubstring.length(); i++) {
                char cCharAt = strSubstring.charAt(i);
                if (cCharAt == '.') {
                    if (!z) {
                        z = true;
                    }
                } else if ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '_'))) {
                    z = false;
                }
            }
            try {
                ApplicationInfo applicationInfo = C21576.m49081().getPackageInfo(strSubstring, 0).applicationInfo;
                if (applicationInfo == null || applicationInfo.sourceDir == null || !new File(applicationInfo.sourceDir).isAbsolute()) {
                    throw C10186.m26300("INSTALLED_APP_UNAVAILABLE", "Installed APK is unavailable");
                }
                return new C1919(m29181(applicationInfo).size(), strSubstring, applicationInfo.sourceDir);
            } catch (PackageManager.NameNotFoundException unused) {
                throw C10186.m26298(null, "INSTALLED_APP_NOT_FOUND", "Installed app is no longer available", "warning");
            } catch (SecurityException unused2) {
                throw C10186.m26305("INSTALLED_APPS_ACCESS_DENIED", "Cannot query installed app");
            }
        }
        throw C10186.m26301("Invalid installed app target", MotionUtils.EASING_TYPE_PATH, JSON.value(str), JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "mt://installed-app/com.example.app"));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0166  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5648 m29182(String str, int i, String str2, String str3) throws Throwable {
        boolean z;
        PackageManager packageManager;
        String str4;
        String string;
        Integer numValueOf;
        String str5 = str2;
        PackageManager packageManagerM49081 = C21576.m49081();
        try {
            ArrayList<PackageInfo> arrayList = new ArrayList(packageManagerM49081.getInstalledPackages(0));
            C1170.removeIf(arrayList, new C15342(0));
            C12884.sort(arrayList, C2661.comparing(new C13105(0)));
            C5648 c5648 = new C5648();
            ApplicationC17729 applicationC17729 = C21576.f68934;
            boolean z2 = true;
            if (Build.VERSION.SDK_INT < 30 || packageManagerM49081.checkPermission("android.permission.QUERY_ALL_PACKAGES", applicationC17729.getPackageName()) == 0) {
                try {
                    packageManagerM49081.getPermissionInfo("com.android.permission.GET_INSTALLED_APPS", 0);
                    if (packageManagerM49081.checkPermission("com.android.permission.GET_INSTALLED_APPS", applicationC17729.getPackageName()) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            } else {
                z = true;
            }
            c5648.f19511 = z;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            String str6 = "";
            for (PackageInfo packageInfo : arrayList) {
                if (Thread.currentThread().isInterrupted()) {
                    throw C10186.m26300("CANCELLED", "Installed app query interrupted");
                }
                String str7 = packageInfo.packageName;
                if (!str7.equals(str6)) {
                    if (str7.compareTo(str3) > 0) {
                        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                        if (applicationInfo == null) {
                            c5648.f19513 += z2 ? 1 : 0;
                        } else {
                            boolean z3 = (applicationInfo.flags & 129) != 0;
                            if ((!str5.equals("user") || !z3) && (!str5.equals("system") || z3)) {
                                try {
                                    CharSequence charSequenceLoadLabel = applicationInfo.loadLabel(packageManagerM49081);
                                    string = charSequenceLoadLabel != null ? charSequenceLoadLabel.toString() : null;
                                } catch (RuntimeException unused2) {
                                }
                                String str8 = string;
                                if (!lowerCase.isEmpty()) {
                                    Locale locale = Locale.ROOT;
                                    if (!str7.toLowerCase(locale).contains(lowerCase) && (str8 == null || !str8.toLowerCase(locale).contains(lowerCase))) {
                                        if (str8 == null) {
                                            c5648.f19513 += z2 ? 1 : 0;
                                        }
                                    }
                                }
                                JSONArray jSONArray = c5648.f19512;
                                if (jSONArray.size() == i) {
                                    c5648.f19509 = z2;
                                    break;
                                }
                                ArrayList arrayListM29181 = m29181(applicationInfo);
                                Long lM29180 = m29180(applicationInfo.sourceDir);
                                Iterator it = arrayListM29181.iterator();
                                Long lValueOf = lM29180;
                                while (it.hasNext()) {
                                    Long lM29181 = m29180((String) it.next());
                                    lValueOf = (lValueOf == null || lM29181 == null || lValueOf.longValue() > 9007199254740991L - lM29181.longValue()) ? null : Long.valueOf(lM29181.longValue() + lValueOf.longValue());
                                }
                                Integer numValueOf2 = Integer.valueOf(z2 ? 1 : 0);
                                if (Build.VERSION.SDK_INT >= 24) {
                                    int i2 = applicationInfo.minSdkVersion;
                                    if (i2 > 0) {
                                        numValueOf = Integer.valueOf(i2);
                                        packageManager = packageManagerM49081;
                                        str4 = lowerCase;
                                    } else {
                                        packageManager = packageManagerM49081;
                                        str4 = lowerCase;
                                        numValueOf = null;
                                    }
                                } else {
                                    String str9 = applicationInfo.sourceDir;
                                    if (str9 == null) {
                                        packageManager = packageManagerM49081;
                                        str4 = lowerCase;
                                        numValueOf = null;
                                    } else {
                                        try {
                                            C22941 c22941 = new C22941(str9);
                                            try {
                                                C8002 entry = c22941.getEntry("AndroidManifest.xml");
                                                if (entry == null || entry.getSize() < 0 || entry.getSize() > 2097152) {
                                                    packageManager = packageManagerM49081;
                                                    str4 = lowerCase;
                                                    c22941.close();
                                                    numValueOf = null;
                                                } else {
                                                    XmlResourceParserC9734 xmlResourceParserC9734M35991 = C14955.m35982(c22941.m51731(entry, (C3374) null)).m35991();
                                                    while (true) {
                                                        try {
                                                            int next = xmlResourceParserC9734M35991.next();
                                                            packageManager = packageManagerM49081;
                                                            if (next != 1) {
                                                                if (next == 2) {
                                                                    try {
                                                                        if ("uses-sdk".equals(xmlResourceParserC9734M35991.getName())) {
                                                                            int i3 = 0;
                                                                            while (true) {
                                                                                if (i3 < xmlResourceParserC9734M35991.getAttributeCount()) {
                                                                                    str4 = lowerCase;
                                                                                    if (xmlResourceParserC9734M35991.getAttributeNameResource(i3) == 16843276) {
                                                                                        try {
                                                                                            int attributeIntValue = xmlResourceParserC9734M35991.getAttributeIntValue(i3, -1);
                                                                                            numValueOf = attributeIntValue > 0 ? Integer.valueOf(attributeIntValue) : null;
                                                                                            try {
                                                                                                xmlResourceParserC9734M35991.close();
                                                                                                try {
                                                                                                    c22941.close();
                                                                                                } catch (Exception unused3) {
                                                                                                    numValueOf = null;
                                                                                                }
                                                                                            } catch (Throwable th) {
                                                                                                th = th;
                                                                                                Throwable th2 = th;
                                                                                                try {
                                                                                                    c22941.close();
                                                                                                } catch (Throwable th3) {
                                                                                                    th2.addSuppressed(th3);
                                                                                                }
                                                                                                throw th2;
                                                                                            }
                                                                                        } catch (Throwable th4) {
                                                                                            th = th4;
                                                                                            Throwable th5 = th;
                                                                                            xmlResourceParserC9734M35991.close();
                                                                                            throw th5;
                                                                                        }
                                                                                    } else {
                                                                                        i3++;
                                                                                        lowerCase = str4;
                                                                                    }
                                                                                } else {
                                                                                    str4 = lowerCase;
                                                                                }
                                                                            }
                                                                        }
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        str4 = lowerCase;
                                                                    }
                                                                    Throwable th7 = th;
                                                                    try {
                                                                        xmlResourceParserC9734M35991.close();
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                    }
                                                                    throw th7;
                                                                }
                                                                packageManagerM49081 = packageManager;
                                                                lowerCase = lowerCase;
                                                            } else {
                                                                str4 = lowerCase;
                                                            }
                                                            xmlResourceParserC9734M35991.close();
                                                            c22941.close();
                                                            numValueOf = numValueOf2;
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            packageManager = packageManagerM49081;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
                                                packageManager = packageManagerM49081;
                                                str4 = lowerCase;
                                            }
                                        } catch (Exception unused4) {
                                            packageManager = packageManagerM49081;
                                            str4 = lowerCase;
                                        }
                                    }
                                }
                                if (str8 == null || lM29180 == null || lValueOf == null || numValueOf == null) {
                                    c5648.f19513++;
                                }
                                JSONObject jSONObjectAdd = C22121.m50076("appLabel", str8, "packageName", str7).add("versionName", packageInfo.versionName).add("versionCode", Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : ((long) packageInfo.versionCode) & 4294967295L)).add("systemApp", z3).add("enabled", applicationInfo.enabled).add("minSdk", numValueOf == null ? JSON.NULL : JSON.value(numValueOf.intValue()));
                                int i4 = applicationInfo.targetSdkVersion;
                                jSONArray.add(jSONObjectAdd.add("targetSdk", i4 > 0 ? JSON.value(i4) : JSON.NULL).add("size", lValueOf == null ? JSON.NULL : JSON.value(lValueOf.longValue())).add("baseApkSize", lM29180 == null ? JSON.NULL : JSON.value(lM29180.longValue())).add("splitCount", arrayListM29181.size()).add(MotionUtils.EASING_TYPE_PATH, "mt://installed-app/".concat(str7)));
                                c5648.f19510 = str7;
                            }
                        }
                        packageManager = packageManagerM49081;
                        str4 = lowerCase;
                    } else {
                        packageManager = packageManagerM49081;
                        str4 = lowerCase;
                    }
                    z2 = true;
                    str5 = str2;
                    str6 = str7;
                    packageManagerM49081 = packageManager;
                    lowerCase = str4;
                }
            }
            return c5648;
        } catch (SecurityException unused5) {
            throw C10186.m26305("INSTALLED_APPS_ACCESS_DENIED", "Cannot query installed apps");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m29181(ApplicationInfo applicationInfo) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        hashSet.add(applicationInfo.sourceDir);
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            for (String str : strArr) {
                if (str != null && !str.isEmpty() && hashSet.add(str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Long m29180(String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (file.isFile() && file.canRead()) {
            long length = file.length();
            if (length <= 9007199254740991L) {
                return Long.valueOf(length);
            }
        }
        return null;
    }
}
