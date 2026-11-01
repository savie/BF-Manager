package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import bin.mt.plus.Main;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: l.ۙ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6MK */
/* JADX INFO: loaded from: classes2.dex */
public final class C4844 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Handler f17017;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C0985 f17018;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C17919 f17019;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f17020;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f17021;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final RunnableC13208 f17022;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Exception f17023;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f17024;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ExecutorC1691 f17025;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f17026;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f17027;

    public C4844(C17919 c17919, C0985 c0985) {
        ExecutorC1691 executorC1691 = new ExecutorC1691();
        this.f17017 = new Handler(Looper.getMainLooper());
        this.f17022 = new RunnableC13208(1, this);
        this.f17026 = -1L;
        this.f17019 = c17919;
        this.f17018 = c0985;
        this.f17025 = executorC1691;
        this.f17027 = 20000L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13459() {
        m13457();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13460() {
        this.f17024 = true;
        this.f17017.removeCallbacks(this.f17022);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m13457() {
        if (this.f17024) {
            return;
        }
        C17919 c17919 = this.f17019;
        C8042 c8042 = c17919.f56916;
        if (c8042.f28175 || c8042.f28164 || c8042.f28171 || !c8042.m21168() || c8042.f28179.getActivity() == null || c8042.f28179.requireActivity().isFinishing() || c8042.f28179.requireActivity().isDestroyed()) {
            m13460();
            return;
        }
        C8042 c8043 = c17919.f56916;
        if (c8043.f28179.isResumed() && c8043.f28179.isVisible()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (this.f17026 < 0) {
                this.f17026 = jUptimeMillis;
            }
            if (this.f17020 != null || this.f17023 != null) {
                m13460();
                String str = this.f17020;
                if (str == null) {
                    c17919.f56916.f28179.f16882.m2969((Throwable) this.f17023);
                    return;
                } else {
                    C8042 c8044 = c17919.f56916;
                    c8044.m21171();
                    Main.m67((ActivityC11632) c8044.f28179.requireActivity(), str);
                    return;
                }
            }
            if (!this.f17021 && jUptimeMillis - this.f17026 >= this.f17027) {
                this.f17021 = true;
                try {
                    this.f17025.execute(new RunnableC15408(this, "foregroundWaitMs=" + (jUptimeMillis - this.f17026) + "\n" + C8042.m21163(c17919.f56916), 1));
                } catch (RuntimeException e) {
                    this.f17023 = e;
                }
            }
        } else {
            this.f17026 = -1L;
        }
        this.f17017.postDelayed(this.f17022, 1000L);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m13458(final C4844 c4844, String str) throws Throwable {
        Handler handler = c4844.f17017;
        try {
            C0985 c0985 = c4844.f17018;
            final String strM13449 = m13449((InterfaceC3800) c0985.f4626, (String) c0985.f4627, str);
            handler.post(new Runnable() { // from class: l.ۢ۠ۖ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32000.f17020 = strM13449;
                }
            });
        } catch (Exception e) {
            handler.post(new Runnable() { // from class: l.ۗ۠ۖ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11696.f17023 = e;
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13449(InterfaceC3800 interfaceC3800, String str, String str2) throws Throwable {
        AbstractC20745 abstractC20745M29695 = C11904.m29695();
        abstractC20745M29695.m46739();
        String str3 = "text-recovery-" + System.currentTimeMillis() + "-" + UUID.randomUUID() + ".zip";
        AbstractC20745 abstractC20745M46690 = abstractC20745M29695.m46690(str3);
        AbstractC20745 abstractC20745M46691 = abstractC20745M29695.m46690(str3 + ".tmp");
        boolean z = false;
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(abstractC20745M46691.m46708());
            try {
                zipOutputStream.setLevel(1);
                m13450(zipOutputStream, "diagnostics.txt", "version=2.26.10 (26101061)\npackage=" + C16737.m39293() + "\nmanufacturer=" + Build.MANUFACTURER + "\nmodel=" + Build.MODEL + "\nandroid=" + Build.VERSION.RELEASE + "\nsdk=" + Build.VERSION.SDK_INT + "\nstateName=" + str + "\ndirectory=" + interfaceC3800 + "\n" + str2);
                m13450(zipOutputStream, "threads.txt", m13456());
                m13450(zipOutputStream, "logcat.txt", m13448());
                ArrayList arrayList = new ArrayList();
                InterfaceC3800 parent = interfaceC3800.toAbsolutePath().normalize().getParent();
                DirectoryStream<InterfaceC3800> directoryStreamNewDirectoryStream = C5212.newDirectoryStream(parent);
                try {
                    for (InterfaceC3800 interfaceC3801 : directoryStreamNewDirectoryStream) {
                        String string = interfaceC3801.getFileName().toString();
                        if (interfaceC3801.equals(interfaceC3800.toAbsolutePath().normalize()) || m13455(string, str)) {
                            arrayList.add(interfaceC3801);
                        }
                    }
                    directoryStreamNewDirectoryStream.close();
                    C23846.sort(arrayList, C7618.comparing(new C10968(2)));
                    StringBuilder sb = new StringBuilder("Live diagnostic copy; no session locks acquired.\nFiles may change while copying; before/after sizes and timestamps follow.\n");
                    if (arrayList.isEmpty()) {
                        sb.append("No session files found.\n");
                    }
                    byte[] bArr = new byte[65536];
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        m13451(zipOutputStream, parent, (InterfaceC3800) it.next(), bArr, sb);
                    }
                    m13450(zipOutputStream, "manifest.txt", sb.toString());
                    zipOutputStream.close();
                    if (!abstractC20745M46691.mo24646(abstractC20745M46690)) {
                        throw new IOException("Cannot publish session diagnostics archive");
                    }
                    try {
                        return abstractC20745M46690.mo33986();
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        if (!z) {
                            abstractC20745M46691.mo24647();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (directoryStreamNewDirectoryStream != null) {
                        try {
                            directoryStreamNewDirectoryStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    zipOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m13455(String str, String str2) {
        int length;
        int length2;
        if (!str.equals(str2.concat(".dat")) && !str.equals(str2.concat(".tat")) && !str.equals(str2.concat(".lit"))) {
            if (!str.startsWith(str2.concat("-")) || !str.endsWith(".dat") || (length2 = str2.length() + 1) == (length = str.length() - 4)) {
                return false;
            }
            for (length2 = str2.length() + 1; length2 < length; length2++) {
                if (str.charAt(length2) < '0' || str.charAt(length2) > '9') {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13451(ZipOutputStream zipOutputStream, InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801, byte[] bArr, StringBuilder sb) throws IOException {
        int i;
        String strReplace = interfaceC3800.relativize(interfaceC3801).toString().replace('\\', '/');
        try {
            EnumC22146 enumC22146 = EnumC22146.NOFOLLOW_LINKS;
            InterfaceC20735 attributes = C5212.readAttributes(interfaceC3801, InterfaceC20735.class, enumC22146);
            if (attributes.isDirectory()) {
                ArrayList arrayList = new ArrayList();
                DirectoryStream directoryStreamNewDirectoryStream = C5212.newDirectoryStream(interfaceC3801);
                try {
                    Iterator it = directoryStreamNewDirectoryStream.iterator();
                    while (it.hasNext()) {
                        arrayList.add((InterfaceC3800) it.next());
                    }
                    directoryStreamNewDirectoryStream.close();
                    C23846.sort(arrayList, C7618.comparing(new C10968(2)));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        m13451(zipOutputStream, interfaceC3800, (InterfaceC3800) it2.next(), bArr, sb);
                    }
                    return;
                } catch (Throwable th) {
                    if (directoryStreamNewDirectoryStream == null) {
                        throw th;
                    }
                    try {
                        directoryStreamNewDirectoryStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            if (attributes.isRegularFile()) {
                try {
                    InputStream inputStreamNewInputStream = C5212.newInputStream(interfaceC3801, enumC22146);
                    try {
                        zipOutputStream.putNextEntry(new ZipEntry("session/" + strReplace));
                        long size = attributes.size();
                        while (size > 0 && (i = inputStreamNewInputStream.read(bArr, 0, (int) Math.min(bArr.length, size))) >= 0) {
                            if (i == 0) {
                                throw new IOException("Session diagnostic read made no progress");
                            }
                            zipOutputStream.write(bArr, 0, i);
                            size -= (long) i;
                        }
                        zipOutputStream.closeEntry();
                        sb.append(strReplace);
                        sb.append(" sizeBefore=");
                        sb.append(attributes.size());
                        sb.append(" copied=");
                        sb.append(attributes.size() - size);
                        sb.append(" modifiedBefore=");
                        sb.append(attributes.lastModifiedTime().toMillis());
                        if (inputStreamNewInputStream != null) {
                            inputStreamNewInputStream.close();
                        }
                        try {
                            InterfaceC20735 attributes2 = C5212.readAttributes(interfaceC3801, InterfaceC20735.class, EnumC22146.NOFOLLOW_LINKS);
                            sb.append(" sizeAfter=");
                            sb.append(attributes2.size());
                            sb.append(" modifiedAfter=");
                            sb.append(attributes2.lastModifiedTime().toMillis());
                        } catch (IOException e) {
                            sb.append(" afterCopy=");
                            sb.append(e);
                        }
                        sb.append('\n');
                        return;
                    } catch (Throwable th3) {
                        if (inputStreamNewInputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStreamNewInputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (IOException e2) {
                    sb.append(strReplace);
                    sb.append(" unavailable: ");
                    sb.append(e2);
                    sb.append('\n');
                    return;
                }
            }
            sb.append(strReplace);
            sb.append(" skipped: not a regular file or directory\n");
        } catch (IOException e3) {
            sb.append(strReplace);
            sb.append(" unavailable: ");
            sb.append(e3);
            sb.append('\n');
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13450(ZipOutputStream zipOutputStream, String str, String str2) throws IOException {
        zipOutputStream.putNextEntry(new ZipEntry(str));
        zipOutputStream.write(str2.getBytes(StandardCharsets.UTF_8));
        zipOutputStream.closeEntry();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m13456() {
        StringBuilder sb = new StringBuilder();
        ArrayList<Map.Entry> arrayList = new ArrayList(Thread.getAllStackTraces().entrySet());
        C23846.sort(arrayList, C7618.comparing(new C17437(1)));
        for (Map.Entry entry : arrayList) {
            Thread thread = (Thread) entry.getKey();
            sb.append('\"');
            sb.append(thread.getName());
            sb.append("\" id=");
            sb.append(thread.getId());
            sb.append(" state=");
            sb.append(thread.getState());
            sb.append('\n');
            for (StackTraceElement stackTraceElement : (StackTraceElement[]) entry.getValue()) {
                sb.append("    at ");
                sb.append(stackTraceElement);
                sb.append('\n');
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m13448() {
        Process process = null;
        try {
            try {
                Process processStart = new ProcessBuilder("logcat", "-d", "-t", "2000", "-v", "threadtime").redirectErrorStream(true).start();
                InputStream inputStream = processStart.getInputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[8192];
                        long jUptimeMillis = SystemClock.uptimeMillis() + c.a;
                        while (SystemClock.uptimeMillis() < jUptimeMillis && byteArrayOutputStream.size() < 2097152) {
                            int iAvailable = inputStream.available();
                            if (iAvailable > 0) {
                                int i = inputStream.read(bArr, 0, Math.min(8192, iAvailable));
                                if (i < 0) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i);
                            } else {
                                try {
                                    processStart.exitValue();
                                    break;
                                } catch (IllegalThreadStateException unused) {
                                    Thread.sleep(20L);
                                }
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                }
                            }
                            throw th;
                        }
                        String str = byteArrayOutputStream.toString(a.D) + "\n[Log capture bounded to 2000 entries, 2 MiB and 3 seconds]\n";
                        byteArrayOutputStream.close();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        processStart.destroy();
                        return str;
                    } catch (Throwable th2) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th4;
                }
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                String str2 = "Logcat unavailable: " + e + "\n";
                if (0 != 0) {
                    process.destroy();
                }
                return str2;
            }
        } catch (Throwable th5) {
            if (0 != 0) {
                process.destroy();
            }
            throw th5;
        }
    }
}
