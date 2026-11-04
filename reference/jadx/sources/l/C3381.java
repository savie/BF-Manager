package l;

import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۗۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes3.dex */
public final class C3381 extends AbstractC1890 {

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f11010 = 0;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public int f11011;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public C19087 f11012;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public C20251 f11013;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public C0970 f11014;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public C23519 f11015;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f11016;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public int f11017;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public C17200 f11018;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public C17200 f11019;

    public C3381(C0224 c0224) {
        super(c0224);
        this.f11015 = null;
        this.f67131 = EnumC10882.METHOD_DATA;
        this.f6365 = "MethodData";
        this.f67148 = c0224.f6371.f67148;
        this.f11016 = null;
    }

    @Override // l.AbstractC1890
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1685(DataInputStream dataInputStream, EnumC13127 enumC13127, int i) throws IOException {
        switch (C17551.f57045[enumC13127.ordinal()]) {
            case 1:
                C0970 c0970 = new C0970(this);
                this.f11014 = c0970;
                c0970.m3852(i, dataInputStream);
                return true;
            case 2:
                if (this.f6377 != null) {
                    this.f6369.mo4165("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "Signature", "method_info");
                }
                C20930 c20930 = new C20930((C0224) this.f6363);
                c20930.m47838(i, dataInputStream);
                this.f6377 = c20930;
                return true;
            case 3:
                C20251 c20251 = new C20251((C0224) this.f6363);
                c20251.m30363(i, dataInputStream);
                this.f11013 = c20251;
                return true;
            case 4:
                final int unsignedByte = dataInputStream.readUnsignedByte();
                this.f6369.m32299(new Supplier() { // from class: l.ܺۧ᩺
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return String.format("MethodParametersAttr[%d]", Integer.valueOf(unsignedByte));
                    }
                });
                this.f11016 = new ArrayList(unsignedByte);
                for (int i2 = 0; i2 < unsignedByte; i2++) {
                    short unsignedShort = (short) dataInputStream.readUnsignedShort();
                    int unsignedShort2 = dataInputStream.readUnsignedShort();
                    this.f6369.m32315(String.format("()->MethodParameter[%d] = { name[%d]: \"%s\" modifiers[%d]: %s}", Integer.valueOf(i2), Short.valueOf(unsignedShort), this.f6371.m5640(unsignedShort, new C18061(9)), Integer.valueOf(unsignedShort2), EnumC16856.m39803(unsignedShort2, EnumC19840.METHOD)), new Object[0]);
                    ArrayList arrayList = this.f11016;
                    C16059 c16059 = new C16059();
                    c16059.f52060 = unsignedShort2;
                    c16059.f52061 = unsignedShort;
                    arrayList.add(i2, c16059);
                }
                return true;
            case 5:
            case 6:
                boolean z = enumC13127 == EnumC13127.f41975;
                C17200 c17200 = new C17200(this, z);
                c17200.m40365(dataInputStream);
                if (z) {
                    this.f11019 = c17200;
                    return true;
                }
                this.f11018 = c17200;
                return true;
            case 7:
                this.f11012 = C21853.m49515(dataInputStream, this.f6363, false);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private boolean m11096() {
        if (this.f11015 == null) {
            C17200 c17200 = this.f11018;
            int iM40364 = c17200 != null ? c17200.m40364() : 0;
            C17200 c17201 = this.f11019;
            this.f11015 = new C23519(iM40364, c17201 != null ? c17201.m40364() : 0);
        }
        if (this.f11015.m52699()) {
            return true;
        }
        ArrayList arrayList = this.f11016;
        return arrayList != null && arrayList.size() > 0;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m11098() {
        if (m11096()) {
            m48012(1);
            int i = this.f67140 ? 7 : 5;
            ArrayList arrayList = this.f11016;
            int iMax = Math.max(this.f11015.m52700(), Math.max(arrayList != null ? arrayList.size() : 0, this.f11015.m52701()));
            String[] strArr = new String[iMax];
            if (this.f11016 != null) {
                for (int i2 = 0; i2 < iMax; i2++) {
                    C16059 c16059 = (C16059) this.f11016.get(i2);
                    strArr[i2] = C7376.m20248(EnumC5202.f18308, new StringBuilder(), "{ ");
                    if (this.f67132) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(strArr[i2]);
                        int i3 = c16059.f52061;
                        int i4 = c16059.f52060;
                        sb.append(String.format("#%d ", Integer.valueOf(i3)));
                        strArr[i2] = sb.toString();
                        if (!this.f67146 && i3 != 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(strArr[i2]);
                            sb2.append("/* " + ((C0224) this.f6363).f6371.m5640(i3, new C7620(10)) + " */ ");
                            strArr[i2] = sb2.toString();
                        }
                        if (i4 != 0) {
                            strArr[i2] = strArr[i2] + EnumC16856.m39774(i4, EnumC19840.METHOD_PARAMETERS);
                        }
                    } else {
                        int i5 = c16059.f52061;
                        int i6 = c16059.f52060;
                        if (i5 != 0) {
                            strArr[i2] = strArr[i2] + ((C0224) this.f6363).f6371.m5640(c16059.f52061, new C8195(8)) + " ";
                        } else {
                            strArr[i2] = C8947.m23910(new StringBuilder(), strArr[i2], "#0 ");
                        }
                        if (i6 != 0) {
                            strArr[i2] = strArr[i2] + EnumC16856.m39774(i6, EnumC19840.METHOD_PARAMETERS);
                        }
                    }
                    strArr[i2] = C8947.m23910(new StringBuilder(), strArr[i2], l.d);
                }
            }
            int i7 = 0;
            while (i7 < iMax) {
                ArrayList arrayList2 = (this.f11018 == null || i7 >= this.f11015.m52700()) ? null : this.f11018.get(i7);
                ArrayList arrayList3 = (this.f11019 == null || i7 >= this.f11015.m52701()) ? null : this.f11019.get(i7);
                ArrayList arrayList4 = this.f11016;
                C16059 c160510 = arrayList4 != null ? (C16059) arrayList4.get(i7) : null;
                boolean z = (arrayList2 == null && arrayList3 == null) ? false : true;
                if (c160510 != null || z) {
                    m47997(m47996(i, String.format("%2d: ", Integer.valueOf(i7))));
                    if (c160510 != null) {
                        m48005(3, strArr[i7]);
                    }
                    m11097(arrayList2);
                    m11097(arrayList3);
                    m47989();
                }
                i7++;
            }
            m48008(1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11097(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0442 c0442 = (C0442) it.next();
                m47989();
                m48009(m48011(3, ""));
                c0442.mo6502(EnumC5619.PARAMETER_ANNOTATION);
                c0442.m48001(m48002() + 3);
                c0442.mo1688();
            }
        }
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo11099(int i, int i2) {
        int i3;
        AbstractC4280 abstractC4280M39939;
        int iIndexOf;
        C20930 c20930 = this.f6377;
        boolean z = (c20930 == null || c20930.f67149) ? false : true;
        boolean z2 = z && c20930.mo5637();
        boolean z3 = this.f11013 != null;
        boolean z4 = this.f11014 != null || m11096() || z3;
        boolean z5 = (z4 || z2) ? false : true;
        if (i > 0) {
            m47989();
        }
        if (this.f67145) {
            int size = !EnumC16856.m39809(this.f6362) ? 1 : 0;
            String str = m47995() + " *  ";
            int i4 = this.f6362;
            EnumC19840 enumC19840 = EnumC19840.METHOD;
            String strConcat = EnumC16856.m39774(i4, enumC19840).concat(m6505());
            C20930 c20931 = this.f6377;
            if (c20931 != null) {
                abstractC4280M39939 = c20931.m47840();
            } else {
                this.f6369.getClass();
                abstractC4280M39939 = new C16958(this.f11011).m39939(this.f6371);
            }
            C1606 c1606 = ((C0224) this.f6363).f6371;
            int i5 = this.f11017;
            C23773 c23773 = C1606.f5506;
            String strM5640 = c1606.m5640(i5, c23773);
            boolean zEquals = strM5640.equals("<init>");
            String string = abstractC4280M39939.toString();
            if (abstractC4280M39939 instanceof C3534) {
                size += ((C3534) abstractC4280M39939).f12133.size();
            }
            if (zEquals) {
                strM5640 = ((C0224) this.f6363).f1451;
                string = string.substring(string.indexOf(MotionUtils.EASING_TYPE_FORMAT_START));
                iIndexOf = 0;
            } else {
                iIndexOf = string.indexOf(40);
            }
            String strReplaceAll = string.substring(0, iIndexOf).concat(strM5640).concat(string.substring(iIndexOf)).replaceAll("/", ".");
            String strM5641 = ((C0224) this.f6363).f6371.m5640(this.f11011, c23773);
            m48013("/**");
            m48006(str + strConcat + strReplaceAll);
            String strConcat2 = str.concat(m47995());
            m48006(strConcat2 + "descriptor: " + strM5641);
            if (this.f6377 != null) {
                StringBuilder sbM10405 = C3188.m10405(strConcat2, "signature:  ");
                sbM10405.append(((C0224) this.f6363).f6371.m5640(this.f6377.m47836(), c23773));
                m48006(sbM10405.toString());
            }
            StringBuilder sbM27333 = C10732.m27333(strConcat2);
            sbM27333.append(String.format("flags: (0x%04x) %s", Integer.valueOf(this.f6362), EnumC16856.m39803(this.f6362, enumC19840)));
            m48006(sbM27333.toString());
            m48006(strConcat2 + String.format("stack: %d, locals: %d, args_size: %d", Integer.valueOf(this.f11014.f3550), Integer.valueOf(this.f11014.f3555), Integer.valueOf(size)));
            m48013(" */");
        }
        mo1684(this.f6375, this.f6364);
        mo1684(this.f6373, this.f6368);
        String strConcat3 = EnumC16856.m39774(this.f6362, EnumC19840.METHOD).concat(m6505()).concat(EnumC5202.f18172.m15637());
        String strM47996 = m47996(Math.max(strConcat3.length() + 1, (m48002() * 2) + EnumC10882.SIGNATURE.m27632().length()), strConcat3);
        int length = strM47996.length() - m48002();
        C18941 c18941M47837 = z ? this.f6377.m47837(new Function() { // from class: l.ۧۧ᩺
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(this.f36382.f6371.m5638(((Integer) obj).intValue()));
            }
        }) : new C18941("", "");
        boolean z6 = this.f67132;
        String str2 = l.b;
        if (z6) {
            String strConcat4 = strM47996.concat(String.format("#%d:#%d", Integer.valueOf(this.f11017), Integer.valueOf(this.f11011))).concat((String) c18941M47837.f61428);
            if (z5 && this.f11012 == null) {
                strConcat4 = strConcat4.concat(l.b);
            }
            if (!this.f67146) {
                m47997(m47996(this.f67148, strConcat4));
                m48009((this.f11012 != null ? " /* " : " // ").concat(((C0224) this.f6363).f6371.getName(this.f11017) + ":" + ((C0224) this.f6363).f6371.getName(this.f11011)).concat((String) c18941M47837.f61429).concat(this.f11012 != null ? " */ " : " "));
            } else if (this.f11012 != null) {
                m47997(m47996(this.f67148, strConcat4));
            } else {
                m47997(strConcat4);
            }
        } else {
            String strConcat5 = strM47996.concat(((C0224) this.f6363).f6371.getName(this.f11017) + ":").concat(((C0224) this.f6363).f6371.getName(this.f11011)).concat((String) c18941M47837.f61429);
            if (z5 && this.f11012 == null) {
                strConcat5 = strConcat5.concat(l.b);
            }
            m47997(strConcat5);
        }
        C19087 c19087 = this.f11012;
        if (c19087 != null) {
            c19087.m48012(1);
            c19087.f67148 = m48002() - m48000();
            this.f11012.mo6502(EnumC5619.HAS_DEFAULT_VALUE);
            this.f11012.mo1688();
            if (!z4) {
                if (z2) {
                    str2 = ",";
                }
                m48009(str2);
            }
        }
        if (z2) {
            m47989();
            C20930 c20932 = this.f6377;
            c20932.m47842();
            c20932.m47843(length);
            i3 = 1;
            c20932.m48012(1);
            c20932.f67148 = this.f67148 - m48000();
            this.f6377.m47839(!z3);
            this.f6377.mo1688();
        } else {
            i3 = 1;
        }
        if (this.f11013 != null) {
            m47989();
            C20251 c20251 = this.f11013;
            c20251.m46524(length);
            c20251.m48012(i3);
            c20251.f67148 = this.f67148 - m48000();
            this.f11013.mo1688();
        } else {
            m47989();
        }
        C0970 c0970 = this.f11014;
        if (c0970 != null) {
            c0970.f67148 = this.f67148;
            c0970.mo1688();
        } else if (m11096()) {
            m11098();
        }
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo11100(int i, int i2) {
        mo11099(i, i2);
    }
}
