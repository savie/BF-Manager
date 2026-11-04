package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܿ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H7D7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18013 extends C17267 implements InterfaceC10838 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f58970;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public String f58971;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public int f58972;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f58973;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public int f58974;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f58975;

    public C18013(C0224 c0224, C16521 c16521) {
        super(c0224, c16521);
        this.f58974 = 0;
        this.f58971 = m47991(m47996(AbstractC20997.f67124, EnumC5202.f18206.m15637()));
        this.f67131 = EnumC10882.INNER_CLASSES;
    }

    @Override // l.C17267, l.AbstractC20997
    /* JADX INFO: renamed from: ᩴ */
    public final int mo12384() {
        if (this.f58974 == 0) {
            boolean zMo5637 = mo5637();
            C16521 c16521 = this.f56256;
            if (zMo5637) {
                int iM48000 = c16521.f67148 - m48000();
                this.f58974 = iM48000;
                this.f58974 = Math.max(iM48000, this.f67136);
            } else {
                int iM48001 = c16521.f67148 - m48000();
                this.f58974 = iM48001;
                this.f58974 = Math.max(iM48001, this.f58971.length() + this.f67136);
            }
        }
        return this.f58974;
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11099(int i, int i2) {
        String strConcat = this.f58971.concat(EnumC16856.m39774(this.f58975, EnumC19840.INNER_CLASS));
        boolean z = this.f67146;
        boolean z2 = this.f67132;
        if (z2) {
            String strM41993 = m41993(strConcat);
            if (z) {
                m48009(strM41993);
            } else {
                this.f67151.mo3879(m47996(mo12384(), strM41993));
                m48009(" // ");
            }
        } else {
            m48009(strConcat);
        }
        if (!z2 || (z2 && !z)) {
            int i3 = this.f58973;
            C0224 c0224 = this.f56257;
            if (i3 != 0) {
                m48009(c0224.f6371.getName(this.f58973) + " = ");
            }
            int i4 = this.f58970;
            if (i4 != 0) {
                m48009(c0224.f6371.m5630(i4));
            }
            int i5 = this.f58972;
            if (i5 != 0) {
                m48009(" of " + c0224.f6371.m5630(i5));
            }
            m48006((!c0224.f67132 || z) ? l.b : "");
            return;
        }
        m47989();
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩸ */
    public final void mo11100(int i, int i2) {
        if (i == 0) {
            m48013(EnumC5202.f18206.m15638() + " {");
        }
        m48012(1);
        String strM39774 = EnumC16856.m39774(this.f58975, EnumC19840.INNER_CLASS);
        boolean z = this.f67132;
        boolean z2 = this.f67146;
        if (z) {
            String strM41993 = m41993(strM39774);
            if (z2) {
                m47997(strM41993);
            } else {
                this.f67151.mo3879(m47990(mo12384(), strM41993));
                m48009(" // ");
            }
        } else {
            m47997(strM39774);
        }
        if (!z || (z && !z2)) {
            int i3 = this.f58973;
            C0224 c0224 = this.f56257;
            if (i3 != 0) {
                m48009(c0224.f6371.getName(i3) + " = ");
            }
            int i4 = this.f58970;
            if (i4 != 0) {
                m48009(c0224.f6371.m5630(i4));
            }
            int i5 = this.f58972;
            if (i5 != 0) {
                m48009(" of " + c0224.f6371.m5630(i5));
            }
            m48006((!c0224.f67132 || z2) ? l.b : "");
        } else {
            m47989();
        }
        m48008(1);
        if (i == i2 - 1) {
            m48013(l.d);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private String m41993(String str) {
        int i = this.f58973;
        if (i != 0) {
            str = str.concat(String.format("#%d = ", Integer.valueOf(i)));
        }
        int i2 = this.f58970;
        if (i2 != 0) {
            str = str.concat(String.format("#%d", Integer.valueOf(i2)));
        }
        int i3 = this.f58972;
        if (i3 != 0) {
            str = str.concat(String.format(" of #%d", Integer.valueOf(i3)));
        }
        return str.concat(l.b);
    }

    @Override // l.InterfaceC10838
    /* JADX INFO: renamed from: ᩸ */
    public final int mo12385() {
        return m41993(EnumC16856.m39774(this.f58975, EnumC19840.INNER_CLASS)).length() + 1;
    }

    @Override // l.InterfaceC10838
    /* JADX INFO: renamed from: ۙ */
    public final void mo12383(int i) {
        this.f67136 = i;
    }
}
