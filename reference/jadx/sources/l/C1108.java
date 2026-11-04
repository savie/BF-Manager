package l;

import java.util.List;

/* JADX INFO: renamed from: l.֨ۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6BE */
/* JADX INFO: loaded from: classes3.dex */
public final class C1108 extends AbstractC9950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24975 f3927;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f3928;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f3929;

    public C1108(C24975 c24975, int i, int i2) {
        this.f3927 = c24975;
        this.f3928 = i;
        this.f3929 = i2;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo4114() {
        return this.f3927.m55818().mo8719(this.f3928);
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo4115() {
        return this.f3927.m55818().m8721(this.f3928 + 4);
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List mo4116() {
        C24975 c24975 = this.f3927;
        C8565 c8565M8724 = c24975.m55818().m8724(c24975.m55818().m8721(this.f3928 + 6) + this.f3929);
        int iM23006 = c8565M8724.m23006();
        int iM23001 = c8565M8724.m23001();
        c8565M8724.m22995();
        if (iM23006 > 0) {
            return new C19007(this, c24975, iM23001, iM23006);
        }
        int i = (iM23006 * (-1)) + 1;
        return new C10056(this, this.f3927, iM23001, i, i);
    }
}
