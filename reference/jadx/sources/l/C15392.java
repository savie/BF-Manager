package l;

import java.nio.CharBuffer;

/* JADX INFO: renamed from: l.ܶᩳ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: D3ZV */
/* JADX INFO: loaded from: classes4.dex */
public final class C15392 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C16576 f50095 = new C16576();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final EnumC11909 f50096;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14770 f50097;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5286 f50098;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2008 f50099;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23942 f50100;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20414 f50101;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C18213 f50102;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15392 m36825(C12343 c12343) {
        C15392 c15392 = (C15392) c12343.m30656(f50095);
        return c15392 == null ? new C15392(c12343) : c15392;
    }

    public C15392(C12343 c12343) {
        c12343.m30659(f50095, this);
        this.f50098 = C5286.m14576(c12343);
        C3416.m10130(c12343);
        this.f50101 = C20414.m46161(c12343);
        this.f50100 = C23942.m52776(c12343);
        if (((C16802) c12343.m30656(C16802.f53795)) == null) {
            new C16802(c12343);
        }
        this.f50096 = EnumC11909.m29706(c12343);
        this.f50099 = C2008.m6467(c12343);
        this.f50097 = C14770.m35395(c12343);
        this.f50102 = C18213.m42339(c12343);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22447 m36826(CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4) {
        C21741 c21741;
        C21741 c21742;
        C18213 c18213 = this.f50102;
        c18213.getClass();
        if (charSequence instanceof CharBuffer) {
            CharBuffer charBuffer = (CharBuffer) charSequence;
            if (z) {
                c21742 = new C21741(c18213, new C4101(c18213, charBuffer));
            } else {
                c21742 = new C21741(c18213, new C16907(c18213, charBuffer));
            }
        } else {
            char[] charArray = charSequence.toString().toCharArray();
            int length = charArray.length;
            if (z) {
                c21741 = new C21741(c18213, new C4101(c18213, charArray, length));
            } else {
                c21741 = new C21741(c18213, new C16907(c18213, charArray, length));
            }
            c21742 = c21741;
        }
        return new C22447(this, c21742, z, z3, z2, z4);
    }
}
