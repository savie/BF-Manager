package l;

import android.graphics.drawable.Drawable;
import com.google.android.material.motion.MotionUtils;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.ۧۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 316P */
/* JADX INFO: loaded from: classes3.dex */
public final class C11381 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f35821;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f35822;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f35823;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f35824;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f35825;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Drawable f35826;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f35827;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f35828;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f35829;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f35830;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11381)) {
            return false;
        }
        C11381 c11381 = (C11381) obj;
        return C15243.m36589((Object) this.f35827, (Object) c11381.f35827) && C15243.m36589((Object) this.f35824, (Object) c11381.f35824) && C15243.m36589((Object) this.f35825, (Object) c11381.f35825) && this.f35821 == c11381.f35821 && this.f35830 == c11381.f35830 && this.f35823 == c11381.f35823 && this.f35828 == c11381.f35828 && C15243.m36589(this.f35822, c11381.f35822) && C15243.m36589(this.f35826, c11381.f35826) && this.f35829 == c11381.f35829;
    }

    public final String toString() {
        StringBuilder sbM10406 = C3188.m10406("ApkInfo(packageName=", this.f35827, ", label=", this.f35824, ", versionName=");
        sbM10406.append(this.f35825);
        sbM10406.append(", versionCode=");
        sbM10406.append(this.f35821);
        sbM10406.append(", length=");
        sbM10406.append(this.f35830);
        sbM10406.append(", targetSdk=");
        sbM10406.append(this.f35823);
        sbM10406.append(", minimumSdk=");
        sbM10406.append(this.f35828);
        sbM10406.append(", icon=");
        sbM10406.append(this.f35822);
        sbM10406.append(", rawIcon=");
        sbM10406.append(this.f35826);
        sbM10406.append(", iconRes=");
        return C12669.m31437(this.f35829, MotionUtils.EASING_TYPE_FORMAT_END, sbM10406);
    }

    public final int hashCode() {
        int iM30817 = C12351.m30817(C12351.m30817(this.f35827.hashCode() * 31, 31, this.f35824), 31, this.f35825);
        long j = this.f35821;
        int i = (iM30817 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f35830;
        return ((this.f35826.hashCode() + ((this.f35822.hashCode() + ((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f35823) * 31) + this.f35828) * 31)) * 31)) * 31) + this.f35829;
    }

    public C11381(String str, String str2, String str3, long j, long j2, int i, int i2, Drawable drawable, Drawable drawable2, int i3) {
        C15243.m36590(str2, AnnotatedPrivateKey.LABEL);
        this.f35827 = str;
        this.f35824 = str2;
        this.f35825 = str3;
        this.f35821 = j;
        this.f35830 = j2;
        this.f35823 = i;
        this.f35828 = i2;
        this.f35822 = drawable;
        this.f35826 = drawable2;
        this.f35829 = i3;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m28718() {
        return this.f35827;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m28715() {
        return this.f35824;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m28716() {
        return this.f35825;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m28712() {
        return this.f35821;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m28721() {
        return this.f35830;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m28714() {
        return this.f35823;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m28719() {
        return this.f35828;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable m28713() {
        return this.f35822;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Drawable m28717() {
        return this.f35826;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m28720() {
        return this.f35829;
    }
}
