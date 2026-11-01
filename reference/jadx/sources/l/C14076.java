package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H5T9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14076 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f46228;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f46229;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String[] f46230;

    public C14076(String str, String[] strArr) {
        this.f46230 = strArr;
        this.f46229 = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String[] m34051() {
        return this.f46230;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m34050() {
        return this.f46229;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m34049() {
        if (this.f46228 == null) {
            StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
            String[] strArr = this.f46230;
            if (strArr != null) {
                for (String str : strArr) {
                    sb.append(str);
                }
            }
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            sb.append(this.f46229);
            this.f46228 = sb.toString();
        }
        return this.f46228;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14076.class == obj.getClass()) {
            C14076 c14076 = (C14076) obj;
            String str = c14076.f46229;
            if (!Arrays.equals(this.f46230, c14076.f46230)) {
                return false;
            }
            String str2 = this.f46229;
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
        int iHashCode = Arrays.hashCode(this.f46230) * 31;
        String str = this.f46229;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
