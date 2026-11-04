package l;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩷᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6F5 */
/* JADX INFO: loaded from: classes.dex */
public final class C22369 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File f72419;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f72420;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f72421;

    public C22369(String str) throws IOException {
        if (str == null) {
            throw new IOException("Missing APK path");
        }
        File file = new File(str);
        this.f72419 = file;
        if (!file.isFile()) {
            throw new IOException("APK is unavailable: ".concat(str));
        }
        this.f72421 = file.length();
        this.f72420 = file.lastModified();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22369) {
            C22369 c22369 = (C22369) obj;
            if (this.f72419.equals(c22369.f72419) && this.f72421 == c22369.f72421 && this.f72420 == c22369.f72420) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hash(this.f72419, Long.valueOf(this.f72421), Long.valueOf(this.f72420));
    }
}
