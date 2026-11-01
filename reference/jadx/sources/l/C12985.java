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

/* JADX INFO: renamed from: l.۬۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77BV */
/* JADX INFO: loaded from: classes3.dex */
public final class C12985 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static long f43308;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f43309 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static List f43310;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C3971 f43311 = C3971.f14739;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22157 m32111(InterfaceC2557 interfaceC2557) {
        String str;
        int iMo7926 = f43311.mo7926(interfaceC2557);
        switch (iMo7926) {
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
        if (str == null || !m32116(interfaceC2557, iMo7926)) {
            return null;
        }
        return new C22157(str, m32109(interfaceC2557, iMo7926));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C0989 m32115(String str) {
        String str2;
        ApplicationInfo applicationInfo;
        Bitmap bitmapM15058;
        C6794 c6794M32110 = m32110(str);
        if (c6794M32110 != null) {
            C3971 c3971 = f43311;
            int iMo7926 = c3971.mo7926(c6794M32110);
            switch (iMo7926) {
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
            if (str2 != null && m32116(c6794M32110, iMo7926)) {
                boolean zM32112 = false;
                if ("full".equals(str2)) {
                    C14600 c14600Mo7925 = c3971.mo7925((AbstractC11462) null, c6794M32110, iMo7926);
                    String strM32109 = m32109(c6794M32110, iMo7926);
                    if (iMo7926 == 1 || iMo7926 == 2) {
                        zM32112 = m32112(c14600Mo7925, C0690.f2920.f2943);
                    } else if (iMo7926 == 4) {
                        zM32112 = m32112(c14600Mo7925, C0690.f2907.f2943);
                    } else if (iMo7926 == 5) {
                        zM32112 = m32112(c14600Mo7925, C0690.f2890.f2943);
                    }
                    if (zM32112) {
                        return new C0989("damaged", null, strM32109);
                    }
                    if (!m32112(c14600Mo7925, c6794M32110.mo7972().m48181().f2943)) {
                        return new C0989("png", m32113(c14600Mo7925.m35072()), strM32109);
                    }
                } else {
                    String strM321010 = m32109(c6794M32110, iMo7926);
                    if (iMo7926 != 7) {
                        if (iMo7926 != 8) {
                            if (iMo7926 != 10) {
                                if (iMo7926 == 11 && strM321010 != null && (bitmapM15058 = C5443.m15058(c6794M32110.mo7989())) != null) {
                                    return new C0989("png", m32113(m32107(new BitmapDrawable(C16737.m39279(), bitmapM15058))), strM321010);
                                }
                            } else if (strM321010 != null) {
                                return m32114(strM321010);
                            }
                        } else if (strM321010 != null) {
                            String path = c6794M32110.getPath();
                            File file = new File(path, "base.apk");
                            if (!file.exists()) {
                                File[] fileArrListFiles = new File(path).listFiles();
                                if (fileArrListFiles != null) {
                                    File fileM32108 = m32108(fileArrListFiles);
                                    if (fileM32108 == null) {
                                        for (File file2 : fileArrListFiles) {
                                            File file3 = new File(file2, "base.apk");
                                            if (file2.isDirectory() && file3.exists()) {
                                                fileM32108 = file3;
                                            }
                                        }
                                    }
                                    if (fileM32108 == null) {
                                        for (File file4 : fileArrListFiles) {
                                            if (!file4.isDirectory() || (fileM32108 = m32108(file4.listFiles())) == null) {
                                            }
                                        }
                                    }
                                    file = fileM32108;
                                } else if (Build.VERSION.SDK_INT >= 34) {
                                    long jUptimeMillis = SystemClock.uptimeMillis();
                                    if (f43310 == null || jUptimeMillis - f43308 > 10000) {
                                        try {
                                            f43310 = (List) C9030.stream(C16737.m39292().getInstalledPackages(0)).map(new C11739(2)).filter(new C5223(0)).collect(C1890.toList());
                                        } catch (RuntimeException unused) {
                                            f43310 = Collections.EMPTY_LIST;
                                        }
                                        f43308 = jUptimeMillis;
                                    }
                                    Iterator it = f43310.iterator();
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
                                PackageManager packageManagerM39292 = C16737.m39292();
                                PackageInfo packageArchiveInfo = packageManagerM39292.getPackageArchiveInfo(file.getPath(), 1);
                                if (packageArchiveInfo != null && (applicationInfo = packageArchiveInfo.applicationInfo) != null) {
                                    applicationInfo.publicSourceDir = file.getPath();
                                    applicationInfo.sourceDir = file.getPath();
                                    C17916.m41608(applicationInfo.icon, applicationInfo.packageName);
                                    return new C0989("png", m32113(m32107(applicationInfo.loadIcon(packageManagerM39292))), strM321010);
                                }
                                return null;
                            } catch (Throwable unused2) {
                                return null;
                            }
                        }
                    } else if (strM321010 != null) {
                        return m32114(strM321010);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6794 m32110(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C21611 c21611 = C21611.f70098;
        InterfaceC2557 interfaceC2557Mo10264 = c21611.mo10264(str);
        if (interfaceC2557Mo10264 != null || str.endsWith("/")) {
            return (C6794) interfaceC2557Mo10264;
        }
        return (C6794) c21611.mo10264(str.concat("/"));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b A[RETURN] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m32116(InterfaceC2557 interfaceC2557, int i) {
        SharedPreferences sharedPreferences;
        if (i == 0) {
            return false;
        }
        AbstractC20745 abstractC20745Mo7989 = interfaceC2557.mo7989();
        switch (i) {
            case 1:
                if (interfaceC2557.getSize() > 268435456) {
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
        abstractC20745Mo7989.getClass();
        if (!(abstractC20745Mo7989 instanceof C13357) || (sharedPreferences = ApplicationC0716.f2988) == null || sharedPreferences.getBoolean("external_storage_thumb_enable", true)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m32112(C14600 c14600, C14600 c14601) {
        if (c14600 == c14601) {
            return true;
        }
        return (c14600 == null || c14601 == null || c14600.m35072() != c14601.m35072()) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m32109(InterfaceC2557 interfaceC2557, int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 11:
                C3971 c3971 = C3971.f14739;
                String path = interfaceC2557.getPath();
                long size = interfaceC2557.getSize();
                long time = interfaceC2557.getTime();
                int i2 = C17169.f54735;
                return C22253.m49423(path + size + time).toLowerCase();
            case 7:
                return interfaceC2557.getName();
            case 8:
                return interfaceC2557.getPath();
            case 10:
                if (interfaceC2557 instanceof C6794) {
                    try {
                        C18295 c18295M18396 = ((C6794) interfaceC2557).m18396();
                        Uri uri = c18295M18396 == null ? null : c18295M18396.f58380;
                        if (uri != null) {
                            int i3 = C19001.f61501;
                            if (uri.getAuthority().endsWith(".MTDataFilesProvider")) {
                                return C19001.m43717(uri);
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C0989 m32114(String str) {
        try {
            PackageInfo packageInfo = C16737.m39292().getPackageInfo(str, 1);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                C17916.m41608(applicationInfo.icon, str);
            }
            return new C0989("png", m32113(m32107(RunnableC23541.m51895(packageInfo))), str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static File m32108(File[] fileArr) {
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
    public static byte[] m32113(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m32107(Drawable drawable) {
        int iM33769 = C13932.m33769(32.0f);
        int iM337610 = C13932.m33769(15.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM33769, iM33769, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rectCopyBounds = drawable.copyBounds();
        drawable.setBounds(iM337610, iM337610, iM33769, iM33769);
        drawable.draw(canvas);
        drawable.setBounds(rectCopyBounds);
        return bitmapCreateBitmap;
    }
}
