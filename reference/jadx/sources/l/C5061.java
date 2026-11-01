package l;

import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۚۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5061 extends AbstractC14504 {

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f17650 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public C21620 f17651;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public int f17652;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public C5330 f17653;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public C6534 f17654;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f17655;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public C2238 f17656;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public C11495 f17657;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public int f17658;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public C11495 f17659;

    public C5061(C3980 c3980) {
        super(c3980);
        this.f17656 = null;
        this.f22696 = EnumC10020.METHOD_DATA;
        this.f47507 = "MethodData";
        this.f22686 = c3980.f47512.f22686;
        this.f17655 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC14504
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11477(DataInputStream dataInputStream, EnumC16783 enumC16783, int i) throws IOException {
        Object[] objArr = 0;
        switch (C13529.f44667[enumC16783.ordinal()]) {
            case 1:
                C21620 c21620 = new C21620(this);
                this.f17651 = c21620;
                c21620.m48334(i, dataInputStream);
                return true;
            case 2:
                if (this.f47505 != null) {
                    this.f47519.mo2157("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", "Signature", "method_info");
                }
                C12906 c12906 = new C12906((C3980) this.f47511);
                c12906.m31978(i, dataInputStream);
                this.f47505 = c12906;
                return true;
            case 3:
                C5330 c5330 = new C5330((C3980) this.f47511);
                c5330.m8966(i, dataInputStream);
                this.f17653 = c5330;
                return true;
            case 4:
                int unsignedByte = dataInputStream.readUnsignedByte();
                this.f47519.m2152(new C3213(unsignedByte, objArr == true ? 1 : 0));
                this.f17655 = new ArrayList(unsignedByte);
                for (int i2 = 0; i2 < unsignedByte; i2++) {
                    short unsignedShort = (short) dataInputStream.readUnsignedShort();
                    int unsignedShort2 = dataInputStream.readUnsignedShort();
                    this.f47519.m2146(String.format("()->MethodParameter[%d] = { name[%d]: \"%s\" modifiers[%d]: %s}", Integer.valueOf(i2), Short.valueOf(unsignedShort), this.f47512.m27826(unsignedShort, new C21745(8)), Integer.valueOf(unsignedShort2), EnumC23839.m52538(unsignedShort2, EnumC0554.METHOD)), new Object[0]);
                    ArrayList arrayList = this.f17655;
                    C11412 c11412 = new C11412();
                    c11412.f38419 = unsignedShort2;
                    c11412.f38420 = unsignedShort;
                    arrayList.add(i2, c11412);
                }
                return true;
            case 5:
            case 6:
                boolean z = enumC16783 == EnumC16783.f53746;
                C11495 c11495 = new C11495(this, z);
                c11495.m28683(dataInputStream);
                if (z) {
                    this.f17659 = c11495;
                    return true;
                }
                this.f17657 = c11495;
                return true;
            case 7:
                this.f17654 = C7240.m19353(dataInputStream, this.f47511, false);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m14100() {
        if (this.f17656 == null) {
            C11495 c11495 = this.f17657;
            int iM28684 = c11495 != null ? c11495.m28684() : 0;
            C11495 c11496 = this.f17659;
            this.f17656 = new C2238(iM28684, c11496 != null ? c11496.m28684() : 0);
        }
        if (this.f17656.m6874()) {
            return true;
        }
        ArrayList arrayList = this.f17655;
        return arrayList != null && arrayList.size() > 0;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m14103() {
        if (m14100()) {
            m18208(1);
            int i = this.f22695 ? 7 : 5;
            ArrayList arrayList = this.f17655;
            int i2 = 0;
            int iMax = Math.max(this.f17656.m6873(), Math.max(arrayList != null ? arrayList.size() : 0, this.f17656.m6875()));
            String[] strArr = new String[iMax];
            if (this.f17655 != null) {
                for (int i3 = 0; i3 < iMax; i3++) {
                    C11412 c11412 = (C11412) this.f17655.get(i3);
                    strArr[i3] = C16236.m38348(EnumC20934.f68070, new StringBuilder(), "{ ");
                    if (this.f22692) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(strArr[i3]);
                        int i4 = c11412.f38420;
                        int i5 = c11412.f38419;
                        sb.append(String.format("#%d ", Integer.valueOf(i4)));
                        strArr[i3] = sb.toString();
                        if (!this.f22704 && i4 != 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(strArr[i3]);
                            sb2.append("/* " + ((C3980) this.f47511).f47512.m27826(i4, new C12740(6)) + " */ ");
                            strArr[i3] = sb2.toString();
                        }
                        if (i5 != 0) {
                            strArr[i3] = strArr[i3] + EnumC23839.m52517(i5, EnumC0554.METHOD_PARAMETERS);
                        }
                    } else {
                        int i6 = c11412.f38420;
                        int i7 = c11412.f38419;
                        if (i6 != 0) {
                            strArr[i3] = strArr[i3] + ((C3980) this.f47511).f47512.m27826(c11412.f38420, new C4355(i2)) + " ";
                        } else {
                            strArr[i3] = C22697.m50267(new StringBuilder(), strArr[i3], "#0 ");
                        }
                        if (i7 != 0) {
                            strArr[i3] = strArr[i3] + EnumC23839.m52517(i7, EnumC0554.METHOD_PARAMETERS);
                        }
                    }
                    strArr[i3] = C22697.m50267(new StringBuilder(), strArr[i3], l.d);
                }
            }
            int i8 = 0;
            while (i8 < iMax) {
                ArrayList arrayList2 = (this.f17657 == null || i8 >= this.f17656.m6873()) ? null : this.f17657.get(i8);
                ArrayList arrayList3 = (this.f17659 == null || i8 >= this.f17656.m6875()) ? null : this.f17659.get(i8);
                ArrayList arrayList4 = this.f17655;
                C11412 c11413 = arrayList4 != null ? (C11412) arrayList4.get(i8) : null;
                boolean z = (arrayList2 == null && arrayList3 == null) ? false : true;
                if (c11413 != null || z) {
                    m18223(m18222(i, String.format("%2d: ", Integer.valueOf(i8))));
                    if (c11413 != null) {
                        m18218(3, strArr[i8]);
                    }
                    m14099(arrayList2);
                    m14099(arrayList3);
                    m18221();
                }
                i8++;
            }
            m18227(1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14099(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C12885 c12885 = (C12885) it.next();
                m18221();
                m18228(m18207(3, ""));
                c12885.mo34919(EnumC23676.PARAMETER_ANNOTATION);
                c12885.m18206(m18233() + 3);
                c12885.mo3628();
            }
        }
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo14102(int i, int i2) {
        int i3;
        AbstractC23282 abstractC23282M34151;
        int iIndexOf;
        C12906 c12906 = this.f47505;
        boolean z = (c12906 == null || c12906.f22707) ? false : true;
        boolean z2 = z && c12906.mo18231();
        boolean z3 = this.f17653 != null;
        boolean z4 = this.f17651 != null || m14100() || z3;
        boolean z5 = (z4 || z2) ? false : true;
        if (i > 0) {
            m18221();
        }
        if (this.f22708) {
            int size = !EnumC23839.m52528(this.f47516) ? 1 : 0;
            String str = m18225() + " *  ";
            int i4 = this.f47516;
            EnumC0554 enumC0554 = EnumC0554.METHOD;
            String strConcat = EnumC23839.m52517(i4, enumC0554).concat(m34922());
            C12906 c12907 = this.f47505;
            if (c12907 != null) {
                abstractC23282M34151 = c12907.m31980();
            } else {
                this.f47519.getClass();
                abstractC23282M34151 = new C14110(this.f17652).m34151(this.f47512);
            }
            C11038 c11038 = ((C3980) this.f47511).f47512;
            int i5 = this.f17658;
            C23590 c23590 = C11038.f37488;
            String strM27826 = c11038.m27826(i5, c23590);
            boolean zEquals = strM27826.equals("<init>");
            String string = abstractC23282M34151.toString();
            if (abstractC23282M34151 instanceof C22576) {
                size += ((C22576) abstractC23282M34151).f73583.size();
            }
            if (zEquals) {
                strM27826 = ((C3980) this.f47511).f14765;
                string = string.substring(string.indexOf(MotionUtils.EASING_TYPE_FORMAT_START));
                iIndexOf = 0;
            } else {
                iIndexOf = string.indexOf(40);
            }
            String strReplaceAll = string.substring(0, iIndexOf).concat(strM27826).concat(string.substring(iIndexOf)).replaceAll("/", ".");
            String strM27827 = ((C3980) this.f47511).f47512.m27826(this.f17652, c23590);
            m18209("/**");
            m18219(str + strConcat + strReplaceAll);
            String strConcat2 = str.concat(m18225());
            m18219(strConcat2 + "descriptor: " + strM27827);
            if (this.f47505 != null) {
                StringBuilder sbM8976 = C3012.m8976(strConcat2, "signature:  ");
                sbM8976.append(((C3980) this.f47511).f47512.m27826(this.f47505.m31981(), c23590));
                m18219(sbM8976.toString());
            }
            StringBuilder sbM23356 = C9023.m23356(strConcat2);
            sbM23356.append(String.format("flags: (0x%04x) %s", Integer.valueOf(this.f47516), EnumC23839.m52538(this.f47516, enumC0554)));
            m18219(sbM23356.toString());
            m18219(strConcat2 + String.format("stack: %d, locals: %d, args_size: %d", Integer.valueOf(this.f17651.f70117), Integer.valueOf(this.f17651.f70123), Integer.valueOf(size)));
            m18209(" */");
        }
        mo11476(this.f47508, this.f47515);
        mo11476(this.f47518, this.f47504);
        String strConcat3 = EnumC23839.m52517(this.f47516, EnumC0554.METHOD).concat(m34922()).concat(EnumC20934.f68093.m47084());
        String strM18222 = m18222(Math.max(strConcat3.length() + 1, (m18233() * 2) + EnumC10020.SIGNATURE.m25297().length()), strConcat3);
        int length = strM18222.length() - m18233();
        C13111 c13111M31977 = z ? this.f47505.m31977(new Function() { // from class: l.֫ۨۤ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(this.f6953.f47512.m27814(((Integer) obj).intValue()));
            }
        }) : new C13111("", "");
        boolean z6 = this.f22692;
        String str2 = l.b;
        if (z6) {
            String strConcat4 = strM18222.concat(String.format("#%d:#%d", Integer.valueOf(this.f17658), Integer.valueOf(this.f17652))).concat((String) c13111M31977.f43679);
            if (z5 && this.f17654 == null) {
                strConcat4 = strConcat4.concat(l.b);
            }
            if (!this.f22704) {
                m18223(m18222(this.f22686, strConcat4));
                m18228((this.f17654 != null ? " /* " : " // ").concat(((C3980) this.f47511).f47512.getName(this.f17658) + ":" + ((C3980) this.f47511).f47512.getName(this.f17652)).concat((String) c13111M31977.f43680).concat(this.f17654 != null ? " */ " : " "));
            } else if (this.f17654 != null) {
                m18223(m18222(this.f22686, strConcat4));
            } else {
                m18223(strConcat4);
            }
        } else {
            String strConcat5 = strM18222.concat(((C3980) this.f47511).f47512.getName(this.f17658) + ":").concat(((C3980) this.f47511).f47512.getName(this.f17652)).concat((String) c13111M31977.f43680);
            if (z5 && this.f17654 == null) {
                strConcat5 = strConcat5.concat(l.b);
            }
            m18223(strConcat5);
        }
        C6534 c6534 = this.f17654;
        if (c6534 != null) {
            c6534.m18208(1);
            c6534.f22686 = m18233() - m18205();
            this.f17654.mo34919(EnumC23676.HAS_DEFAULT_VALUE);
            this.f17654.mo3628();
            if (!z4) {
                if (z2) {
                    str2 = ",";
                }
                m18228(str2);
            }
        }
        if (z2) {
            m18221();
            C12906 c12908 = this.f47505;
            c12908.m31983();
            c12908.m31984(length);
            i3 = 1;
            c12908.m18208(1);
            c12908.f22686 = this.f22686 - m18205();
            this.f47505.m31979(!z3);
            this.f47505.mo3628();
        } else {
            i3 = 1;
        }
        if (this.f17653 != null) {
            m18221();
            C5330 c5330 = this.f17653;
            c5330.m14808(length);
            c5330.m18208(i3);
            c5330.f22686 = this.f22686 - m18205();
            this.f17653.mo3628();
        } else {
            m18221();
        }
        C21620 c21620 = this.f17651;
        if (c21620 != null) {
            c21620.f22686 = this.f22686;
            c21620.mo3628();
        } else if (m14100()) {
            m14103();
        }
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo14101(int i, int i2) {
        mo14102(i, i2);
    }
}
