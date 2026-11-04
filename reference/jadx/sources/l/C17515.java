package l;

import java.io.Writer;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 74H5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17515 extends AbstractC9204 implements InterfaceC2665 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C24975 f56934;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC16791 f56935;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f56936;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f56937;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f56938;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C22737 f56939;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f56940;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f56941;

    public C17515(C24975 c24975, C8565 c8565, C22737 c22737, int i, AbstractC1239 abstractC1239, InterfaceC3476 interfaceC3476, int i2) {
        this.f56934 = c24975;
        this.f56939 = c22737;
        c8565.getClass();
        int iM22990 = c8565.m22990() + i;
        this.f56940 = iM22990;
        this.f56938 = c8565.m22996();
        this.f56941 = interfaceC3476.seekTo(iM22990);
        abstractC1239.mo4475();
        this.f56935 = abstractC1239.mo4476();
        this.f56937 = i2;
    }

    public C17515(C24975 c24975, C8565 c8565, C22737 c22737, int i, InterfaceC3476 interfaceC3476, int i2) {
        this.f56934 = c24975;
        this.f56939 = c22737;
        c8565.getClass();
        int iM22990 = c8565.m22990() + i;
        this.f56940 = iM22990;
        this.f56938 = c8565.m22996();
        this.f56941 = interfaceC3476.seekTo(iM22990);
        this.f56935 = null;
        this.f56937 = i2;
    }

    @Override // l.InterfaceC8304
    public final String getName() {
        C24975 c24975 = this.f56934;
        return c24975.m55782(c24975.m55818().mo8719(m41131() + 4));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41132(Writer writer) {
        C24975 c24975 = this.f56934;
        c24975.m55786(c24975.m55818().mo8719(m41131() + 4), writer, false);
    }

    @Override // l.InterfaceC8304
    public final String getType() {
        C24975 c24975 = this.f56934;
        return c24975.m55822(c24975.m55818().m8721(m41131() + 2));
    }

    @Override // l.InterfaceC8304
    /* JADX INFO: renamed from: ܳ */
    public final String mo4500() {
        return this.f56939.getType();
    }

    @Override // l.InterfaceC2665
    /* JADX INFO: renamed from: ᩷ */
    public final int mo8823() {
        return this.f56938;
    }

    @Override // l.InterfaceC2665
    /* JADX INFO: renamed from: ۨۙ */
    public final InterfaceC16791 mo8822() {
        return this.f56935;
    }

    @Override // l.InterfaceC2665
    public final Set getAnnotations() {
        return AbstractC6460.m18258(this.f56934, this.f56941);
    }

    @Override // l.InterfaceC2665
    /* JADX INFO: renamed from: ۗ */
    public final Set mo8821() {
        int i = this.f56937;
        if (i == 7) {
            return AbstractC8639.of();
        }
        return EnumSet.copyOf((Collection) EnumC13722.m33528(i));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private int m41131() {
        if (this.f56936 == 0) {
            this.f56936 = this.f56934.m55814(this.f56940);
        }
        return this.f56936;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41133(C17515 c17515, boolean z) {
        String type = getType();
        if (!this.f56939.getType().equals(c17515.f56939.getType()) || !getName().equals(c17515.getName()) || !type.equals(c17515.getType())) {
            return false;
        }
        int i = c17515.f56938;
        int i2 = this.f56938;
        if (i2 != i) {
            return false;
        }
        if ((this.f56941 != 0 || c17515.f56941 != 0) && !C17370.m40803(getAnnotations(), c17515.getAnnotations())) {
            return false;
        }
        if ((this.f56937 != 7 || c17515.f56937 != 7) && !C17370.m40803(mo8821(), c17515.mo8821())) {
            return false;
        }
        InterfaceC16791 interfaceC16791 = c17515.f56935;
        InterfaceC16791 interfaceC16792 = this.f56935;
        if (C17359.equals(interfaceC16792, interfaceC16791)) {
            return true;
        }
        if (interfaceC16792 == null) {
            return C18678.m43429(type).equals(interfaceC16791);
        }
        if (interfaceC16791 == null) {
            return C18678.m43429(type).equals(interfaceC16792);
        }
        return z && EnumC2536.STATIC.m8459(i2) && (interfaceC16792 instanceof InterfaceC3367) && (((InterfaceC3367) interfaceC16792).getValue() >>> 24) == 127 && (interfaceC16791 instanceof InterfaceC3367) && (((InterfaceC3367) interfaceC16791).getValue() >>> 24) == 127;
    }
}
