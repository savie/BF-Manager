package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7EY */
/* JADX INFO: loaded from: classes5.dex */
public final class C18736 extends AbstractC14504 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public int f60772;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f60773;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f60774;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f60775;

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f60776;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f60777;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public C3980 f60778;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f60779;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public boolean f60780;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public C17139 f60781;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f60782;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public short f60783;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f60784;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m43288(int i) {
        int i2 = i;
        this.f60772 = i2;
        C3980 c3980 = this.f60778;
        C5061 c5061 = (C5061) this.f47511;
        boolean z = c5061.f22687;
        boolean z2 = c5061.f22713;
        boolean z3 = z || z2;
        boolean z4 = z && z2;
        if (z3 && this.f60783 != 0) {
            m18227(1);
            if (z4) {
                String strM11481 = c3980.m11481(this.f60783);
                StringBuilder sb = new StringBuilder("// ");
                sb.append((int) this.f60783);
                sb.append(strM11481 != null ? "# ".concat(strM11481) : "");
                m18209(sb.toString());
            } else {
                C5061 c5062 = (C5061) this.f47511;
                if (c5062.f22687) {
                    m18224("// %d#", Short.valueOf(this.f60783));
                } else if (c5062.f22713) {
                    String strM11482 = c3980.m11481(this.f60783);
                    m18209(strM11482 != null ? "// ".concat(strM11482) : "");
                }
            }
            m18208(1);
        }
        ArrayList<C1616> arrayList = this.f60779;
        boolean z5 = this.f22704;
        boolean z6 = this.f22692;
        int i3 = 18;
        if (arrayList != null) {
            for (C1616 c1616 : arrayList) {
                m18228(m18207(i2, m18222(18, EnumC20562.f66911.m46393())));
                if (!z6) {
                    m18210("%s %s;", c1616.m5492(), ((C5061) this.f47511).f47512.m27822(c1616.f6508));
                } else if (z5) {
                    m18210("%s #%d;", c1616.m5492(), Integer.valueOf(c1616.f6508));
                } else {
                    String strM5492 = c1616.m5492();
                    int i4 = c1616.f6508;
                    m18228(m18222(this.f22686 - 18, String.format("%s #%d;", strM5492, Integer.valueOf(i4))));
                    StringBuilder sb2 = new StringBuilder(" // ");
                    sb2.append(i4 == 0 ? "any" : ((C5061) this.f47511).f47512.m27822(i4));
                    m18219(sb2.toString());
                }
            }
        }
        if (this.f60782 != null) {
            m18228(m18207(i2, m18222(18, EnumC20562.f66755.m46393())));
            m18219(((String) C9030.stream(this.f60782).map(new C15209()).collect(C1890.joining(", "))) + l.b);
        }
        ArrayList arrayList2 = this.f60777;
        boolean z7 = this.f22709;
        if (arrayList2 != null && !z7) {
            for (Iterator it = arrayList2.iterator(); it.hasNext(); it = it) {
                C15915 c15915 = (C15915) it.next();
                m18228(m18207(i2, m18222(i3, EnumC20562.f66842.m46393())));
                if (!z6) {
                    m18210("%d %s:%s;", Short.valueOf(c15915.f67744), ((C5061) this.f47511).f47512.getName(c15915.f67741), ((C5061) this.f47511).f47512.getName(c15915.f67747));
                } else if (z5) {
                    m18210("%d #%d:#%d;", Short.valueOf(c15915.f67744), Short.valueOf(c15915.f67741), Short.valueOf(c15915.f67747));
                } else {
                    short s = c15915.f67744;
                    short s2 = c15915.f67747;
                    short s3 = c15915.f67741;
                    m18228(m18222(this.f22686 - 18, String.format("%d #%d:#%d;", Short.valueOf(s), Short.valueOf(s3), Short.valueOf(s2))));
                    m18210(" // %s:%s", ((C5061) this.f47511).f47512.getName(s3), ((C5061) this.f47511).f47512.getName(s2));
                }
                i3 = 18;
            }
        }
        ArrayList<C20148> arrayList3 = this.f60776;
        if (arrayList3 == null || z7) {
            return;
        }
        for (C20148 c20148 : arrayList3) {
            m18228(m18207(i2, m18222(18, EnumC20562.f66711.m46393())));
            if (!z6) {
                m18210("%d %s:%s;", Short.valueOf(c20148.f67744), ((C5061) this.f47511).f47512.getName(c20148.f67741), ((C5061) this.f47511).f47512.getName(c20148.f67747));
            } else if (z5) {
                m18210("%d #%d:#%d;", Short.valueOf(c20148.f67744), Short.valueOf(c20148.f67741), Short.valueOf(c20148.f67747));
            } else {
                short s4 = c20148.f67744;
                short s5 = c20148.f67747;
                short s6 = c20148.f67741;
                m18228(m18222(this.f22686 - 18, String.format("%d #%d:#%d;", Short.valueOf(s4), Short.valueOf(s6), Short.valueOf(s5))));
                m18210(" // %s:%s", ((C5061) this.f47511).f47512.getName(s6), ((C5061) this.f47511).f47512.getName(s5));
            }
            i2 = i;
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m43286(int i) {
        ArrayList arrayList = this.f60774;
        boolean z = this.f22709;
        if (arrayList != null && !z) {
            m18228(m18207(i, m18222(18, EnumC20562.f66851.m46393())));
            m18219(((String) C9030.stream(this.f60774).map(new C21558()).collect(C1890.joining(","))) + l.b);
        }
        if (this.f60784 != null && !z) {
            m18228(m18207(i, m18222(18, EnumC20562.f66786.m46393())));
            m18219(((String) C9030.stream(this.f60784).map(new C18030()).collect(C1890.joining(","))) + l.b);
        }
        if (this.f60773 != null) {
            m18228(m18207(i, m18222(18, EnumC20562.f66599.m46393())));
            m18219(((String) C9030.stream(this.f60773).map(new C15209()).collect(C1890.joining(","))) + l.b);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m43287(int i) {
        C17139 c17139;
        if (this.f22709 || ((c17139 = this.f60781) == null && this.f60775 == null)) {
            return false;
        }
        if (c17139 != null) {
            if (c17139.m40049()) {
                return m43285(i);
            }
            m43284(i);
            return true;
        }
        if (((C17139) this.f60775.get(0)).m40049()) {
            return m43285(i);
        }
        m43284(i);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m43283(C13111 c13111, String str, int i, int i2) {
        boolean z = ((String) c13111.f43679).isEmpty() && ((String) c13111.f43680).isEmpty();
        StringBuilder sbM23356 = C9023.m23356(str);
        sbM23356.append(z ? l.b : "");
        m18228(m18207(i, m18222(18, sbM23356.toString())));
        boolean z2 = this.f22704;
        boolean z3 = this.f22692;
        if (z3) {
            if (z2) {
                m18219((String) c13111.f43679);
            } else {
                m18228(m18222(i2, (String) c13111.f43679));
                i2 = Math.max(i2, ((String) c13111.f43679).length());
                if (!z) {
                    m18228(" // ");
                }
            }
        }
        if (z3 && (!z3 || z2)) {
            return i2;
        }
        m18219((String) c13111.f43680);
        return i2;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m43284(int i) {
        int i2 = this.f22686 - 18;
        m18218(18, EnumC20562.f66951.m46393() + l.b);
        if (this.f22692 && !this.f22704) {
            this.f22710.mo18524(m18222(i2, " "));
            m18219(" // offset " + this.f60781.f54657);
        } else {
            m18221();
        }
        C17139 c17139 = this.f60781;
        int iM43283 = m43283(c17139.m40046("", c17139.f54664), EnumC20562.f66600.m46393(), i, i2);
        C17139 c171310 = this.f60781;
        m43283(c171310.m40046("", c171310.f54661), EnumC20562.f66656.m46393(), i, iM43283);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m43285(int i) {
        int i2;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        String str2;
        boolean z4;
        String strM37076;
        String str3;
        int i3;
        int iM43283;
        int i4;
        String str4;
        boolean z5;
        String str5;
        int i5;
        int i6 = this.f22686 - 18;
        boolean z6 = this.f60775 != null;
        String strM46393 = EnumC20562.f66798.m46393();
        String str6 = " ";
        boolean z7 = this.f22704;
        boolean z8 = this.f22692;
        String str7 = AbstractC6741.f22685;
        if (z6) {
            int i7 = 0;
            strM37076 = "";
            String strM37077 = str7;
            while (i7 < this.f60775.size()) {
                C17139 c17139 = (C17139) this.f60775.get(i7);
                if (i7 > 0) {
                    strM46393 = EnumC20562.f66881.m46393();
                    strM37077 = C15489.m37076(str7, str7);
                    strM37076 = str7;
                }
                boolean z9 = z6;
                String str8 = strM46393;
                m18218(18, strM37076 + strM46393);
                if (!z8 || z7) {
                    m18219(c17139.f54660.m6342() + l.b);
                } else {
                    this.f22710.mo18524(m18222(i6, c17139.f54660.m6342() + l.b));
                    m18219(" // " + EnumC20934.f68160.m47084() + str6 + c17139.f54668);
                }
                int[] iArr = c17139.f54665;
                int i8 = this.f22686 - 18;
                if (iArr == null || iArr.length <= 0) {
                    i4 = i6;
                    str4 = str6;
                    z7 = z7;
                    z5 = z8;
                    str5 = str7;
                    i5 = i7;
                } else {
                    int length = iArr.length - 1;
                    C13111 c13111M40047 = this.f60781.m40047(iArr);
                    str4 = str6;
                    i4 = i6;
                    String strConcat = ((String) C9030.stream((List) c13111M40047.f43679).collect(C1890.joining(", "))).concat(l.b);
                    i5 = i7;
                    String strConcat2 = ((String) C9030.stream((List) c13111M40047.f43680).collect(C1890.joining(", "))).concat(l.b);
                    StringBuilder sbM23356 = C9023.m23356(str7);
                    str5 = str7;
                    sbM23356.append(EnumC20562.f66918.m46393());
                    String strM18207 = m18207(i, m18222(18, sbM23356.toString()));
                    m18228(strM18207);
                    String strM18217 = m18217(strM18207.length());
                    if (z8) {
                        if (z7) {
                            m18219(strConcat);
                        } else {
                            if (length == 0) {
                                this.f22710.mo18524(m18222(i8, strConcat));
                                m18219(" // " + strConcat2);
                            } else {
                                this.f22710.mo18524(m18222(i8, ((String) ((List) c13111M40047.f43679).get(0)).concat(",")));
                                m18219(" // " + ((String) ((List) c13111M40047.f43680).get(0)).concat(","));
                                int i9 = 1;
                                while (i9 <= length) {
                                    String str9 = i9 == length ? l.b : ",";
                                    String strConcat3 = ((String) ((List) c13111M40047.f43679).get(i9)).concat(str9);
                                    String strConcat4 = ((String) ((List) c13111M40047.f43680).get(i9)).concat(str9);
                                    this.f22710.mo18524(strM18217);
                                    this.f22710.mo18524(m18222(i8, strConcat3));
                                    m18219(" // " + strConcat4);
                                    i9++;
                                    z8 = z8;
                                }
                            }
                            z5 = z8;
                        }
                        z5 = z8;
                    } else {
                        z7 = z7;
                        z5 = z8;
                        if (length == 0) {
                            m18219(strConcat2);
                        } else {
                            m18219(((String) ((List) c13111M40047.f43680).get(0)).concat(","));
                            int i10 = 1;
                            while (i10 <= length) {
                                String strConcat5 = ((String) ((List) c13111M40047.f43680).get(i10)).concat(i10 == length ? l.b : ",");
                                this.f22710.mo18524(strM18217);
                                m18219(strConcat5);
                                i10++;
                            }
                        }
                    }
                }
                if (iArr == null || iArr.length == 0) {
                    StringBuilder sbM23357 = C9023.m23356(strM37077);
                    sbM23357.append(EnumC20562.f66918.m46393());
                    sbM23357.append(l.b);
                    m18219(m18207(i, sbM23357.toString()));
                }
                m18228(m18207(this.f60772, ""));
                i7 = i5 + 1;
                z6 = z9;
                strM46393 = str8;
                strM37076 = strM37076;
                str6 = str4;
                z7 = z7;
                i6 = i4;
                str7 = str5;
                z8 = z5;
            }
            i2 = i6;
            z = z6;
            str = str6;
            z2 = z7;
            z3 = z8;
            str2 = str7;
            z4 = true;
        } else {
            i2 = i6;
            z = z6;
            str = " ";
            z2 = z7;
            z3 = z8;
            str2 = str7;
            z4 = true;
            strM37076 = "";
        }
        String strM46394 = EnumC20562.f66798.m46393();
        if (this.f60781 != null) {
            if (z) {
                strM46394 = EnumC20562.f66881.m46393();
                str3 = str2;
                strM37076 = C15489.m37076(strM37076, str3);
            } else {
                str3 = str2;
            }
            String strM37078 = C15489.m37076(strM37076, str3);
            m18218(18, strM37076 + strM46394);
            if (!z3 || z2) {
                i3 = i2;
                m18219(this.f60781.f54660.m6342() + l.b);
            } else {
                i3 = i2;
                this.f22710.mo18524(m18222(i3, this.f60781.f54660.m6342() + l.b));
                m18219(" // " + EnumC20934.f68160.m47084() + str + this.f60781.f54668);
            }
            C17139 c171310 = this.f60781;
            int[] iArr2 = c171310.f54664;
            if (iArr2 == null || iArr2.length == 0) {
                if (c171310.f54660.m6341()) {
                    StringBuilder sbM23358 = C9023.m23356(strM37078);
                    sbM23358.append(EnumC20562.f66600.m46393());
                    sbM23358.append(l.b);
                    m18219(m18207(i, sbM23358.toString()));
                }
                iM43283 = i3;
            } else {
                C13111 c13111M40046 = c171310.m40046("", iArr2);
                StringBuilder sbM23359 = C9023.m23356(strM37078);
                sbM23359.append(EnumC20562.f66600.m46393());
                iM43283 = m43283(c13111M40046, sbM23359.toString(), i, i3);
            }
            C17139 c171311 = this.f60781;
            int[] iArr3 = c171311.f54661;
            if (iArr3 != null && iArr3.length != 0) {
                C13111 c13111M40048 = c171311.m40046("", iArr3);
                StringBuilder sbM233510 = C9023.m23356(strM37078);
                sbM233510.append(EnumC20562.f66656.m46393());
                m43283(c13111M40048, sbM233510.toString(), i, iM43283);
            } else if (c171311.f54660.m6337()) {
                StringBuilder sbM233511 = C9023.m23356(strM37078);
                sbM233511.append(EnumC20562.f66656.m46393());
                sbM233511.append(l.b);
                m18219(m18207(i, sbM233511.toString()));
            }
        }
        if (this.f60775 == null && this.f60781 == null) {
            return false;
        }
        return z4;
    }
}
