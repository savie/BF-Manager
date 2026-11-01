package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.NoSuchFileException;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G5CT */
/* JADX INFO: loaded from: classes4.dex */
public final class C15071 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f49127 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static List m36105(File file) {
        Charset charsetDefaultCharset = StandardCharsets.UTF_8;
        InterfaceC3800 path = C7412.toPath(file);
        int i = C22832.f74282;
        if (charsetDefaultCharset == null) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        return C5212.readAllLines(path, charsetDefaultCharset);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m36112(File file) throws IOException {
        Charset charsetDefaultCharset = StandardCharsets.UTF_8;
        int i = C22832.f74282;
        if (charsetDefaultCharset == null) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        byte[] bArr = C20010.f64054;
        InputStream inputStreamNewInputStream = C5212.newInputStream(C7412.toPath(file), new InterfaceC0978[0]);
        try {
            if (inputStreamNewInputStream == null) {
                throw new NullPointerException("input");
            }
            String strM45297 = C20010.m45297(inputStreamNewInputStream, charsetDefaultCharset);
            inputStreamNewInputStream.close();
            return strM45297;
        } catch (Throwable th) {
            if (inputStreamNewInputStream != null) {
                try {
                    inputStreamNewInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
        bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf)))));
        bigIntegerValueOf.multiply(BigInteger.valueOf(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS).multiply(BigInteger.valueOf(1152921504606846976L)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36107(File file) {
        C13638.requireNonNull(file, "file");
        try {
            InterfaceC9427 interfaceC9427M50102 = C22604.m50102(C7412.toPath(file), C22604.f73661, EnumC7081.OVERRIDE_READ_ONLY);
            if (interfaceC9427M50102.mo24188().get() >= 1 || interfaceC9427M50102.mo24187().get() >= 1) {
                return;
            }
            throw new FileNotFoundException("File does not exist: " + file);
        } catch (NoSuchFileException e) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Cannot delete file: " + file);
            fileNotFoundException.initCause(e);
            throw fileNotFoundException;
        } catch (IOException e2) {
            throw new IOException("Cannot delete file: " + file, e2);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m36111(File file) throws IOException {
        C20630 c20630 = new C20630();
        C13638.requireNonNull(file, "directory");
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles((FileFilter) null);
            if (fileArrListFiles != null) {
                C8493.m22191(c20630, fileArrListFiles);
                return;
            } else {
                throw new IOException("Unknown I/O error listing contents of directory: " + file);
            }
        }
        if (file.exists()) {
            throw new IllegalArgumentException("Parameter 'directory' is not a directory: '" + file + "'");
        }
        throw new FileNotFoundException("Directory '" + file + "' does not exist.");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m36110(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.isDirectory()) {
                m36111(file);
            }
        } catch (Exception unused) {
        }
        try {
            return file.delete();
        } catch (Exception unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m36106(File file) throws IOException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        throw new IOException("Cannot create directory '" + file + "'.");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static OutputStream m36109(File file) {
        return C22604.m50101(C7412.toPath(file));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36108(File file, byte[] bArr) {
        int length = bArr.length;
        OutputStream outputStreamM50101 = C22604.m50101(C7412.toPath(file));
        try {
            outputStreamM50101.write(bArr, 0, length);
            outputStreamM50101.close();
        } catch (Throwable th) {
            if (outputStreamM50101 != null) {
                try {
                    outputStreamM50101.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
