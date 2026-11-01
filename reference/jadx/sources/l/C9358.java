package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: l.ۢۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37EB */
/* JADX INFO: loaded from: classes4.dex */
public final class C9358 extends C4624 {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f31712;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f31713;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f31714;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f31715;

    public C9358() {
        throw null;
    }

    @Override // l.AbstractC6741, l.InterfaceC5144
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo9757() {
        ArrayList arrayList = this.f31714;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C1595 m24005() {
        String strM2162;
        C3980 c3980 = this.f16354;
        AbstractC12449 abstractC12449M27823 = c3980.f47512.m27823(this.f31712);
        C11038 c11038 = c3980.f47512;
        EnumC6098 enumC6098 = EnumC6098.CONSTANT_NULL;
        c11038.getClass();
        C10332 c10332 = new C10332(c11038, enumC6098);
        if (abstractC12449M27823 instanceof C10332) {
            c10332 = (C10332) abstractC12449M27823;
            strM2162 = c10332.mo2278() + l.b;
        } else {
            strM2162 = c3980.f47519.m2162("??? Invalid bootstrap method reference", new Object[0]);
            if (!this.f22692) {
                strM2162 = m18222(25, String.format("#%d", Integer.valueOf(this.f31712))).concat(" // ").concat(strM2162);
            }
        }
        return new C1595(strM2162, c10332);
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ۖ */
    public final void mo14101(int i, int i2) {
        char c;
        C3275 c3275 = this.f16355;
        int i3 = c3275.f22686;
        int i4 = this.f31713;
        int iM18233 = (i3 - i4) - m18233();
        C1595 c1595M24005 = m24005();
        if (i == 0) {
            m18209(EnumC20934.f68170.m47085() + " {");
        }
        m18208(1);
        m18223(m18222(i4, String.format("%2d:", Integer.valueOf(i))));
        Map map = AbstractC6741.f22682;
        boolean z = this.f22704;
        boolean z2 = this.f22692;
        if (z2) {
            if (z) {
                m18219(String.format("#%d;", Integer.valueOf(this.f31712)));
            } else {
                m18218(iM18233, String.format("#%d;", Integer.valueOf(this.f31712)));
                m18219(" // " + m18214(c1595M24005.m5438(), m18205() + c3275.f22686, " // ", map));
            }
            c = 0;
        } else {
            c = 0;
            m18219(m18214(c1595M24005.m5438(), (m18205() * 2) + i4, "", map));
        }
        if (this.f31715 > 0) {
            m18209(" Arguments:");
            if (z2) {
                int iM18205 = (m18205() * 2) + iM18233 + i4;
                int i5 = 0;
                while (i5 < this.f31715) {
                    Integer num = (Integer) this.f31714.get(i5);
                    int iIntValue = num.intValue();
                    int i6 = this.f31715 - 1;
                    boolean z3 = i5 != i6;
                    String str = i5 != i6 ? "," : l.b;
                    m18223(m18222(i4, ""));
                    if (!z2) {
                        z2 = z2;
                    } else if (z) {
                        Object[] objArr = new Object[2];
                        objArr[c] = num;
                        objArr[1] = str;
                        m18219(String.format("#%d%s", objArr));
                        z2 = z2;
                    } else {
                        C10332 c10332M5437 = c1595M24005.m5437();
                        c10332M5437.getClass();
                        String strM18214 = m18214(c10332M5437.m26214(iIntValue, "", z3 ? "⾀" : ""), iM18205, " // ", AbstractC6741.f22683);
                        Object[] objArr2 = new Object[2];
                        objArr2[c] = num;
                        objArr2[1] = str;
                        m18218(iM18233, String.format("#%d%s", objArr2));
                        m18219(" // " + strM18214);
                    }
                    i5++;
                    z2 = z2;
                    z = z;
                }
            } else {
                String strM26215 = c1595M24005.m5437().m26215(this, "", "");
                m18223(m18222(i4, " "));
                m18219(m18214(strM26215, (m18205() * 2) + i4, "", AbstractC6741.f22681) + l.b);
            }
        }
        if (i < i2 - 1) {
            m18221();
        } else {
            m18227(1);
            m18209(l.d);
        }
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ܰ */
    public final void mo14102(int i, int i2) {
        C3275 c3275 = this.f16355;
        int i3 = c3275.f22686 - AbstractC6741.f22679;
        C1595 c1595M24005 = m24005();
        m18223(m18222(AbstractC6741.f22679, EnumC20934.f68170.m47084()));
        Map map = AbstractC6741.f22683;
        boolean z = this.f22704;
        int i4 = 1;
        boolean z2 = this.f22692;
        if (!z2) {
            m18219(m18214(c1595M24005.m5438(), m18205() + AbstractC6741.f22679, "", AbstractC6741.f22682));
        } else if (z) {
            m18219(String.format("#%d;", Integer.valueOf(this.f31712)));
        } else {
            m18218(i3, String.format("#%d;", Integer.valueOf(this.f31712)));
            m18219(" // " + m18214(c1595M24005.m5438(), m18233() + c3275.f22686, " // ", map));
        }
        m18223(m18222(AbstractC6741.f22679, " "));
        m18228("{ ");
        if (this.f31715 > 0) {
            m18221();
            m18208(2);
            if (z2) {
                int i5 = 0;
                while (i5 < this.f31715) {
                    Integer num = (Integer) this.f31714.get(i5);
                    int iIntValue = num.intValue();
                    int i6 = this.f31715 - i4;
                    String str = i5 != i6 ? "," : "";
                    boolean z3 = i5 != i6;
                    m18223(m18222(AbstractC6741.f22679, " "));
                    if (z) {
                        Object[] objArr = new Object[2];
                        objArr[0] = num;
                        objArr[i4] = str;
                        m18219(String.format("#%d%s", objArr));
                    } else {
                        C10332 c10332M5437 = c1595M24005.m5437();
                        c10332M5437.getClass();
                        String strM18214 = m18214(c10332M5437.m26214(iIntValue, "", z3 ? "⾀" : ""), m18205() + c3275.f22686, " // ", map);
                        m18218(i3 - (m18205() * 2), String.format("#%d%s", num, str));
                        m18219(" // " + strM18214);
                    }
                    i5++;
                    i4 = 1;
                    z = z;
                }
            } else {
                String strM26215 = c1595M24005.m5437().m26215(this, "", "");
                m18223(m18222(AbstractC6741.f22679 - m18205(), " "));
                m18219(m18214(strM26215, (m18205() * 2) + AbstractC6741.f22679, "", AbstractC6741.f22681));
            }
            m18227(2);
            m18223(m18222(AbstractC6741.f22679, " "));
        }
        m18219(l.d);
        if (i < i2 - 1) {
            m18221();
        }
    }
}
