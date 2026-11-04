package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5T9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12126 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f38982;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f38983;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String[] f38984;

    public C12126(String str, String[] strArr) {
        this.f38984 = strArr;
        this.f38983 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String[] m30292() {
        return this.f38984;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m30291() {
        return this.f38983;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m30290() {
        if (this.f38982 == null) {
            StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
            String[] strArr = this.f38984;
            if (strArr != null) {
                for (String str : strArr) {
                    sb.append(str);
                }
            }
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            sb.append(this.f38983);
            this.f38982 = sb.toString();
        }
        return this.f38982;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12126.class == obj.getClass()) {
            C12126 c12126 = (C12126) obj;
            String str = c12126.f38983;
            if (!Arrays.equals(this.f38984, c12126.f38984)) {
                return false;
            }
            String str2 = this.f38983;
            if (str2 != null) {
                return str2.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f38984) * 31;
        String str = this.f38983;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
