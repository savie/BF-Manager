package l;

import android.content.pm.PackageInfo;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܳۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85H5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14459 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f47424;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f47425;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final PackageInfo f47426;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f47427;

    public /* synthetic */ C14459(int i, String str, PackageInfo packageInfo, int i2) {
        this(packageInfo, i, str);
    }

    public C14459(PackageInfo packageInfo, int i, String str) {
        this.f47424 = i;
        this.f47427 = str;
        this.f47426 = packageInfo;
    }

    public C14459(int i, String str) {
        this(null, i, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m34862() {
        if (this.f47425 == null) {
            PackageInfo packageInfo = this.f47426;
            if (packageInfo == null) {
                return null;
            }
            this.f47425 = C16899.m39576(packageInfo);
        }
        return this.f47425;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f47427);
        sb.append(" (");
        return C12441.m30911(this.f47424, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }
}
