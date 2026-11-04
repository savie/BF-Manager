package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܳ۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 63QR */
/* JADX INFO: loaded from: classes4.dex */
public final class C15204 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f49633;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC12967 f49634;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C15204 f49630 = new C15204(EnumC12967.ARRAY);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C15204 f49632 = new C15204(EnumC12967.INNER_TYPE);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C15204 f49631 = new C15204(EnumC12967.WILDCARD);

    public C15204(EnumC12967 enumC12967) {
        C11972.m30026(enumC12967 == EnumC12967.ARRAY || enumC12967 == EnumC12967.INNER_TYPE || enumC12967 == EnumC12967.WILDCARD);
        this.f49634 = enumC12967;
        this.f49633 = 0;
    }

    public C15204(EnumC12967 enumC12967, int i) {
        C11972.m30026(enumC12967 == EnumC12967.TYPE_ARGUMENT);
        this.f49634 = enumC12967;
        this.f49633 = i;
    }

    public final String toString() {
        String strM31437;
        StringBuilder sb = new StringBuilder();
        EnumC12967 enumC12967 = this.f49634;
        sb.append(enumC12967.toString());
        if (enumC12967 == EnumC12967.TYPE_ARGUMENT) {
            strM31437 = C12669.m31437(this.f49633, MotionUtils.EASING_TYPE_FORMAT_END, new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START));
        } else {
            strM31437 = "";
        }
        sb.append(strM31437);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15204)) {
            return false;
        }
        C15204 c15204 = (C15204) obj;
        return this.f49634 == c15204.f49634 && this.f49633 == c15204.f49633;
    }

    public final int hashCode() {
        return (this.f49634.hashCode() * 17) + this.f49633;
    }
}
