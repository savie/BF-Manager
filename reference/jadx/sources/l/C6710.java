package l;

import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۛ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6710 implements InterfaceC20660 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f22315;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f22316;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f22317;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f22318;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f22319;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f22320;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC7466 f22321;

    public C6710(int i, String str, String str2, int i2, int i3, boolean z, EnumC7466 enumC7466) {
        this.f22320 = i;
        this.f22319 = str;
        this.f22317 = str2;
        this.f22318 = i2;
        this.f22315 = i3;
        this.f22316 = z;
        this.f22321 = enumC7466;
    }

    @Override // l.InterfaceC20660
    public final int getIndex() {
        return this.f22320;
    }

    @Override // l.InterfaceC20660
    public final String getText() {
        return this.f22317;
    }

    @Override // l.InterfaceC20660
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String mo18733() {
        return this.f22319;
    }

    @Override // l.InterfaceC20660
    public final int length() {
        return this.f22319.length();
    }

    @Override // l.InterfaceC20660
    public final int getPosition() {
        return this.f22318;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m18729() {
        return this.f22315;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m18727() {
        return this.f22316;
    }

    @Override // l.InterfaceC20660
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo18730() {
        return C21406.m48703(this.f22317);
    }

    @Override // l.InterfaceC20660
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo18726() {
        return this.f22317.startsWith("//");
    }

    @Override // l.InterfaceC20660
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo18728() {
        return this.f22317.startsWith("/*");
    }

    @Override // l.InterfaceC20660
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo18732() {
        String str = this.f22317;
        return str.startsWith("/**") && str.charAt(3) != '*' && str.length() > 4;
    }

    @Override // l.InterfaceC20660
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo18731() {
        return mo18726() || mo18728();
    }

    public final String toString() {
        C3179 c3179M46714 = C20333.m46714(this);
        c3179M46714.m10380("index", this.f22320);
        c3179M46714.m10379((Object) this.f22317, TextBundle.TEXT_ENTRY);
        c3179M46714.m10380("position", this.f22318);
        c3179M46714.m10380("columnI", this.f22315);
        c3179M46714.m10381("isToken", this.f22316);
        return c3179M46714.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC7466 m18725() {
        return this.f22321;
    }
}
