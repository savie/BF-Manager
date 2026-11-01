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

/* JADX INFO: renamed from: l.ᩴ᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 316P */
/* JADX INFO: loaded from: classes4.dex */
public final class C19016 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C10157 f61528 = new C10157(50);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C12749 f61529 = new C12749();

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
      0x00d0: PHI (r8v4 l.᩷۠ۚ) = (r8v2 l.᩷۠ۚ), (r8v2 l.᩷۠ۚ), (r8v2 l.᩷۠ۚ), (r8v2 l.᩷۠ۚ), (r8v2 l.᩷۠ۚ), (r8v5 l.᩷۠ۚ) binds: [B:23:0x0080, B:25:0x008a, B:35:0x00a0, B:37:0x00a9, B:39:0x00b1, B:47:0x00ca] A[DONT_GENERATE, DONT_INLINE]
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
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C18310 m43738(AbstractC20745 abstractC20745) {
        PackageManager packageManagerM39292;
        AbstractC20745 abstractC20745M43735;
        AbstractC20745 abstractC20746;
        String strMo33986;
        PackageInfo packageArchiveInfo;
        String str;
        String str2;
        long longVersionCode;
        Drawable defaultActivityIcon;
        Bitmap bitmap;
        int width;
        int iMax;
        Drawable bitmapDrawable;
        C12749 c12749 = f61529;
        C13465.m32966(abstractC20745, "file");
        String str3 = abstractC20745.mo33986() + ":" + abstractC20745.mo33991() + ":" + abstractC20745.mo33964();
        C10157 c10157 = f61528;
        Object objM25800 = c10157.m25800(str3);
        AbstractC20745 abstractC20747 = null;
        if (objM25800 == null) {
            try {
                packageManagerM39292 = C16737.m39292();
                if (abstractC20745.m46729()) {
                    strMo33986 = abstractC20745.mo24643();
                    abstractC20746 = null;
                } else {
                    abstractC20745M43735 = m43735(abstractC20745);
                    if (abstractC20745M43735 == null) {
                        m43737(str3);
                        return null;
                    }
                    try {
                        abstractC20746 = abstractC20745M43735;
                        strMo33986 = abstractC20745M43735.mo33986();
                    } catch (Throwable th) {
                        th = th;
                        abstractC20747 = abstractC20745M43735;
                    }
                }
                try {
                    packageArchiveInfo = packageManagerM39292.getPackageArchiveInfo(strMo33986, 0);
                    if (packageArchiveInfo == null || !C13465.m32965((Object) strMo33986, (Object) abstractC20745.mo24643()) || (!(abstractC20745 instanceof C22383) && ((!(abstractC20745 instanceof C15432) || !C12529.m31136((CharSequence) strMo33986, (CharSequence) "download", true)) && (!(abstractC20745 instanceof C14042) || ((C14042) abstractC20745).m33967() || !C12529.m31146(strMo33986, "/data/"))))) {
                        if (packageArchiveInfo == null) {
                            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
                            C13465.m32962(applicationInfo);
                            applicationInfo.publicSourceDir = strMo33986;
                            applicationInfo.sourceDir = strMo33986;
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
                            long jMo33964 = abstractC20745.mo33964();
                            int i = applicationInfo.targetSdkVersion;
                            int iM43734 = m43734(applicationInfo);
                            String strM43739 = m43739(applicationInfo);
                            c12749.m31688(str);
                            try {
                                C17916.m41608(applicationInfo.icon, str);
                                try {
                                    defaultActivityIcon = applicationInfo.loadIcon(packageManagerM39292);
                                    C13465.m32962(defaultActivityIcon);
                                } catch (Throwable unused) {
                                    defaultActivityIcon = C16737.m39292().getDefaultActivityIcon();
                                    C13465.m32962(defaultActivityIcon);
                                }
                                c12749.m31689(str);
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
                                        bitmapDrawable = new BitmapDrawable(C16737.m39279(), Bitmap.createScaledBitmap(bitmap, iRound, iRound2, true));
                                    }
                                    C13465.m32962((Object) str);
                                    C18310 c18310 = new C18310(str, strM43739, str4, j, jMo33964, i, iM43734, defaultActivityIcon, bitmapDrawable, applicationInfo.icon);
                                    c10157.m25801(str3, c18310);
                                    if (abstractC20746 != null) {
                                        abstractC20746.mo24647();
                                    }
                                    return c18310;
                                }
                                bitmapDrawable = defaultActivityIcon;
                                C13465.m32962((Object) str);
                                C18310 c18311 = new C18310(str, strM43739, str4, j, jMo33964, i, iM43734, defaultActivityIcon, bitmapDrawable, applicationInfo.icon);
                                c10157.m25801(str3, c18311);
                                if (abstractC20746 != null) {
                                    abstractC20746.mo24647();
                                }
                                return c18311;
                            } catch (Throwable th2) {
                                c12749.m31689(str);
                                throw th2;
                            }
                        }
                        m43737(str3);
                        if (abstractC20746 != null) {
                            abstractC20746.mo24647();
                        }
                        if (abstractC20747 != null) {
                            abstractC20747.mo24647();
                        }
                        throw th;
                    }
                    AbstractC20745 abstractC20745M43736 = m43735(abstractC20745);
                    if (abstractC20745M43736 != null) {
                        try {
                            strMo33986 = abstractC20745M43736.mo33986();
                            packageArchiveInfo = packageManagerM39292.getPackageArchiveInfo(strMo33986, 0);
                            abstractC20746 = abstractC20745M43736;
                            if (packageArchiveInfo == null) {
                                ApplicationInfo applicationInfo2 = packageArchiveInfo.applicationInfo;
                                C13465.m32962(applicationInfo2);
                                applicationInfo2.publicSourceDir = strMo33986;
                                applicationInfo2.sourceDir = strMo33986;
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
                                long jMo33965 = abstractC20745.mo33964();
                                int i2 = applicationInfo2.targetSdkVersion;
                                int iM43735 = m43734(applicationInfo2);
                                String strM437310 = m43739(applicationInfo2);
                                c12749.m31688(str);
                                C17916.m41608(applicationInfo2.icon, str);
                                defaultActivityIcon = applicationInfo2.loadIcon(packageManagerM39292);
                                C13465.m32962(defaultActivityIcon);
                                c12749.m31689(str);
                                if (defaultActivityIcon instanceof BitmapDrawable) {
                                    width = bitmap.getWidth();
                                    int height2 = bitmap.getHeight();
                                    if (width <= 0) {
                                    }
                                    C13465.m32962((Object) str);
                                    C18310 c18312 = new C18310(str, strM437310, str5, j2, jMo33965, i2, iM43735, defaultActivityIcon, bitmapDrawable, applicationInfo2.icon);
                                    c10157.m25801(str3, c18312);
                                    if (abstractC20746 != null) {
                                        abstractC20746.mo24647();
                                    }
                                    return c18312;
                                }
                                bitmapDrawable = defaultActivityIcon;
                                C13465.m32962((Object) str);
                                C18310 c18313 = new C18310(str, strM437310, str5, j2, jMo33965, i2, iM43735, defaultActivityIcon, bitmapDrawable, applicationInfo2.icon);
                                c10157.m25801(str3, c18313);
                                if (abstractC20746 != null) {
                                    abstractC20746.mo24647();
                                }
                                return c18313;
                            }
                            m43737(str3);
                            if (abstractC20746 != null) {
                                abstractC20746.mo24647();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            abstractC20747 = abstractC20745M43736;
                        }
                        if (abstractC20747 != null) {
                            abstractC20747.mo24647();
                        }
                        throw th;
                    }
                    m43737(str3);
                    if (abstractC20746 != null) {
                        abstractC20746.mo24647();
                        return null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    abstractC20747 = abstractC20746;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } else {
            if (!(objM25800 instanceof Integer)) {
                return (C18310) objM25800;
            }
            Number number = (Number) objM25800;
            if (number.intValue() <= 3) {
                c10157.m25801(str3, Integer.valueOf(number.intValue() + 1));
                packageManagerM39292 = C16737.m39292();
                if (abstractC20745.m46729()) {
                    strMo33986 = abstractC20745.mo24643();
                    abstractC20746 = null;
                } else {
                    abstractC20745M43735 = m43735(abstractC20745);
                    if (abstractC20745M43735 == null) {
                        m43737(str3);
                        return null;
                    }
                    abstractC20746 = abstractC20745M43735;
                    strMo33986 = abstractC20745M43735.mo33986();
                }
                packageArchiveInfo = packageManagerM39292.getPackageArchiveInfo(strMo33986, 0);
                if (packageArchiveInfo == null) {
                    if (packageArchiveInfo == null) {
                        ApplicationInfo applicationInfo3 = packageArchiveInfo.applicationInfo;
                        C13465.m32962(applicationInfo3);
                        applicationInfo3.publicSourceDir = strMo33986;
                        applicationInfo3.sourceDir = strMo33986;
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
                        long jMo33966 = abstractC20745.mo33964();
                        int i3 = applicationInfo3.targetSdkVersion;
                        int iM43736 = m43734(applicationInfo3);
                        String strM437311 = m43739(applicationInfo3);
                        c12749.m31688(str);
                        C17916.m41608(applicationInfo3.icon, str);
                        defaultActivityIcon = applicationInfo3.loadIcon(packageManagerM39292);
                        C13465.m32962(defaultActivityIcon);
                        c12749.m31689(str);
                        if (defaultActivityIcon instanceof BitmapDrawable) {
                            width = bitmap.getWidth();
                            int height3 = bitmap.getHeight();
                            if (width <= 0) {
                            }
                            C13465.m32962((Object) str);
                            C18310 c18314 = new C18310(str, strM437311, str6, j3, jMo33966, i3, iM43736, defaultActivityIcon, bitmapDrawable, applicationInfo3.icon);
                            c10157.m25801(str3, c18314);
                            if (abstractC20746 != null) {
                                abstractC20746.mo24647();
                            }
                            return c18314;
                        }
                        bitmapDrawable = defaultActivityIcon;
                        C13465.m32962((Object) str);
                        C18310 c18315 = new C18310(str, strM437311, str6, j3, jMo33966, i3, iM43736, defaultActivityIcon, bitmapDrawable, applicationInfo3.icon);
                        c10157.m25801(str3, c18315);
                        if (abstractC20746 != null) {
                            abstractC20746.mo24647();
                        }
                        return c18315;
                    }
                    m43737(str3);
                    if (abstractC20746 != null) {
                        abstractC20746.mo24647();
                    }
                    if (abstractC20747 != null) {
                        abstractC20747.mo24647();
                    }
                    throw th;
                }
                if (packageArchiveInfo == null) {
                    ApplicationInfo applicationInfo4 = packageArchiveInfo.applicationInfo;
                    C13465.m32962(applicationInfo4);
                    applicationInfo4.publicSourceDir = strMo33986;
                    applicationInfo4.sourceDir = strMo33986;
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
                    long jMo33967 = abstractC20745.mo33964();
                    int i4 = applicationInfo4.targetSdkVersion;
                    int iM43737 = m43734(applicationInfo4);
                    String strM437312 = m43739(applicationInfo4);
                    c12749.m31688(str);
                    C17916.m41608(applicationInfo4.icon, str);
                    defaultActivityIcon = applicationInfo4.loadIcon(packageManagerM39292);
                    C13465.m32962(defaultActivityIcon);
                    c12749.m31689(str);
                    if (defaultActivityIcon instanceof BitmapDrawable) {
                        width = bitmap.getWidth();
                        int height4 = bitmap.getHeight();
                        if (width <= 0) {
                        }
                        C13465.m32962((Object) str);
                        C18310 c18316 = new C18310(str, strM437312, str7, j4, jMo33967, i4, iM43737, defaultActivityIcon, bitmapDrawable, applicationInfo4.icon);
                        c10157.m25801(str3, c18316);
                        if (abstractC20746 != null) {
                            abstractC20746.mo24647();
                        }
                        return c18316;
                    }
                    bitmapDrawable = defaultActivityIcon;
                    C13465.m32962((Object) str);
                    C18310 c18317 = new C18310(str, strM437312, str7, j4, jMo33967, i4, iM43737, defaultActivityIcon, bitmapDrawable, applicationInfo4.icon);
                    c10157.m25801(str3, c18317);
                    if (abstractC20746 != null) {
                        abstractC20746.mo24647();
                    }
                    return c18317;
                }
                m43737(str3);
                if (abstractC20746 != null) {
                    abstractC20746.mo24647();
                }
                if (abstractC20747 != null) {
                    abstractC20747.mo24647();
                }
                throw th;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final void m43740(AbstractC20745 abstractC20745) {
        C13465.m32966(abstractC20745, "file");
        String str = abstractC20745.mo33986() + ":" + abstractC20745.mo33991() + ":" + abstractC20745.mo33964();
        f61528.m25804(str);
        C7282.m19421(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m43736() {
        C10157 c10157 = f61528;
        Set setEntrySet = c10157.m25802().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (((Map.Entry) obj).getValue() instanceof Integer) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c10157.m25804(((Map.Entry) it.next()).getKey());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43737(String str) {
        int iValueOf;
        C10157 c10157 = f61528;
        Object objM25800 = c10157.m25800(str);
        if (objM25800 instanceof Integer) {
            iValueOf = Integer.valueOf(((Number) objM25800).intValue() + 1);
        } else {
            iValueOf = 1;
        }
        c10157.m25801(str, iValueOf);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m43739(ApplicationInfo applicationInfo) {
        String string;
        CharSequence charSequence = applicationInfo.nonLocalizedLabel;
        if (charSequence != null) {
            return charSequence.toString();
        }
        if (applicationInfo.labelRes != 0) {
            try {
                C2455 c2455 = new C2455(applicationInfo.sourceDir, new C15489(0));
                try {
                    C6037 c6037 = new C6037(0, new C1493(c2455.m7475(c2455.m7470("resources.arsc"), (C8516) null)));
                    int i = applicationInfo.labelRes;
                    if (((i >>> 24) & 255) == 1) {
                        string = C16737.m39279().getString(i);
                    } else {
                        TypedValue typedValue = new TypedValue();
                        c6037.m16370(i, typedValue, true);
                        string = typedValue.coerceToString().toString();
                    }
                    if (string != null) {
                        c2455.close();
                        return string;
                    }
                    C7321 c7321 = C7321.f24318;
                    c2455.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C3335.m9932(c2455, th);
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
        C13465.m32967(str2, "packageName");
        return str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int m43734(ApplicationInfo applicationInfo) {
        if (Build.VERSION.SDK_INT >= 24) {
            return applicationInfo.minSdkVersion;
        }
        try {
            C2455 c2455 = new C2455(applicationInfo.sourceDir);
            try {
                int iM45745 = C20240.m45745(C20945.m47103(c2455.m7475(c2455.m7470("AndroidManifest.xml"), (C8516) null)));
                c2455.close();
                return iM45745;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C3335.m9932(c2455, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m43735(final AbstractC20745 abstractC20745) throws Throwable {
        long j;
        try {
            C1388 c1388M46710 = abstractC20745.m46710("r");
            try {
                long length = c1388M46710.length();
                j = length - 22;
                long jMax = Math.max(0L, length - 65557);
                while (true) {
                    if (j < jMax) {
                        j = -1;
                        break;
                    }
                    c1388M46710.seek(j);
                    if (c1388M46710.readInt() == 101010256) {
                        break;
                    }
                    j--;
                }
                c1388M46710.close();
            } catch (Throwable th) {
                try {
                    c1388M46710.close();
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
            return (AbstractC20745) C4716.f16635.submit(new Callable() { // from class: l.᩸᩷᩺
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    AbstractC20745 abstractC20745M46688 = C11904.f39937.m46688(".apk");
                    AbstractC20745 abstractC20746 = abstractC20745;
                    try {
                        if (abstractC20746.mo33964() > 1048576) {
                            C2455 c2455 = new C2455(abstractC20746);
                            try {
                                C22918 c22918 = new C22918(abstractC20745M46688);
                                try {
                                    c22918.m50718();
                                    C12107 c12107M7470 = c2455.m7470("resources.arsc");
                                    c2455.m7470("AndroidManifest.xml");
                                    HashSet hashSet = new HashSet();
                                    Iterator it = new C1493(c2455.m7475(c12107M7470, (C8516) null)).mo17615().iterator();
                                    while (it.hasNext()) {
                                        for (C1138 c1138 : ((C2549) it.next()).mo19112()) {
                                            String typeName = c1138.getTypeName();
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
                                            Iterator it2 = c1138.mo25271().iterator();
                                            while (it2.hasNext()) {
                                                Iterator it3 = ((C23367) it2.next()).mo31746().iterator();
                                                while (it3.hasNext()) {
                                                    for (C13134 c13134 : ((C14195) it3.next()).values()) {
                                                        if (c13134.mo25185()) {
                                                            try {
                                                                String value = c13134.mo25187().getValue();
                                                                C13465.m32967(value, "getValue(...)");
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
                                    Collection collectionM7466 = c2455.m7466();
                                    C13465.m32967(collectionM7466, "getEntries(...)");
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : collectionM7466) {
                                        if (hashSet.contains(((C12107) obj).getName())) {
                                            arrayList.add(obj);
                                        }
                                    }
                                    Iterator it4 = arrayList.iterator();
                                    while (it4.hasNext()) {
                                        c22918.m50728((C12107) it4.next(), c2455);
                                    }
                                    C7321 c7321 = C7321.f24318;
                                    c22918.close();
                                    c2455.close();
                                    return abstractC20745M46688;
                                } catch (Throwable th3) {
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        C3335.m9932(c22918, th3);
                                        throw th4;
                                    }
                                }
                            } catch (Throwable th5) {
                                try {
                                    throw th5;
                                } catch (Throwable th6) {
                                    C3335.m9932(c2455, th5);
                                    throw th6;
                                }
                            }
                        }
                        abstractC20746.m46701(abstractC20745M46688, (C5222) null, (InterfaceC8978) null);
                        return abstractC20745M46688;
                    } catch (Throwable unused3) {
                        return null;
                    }
                }
            }).get();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            C13465.m32962(cause);
            throw cause;
        }
    }
}
