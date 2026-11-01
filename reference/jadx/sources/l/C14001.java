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

/* JADX INFO: renamed from: l.ܰᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47AI */
/* JADX INFO: loaded from: classes3.dex */
public final class C14001 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC9180 f46015 = new C11157();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2004 f46016;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ExecutorService f46017 = Executors.newCachedThreadPool(new ThreadFactoryC3394());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33849(C14001 c14001, C14685 c14685, PipedOutputStream pipedOutputStream) throws Throwable {
        c14001.getClass();
        C23857 c23857 = null;
        try {
            C23857 c23858 = new C23857(pipedOutputStream);
            try {
                c23858.setLevel(1);
                HashSet hashSet = new HashSet();
                for (C9746 c9746 : c14685.f48004) {
                    m33848(c23858, hashSet, c9746.f32795, c9746.f32794);
                }
                c23858.close();
            } catch (IOException | RuntimeException | C1983 unused) {
                c23857 = c23858;
                try {
                    pipedOutputStream.close();
                } catch (IOException unused2) {
                }
                if (c23857 != null) {
                    C23857.m52581(c23857);
                }
            } catch (Throwable th) {
                th = th;
                c23857 = c23858;
                try {
                    pipedOutputStream.close();
                } catch (IOException unused3) {
                }
                if (c23857 == null) {
                    throw th;
                }
                C23857.m52581(c23857);
                throw th;
            }
        } catch (IOException | RuntimeException | C1983 unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public C14001(C12610 c12610, C2004 c2004) {
        this.f46016 = c2004;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10473 m33846(String str) {
        C4827 c4827;
        ArrayList arrayList;
        try {
            JSONObject jSONObjectM32822 = C13316.m32822(str);
            c4827 = new C4827();
            c4827.f16982 = C13316.m32829(jSONObjectM32822, "basePath");
            c4827.f16981 = C13316.m32826(jSONObjectM32822);
            c4827.f16980 = C13316.m32829(jSONObjectM32822, "archiveName");
        } catch (C1320 unused) {
            c4827 = null;
        }
        if (c4827 == null || TextUtils.isEmpty(c4827.f16982) || (arrayList = c4827.f16981) == null || arrayList.isEmpty()) {
            throw new C1983();
        }
        String strM28608 = AbstractC11462.m28608(m33851(c4827.f16982));
        ArrayList arrayList2 = new ArrayList(c4827.f16981.size());
        Iterator it = c4827.f16981.iterator();
        while (it.hasNext()) {
            arrayList2.add(m33851((String) it.next()));
        }
        String str2 = c4827.f16980;
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
        C10473 c10473 = new C10473(strM28608, strConcat, arrayList2);
        m33847(c10473);
        return c10473;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7768 m33852(C15530 c15530, C21055 c21055) {
        PipedInputStream pipedInputStream;
        if (!EnumC18351.GET.equals(c15530.m37142())) {
            return C12610.m31384(EnumC10591.METHOD_NOT_ALLOWED, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
        if (!TextUtils.isEmpty(C5244.m14439(c15530, "range"))) {
            return AbstractC16940.m39639(f46015, "text/plain", "");
        }
        PipedOutputStream pipedOutputStream = null;
        C10473 c10473 = c21055 == null ? null : c21055.f68577;
        if (c10473 == null) {
            return C12610.m31384(EnumC10591.UNAUTHORIZED, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
        try {
            final C14685 c14685M33847 = m33847(c10473);
            if (!this.f46016.m6465(c21055.f68579)) {
                return C12610.m31384(EnumC10591.UNAUTHORIZED, C16737.m39264(R.string.MT_Protector, new Object[0]));
            }
            try {
                pipedInputStream = new PipedInputStream(262144);
                try {
                    final PipedOutputStream pipedOutputStream2 = new PipedOutputStream(pipedInputStream);
                    try {
                        this.f46017.execute(new Runnable() { // from class: l.ۛᩳۜ
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                C14001.m33849(this.f21122, c14685M33847, pipedOutputStream2);
                            }
                        });
                        C7768 c7768M39640 = AbstractC16940.m39640(EnumC10591.OK, pipedInputStream);
                        c7768M39640.m20448("Content-Disposition", C13691.m33396(c14685M33847.f48003, "attachment"));
                        c7768M39640.m20448("Referrer-Policy", "no-referrer");
                        return c7768M39640;
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
                        return C12610.m31384(EnumC10591.INTERNAL_ERROR, C16737.m39264(R.string.MT_Protector, new Object[0]));
                    }
                } catch (IOException | RuntimeException unused4) {
                }
            } catch (IOException | RuntimeException unused5) {
                pipedInputStream = null;
            }
        } catch (C1983 unused6) {
            return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33853() {
        this.f46017.shutdownNow();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14685 m33847(C10473 c10473) throws C1983 {
        String strSubstring;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (String str : c10473.f35826) {
            String strConcat = c10473.f35827;
            if (!"/".equals(strConcat)) {
                if (!strConcat.endsWith("/")) {
                    strConcat = strConcat.concat("/");
                }
                if (!str.startsWith(strConcat) || str.length() <= strConcat.length()) {
                    throw new C1983();
                }
                strSubstring = str.substring(strConcat.length());
            } else {
                if (!str.startsWith("/") || str.length() <= 1) {
                    throw new C1983();
                }
                strSubstring = str.substring(1);
            }
            if (strSubstring.contains("/")) {
                throw new C1983();
            }
            m33850(strSubstring);
            AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
            m33850(strSubstring);
            if (!abstractC20745M15313.mo33975() || abstractC20745M15313.m46723()) {
                throw new C1983();
            }
            if (!hashSet.add((!abstractC20745M15313.mo33974() || strSubstring.endsWith("/")) ? strSubstring : strSubstring.concat("/"))) {
                throw new C1983();
            }
            arrayList.add(new C9746(abstractC20745M15313, strSubstring));
        }
        return new C14685(c10473.f35825, arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33848(ZipOutputStream zipOutputStream, HashSet hashSet, AbstractC20745 abstractC20745, String str) throws IOException, C1983 {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Archive stream interrupted");
        }
        m33850(str);
        if (abstractC20745.m46723()) {
            throw new C1983();
        }
        if (abstractC20745.mo33974()) {
            if (!str.endsWith("/")) {
                str = str.concat("/");
            }
            long jMo33991 = abstractC20745.mo33991();
            if (!hashSet.add(str)) {
                throw new C1983();
            }
            ZipEntry zipEntry = new ZipEntry(str);
            if (jMo33991 > 0) {
                zipEntry.setTime(jMo33991);
            }
            zipOutputStream.putNextEntry(zipEntry);
            zipOutputStream.closeEntry();
            ArrayList<AbstractC20745> arrayList = new ArrayList(abstractC20745.mo33983(true));
            C23846.sort(arrayList, C21023.thenComparing(C7618.comparing(new C3105(0), String.CASE_INSENSITIVE_ORDER), new C3105(0)));
            for (AbstractC20745 abstractC20746 : arrayList) {
                StringBuilder sbM23356 = C9023.m23356(str);
                sbM23356.append(abstractC20746.getName());
                m33848(zipOutputStream, hashSet, abstractC20746, sbM23356.toString());
            }
            return;
        }
        long jMo33992 = abstractC20745.mo33991();
        if (!hashSet.add(str)) {
            throw new C1983();
        }
        ZipEntry zipEntry2 = new ZipEntry(str);
        if (jMo33992 > 0) {
            zipEntry2.setTime(jMo33992);
        }
        zipOutputStream.putNextEntry(zipEntry2);
        try {
            InputStream inputStreamMo33970 = abstractC20745.mo33970();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = inputStreamMo33970.read(bArr);
                    if (i == -1) {
                        inputStreamMo33970.close();
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
                if (inputStreamMo33970 != null) {
                    try {
                        inputStreamMo33970.close();
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m33851(String str) throws C1983 {
        if (TextUtils.isEmpty(str)) {
            throw new C1983();
        }
        String strReplace = str.replace('\\', '/');
        if (!strReplace.startsWith("/")) {
            strReplace = "/".concat(strReplace);
        }
        while (strReplace.length() > 1 && strReplace.endsWith("/")) {
            strReplace = C20630.m46498(1, 0, strReplace);
        }
        if (strReplace.contains(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
            throw new C1983();
        }
        return strReplace;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m33850(String str) throws C1983 {
        if (TextUtils.isEmpty(str) || str.startsWith("/") || str.contains("\\") || str.contains("//")) {
            throw new C1983();
        }
        for (String str2 : str.split("/")) {
            if (TextUtils.isEmpty(str2) || ".".equals(str2) || "..".equals(str2)) {
                throw new C1983();
            }
        }
    }
}
