package l;

import android.text.TextUtils;
import java.io.File;

/* JADX INFO: renamed from: l.ܺܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L51E */
/* JADX INFO: loaded from: classes4.dex */
public final class C16997 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f55537;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final File f55538;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f55539;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f55540;

    public C16997(File file, String str) {
        File absoluteFile = file.getAbsoluteFile();
        this.f55538 = absoluteFile;
        this.f55540 = str;
        this.f55539 = null;
        this.f55537 = absoluteFile.getPath().toLowerCase() + '/';
    }

    public C16997(File file, String str, String str2) {
        File absoluteFile = file.getAbsoluteFile();
        this.f55538 = absoluteFile;
        this.f55540 = str;
        this.f55539 = TextUtils.isEmpty(str2) ? null : str2;
        this.f55537 = absoluteFile.getPath().toLowerCase() + '/';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16997.class == obj.getClass()) {
            C16997 c16997 = (C16997) obj;
            String str = c16997.f55540;
            File file = c16997.f55538;
            File file2 = this.f55538;
            if (file2 == null ? file != null : !file2.equals(file)) {
                return false;
            }
            String str2 = this.f55540;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f55539;
            String str4 = c16997.f55539;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        File file = this.f55538;
        int iHashCode = (file != null ? file.hashCode() : 0) * 31;
        String str = this.f55540;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55539;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
