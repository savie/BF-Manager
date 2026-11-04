package l;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import bin.mt.json.JSONObject;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.۠᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: B13Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C8969 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long f29252;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long f29254;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23296 f29257;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C20613 f29258;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f29259;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1512 f29260;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public List f29261;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final HashMap f29256 = new HashMap();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final HashMap f29255 = new HashMap();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final HashMap f29253 = new HashMap();

    static {
        m23956(".xml", 1, "text/xml");
        m23956(".kml", 1, "text/kml");
        m23956(".dex", 3, "application/octet-stream");
        m23956(".arsc", 2, "application/octet-stream");
        m23956(".mtp", 8, "application/mt-plugin");
        m23956(".apk", 4, "application/vnd.android.package-archive");
        m23956(".apk.1", 4, "application/vnd.android.package-archive");
        m23956(".apex", 4, "application/vnd.android.package-archive");
        m23956(".bks", 7, "application/bks");
        m23956(".jks", 7, "application/jks");
        m23956(".keystore", 7, "application/jks");
        m23956(".apks", 5, "application/vnd.android.package-archives");
        m23956(".xapk", 5, "application/vnd.android.package-archives");
        m23956(".apkm", 5, "application/vnd.android.package-archives");
        m23956(".sh", 12, "application/x-sh");
        m23956(".rc", 12, "application/x-rc");
        m23956(".zip", 6, "application/zip");
        m23956(".aab", 6, "application/zip");
        m23956(".mtz", 6, "application/zip");
        m23956(".hwt", 6, "application/zip");
        m23956(".bds", 6, "application/zip");
        m23956(".jar", 16, "application/x-jar", "application/java-archive", "application/x-java-archive");
        m23956(".ttf", 13, "application/x-font-ttf");
        m23956(".ttc", 13, "application/x-font-ttc");
        m23956(".otf", 13, "application/x-font-otf");
        m23956(".woff", 13, "application/x-font-woff");
        m23956(".plist", 1, "text/plist");
        m23956(".class", 17, "application/octet-stream");
        m23956(".mtcr", 18, "application/octet-stream");
        m23956(".iml", 9, "text/xml");
        m23956(".mtd", 9, "text/plain");
        m23956(".mtl", 9, "text/plain");
        m23956(".mtsx", 9, "text/plain");
        m23956(".m3u", 9, "text/plain");
        m23956(".mf", 9, "text/plain");
        C20613 c20613 = C20613.f66102;
        m23955(".md", 21, c20613, "text/plain");
        m23955(".markdown", 21, c20613, "text/plain");
        m23956(".sf", 9, "text/plain");
        m23956(".txt", 9, "text/plain");
        m23956(".log", 9, "text/plain");
        m23956(".css", 9, "text/plain");
        m23956(".cfg", 9, "text/plain");
        m23956(".ini", 9, "text/plain");
        m23956(".conf", 9, "text/plain");
        m23956(".prop", 9, "text/plain");
        m23956(".json", 9, "text/plain");
        m23956(".properties", 9, "text/plain");
        C20613 c20614 = C20613.f66064;
        m23955(".htm", 21, c20614, "text/html");
        m23955(".html", 21, c20614, "text/html");
        m23955(".xhtml", 21, c20614, "application/xhtml+xml");
        m23955(".shtml", 21, c20614, "text/html");
        m23955(".mhtml", 21, c20614, "multipart/related");
        m23955(".mht", 21, c20614, "multipart/related");
        C20613 c20615 = C20613.f66094;
        m23955(".c", 9, c20615, "text/plain");
        m23955(".h", 9, c20615, "text/plain");
        m23955(".js", 9, c20615, "text/plain");
        m23955(".py", 9, C20613.f66092, "text/plain");
        m23955(".cc", 9, c20615, "text/plain");
        m23955(".go", 9, c20615, "text/plain");
        m23955(".kt", 9, C20613.f66062, "text/plain");
        m23955(".bat", 9, c20615, "text/plain");
        m23955(".php", 9, C20613.f66075, "text/plain");
        m23955(".cpp", 9, c20615, "text/plain");
        m23955(".hpp", 9, c20615, "text/plain");
        m23955(".lua", 9, C20613.f66103, "text/plain");
        m23955(".java", 9, C20613.f66068, "text/plain");
        m23955(".smali", 9, c20615, "text/plain");
        m23955(".yml", 9, c20615, "text/plain");
        m23955(".yaml", 9, c20615, "text/plain");
        m23955(".rs", 9, c20615, "text/plain");
        C20613 c20616 = C20613.f66100;
        m23955(".zshrc", 9, c20616, "text/plain");
        m23955(".bashrc", 9, c20616, "text/plain");
        m23955(".bash_history", 9, c20615, "text/plain");
        C20613 c20617 = C20613.f66069;
        m23955(".csv", 9, c20617, "text/csv");
        m23955(".ass", 9, c20613, "text/x-ssa");
        m23955(".ssa", 9, c20613, "text/x-ssa");
        m23955(".srt", 9, c20613, "application/x-subrip");
        m23955(".vtt", 9, c20613, "text/vtt");
        m23955(".ttml", 9, c20613, "application/ttml+xml");
        m23956(".jpeg", 10, "image/jpeg");
        m23956(".jpg", 10, "image/jpeg");
        m23956(".bmp", 10, "image/bmp");
        m23956(".gif", 10, "image/gif");
        m23956(".ico", 10, "image/x-icon");
        m23956(".png", 10, "image/png");
        m23956(".webp", 10, "image/webp");
        m23956(".heic", 10, "image/heic");
        m23956(".heif", 10, "image/heif");
        m23956(".svg", 15, "image/svg+xml");
        m23956(".9.png", 10, "image/png");
        m23956(".tga", 10, "image/tga");
        m23956(".dng", 10, "image/x-adobe-dng");
        m23956(".m4a", 11, "audio/mp4a-latm");
        m23956(".m4b", 11, "audio/mp4a-latm");
        m23956(".m4p", 11, "audio/mp4a-latm");
        m23956(".mp2", 11, "audio/x-mpeg");
        m23956(".mp3", 11, "audio/x-mpeg");
        m23956(".mpga", 11, "audio/mpeg");
        m23956(".ogg", 11, "audio/ogg");
        m23956(".opus", 11, "audio/ogg", "audio/opus");
        m23956(".wav", 11, "audio/x-wav");
        m23956(".wma", 11, "audio/x-ms-wma");
        m23956(".flac", 11, "audio/*");
        m23956(".amr", 11, "audio/amr");
        m23956(".mid", 11, "audio/midi");
        m23956(".midi", 11, "audio/midi");
        m23956(".oga", 11, "audio/ogg");
        m23956(".aac", 11, "audio/aac");
        m23956(".rpm", 11, "audio/vnd.rn-realaudio");
        m23956(".weba", 11, "audio/webm");
        m23956(".3gp", 20, "video/3gpp");
        m23956(".asf", 20, "video/x-ms-asf");
        m23956(".avi", 20, "video/x-msvideo");
        m23956(".mp4", 20, "video/mp4");
        m23956(".mpe", 20, "video/mpeg");
        m23956(".mpeg", 20, "video/mpeg");
        m23956(".mpg", 20, "video/mpeg");
        m23956(".mpg4", 20, "video/mp4");
        m23956(".m4u", 20, "video/vnd.mpegurl");
        m23956(".m3u8", 20, "video/vnd.mpegurl", "application/x-mpegurl", "application/vnd.apple.mpegurl");
        m23956(".m4v", 20, "video/x-m4v");
        m23956(".mov", 20, "video/quicktime");
        m23956(".rmvb", 20, "video/vnd.rn-realvideo");
        m23956(".wmv", 20, "video/x-ms-wmv");
        m23956(".3gpp", 20, "video/3gpp");
        m23956(".flv", 20, "video/x-flv");
        m23956(".ogv", 20, "video/ogg");
        m23956(".mkv", 20, "video/x-matroska");
        m23956(".dv", 20, "video/x-dv");
        m23956(".webm", 20, "video/webm");
        m23956(".7z", 6, "application/x-7z-compressed");
        m23956(".deb", 6, "application/vnd.debian.binary-package");
        m23956(".arj", 6, "application/arj");
        m23956(".cab", 6, "application/vnd.ms-cab-compressed");
        m23956(".chm", 6, "application/vnd.ms-htmlhelp");
        m23956(".cpio", 6, "application/x-cpio", "application/cpio");
        m23956(".iso", 6, "application/iso");
        m23956(".lzh", 6, "application/lzh");
        m23956(".lzma", 6, "application/lzma");
        m23956(".rar", 6, "application/x-rar-compressed");
        m23956(".wim", 6, "application/wim");
        m23956(".xar", 6, "application/xar");
        m23956(".ntfs", 6, "application/ntfs");
        m23956(".udf", 6, "application/udf");
        m23956(".z", 6, "application/z");
        m23956(".zl", 6, "application/zlib");
        m23956(".zli", 6, "application/zlib");
        m23956(".zlib", 6, "application/zlib");
        m23956(".tar", 6, "application/x-tar", "application/tar");
        m23956(".gz", 6, "application/x-gzip", "application/gzip");
        m23956(".tar.gz", 6, "application/x-gzip", "application/gzip");
        m23956(".tgz", 6, "application/x-gzip", "application/gzip");
        m23956(".taz", 6, "application/x-gzip", "application/gzip");
        m23956(".xz", 6, "application/x-xz", "application/xz");
        m23956(".tar.xz", 6, "application/x-xz", "application/xz");
        m23956(".txz", 6, "application/x-xz", "application/xz");
        m23956(".zst", 6, "application/zstd");
        m23956(".zstd", 6, "application/zstd");
        m23956(".tar.zst", 6, "application/zstd");
        m23956(".tar.zstd", 6, "application/zstd");
        m23956(".bz2", 6, "application/x-bzip2", "application/bzip2");
        m23956(".tar.bz2", 6, "application/x-bzip2", "application/bzip2");
        m23956(".tbz2", 6, "application/x-bzip2", "application/bzip2");
        m23956(".tbz", 6, "application/x-bzip2", "application/bzip2");
        m23956(".lz4", 6, "application/x-lz4", "application/lz4");
        m23956(".tar.lz4", 6, "application/x-lz4", "application/lz4");
        m23959(".pdf", C20613.f66049, "application/pdf");
        C20613 c20618 = C20613.f66112;
        m23959(".ppt", c20618, "application/vnd.ms-powerpoint");
        m23959(".xls", c20617, "application/vnd.ms-excel");
        m23959(".doc", c20613, "application/msword");
        m23959(".pptx", c20618, "application/vnd.ms-powerpoint");
        m23959(".xlsx", c20617, "application/vnd.ms-excel");
        m23959(".docx", c20613, "application/msword");
        C20613 c20619 = C20613.f66079;
        m23959(".odex", c20619, "application/oat");
        m23959(".oat", c20619, "application/oat");
        m23959(".torrent", C20613.f66060, "application/x-bittorrent");
        m23956(".ts-movie", 20, "video/MP2T");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m23965(String str) {
        return (String) m23952(str, true).f29261.get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8969 m23952(String str, boolean z) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C16912 c16912M41323 = C17658.m41323(lowerCase);
        if (c16912M41323 != null) {
            lowerCase = c16912M41323.m39897();
        }
        String strM49832 = AbstractC22044.m49832(lowerCase);
        if (strM49832.isEmpty()) {
            return new C8969("", null, null, "*/*");
        }
        if (System.currentTimeMillis() - f29252 > 10000) {
            long jMo4286 = C6382.m18134().m49876("openMethod").mo4286();
            if (jMo4286 != f29254) {
                m23963();
                f29254 = jMo4286;
            }
            f29252 = System.currentTimeMillis();
        }
        C8969 c8969 = z ? (C8969) f29255.get(strM49832) : null;
        if (c8969 == null) {
            c8969 = (C8969) f29253.get(strM49832);
        }
        if (c8969 == null) {
            c8969 = (C8969) f29256.get(strM49832);
        }
        if (c8969 == null) {
            return new C8969(strM49832, strM49832.equals(".img") ? C20613.f66093 : null, null, "*/*");
        }
        return c8969;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23961(boolean z) {
        Main mainM18052;
        C20065 c20065M117;
        C14307 c14307 = new C14307();
        Iterator it = C8596.m23110().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C16800) it.next()).m39687().iterator();
            while (it2.hasNext()) {
                String lowerCase = ((String) it2.next()).toLowerCase();
                if (!f29256.containsKey(lowerCase) && !c14307.containsKey(lowerCase)) {
                    c14307.put(lowerCase, new C8969(lowerCase, C1512.m5367(9)));
                }
            }
        }
        HashMap map = f29253;
        map.clear();
        map.putAll(c14307);
        if (!z || (mainM18052 = C6331.m18052()) == null || (c20065M117 = mainM18052.m117()) == null) {
            return;
        }
        C21576.m49068(new RunnableC3003(0, c20065M117.m46155()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23957(String str, C1512 c1512) {
        String lowerCase = str.toLowerCase();
        C8969 c8969 = new C8969(lowerCase, c1512);
        c8969.m23964();
        f29255.put(lowerCase, c8969);
        m23968();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23958(String str, InterfaceC16648 interfaceC16648) {
        String lowerCase = str.toLowerCase();
        C8969 c8969 = new C8969(lowerCase, new C23296(interfaceC16648.mo39358(), interfaceC16648.mo39359(), interfaceC16648.mo39357()));
        c8969.m23964();
        f29255.put(lowerCase, c8969);
        m23968();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23960(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8969 c8969 = (C8969) it.next();
            c8969.m23964();
            f29255.put(c8969.f29259, c8969);
        }
        m23968();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m23966(ArrayList arrayList) {
        HashMap map = f29255;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            m23962(((C8969) it.next()).f29259).mo4296();
        }
        map.clear();
        m23960(arrayList);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m23967(String str) {
        String lowerCase = str.toLowerCase();
        m23962(lowerCase).mo4296();
        f29255.remove(lowerCase);
        m23968();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m23948() {
        m23963();
        ArrayList arrayList = new ArrayList(f29255.values());
        Collections.sort(arrayList, C2661.comparing(new C9714(0)));
        return arrayList;
    }

    public C8969(String str, C20613 c20613, C1512 c1512, String... strArr) {
        this.f29259 = str;
        this.f29258 = c20613;
        this.f29260 = c1512;
        this.f29261 = Arrays.asList(strArr);
    }

    public C8969(String str, C1512 c1512) {
        String str2;
        this.f29259 = str;
        C8969 c8969 = (C8969) f29256.get(str);
        if (c8969 != null) {
            this.f29261 = c8969.f29261;
            if (c1512 == c8969.f29260) {
                this.f29258 = c8969.f29258;
            }
        } else {
            int i = c1512.f5259;
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
                    throw new RuntimeException(C13645.m33382(i, "Unknown built-in function type: "));
            }
            this.f29261 = Collections.singletonList(str2);
        }
        this.f29260 = c1512;
    }

    public C8969(String str, C23296 c23296) {
        this.f29259 = str;
        C8969 c8969 = (C8969) f29256.get(str);
        if (c8969 != null) {
            this.f29261 = c8969.f29261;
            this.f29258 = c8969.m23976();
        } else {
            this.f29261 = Collections.singletonList("*/*");
        }
        this.f29257 = c23296;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m23974() {
        return this.f29259;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m23975() {
        return (String) this.f29261.get(0);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1512 m23978() {
        return this.f29260;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m23977() {
        C1512 c1512 = this.f29260;
        return c1512 != null && c1512.f5259 == 5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23971(int... iArr) {
        C1512 c1512 = this.f29260;
        if (c1512 != null) {
            int i = c1512.f5259;
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C23296 m23973() {
        return this.f29257;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C20613 m23976() {
        C20613 c20613 = this.f29258;
        if (c20613 != null) {
            return c20613;
        }
        C1512 c1512 = this.f29260;
        if (c1512 != null) {
            return c1512.m5368();
        }
        return C20613.f66060;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23969(C8614 c8614, InterfaceC2386 interfaceC2386) {
        final C2343 c2343M7885;
        C1512 c1512 = this.f29260;
        if (c1512 != null) {
            if (c1512.f5259 == 21) {
                int iM37471 = C15699.m37471(C7847.m21368(interfaceC2386.getName()));
                if (iM37471 == 1) {
                    C1663.m5972(interfaceC2386, c8614, ActivityC18143.class);
                    return;
                }
                if (iM37471 != 2) {
                    C0215.m1663(c8614, interfaceC2386);
                    return;
                }
                try {
                    c2343M7885 = C2343.m7885(c8614, interfaceC2386);
                } catch (IllegalArgumentException unused) {
                    c2343M7885 = null;
                }
                if (c2343M7885 == null) {
                    C22673.m51152(R.string.MT_Protector);
                    return;
                }
                final C13529 c13529 = new C13529(C21576.f68931);
                final boolean zEquals = "multipart/related".equals(C11401.m28751(interfaceC2386.getName()));
                final String strM7890 = zEquals ? c2343M7885.m7890() : c13529.m33234(c2343M7885);
                ActivityC3846.m12421(c8614, interfaceC2386, c2343M7885, strM7890, new Runnable() { // from class: l.᩵ۚܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (zEquals) {
                            return;
                        }
                        c13529.m33235(c2343M7885, strM7890, false);
                    }
                });
                return;
            }
            c1512.m5369(c8614, interfaceC2386);
            return;
        }
        this.f29257.m52412(c8614, interfaceC2386);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23970() {
        if (this.f29260 != null) {
            return true;
        }
        C23296 c23296 = this.f29257;
        if (c23296 != null) {
            try {
                ComponentName componentNameMo39358 = c23296.mo39358();
                String packageName = componentNameMo39358.getPackageName();
                String strM23949 = m23949(componentNameMo39358.getClassName(), packageName);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(packageName);
                AbstractC22044 abstractC22044M49876 = C6382.f21566.m49876("test" + this.f29259);
                PackageManager packageManagerM49081 = C21576.m49081();
                intent.setDataAndType(abstractC22044M49876.m49878(), "*/*");
                Iterator<ResolveInfo> it = packageManagerM49081.queryIntentActivities(intent, 65536).iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    if (strM23949.equals(m23949(activityInfo.name, activityInfo.packageName))) {
                        return true;
                    }
                }
                intent.setDataAndType(abstractC22044M49876.m49836(), "*/*");
                Iterator<ResolveInfo> it2 = packageManagerM49081.queryIntentActivities(intent, 65536).iterator();
                while (it2.hasNext()) {
                    ActivityInfo activityInfo2 = it2.next().activityInfo;
                    if (strM23949.equals(m23949(activityInfo2.name, activityInfo2.packageName))) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m23949(String str, String str2) {
        return str.startsWith(".") ? C14483.m34972(str2, str) : str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8969 m23953(AbstractC22044 abstractC22044, String str) throws IOException {
        C20348 c20348M49835 = abstractC22044.m49835();
        C17364.m40795((InterfaceC15872) c20348M49835, 1935831681);
        int i = c20348M49835.readByte() & 255;
        if (i == 0) {
            return new C8969(str, new C23296(new ComponentName(c20348M49835.m46756(), c20348M49835.m46756()), c20348M49835.m46753(), c20348M49835.m46753()));
        }
        if (i >= 1 && i <= 21) {
            return new C8969(str, C1512.m5367(i));
        }
        throw new IOException();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m23964() {
        C6178 c6178M34975 = C14483.m34975(1935831681);
        C1512 c1512 = this.f29260;
        if (c1512 != null) {
            c6178M34975.writeByte(c1512.f5259);
        } else {
            c6178M34975.writeByte(0);
            C23296 c23296 = this.f29257;
            c6178M34975.m17786((CharSequence) c23296.mo39358().getPackageName());
            c6178M34975.m17786((CharSequence) c23296.mo39358().getClassName());
            c6178M34975.m17789(c23296.mo39359());
            c6178M34975.m17789(c23296.mo39357());
        }
        try {
            m23962(this.f29259).m49844(c6178M34975);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8969 m23951(JSONObject jSONObject) {
        String string = jSONObject.getString(am.aB);
        int i = jSONObject.getInt(am.aI);
        if (i == 0) {
            ComponentName componentName = new ComponentName(jSONObject.getString(am.ax), jSONObject.getString(am.aF));
            int i2 = jSONObject.getInt("f");
            return new C8969(string, new C23296(componentName, (i2 & 1) != 0, (i2 & 2) != 0));
        }
        if (i < 1 || i > 21) {
            throw new RuntimeException(C13645.m33382(i, "Unknown type: "));
        }
        return new C8969(string, C1512.m5367(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final JSONObject m23972() {
        int i;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(am.aB, this.f29259);
        C1512 c1512 = this.f29260;
        if (c1512 != null) {
            jSONObject.put(am.aI, c1512.f5259);
            return jSONObject;
        }
        jSONObject.put(am.aI, 0);
        C23296 c23296 = this.f29257;
        jSONObject.put(am.ax, c23296.mo39358().getPackageName());
        jSONObject.put(am.aF, c23296.mo39358().getClassName());
        boolean zMo39359 = c23296.mo39359();
        if (c23296.mo39357()) {
            i = zMo39359;
            i = (zMo39359 ? 1 : 0) | 2;
        }
        i = zMo39359;
        jSONObject.put("f", i);
        return jSONObject;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m23963() {
        AbstractC22044 abstractC22044M49876 = C6382.m18134().m49876("openMethod");
        HashMap map = f29255;
        map.clear();
        for (AbstractC22044 abstractC22044 : abstractC22044M49876.mo4299(true)) {
            String name = abstractC22044.getName();
            if (name.endsWith(".om")) {
                try {
                    String lowerCase = name.substring(0, name.length() - 3).toLowerCase();
                    map.put(lowerCase, m23953(abstractC22044, lowerCase));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m23968() {
        f29254 = C6382.m18134().m49876("openMethod").mo4286();
        f29252 = System.currentTimeMillis();
        C21576.m49068(new RunnableC22951(1));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m23962(String str) {
        return C6382.m18134().m49876("openMethod/" + str + ".om");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23959(String str, C20613 c20613, String... strArr) {
        f29256.put(str, new C8969(str, c20613, null, strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23955(String str, int i, C20613 c20613, String... strArr) {
        f29256.put(str, new C8969(str, c20613, C1512.m5367(i), strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23956(String str, int i, String... strArr) {
        f29256.put(str, new C8969(str, null, C1512.m5367(i), strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23954(String str) {
        String lowerCase = str.toLowerCase();
        HashMap map = f29256;
        if (map.containsKey(lowerCase)) {
            return;
        }
        map.put(lowerCase, new C8969(lowerCase, C20613.f66094, C1512.m5367(9), "text/plain"));
    }
}
