package l;

import com.umeng.analytics.pro.d;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P53T */
/* JADX INFO: loaded from: classes4.dex */
public final class C14195 extends AbstractC3650 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f46546;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final short f46547;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13134[] f46548;

    public C14195(C23367 c23367, int i, C23718 c23718) {
        super(c23367, i);
        int iM52224 = c23718.m52224();
        short sM52230 = c23718.m52230();
        this.f46547 = sM52230;
        int iM52225 = c23718.m52225();
        if (mo7646()) {
            this.f46548 = new C13134[]{new C13134(this, (byte) ((sM52230 >> 8) & 255), iM52225)};
        } else {
            if (mo7644()) {
                this.f13381 = c23718.m52225();
                int iMax = Math.max(c23718.m52225(), 0);
                this.f46548 = new C13134[iMax];
                for (int i2 = 0; i2 < iMax; i2++) {
                    this.f46548[i2] = new C13134(this, i2, c23718.m52225(), c23718);
                }
            } else {
                this.f46548 = new C13134[]{new C13134(this, 0, -1, c23718)};
            }
            iM52224 = iM52225;
        }
        this.f46546 = iM52224;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34283(C23718 c23718, C2549 c2549) {
        int iM52225;
        if (c23718.m52227() >= 8) {
            int iM52224 = c23718.m52224();
            short sM52230 = c23718.m52230();
            int iM52226 = c23718.m52225();
            boolean z = (sM52230 & 8) != 0;
            boolean z2 = (sM52230 & 1) != 0;
            if (z) {
                if (iM52224 >= 0 && iM52224 < ((C11723) c2549.m7942()).f39410.size()) {
                    return true;
                }
            } else if (iM52226 >= 0 && iM52226 < ((C11723) c2549.m7942()).f39410.size()) {
                if (z2) {
                    c23718.m52233();
                    iM52225 = c23718.m52225();
                    if (iM52225 != -1) {
                    }
                } else {
                    iM52225 = 1;
                }
                if (!z2 ? c23718.m52227() >= iM52225 * 8 : c23718.m52227() >= iM52225 * 12) {
                    int size = c2549.mo7938().mo5139().size();
                    for (int i = 0; i < iM52225; i++) {
                        if (z2) {
                            c23718.m52233();
                        }
                        c23718.m52226(2);
                        c23718.m52231();
                        byte bM52231 = c23718.m52231();
                        int iM52227 = c23718.m52225();
                        if (C8550.m22299(bM52231) && (bM52231 != 3 || (iM52227 >= 0 && iM52227 < size))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.InterfaceC3609
    public final InterfaceC9961 getValue() {
        return this.f46548[0];
    }

    @Override // l.InterfaceC3609
    public final InterfaceC9961 getValue(int i) {
        return this.f46548[i];
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ۨۙ */
    public final int mo7647() {
        return this.f46548.length;
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ֨ۙ */
    public final boolean mo7644() {
        return (this.f46547 & 1) != 0;
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ᩻ۙ */
    public final boolean mo7649() {
        return (this.f46547 & 2) != 0;
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo7648() {
        return (this.f46547 & 4) != 0;
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo7646() {
        return (this.f46547 & 8) != 0;
    }

    @Override // l.AbstractC3650, l.InterfaceC3609
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6432 mo10689() {
        return (C1493) super.mo10689();
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ۗۙ */
    public final String mo7645() {
        try {
            List listM7942 = ((C2549) super.mo10692()).m7942();
            return ((C11723) listM7942).f39410.m10939(this.f46546);
        } catch (IndexOutOfBoundsException unused) {
            return d.O;
        }
    }

    @Override // l.AbstractC3650, l.InterfaceC3609
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC17721 mo10692() {
        return (C2549) super.mo10692();
    }

    @Override // l.AbstractC3650, l.InterfaceC3609
    public final InterfaceC19133 getType() {
        return (C1138) super.getType();
    }

    @Override // l.AbstractC3650, l.InterfaceC3609
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC12783 mo10690() {
        return (C23367) super.mo10690();
    }
}
