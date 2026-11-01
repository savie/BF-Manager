package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܿۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 63QR */
/* JADX INFO: loaded from: classes4.dex */
public final class C17284 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f55039;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC5995 f55040;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C17284 f55038 = new C17284(EnumC5995.ARRAY);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C17284 f55036 = new C17284(EnumC5995.INNER_TYPE);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C17284 f55037 = new C17284(EnumC5995.WILDCARD);

    public C17284(EnumC5995 enumC5995) {
        C6171.m17176(enumC5995 == EnumC5995.ARRAY || enumC5995 == EnumC5995.INNER_TYPE || enumC5995 == EnumC5995.WILDCARD);
        this.f55040 = enumC5995;
        this.f55039 = 0;
    }

    public C17284(EnumC5995 enumC5995, int i) {
        C6171.m17176(enumC5995 == EnumC5995.TYPE_ARGUMENT);
        this.f55040 = enumC5995;
        this.f55039 = i;
    }

    public final String toString() {
        String strM30911;
        StringBuilder sb = new StringBuilder();
        EnumC5995 enumC5995 = this.f55040;
        sb.append(enumC5995.toString());
        if (enumC5995 == EnumC5995.TYPE_ARGUMENT) {
            strM30911 = C12441.m30911(this.f55039, MotionUtils.EASING_TYPE_FORMAT_END, new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START));
        } else {
            strM30911 = "";
        }
        sb.append(strM30911);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17284)) {
            return false;
        }
        C17284 c17284 = (C17284) obj;
        return this.f55040 == c17284.f55040 && this.f55039 == c17284.f55039;
    }

    public final int hashCode() {
        return (this.f55040.hashCode() * 17) + this.f55039;
    }
}
