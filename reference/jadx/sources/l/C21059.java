package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩷ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: O416 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21059 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C21059 f68583;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C21059 f68584;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C21059 f68585;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C21059 f68586;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C21059 f68587;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C21059 f68588;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C21059 f68589;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C21059 f68590;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C21059 f68591;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C21059 f68592;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C21059 f68593;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C21059 f68594 = new C21059(0);

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C21059 f68595;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte f68596;

    static {
        C21059 c21059 = new C21059(1);
        f68583 = c21059;
        C21059 c210510 = new C21059(2);
        f68585 = c210510;
        f68592 = new C21059(4);
        C21059 c210511 = new C21059(12);
        f68595 = c210511;
        C21059 c210512 = new C21059(16);
        f68586 = c210512;
        C21059 c210513 = new C21059(32);
        f68589 = c210513;
        f68584 = new C21059(64);
        f68588 = new C21059(127);
        f68590 = new C21059(132);
        f68587 = m47465(c210510, c21059);
        f68591 = m47465(c210511, c210512);
        m47465(c210511, c210513);
        f68593 = m47465(c210511, c210510);
        m47465(c210511, c210510, c21059);
    }

    public C21059(int i) {
        this.f68596 = (byte) i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21059 m47465(C21059... c21059Arr) {
        byte b = 0;
        for (C21059 c21059 : c21059Arr) {
            b = (byte) (b | c21059.f68596);
        }
        return new C21059(b);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m47468(C21059 c21059) {
        return ((~c21059.f68596) & this.f68596) == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47467(C21059 c21059) {
        return (c21059.f68596 & this.f68596) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumSet m47466() {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC7654.class);
        byte b = f68595.f68596;
        byte b2 = this.f68596;
        int i = b & b2;
        if (i != 0) {
            if (i == f68592.f68596) {
                enumSetNoneOf.add(EnumC7654.VAR);
            } else {
                enumSetNoneOf.add(EnumC7654.VAL);
            }
        }
        if ((f68586.f68596 & b2) != 0) {
            enumSetNoneOf.add(EnumC7654.METHOD);
        }
        if ((f68585.f68596 & b2) != 0) {
            enumSetNoneOf.add(EnumC7654.CLASS);
        }
        if ((f68583.f68596 & b2) != 0) {
            enumSetNoneOf.add(EnumC7654.PACKAGE);
        }
        if ((f68584.f68596 & b2) != 0) {
            enumSetNoneOf.add(EnumC7654.MODULE);
        }
        return enumSetNoneOf;
    }
}
