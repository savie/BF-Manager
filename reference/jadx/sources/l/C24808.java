package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: l.᩻ۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 316P */
/* JADX INFO: loaded from: classes.dex */
public final class C24808 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C0884 f80274 = new C0884(50);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C7849 f80275 = new C7849();

    /* JADX WARN: Code duplicated, block: B:100:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:114:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0062 A[Catch: all -> 0x01b8, TryCatch #2 {all -> 0x01b8, blocks: (B:12:0x0058, B:14:0x0062, B:15:0x0068, B:17:0x006e), top: B:116:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0068 A[Catch: all -> 0x01b8, TryCatch #2 {all -> 0x01b8, blocks: (B:12:0x0058, B:14:0x0062, B:15:0x0068, B:17:0x006e), top: B:116:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x006e A[Catch: all -> 0x01b8, TRY_LEAVE, TryCatch #2 {all -> 0x01b8, blocks: (B:12:0x0058, B:14:0x0062, B:15:0x0068, B:17:0x006e), top: B:116:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0 A[DONT_INVERT, PHI: r7 r8 r10
      0x00d0: PHI (r7v5 java.lang.String) = 
      (r7v4 java.lang.String)
      (r7v4 java.lang.String)
      (r7v4 java.lang.String)
      (r7v4 java.lang.String)
      (r7v4 java.lang.String)
      (r7v14 java.lang.String)
     binds: [B:23:0x0080, B:25:0x008a, B:35:0x00a0, B:37:0x00a9, B:39:0x00b1, B:47:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r8v4 l.᩷ۨᩴ) = (r8v2 l.᩷ۨᩴ), (r8v2 l.᩷ۨᩴ), (r8v2 l.᩷ۨᩴ), (r8v2 l.᩷ۨᩴ), (r8v2 l.᩷ۨᩴ), (r8v5 l.᩷ۨᩴ) binds: [B:23:0x0080, B:25:0x008a, B:35:0x00a0, B:37:0x00a9, B:39:0x00b1, B:47:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r10v1 android.content.pm.PackageInfo) = 
      (r10v0 android.content.pm.PackageInfo)
      (r10v0 android.content.pm.PackageInfo)
      (r10v0 android.content.pm.PackageInfo)
      (r10v0 android.content.pm.PackageInfo)
      (r10v0 android.content.pm.PackageInfo)
      (r10v6 android.content.pm.PackageInfo)
     binds: [B:23:0x0080, B:25:0x008a, B:35:0x00a0, B:37:0x00a9, B:39:0x00b1, B:47:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2 A[Catch: all -> 0x01b2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01b2, blocks: (B:22:0x007c, B:24:0x0082, B:26:0x008c, B:40:0x00b3, B:42:0x00b9, B:29:0x0091, B:31:0x0095, B:34:0x009e, B:36:0x00a2, B:38:0x00ab, B:51:0x00d2, B:55:0x00db, B:58:0x00ec, B:60:0x00f3, B:63:0x00fd, B:68:0x0126, B:98:0x0193, B:71:0x012e, B:74:0x0138, B:78:0x0145, B:81:0x014e, B:84:0x015d, B:87:0x0165, B:89:0x016e, B:92:0x0175, B:93:0x0185, B:94:0x018a, B:95:0x018b, B:96:0x0190, B:103:0x01ae, B:104:0x01b1, B:62:0x00f9, B:64:0x010e, B:67:0x011b), top: B:113:0x007c, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db A[Catch: all -> 0x01b2, TRY_ENTER, TryCatch #0 {all -> 0x01b2, blocks: (B:22:0x007c, B:24:0x0082, B:26:0x008c, B:40:0x00b3, B:42:0x00b9, B:29:0x0091, B:31:0x0095, B:34:0x009e, B:36:0x00a2, B:38:0x00ab, B:51:0x00d2, B:55:0x00db, B:58:0x00ec, B:60:0x00f3, B:63:0x00fd, B:68:0x0126, B:98:0x0193, B:71:0x012e, B:74:0x0138, B:78:0x0145, B:81:0x014e, B:84:0x015d, B:87:0x0165, B:89:0x016e, B:92:0x0175, B:93:0x0185, B:94:0x018a, B:95:0x018b, B:96:0x0190, B:103:0x01ae, B:104:0x01b1, B:62:0x00f9, B:64:0x010e, B:67:0x011b), top: B:113:0x007c, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:22:0x007c, B:24:0x0082, B:26:0x008c, B:40:0x00b3, B:42:0x00b9, B:29:0x0091, B:31:0x0095, B:34:0x009e, B:36:0x00a2, B:38:0x00ab, B:51:0x00d2, B:55:0x00db, B:58:0x00ec, B:60:0x00f3, B:63:0x00fd, B:68:0x0126, B:98:0x0193, B:71:0x012e, B:74:0x0138, B:78:0x0145, B:81:0x014e, B:84:0x015d, B:87:0x0165, B:89:0x016e, B:92:0x0175, B:93:0x0185, B:94:0x018a, B:95:0x018b, B:96:0x0190, B:103:0x01ae, B:104:0x01b1, B:62:0x00f9, B:64:0x010e, B:67:0x011b), top: B:113:0x007c, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f9 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:22:0x007c, B:24:0x0082, B:26:0x008c, B:40:0x00b3, B:42:0x00b9, B:29:0x0091, B:31:0x0095, B:34:0x009e, B:36:0x00a2, B:38:0x00ab, B:51:0x00d2, B:55:0x00db, B:58:0x00ec, B:60:0x00f3, B:63:0x00fd, B:68:0x0126, B:98:0x0193, B:71:0x012e, B:74:0x0138, B:78:0x0145, B:81:0x014e, B:84:0x015d, B:87:0x0165, B:89:0x016e, B:92:0x0175, B:93:0x0185, B:94:0x018a, B:95:0x018b, B:96:0x0190, B:103:0x01ae, B:104:0x01b1, B:62:0x00f9, B:64:0x010e, B:67:0x011b), top: B:113:0x007c, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x012d A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:71:0x012e A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:22:0x007c, B:24:0x0082, B:26:0x008c, B:40:0x00b3, B:42:0x00b9, B:29:0x0091, B:31:0x0095, B:34:0x009e, B:36:0x00a2, B:38:0x00ab, B:51:0x00d2, B:55:0x00db, B:58:0x00ec, B:60:0x00f3, B:63:0x00fd, B:68:0x0126, B:98:0x0193, B:71:0x012e, B:74:0x0138, B:78:0x0145, B:81:0x014e, B:84:0x015d, B:87:0x0165, B:89:0x016e, B:92:0x0175, B:93:0x0185, B:94:0x018a, B:95:0x018b, B:96:0x0190, B:103:0x01ae, B:104:0x01b1, B:62:0x00f9, B:64:0x010e, B:67:0x011b), top: B:113:0x007c, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0142 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C11381 m55329(AbstractC22044 abstractC22044) {
        PackageManager packageManagerM49081;
        AbstractC22044 abstractC22044M55326;
        AbstractC22044 abstractC22045;
        String strMo4294;
        PackageInfo packageArchiveInfo;
        String str;
        String str2;
        long longVersionCode;
        Drawable defaultActivityIcon;
        Bitmap bitmap;
        int width;
        int iMax;
        Drawable bitmapDrawable;
        C7849 c7849 = f80275;
        C15243.m36590(abstractC22044, "file");
        String str3 = abstractC22044.mo4294() + ":" + abstractC22044.mo4286() + ":" + abstractC22044.mo4285();
        C0884 c0884 = f80274;
        Object objM3588 = c0884.m3588(str3);
        AbstractC22044 abstractC22046 = null;
        if (objM3588 == null) {
            try {
                packageManagerM49081 = C21576.m49081();
                if (abstractC22044.m49870()) {
                    strMo4294 = abstractC22044.mo4278();
                    abstractC22045 = null;
                } else {
                    abstractC22044M55326 = m55326(abstractC22044);
                    if (abstractC22044M55326 == null) {
                        m55328(str3);
                        return null;
                    }
                    try {
                        abstractC22045 = abstractC22044M55326;
                        strMo4294 = abstractC22044M55326.mo4294();
                    } catch (Throwable th) {
                        th = th;
                        abstractC22046 = abstractC22044M55326;
                    }
                }
                try {
                    packageArchiveInfo = packageManagerM49081.getPackageArchiveInfo(strMo4294, 0);
                    if (packageArchiveInfo == null || !C15243.m36589((Object) strMo4294, (Object) abstractC22044.mo4278()) || (!(abstractC22044 instanceof C22965) && ((!(abstractC22044 instanceof C1161) || !C0878.m3576((CharSequence) strMo4294, (CharSequence) "download", true)) && (!(abstractC22044 instanceof C7302) || ((C7302) abstractC22044).m19980() || !C0878.m3585(strMo4294, "/data/"))))) {
                        if (packageArchiveInfo == null) {
                            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
                            C15243.m36586(applicationInfo);
                            applicationInfo.publicSourceDir = strMo4294;
                            applicationInfo.sourceDir = strMo4294;
                            str = applicationInfo.packageName;
                            str2 = packageArchiveInfo.versionName;
                            if (str2 == null) {
                                str2 = "null";
                            }
                            String str4 = str2;
                            if (Build.VERSION.SDK_INT >= 28) {
                                longVersionCode = packageArchiveInfo.getLongVersionCode();
                            } else {
                                longVersionCode = packageArchiveInfo.versionCode;
                            }
                            long j = longVersionCode;
                            long jMo4285 = abstractC22044.mo4285();
                            int i = applicationInfo.targetSdkVersion;
                            int iM55325 = m55325(applicationInfo);
                            String strM55330 = m55330(applicationInfo);
                            c7849.m21371(str);
                            try {
                                C11855.m29707(applicationInfo.icon, str);
                                try {
                                    defaultActivityIcon = applicationInfo.loadIcon(packageManagerM49081);
                                    C15243.m36586(defaultActivityIcon);
                                } catch (Throwable unused) {
                                    defaultActivityIcon = C21576.m49081().getDefaultActivityIcon();
                                    C15243.m36586(defaultActivityIcon);
                                }
                                c7849.m21372(str);
                                if ((defaultActivityIcon instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) defaultActivityIcon).getBitmap()) != null) {
                                    width = bitmap.getWidth();
                                    int height = bitmap.getHeight();
                                    if (width <= 0 && height > 0 && (iMax = Math.max(width, height)) > 512) {
                                        float f = 512.0f / iMax;
                                        float f2 = width * f;
                                        if (Float.isNaN(f2)) {
                                            throw new IllegalArgumentException("Cannot round NaN value.");
                                        }
                                        int iRound = Math.round(f2);
                                        if (iRound < 1) {
                                            iRound = 1;
                                        }
                                        float f3 = height * f;
                                        if (Float.isNaN(f3)) {
                                            throw new IllegalArgumentException("Cannot round NaN value.");
                                        }
                                        int iRound2 = Math.round(f3);
                                        if (iRound2 < 1) {
                                            iRound2 = 1;
                                        }
                                        bitmapDrawable = new BitmapDrawable(C21576.m49055(), Bitmap.createScaledBitmap(bitmap, iRound, iRound2, true));
                                    }
                                    C15243.m36586((Object) str);
                                    C11381 c11381 = new C11381(str, strM55330, str4, j, jMo4285, i, iM55325, defaultActivityIcon, bitmapDrawable, applicationInfo.icon);
                                    c0884.m3589(str3, c11381);
                                    if (abstractC22045 != null) {
                                        abstractC22045.mo4296();
                                    }
                                    return c11381;
                                }
                                bitmapDrawable = defaultActivityIcon;
                                C15243.m36586((Object) str);
                                C11381 c11382 = new C11381(str, strM55330, str4, j, jMo4285, i, iM55325, defaultActivityIcon, bitmapDrawable, applicationInfo.icon);
                                c0884.m3589(str3, c11382);
                                if (abstractC22045 != null) {
                                    abstractC22045.mo4296();
                                }
                                return c11382;
                            } catch (Throwable th2) {
                                c7849.m21372(str);
                                throw th2;
                            }
                        }
                        m55328(str3);
                        if (abstractC22045 != null) {
                            abstractC22045.mo4296();
                        }
                        if (abstractC22046 != null) {
                            abstractC22046.mo4296();
                        }
                        throw th;
                    }
                    AbstractC22044 abstractC22044M55327 = m55326(abstractC22044);
                    if (abstractC22044M55327 != null) {
                        try {
                            strMo4294 = abstractC22044M55327.mo4294();
                            packageArchiveInfo = packageManagerM49081.getPackageArchiveInfo(strMo4294, 0);
                            abstractC22045 = abstractC22044M55327;
                            if (packageArchiveInfo == null) {
                                ApplicationInfo applicationInfo2 = packageArchiveInfo.applicationInfo;
                                C15243.m36586(applicationInfo2);
                                applicationInfo2.publicSourceDir = strMo4294;
                                applicationInfo2.sourceDir = strMo4294;
                                str = applicationInfo2.packageName;
                                str2 = packageArchiveInfo.versionName;
                                if (str2 == null) {
                                    str2 = "null";
                                }
                                String str5 = str2;
                                if (Build.VERSION.SDK_INT >= 28) {
                                    longVersionCode = packageArchiveInfo.getLongVersionCode();
                                } else {
                                    longVersionCode = packageArchiveInfo.versionCode;
                                }
                                long j2 = longVersionCode;
                                long jMo4286 = abstractC22044.mo4285();
                                int i2 = applicationInfo2.targetSdkVersion;
                                int iM55326 = m55325(applicationInfo2);
                                String strM55331 = m55330(applicationInfo2);
                                c7849.m21371(str);
                                C11855.m29707(applicationInfo2.icon, str);
                                defaultActivityIcon = applicationInfo2.loadIcon(packageManagerM49081);
                                C15243.m36586(defaultActivityIcon);
                                c7849.m21372(str);
                                if (defaultActivityIcon instanceof BitmapDrawable) {
                                    width = bitmap.getWidth();
                                    int height2 = bitmap.getHeight();
                                    if (width <= 0) {
                                    }
                                    C15243.m36586((Object) str);
                                    C11381 c11383 = new C11381(str, strM55331, str5, j2, jMo4286, i2, iM55326, defaultActivityIcon, bitmapDrawable, applicationInfo2.icon);
                                    c0884.m3589(str3, c11383);
                                    if (abstractC22045 != null) {
                                        abstractC22045.mo4296();
                                    }
                                    return c11383;
                                }
                                bitmapDrawable = defaultActivityIcon;
                                C15243.m36586((Object) str);
                                C11381 c11384 = new C11381(str, strM55331, str5, j2, jMo4286, i2, iM55326, defaultActivityIcon, bitmapDrawable, applicationInfo2.icon);
                                c0884.m3589(str3, c11384);
                                if (abstractC22045 != null) {
                                    abstractC22045.mo4296();
                                }
                                return c11384;
                            }
                            m55328(str3);
                            if (abstractC22045 != null) {
                                abstractC22045.mo4296();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            abstractC22046 = abstractC22044M55327;
                        }
                        if (abstractC22046 != null) {
                            abstractC22046.mo4296();
                        }
                        throw th;
                    }
                    m55328(str3);
                    if (abstractC22045 != null) {
                        abstractC22045.mo4296();
                        return null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    abstractC22046 = abstractC22045;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } else {
            if (!(objM3588 instanceof Integer)) {
                return (C11381) objM3588;
            }
            Number number = (Number) objM3588;
            if (number.intValue() <= 3) {
                c0884.m3589(str3, Integer.valueOf(number.intValue() + 1));
                packageManagerM49081 = C21576.m49081();
                if (abstractC22044.m49870()) {
                    strMo4294 = abstractC22044.mo4278();
                    abstractC22045 = null;
                } else {
                    abstractC22044M55326 = m55326(abstractC22044);
                    if (abstractC22044M55326 == null) {
                        m55328(str3);
                        return null;
                    }
                    abstractC22045 = abstractC22044M55326;
                    strMo4294 = abstractC22044M55326.mo4294();
                }
                packageArchiveInfo = packageManagerM49081.getPackageArchiveInfo(strMo4294, 0);
                if (packageArchiveInfo == null) {
                    if (packageArchiveInfo == null) {
                        ApplicationInfo applicationInfo3 = packageArchiveInfo.applicationInfo;
                        C15243.m36586(applicationInfo3);
                        applicationInfo3.publicSourceDir = strMo4294;
                        applicationInfo3.sourceDir = strMo4294;
                        str = applicationInfo3.packageName;
                        str2 = packageArchiveInfo.versionName;
                        if (str2 == null) {
                            str2 = "null";
                        }
                        String str6 = str2;
                        if (Build.VERSION.SDK_INT >= 28) {
                            longVersionCode = packageArchiveInfo.getLongVersionCode();
                        } else {
                            longVersionCode = packageArchiveInfo.versionCode;
                        }
                        long j3 = longVersionCode;
                        long jMo4287 = abstractC22044.mo4285();
                        int i3 = applicationInfo3.targetSdkVersion;
                        int iM55327 = m55325(applicationInfo3);
                        String strM55332 = m55330(applicationInfo3);
                        c7849.m21371(str);
                        C11855.m29707(applicationInfo3.icon, str);
                        defaultActivityIcon = applicationInfo3.loadIcon(packageManagerM49081);
                        C15243.m36586(defaultActivityIcon);
                        c7849.m21372(str);
                        if (defaultActivityIcon instanceof BitmapDrawable) {
                            width = bitmap.getWidth();
                            int height3 = bitmap.getHeight();
                            if (width <= 0) {
                            }
                            C15243.m36586((Object) str);
                            C11381 c11385 = new C11381(str, strM55332, str6, j3, jMo4287, i3, iM55327, defaultActivityIcon, bitmapDrawable, applicationInfo3.icon);
                            c0884.m3589(str3, c11385);
                            if (abstractC22045 != null) {
                                abstractC22045.mo4296();
                            }
                            return c11385;
                        }
                        bitmapDrawable = defaultActivityIcon;
                        C15243.m36586((Object) str);
                        C11381 c11386 = new C11381(str, strM55332, str6, j3, jMo4287, i3, iM55327, defaultActivityIcon, bitmapDrawable, applicationInfo3.icon);
                        c0884.m3589(str3, c11386);
                        if (abstractC22045 != null) {
                            abstractC22045.mo4296();
                        }
                        return c11386;
                    }
                    m55328(str3);
                    if (abstractC22045 != null) {
                        abstractC22045.mo4296();
                    }
                    if (abstractC22046 != null) {
                        abstractC22046.mo4296();
                    }
                    throw th;
                }
                if (packageArchiveInfo == null) {
                    ApplicationInfo applicationInfo4 = packageArchiveInfo.applicationInfo;
                    C15243.m36586(applicationInfo4);
                    applicationInfo4.publicSourceDir = strMo4294;
                    applicationInfo4.sourceDir = strMo4294;
                    str = applicationInfo4.packageName;
                    str2 = packageArchiveInfo.versionName;
                    if (str2 == null) {
                        str2 = "null";
                    }
                    String str7 = str2;
                    if (Build.VERSION.SDK_INT >= 28) {
                        longVersionCode = packageArchiveInfo.getLongVersionCode();
                    } else {
                        longVersionCode = packageArchiveInfo.versionCode;
                    }
                    long j4 = longVersionCode;
                    long jMo4288 = abstractC22044.mo4285();
                    int i4 = applicationInfo4.targetSdkVersion;
                    int iM55328 = m55325(applicationInfo4);
                    String strM55333 = m55330(applicationInfo4);
                    c7849.m21371(str);
                    C11855.m29707(applicationInfo4.icon, str);
                    defaultActivityIcon = applicationInfo4.loadIcon(packageManagerM49081);
                    C15243.m36586(defaultActivityIcon);
                    c7849.m21372(str);
                    if (defaultActivityIcon instanceof BitmapDrawable) {
                        width = bitmap.getWidth();
                        int height4 = bitmap.getHeight();
                        if (width <= 0) {
                        }
                        C15243.m36586((Object) str);
                        C11381 c11387 = new C11381(str, strM55333, str7, j4, jMo4288, i4, iM55328, defaultActivityIcon, bitmapDrawable, applicationInfo4.icon);
                        c0884.m3589(str3, c11387);
                        if (abstractC22045 != null) {
                            abstractC22045.mo4296();
                        }
                        return c11387;
                    }
                    bitmapDrawable = defaultActivityIcon;
                    C15243.m36586((Object) str);
                    C11381 c11388 = new C11381(str, strM55333, str7, j4, jMo4288, i4, iM55328, defaultActivityIcon, bitmapDrawable, applicationInfo4.icon);
                    c0884.m3589(str3, c11388);
                    if (abstractC22045 != null) {
                        abstractC22045.mo4296();
                    }
                    return c11388;
                }
                m55328(str3);
                if (abstractC22045 != null) {
                    abstractC22045.mo4296();
                }
                if (abstractC22046 != null) {
                    abstractC22046.mo4296();
                }
                throw th;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final void m55331(AbstractC22044 abstractC22044) {
        C15243.m36590(abstractC22044, "file");
        String str = abstractC22044.mo4294() + ":" + abstractC22044.mo4286() + ":" + abstractC22044.mo4285();
        f80274.m3593(str);
        C17494.m41005(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m55327() {
        C0884 c0884 = f80274;
        Set setEntrySet = c0884.m3590().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (((Map.Entry) obj).getValue() instanceof Integer) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c0884.m3593(((Map.Entry) it.next()).getKey());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55328(String str) {
        int iValueOf;
        C0884 c0884 = f80274;
        Object objM3588 = c0884.m3588(str);
        if (objM3588 instanceof Integer) {
            iValueOf = Integer.valueOf(((Number) objM3588).intValue() + 1);
        } else {
            iValueOf = 1;
        }
        c0884.m3589(str, iValueOf);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m55330(ApplicationInfo applicationInfo) {
        String string;
        CharSequence charSequence = applicationInfo.nonLocalizedLabel;
        if (charSequence != null) {
            return charSequence.toString();
        }
        if (applicationInfo.labelRes != 0) {
            try {
                C22941 c22941 = new C22941(applicationInfo.sourceDir, new C12225(6));
                try {
                    C21246 c21246 = new C21246(0, new C24296(c22941.m51731(c22941.m51724("resources.arsc"), (C3374) null)));
                    int i = applicationInfo.labelRes;
                    if (((i >>> 24) & 255) == 1) {
                        string = C21576.m49055().getString(i);
                    } else {
                        TypedValue typedValue = new TypedValue();
                        c21246.m48425(i, typedValue, true);
                        string = typedValue.coerceToString().toString();
                    }
                    if (string != null) {
                        c22941.close();
                        return string;
                    }
                    C11471 c11471 = C11471.f36082;
                    c22941.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C22463.m50649(c22941, th);
                        throw th2;
                    }
                }
            } catch (Exception unused) {
            }
        }
        String str = applicationInfo.name;
        if (str != null) {
            return str;
        }
        String str2 = applicationInfo.packageName;
        C15243.m36591(str2, "packageName");
        return str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int m55325(ApplicationInfo applicationInfo) {
        if (Build.VERSION.SDK_INT >= 24) {
            return applicationInfo.minSdkVersion;
        }
        try {
            C22941 c22941 = new C22941(applicationInfo.sourceDir);
            try {
                int iM43473 = C18685.m43473(C14955.m35982(c22941.m51731(c22941.m51724("AndroidManifest.xml"), (C3374) null)));
                c22941.close();
                return iM43473;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C22463.m50649(c22941, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m55326(final AbstractC22044 abstractC22044) throws Throwable {
        long j;
        try {
            C13961 c13961M49855 = abstractC22044.m49855("r");
            try {
                long length = c13961M49855.length();
                j = length - 22;
                long jMax = Math.max(0L, length - 65557);
                while (true) {
                    if (j < jMax) {
                        j = -1;
                        break;
                    }
                    c13961M49855.seek(j);
                    if (c13961M49855.readInt() == 101010256) {
                        break;
                    }
                    j--;
                }
                c13961M49855.close();
            } catch (Throwable th) {
                try {
                    c13961M49855.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            j = -1;
        }
        if (j == -1) {
            return null;
        }
        try {
            return (AbstractC22044) C5261.f18538.submit(new Callable() { // from class: l.֫ۙܺ
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    AbstractC22044 abstractC22044M49857 = C6382.f21562.m49857(".apk");
                    AbstractC22044 abstractC22045 = abstractC22044;
                    try {
                        if (abstractC22045.mo4285() > 1048576) {
                            C22941 c22941 = new C22941(abstractC22045);
                            try {
                                C25179 c25179 = new C25179(abstractC22044M49857);
                                try {
                                    c25179.m56130();
                                    C8002 c8002M51724 = c22941.m51724("resources.arsc");
                                    c22941.m51724("AndroidManifest.xml");
                                    HashSet hashSet = new HashSet();
                                    Iterator it = new C24296(c22941.m51731(c8002M51724, (C3374) null)).mo15672().iterator();
                                    while (it.hasNext()) {
                                        for (C1175 c1175 : ((C7887) it.next()).mo19822()) {
                                            String typeName = c1175.getTypeName();
                                            if (typeName != null) {
                                                switch (typeName.hashCode()) {
                                                    case -891985903:
                                                        if (typeName.equals("string")) {
                                                        }
                                                        break;
                                                    case -475309713:
                                                        if (typeName.equals("plurals")) {
                                                        }
                                                        break;
                                                    case 3355:
                                                        if (typeName.equals("id")) {
                                                        }
                                                        break;
                                                    case 3004913:
                                                        if (typeName.equals("attr")) {
                                                        }
                                                        break;
                                                    case 3029738:
                                                        if (typeName.equals("bool")) {
                                                        }
                                                        break;
                                                    case 109780401:
                                                        if (typeName.equals("style")) {
                                                        }
                                                        break;
                                                    case 1958052158:
                                                        if (typeName.equals("integer")) {
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            Iterator it2 = c1175.mo33925().iterator();
                                            while (it2.hasNext()) {
                                                Iterator it3 = ((C12361) it2.next()).mo9078().iterator();
                                                while (it3.hasNext()) {
                                                    for (C9377 c9377 : ((C6396) it3.next()).values()) {
                                                        if (c9377.mo16636()) {
                                                            try {
                                                                String value = c9377.mo11710().getValue();
                                                                C15243.m36591(value, "getValue(...)");
                                                                hashSet.add(value);
                                                            } catch (Exception unused2) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    hashSet.add("AndroidManifest.xml");
                                    hashSet.add("resources.arsc");
                                    Collection collectionM51742 = c22941.m51742();
                                    C15243.m36591(collectionM51742, "getEntries(...)");
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : collectionM51742) {
                                        if (hashSet.contains(((C8002) obj).getName())) {
                                            arrayList.add(obj);
                                        }
                                    }
                                    Iterator it4 = arrayList.iterator();
                                    while (it4.hasNext()) {
                                        c25179.m56126((C8002) it4.next(), c22941);
                                    }
                                    C11471 c11471 = C11471.f36082;
                                    c25179.close();
                                    c22941.close();
                                    return abstractC22044M49857;
                                } catch (Throwable th3) {
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        C22463.m50649(c25179, th3);
                                        throw th4;
                                    }
                                }
                            } catch (Throwable th5) {
                                try {
                                    throw th5;
                                } catch (Throwable th6) {
                                    C22463.m50649(c22941, th5);
                                    throw th6;
                                }
                            }
                        }
                        abstractC22045.m49847(abstractC22044M49857, (C24523) null, (InterfaceC23711) null);
                        return abstractC22044M49857;
                    } catch (Throwable unused3) {
                        return null;
                    }
                }
            }).get();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            C15243.m36586(cause);
            throw cause;
        }
    }
}
