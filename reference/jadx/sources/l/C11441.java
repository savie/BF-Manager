package l;

import android.content.pm.PackageInfo;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۧۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85H5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11441 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f35955;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final PackageInfo f35956;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f35957;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f35958;

    public /* synthetic */ C11441(int i, String str, PackageInfo packageInfo, int i2) {
        this(packageInfo, i, str);
    }

    public C11441(PackageInfo packageInfo, int i, String str) {
        this.f35958 = i;
        this.f35957 = str;
        this.f35956 = packageInfo;
    }

    public C11441(int i, String str) {
        this(null, i, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m28799() {
        if (this.f35955 == null) {
            PackageInfo packageInfo = this.f35956;
            if (packageInfo == null) {
                return null;
            }
            this.f35955 = C14364.m34796(packageInfo);
        }
        return this.f35955;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f35957);
        sb.append(" (");
        return C12669.m31437(this.f35958, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }
}
