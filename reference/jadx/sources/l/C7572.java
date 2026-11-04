package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: V7EY */
/* JADX INFO: loaded from: classes4.dex */
public final class C7572 extends AbstractC1890 {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f24952;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f24953;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public C0224 f24954;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f24955;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f24956;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f24957;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public int f24958;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public boolean f24959;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f24960;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public short f24961;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f24962;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public C22180 f24963;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f24964;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m20695(int i) {
        int i2 = i;
        this.f24958 = i2;
        C0224 c0224 = this.f24954;
        C3381 c3381 = (C3381) this.f6363;
        boolean z = c3381.f67141;
        boolean z2 = c3381.f67144;
        boolean z3 = z || z2;
        boolean z4 = z && z2;
        if (z3 && this.f24961 != 0) {
            m48008(1);
            if (z4) {
                String strM1691 = c0224.m1691(this.f24961);
                StringBuilder sb = new StringBuilder("// ");
                sb.append((int) this.f24961);
                sb.append(strM1691 != null ? "# ".concat(strM1691) : "");
                m48013(sb.toString());
            } else {
                C3381 c3382 = (C3381) this.f6363;
                if (c3382.f67141) {
                    m47998("// %d#", Short.valueOf(this.f24961));
                } else if (c3382.f67144) {
                    String strM1692 = c0224.m1691(this.f24961);
                    m48013(strM1692 != null ? "// ".concat(strM1692) : "");
                }
            }
            m48012(1);
        }
        ArrayList<C13229> arrayList = this.f24960;
        boolean z5 = this.f67146;
        boolean z6 = this.f67132;
        int i3 = 18;
        if (arrayList != null) {
            for (C13229 c13229 : arrayList) {
                m48009(m48011(i2, m47996(18, EnumC22268.f71797.m50326())));
                if (!z6) {
                    m48014("%s %s;", c13229.m32777(), ((C3381) this.f6363).f6371.m5633(c13229.f42285));
                } else if (z5) {
                    m48014("%s #%d;", c13229.m32777(), Integer.valueOf(c13229.f42285));
                } else {
                    String strM32777 = c13229.m32777();
                    int i4 = c13229.f42285;
                    m48009(m47996(this.f67148 - 18, String.format("%s #%d;", strM32777, Integer.valueOf(i4))));
                    StringBuilder sb2 = new StringBuilder(" // ");
                    sb2.append(i4 == 0 ? "any" : ((C3381) this.f6363).f6371.m5633(i4));
                    m48006(sb2.toString());
                }
            }
        }
        if (this.f24962 != null) {
            m48009(m48011(i2, m47996(18, EnumC22268.f71839.m50326())));
            m48006(((String) C1170.stream(this.f24962).map(new C14611(1)).collect(C2025.joining(", "))) + l.b);
        }
        ArrayList arrayList2 = this.f24955;
        boolean z7 = this.f67155;
        if (arrayList2 != null && !z7) {
            for (Iterator it = arrayList2.iterator(); it.hasNext(); it = it) {
                C6827 c6827 = (C6827) it.next();
                m48009(m48011(i2, m47996(i3, EnumC22268.f71959.m50326())));
                if (!z6) {
                    m48014("%d %s:%s;", Short.valueOf(c6827.f27297), ((C3381) this.f6363).f6371.getName(c6827.f27301), ((C3381) this.f6363).f6371.getName(c6827.f27300));
                } else if (z5) {
                    m48014("%d #%d:#%d;", Short.valueOf(c6827.f27297), Short.valueOf(c6827.f27301), Short.valueOf(c6827.f27300));
                } else {
                    short s = c6827.f27297;
                    short s2 = c6827.f27300;
                    short s3 = c6827.f27301;
                    m48009(m47996(this.f67148 - 18, String.format("%d #%d:#%d;", Short.valueOf(s), Short.valueOf(s3), Short.valueOf(s2))));
                    m48014(" // %s:%s", ((C3381) this.f6363).f6371.getName(s3), ((C3381) this.f6363).f6371.getName(s2));
                }
                i3 = 18;
            }
        }
        ArrayList<C13538> arrayList3 = this.f24957;
        if (arrayList3 == null || z7) {
            return;
        }
        for (C13538 c13538 : arrayList3) {
            m48009(m48011(i2, m47996(18, EnumC22268.f72102.m50326())));
            if (!z6) {
                m48014("%d %s:%s;", Short.valueOf(c13538.f27297), ((C3381) this.f6363).f6371.getName(c13538.f27301), ((C3381) this.f6363).f6371.getName(c13538.f27300));
            } else if (z5) {
                m48014("%d #%d:#%d;", Short.valueOf(c13538.f27297), Short.valueOf(c13538.f27301), Short.valueOf(c13538.f27300));
            } else {
                short s4 = c13538.f27297;
                short s5 = c13538.f27300;
                short s6 = c13538.f27301;
                m48009(m47996(this.f67148 - 18, String.format("%d #%d:#%d;", Short.valueOf(s4), Short.valueOf(s6), Short.valueOf(s5))));
                m48014(" // %s:%s", ((C3381) this.f6363).f6371.getName(s6), ((C3381) this.f6363).f6371.getName(s5));
            }
            i2 = i;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m20694(int i) {
        ArrayList arrayList = this.f24956;
        boolean z = this.f67155;
        if (arrayList != null && !z) {
            m48009(m48011(i, m47996(18, EnumC22268.f71750.m50326())));
            m48006(((String) C1170.stream(this.f24956).map(new C21325(1)).collect(C2025.joining(","))) + l.b);
        }
        if (this.f24964 != null && !z) {
            m48009(m48011(i, m47996(18, EnumC22268.f71859.m50326())));
            m48006(((String) C1170.stream(this.f24964).map(new C0114(0)).collect(C2025.joining(","))) + l.b);
        }
        if (this.f24952 != null) {
            m48009(m48011(i, m47996(18, EnumC22268.f72012.m50326())));
            m48006(((String) C1170.stream(this.f24952).map(new C14611(1)).collect(C2025.joining(","))) + l.b);
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m20693(int i) {
        C22180 c22180;
        if (this.f67155 || ((c22180 = this.f24963) == null && this.f24953 == null)) {
            return false;
        }
        if (c22180 != null) {
            if (c22180.m50178()) {
                return m20690(i);
            }
            m20692(i);
            return true;
        }
        if (((C22180) this.f24953.get(0)).m50178()) {
            return m20690(i);
        }
        m20692(i);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m20691(C18941 c18941, String str, int i, int i2) {
        boolean z = ((String) c18941.f61428).isEmpty() && ((String) c18941.f61429).isEmpty();
        StringBuilder sbM27333 = C10732.m27333(str);
        sbM27333.append(z ? l.b : "");
        m48009(m48011(i, m47996(18, sbM27333.toString())));
        boolean z2 = this.f67146;
        boolean z3 = this.f67132;
        if (z3) {
            if (z2) {
                m48006((String) c18941.f61428);
            } else {
                m48009(m47996(i2, (String) c18941.f61428));
                i2 = Math.max(i2, ((String) c18941.f61428).length());
                if (!z) {
                    m48009(" // ");
                }
            }
        }
        if (z3 && (!z3 || z2)) {
            return i2;
        }
        m48006((String) c18941.f61429);
        return i2;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private boolean m20690(int i) {
        int i2;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        String str2;
        boolean z4;
        String strM34972;
        String str3;
        int i3;
        int iM20691;
        int i4;
        String str4;
        boolean z5;
        String str5;
        int i5;
        int i6 = this.f67148 - 18;
        boolean z6 = this.f24953 != null;
        String strM50326 = EnumC22268.f71828.m50326();
        String str6 = " ";
        boolean z7 = this.f67146;
        boolean z8 = this.f67132;
        String str7 = AbstractC20997.f67120;
        if (z6) {
            int i7 = 0;
            strM34972 = "";
            String strM34973 = str7;
            while (i7 < this.f24953.size()) {
                C22180 c22180 = (C22180) this.f24953.get(i7);
                if (i7 > 0) {
                    strM50326 = EnumC22268.f72084.m50326();
                    strM34973 = C14483.m34972(str7, str7);
                    strM34972 = str7;
                }
                boolean z9 = z6;
                String str8 = strM50326;
                m48005(18, strM34972 + strM50326);
                if (!z8 || z7) {
                    m48006(c22180.f71458.m38277() + l.b);
                } else {
                    this.f67151.mo3879(m47996(i6, c22180.f71458.m38277() + l.b));
                    m48006(" // " + EnumC5202.f18282.m15637() + str6 + c22180.f71469);
                }
                int[] iArr = c22180.f71465;
                int i8 = this.f67148 - 18;
                if (iArr == null || iArr.length <= 0) {
                    i4 = i6;
                    str4 = str6;
                    z7 = z7;
                    z5 = z8;
                    str5 = str7;
                    i5 = i7;
                } else {
                    int length = iArr.length - 1;
                    C18941 c18941M50175 = this.f24963.m50175(iArr);
                    str4 = str6;
                    i4 = i6;
                    String strConcat = ((String) C1170.stream((List) c18941M50175.f61428).collect(C2025.joining(", "))).concat(l.b);
                    i5 = i7;
                    String strConcat2 = ((String) C1170.stream((List) c18941M50175.f61429).collect(C2025.joining(", "))).concat(l.b);
                    StringBuilder sbM27333 = C10732.m27333(str7);
                    str5 = str7;
                    sbM27333.append(EnumC22268.f71806.m50326());
                    String strM48011 = m48011(i, m47996(18, sbM27333.toString()));
                    m48009(strM48011);
                    String strM48004 = m48004(strM48011.length());
                    if (z8) {
                        if (z7) {
                            m48006(strConcat);
                        } else {
                            if (length == 0) {
                                this.f67151.mo3879(m47996(i8, strConcat));
                                m48006(" // " + strConcat2);
                            } else {
                                this.f67151.mo3879(m47996(i8, ((String) ((List) c18941M50175.f61428).get(0)).concat(",")));
                                m48006(" // " + ((String) ((List) c18941M50175.f61429).get(0)).concat(","));
                                int i9 = 1;
                                while (i9 <= length) {
                                    String str9 = i9 == length ? l.b : ",";
                                    String strConcat3 = ((String) ((List) c18941M50175.f61428).get(i9)).concat(str9);
                                    String strConcat4 = ((String) ((List) c18941M50175.f61429).get(i9)).concat(str9);
                                    this.f67151.mo3879(strM48004);
                                    this.f67151.mo3879(m47996(i8, strConcat3));
                                    m48006(" // " + strConcat4);
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
                            m48006(strConcat2);
                        } else {
                            m48006(((String) ((List) c18941M50175.f61429).get(0)).concat(","));
                            int i10 = 1;
                            while (i10 <= length) {
                                String strConcat5 = ((String) ((List) c18941M50175.f61429).get(i10)).concat(i10 == length ? l.b : ",");
                                this.f67151.mo3879(strM48004);
                                m48006(strConcat5);
                                i10++;
                            }
                        }
                    }
                }
                if (iArr == null || iArr.length == 0) {
                    StringBuilder sbM27334 = C10732.m27333(strM34973);
                    sbM27334.append(EnumC22268.f71806.m50326());
                    sbM27334.append(l.b);
                    m48006(m48011(i, sbM27334.toString()));
                }
                m48009(m48011(this.f24958, ""));
                i7 = i5 + 1;
                z6 = z9;
                strM50326 = str8;
                strM34972 = strM34972;
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
            strM34972 = "";
        }
        String strM50327 = EnumC22268.f71828.m50326();
        if (this.f24963 != null) {
            if (z) {
                strM50327 = EnumC22268.f72084.m50326();
                str3 = str2;
                strM34972 = C14483.m34972(strM34972, str3);
            } else {
                str3 = str2;
            }
            String strM34974 = C14483.m34972(strM34972, str3);
            m48005(18, strM34972 + strM50327);
            if (!z3 || z2) {
                i3 = i2;
                m48006(this.f24963.f71458.m38277() + l.b);
            } else {
                i3 = i2;
                this.f67151.mo3879(m47996(i3, this.f24963.f71458.m38277() + l.b));
                m48006(" // " + EnumC5202.f18282.m15637() + str + this.f24963.f71469);
            }
            C22180 c22181 = this.f24963;
            int[] iArr2 = c22181.f71467;
            if (iArr2 == null || iArr2.length == 0) {
                if (c22181.f71458.m38279()) {
                    StringBuilder sbM27335 = C10732.m27333(strM34974);
                    sbM27335.append(EnumC22268.f72010.m50326());
                    sbM27335.append(l.b);
                    m48006(m48011(i, sbM27335.toString()));
                }
                iM20691 = i3;
            } else {
                C18941 c18941M50174 = c22181.m50174("", iArr2);
                StringBuilder sbM27336 = C10732.m27333(strM34974);
                sbM27336.append(EnumC22268.f72010.m50326());
                iM20691 = m20691(c18941M50174, sbM27336.toString(), i, i3);
            }
            C22180 c22182 = this.f24963;
            int[] iArr3 = c22182.f71463;
            if (iArr3 != null && iArr3.length != 0) {
                C18941 c18941M50176 = c22182.m50174("", iArr3);
                StringBuilder sbM27337 = C10732.m27333(strM34974);
                sbM27337.append(EnumC22268.f71773.m50326());
                m20691(c18941M50176, sbM27337.toString(), i, iM20691);
            } else if (c22182.f71458.m38278()) {
                StringBuilder sbM27338 = C10732.m27333(strM34974);
                sbM27338.append(EnumC22268.f71773.m50326());
                sbM27338.append(l.b);
                m48006(m48011(i, sbM27338.toString()));
            }
        }
        if (this.f24953 == null && this.f24963 == null) {
            return false;
        }
        return z4;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m20692(int i) {
        int i2 = this.f67148 - 18;
        m48005(18, EnumC22268.f72113.m50326() + l.b);
        if (this.f67132 && !this.f67146) {
            this.f67151.mo3879(m47996(i2, " "));
            m48006(" // offset " + this.f24963.f71457);
        } else {
            m47989();
        }
        C22180 c22180 = this.f24963;
        int iM20691 = m20691(c22180.m50174("", c22180.f71467), EnumC22268.f72010.m50326(), i, i2);
        C22180 c22181 = this.f24963;
        m20691(c22181.m50174("", c22181.f71463), EnumC22268.f71773.m50326(), i, iM20691);
    }
}
