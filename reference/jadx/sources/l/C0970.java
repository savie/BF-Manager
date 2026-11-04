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

/* JADX INFO: renamed from: l.֨ۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P7DJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C0970 extends AbstractC1890 {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public byte[] f3544;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public C16521 f3545;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f3546;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f3547;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public C19942 f3548;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public boolean f3549;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public int f3550;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public int f3551;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public C16521 f3552;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public int f3553;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f3554;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public int f3555;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public C16521 f3556;

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f3557;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f3558;

    @Override // l.AbstractC1890
    /* JADX INFO: renamed from: ۙ */
    public final void mo1684(List... listArr) {
        throw null;
    }

    public C0970(C3381 c3381) {
        super(c3381);
        this.f3558 = new HashMap();
        this.f3547 = new ArrayList(0);
        this.f3557 = new ArrayList(0);
        this.f3549 = true;
        if (c3381.f67140) {
            this.f3553 = 7;
            this.f3551 = 7;
        } else {
            this.f3553 = 7;
            this.f3551 = 7 - m48000();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m3847(int i) {
        if (i >= 0) {
            byte[] bArr = this.f3544;
            if (i < bArr.length) {
                return bArr[i];
            }
        }
        throw new IndexOutOfBoundsException(this.f6369.m32311("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private int m3851(int i) {
        if (i >= 0) {
            byte[] bArr = this.f3544;
            if (i < bArr.length) {
                return bArr[i] & 255;
            }
        }
        throw new IndexOutOfBoundsException(this.f6369.m32311("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private int m3846(int i) {
        if (i >= 0) {
            int i2 = i + 1;
            byte[] bArr = this.f3544;
            if (i2 < bArr.length) {
                return (bArr[i] << 8) | (bArr[i2] & 255);
            }
        }
        throw new IndexOutOfBoundsException(this.f6369.m32311("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private int m3844(int i) {
        if (i >= 0) {
            int i2 = i + 1;
            byte[] bArr = this.f3544;
            if (i2 < bArr.length) {
                return ((bArr[i] << 8) | (bArr[i2] & 255)) & 65535;
            }
        }
        throw new IndexOutOfBoundsException(this.f6369.m32311("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    private int getInt(int i) {
        return (m3846(i + 2) & 65535) | (m3846(i) << 16);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C7572 m3853(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f3558;
        C7572 c7572 = (C7572) map.get(numValueOf);
        if (c7572 != null) {
            return c7572;
        }
        C3381 c3381 = (C3381) this.f6363;
        C7572 c7573 = new C7572(c3381);
        c7573.f24961 = (short) 0;
        c7573.f24959 = false;
        c7573.f24954 = (C0224) c3381.f6363;
        c7573.m47994(this);
        c7573.m48012(1);
        map.put(numValueOf, c7573);
        return c7573;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3852(int i, DataInputStream dataInputStream) {
        C22180 c22180;
        boolean z;
        C16521 c16521;
        this.f3550 = dataInputStream.readUnsignedShort();
        this.f3555 = dataInputStream.readUnsignedShort();
        int i2 = dataInputStream.readInt();
        int i3 = 4;
        int i4 = 2;
        this.f6369.m32315("CodeAttr:  CodeLength=%d FullLength=%d max_stack=%d max_locals=%d", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.f3550), Integer.valueOf(this.f3555));
        byte[] bArr = new byte[i2];
        this.f3544 = bArr;
        dataInputStream.read(bArr, 0, i2);
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f6369.m32315("CodeAttr:  TrapTable[%d]", Integer.valueOf(unsignedShort));
        this.f3557 = new ArrayList(unsignedShort);
        for (int i5 = 0; i5 < unsignedShort; i5++) {
            ArrayList arrayList = this.f3557;
            C13229 c13229 = new C13229();
            c13229.f42289 = i5;
            c13229.f42287 = dataInputStream.readUnsignedShort();
            c13229.f42288 = dataInputStream.readUnsignedShort();
            c13229.f42286 = dataInputStream.readUnsignedShort();
            c13229.f42285 = dataInputStream.readUnsignedShort();
            arrayList.add(c13229);
        }
        int unsignedShort2 = dataInputStream.readUnsignedShort();
        this.f6369.m32315("CodeAttr: add.attr: %d", Integer.valueOf(unsignedShort2));
        int i6 = 0;
        while (i6 < unsignedShort2) {
            int unsignedShort3 = dataInputStream.readUnsignedShort();
            AbstractC15029 abstractC15029M5631 = this.f6371.m5631(unsignedShort3);
            if (abstractC15029M5631 != null && abstractC15029M5631.f49067 == EnumC5335.CONSTANT_UTF8) {
                String strM5640 = this.f6371.m5640(unsignedShort3, new C18285(i3));
                this.f6369.m32315(C25272.m56409("CodeAttr:  attr: ", strM5640), new Object[0]);
                final EnumC13127 enumC13127M32605 = EnumC13127.m32605(strM5640);
                switch (C9918.f31847[enumC13127M32605.ordinal()]) {
                    case 1:
                    case 2:
                        final int i7 = dataInputStream.readInt();
                        final int unsignedShort4 = dataInputStream.readUnsignedShort();
                        this.f3548 = new C19942(enumC13127M32605, this, unsignedShort4);
                        this.f3549 = true;
                        this.f6369.m32299(new Supplier() { // from class: l.ᩳۚ᩺
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return String.format("CodeAttr:  %s: attrLength=%d num=%d", enumC13127M32605.name(), Integer.valueOf(i7), Integer.valueOf(unsignedShort4));
                            }
                        });
                        int i8 = 0;
                        int i9 = 0;
                        boolean z2 = false;
                        int i10 = 0;
                        while (i8 < unsignedShort4) {
                            int i11 = C9918.f31847[enumC13127M32605.ordinal()];
                            if (i11 == 1) {
                                c22180 = new C22180(this, dataInputStream);
                            } else {
                                if (i11 != i4) {
                                    throw new IllegalStateException("Unexpected value: " + enumC13127M32605);
                                }
                                if (!this.f3549) {
                                    z = false;
                                } else if (i8 == 0 || ((Boolean) this.f3548.f64137.get(i8 - 1)).booleanValue()) {
                                    z = true;
                                } else {
                                    this.f3549 = false;
                                    z = false;
                                }
                                c22180 = new C22180(z, i9, this, dataInputStream);
                            }
                            if (c22180.f71458 == EnumC16110.EARLY_LARVAL) {
                                c22180.f71473 = z2;
                                c22180.f71470 = i10;
                                this.f3548.m45867(c22180, true);
                                i10++;
                                z2 = true;
                            } else {
                                c22180.f71473 = z2;
                                c22180.f71470 = i10;
                                this.f3548.m45867(c22180, false);
                                i8++;
                                z2 = false;
                                i10 = 0;
                            }
                            i9 = c22180.f71457;
                            i4 = 2;
                        }
                        break;
                    case 3:
                        int i12 = dataInputStream.readInt();
                        int unsignedShort5 = dataInputStream.readUnsignedShort();
                        boolean z3 = this.f67154;
                        c16521 = z3 ? new C16521(this, C9063.class, unsignedShort5) : null;
                        AbstractC12931 abstractC12931 = this.f6369;
                        Integer numValueOf = Integer.valueOf(unsignedShort5);
                        Integer numValueOf2 = Integer.valueOf(i12);
                        Object[] objArr = new Object[i4];
                        objArr[0] = numValueOf;
                        objArr[1] = numValueOf2;
                        abstractC12931.m32315("CodeAttr:  LineNumberTable[%d] length=%d", objArr);
                        for (int i13 = 0; i13 < unsignedShort5; i13++) {
                            C3381 c3381 = (C3381) this.f6363;
                            C9063 c9063 = new C9063();
                            c9063.f29467 = dataInputStream.readShort();
                            c9063.f29466 = dataInputStream.readShort();
                            c9063.f67151 = c3381.f67151;
                            c9063.f29465 = C14442.m34864(c3381.f67140 ? 11 : 9, "%", "s %4d:  %7d");
                            if (z3) {
                                c16521.m39148(c9063);
                            }
                        }
                        this.f3552 = c16521;
                        break;
                    case 4:
                        int i14 = dataInputStream.readInt();
                        int unsignedShort6 = dataInputStream.readUnsignedShort();
                        boolean z4 = this.f67129;
                        c16521 = z4 ? new C16521(this, C6827.class, unsignedShort6) : null;
                        AbstractC12931 abstractC12932 = this.f6369;
                        Integer numValueOf3 = Integer.valueOf(unsignedShort6);
                        Integer numValueOf4 = Integer.valueOf(i14);
                        Object[] objArr2 = new Object[i4];
                        objArr2[0] = numValueOf3;
                        objArr2[1] = numValueOf4;
                        abstractC12932.m32315("CodeAttr:  LocalVariableTable[%d] length=%d", objArr2);
                        for (int i15 = 0; i15 < unsignedShort6; i15++) {
                            C6827 c6827 = new C6827(dataInputStream, (C3381) this.f6363, EnumC5202.f18248.m15637());
                            if (z4) {
                                c16521.m39148(c6827);
                            }
                        }
                        this.f3556 = c16521;
                        break;
                    case 5:
                        int i16 = dataInputStream.readInt();
                        int unsignedShort7 = dataInputStream.readUnsignedShort();
                        boolean z5 = this.f67133;
                        c16521 = z5 ? new C16521(this, C13538.class, unsignedShort7) : null;
                        AbstractC12931 abstractC12933 = this.f6369;
                        Integer numValueOf5 = Integer.valueOf(unsignedShort7);
                        Integer numValueOf6 = Integer.valueOf(i16);
                        Object[] objArr3 = new Object[i4];
                        objArr3[0] = numValueOf5;
                        objArr3[1] = numValueOf6;
                        abstractC12933.m32315("CodeAttr:  LocalVariableTypeTable[%d] length=%d", objArr3);
                        for (int i17 = 0; i17 < unsignedShort7; i17++) {
                            C13538 c13538 = new C13538(dataInputStream, (C3381) this.f6363, EnumC5202.f18151.m15637());
                            if (z5) {
                                c16521.m39148(c13538);
                            }
                        }
                        this.f3545 = c16521;
                        break;
                    case 6:
                    case 7:
                        boolean z6 = enumC13127M32605 == EnumC13127.f41944;
                        int i18 = dataInputStream.readInt();
                        short s = dataInputStream.readShort();
                        ArrayList arrayList2 = new ArrayList(s);
                        AbstractC12931 abstractC12934 = this.f6369;
                        String str = z6 ? "Inv" : "V";
                        Integer numValueOf7 = Integer.valueOf(i18);
                        Integer numValueOf8 = Integer.valueOf(s);
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = str;
                        objArr4[1] = numValueOf7;
                        objArr4[i4] = numValueOf8;
                        abstractC12934.m32315("CodeAttr:   Runtime%sisibleTypeAnnotation: attrLength=%d num= %d", objArr4);
                        for (int i19 = 0; i19 < s; i19++) {
                            C2043 c2043 = new C2043((C3381) this.f6363, z6);
                            c2043.mo2258(dataInputStream);
                            arrayList2.add(c2043);
                        }
                        if (z6) {
                            this.f3554 = arrayList2;
                        } else {
                            this.f3546 = arrayList2;
                        }
                        break;
                    default:
                        C22599 c22599 = new C22599(this.f6369, enumC13127M32605);
                        c22599.m50928(unsignedShort3, dataInputStream.readInt(), dataInputStream);
                        this.f3547.add(c22599);
                        break;
                }
            }
            i6++;
            i4 = 2;
            i3 = 4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:189:0x0724  */
    /* JADX WARN: Code duplicated, block: B:225:0x0846  */
    /* JADX WARN: Code duplicated, block: B:226:0x086b  */
    /* JADX WARN: Instruction removed from duplicated block: B:189:0x0724, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:225:0x0846, please report this as an issue */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private int m3848(int i, int i2) {
        int iM3844;
        boolean z;
        int i3;
        String str;
        String str2;
        String str3;
        boolean z2;
        String str4;
        String str5;
        boolean z3;
        int iM3851 = m3851(i);
        EnumC22268 enumC22268M51906 = C23014.m51906(Integer.valueOf(iM3851));
        boolean z4 = this.f67139;
        if (enumC22268M51906 == null) {
            this.f67151.mo3879(m47996(18, "bytecode"));
            StringBuilder sb = new StringBuilder();
            sb.append(z4 ? C7754.m21094(iM3851) : Integer.valueOf(iM3851));
            sb.append(l.b);
            m48006(sb.toString());
            return 1;
        }
        int[] iArr = C9918.f31848;
        switch (iArr[enumC22268M51906.ordinal()]) {
            case 23:
                ArrayList arrayListM3850 = m3850(i, 1);
                if (arrayListM3850.size() != 1) {
                    m3845(enumC22268M51906.m50327(), arrayListM3850, i2);
                    return 1;
                }
                EnumC22268 enumC22268M51907 = C23014.m51906(Integer.valueOf((iM3851 << 8) + m3851(i + 1)));
                if (enumC22268M51907 == null) {
                    this.f67151.mo3879(m47996(18, EnumC22268.f72038.m50326()));
                    m48006(enumC22268M51906.m50331() + l.b);
                    return 1;
                }
                String strM50326 = enumC22268M51907.m50326();
                if (enumC22268M51907 == EnumC22268.f71882) {
                    ArrayList arrayListM3851 = m3850(i, 5);
                    if (arrayListM3851.size() != 5) {
                        m3845(enumC22268M51906.m50327(), arrayListM3851, i2);
                        return 6;
                    }
                    m48009(m47996(18, strM50326));
                    m48014("%d, %d;", Integer.valueOf(m3844(i + 2)), Integer.valueOf(m3844(i + 4)));
                    return 6;
                }
                ArrayList arrayListM3852 = m3850(i, 3);
                if (arrayListM3852.size() != 3) {
                    m3845(enumC22268M51906.m50327(), arrayListM3852, i2);
                    return 4;
                }
                this.f67151.mo3879(m47996(18, strM50326));
                m48014("%d;", Integer.valueOf(m3844(i + 2)));
                return 4;
            case 24:
            case 25:
                ArrayList arrayListM3853 = m3850(i, 1);
                if (arrayListM3853.size() != 1) {
                    m3845(enumC22268M51906.m50327(), arrayListM3853, i2);
                    return 2;
                }
                int iM3852 = m3851(i + 1);
                EnumC22268 enumC22268M51908 = C23014.m51906(Integer.valueOf((iM3851 << 8) + iM3852));
                if (enumC22268M51908 != null) {
                    m48006(enumC22268M51908.m50326() + l.b);
                    return 2;
                }
                this.f67151.mo3879(m47996(18, enumC22268M51906.m50326()));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z4 ? C7754.m21094(iM3852) : Integer.valueOf(iM3852));
                sb2.append(l.b);
                m48006(sb2.toString());
                return 2;
            default:
                if (enumC22268M51906.m50326() == null) {
                    this.f67151.mo3879(m47996(18, "bytecode"));
                    m48006(enumC22268M51906 + l.b);
                    return 1;
                }
                if (!enumC22268M51906.m50330()) {
                    this.f67151.mo3879(m47996(18, "bytecode"));
                    m48006(enumC22268M51906 + l.b);
                    return 1;
                }
                String strM50327 = enumC22268M51906.m50326();
                int i4 = iArr[enumC22268M51906.ordinal()];
                String str6 = "BOGUS;";
                boolean z5 = this.f67146;
                boolean z6 = this.f67132;
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
                                str = strM50327;
                                try {
                                    m48005(this.f67148, m47996(17, strM50327) + " { ");
                                    m48006((!z6 || z5) ? "" : " // " + i7 + " to " + i8);
                                    for (int i10 = 0; i10 <= i9; i10++) {
                                        try {
                                            this.f67151.mo3879(m48011(i2, m47996(9, String.format("%2d: ", Integer.valueOf(i10 + i7)))));
                                            m48006(((C3381) this.f6363).m47988() + (getInt((i10 * 4) + i5 + 12) + i) + l.b);
                                        } catch (IndexOutOfBoundsException e) {
                                            e = e;
                                            str3 = " };";
                                            z2 = false;
                                            if (z2) {
                                                m48006(str + " { ");
                                                m48013(m48011(i2, str2));
                                                m48006(m48011(i2, str3));
                                            } else {
                                                this.f67151.mo3881(str2);
                                                m48006(m48011(i2, str3));
                                            }
                                            this.f6369.m32298(e);
                                            return 1;
                                        }
                                    }
                                    this.f67151.mo3879(m48011(i2, m47996(15 - m48000(), "default: " + ((C3381) this.f6363).m47988() + (i6 + i))));
                                    str3 = " };";
                                    try {
                                        m48006(str3);
                                        return (i9 * 4) + (i5 - i) + 16;
                                    } catch (IndexOutOfBoundsException e2) {
                                        e = e2;
                                        z2 = false;
                                        if (z2) {
                                            m48006(str + " { ");
                                            m48013(m48011(i2, str2));
                                            m48006(m48011(i2, str3));
                                        } else {
                                            this.f67151.mo3881(str2);
                                            m48006(m48011(i2, str3));
                                        }
                                        this.f6369.m32298(e);
                                        return 1;
                                    }
                                } catch (IndexOutOfBoundsException e3) {
                                    e = e3;
                                    str3 = " };";
                                    z2 = true;
                                    if (z2) {
                                        m48006(str + " { ");
                                        m48013(m48011(i2, str2));
                                        m48006(m48011(i2, str3));
                                    } else {
                                        this.f67151.mo3881(str2);
                                        m48006(m48011(i2, str3));
                                    }
                                    this.f6369.m32298(e);
                                    return 1;
                                }
                            } catch (IndexOutOfBoundsException e4) {
                                e = e4;
                                str = strM50327;
                            }
                        } catch (IndexOutOfBoundsException e5) {
                            e = e5;
                            str = strM50327;
                            str2 = "BOGUS;";
                            str3 = " };";
                        }
                        break;
                    case 2:
                        int i11 = (i + 4) & (-4);
                        try {
                            int i12 = getInt(i11);
                            int i13 = getInt(i11 + 4);
                            m48005(this.f67148, m47996(17, strM50327) + " { ");
                            m48006((!z6 || z5) ? "" : " // " + i13);
                            try {
                                C18941[] c18941ArrM3849 = m3849(i11, i13);
                                int iMax = Math.max(9, C13847.stream(c18941ArrM3849).mapToInt(new C7682()).max().orElse(0) + 2);
                                int i14 = 0;
                                while (i14 < i13) {
                                    str4 = str6;
                                    try {
                                        this.f67151.mo3879(m48011(i2, m47996(iMax, String.format("%2d:", c18941ArrM3849[i14].f61428))));
                                        m48006(((C3381) this.f6363).m47988() + (((Integer) c18941ArrM3849[i14].f61429).intValue() + i) + l.b);
                                        i14++;
                                        str6 = str4;
                                    } catch (IndexOutOfBoundsException e6) {
                                        e = e6;
                                        str5 = " };";
                                        z3 = false;
                                        if (z3) {
                                            m48006(strM50327 + " { ");
                                        }
                                        m48013(m48011(i2, str4));
                                        m48006(m48011(i2, str5));
                                        this.f6369.m32298(e);
                                        return 1;
                                    }
                                }
                                str4 = str6;
                                this.f67151.mo3879(m48011(i2, m47996(15 - m48000(), m47996(iMax, "default: ") + ((C3381) this.f6363).m47988() + (i12 + i))));
                                str5 = " };";
                                try {
                                    m48006(str5);
                                    return C12669.m31441(i13, 1, 8, i11 - i);
                                } catch (IndexOutOfBoundsException e7) {
                                    e = e7;
                                    z3 = false;
                                    if (z3) {
                                        m48006(strM50327 + " { ");
                                    }
                                    m48013(m48011(i2, str4));
                                    m48006(m48011(i2, str5));
                                    this.f6369.m32298(e);
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
                        ArrayList arrayListM3854 = m3850(i, 2);
                        if (arrayListM3854.size() != 2) {
                            m3845(enumC22268M51906.m50327(), arrayListM3854, i2);
                            return 3;
                        }
                        this.f67151.mo3879(m47996(18, strM50327));
                        m48006(((C3381) this.f6363).m47988() + (i + m3846(i + 1)) + l.b);
                        return 3;
                    case 21:
                    case 22:
                        ArrayList arrayListM3855 = m3850(i, 4);
                        if (arrayListM3855.size() != 4) {
                            m3845(enumC22268M51906.m50327(), arrayListM3855, i2);
                            return 5;
                        }
                        this.f67151.mo3879(m47996(18, strM50327));
                        m48006(((C3381) this.f6363).m47988() + (i + getInt(i + 1)) + l.b);
                        return 5;
                    case 23:
                    case 24:
                    case 25:
                    default:
                        m48006(strM50327 + l.b);
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
                        ArrayList arrayListM3856 = m3850(i, 1);
                        if (arrayListM3856.size() != 1) {
                            m3845(enumC22268M51906.m50327(), arrayListM3856, i2);
                            return 2;
                        }
                        this.f67151.mo3879(m47996(18, strM50327));
                        m48006(m3851(i + 1) + l.b);
                        return 2;
                    case 37:
                        ArrayList arrayListM3857 = m3850(i, 2);
                        if (arrayListM3857.size() != 2) {
                            m3845(enumC22268M51906.m50327(), arrayListM3857, i2);
                            return 3;
                        }
                        this.f67151.mo3879(m47996(18, strM50327));
                        m48014("%d, %d;", Integer.valueOf(m3851(i + 1)), Integer.valueOf(m3847(i + 2)));
                        return 3;
                    case 38:
                        ArrayList arrayListM3858 = m3850(i, 1);
                        if (arrayListM3858.size() != 1) {
                            m3845(enumC22268M51906.m50327(), arrayListM3858, i2);
                            return 2;
                        }
                        int iM3853 = m3851(i + 1);
                        EnumC23323 enumC23323M30328 = C12134.m30328(iM3853);
                        if (enumC23323M30328 == null) {
                            this.f67151.mo3879(m47996(18, strM50327));
                            m48006("BOGUS TYPE: " + C7754.m21095(8, iM3853) + l.b);
                            return 2;
                        }
                        this.f67151.mo3879(m47996(18, strM50327));
                        m48006(enumC23323M30328.m52474() + l.b);
                        return 2;
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                        try {
                            new HashMap();
                            EnumC22268 enumC22268 = EnumC22268.f72076;
                            Map map = AbstractC20997.f67125;
                            if (enumC22268M51906 == enumC22268) {
                                z = true;
                                iM3844 = m3851(i + 1);
                                i3 = 2;
                            } else if (enumC22268M51906 == EnumC22268.f71967) {
                                map = AbstractC20997.f67123;
                                iM3844 = m3844(i + 1);
                                z = true;
                                i3 = 5;
                            } else {
                                iM3844 = m3844(i + 1);
                                z = true;
                                i3 = 3;
                            }
                            this.f6371.m5629(z);
                            if (!z6) {
                                m48009(m47996(18, strM50327));
                                m48006(m47992(this.f6371.m5630(iM3844), i2 + 18, "", map) + l.b);
                            } else if (z5) {
                                m48006(String.format("%s #%d;", m47996(17, strM50327), Integer.valueOf(iM3844)));
                            } else {
                                m48005(this.f67148, String.format("%s #%d;", m47996(17, strM50327), Integer.valueOf(iM3844)));
                                m48009(" // ");
                                m48006(m47992(this.f6371.m5630(iM3844), this.f67148 + i2, " // ", map));
                            }
                            this.f6371.m5629(false);
                            return i3;
                        } catch (IndexOutOfBoundsException e10) {
                            if (!z6) {
                                this.f67151.mo3879(m47996(18, strM50327));
                                m48006("BOGUS;");
                            } else if (z5) {
                                m48006(m47996(17, strM50327) + " BOGUS;");
                            } else {
                                m48005(this.f67148, C14483.m34972(m47996(17, strM50327), " BOGUS;"));
                                m48006(" // " + e10.getMessage());
                            }
                            this.f6369.m32298(e10);
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
                        ArrayList arrayListM3859 = m3850(i, 2);
                        if (arrayListM3859.size() != 2) {
                            m3845(enumC22268M51906.m50327(), arrayListM3859, i2);
                            return 3;
                        }
                        int iM3845 = m3844(i + 1);
                        if (!z6) {
                            m48009(m47996(18, strM50327));
                            m48006(this.f6371.m5630(iM3845) + l.b);
                            return 3;
                        }
                        if (z5) {
                            m48006(String.format("%s #%d;", m47996(17, strM50327), Integer.valueOf(iM3845)));
                            return 3;
                        }
                        m48005(this.f67148, String.format("%s #%d;", m47996(17, strM50327), Integer.valueOf(iM3845)));
                        m48006(" // " + this.f6371.m5630(iM3845));
                        return 3;
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        int i15 = enumC22268M51906 == EnumC22268.f71823 ? 3 : 4;
                        ArrayList arrayListM38510 = m3850(i, i15);
                        if (arrayListM38510.size() == i15) {
                            int iM3846 = m3844(i + 1);
                            int iM3854 = m3851(i + 3);
                            if (!z6) {
                                m48009(m47996(18, strM50327));
                                m48014("%s, %d;", this.f6371.m5630(iM3846), Integer.valueOf(iM3854));
                            } else if (z5) {
                                m48006(String.format("%s #%d, %d;", m47996(17, strM50327), Integer.valueOf(iM3846), Integer.valueOf(iM3854)));
                            } else {
                                m48005(this.f67148, String.format("%s #%d, %d;", m47996(17, strM50327), Integer.valueOf(iM3846), Integer.valueOf(iM3854)));
                                m48006(" // " + this.f6371.m5630(iM3846));
                            }
                        } else {
                            m3845(enumC22268M51906.m50327(), arrayListM38510, i2);
                        }
                        return i15 + 1;
                    case 56:
                        ArrayList arrayListM38511 = m3850(i, 2);
                        if (arrayListM38511.size() != 2) {
                            m3845(enumC22268M51906.m50327(), arrayListM38511, i2);
                            return 3;
                        }
                        this.f67151.mo3879(m47996(18, strM50327));
                        m48006(m3846(i + 1) + l.b);
                        return 3;
                    case 57:
                        ArrayList arrayListM38512 = m3850(i, 1);
                        if (arrayListM38512.size() != 1) {
                            m3845(enumC22268M51906.m50327(), arrayListM38512, i2);
                            return 2;
                        }
                        this.f67151.mo3879(m47996(18, strM50327));
                        m48006(m3847(i + 1) + l.b);
                        return 2;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3845(byte b, ArrayList arrayList, int i) {
        this.f67151.mo3879(m47996(18, EnumC22268.f72038.m50326()));
        StringBuilder sb = new StringBuilder();
        int i2 = C7754.f25519;
        int i3 = 2;
        while (i3 > 0 && (b >> ((i3 - 1) * 4)) == 0) {
            i3--;
        }
        sb.append(C7754.m21095(i3, b));
        sb.append(l.b);
        m48006(sb.toString());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte bByteValue = ((Byte) it.next()).byteValue();
            this.f67151.mo3879(m48007(i, " "));
            this.f67151.mo3879(m47996(18, EnumC22268.f72038.m50326()));
            StringBuilder sb2 = new StringBuilder();
            int i4 = 2;
            while (i4 > 0 && (bByteValue >> ((i4 - 1) * 4)) == 0) {
                i4--;
            }
            sb2.append(C7754.m21095(i4, bByteValue));
            sb2.append(l.b);
            m48006(sb2.toString());
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private ArrayList m3850(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        int length = this.f3544.length;
        for (int i3 = 1; i3 <= i2 && i + i3 < length; i3++) {
            arrayList.add(Byte.valueOf(this.f3544[i3]));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C18941[] m3849(int i, int i2) {
        try {
            C18941[] c18941Arr = new C18941[i2];
            for (int i3 = 1; i3 <= i2; i3++) {
                int i4 = i3 * 8;
                c18941Arr[i3 - 1] = new C18941(Integer.valueOf(getInt(i + i4)), Integer.valueOf(getInt(i + 4 + i4)));
            }
            return c18941Arr;
        } catch (NegativeArraySizeException unused) {
            throw new IndexOutOfBoundsException(this.f6369.m32311("The index {0} is out of range for the code array of the method.", Integer.valueOf(i2)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x019e  */
    @Override // l.AbstractC20997, l.InterfaceC16454
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1688() {
        int iM31441;
        C16521 c16521 = this.f3552;
        if (c16521 != null) {
            for (C9063 c9063 : c16521.f53488) {
                m3853(c9063.f29467).f24961 = c9063.f29466;
            }
        }
        C19942 c19942 = this.f3548;
        HashMap map = this.f3558;
        if (c19942 != null && !this.f67155) {
            boolean z = true;
            ArrayList arrayList = null;
            for (int i = 0; i < this.f3548.f53488.size(); i++) {
                C22180 c22180 = (C22180) ((AbstractC20997) this.f3548.f53488.get(i));
                if (((Boolean) this.f3548.f64137.get(i)).booleanValue()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c22180);
                } else {
                    C7572 c7572M3853 = m3853(c22180.f71457);
                    c7572M3853.f24963 = c22180;
                    c7572M3853.f24953 = arrayList;
                    z = false;
                    arrayList = null;
                }
            }
            if (arrayList != null) {
                (z ? (C7572) map.get(Collections.min(map.keySet())) : (C7572) map.get(Collections.max(map.keySet()))).f24953 = arrayList;
            }
        }
        if (!((C3381) this.f6363).f67140) {
            int i2 = 0;
            while (i2 < this.f3544.length) {
                EnumC22268 enumC22268M51906 = C23014.m51906(Integer.valueOf(m3851(i2)));
                if (enumC22268M51906 != null) {
                    switch (C9918.f31848[enumC22268M51906.ordinal()]) {
                        case 1:
                            int i3 = (i2 + 4) & (-4);
                            try {
                                int i4 = getInt(i3);
                                int i5 = getInt(i3 + 8) - getInt(i3 + 4);
                                for (int i6 = 0; i6 <= i5; i6++) {
                                    m3853(getInt((i6 * 4) + i3 + 12) + i2).f24959 = true;
                                }
                                m3853(i4 + i2).f24959 = true;
                                iM31441 = (i3 - i2) + 16 + (i5 * 4);
                            } catch (IndexOutOfBoundsException e) {
                                this.f6369.m32298(e);
                                m3853(i2).f24959 = true;
                                iM31441 = 1;
                            }
                            break;
                        case 2:
                            int i7 = (i2 + 4) & (-4);
                            try {
                                int i8 = getInt(i7);
                                int i9 = i7 + 4;
                                int i10 = getInt(i9);
                                for (int i11 = 1; i11 <= i10; i11++) {
                                    m3853(getInt((i11 * 8) + i9) + i2).f24959 = true;
                                }
                                m3853(i8 + i2).f24959 = true;
                                iM31441 = C12669.m31441(i10, 1, 8, i7 - i2);
                            } catch (IndexOutOfBoundsException e2) {
                                this.f6369.m32298(e2);
                                m3853(i2).f24959 = true;
                                iM31441 = 1;
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
                                m3853(m3846(i2 + 1) + i2).f24959 = true;
                                iM31441 = 3;
                            } catch (IndexOutOfBoundsException e3) {
                                this.f6369.m32298(e3);
                                m3853(i2).f24959 = true;
                                iM31441 = 1;
                            }
                            break;
                        case 21:
                        case 22:
                            m3853(getInt(i2 + 1) + i2).f24959 = true;
                            iM31441 = 5;
                            break;
                        case 23:
                        case 24:
                        case 25:
                            enumC22268M51906 = C23014.m51906(Integer.valueOf((enumC22268M51906.m50332().intValue() << 8) + m3851(i2 + 1)));
                            if (enumC22268M51906 != null || (iM31441 = enumC22268M51906.m50329()) == 0) {
                                iM31441 = 1;
                            }
                            break;
                        default:
                            if (enumC22268M51906 != null) {
                                iM31441 = 1;
                            } else {
                                iM31441 = 1;
                            }
                            break;
                    }
                } else {
                    try {
                        m3853(i2).f24959 = true;
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        iM31441 = 1;
                    }
                    iM31441 = 1;
                }
                i2 += iM31441;
            }
        }
        for (C13229 c13229 : this.f3557) {
            C7572 c7572M3854 = m3853(c13229.f42287);
            if (c7572M3854.f24962 == null) {
                c7572M3854.f24962 = new ArrayList(4);
            }
            c7572M3854.f24962.add(c13229);
            C7572 c7572M3855 = m3853(c13229.f42288);
            if (c7572M3855.f24952 == null) {
                c7572M3855.f24952 = new ArrayList(4);
            }
            c7572M3855.f24952.add(c13229);
            C7572 c7572M3856 = m3853(c13229.f42286);
            if (c7572M3856.f24960 == null) {
                c7572M3856.f24960 = new ArrayList(4);
            }
            c7572M3856.f24960.add(c13229);
        }
        C16521 c16522 = this.f3556;
        if (c16522 != null) {
            for (C6827 c6827 : c16522.f53488) {
                C7572 c7572M3857 = m3853(c6827.f27299);
                if (c7572M3857.f24955 == null) {
                    c7572M3857.f24955 = new ArrayList(4);
                }
                c7572M3857.f24955.add(c6827);
                C7572 c7572M3858 = m3853(c6827.f27299 + c6827.f27302);
                if (c7572M3858.f24964 == null) {
                    c7572M3858.f24964 = new ArrayList(4);
                }
                c7572M3858.f24964.add(c6827);
            }
        }
        C16521 c16523 = this.f3545;
        if (c16523 != null) {
            for (C13538 c13538 : c16523.f53488) {
                C7572 c7572M3859 = m3853(c13538.f27299);
                if (c7572M3859.f24957 == null) {
                    c7572M3859.f24957 = new ArrayList(4);
                }
                c7572M3859.f24957.add(c13538);
                C7572 c7572M38510 = m3853(c13538.f27299 + c13538.f27302);
                if (c7572M38510.f24956 == null) {
                    c7572M38510.f24956 = new ArrayList(4);
                }
                c7572M38510.f24956.add(c13538);
            }
        }
        m48012(1);
        m47998("%s %d  %s %d", EnumC5202.f18202.m15637(), Integer.valueOf(this.f3550), EnumC5202.f18335.m15637(), Integer.valueOf(this.f3555));
        m48008(1);
        ((C3381) this.f6363).m11098();
        m48013("{");
        C7572 c7572 = (C7572) map.get(0);
        int i12 = this.f67148;
        int i13 = this.f3553;
        this.f67148 = (i12 - i13) - m48002();
        int iM3848 = 0;
        while (iM3848 < this.f3544.length) {
            int i14 = this.f3551;
            if (c7572 != null) {
                m48012(1);
                c7572.f67148 = this.f67148;
                c7572.m20695(i14);
                m48008(1);
            }
            if (((C3381) this.f6363).f67140) {
                m48012(1);
                m47997(m47996(i13, String.format("%2d:", Integer.valueOf(iM3848))));
            } else {
                m47997(m47996(i13, (c7572 == null || !c7572.f24959) ? " " : ((C3381) this.f6363).m47988() + iM3848 + ":"));
                m48012(1);
            }
            if (c7572 != null && c7572.m20693(i14)) {
                m48009(m48011(i14, ""));
            }
            iM3848 += m3848(iM3848, m48002() + i14);
            c7572 = (C7572) map.get(Integer.valueOf(iM3848));
            if (c7572 != null) {
                c7572.m20694(i14);
                m48008(1);
            }
            m48008(1);
        }
        if (c7572 != null && c7572.f24963 != null && c7572.f24959) {
            C3381 c3381 = (C3381) this.f6363;
            if (c3381.f67140) {
                m48012(1);
                m47997(m47996(0, String.format("%2d:", Integer.valueOf(this.f3544.length))));
                m48008(1);
            } else {
                m48010(m47996(this.f3544.length, String.format("%s%d:", c3381.m47988(), Integer.valueOf(this.f3544.length))), 0);
            }
        }
        List[] listArr = {this.f3546, this.f3554};
        boolean z2 = true;
        for (int i15 = 0; i15 < 2; i15++) {
            List list = listArr[i15];
            if (list != null) {
                if (z2) {
                    this.f67151.mo3881("");
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C0442) it.next()).mo1688();
                    m47989();
                    z2 = false;
                }
            }
        }
        C16521[] c16521Arr = {this.f3552, this.f3556, this.f3545, this.f3548};
        for (int i16 = 0; i16 < 4; i16++) {
            C16521 c16524 = c16521Arr[i16];
            if (c16524 != null && c16524.mo19009()) {
                c16524.f67148 = this.f67148;
                c16524.mo1688();
            }
        }
        m48013(l.d);
    }
}
