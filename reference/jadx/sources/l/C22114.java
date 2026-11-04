package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩷ܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: O416 */
/* JADX INFO: loaded from: classes.dex */
public final class C22114 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C22114 f71269;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C22114 f71270;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C22114 f71271;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C22114 f71272;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C22114 f71273;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C22114 f71274 = new C22114(0);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C22114 f71275;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C22114 f71276;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C22114 f71277;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C22114 f71278;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C22114 f71279;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C22114 f71280;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C22114 f71281;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte f71282;

    static {
        C22114 c22114 = new C22114(1);
        f71273 = c22114;
        C22114 c22115 = new C22114(2);
        f71269 = c22115;
        f71275 = new C22114(4);
        C22114 c22116 = new C22114(12);
        f71281 = c22116;
        C22114 c22117 = new C22114(16);
        f71278 = c22117;
        C22114 c22118 = new C22114(32);
        f71270 = c22118;
        f71280 = new C22114(64);
        f71271 = new C22114(127);
        f71279 = new C22114(132);
        f71272 = m50067(c22115, c22114);
        f71276 = m50067(c22116, c22117);
        m50067(c22116, c22118);
        f71277 = m50067(c22116, c22115);
        m50067(c22116, c22115, c22114);
    }

    public C22114(int i) {
        this.f71282 = (byte) i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22114 m50067(C22114... c22114Arr) {
        byte b = 0;
        for (C22114 c22114 : c22114Arr) {
            b = (byte) (b | c22114.f71282);
        }
        return new C22114(b);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m50070(C22114 c22114) {
        return ((~c22114.f71282) & this.f71282) == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50069(C22114 c22114) {
        return (c22114.f71282 & this.f71282) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumSet m50068() {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC4960.class);
        byte b = f71281.f71282;
        byte b2 = this.f71282;
        int i = b & b2;
        if (i != 0) {
            if (i == f71275.f71282) {
                enumSetNoneOf.add(EnumC4960.VAR);
            } else {
                enumSetNoneOf.add(EnumC4960.VAL);
            }
        }
        if ((f71278.f71282 & b2) != 0) {
            enumSetNoneOf.add(EnumC4960.METHOD);
        }
        if ((f71269.f71282 & b2) != 0) {
            enumSetNoneOf.add(EnumC4960.CLASS);
        }
        if ((f71273.f71282 & b2) != 0) {
            enumSetNoneOf.add(EnumC4960.PACKAGE);
        }
        if ((f71280.f71282 & b2) != 0) {
            enumSetNoneOf.add(EnumC4960.MODULE);
        }
        return enumSetNoneOf;
    }
}
