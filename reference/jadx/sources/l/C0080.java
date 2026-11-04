package l;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.material.badge.BadgeState;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77BV */
/* JADX INFO: loaded from: classes2.dex */
public final class C0080 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f987 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static List f988;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C13461 f989 = C13461.f42854;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static long f990;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20963 m1143(InterfaceC2386 interfaceC2386) {
        String str;
        int iMo2786 = f989.mo2786(interfaceC2386);
        switch (iMo2786) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                str = "full";
                break;
            case 7:
            case 8:
            case 10:
            case 11:
                str = BadgeState.BADGE_RESOURCE_TAG;
                break;
            case 9:
            default:
                str = null;
                break;
        }
        if (str == null || !m1148(interfaceC2386, iMo2786)) {
            return null;
        }
        return new C20963(str, m1141(interfaceC2386, iMo2786));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C17979 m1147(String str) {
        String str2;
        ApplicationInfo applicationInfo;
        Bitmap bitmapM22352;
        C6004 c6004M1142 = m1142(str);
        if (c6004M1142 != null) {
            C13461 c13461 = f989;
            int iMo2786 = c13461.mo2786(c6004M1142);
            switch (iMo2786) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    str2 = "full";
                    break;
                case 7:
                case 8:
                case 10:
                case 11:
                    str2 = BadgeState.BADGE_RESOURCE_TAG;
                    break;
                case 9:
                default:
                    str2 = null;
                    break;
            }
            if (str2 != null && m1148(c6004M1142, iMo2786)) {
                boolean zM1144 = false;
                if ("full".equals(str2)) {
                    C11983 c11983Mo2785 = c13461.mo2785((AbstractC7364) null, c6004M1142, iMo2786);
                    String strM1141 = m1141(c6004M1142, iMo2786);
                    if (iMo2786 == 1 || iMo2786 == 2) {
                        zM1144 = m1144(c11983Mo2785, C20613.f66070.f66114);
                    } else if (iMo2786 == 4) {
                        zM1144 = m1144(c11983Mo2785, C20613.f66096.f66114);
                    } else if (iMo2786 == 5) {
                        zM1144 = m1144(c11983Mo2785, C20613.f66074.f66114);
                    }
                    if (zM1144) {
                        return new C17979("damaged", null, strM1141);
                    }
                    if (!m1144(c11983Mo2785, c6004M1142.mo8091().m23976().f66114)) {
                        return new C17979("png", m1145(c11983Mo2785.m30078()), strM1141);
                    }
                } else {
                    String strM1142 = m1141(c6004M1142, iMo2786);
                    if (iMo2786 != 7) {
                        if (iMo2786 != 8) {
                            if (iMo2786 != 10) {
                                if (iMo2786 == 11 && strM1142 != null && (bitmapM22352 = C8275.m22352(c6004M1142.mo8093())) != null) {
                                    return new C17979("png", m1145(m1139(new BitmapDrawable(C21576.m49055(), bitmapM22352))), strM1142);
                                }
                            } else if (strM1142 != null) {
                                return m1146(strM1142);
                            }
                        } else if (strM1142 != null) {
                            String path = c6004M1142.getPath();
                            File file = new File(path, "base.apk");
                            if (!file.exists()) {
                                File[] fileArrListFiles = new File(path).listFiles();
                                if (fileArrListFiles != null) {
                                    File fileM1140 = m1140(fileArrListFiles);
                                    if (fileM1140 == null) {
                                        for (File file2 : fileArrListFiles) {
                                            File file3 = new File(file2, "base.apk");
                                            if (file2.isDirectory() && file3.exists()) {
                                                fileM1140 = file3;
                                            }
                                        }
                                    }
                                    if (fileM1140 == null) {
                                        for (File file4 : fileArrListFiles) {
                                            if (!file4.isDirectory() || (fileM1140 = m1140(file4.listFiles())) == null) {
                                            }
                                        }
                                    }
                                    file = fileM1140;
                                } else if (Build.VERSION.SDK_INT >= 34) {
                                    long jUptimeMillis = SystemClock.uptimeMillis();
                                    if (f988 == null || jUptimeMillis - f990 > 10000) {
                                        try {
                                            f988 = (List) C1170.stream(C21576.m49081().getInstalledPackages(0)).map(new C4527(3)).filter(new C11444(1)).collect(C2025.toList());
                                        } catch (RuntimeException unused) {
                                            f988 = Collections.EMPTY_LIST;
                                        }
                                        f990 = jUptimeMillis;
                                    }
                                    Iterator it = f988.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            String str3 = (String) it.next();
                                            if (str3.startsWith(path)) {
                                                File file5 = new File(str3);
                                                if (file5.exists()) {
                                                    file = file5;
                                                }
                                            }
                                        } else {
                                            file = null;
                                        }
                                    }
                                } else {
                                    file = null;
                                }
                            }
                            if (file == null) {
                                return null;
                            }
                            try {
                                PackageManager packageManagerM49081 = C21576.m49081();
                                PackageInfo packageArchiveInfo = packageManagerM49081.getPackageArchiveInfo(file.getPath(), 1);
                                if (packageArchiveInfo != null && (applicationInfo = packageArchiveInfo.applicationInfo) != null) {
                                    applicationInfo.publicSourceDir = file.getPath();
                                    applicationInfo.sourceDir = file.getPath();
                                    C11855.m29707(applicationInfo.icon, applicationInfo.packageName);
                                    return new C17979("png", m1145(m1139(applicationInfo.loadIcon(packageManagerM49081))), strM1142);
                                }
                                return null;
                            } catch (Throwable unused2) {
                                return null;
                            }
                        }
                    } else if (strM1142 != null) {
                        return m1146(strM1142);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6004 m1142(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C11969 c11969 = C11969.f38536;
        InterfaceC2386 interfaceC2386Mo20831 = c11969.mo20831(str);
        if (interfaceC2386Mo20831 != null || str.endsWith("/")) {
            return (C6004) interfaceC2386Mo20831;
        }
        return (C6004) c11969.mo20831(str.concat("/"));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b A[RETURN] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m1148(InterfaceC2386 interfaceC2386, int i) {
        SharedPreferences sharedPreferences;
        if (i == 0) {
            return false;
        }
        AbstractC22044 abstractC22044Mo8093 = interfaceC2386.mo8093();
        switch (i) {
            case 1:
                if (interfaceC2386.getSize() > 268435456) {
                    return false;
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 11:
                break;
            case 7:
            case 8:
            case 10:
                return true;
            case 9:
            default:
                return false;
        }
        abstractC22044Mo8093.getClass();
        if (!(abstractC22044Mo8093 instanceof C15593) || (sharedPreferences = ApplicationC17729.f58262) == null || sharedPreferences.getBoolean("external_storage_thumb_enable", true)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m1144(C11983 c11983, C11983 c11984) {
        if (c11983 == c11984) {
            return true;
        }
        return (c11983 == null || c11984 == null || c11983.m30078() != c11984.m30078()) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m1141(InterfaceC2386 interfaceC2386, int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 11:
                C13461 c13461 = C13461.f42854;
                String path = interfaceC2386.getPath();
                long size = interfaceC2386.getSize();
                long time = interfaceC2386.getTime();
                int i2 = C0217.f1419;
                return C15022.m36181(path + size + time).toLowerCase();
            case 7:
                return interfaceC2386.getName();
            case 8:
                return interfaceC2386.getPath();
            case 10:
                if (interfaceC2386 instanceof C6004) {
                    try {
                        C25291 c25291M17452 = ((C6004) interfaceC2386).m17452();
                        Uri uri = c25291M17452 == null ? null : c25291M17452.f81685;
                        if (uri != null) {
                            int i3 = C17085.f55774;
                            if (uri.getAuthority().endsWith(".MTDataFilesProvider")) {
                                return C17085.m40237(uri);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    break;
                }
            case 9:
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C17979 m1146(String str) {
        try {
            PackageInfo packageInfo = C21576.m49081().getPackageInfo(str, 1);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                C11855.m29707(applicationInfo.icon, str);
            }
            return new C17979("png", m1145(m1139(RunnableC21479.m48870(packageInfo))), str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static File m1140(File[] fileArr) {
        if (fileArr == null) {
            return null;
        }
        for (File file : fileArr) {
            if (file.isFile() && file.getName().toLowerCase().endsWith(".apk")) {
                return file;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m1145(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m1139(Drawable drawable) {
        int iM19160 = C6907.m19160(32.0f);
        int iM19161 = C6907.m19160(15.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM19160, iM19160, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rectCopyBounds = drawable.copyBounds();
        drawable.setBounds(iM19161, iM19161, iM19160, iM19160);
        drawable.draw(canvas);
        drawable.setBounds(rectCopyBounds);
        return bitmapCreateBitmap;
    }
}
