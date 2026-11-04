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

/* JADX INFO: renamed from: l.᩺᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G6MK */
/* JADX INFO: loaded from: classes.dex */
public final class C24526 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18801 f79530;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f79531;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f79532;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Exception f79533;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final RunnableC6626 f79534;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Handler f79535;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f79536;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f79537;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ExecutorC23780 f79538;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C24023 f79539;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f79540;

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ۛ᩵᩸] */
    public C24526(C18801 c18801, C24023 c24023) {
        ExecutorC23780 executorC23780 = new ExecutorC23780();
        this.f79535 = new Handler(Looper.getMainLooper());
        this.f79534 = new Runnable() { // from class: l.ۛ᩵᩸
            @Override // java.lang.Runnable
            public final void run() {
                this.f22136.m54805();
            }
        };
        this.f79536 = -1L;
        this.f79530 = c18801;
        this.f79539 = c24023;
        this.f79538 = executorC23780;
        this.f79540 = 20000L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54809() {
        m54805();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54810() {
        this.f79532 = true;
        this.f79535.removeCallbacks(this.f79534);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m54805() {
        if (this.f79532) {
            return;
        }
        C18801 c18801 = this.f79530;
        C0902 c0902 = c18801.f61060;
        if (c0902.f3378 || c0902.f3374 || c0902.f3384 || !c0902.m3651() || c0902.f3375.getActivity() == null || c0902.f3375.requireActivity().isFinishing() || c0902.f3375.requireActivity().isDestroyed()) {
            m54810();
            return;
        }
        C0902 c0903 = c18801.f61060;
        if (!c0903.f3375.isResumed() || !c0903.f3375.isVisible()) {
            this.f79536 = -1L;
        } else {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (this.f79536 < 0) {
                this.f79536 = jUptimeMillis;
            }
            if (this.f79531 != null || this.f79533 != null) {
                m54810();
                String str = this.f79531;
                if (str == null) {
                    c18801.f61060.f3375.f23989.m4466(this.f79533);
                    return;
                } else {
                    C0902 c0904 = c18801.f61060;
                    c0904.m3667();
                    Main.m54((ActivityC18143) c0904.f3375.requireActivity(), str);
                    return;
                }
            }
            if (!this.f79537 && jUptimeMillis - this.f79536 >= this.f79540) {
                this.f79537 = true;
                final String str2 = "foregroundWaitMs=" + (jUptimeMillis - this.f79536) + "\n" + C0902.m3640(c18801.f61060);
                try {
                    this.f79538.execute(new Runnable() { // from class: l.ۗ᩵᩸
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            C24526.m54807(this.f12464, str2);
                        }
                    });
                } catch (RuntimeException e) {
                    this.f79533 = e;
                }
            }
        }
        this.f79535.postDelayed(this.f79534, 1000L);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m54807(final C24526 c24526, String str) throws Throwable {
        Handler handler = c24526.f79535;
        try {
            C24023 c24023 = c24526.f79539;
            final String strM54798 = m54798((InterfaceC24329) c24023.f77740, (String) c24023.f77741, str);
            handler.post(new Runnable() { // from class: l.᩵᩵᩸
                @Override // java.lang.Runnable
                public final void run() {
                    this.f66606.f79531 = strM54798;
                }
            });
        } catch (Exception e) {
            handler.post(new Runnable() { // from class: l.ۨ᩵᩸
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40423.f79533 = e;
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m54798(InterfaceC24329 interfaceC24329, String str, String str2) throws Throwable {
        AbstractC22044 abstractC22044M18134 = C6382.m18134();
        abstractC22044M18134.m49853();
        String str3 = "text-recovery-" + System.currentTimeMillis() + "-" + UUID.randomUUID() + ".zip";
        AbstractC22044 abstractC22044M49876 = abstractC22044M18134.m49876(str3);
        AbstractC22044 abstractC22044M49877 = abstractC22044M18134.m49876(str3 + ".tmp");
        boolean z = false;
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(abstractC22044M49877.m49869());
            try {
                zipOutputStream.setLevel(1);
                m54799(zipOutputStream, "diagnostics.txt", "version=2.26.11 (26110365)\npackage=" + C21576.m49092() + "\nmanufacturer=" + Build.MANUFACTURER + "\nmodel=" + Build.MODEL + "\nandroid=" + Build.VERSION.RELEASE + "\nsdk=" + Build.VERSION.SDK_INT + "\nstateName=" + str + "\ndirectory=" + interfaceC24329 + "\n" + str2);
                m54799(zipOutputStream, "threads.txt", m54806());
                m54799(zipOutputStream, "load-timings.txt", C6868.m19123());
                m54799(zipOutputStream, "logcat.txt", m54808());
                ArrayList arrayList = new ArrayList();
                InterfaceC24329 parent = interfaceC24329.toAbsolutePath().normalize().getParent();
                DirectoryStream<InterfaceC24329> directoryStreamNewDirectoryStream = C3445.newDirectoryStream(parent);
                try {
                    for (InterfaceC24329 interfaceC243210 : directoryStreamNewDirectoryStream) {
                        String string = interfaceC243210.getFileName().toString();
                        if (interfaceC243210.equals(interfaceC24329.toAbsolutePath().normalize()) || m54804(string, str)) {
                            arrayList.add(interfaceC243210);
                        }
                    }
                    directoryStreamNewDirectoryStream.close();
                    C12884.sort(arrayList, C2661.comparing(new C18061(1)));
                    StringBuilder sb = new StringBuilder("Live diagnostic copy; no session locks acquired.\nFiles may change while copying; before/after sizes and timestamps follow.\n");
                    if (arrayList.isEmpty()) {
                        sb.append("No session files found.\n");
                    }
                    byte[] bArr = new byte[65536];
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        m54800(zipOutputStream, parent, (InterfaceC24329) it.next(), bArr, sb);
                    }
                    m54799(zipOutputStream, "manifest.txt", sb.toString());
                    zipOutputStream.close();
                    if (!abstractC22044M49877.mo4301(abstractC22044M49876)) {
                        throw new IOException("Cannot publish session diagnostics archive");
                    }
                    try {
                        return abstractC22044M49876.mo4294();
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        if (!z) {
                            abstractC22044M49877.mo4296();
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
    public static boolean m54804(String str, String str2) {
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
    public static void m54800(ZipOutputStream zipOutputStream, InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210, byte[] bArr, StringBuilder sb) throws IOException {
        int i;
        String strReplace = interfaceC24329.relativize(interfaceC243210).toString().replace('\\', '/');
        try {
            EnumC20599 enumC20599 = EnumC20599.NOFOLLOW_LINKS;
            InterfaceC8665 attributes = C3445.readAttributes(interfaceC243210, InterfaceC8665.class, enumC20599);
            if (attributes.isDirectory()) {
                ArrayList arrayList = new ArrayList();
                DirectoryStream directoryStreamNewDirectoryStream = C3445.newDirectoryStream(interfaceC243210);
                try {
                    Iterator it = directoryStreamNewDirectoryStream.iterator();
                    while (it.hasNext()) {
                        arrayList.add((InterfaceC24329) it.next());
                    }
                    directoryStreamNewDirectoryStream.close();
                    C12884.sort(arrayList, C2661.comparing(new C18061(1)));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        m54800(zipOutputStream, interfaceC24329, (InterfaceC24329) it2.next(), bArr, sb);
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
                    InputStream inputStreamNewInputStream = C3445.newInputStream(interfaceC243210, enumC20599);
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
                            InterfaceC8665 attributes2 = C3445.readAttributes(interfaceC243210, InterfaceC8665.class, EnumC20599.NOFOLLOW_LINKS);
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
    public static void m54799(ZipOutputStream zipOutputStream, String str, String str2) throws IOException {
        zipOutputStream.putNextEntry(new ZipEntry(str));
        zipOutputStream.write(str2.getBytes(StandardCharsets.UTF_8));
        zipOutputStream.closeEntry();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m54806() {
        StringBuilder sb = new StringBuilder();
        ArrayList<Map.Entry> arrayList = new ArrayList(Thread.getAllStackTraces().entrySet());
        C12884.sort(arrayList, C2661.comparing(new C7620(2)));
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
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m54808() {
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
