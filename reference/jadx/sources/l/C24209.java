package l;

import android.text.TextUtils;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.᩺ۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47AI */
/* JADX INFO: loaded from: classes.dex */
public final class C24209 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC14953 f78451 = new C17495();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3063 f78452;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ExecutorService f78453 = Executors.newCachedThreadPool(new ThreadFactoryC12274());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54198(C24209 c24209, C23463 c23463, PipedOutputStream pipedOutputStream) throws Throwable {
        c24209.getClass();
        C16003 c16003 = null;
        try {
            C16003 c16004 = new C16003(pipedOutputStream);
            try {
                c16004.setLevel(1);
                HashSet hashSet = new HashSet();
                for (C20479 c20479 : c23463.f75915) {
                    m54197(c16004, hashSet, c20479.f65615, c20479.f65614);
                }
                c16004.close();
            } catch (IOException | RuntimeException | C3325 unused) {
                c16003 = c16004;
                try {
                    pipedOutputStream.close();
                } catch (IOException unused2) {
                }
                if (c16003 != null) {
                    C16003.m38136(c16003);
                }
            } catch (Throwable th) {
                th = th;
                c16003 = c16004;
                try {
                    pipedOutputStream.close();
                } catch (IOException unused3) {
                }
                if (c16003 == null) {
                    throw th;
                }
                C16003.m38136(c16003);
                throw th;
            }
        } catch (IOException | RuntimeException | C3325 unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public C24209(C12802 c12802, C3063 c3063) {
        this.f78452 = c3063;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10520 m54195(String str) {
        C6309 c6309;
        ArrayList arrayList;
        try {
            JSONObject jSONObjectM48360 = C21203.m48360(str);
            c6309 = new C6309();
            c6309.f21391 = C21203.m48367(jSONObjectM48360, "basePath");
            c6309.f21390 = C21203.m48364(jSONObjectM48360);
            c6309.f21389 = C21203.m48367(jSONObjectM48360, "archiveName");
        } catch (C14489 unused) {
            c6309 = null;
        }
        if (c6309 == null || TextUtils.isEmpty(c6309.f21391) || (arrayList = c6309.f21390) == null || arrayList.isEmpty()) {
            throw new C3325();
        }
        String strM20187 = AbstractC7364.m20187(m54200(c6309.f21391));
        ArrayList arrayList2 = new ArrayList(c6309.f21390.size());
        Iterator it = c6309.f21390.iterator();
        while (it.hasNext()) {
            arrayList2.add(m54200((String) it.next()));
        }
        String str2 = c6309.f21389;
        String strTrim = TextUtils.isEmpty(str2) ? "download.zip" : str2.trim();
        StringBuilder sb = new StringBuilder(strTrim.length());
        for (int i = 0; i < strTrim.length(); i++) {
            char cCharAt = strTrim.charAt(i);
            if (cCharAt <= 31 || cCharAt == '/' || cCharAt == '\\' || cCharAt == ':' || cCharAt == '*' || cCharAt == '?' || cCharAt == '\"' || cCharAt == '<' || cCharAt == '>' || cCharAt == '|') {
                sb.append('_');
            } else {
                sb.append(cCharAt);
            }
        }
        String strTrim2 = sb.toString().trim();
        String strConcat = TextUtils.isEmpty(strTrim2) ? "download.zip" : strTrim2;
        if (!strConcat.toLowerCase(Locale.ROOT).endsWith(".zip")) {
            strConcat = strConcat.concat(".zip");
        }
        C10520 c10520 = new C10520(strM20187, strConcat, arrayList2);
        m54196(c10520);
        return c10520;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18683 m54201(C3767 c3767, C19471 c19471) {
        PipedInputStream pipedInputStream;
        if (!EnumC12716.GET.equals(c3767.m12226())) {
            return C12802.m31751(EnumC21667.METHOD_NOT_ALLOWED, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
        if (!TextUtils.isEmpty(C23991.m53541(c3767, "range"))) {
            return AbstractC1530.m5422(f78451, "text/plain", "");
        }
        PipedOutputStream pipedOutputStream = null;
        C10520 c10520 = c19471 == null ? null : c19471.f62901;
        if (c10520 == null) {
            return C12802.m31751(EnumC21667.UNAUTHORIZED, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
        try {
            final C23463 c23463M54196 = m54196(c10520);
            if (!this.f78452.m9992(c19471.f62903)) {
                return C12802.m31751(EnumC21667.UNAUTHORIZED, C21576.m49059(R.string.MT_Protector, new Object[0]));
            }
            try {
                pipedInputStream = new PipedInputStream(262144);
                try {
                    final PipedOutputStream pipedOutputStream2 = new PipedOutputStream(pipedInputStream);
                    try {
                        this.f78453.execute(new Runnable() { // from class: l.ܺۢۧ
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                C24209.m54198(this.f54063, c23463M54196, pipedOutputStream2);
                            }
                        });
                        C18683 c18683M5423 = AbstractC1530.m5423(EnumC21667.OK, pipedInputStream);
                        c18683M5423.m43440("Content-Disposition", C23947.m53473(c23463M54196.f75914, "attachment"));
                        c18683M5423.m43440("Referrer-Policy", "no-referrer");
                        return c18683M5423;
                    } catch (IOException | RuntimeException unused) {
                        pipedOutputStream = pipedOutputStream2;
                        if (pipedOutputStream != null) {
                            try {
                                pipedOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        if (pipedInputStream != null) {
                            try {
                                pipedInputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        return C12802.m31751(EnumC21667.INTERNAL_ERROR, C21576.m49059(R.string.MT_Protector, new Object[0]));
                    }
                } catch (IOException | RuntimeException unused4) {
                }
            } catch (IOException | RuntimeException unused5) {
                pipedInputStream = null;
            }
        } catch (C3325 unused6) {
            return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54202() {
        this.f78453.shutdownNow();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23463 m54196(C10520 c10520) throws C3325 {
        String strSubstring;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (String str : c10520.f33458) {
            String strConcat = c10520.f33459;
            if (!"/".equals(strConcat)) {
                if (!strConcat.endsWith("/")) {
                    strConcat = strConcat.concat("/");
                }
                if (!str.startsWith(strConcat) || str.length() <= strConcat.length()) {
                    throw new C3325();
                }
                strSubstring = str.substring(strConcat.length());
            } else {
                if (!str.startsWith("/") || str.length() <= 1) {
                    throw new C3325();
                }
                strSubstring = str.substring(1);
            }
            if (strSubstring.contains("/")) {
                throw new C3325();
            }
            m54199(strSubstring);
            AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
            m54199(strSubstring);
            if (!abstractC22044M35193.mo2934() || abstractC22044M35193.m49860()) {
                throw new C3325();
            }
            if (!hashSet.add((!abstractC22044M35193.mo4281() || strSubstring.endsWith("/")) ? strSubstring : strSubstring.concat("/"))) {
                throw new C3325();
            }
            arrayList.add(new C20479(abstractC22044M35193, strSubstring));
        }
        return new C23463(c10520.f33457, arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54197(ZipOutputStream zipOutputStream, HashSet hashSet, AbstractC22044 abstractC22044, String str) throws IOException, C3325 {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Archive stream interrupted");
        }
        m54199(str);
        if (abstractC22044.m49860()) {
            throw new C3325();
        }
        if (abstractC22044.mo4281()) {
            if (!str.endsWith("/")) {
                str = str.concat("/");
            }
            long jMo4286 = abstractC22044.mo4286();
            if (!hashSet.add(str)) {
                throw new C3325();
            }
            ZipEntry zipEntry = new ZipEntry(str);
            if (jMo4286 > 0) {
                zipEntry.setTime(jMo4286);
            }
            zipOutputStream.putNextEntry(zipEntry);
            zipOutputStream.closeEntry();
            ArrayList<AbstractC22044> arrayList = new ArrayList(abstractC22044.mo4299(true));
            C12884.sort(arrayList, C8627.thenComparing(C2661.comparing(new C3398(0), String.CASE_INSENSITIVE_ORDER), new C3398(0)));
            for (AbstractC22044 abstractC22045 : arrayList) {
                StringBuilder sbM27333 = C10732.m27333(str);
                sbM27333.append(abstractC22045.getName());
                m54197(zipOutputStream, hashSet, abstractC22045, sbM27333.toString());
            }
            return;
        }
        long jMo4287 = abstractC22044.mo4286();
        if (!hashSet.add(str)) {
            throw new C3325();
        }
        ZipEntry zipEntry2 = new ZipEntry(str);
        if (jMo4287 > 0) {
            zipEntry2.setTime(jMo4287);
        }
        zipOutputStream.putNextEntry(zipEntry2);
        try {
            InputStream inputStreamMo4290 = abstractC22044.mo4290();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = inputStreamMo4290.read(bArr);
                    if (i == -1) {
                        inputStreamMo4290.close();
                        zipOutputStream.closeEntry();
                        return;
                    } else {
                        if (Thread.currentThread().isInterrupted()) {
                            throw new InterruptedIOException("Archive stream interrupted");
                        }
                        zipOutputStream.write(bArr, 0, i);
                    }
                    zipOutputStream.closeEntry();
                    throw th;
                }
            } catch (Throwable th) {
                if (inputStreamMo4290 != null) {
                    try {
                        inputStreamMo4290.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            zipOutputStream.closeEntry();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m54200(String str) throws C3325 {
        if (TextUtils.isEmpty(str)) {
            throw new C3325();
        }
        String strReplace = str.replace('\\', '/');
        if (!strReplace.startsWith("/")) {
            strReplace = "/".concat(strReplace);
        }
        while (strReplace.length() > 1 && strReplace.endsWith("/")) {
            strReplace = C1402.m5124(1, 0, strReplace);
        }
        if (strReplace.contains(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
            throw new C3325();
        }
        return strReplace;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m54199(String str) throws C3325 {
        if (TextUtils.isEmpty(str) || str.startsWith("/") || str.contains("\\") || str.contains("//")) {
            throw new C3325();
        }
        for (String str2 : str.split("/")) {
            if (TextUtils.isEmpty(str2) || ".".equals(str2) || "..".equals(str2)) {
                throw new C3325();
            }
        }
    }
}
