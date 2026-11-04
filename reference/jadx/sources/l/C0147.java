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

/* JADX INFO: renamed from: l.֡ۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5CT */
/* JADX INFO: loaded from: classes2.dex */
public final class C0147 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f1116 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static List m1308(File file) {
        Charset charsetDefaultCharset = StandardCharsets.UTF_8;
        InterfaceC24329 path = C2503.toPath(file);
        int i = C18046.f59088;
        if (charsetDefaultCharset == null) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        return C3445.readAllLines(path, charsetDefaultCharset);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m1309(File file) throws IOException {
        Charset charsetDefaultCharset = StandardCharsets.UTF_8;
        int i = C18046.f59088;
        if (charsetDefaultCharset == null) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        byte[] bArr = C5125.f17846;
        InputStream inputStreamNewInputStream = C3445.newInputStream(C2503.toPath(file), new InterfaceC12394[0]);
        try {
            if (inputStreamNewInputStream == null) {
                throw new NullPointerException("input");
            }
            String strM15490 = C5125.m15490(inputStreamNewInputStream, charsetDefaultCharset);
            inputStreamNewInputStream.close();
            return strM15490;
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
        bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf)))))))));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1305(File file) {
        C17359.requireNonNull(file, "file");
        try {
            InterfaceC17803 interfaceC17803M54776 = C24517.m54776(C2503.toPath(file), C24517.f79503, EnumC21533.OVERRIDE_READ_ONLY);
            if (interfaceC17803M54776.mo7399().get() >= 1 || interfaceC17803M54776.mo7397().get() >= 1) {
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m1311(File file) throws IOException {
        C16076 c16076 = new C16076();
        C17359.requireNonNull(file, "directory");
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles((FileFilter) null);
            if (fileArrListFiles != null) {
                C19295.m44661(c16076, fileArrListFiles);
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m1307(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.isDirectory()) {
                m1311(file);
            }
        } catch (Exception unused) {
        }
        try {
            return file.delete();
        } catch (Exception unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m1312(File file) throws IOException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        throw new IOException("Cannot create directory '" + file + "'.");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static OutputStream m1310(File file) {
        return C24517.m54775(C2503.toPath(file));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1306(File file, byte[] bArr) {
        int length = bArr.length;
        OutputStream outputStreamM54775 = C24517.m54775(C2503.toPath(file));
        try {
            outputStreamM54775.write(bArr, 0, length);
            outputStreamM54775.close();
        } catch (Throwable th) {
            if (outputStreamM54775 != null) {
                try {
                    outputStreamM54775.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
