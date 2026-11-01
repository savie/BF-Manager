package l;

import android.graphics.drawable.Drawable;
import com.google.android.material.motion.MotionUtils;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.ᩳ᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 316P */
/* JADX INFO: loaded from: classes4.dex */
public final class C18310 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Drawable f58401;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f58402;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f58403;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f58404;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f58405;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f58406;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f58407;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f58408;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f58409;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f58410;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18310)) {
            return false;
        }
        C18310 c18310 = (C18310) obj;
        return C13465.m32965((Object) this.f58410, (Object) c18310.f58410) && C13465.m32965((Object) this.f58407, (Object) c18310.f58407) && C13465.m32965((Object) this.f58406, (Object) c18310.f58406) && this.f58403 == c18310.f58403 && this.f58402 == c18310.f58402 && this.f58408 == c18310.f58408 && this.f58405 == c18310.f58405 && C13465.m32965(this.f58404, c18310.f58404) && C13465.m32965(this.f58401, c18310.f58401) && this.f58409 == c18310.f58409;
    }

    public final String toString() {
        StringBuilder sbM30515 = C12278.m30515("ApkInfo(packageName=", this.f58410, ", label=", this.f58407, ", versionName=");
        sbM30515.append(this.f58406);
        sbM30515.append(", versionCode=");
        sbM30515.append(this.f58403);
        sbM30515.append(", length=");
        sbM30515.append(this.f58402);
        sbM30515.append(", targetSdk=");
        C23821.m52500(sbM30515, this.f58408, ", minimumSdk=", this.f58405, ", icon=");
        sbM30515.append(this.f58404);
        sbM30515.append(", rawIcon=");
        sbM30515.append(this.f58401);
        sbM30515.append(", iconRes=");
        return C12441.m30911(this.f58409, MotionUtils.EASING_TYPE_FORMAT_END, sbM30515);
    }

    public final int hashCode() {
        int iM33812 = C13958.m33812(C13958.m33812(this.f58410.hashCode() * 31, 31, this.f58407), 31, this.f58406);
        long j = this.f58403;
        int i = (iM33812 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f58402;
        return ((this.f58401.hashCode() + ((this.f58404.hashCode() + ((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f58408) * 31) + this.f58405) * 31)) * 31)) * 31) + this.f58409;
    }

    public C18310(String str, String str2, String str3, long j, long j2, int i, int i2, Drawable drawable, Drawable drawable2, int i3) {
        C13465.m32966(str2, AnnotatedPrivateKey.LABEL);
        this.f58410 = str;
        this.f58407 = str2;
        this.f58406 = str3;
        this.f58403 = j;
        this.f58402 = j2;
        this.f58408 = i;
        this.f58405 = i2;
        this.f58404 = drawable;
        this.f58401 = drawable2;
        this.f58409 = i3;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m42535() {
        return this.f58410;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m42532() {
        return this.f58407;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m42531() {
        return this.f58406;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m42528() {
        return this.f58403;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m42527() {
        return this.f58402;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m42533() {
        return this.f58408;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m42530() {
        return this.f58405;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable m42529() {
        return this.f58404;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Drawable m42526() {
        return this.f58401;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m42534() {
        return this.f58409;
    }
}
