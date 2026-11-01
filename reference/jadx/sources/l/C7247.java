package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S4F7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7247 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f24142;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C0896 f24143;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f24144;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11617 f24145;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC0327 f24146;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C22719 f24147;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f24148;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f24149;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f24150;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f24151;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC7953 f24152;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C15009 f24153;

    public C7247(ArrayList arrayList, C15009 c15009, InterfaceC7953 interfaceC7953, C0896 c0896, int i, C22719 c22719, InterfaceC11617 interfaceC11617, AbstractC0327 abstractC0327, int i2, int i3, int i4) {
        this.f24149 = arrayList;
        this.f24143 = c0896;
        this.f24153 = c15009;
        this.f24152 = interfaceC7953;
        this.f24142 = i;
        this.f24147 = c22719;
        this.f24145 = interfaceC11617;
        this.f24146 = abstractC0327;
        this.f24148 = i2;
        this.f24144 = i3;
        this.f24151 = i4;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C0896 m19373() {
        return this.f24143;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m19375() {
        return this.f24148;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m19376() {
        return this.f24144;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m19368() {
        return this.f24151;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C15009 m19374() {
        return this.f24153;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7953 m19372() {
        return this.f24152;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11617 m19369() {
        return this.f24145;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC0327 m19367() {
        return this.f24146;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C22719 m19366() {
        return this.f24147;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18485 m19370(C22719 c22719) {
        return m19371(c22719, this.f24153, this.f24152, this.f24143);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18485 m19371(C22719 c22719, C15009 c15009, InterfaceC7953 interfaceC7953, C0896 c0896) {
        ArrayList arrayList = this.f24149;
        int size = arrayList.size();
        int i = this.f24142;
        if (i >= size) {
            throw new AssertionError();
        }
        this.f24150++;
        InterfaceC7953 interfaceC7954 = this.f24152;
        if (interfaceC7954 != null && !this.f24143.m3582(c22719.m50355())) {
            throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port");
        }
        if (interfaceC7954 != null && this.f24150 > 1) {
            throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once");
        }
        int i2 = i + 1;
        C7247 c7247 = new C7247(arrayList, c15009, interfaceC7953, c0896, i2, c22719, this.f24145, this.f24146, this.f24148, this.f24144, this.f24151);
        InterfaceC1738 interfaceC1738 = (InterfaceC1738) arrayList.get(i);
        C18485 c18485Mo5785 = interfaceC1738.mo5785(c7247);
        if (interfaceC7953 != null && i2 < arrayList.size() && c7247.f24150 != 1) {
            throw new IllegalStateException("network interceptor " + interfaceC1738 + " must call proceed() exactly once");
        }
        if (c18485Mo5785 == null) {
            throw new NullPointerException("interceptor " + interfaceC1738 + " returned null");
        }
        if (c18485Mo5785.m42860() != null) {
            return c18485Mo5785;
        }
        throw new IllegalStateException("interceptor " + interfaceC1738 + " returned a response with no body");
    }
}
