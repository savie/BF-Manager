package l;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import bin.mt.json.JSONObject;
import bin.mt.plus.Main;
import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B13Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C21512 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static long f69887;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static long f69889;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public List f69890;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5990 f69891;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f69892;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C0690 f69893;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C6695 f69894;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final HashMap f69888 = new HashMap();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final HashMap f69883 = new HashMap();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final HashMap f69886 = new HashMap();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C14690 f69884 = C14690.m35219("\\.(?:00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C14690 f69885 = C14690.m35219("\\.z(?:0[1-9]|[1-9][0-9]+)");

    static {
        m48164(".xml", 1, "text/xml");
        m48164(".kml", 1, "text/kml");
        m48164(".dex", 3, "application/octet-stream");
        m48164(".arsc", 2, "application/octet-stream");
        m48164(".mtp", 8, "application/mt-plugin");
        m48164(".apk", 4, "application/vnd.android.package-archive");
        m48164(".apk.1", 4, "application/vnd.android.package-archive");
        m48164(".apex", 4, "application/vnd.android.package-archive");
        m48164(".bks", 7, "application/bks");
        m48164(".jks", 7, "application/jks");
        m48164(".keystore", 7, "application/jks");
        m48164(".apks", 5, "application/vnd.android.package-archives");
        m48164(".xapk", 5, "application/vnd.android.package-archives");
        m48164(".apkm", 5, "application/vnd.android.package-archives");
        m48164(".sh", 12, "application/x-sh");
        m48164(".rc", 12, "application/x-rc");
        m48164(".zip", 6, "application/zip");
        m48164(".aab", 6, "application/zip");
        m48164(".mtz", 6, "application/zip");
        m48164(".hwt", 6, "application/zip");
        m48164(".bds", 6, "application/zip");
        m48164(".jar", 16, "application/x-jar", "application/java-archive", "application/x-java-archive");
        m48164(".ttf", 13, "application/x-font-ttf");
        m48164(".ttc", 13, "application/x-font-ttc");
        m48164(".otf", 13, "application/x-font-otf");
        m48164(".woff", 13, "application/x-font-woff");
        m48164(".plist", 1, "text/plist");
        m48164(".class", 17, "application/octet-stream");
        m48164(".mtcr", 18, "application/octet-stream");
        m48164(".iml", 9, "text/xml");
        m48164(".mtd", 9, "text/plain");
        m48164(".mtl", 9, "text/plain");
        m48164(".mtsx", 9, "text/plain");
        m48164(".m3u", 9, "text/plain");
        m48164(".mf", 9, "text/plain");
        m48164(".md", 9, "text/plain");
        m48164(".sf", 9, "text/plain");
        m48164(".txt", 9, "text/plain");
        m48164(".log", 9, "text/plain");
        m48164(".css", 9, "text/plain");
        m48164(".cfg", 9, "text/plain");
        m48164(".ini", 9, "text/plain");
        m48164(".conf", 9, "text/plain");
        m48164(".prop", 9, "text/plain");
        m48164(".json", 9, "text/plain");
        m48164(".properties", 9, "text/plain");
        C0690 c0690 = C0690.f2918;
        m48163(".htm", 21, c0690, "text/html");
        m48163(".html", 21, c0690, "text/html");
        m48163(".xhtml", 21, c0690, "application/xhtml+xml");
        m48163(".shtml", 21, c0690, "text/html");
        m48163(".mhtml", 21, c0690, "multipart/related");
        m48163(".mht", 21, c0690, "multipart/related");
        C0690 c0691 = C0690.f2929;
        m48163(".c", 9, c0691, "text/plain");
        m48163(".h", 9, c0691, "text/plain");
        m48163(".js", 9, c0691, "text/plain");
        m48163(".py", 9, C0690.f2915, "text/plain");
        m48163(".cc", 9, c0691, "text/plain");
        m48163(".go", 9, c0691, "text/plain");
        m48163(".kt", 9, C0690.f2876, "text/plain");
        m48163(".bat", 9, c0691, "text/plain");
        m48163(".php", 9, C0690.f2883, "text/plain");
        m48163(".cpp", 9, c0691, "text/plain");
        m48163(".hpp", 9, c0691, "text/plain");
        m48163(".lua", 9, C0690.f2884, "text/plain");
        m48163(".java", 9, C0690.f2902, "text/plain");
        m48163(".smali", 9, c0691, "text/plain");
        m48163(".yml", 9, c0691, "text/plain");
        m48163(".yaml", 9, c0691, "text/plain");
        m48163(".rs", 9, c0691, "text/plain");
        C0690 c0692 = C0690.f2895;
        m48163(".zshrc", 9, c0692, "text/plain");
        m48163(".bashrc", 9, c0692, "text/plain");
        m48163(".bash_history", 9, c0691, "text/plain");
        C0690 c0693 = C0690.f2903;
        m48163(".csv", 9, c0693, "text/csv");
        C0690 c0694 = C0690.f2917;
        m48163(".ass", 9, c0694, "text/x-ssa");
        m48163(".ssa", 9, c0694, "text/x-ssa");
        m48163(".srt", 9, c0694, "application/x-subrip");
        m48163(".vtt", 9, c0694, "text/vtt");
        m48163(".ttml", 9, c0694, "application/ttml+xml");
        m48164(".jpeg", 10, "image/jpeg");
        m48164(".jpg", 10, "image/jpeg");
        m48164(".bmp", 10, "image/bmp");
        m48164(".gif", 10, "image/gif");
        m48164(".ico", 10, "image/x-icon");
        m48164(".png", 10, "image/png");
        m48164(".webp", 10, "image/webp");
        m48164(".heic", 10, "image/heic");
        m48164(".heif", 10, "image/heif");
        m48164(".svg", 15, "image/svg+xml");
        m48164(".9.png", 10, "image/png");
        m48164(".tga", 10, "image/tga");
        m48164(".m4a", 11, "audio/mp4a-latm");
        m48164(".m4b", 11, "audio/mp4a-latm");
        m48164(".m4p", 11, "audio/mp4a-latm");
        m48164(".mp2", 11, "audio/x-mpeg");
        m48164(".mp3", 11, "audio/x-mpeg");
        m48164(".mpga", 11, "audio/mpeg");
        m48164(".ogg", 11, "audio/ogg");
        m48164(".wav", 11, "audio/x-wav");
        m48164(".wma", 11, "audio/x-ms-wma");
        m48164(".flac", 11, "audio/*");
        m48164(".amr", 11, "audio/amr");
        m48164(".mid", 11, "audio/midi");
        m48164(".midi", 11, "audio/midi");
        m48164(".oga", 11, "audio/ogg");
        m48164(".aac", 11, "audio/aac");
        m48164(".rpm", 11, "audio/vnd.rn-realaudio");
        m48164(".weba", 11, "audio/webm");
        m48164(".3gp", 20, "video/3gpp");
        m48164(".asf", 20, "video/x-ms-asf");
        m48164(".avi", 20, "video/x-msvideo");
        m48164(".mp4", 20, "video/mp4");
        m48164(".mpe", 20, "video/mpeg");
        m48164(".mpeg", 20, "video/mpeg");
        m48164(".mpg", 20, "video/mpeg");
        m48164(".mpg4", 20, "video/mp4");
        m48164(".m4u", 20, "video/vnd.mpegurl");
        m48164(".m3u8", 20, "video/vnd.mpegurl", "application/x-mpegurl", "application/vnd.apple.mpegurl");
        m48164(".m4v", 20, "video/x-m4v");
        m48164(".mov", 20, "video/quicktime");
        m48164(".rmvb", 20, "video/vnd.rn-realvideo");
        m48164(".wmv", 20, "video/x-ms-wmv");
        m48164(".3gpp", 20, "video/3gpp");
        m48164(".flv", 20, "video/x-flv");
        m48164(".ogv", 20, "video/ogg");
        m48164(".mkv", 20, "video/x-matroska");
        m48164(".dv", 20, "video/x-dv");
        m48164(".webm", 20, "video/webm");
        m48164(".7z", 6, "application/x-7z-compressed");
        m48164(".deb", 6, "application/vnd.debian.binary-package");
        m48164(".arj", 6, "application/arj");
        m48164(".cab", 6, "application/vnd.ms-cab-compressed");
        m48164(".chm", 6, "application/vnd.ms-htmlhelp");
        m48164(".cpio", 6, "application/x-cpio", "application/cpio");
        m48164(".iso", 6, "application/iso");
        m48164(".lzh", 6, "application/lzh");
        m48164(".lzma", 6, "application/lzma");
        m48164(".rar", 6, "application/x-rar-compressed");
        m48164(".wim", 6, "application/wim");
        m48164(".xar", 6, "application/xar");
        m48164(".ntfs", 6, "application/ntfs");
        m48164(".udf", 6, "application/udf");
        m48164(".z", 6, "application/z");
        m48164(".zl", 6, "application/zlib");
        m48164(".zli", 6, "application/zlib");
        m48164(".zlib", 6, "application/zlib");
        m48164(".tar", 6, "application/x-tar", "application/tar");
        m48164(".gz", 6, "application/x-gzip", "application/gzip");
        m48164(".tar.gz", 6, "application/x-gzip", "application/gzip");
        m48164(".tgz", 6, "application/x-gzip", "application/gzip");
        m48164(".taz", 6, "application/x-gzip", "application/gzip");
        m48164(".xz", 6, "application/x-xz", "application/xz");
        m48164(".tar.xz", 6, "application/x-xz", "application/xz");
        m48164(".txz", 6, "application/x-xz", "application/xz");
        m48164(".zst", 6, "application/zstd");
        m48164(".zstd", 6, "application/zstd");
        m48164(".tar.zst", 6, "application/zstd");
        m48164(".tar.zstd", 6, "application/zstd");
        m48164(".bz2", 6, "application/x-bzip2", "application/bzip2");
        m48164(".tar.bz2", 6, "application/x-bzip2", "application/bzip2");
        m48164(".tbz2", 6, "application/x-bzip2", "application/bzip2");
        m48164(".tbz", 6, "application/x-bzip2", "application/bzip2");
        m48164(".lz4", 6, "application/x-lz4", "application/lz4");
        m48164(".tar.lz4", 6, "application/x-lz4", "application/lz4");
        m48165(".pdf", C0690.f2909, "application/pdf");
        C0690 c0695 = C0690.f2891;
        m48165(".ppt", c0695, "application/vnd.ms-powerpoint");
        m48165(".xls", c0693, "application/vnd.ms-excel");
        m48165(".doc", c0694, "application/msword");
        m48165(".pptx", c0695, "application/vnd.ms-powerpoint");
        m48165(".xlsx", c0693, "application/vnd.ms-excel");
        m48165(".docx", c0694, "application/msword");
        C0690 c0696 = C0690.f2934;
        m48165(".odex", c0696, "application/oat");
        m48165(".oat", c0696, "application/oat");
        m48165(".torrent", C0690.f2896, "application/x-bittorrent");
        m48164(".ts-movie", 20, "video/MP2T");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m48172(String str) {
        return (String) m48160(str, true).f69890.get(0);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21512 m48160(String str, boolean z) {
        String lowerCase = str.toLowerCase();
        String strM46686 = AbstractC20745.m46686(lowerCase);
        if (strM46686.isEmpty()) {
            return new C21512("", null, null, "*/*");
        }
        if (System.currentTimeMillis() - f69889 > 10000) {
            long jMo33991 = C11904.m29695().m46690("openMethod").mo33991();
            if (jMo33991 != f69887) {
                m48170();
                f69887 = jMo33991;
            }
            f69889 = System.currentTimeMillis();
        }
        char cM9601 = C3184.m9601(1, strM46686);
        if ('0' <= cM9601 && cM9601 <= '9') {
            if (f69884.matcher((CharSequence) strM46686).matches()) {
                if (lowerCase.endsWith(".7z".concat(strM46686))) {
                    strM46686 = ".7z";
                } else if (lowerCase.endsWith(".zip".concat(strM46686))) {
                    strM46686 = ".zip";
                }
            } else if (f69885.matcher((CharSequence) strM46686).matches()) {
                strM46686 = ".zip";
            }
        }
        C21512 c21512 = z ? (C21512) f69883.get(strM46686) : null;
        if (c21512 == null) {
            c21512 = (C21512) f69886.get(strM46686);
        }
        if (c21512 == null) {
            c21512 = (C21512) f69888.get(strM46686);
        }
        if (c21512 == null) {
            return new C21512(strM46686, strM46686.equals(".img") ? C0690.f2928 : null, null, "*/*");
        }
        return c21512;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48169(boolean z) {
        Main mainM47527;
        C6936 c6936M125;
        C21445 c21445 = new C21445();
        Iterator it = C6508.m17711().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C20889) it.next()).m46965().iterator();
            while (it2.hasNext()) {
                String lowerCase = ((String) it2.next()).toLowerCase();
                if (!f69888.containsKey(lowerCase) && !c21445.containsKey(lowerCase)) {
                    c21445.put(lowerCase, new C21512(lowerCase, C6695.m18078(9)));
                }
            }
        }
        HashMap map = f69886;
        map.clear();
        map.putAll(c21445);
        if (!z || (mainM47527 = C21094.m47527()) == null || (c6936M125 = mainM47527.m125()) == null) {
            return;
        }
        C16737.m39273(new RunnableC3787(2, c6936M125.m18646()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48166(String str, C6695 c6695) {
        String lowerCase = str.toLowerCase();
        C21512 c21512 = new C21512(lowerCase, c6695);
        c21512.m48174();
        f69883.put(lowerCase, c21512);
        m48175();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48167(String str, InterfaceC23898 interfaceC23898) {
        String lowerCase = str.toLowerCase();
        C21512 c21512 = new C21512(lowerCase, new C5990(interfaceC23898.mo16277(), interfaceC23898.mo16278(), interfaceC23898.mo16276()));
        c21512.m48174();
        f69883.put(lowerCase, c21512);
        m48175();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48168(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C21512 c21512 = (C21512) it.next();
            c21512.m48174();
            f69883.put(c21512.f69892, c21512);
        }
        m48175();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m48173(ArrayList arrayList) {
        HashMap map = f69883;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            m48171(((C21512) it.next()).f69892).mo24647();
        }
        map.clear();
        m48168(arrayList);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m48155(String str) {
        String lowerCase = str.toLowerCase();
        m48171(lowerCase).mo24647();
        f69883.remove(lowerCase);
        m48175();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static ArrayList m48156() {
        m48170();
        ArrayList arrayList = new ArrayList(f69883.values());
        Collections.sort(arrayList, C7618.comparing(new C22924(0)));
        return arrayList;
    }

    public C21512(String str, C0690 c0690, C6695 c6695, String... strArr) {
        this.f69892 = str;
        this.f69893 = c0690;
        this.f69894 = c6695;
        this.f69890 = Arrays.asList(strArr);
    }

    public C21512(String str, C6695 c6695) {
        String str2;
        this.f69892 = str;
        C21512 c21512 = (C21512) f69888.get(str);
        if (c21512 != null) {
            this.f69890 = c21512.f69890;
            if (c6695 == c21512.f69894) {
                this.f69893 = c21512.f69893;
            }
        } else {
            int i = c6695.f22574;
            switch (i) {
                case 1:
                    str2 = "text/xml";
                    break;
                case 2:
                case 3:
                case 8:
                case 13:
                case 14:
                case 17:
                case 18:
                    str2 = "application/octet-stream";
                    break;
                case 4:
                    str2 = "application/vnd.android.package-archive";
                    break;
                case 5:
                    str2 = "application/vnd.android.package-archives";
                    break;
                case 6:
                    str2 = "application/zip";
                    break;
                case 7:
                    str2 = "application/jks";
                    break;
                case 9:
                case 12:
                    str2 = "text/plain";
                    break;
                case 10:
                    str2 = "image/*";
                    break;
                case 11:
                    str2 = "audio/*";
                    break;
                case 15:
                    str2 = "image/svg+xml";
                    break;
                case 16:
                    str2 = "application/x-jar";
                    break;
                case 19:
                    str2 = "image/png";
                    break;
                case 20:
                    str2 = "video/*";
                    break;
                case 21:
                    str2 = "text/html";
                    break;
                default:
                    throw new RuntimeException(C8479.m22141(i, "Unknown built-in function type: "));
            }
            this.f69890 = Collections.singletonList(str2);
        }
        this.f69894 = c6695;
    }

    public C21512(String str, C5990 c5990) {
        this.f69892 = str;
        C21512 c21512 = (C21512) f69888.get(str);
        if (c21512 != null) {
            this.f69890 = c21512.f69890;
            this.f69893 = c21512.m48181();
        } else {
            this.f69890 = Collections.singletonList("*/*");
        }
        this.f69891 = c5990;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m48176() {
        return this.f69892;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m48185() {
        return (String) this.f69890.get(0);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C6695 m48177() {
        return this.f69894;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m48184() {
        C6695 c6695 = this.f69894;
        return c6695 != null && c6695.f22574 == 5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48180(int... iArr) {
        C6695 c6695 = this.f69894;
        if (c6695 != null) {
            int i = c6695.f22574;
            if (i == 6) {
                return true;
            }
            for (int i2 : iArr) {
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5990 m48182() {
        return this.f69891;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C0690 m48181() {
        C0690 c0690 = this.f69893;
        if (c0690 != null) {
            return c0690;
        }
        C6695 c6695 = this.f69894;
        if (c6695 != null) {
            return c6695.m18079();
        }
        return C0690.f2896;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48178(C11545 c11545, InterfaceC2557 interfaceC2557) {
        C6695 c6695 = this.f69894;
        if (c6695 != null) {
            c6695.m18080(c11545, interfaceC2557);
        } else {
            this.f69891.m16275(c11545, interfaceC2557);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48179() {
        if (this.f69894 != null) {
            return true;
        }
        C5990 c5990 = this.f69891;
        if (c5990 != null) {
            try {
                ComponentName componentNameMo16277 = c5990.mo16277();
                String packageName = componentNameMo16277.getPackageName();
                String strM48157 = m48157(componentNameMo16277.getClassName(), packageName);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(packageName);
                AbstractC20745 abstractC20745M46690 = C11904.f39934.m46690("test" + this.f69892);
                PackageManager packageManagerM39292 = C16737.m39292();
                intent.setDataAndType(abstractC20745M46690.m46712(), "*/*");
                Iterator<ResolveInfo> it = packageManagerM39292.queryIntentActivities(intent, 65536).iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    if (strM48157.equals(m48157(activityInfo.name, activityInfo.packageName))) {
                        return true;
                    }
                }
                intent.setDataAndType(abstractC20745M46690.m46732(), "*/*");
                Iterator<ResolveInfo> it2 = packageManagerM39292.queryIntentActivities(intent, 65536).iterator();
                while (it2.hasNext()) {
                    ActivityInfo activityInfo2 = it2.next().activityInfo;
                    if (strM48157.equals(m48157(activityInfo2.name, activityInfo2.packageName))) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48157(String str, String str2) {
        return str.startsWith(".") ? C15489.m37076(str2, str) : str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21512 m48161(AbstractC20745 abstractC20745, String str) throws IOException {
        C17367 c17367M46713 = abstractC20745.m46713();
        C20190.m45649((InterfaceC0433) c17367M46713, 1935831681);
        int i = c17367M46713.readByte() & 255;
        if (i == 0) {
            return new C21512(str, new C5990(new ComponentName(c17367M46713.m40442(), c17367M46713.m40442()), c17367M46713.m40461(), c17367M46713.m40461()));
        }
        if (i >= 1 && i <= 21) {
            return new C21512(str, C6695.m18078(i));
        }
        throw new IOException();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m48174() {
        C11018 c11018M43576 = C18917.m43576(1935831681);
        C6695 c6695 = this.f69894;
        if (c6695 != null) {
            c11018M43576.writeByte(c6695.f22574);
        } else {
            c11018M43576.writeByte(0);
            C5990 c5990 = this.f69891;
            c11018M43576.m27782((CharSequence) c5990.mo16277().getPackageName());
            c11018M43576.m27782((CharSequence) c5990.mo16277().getClassName());
            c11018M43576.m27784(c5990.mo16278());
            c11018M43576.m27784(c5990.mo16276());
        }
        try {
            m48171(this.f69892).m46697(c11018M43576);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21512 m48159(JSONObject jSONObject) {
        String string = jSONObject.getString(am.aB);
        int i = jSONObject.getInt(am.aI);
        if (i == 0) {
            ComponentName componentName = new ComponentName(jSONObject.getString(am.ax), jSONObject.getString(am.aF));
            int i2 = jSONObject.getInt("f");
            return new C21512(string, new C5990(componentName, (i2 & 1) != 0, (i2 & 2) != 0));
        }
        if (i < 1 || i > 21) {
            throw new RuntimeException(C8479.m22141(i, "Unknown type: "));
        }
        return new C21512(string, C6695.m18078(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final JSONObject m48183() {
        int i;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(am.aB, this.f69892);
        C6695 c6695 = this.f69894;
        if (c6695 != null) {
            jSONObject.put(am.aI, c6695.f22574);
            return jSONObject;
        }
        jSONObject.put(am.aI, 0);
        C5990 c5990 = this.f69891;
        jSONObject.put(am.ax, c5990.mo16277().getPackageName());
        jSONObject.put(am.aF, c5990.mo16277().getClassName());
        boolean zMo16278 = c5990.mo16278();
        if (c5990.mo16276()) {
            i = zMo16278;
            i = (zMo16278 ? 1 : 0) | 2;
        }
        i = zMo16278;
        jSONObject.put("f", i);
        return jSONObject;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m48170() {
        AbstractC20745 abstractC20745M46690 = C11904.m29695().m46690("openMethod");
        HashMap map = f69883;
        map.clear();
        for (AbstractC20745 abstractC20745 : abstractC20745M46690.mo33983(true)) {
            String name = abstractC20745.getName();
            if (name.endsWith(".om")) {
                try {
                    String lowerCase = name.substring(0, name.length() - 3).toLowerCase();
                    map.put(lowerCase, m48161(abstractC20745, lowerCase));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static void m48175() {
        f69887 = C11904.m29695().m46690("openMethod").mo33991();
        f69889 = System.currentTimeMillis();
        C16737.m39273(new RunnableC15163(0));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m48171(String str) {
        return C11904.m29695().m46690("openMethod/" + str + ".om");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48165(String str, C0690 c0690, String... strArr) {
        f69888.put(str, new C21512(str, c0690, null, strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48163(String str, int i, C0690 c0690, String... strArr) {
        f69888.put(str, new C21512(str, c0690, C6695.m18078(i), strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48164(String str, int i, String... strArr) {
        f69888.put(str, new C21512(str, null, C6695.m18078(i), strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48162(String str) {
        String lowerCase = str.toLowerCase();
        HashMap map = f69888;
        if (map.containsKey(lowerCase)) {
            return;
        }
        map.put(lowerCase, new C21512(lowerCase, C0690.f2929, C6695.m18078(9), "text/plain"));
    }
}
