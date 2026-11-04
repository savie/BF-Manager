package l;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.system.Os;
import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.w.a;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.d;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: l.ۢ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D98Y */
/* JADX INFO: loaded from: classes4.dex */
public class BinderC9992 extends AbstractBinderC15959 {
    @InterfaceC19352
    public BinderC9992() {
        attachInterface(this, "bin.mt.shell.IShizukuCommand");
    }

    @Override // l.InterfaceC23419
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo25846() {
        return Os.getuid();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25843(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25844(Process process) {
        if (process == null) {
            return;
        }
        try {
            process.destroy();
        } catch (Exception unused) {
        }
        try {
            if (Build.VERSION.SDK_INT < 26 || !process.isAlive()) {
                return;
            }
            process.destroyForcibly();
        } catch (Exception unused2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0075 A[Catch: all -> 0x00a6, InterruptedException -> 0x00a9, TryCatch #9 {InterruptedException -> 0x00a9, all -> 0x00a6, blocks: (B:16:0x003a, B:18:0x0075, B:20:0x007c, B:25:0x0092, B:24:0x008f), top: B:56:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:20:0x007c A[Catch: all -> 0x00a6, InterruptedException -> 0x00a9, TRY_LEAVE, TryCatch #9 {InterruptedException -> 0x00a9, all -> 0x00a6, blocks: (B:16:0x003a, B:18:0x0075, B:20:0x007c, B:25:0x0092, B:24:0x008f), top: B:56:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:24:0x008f A[Catch: all -> 0x00a6, InterruptedException -> 0x00a9, TRY_ENTER, TryCatch #9 {InterruptedException -> 0x00a9, all -> 0x00a6, blocks: (B:16:0x003a, B:18:0x0075, B:20:0x007c, B:25:0x0092, B:24:0x008f), top: B:56:0x003a }] */
    @Override // l.InterfaceC23419
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle mo25847(int i, String str, String str2) throws Throwable {
        InputStream inputStream;
        Process processExec;
        Closeable closeable;
        Closeable closeable2;
        OutputStream outputStream;
        Bundle bundleM25845;
        InputStream inputStream2 = null;
        try {
            processExec = Runtime.getRuntime().exec(str);
            try {
                if (str2 != null) {
                    try {
                        if (str2.length() > 0) {
                            outputStream = processExec.getOutputStream();
                            try {
                                outputStream.write(str2.getBytes(a.D));
                                outputStream.flush();
                            } catch (InterruptedException e) {
                                e = e;
                                closeable2 = null;
                                try {
                                    Thread.currentThread().interrupt();
                                    bundleM25845 = m25845(2, "", e.toString());
                                    m25843(outputStream);
                                    m25843(inputStream2);
                                    m25843(closeable2);
                                    m25844(processExec);
                                    return bundleM25845;
                                } catch (Throwable th) {
                                    th = th;
                                    closeable = closeable2;
                                    inputStream = inputStream2;
                                    inputStream2 = outputStream;
                                    m25843(inputStream2);
                                    m25843(inputStream);
                                    m25843(closeable);
                                    m25844(processExec);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = null;
                                closeable = null;
                                inputStream2 = outputStream;
                                try {
                                    bundleM25845 = m25845(2, "", th.toString());
                                    m25843(inputStream2);
                                    m25843(inputStream);
                                    m25843(closeable);
                                    m25844(processExec);
                                    return bundleM25845;
                                } catch (Throwable th3) {
                                    th = th3;
                                    m25843(inputStream2);
                                    m25843(inputStream);
                                    m25843(closeable);
                                    m25844(processExec);
                                    throw th;
                                }
                            }
                        }
                        inputStream = processExec.getInputStream();
                        InputStream errorStream = processExec.getErrorStream();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Thread thread = new Thread(new RunnableC18943(inputStream, byteArrayOutputStream));
                        thread.setDaemon(true);
                        thread.setName("ShizukuCommand-stdout");
                        thread.start();
                        Thread thread2 = new Thread(new RunnableC18943(errorStream, byteArrayOutputStream2));
                        thread2.setDaemon(true);
                        thread2.setName("ShizukuCommand-stderr");
                        thread2.start();
                        if (i > 0) {
                            if (!C13069.m32548(processExec, i)) {
                                bundleM25845 = m25845(1, "", "Process timeout");
                            }
                            m25843(outputStream);
                            m25843(inputStream);
                            m25843(errorStream);
                            m25844(processExec);
                            return bundleM25845;
                        }
                        processExec.waitFor();
                        thread.join();
                        thread2.join();
                        bundleM25845 = m25845(0, byteArrayOutputStream.toString(a.D), byteArrayOutputStream2.toString(a.D));
                        m25843(outputStream);
                        m25843(inputStream);
                        m25843(errorStream);
                    } catch (InterruptedException e2) {
                        e = e2;
                        closeable2 = null;
                        outputStream = null;
                        Thread.currentThread().interrupt();
                        bundleM25845 = m25845(2, "", e.toString());
                        m25843(outputStream);
                        m25843(inputStream2);
                        m25843(closeable2);
                        m25844(processExec);
                        return bundleM25845;
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                        closeable = null;
                        bundleM25845 = m25845(2, "", th.toString());
                        m25843(inputStream2);
                        m25843(inputStream);
                        m25843(closeable);
                    }
                    m25844(processExec);
                    return bundleM25845;
                }
                InputStream errorStream2 = processExec.getErrorStream();
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                Thread thread3 = new Thread(new RunnableC18943(inputStream, byteArrayOutputStream3));
                thread3.setDaemon(true);
                thread3.setName("ShizukuCommand-stdout");
                thread3.start();
                Thread thread4 = new Thread(new RunnableC18943(errorStream2, byteArrayOutputStream4));
                thread4.setDaemon(true);
                thread4.setName("ShizukuCommand-stderr");
                thread4.start();
                if (i > 0) {
                    if (!C13069.m32548(processExec, i)) {
                        bundleM25845 = m25845(1, "", "Process timeout");
                    }
                    m25843(outputStream);
                    m25843(inputStream);
                    m25843(errorStream2);
                    m25844(processExec);
                    return bundleM25845;
                }
                processExec.waitFor();
                thread3.join();
                thread4.join();
                bundleM25845 = m25845(0, byteArrayOutputStream3.toString(a.D), byteArrayOutputStream4.toString(a.D));
                m25843(outputStream);
                m25843(inputStream);
                m25843(errorStream2);
            } catch (InterruptedException e3) {
                e = e3;
                inputStream2 = inputStream;
                closeable2 = null;
                Thread.currentThread().interrupt();
                bundleM25845 = m25845(2, "", e.toString());
                m25843(outputStream);
                m25843(inputStream2);
                m25843(closeable2);
            } catch (Throwable th5) {
                th = th5;
                closeable = null;
                inputStream2 = outputStream;
                bundleM25845 = m25845(2, "", th.toString());
                m25843(inputStream2);
                m25843(inputStream);
                m25843(closeable);
            }
            outputStream = null;
            inputStream = processExec.getInputStream();
        } catch (InterruptedException e4) {
            e = e4;
            closeable2 = null;
            processExec = null;
            outputStream = null;
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
            processExec = null;
            closeable = null;
        }
        m25844(processExec);
        return bundleM25845;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Bundle m25845(int i, String str, String str2) {
        Bundle bundleM25841 = m25841(str, i, str2, false);
        long length = 16;
        long length2 = ((str == null || str.length() == 0) ? 16L : (((long) str.length()) * 2) + 16) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        if (str2 != null && str2.length() != 0) {
            length = 16 + (((long) str2.length()) * 2);
        }
        if (length2 + length > Math.max(0, 245760)) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                bundleM25841.writeToParcel(parcelObtain, 0);
                int iDataSize = parcelObtain.dataSize();
                parcelObtain.recycle();
                if (iDataSize > 262144) {
                    Bundle bundleM25842 = m25841(str, i, str2, true);
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        bundleM25842.writeToParcel(parcelObtain2, 0);
                        int iDataSize2 = parcelObtain2.dataSize();
                        parcelObtain2.recycle();
                        return iDataSize2 <= 262144 ? bundleM25842 : m25841("", 2, "Command output too large after compression", false);
                    } catch (Throwable th) {
                        parcelObtain2.recycle();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                parcelObtain.recycle();
                throw th2;
            }
        }
        return bundleM25841;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bundle m25841(String str, int i, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt(c.a, i);
        m25842(bundle, "output", "output_gzip", str, z);
        m25842(bundle, d.O, "error_gzip", str2, z);
        return bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25842(Bundle bundle, String str, String str2, String str3, boolean z) {
        if (str3 == null) {
            str3 = "";
        }
        if (!z || str3.length() == 0) {
            bundle.putString(str, str3);
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(str3.getBytes(StandardCharsets.UTF_8));
                gZIPOutputStream.close();
                bundle.putByteArray(str2, byteArrayOutputStream.toByteArray());
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            bundle.putString(str, "Command output too large after compression");
        }
    }
}
