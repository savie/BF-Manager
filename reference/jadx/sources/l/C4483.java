package l;

import java.nio.CharBuffer;

/* JADX INFO: renamed from: l.ۘ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: D3ZV */
/* JADX INFO: loaded from: classes2.dex */
public final class C4483 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C13477 f16029 = new C13477();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15714 f16030;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15252 f16031;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EnumC20820 f16032;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21637 f16033;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C17638 f16034;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7312 f16035;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C13015 f16036;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4483 m14186(C4747 c4747) {
        C4483 c4483 = (C4483) c4747.m14643(f16029);
        return c4483 == null ? new C4483(c4747) : c4483;
    }

    public C4483(C4747 c4747) {
        c4747.m14646(f16029, this);
        this.f16030 = C15714.m37502(c4747);
        C5689.m16709(c4747);
        this.f16035 = C7312.m20023(c4747);
        this.f16031 = C15252.m36599(c4747);
        if (((C14177) c4747.m14643(C14177.f44827)) == null) {
            new C14177(c4747);
        }
        this.f16032 = EnumC20820.m47625(c4747);
        this.f16034 = C17638.m41289(c4747);
        this.f16036 = C13015.m32421(c4747);
        this.f16033 = C21637.m49171(c4747);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23875 m14187(CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4) {
        C14923 c14923;
        C14923 c14924;
        C21637 c21637 = this.f16033;
        c21637.getClass();
        if (charSequence instanceof CharBuffer) {
            CharBuffer charBuffer = (CharBuffer) charSequence;
            if (z) {
                c14924 = new C14923(c21637, new C12686(c21637, charBuffer));
            } else {
                c14924 = new C14923(c21637, new C13652(c21637, charBuffer));
            }
        } else {
            char[] charArray = charSequence.toString().toCharArray();
            int length = charArray.length;
            if (z) {
                c14923 = new C14923(c21637, new C12686(c21637, charArray, length));
            } else {
                c14923 = new C14923(c21637, new C13652(c21637, charArray, length));
            }
            c14924 = c14923;
        }
        return new C23875(this, c14924, z, z3, z2, z4);
    }
}
