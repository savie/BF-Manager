package l;

import com.umeng.analytics.pro.d;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P53T */
/* JADX INFO: loaded from: classes5.dex */
public final class C15251 extends AbstractC3650 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f49720;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final short f49721;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19484[] f49722;

    public C15251(C23012 c23012, int i, C23718 c23718) {
        super(c23012, i);
        int iM52224 = c23718.m52224();
        short sM52230 = c23718.m52230();
        this.f49721 = sM52230;
        int iM52225 = c23718.m52225();
        if (mo7646()) {
            this.f49722 = new C19484[]{new C19484(this, (byte) ((sM52230 >> 8) & 255), iM52225)};
        } else {
            if (mo7644()) {
                this.f13381 = c23718.m52225();
                int iMax = Math.max(c23718.m52225(), 0);
                this.f49722 = new C19484[iMax];
                for (int i2 = 0; i2 < iMax; i2++) {
                    this.f49722[i2] = new C19484(this, i2, c23718.m52225(), c23718);
                }
            } else {
                this.f49722 = new C19484[]{new C19484(this, 0, -1, c23718)};
            }
            iM52224 = iM52225;
        }
        this.f49720 = iM52224;
    }

    @Override // l.InterfaceC3609
    public final InterfaceC9961 getValue() {
        return this.f49722[0];
    }

    @Override // l.InterfaceC3609
    public final InterfaceC9961 getValue(int i) {
        return this.f49722[i];
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ۨۙ */
    public final int mo7647() {
        return this.f49722.length;
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ֨ۙ */
    public final boolean mo7644() {
        return (this.f49721 & 1) != 0;
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ᩻ۙ */
    public final boolean mo7649() {
        return (this.f49721 & 2) != 0;
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo7648() {
        return (this.f49721 & 4) != 0;
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo7646() {
        return (this.f49721 & 8) != 0;
    }

    @Override // l.AbstractC3650, l.InterfaceC3609
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6432 mo10689() {
        return (C8901) super.mo10689();
    }

    @Override // l.InterfaceC3609
    /* JADX INFO: renamed from: ۗۙ */
    public final String mo7645() {
        try {
            List listM43336 = ((C18778) super.mo10692()).m43336();
            return ((C18072) listM43336).f57793.m10939(this.f49720);
        } catch (IndexOutOfBoundsException unused) {
            return d.O;
        }
    }

    @Override // l.AbstractC3650, l.InterfaceC3609
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC17721 mo10692() {
        return (C18778) super.mo10692();
    }

    @Override // l.AbstractC3650, l.InterfaceC3609
    public final InterfaceC19133 getType() {
        return (C8195) super.getType();
    }

    @Override // l.AbstractC3650, l.InterfaceC3609
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC12783 mo10690() {
        return (C23012) super.mo10690();
    }
}
