package l;

import com.alipay.sdk.m.y.l;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.᩸ܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7DJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21620 extends AbstractC14504 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public int f70112;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public byte[] f70113;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public boolean f70114;

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f70115;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public C3275 f70116;

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public int f70117;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public C23490 f70118;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f70119;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public int f70120;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public C3275 f70121;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public C3275 f70122;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public int f70123;

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f70124;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f70125;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f70126;

    @Override // l.AbstractC14504
    /* JADX INFO: renamed from: ۙ */
    public final void mo11476(List... listArr) {
        throw null;
    }

    public C21620(C5061 c5061) {
        super(c5061);
        this.f70126 = new HashMap();
        this.f70119 = new ArrayList(0);
        this.f70115 = new ArrayList(0);
        this.f70114 = true;
        if (c5061.f22695) {
            this.f70120 = 7;
            this.f70112 = 7;
        } else {
            this.f70120 = 7;
            this.f70112 = 7 - m18205();
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private int m48330(int i) {
        if (i >= 0) {
            byte[] bArr = this.f70113;
            if (i < bArr.length) {
                return bArr[i];
            }
        }
        throw new IndexOutOfBoundsException(this.f47519.m2162("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private int m48329(int i) {
        if (i >= 0) {
            byte[] bArr = this.f70113;
            if (i < bArr.length) {
                return bArr[i] & 255;
            }
        }
        throw new IndexOutOfBoundsException(this.f47519.m2162("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m48331(int i) {
        if (i >= 0) {
            int i2 = i + 1;
            byte[] bArr = this.f70113;
            if (i2 < bArr.length) {
                return (bArr[i] << 8) | (bArr[i2] & 255);
            }
        }
        throw new IndexOutOfBoundsException(this.f47519.m2162("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m48332(int i) {
        if (i >= 0) {
            int i2 = i + 1;
            byte[] bArr = this.f70113;
            if (i2 < bArr.length) {
                return ((bArr[i] << 8) | (bArr[i2] & 255)) & 65535;
            }
        }
        throw new IndexOutOfBoundsException(this.f47519.m2162("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    private int getInt(int i) {
        return (m48331(i + 2) & 65535) | (m48331(i) << 16);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C18736 m48335(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f70126;
        C18736 c18736 = (C18736) map.get(numValueOf);
        if (c18736 != null) {
            return c18736;
        }
        C5061 c5061 = (C5061) this.f47511;
        C18736 c18737 = new C18736(c5061);
        c18737.f60783 = (short) 0;
        c18737.f60780 = false;
        c18737.f60778 = (C3980) c5061.f47511;
        c18737.m18216(this);
        c18737.m18208(1);
        map.put(numValueOf, c18737);
        return c18737;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48334(int i, DataInputStream dataInputStream) {
        C17139 c17139;
        boolean z;
        C3275 c3275;
        this.f70117 = dataInputStream.readUnsignedShort();
        this.f70123 = dataInputStream.readUnsignedShort();
        int i2 = dataInputStream.readInt();
        int i3 = 2;
        this.f47519.m2146("CodeAttr:  CodeLength=%d FullLength=%d max_stack=%d max_locals=%d", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.f70117), Integer.valueOf(this.f70123));
        byte[] bArr = new byte[i2];
        this.f70113 = bArr;
        dataInputStream.read(bArr, 0, i2);
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f47519.m2146("CodeAttr:  TrapTable[%d]", Integer.valueOf(unsignedShort));
        this.f70115 = new ArrayList(unsignedShort);
        for (int i4 = 0; i4 < unsignedShort; i4++) {
            ArrayList arrayList = this.f70115;
            C1616 c1616 = new C1616();
            c1616.f6507 = i4;
            c1616.f6509 = dataInputStream.readUnsignedShort();
            c1616.f6511 = dataInputStream.readUnsignedShort();
            c1616.f6510 = dataInputStream.readUnsignedShort();
            c1616.f6508 = dataInputStream.readUnsignedShort();
            arrayList.add(c1616);
        }
        int unsignedShort2 = dataInputStream.readUnsignedShort();
        this.f47519.m2146("CodeAttr: add.attr: %d", Integer.valueOf(unsignedShort2));
        int i5 = 0;
        while (i5 < unsignedShort2) {
            int unsignedShort3 = dataInputStream.readUnsignedShort();
            AbstractC12449 abstractC12449M27823 = this.f47512.m27823(unsignedShort3);
            if (abstractC12449M27823 != null && abstractC12449M27823.f41512 == EnumC6098.CONSTANT_UTF8) {
                String strM27826 = this.f47512.m27826(unsignedShort3, new C13315(7));
                this.f47519.m2146(C0252.m1693("CodeAttr:  attr: ", strM27826), new Object[0]);
                final EnumC16783 enumC16783M39426 = EnumC16783.m39426(strM27826);
                switch (C15271.f49774[enumC16783M39426.ordinal()]) {
                    case 1:
                    case 2:
                        final int i6 = dataInputStream.readInt();
                        final int unsignedShort4 = dataInputStream.readUnsignedShort();
                        this.f70118 = new C23490(enumC16783M39426, this, unsignedShort4);
                        this.f70114 = true;
                        this.f47519.m2152(new Supplier() { // from class: l.᩺ܰۤ
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return String.format("CodeAttr:  %s: attrLength=%d num=%d", enumC16783M39426.name(), Integer.valueOf(i6), Integer.valueOf(unsignedShort4));
                            }
                        });
                        int i7 = 0;
                        int i8 = 0;
                        boolean z2 = false;
                        int i9 = 0;
                        while (i7 < unsignedShort4) {
                            int i10 = C15271.f49774[enumC16783M39426.ordinal()];
                            if (i10 == 1) {
                                c17139 = new C17139(this, dataInputStream);
                            } else {
                                if (i10 != i3) {
                                    throw new IllegalStateException("Unexpected value: " + enumC16783M39426);
                                }
                                if (!this.f70114) {
                                    z = false;
                                } else if (i7 == 0 || ((Boolean) this.f70118.f76053.get(i7 - 1)).booleanValue()) {
                                    z = true;
                                } else {
                                    this.f70114 = false;
                                    z = false;
                                }
                                c17139 = new C17139(z, i8, this, dataInputStream);
                            }
                            if (c17139.f54660 == EnumC1965.EARLY_LARVAL) {
                                c17139.f54672 = z2;
                                c17139.f54669 = i9;
                                this.f70118.m51752(c17139, true);
                                i9++;
                                z2 = true;
                            } else {
                                c17139.f54672 = z2;
                                c17139.f54669 = i9;
                                this.f70118.m51752(c17139, false);
                                i7++;
                                z2 = false;
                                i9 = 0;
                            }
                            i8 = c17139.f54657;
                            i3 = 2;
                        }
                        break;
                    case 3:
                        int i11 = dataInputStream.readInt();
                        int unsignedShort5 = dataInputStream.readUnsignedShort();
                        boolean z3 = this.f22689;
                        c3275 = z3 ? new C3275(this, C10270.class, unsignedShort5) : null;
                        AbstractC0410 abstractC0410 = this.f47519;
                        Integer numValueOf = Integer.valueOf(unsignedShort5);
                        Integer numValueOf2 = Integer.valueOf(i11);
                        Object[] objArr = new Object[i3];
                        objArr[0] = numValueOf;
                        objArr[1] = numValueOf2;
                        abstractC0410.m2146("CodeAttr:  LineNumberTable[%d] length=%d", objArr);
                        for (int i12 = 0; i12 < unsignedShort5; i12++) {
                            C5061 c5061 = (C5061) this.f47511;
                            C10270 c10270 = new C10270();
                            c10270.f35014 = dataInputStream.readShort();
                            c10270.f35012 = dataInputStream.readShort();
                            c10270.f22710 = c5061.f22710;
                            c10270.f35013 = C2271.m6966(c5061.f22695 ? 11 : 9, "%", "s %4d:  %7d");
                            if (z3) {
                                c3275.m9755(c10270);
                            }
                        }
                        this.f70121 = c3275;
                        break;
                    case 4:
                        int i13 = dataInputStream.readInt();
                        int unsignedShort6 = dataInputStream.readUnsignedShort();
                        boolean z4 = this.f22691;
                        c3275 = z4 ? new C3275(this, C15915.class, unsignedShort6) : null;
                        AbstractC0410 abstractC0411 = this.f47519;
                        Integer numValueOf3 = Integer.valueOf(unsignedShort6);
                        Integer numValueOf4 = Integer.valueOf(i13);
                        Object[] objArr2 = new Object[i3];
                        objArr2[0] = numValueOf3;
                        objArr2[1] = numValueOf4;
                        abstractC0411.m2146("CodeAttr:  LocalVariableTable[%d] length=%d", objArr2);
                        for (int i14 = 0; i14 < unsignedShort6; i14++) {
                            C15915 c15915 = new C15915(dataInputStream, (C5061) this.f47511, EnumC20934.f68103.m47084());
                            if (z4) {
                                c3275.m9755(c15915);
                            }
                        }
                        this.f70122 = c3275;
                        break;
                    case 5:
                        int i15 = dataInputStream.readInt();
                        int unsignedShort7 = dataInputStream.readUnsignedShort();
                        boolean z5 = this.f22701;
                        c3275 = z5 ? new C3275(this, C20148.class, unsignedShort7) : null;
                        AbstractC0410 abstractC0412 = this.f47519;
                        Integer numValueOf5 = Integer.valueOf(unsignedShort7);
                        Integer numValueOf6 = Integer.valueOf(i15);
                        Object[] objArr3 = new Object[i3];
                        objArr3[0] = numValueOf5;
                        objArr3[1] = numValueOf6;
                        abstractC0412.m2146("CodeAttr:  LocalVariableTypeTable[%d] length=%d", objArr3);
                        for (int i16 = 0; i16 < unsignedShort7; i16++) {
                            C20148 c20148 = new C20148(dataInputStream, (C5061) this.f47511, EnumC20934.f68121.m47084());
                            if (z5) {
                                c3275.m9755(c20148);
                            }
                        }
                        this.f70116 = c3275;
                        break;
                    case 6:
                    case 7:
                        boolean z6 = enumC16783M39426 == EnumC16783.f53728;
                        int i17 = dataInputStream.readInt();
                        short s = dataInputStream.readShort();
                        ArrayList arrayList2 = new ArrayList(s);
                        AbstractC0410 abstractC0413 = this.f47519;
                        String str = z6 ? "Inv" : "V";
                        Integer numValueOf7 = Integer.valueOf(i17);
                        Integer numValueOf8 = Integer.valueOf(s);
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = str;
                        objArr4[1] = numValueOf7;
                        objArr4[i3] = numValueOf8;
                        abstractC0413.m2146("CodeAttr:   Runtime%sisibleTypeAnnotation: attrLength=%d num= %d", objArr4);
                        for (int i18 = 0; i18 < s; i18++) {
                            C3027 c3027 = new C3027((C5061) this.f47511, z6);
                            c3027.mo9027(dataInputStream);
                            arrayList2.add(c3027);
                        }
                        if (z6) {
                            this.f70125 = arrayList2;
                        } else {
                            this.f70124 = arrayList2;
                        }
                        break;
                    default:
                        C15708 c15708 = new C15708(this.f47519, enumC16783M39426);
                        c15708.m37410(unsignedShort3, dataInputStream.readInt(), dataInputStream);
                        this.f70119.add(c15708);
                        break;
                }
            }
            i5++;
            i3 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:189:0x0724  */
    /* JADX WARN: Code duplicated, block: B:225:0x0846  */
    /* JADX WARN: Code duplicated, block: B:226:0x086b  */
    /* JADX WARN: Instruction removed from duplicated block: B:189:0x0724, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:225:0x0846, please report this as an issue */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private int m48326(int i, int i2) {
        int iM48332;
        boolean z;
        int i3;
        String str;
        String str2;
        String str3;
        boolean z2;
        String str4;
        String str5;
        boolean z3;
        int iM48329 = m48329(i);
        EnumC20562 enumC20562M45102 = C19857.m45102(Integer.valueOf(iM48329));
        boolean z4 = this.f22699;
        if (enumC20562M45102 == null) {
            this.f22710.mo18524(m18222(18, "bytecode"));
            StringBuilder sb = new StringBuilder();
            sb.append(z4 ? C1115.m4131(iM48329) : Integer.valueOf(iM48329));
            sb.append(l.b);
            m18219(sb.toString());
            return 1;
        }
        int[] iArr = C15271.f49775;
        switch (iArr[enumC20562M45102.ordinal()]) {
            case 23:
                ArrayList arrayListM48328 = m48328(i, 1);
                if (arrayListM48328.size() != 1) {
                    m48327(enumC20562M45102.m46394(), arrayListM48328, i2);
                    return 1;
                }
                EnumC20562 enumC20562M45103 = C19857.m45102(Integer.valueOf((iM48329 << 8) + m48329(i + 1)));
                if (enumC20562M45103 == null) {
                    this.f22710.mo18524(m18222(18, EnumC20562.f66889.m46393()));
                    m18219(enumC20562M45102.m46397() + l.b);
                    return 1;
                }
                String strM46393 = enumC20562M45103.m46393();
                if (enumC20562M45103 == EnumC20562.f66954) {
                    ArrayList arrayListM48329 = m48328(i, 5);
                    if (arrayListM48329.size() != 5) {
                        m48327(enumC20562M45102.m46394(), arrayListM48329, i2);
                        return 6;
                    }
                    m18228(m18222(18, strM46393));
                    m18210("%d, %d;", Integer.valueOf(m48332(i + 2)), Integer.valueOf(m48332(i + 4)));
                    return 6;
                }
                ArrayList arrayListM483210 = m48328(i, 3);
                if (arrayListM483210.size() != 3) {
                    m48327(enumC20562M45102.m46394(), arrayListM483210, i2);
                    return 4;
                }
                this.f22710.mo18524(m18222(18, strM46393));
                m18210("%d;", Integer.valueOf(m48332(i + 2)));
                return 4;
            case 24:
            case 25:
                ArrayList arrayListM483211 = m48328(i, 1);
                if (arrayListM483211.size() != 1) {
                    m48327(enumC20562M45102.m46394(), arrayListM483211, i2);
                    return 2;
                }
                int iM483210 = m48329(i + 1);
                EnumC20562 enumC20562M45104 = C19857.m45102(Integer.valueOf((iM48329 << 8) + iM483210));
                if (enumC20562M45104 != null) {
                    m18219(enumC20562M45104.m46393() + l.b);
                    return 2;
                }
                this.f22710.mo18524(m18222(18, enumC20562M45102.m46393()));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z4 ? C1115.m4131(iM483210) : Integer.valueOf(iM483210));
                sb2.append(l.b);
                m18219(sb2.toString());
                return 2;
            default:
                if (enumC20562M45102.m46393() == null) {
                    this.f22710.mo18524(m18222(18, "bytecode"));
                    m18219(enumC20562M45102 + l.b);
                    return 1;
                }
                if (!enumC20562M45102.m46395()) {
                    this.f22710.mo18524(m18222(18, "bytecode"));
                    m18219(enumC20562M45102 + l.b);
                    return 1;
                }
                String strM46394 = enumC20562M45102.m46393();
                int i4 = iArr[enumC20562M45102.ordinal()];
                String str6 = "BOGUS;";
                boolean z5 = this.f22704;
                boolean z6 = this.f22692;
                switch (i4) {
                    case 1:
                        int i5 = (i + 4) & (-4);
                        try {
                            int i6 = getInt(i5);
                            int i7 = getInt(i5 + 4);
                            int i8 = getInt(i5 + 8);
                            str2 = "BOGUS;";
                            int i9 = i8 - i7;
                            try {
                                str = strM46394;
                                try {
                                    m18218(this.f22686, m18222(17, strM46394) + " { ");
                                    m18219((!z6 || z5) ? "" : " // " + i7 + " to " + i8);
                                    for (int i10 = 0; i10 <= i9; i10++) {
                                        try {
                                            this.f22710.mo18524(m18207(i2, m18222(9, String.format("%2d: ", Integer.valueOf(i10 + i7)))));
                                            m18219(((C5061) this.f47511).m18211() + (getInt((i10 * 4) + i5 + 12) + i) + l.b);
                                        } catch (IndexOutOfBoundsException e) {
                                            e = e;
                                            str3 = " };";
                                            z2 = false;
                                            if (z2) {
                                                m18219(str + " { ");
                                                m18209(m18207(i2, str2));
                                                m18219(m18207(i2, str3));
                                            } else {
                                                this.f22710.mo18527(str2);
                                                m18219(m18207(i2, str3));
                                            }
                                            this.f47519.m2151(e);
                                            return 1;
                                        }
                                    }
                                    this.f22710.mo18524(m18207(i2, m18222(15 - m18205(), "default: " + ((C5061) this.f47511).m18211() + (i6 + i))));
                                    str3 = " };";
                                    try {
                                        m18219(str3);
                                        return (i9 * 4) + (i5 - i) + 16;
                                    } catch (IndexOutOfBoundsException e2) {
                                        e = e2;
                                        z2 = false;
                                        if (z2) {
                                            m18219(str + " { ");
                                            m18209(m18207(i2, str2));
                                            m18219(m18207(i2, str3));
                                        } else {
                                            this.f22710.mo18527(str2);
                                            m18219(m18207(i2, str3));
                                        }
                                        this.f47519.m2151(e);
                                        return 1;
                                    }
                                } catch (IndexOutOfBoundsException e3) {
                                    e = e3;
                                    str3 = " };";
                                    z2 = true;
                                    if (z2) {
                                        m18219(str + " { ");
                                        m18209(m18207(i2, str2));
                                        m18219(m18207(i2, str3));
                                    } else {
                                        this.f22710.mo18527(str2);
                                        m18219(m18207(i2, str3));
                                    }
                                    this.f47519.m2151(e);
                                    return 1;
                                }
                            } catch (IndexOutOfBoundsException e4) {
                                e = e4;
                                str = strM46394;
                            }
                        } catch (IndexOutOfBoundsException e5) {
                            e = e5;
                            str = strM46394;
                            str2 = "BOGUS;";
                            str3 = " };";
                        }
                        break;
                    case 2:
                        int i11 = (i + 4) & (-4);
                        try {
                            int i12 = getInt(i11);
                            int i13 = getInt(i11 + 4);
                            m18218(this.f22686, m18222(17, strM46394) + " { ");
                            m18219((!z6 || z5) ? "" : " // " + i13);
                            try {
                                C13111[] c13111ArrM48333 = m48333(i11, i13);
                                int iMax = Math.max(9, C20318.stream(c13111ArrM48333).mapToInt(new C6803()).max().orElse(0) + 2);
                                int i14 = 0;
                                while (i14 < i13) {
                                    str4 = str6;
                                    try {
                                        this.f22710.mo18524(m18207(i2, m18222(iMax, String.format("%2d:", c13111ArrM48333[i14].f43679))));
                                        m18219(((C5061) this.f47511).m18211() + (((Integer) c13111ArrM48333[i14].f43680).intValue() + i) + l.b);
                                        i14++;
                                        str6 = str4;
                                    } catch (IndexOutOfBoundsException e6) {
                                        e = e6;
                                        str5 = " };";
                                        z3 = false;
                                        if (z3) {
                                            m18219(strM46394 + " { ");
                                        }
                                        m18209(m18207(i2, str4));
                                        m18219(m18207(i2, str5));
                                        this.f47519.m2151(e);
                                        return 1;
                                    }
                                }
                                str4 = str6;
                                this.f22710.mo18524(m18207(i2, m18222(15 - m18205(), m18222(iMax, "default: ") + ((C5061) this.f47511).m18211() + (i12 + i))));
                                str5 = " };";
                                try {
                                    m18219(str5);
                                    return C0252.m1692(i13, 1, 8, i11 - i);
                                } catch (IndexOutOfBoundsException e7) {
                                    e = e7;
                                    z3 = false;
                                    if (z3) {
                                        m18219(strM46394 + " { ");
                                    }
                                    m18209(m18207(i2, str4));
                                    m18219(m18207(i2, str5));
                                    this.f47519.m2151(e);
                                    return 1;
                                }
                            } catch (IndexOutOfBoundsException e8) {
                                e = e8;
                                str4 = str6;
                            }
                        } catch (IndexOutOfBoundsException e9) {
                            e = e9;
                            str4 = "BOGUS;";
                            str5 = " };";
                            z3 = true;
                        }
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        ArrayList arrayListM483212 = m48328(i, 2);
                        if (arrayListM483212.size() != 2) {
                            m48327(enumC20562M45102.m46394(), arrayListM483212, i2);
                            return 3;
                        }
                        this.f22710.mo18524(m18222(18, strM46394));
                        m18219(((C5061) this.f47511).m18211() + (i + m48331(i + 1)) + l.b);
                        return 3;
                    case 21:
                    case 22:
                        ArrayList arrayListM483213 = m48328(i, 4);
                        if (arrayListM483213.size() != 4) {
                            m48327(enumC20562M45102.m46394(), arrayListM483213, i2);
                            return 5;
                        }
                        this.f22710.mo18524(m18222(18, strM46394));
                        m18219(((C5061) this.f47511).m18211() + (i + getInt(i + 1)) + l.b);
                        return 5;
                    case 23:
                    case 24:
                    case 25:
                    default:
                        m18219(strM46394 + l.b);
                        return 1;
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                        ArrayList arrayListM483214 = m48328(i, 1);
                        if (arrayListM483214.size() != 1) {
                            m48327(enumC20562M45102.m46394(), arrayListM483214, i2);
                            return 2;
                        }
                        this.f22710.mo18524(m18222(18, strM46394));
                        m18219(m48329(i + 1) + l.b);
                        return 2;
                    case 37:
                        ArrayList arrayListM483215 = m48328(i, 2);
                        if (arrayListM483215.size() != 2) {
                            m48327(enumC20562M45102.m46394(), arrayListM483215, i2);
                            return 3;
                        }
                        this.f22710.mo18524(m18222(18, strM46394));
                        m18210("%d, %d;", Integer.valueOf(m48329(i + 1)), Integer.valueOf(m48330(i + 2)));
                        return 3;
                    case 38:
                        ArrayList arrayListM483216 = m48328(i, 1);
                        if (arrayListM483216.size() != 1) {
                            m48327(enumC20562M45102.m46394(), arrayListM483216, i2);
                            return 2;
                        }
                        int iM483211 = m48329(i + 1);
                        EnumC4602 enumC4602M7618 = C2485.m7618(iM483211);
                        if (enumC4602M7618 == null) {
                            this.f22710.mo18524(m18222(18, strM46394));
                            m18219("BOGUS TYPE: " + C1115.m4132(8, iM483211) + l.b);
                            return 2;
                        }
                        this.f22710.mo18524(m18222(18, strM46394));
                        m18219(enumC4602M7618.m12746() + l.b);
                        return 2;
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                        try {
                            new HashMap();
                            EnumC20562 enumC20562 = EnumC20562.f66633;
                            Map map = AbstractC6741.f22684;
                            if (enumC20562M45102 == enumC20562) {
                                z = true;
                                iM48332 = m48329(i + 1);
                                i3 = 2;
                            } else if (enumC20562M45102 == EnumC20562.f66934) {
                                map = AbstractC6741.f22683;
                                iM48332 = m48332(i + 1);
                                z = true;
                                i3 = 5;
                            } else {
                                iM48332 = m48332(i + 1);
                                z = true;
                                i3 = 3;
                            }
                            this.f47512.m27819(z);
                            if (!z6) {
                                m18228(m18222(18, strM46394));
                                m18219(m18214(this.f47512.m27825(iM48332), i2 + 18, "", map) + l.b);
                            } else if (z5) {
                                m18219(String.format("%s #%d;", m18222(17, strM46394), Integer.valueOf(iM48332)));
                            } else {
                                m18218(this.f22686, String.format("%s #%d;", m18222(17, strM46394), Integer.valueOf(iM48332)));
                                m18228(" // ");
                                m18219(m18214(this.f47512.m27825(iM48332), this.f22686 + i2, " // ", map));
                            }
                            this.f47512.m27819(false);
                            return i3;
                        } catch (IndexOutOfBoundsException e10) {
                            if (!z6) {
                                this.f22710.mo18524(m18222(18, strM46394));
                                m18219("BOGUS;");
                            } else if (z5) {
                                m18219(m18222(17, strM46394) + " BOGUS;");
                            } else {
                                m18218(this.f22686, C15489.m37076(m18222(17, strM46394), " BOGUS;"));
                                m18219(" // " + e10.getMessage());
                            }
                            this.f47519.m2151(e10);
                            return 1;
                        }
                    case 43:
                    case 44:
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                        ArrayList arrayListM483217 = m48328(i, 2);
                        if (arrayListM483217.size() != 2) {
                            m48327(enumC20562M45102.m46394(), arrayListM483217, i2);
                            return 3;
                        }
                        int iM48333 = m48332(i + 1);
                        if (!z6) {
                            m18228(m18222(18, strM46394));
                            m18219(this.f47512.m27825(iM48333) + l.b);
                            return 3;
                        }
                        if (z5) {
                            m18219(String.format("%s #%d;", m18222(17, strM46394), Integer.valueOf(iM48333)));
                            return 3;
                        }
                        m18218(this.f22686, String.format("%s #%d;", m18222(17, strM46394), Integer.valueOf(iM48333)));
                        m18219(" // " + this.f47512.m27825(iM48333));
                        return 3;
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        int i15 = enumC20562M45102 == EnumC20562.f66788 ? 3 : 4;
                        ArrayList arrayListM483218 = m48328(i, i15);
                        if (arrayListM483218.size() == i15) {
                            int iM48334 = m48332(i + 1);
                            int iM483212 = m48329(i + 3);
                            if (!z6) {
                                m18228(m18222(18, strM46394));
                                m18210("%s, %d;", this.f47512.m27825(iM48334), Integer.valueOf(iM483212));
                            } else if (z5) {
                                m18219(String.format("%s #%d, %d;", m18222(17, strM46394), Integer.valueOf(iM48334), Integer.valueOf(iM483212)));
                            } else {
                                m18218(this.f22686, String.format("%s #%d, %d;", m18222(17, strM46394), Integer.valueOf(iM48334), Integer.valueOf(iM483212)));
                                m18219(" // " + this.f47512.m27825(iM48334));
                            }
                        } else {
                            m48327(enumC20562M45102.m46394(), arrayListM483218, i2);
                        }
                        return i15 + 1;
                    case 56:
                        ArrayList arrayListM483219 = m48328(i, 2);
                        if (arrayListM483219.size() != 2) {
                            m48327(enumC20562M45102.m46394(), arrayListM483219, i2);
                            return 3;
                        }
                        this.f22710.mo18524(m18222(18, strM46394));
                        m18219(m48331(i + 1) + l.b);
                        return 3;
                    case 57:
                        ArrayList arrayListM483220 = m48328(i, 1);
                        if (arrayListM483220.size() != 1) {
                            m48327(enumC20562M45102.m46394(), arrayListM483220, i2);
                            return 2;
                        }
                        this.f22710.mo18524(m18222(18, strM46394));
                        m18219(m48330(i + 1) + l.b);
                        return 2;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48327(byte b, ArrayList arrayList, int i) {
        this.f22710.mo18524(m18222(18, EnumC20562.f66889.m46393()));
        StringBuilder sb = new StringBuilder();
        int i2 = C1115.f5034;
        int i3 = 2;
        while (i3 > 0 && (b >> ((i3 - 1) * 4)) == 0) {
            i3--;
        }
        sb.append(C1115.m4132(i3, b));
        sb.append(l.b);
        m18219(sb.toString());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte bByteValue = ((Byte) it.next()).byteValue();
            this.f22710.mo18524(m18226(i, " "));
            this.f22710.mo18524(m18222(18, EnumC20562.f66889.m46393()));
            StringBuilder sb2 = new StringBuilder();
            int i4 = 2;
            while (i4 > 0 && (bByteValue >> ((i4 - 1) * 4)) == 0) {
                i4--;
            }
            sb2.append(C1115.m4132(i4, bByteValue));
            sb2.append(l.b);
            m18219(sb2.toString());
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private ArrayList m48328(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        int length = this.f70113.length;
        for (int i3 = 1; i3 <= i2 && i + i3 < length; i3++) {
            arrayList.add(Byte.valueOf(this.f70113[i3]));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private C13111[] m48333(int i, int i2) {
        try {
            C13111[] c13111Arr = new C13111[i2];
            for (int i3 = 1; i3 <= i2; i3++) {
                int i4 = i3 * 8;
                c13111Arr[i3 - 1] = new C13111(Integer.valueOf(getInt(i + i4)), Integer.valueOf(getInt(i + 4 + i4)));
            }
            return c13111Arr;
        } catch (NegativeArraySizeException unused) {
            throw new IndexOutOfBoundsException(this.f47519.m2162("The index {0} is out of range for the code array of the method.", Integer.valueOf(i2)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x019e  */
    @Override // l.AbstractC6741, l.InterfaceC5144
    /* JADX INFO: renamed from: ܰ */
    public final void mo3628() {
        int iM1692;
        C3275 c3275 = this.f70121;
        if (c3275 != null) {
            for (C10270 c10270 : c3275.f12145) {
                m48335(c10270.f35014).f60783 = c10270.f35012;
            }
        }
        C23490 c23490 = this.f70118;
        HashMap map = this.f70126;
        if (c23490 != null && !this.f22709) {
            boolean z = true;
            ArrayList arrayList = null;
            for (int i = 0; i < this.f70118.f12145.size(); i++) {
                C17139 c17139 = (C17139) ((AbstractC6741) this.f70118.f12145.get(i));
                if (((Boolean) this.f70118.f76053.get(i)).booleanValue()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c17139);
                } else {
                    C18736 c18736M48335 = m48335(c17139.f54657);
                    c18736M48335.f60781 = c17139;
                    c18736M48335.f60775 = arrayList;
                    z = false;
                    arrayList = null;
                }
            }
            if (arrayList != null) {
                (z ? (C18736) map.get(Collections.min(map.keySet())) : (C18736) map.get(Collections.max(map.keySet()))).f60775 = arrayList;
            }
        }
        if (!((C5061) this.f47511).f22695) {
            int i2 = 0;
            while (i2 < this.f70113.length) {
                EnumC20562 enumC20562M45102 = C19857.m45102(Integer.valueOf(m48329(i2)));
                if (enumC20562M45102 != null) {
                    switch (C15271.f49775[enumC20562M45102.ordinal()]) {
                        case 1:
                            int i3 = (i2 + 4) & (-4);
                            try {
                                int i4 = getInt(i3);
                                int i5 = getInt(i3 + 8) - getInt(i3 + 4);
                                for (int i6 = 0; i6 <= i5; i6++) {
                                    m48335(getInt((i6 * 4) + i3 + 12) + i2).f60780 = true;
                                }
                                m48335(i4 + i2).f60780 = true;
                                iM1692 = (i3 - i2) + 16 + (i5 * 4);
                            } catch (IndexOutOfBoundsException e) {
                                this.f47519.m2151(e);
                                m48335(i2).f60780 = true;
                                iM1692 = 1;
                            }
                            break;
                        case 2:
                            int i7 = (i2 + 4) & (-4);
                            try {
                                int i8 = getInt(i7);
                                int i9 = i7 + 4;
                                int i10 = getInt(i9);
                                for (int i11 = 1; i11 <= i10; i11++) {
                                    m48335(getInt((i11 * 8) + i9) + i2).f60780 = true;
                                }
                                m48335(i8 + i2).f60780 = true;
                                iM1692 = C0252.m1692(i10, 1, 8, i7 - i2);
                            } catch (IndexOutOfBoundsException e2) {
                                this.f47519.m2151(e2);
                                m48335(i2).f60780 = true;
                                iM1692 = 1;
                            }
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                            try {
                                m48335(m48331(i2 + 1) + i2).f60780 = true;
                                iM1692 = 3;
                            } catch (IndexOutOfBoundsException e3) {
                                this.f47519.m2151(e3);
                                m48335(i2).f60780 = true;
                                iM1692 = 1;
                            }
                            break;
                        case 21:
                        case 22:
                            m48335(getInt(i2 + 1) + i2).f60780 = true;
                            iM1692 = 5;
                            break;
                        case 23:
                        case 24:
                        case 25:
                            enumC20562M45102 = C19857.m45102(Integer.valueOf((enumC20562M45102.m46398().intValue() << 8) + m48329(i2 + 1)));
                            if (enumC20562M45102 != null || (iM1692 = enumC20562M45102.m46392()) == 0) {
                                iM1692 = 1;
                            }
                            break;
                        default:
                            if (enumC20562M45102 != null) {
                                iM1692 = 1;
                            } else {
                                iM1692 = 1;
                            }
                            break;
                    }
                } else {
                    try {
                        m48335(i2).f60780 = true;
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        iM1692 = 1;
                    }
                    iM1692 = 1;
                }
                i2 += iM1692;
            }
        }
        for (C1616 c1616 : this.f70115) {
            C18736 c18736M48336 = m48335(c1616.f6509);
            if (c18736M48336.f60782 == null) {
                c18736M48336.f60782 = new ArrayList(4);
            }
            c18736M48336.f60782.add(c1616);
            C18736 c18736M48337 = m48335(c1616.f6511);
            if (c18736M48337.f60773 == null) {
                c18736M48337.f60773 = new ArrayList(4);
            }
            c18736M48337.f60773.add(c1616);
            C18736 c18736M48338 = m48335(c1616.f6510);
            if (c18736M48338.f60779 == null) {
                c18736M48338.f60779 = new ArrayList(4);
            }
            c18736M48338.f60779.add(c1616);
        }
        C3275 c3276 = this.f70122;
        if (c3276 != null) {
            for (C15915 c15915 : c3276.f12145) {
                C18736 c18736M48339 = m48335(c15915.f67740);
                if (c18736M48339.f60777 == null) {
                    c18736M48339.f60777 = new ArrayList(4);
                }
                c18736M48339.f60777.add(c15915);
                C18736 c18736M483310 = m48335(c15915.f67740 + c15915.f67746);
                if (c18736M483310.f60784 == null) {
                    c18736M483310.f60784 = new ArrayList(4);
                }
                c18736M483310.f60784.add(c15915);
            }
        }
        C3275 c3277 = this.f70116;
        if (c3277 != null) {
            for (C20148 c20148 : c3277.f12145) {
                C18736 c18736M483311 = m48335(c20148.f67740);
                if (c18736M483311.f60776 == null) {
                    c18736M483311.f60776 = new ArrayList(4);
                }
                c18736M483311.f60776.add(c20148);
                C18736 c18736M483312 = m48335(c20148.f67740 + c20148.f67746);
                if (c18736M483312.f60774 == null) {
                    c18736M483312.f60774 = new ArrayList(4);
                }
                c18736M483312.f60774.add(c20148);
            }
        }
        m18208(1);
        m18224("%s %d  %s %d", EnumC20934.f68108.m47084(), Integer.valueOf(this.f70117), EnumC20934.f68042.m47084(), Integer.valueOf(this.f70123));
        m18227(1);
        ((C5061) this.f47511).m14103();
        m18209("{");
        C18736 c18736 = (C18736) map.get(0);
        int i12 = this.f22686;
        int i13 = this.f70120;
        this.f22686 = (i12 - i13) - m18233();
        int iM48326 = 0;
        while (iM48326 < this.f70113.length) {
            int i14 = this.f70112;
            if (c18736 != null) {
                m18208(1);
                c18736.f22686 = this.f22686;
                c18736.m43288(i14);
                m18227(1);
            }
            if (((C5061) this.f47511).f22695) {
                m18208(1);
                m18223(m18222(i13, String.format("%2d:", Integer.valueOf(iM48326))));
            } else {
                m18223(m18222(i13, (c18736 == null || !c18736.f60780) ? " " : ((C5061) this.f47511).m18211() + iM48326 + ":"));
                m18208(1);
            }
            if (c18736 != null && c18736.m43287(i14)) {
                m18228(m18207(i14, ""));
            }
            iM48326 += m48326(iM48326, m18233() + i14);
            c18736 = (C18736) map.get(Integer.valueOf(iM48326));
            if (c18736 != null) {
                c18736.m43286(i14);
                m18227(1);
            }
            m18227(1);
        }
        if (c18736 != null && c18736.f60781 != null && c18736.f60780) {
            C5061 c5061 = (C5061) this.f47511;
            if (c5061.f22695) {
                m18208(1);
                m18223(m18222(0, String.format("%2d:", Integer.valueOf(this.f70113.length))));
                m18227(1);
            } else {
                m18229(m18222(this.f70113.length, String.format("%s%d:", c5061.m18211(), Integer.valueOf(this.f70113.length))), 0);
            }
        }
        List[] listArr = {this.f70124, this.f70125};
        boolean z2 = true;
        for (int i15 = 0; i15 < 2; i15++) {
            List list = listArr[i15];
            if (list != null) {
                if (z2) {
                    this.f22710.mo18527("");
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C12885) it.next()).mo3628();
                    m18221();
                    z2 = false;
                }
            }
        }
        C3275[] c3275Arr = {this.f70121, this.f70122, this.f70116, this.f70118};
        for (int i16 = 0; i16 < 4; i16++) {
            C3275 c3278 = c3275Arr[i16];
            if (c3278 != null && c3278.mo9757()) {
                c3278.f22686 = this.f22686;
                c3278.mo3628();
            }
        }
        m18209(l.d);
    }
}
