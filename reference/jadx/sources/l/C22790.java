package l;

import android.system.ErrnoException;
import android.system.OsConstants;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩸ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6WY */
/* JADX INFO: loaded from: classes.dex */
public final class C22790 extends IOException {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f73915;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC5636 f73916;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC10855 f73917;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f73918;

    public C22790(EnumC5636 enumC5636, EnumC10855 enumC10855, String str, String str2, String str3) {
        super(str3);
        this.f73916 = enumC5636;
        this.f73917 = enumC10855;
        this.f73918 = str;
        this.f73915 = str2;
    }

    public C22790(EnumC5636 enumC5636, EnumC10855 enumC10855, String str, String str2, String str3, Throwable th) {
        super(str3, th);
        this.f73916 = enumC5636;
        this.f73917 = enumC10855;
        this.f73918 = str;
        this.f73915 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC5636 m51408() {
        return this.f73916;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC10855 m51409() {
        return this.f73917;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m51410() {
        return this.f73918;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m51411() {
        return this.f73915;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22790 m51404(EnumC5636 enumC5636, String str, String str2, ErrnoException errnoException) {
        EnumC10855 enumC10855;
        int i = errnoException.errno;
        if (i == OsConstants.ENOENT) {
            enumC10855 = EnumC10855.NOT_FOUND;
        } else if (i == OsConstants.EEXIST) {
            enumC10855 = EnumC10855.ALREADY_EXISTS;
        } else if (i == OsConstants.ENOTDIR) {
            enumC10855 = EnumC10855.NOT_DIRECTORY;
        } else if (i == OsConstants.EISDIR) {
            enumC10855 = EnumC10855.NOT_REGULAR_FILE;
        } else if (i == OsConstants.ENOTEMPTY) {
            enumC10855 = EnumC10855.DIRECTORY_NOT_EMPTY;
        } else if (i == OsConstants.EACCES || i == OsConstants.EPERM || i == OsConstants.EROFS) {
            enumC10855 = EnumC10855.PERMISSION_DENIED;
        } else if (i == OsConstants.EXDEV) {
            enumC10855 = EnumC10855.CROSS_BACKEND;
        } else if (i == OsConstants.ENOSYS || i == OsConstants.ENOTSUP || i == OsConstants.EOPNOTSUPP) {
            enumC10855 = EnumC10855.UNSUPPORTED;
        } else {
            enumC10855 = EnumC10855.IO_ERROR;
        }
        return new C22790(enumC5636, enumC10855, str, str2, m51403(enumC5636, str, str2), errnoException);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22790 m51405(EnumC5636 enumC5636, String str, String str2, IOException iOException) {
        EnumC10855 enumC10855;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if (cause instanceof ErrnoException) {
                return m51404(enumC5636, str, str2, (ErrnoException) cause);
            }
        }
        String message = iOException.getMessage();
        String lowerCase = message == null ? "" : message.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("no such file") || lowerCase.contains("not found")) {
            enumC10855 = EnumC10855.NOT_FOUND;
        } else if (lowerCase.contains("file exists") || lowerCase.contains("already exists")) {
            enumC10855 = EnumC10855.ALREADY_EXISTS;
        } else if (lowerCase.contains("not a directory")) {
            enumC10855 = EnumC10855.NOT_DIRECTORY;
        } else if (lowerCase.contains("is a directory") || lowerCase.contains("not a regular file")) {
            enumC10855 = EnumC10855.NOT_REGULAR_FILE;
        } else if (lowerCase.contains("directory not empty")) {
            enumC10855 = EnumC10855.DIRECTORY_NOT_EMPTY;
        } else if (lowerCase.contains("permission denied") || lowerCase.contains("operation not permitted") || lowerCase.contains("read-only file system")) {
            enumC10855 = EnumC10855.PERMISSION_DENIED;
        } else if (lowerCase.contains("cross-device") || lowerCase.contains("cross device")) {
            enumC10855 = EnumC10855.CROSS_BACKEND;
        } else if (lowerCase.contains("unsupported") || lowerCase.contains("not supported")) {
            enumC10855 = EnumC10855.UNSUPPORTED;
        } else {
            enumC10855 = EnumC10855.IO_ERROR;
        }
        return new C22790(enumC5636, enumC10855, str, str2, m51403(enumC5636, str, str2), iOException);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C22790 m51407(EnumC5636 enumC5636, String str, String str2) {
        return new C22790(enumC5636, EnumC10855.UNSUPPORTED, str, str2, C8947.m23910(new StringBuilder(), m51403(enumC5636, str, str2), " is unsupported"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22790 m51406(EnumC5636 enumC5636, EnumC10855 enumC10855, String str, String str2) {
        return new C22790(enumC5636, enumC10855, str, str2, m51403(enumC5636, str, str2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m51403(EnumC5636 enumC5636, String str, String str2) {
        if (str2 == null) {
            return "Checked file operation " + enumC5636 + " failed for " + str;
        }
        return "Checked file operation " + enumC5636 + " failed for " + str + " -> " + str2;
    }
}
