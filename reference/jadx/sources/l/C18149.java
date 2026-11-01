package l;

import android.text.TextUtils;
import java.io.File;

/* JADX INFO: renamed from: l.ᩳܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L51E */
/* JADX INFO: loaded from: classes4.dex */
public final class C18149 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f58037;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f58038;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final File f58039;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f58040;

    public C18149(File file, String str) {
        File absoluteFile = file.getAbsoluteFile();
        this.f58039 = absoluteFile;
        this.f58037 = str;
        this.f58040 = null;
        this.f58038 = absoluteFile.getPath().toLowerCase() + '/';
    }

    public C18149(File file, String str, String str2) {
        File absoluteFile = file.getAbsoluteFile();
        this.f58039 = absoluteFile;
        this.f58037 = str;
        this.f58040 = TextUtils.isEmpty(str2) ? null : str2;
        this.f58038 = absoluteFile.getPath().toLowerCase() + '/';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18149.class == obj.getClass()) {
            C18149 c18149 = (C18149) obj;
            String str = c18149.f58037;
            File file = c18149.f58039;
            File file2 = this.f58039;
            if (file2 == null ? file != null : !file2.equals(file)) {
                return false;
            }
            String str2 = this.f58037;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f58040;
            String str4 = c18149.f58040;
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
        File file = this.f58039;
        int iHashCode = (file != null ? file.hashCode() : 0) * 31;
        String str = this.f58037;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f58040;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
