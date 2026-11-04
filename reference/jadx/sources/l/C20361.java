package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵ۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 37EB */
/* JADX INFO: loaded from: classes5.dex */
public final class C20361 extends C17267 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f65309;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f65310;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public int f65311;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f65312;

    public C20361() {
        throw null;
    }

    @Override // l.AbstractC20997, l.InterfaceC16454
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo19009() {
        ArrayList arrayList = this.f65312;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private C3207 m46780() {
        String strM32311;
        C0224 c0224 = this.f56257;
        AbstractC15029 abstractC15029M5631 = c0224.f6371.m5631(this.f65311);
        C1606 c1606 = c0224.f6371;
        EnumC5335 enumC5335 = EnumC5335.CONSTANT_NULL;
        c1606.getClass();
        C6936 c6936 = new C6936(c1606, enumC5335);
        if (abstractC15029M5631 instanceof C6936) {
            c6936 = (C6936) abstractC15029M5631;
            strM32311 = c6936.mo14388() + l.b;
        } else {
            strM32311 = c0224.f6369.m32311("??? Invalid bootstrap method reference", new Object[0]);
            if (!this.f67132) {
                strM32311 = m47996(25, String.format("#%d", Integer.valueOf(this.f65311))).concat(" // ").concat(strM32311);
            }
        }
        return new C3207(strM32311, c6936);
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11099(int i, int i2) {
        C16521 c16521 = this.f56256;
        int i3 = c16521.f67148 - AbstractC20997.f67124;
        C3207 c3207M46780 = m46780();
        m47997(m47996(AbstractC20997.f67124, EnumC5202.f18141.m15637()));
        Map map = AbstractC20997.f67123;
        boolean z = this.f67146;
        int i4 = 1;
        boolean z2 = this.f67132;
        if (!z2) {
            m48006(m47992(c3207M46780.m10549(), m48000() + AbstractC20997.f67124, "", AbstractC20997.f67121));
        } else if (z) {
            m48006(String.format("#%d;", Integer.valueOf(this.f65311)));
        } else {
            m48005(i3, String.format("#%d;", Integer.valueOf(this.f65311)));
            m48006(" // " + m47992(c3207M46780.m10549(), m48002() + c16521.f67148, " // ", map));
        }
        m47997(m47996(AbstractC20997.f67124, " "));
        m48009("{ ");
        if (this.f65310 > 0) {
            m47989();
            m48012(2);
            if (z2) {
                int i5 = 0;
                while (i5 < this.f65310) {
                    Integer num = (Integer) this.f65312.get(i5);
                    int iIntValue = num.intValue();
                    int i6 = this.f65310 - i4;
                    String str = i5 != i6 ? "," : "";
                    boolean z3 = i5 != i6;
                    m47997(m47996(AbstractC20997.f67124, " "));
                    if (z) {
                        Object[] objArr = new Object[2];
                        objArr[0] = num;
                        objArr[i4] = str;
                        m48006(String.format("#%d%s", objArr));
                    } else {
                        C6936 c6936M10548 = c3207M46780.m10548();
                        c6936M10548.getClass();
                        String strM47992 = m47992(c6936M10548.m19220(iIntValue, "", z3 ? "⾀" : ""), m48000() + c16521.f67148, " // ", map);
                        m48005(i3 - (m48000() * 2), String.format("#%d%s", num, str));
                        m48006(" // " + strM47992);
                    }
                    i5++;
                    i4 = 1;
                    z = z;
                }
            } else {
                String strM19221 = c3207M46780.m10548().m19221(this, "", "");
                m47997(m47996(AbstractC20997.f67124 - m48000(), " "));
                m48006(m47992(strM19221, (m48000() * 2) + AbstractC20997.f67124, "", AbstractC20997.f67122));
            }
            m48008(2);
            m47997(m47996(AbstractC20997.f67124, " "));
        }
        m48006(l.d);
        if (i < i2 - 1) {
            m47989();
        }
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩸ */
    public final void mo11100(int i, int i2) {
        char c;
        C16521 c16521 = this.f56256;
        int i3 = c16521.f67148;
        int i4 = this.f65309;
        int iM48002 = (i3 - i4) - m48002();
        C3207 c3207M46780 = m46780();
        if (i == 0) {
            m48013(EnumC5202.f18141.m15638() + " {");
        }
        m48012(1);
        m47997(m47996(i4, String.format("%2d:", Integer.valueOf(i))));
        Map map = AbstractC20997.f67121;
        boolean z = this.f67146;
        boolean z2 = this.f67132;
        if (z2) {
            if (z) {
                m48006(String.format("#%d;", Integer.valueOf(this.f65311)));
            } else {
                m48005(iM48002, String.format("#%d;", Integer.valueOf(this.f65311)));
                m48006(" // " + m47992(c3207M46780.m10549(), m48000() + c16521.f67148, " // ", map));
            }
            c = 0;
        } else {
            c = 0;
            m48006(m47992(c3207M46780.m10549(), (m48000() * 2) + i4, "", map));
        }
        if (this.f65310 > 0) {
            m48013(" Arguments:");
            if (z2) {
                int iM48000 = (m48000() * 2) + iM48002 + i4;
                int i5 = 0;
                while (i5 < this.f65310) {
                    Integer num = (Integer) this.f65312.get(i5);
                    int iIntValue = num.intValue();
                    int i6 = this.f65310 - 1;
                    boolean z3 = i5 != i6;
                    String str = i5 != i6 ? "," : l.b;
                    m47997(m47996(i4, ""));
                    if (!z2) {
                        z2 = z2;
                    } else if (z) {
                        Object[] objArr = new Object[2];
                        objArr[c] = num;
                        objArr[1] = str;
                        m48006(String.format("#%d%s", objArr));
                        z2 = z2;
                    } else {
                        C6936 c6936M10548 = c3207M46780.m10548();
                        c6936M10548.getClass();
                        String strM47992 = m47992(c6936M10548.m19220(iIntValue, "", z3 ? "⾀" : ""), iM48000, " // ", AbstractC20997.f67123);
                        Object[] objArr2 = new Object[2];
                        objArr2[c] = num;
                        objArr2[1] = str;
                        m48005(iM48002, String.format("#%d%s", objArr2));
                        m48006(" // " + strM47992);
                    }
                    i5++;
                    z2 = z2;
                    z = z;
                }
            } else {
                String strM19221 = c3207M46780.m10548().m19221(this, "", "");
                m47997(m47996(i4, " "));
                m48006(m47992(strM19221, (m48000() * 2) + i4, "", AbstractC20997.f67122) + l.b);
            }
        }
        if (i < i2 - 1) {
            m47989();
        } else {
            m48008(1);
            m48013(l.d);
        }
    }
}
