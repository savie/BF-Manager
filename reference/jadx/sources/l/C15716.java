package l;

import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ܺۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 97QO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15716 implements InterfaceC20608 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f51004;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC0573 f51005;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f51006;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f51007;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f51008;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f51009;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f51010;

    public C15716(int i, String str, String str2, int i2, int i3, boolean z, EnumC0573 enumC0573) {
        this.f51009 = i;
        this.f51007 = str;
        this.f51004 = str2;
        this.f51010 = i2;
        this.f51006 = i3;
        this.f51008 = z;
        this.f51005 = enumC0573;
    }

    @Override // l.InterfaceC20608
    public final int getIndex() {
        return this.f51009;
    }

    @Override // l.InterfaceC20608
    public final String getText() {
        return this.f51004;
    }

    @Override // l.InterfaceC20608
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String mo37426() {
        return this.f51007;
    }

    @Override // l.InterfaceC20608
    public final int length() {
        return this.f51007.length();
    }

    @Override // l.InterfaceC20608
    public final int getPosition() {
        return this.f51010;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m37425() {
        return this.f51006;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m37431() {
        return this.f51008;
    }

    @Override // l.InterfaceC20608
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean mo37433() {
        return C17080.m39865(this.f51004);
    }

    @Override // l.InterfaceC20608
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo37428() {
        return this.f51004.startsWith("//");
    }

    @Override // l.InterfaceC20608
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo37430() {
        return this.f51004.startsWith("/*");
    }

    @Override // l.InterfaceC20608
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo37432() {
        String str = this.f51004;
        return str.startsWith("/**") && str.charAt(3) != '*' && str.length() > 4;
    }

    @Override // l.InterfaceC20608
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean mo37429() {
        return mo37428() || mo37430();
    }

    public final String toString() {
        C23244 c23244M37072 = C15483.m37072(this);
        c23244M37072.m51285("index", this.f51009);
        c23244M37072.m51284((Object) this.f51004, TextBundle.TEXT_ENTRY);
        c23244M37072.m51285("position", this.f51010);
        c23244M37072.m51285("columnI", this.f51006);
        c23244M37072.m51286("isToken", this.f51008);
        return c23244M37072.toString();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC0573 m37427() {
        return this.f51005;
    }
}
