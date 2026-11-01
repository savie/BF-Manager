package l;

import android.system.ErrnoException;
import android.system.OsConstants;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩶۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6WY */
/* JADX INFO: loaded from: classes4.dex */
public final class C20040 extends IOException {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final EnumC15807 f64175;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC17217 f64176;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f64177;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f64178;

    public C20040(EnumC17217 enumC17217, EnumC15807 enumC15807, String str, String str2, String str3) {
        super(str3);
        this.f64176 = enumC17217;
        this.f64175 = enumC15807;
        this.f64178 = str;
        this.f64177 = str2;
    }

    public C20040(EnumC17217 enumC17217, EnumC15807 enumC15807, String str, String str2, String str3, Throwable th) {
        super(str3, th);
        this.f64176 = enumC17217;
        this.f64175 = enumC15807;
        this.f64178 = str;
        this.f64177 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC17217 m45398() {
        return this.f64176;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC15807 m45399() {
        return this.f64175;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m45400() {
        return this.f64178;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m45397() {
        return this.f64177;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20040 m45393(EnumC17217 enumC17217, String str, String str2, ErrnoException errnoException) {
        EnumC15807 enumC15807;
        int i = errnoException.errno;
        if (i == OsConstants.ENOENT) {
            enumC15807 = EnumC15807.NOT_FOUND;
        } else if (i == OsConstants.EEXIST) {
            enumC15807 = EnumC15807.ALREADY_EXISTS;
        } else if (i == OsConstants.ENOTDIR) {
            enumC15807 = EnumC15807.NOT_DIRECTORY;
        } else if (i == OsConstants.EISDIR) {
            enumC15807 = EnumC15807.NOT_REGULAR_FILE;
        } else if (i == OsConstants.ENOTEMPTY) {
            enumC15807 = EnumC15807.DIRECTORY_NOT_EMPTY;
        } else if (i == OsConstants.EACCES || i == OsConstants.EPERM || i == OsConstants.EROFS) {
            enumC15807 = EnumC15807.PERMISSION_DENIED;
        } else if (i == OsConstants.EXDEV) {
            enumC15807 = EnumC15807.CROSS_BACKEND;
        } else if (i == OsConstants.ENOSYS || i == OsConstants.ENOTSUP || i == OsConstants.EOPNOTSUPP) {
            enumC15807 = EnumC15807.UNSUPPORTED;
        } else {
            enumC15807 = EnumC15807.IO_ERROR;
        }
        return new C20040(enumC17217, enumC15807, str, str2, m45392(enumC17217, str, str2), errnoException);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20040 m45394(EnumC17217 enumC17217, String str, String str2, IOException iOException) {
        EnumC15807 enumC15807;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if (cause instanceof ErrnoException) {
                return m45393(enumC17217, str, str2, (ErrnoException) cause);
            }
        }
        String message = iOException.getMessage();
        String lowerCase = message == null ? "" : message.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("no such file") || lowerCase.contains("not found")) {
            enumC15807 = EnumC15807.NOT_FOUND;
        } else if (lowerCase.contains("file exists") || lowerCase.contains("already exists")) {
            enumC15807 = EnumC15807.ALREADY_EXISTS;
        } else if (lowerCase.contains("not a directory")) {
            enumC15807 = EnumC15807.NOT_DIRECTORY;
        } else if (lowerCase.contains("is a directory") || lowerCase.contains("not a regular file")) {
            enumC15807 = EnumC15807.NOT_REGULAR_FILE;
        } else if (lowerCase.contains("directory not empty")) {
            enumC15807 = EnumC15807.DIRECTORY_NOT_EMPTY;
        } else if (lowerCase.contains("permission denied") || lowerCase.contains("operation not permitted") || lowerCase.contains("read-only file system")) {
            enumC15807 = EnumC15807.PERMISSION_DENIED;
        } else if (lowerCase.contains("cross-device") || lowerCase.contains("cross device")) {
            enumC15807 = EnumC15807.CROSS_BACKEND;
        } else if (lowerCase.contains("unsupported") || lowerCase.contains("not supported")) {
            enumC15807 = EnumC15807.UNSUPPORTED;
        } else {
            enumC15807 = EnumC15807.IO_ERROR;
        }
        return new C20040(enumC17217, enumC15807, str, str2, m45392(enumC17217, str, str2), iOException);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C20040 m45396(EnumC17217 enumC17217, String str, String str2) {
        return new C20040(enumC17217, EnumC15807.UNSUPPORTED, str, str2, C22697.m50267(new StringBuilder(), m45392(enumC17217, str, str2), " is unsupported"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20040 m45395(EnumC17217 enumC17217, EnumC15807 enumC15807, String str, String str2) {
        return new C20040(enumC17217, enumC15807, str, str2, m45392(enumC17217, str, str2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45392(EnumC17217 enumC17217, String str, String str2) {
        if (str2 == null) {
            return "Checked file operation " + enumC17217 + " failed for " + str;
        }
        return "Checked file operation " + enumC17217 + " failed for " + str + " -> " + str2;
    }
}
