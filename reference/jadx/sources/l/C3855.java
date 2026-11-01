package l;

import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۘۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67EL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3855 extends C4561 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1033 f14408;

    public C3855(C14441 c14441, C1033 c1033) {
        this.f16198 = c14441.f16198;
        this.f16199 = c14441.f16199;
        this.f16200 = c14441;
        this.f14408 = c1033;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:113:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:116:0x03d5  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11177() {
        char c;
        C13173 c13173M34796;
        C7903 c7903M50793;
        int iM7616;
        boolean z;
        EnumC13776 enumC13776;
        Object objM34790;
        EnumC20562 enumC20562;
        C13173 c13173;
        Object obj;
        C12842 c12842 = this.f16199;
        EnumC20934 enumC20934 = c12842.f42721;
        EnumC20934 enumC20935 = EnumC20934.f68154;
        if (enumC20934 == enumC20935) {
            c12842.m31840();
        }
        C12842 c12843 = this.f16199;
        if (c12843.f42721 == enumC20935) {
            c12843.m31840();
        }
        C12842 c12844 = this.f16199;
        if (c12844.f42721 == EnumC20934.f68046) {
            c12844.m31840();
        }
        while (true) {
            EnumC20934 enumC20936 = this.f16199.f42721;
            EnumC20934 enumC20937 = EnumC20934.f68096;
            if (enumC20936 != enumC20937 && !enumC20936.m47087(EnumC20934.f68068, EnumC20934.f68051, EnumC20934.f68174)) {
                return;
            }
            C12842 c12845 = this.f16199;
            String str = c12845.f42720;
            long j = c12845.f42728;
            c12845.m31840();
            C12842 c12846 = this.f16199;
            if (c12846.f42721 != EnumC20934.f68046) {
                EnumC20562 enumC20562M45103 = C19857.m45103(str);
                if (enumC20562M45103 == null) {
                    throw C7997.m21056(this.f16198, j, "Invalid mnemocode ({0})", new Object[]{str});
                }
                EnumC15624 enumC15624M46396 = enumC20562M45103.m46396();
                C12842 c12847 = this.f16199;
                String strM38890 = C16523.m38890("parseInstr: MnemoCode '", enumC20562M45103.m46393(), "'");
                if (c12847.f16198.m2158()) {
                    long jM42171 = c12847.f16198.m42171(j);
                    c = 0;
                    c12847.m31841(String.format("[%4d,%-2d] ", Long.valueOf(jM42171), Long.valueOf(((C8878) c12847.f16198.m2163()).m23025(jM42171, j))).concat(strM38890));
                } else {
                    c = 0;
                }
                int i = C13029.f43465[enumC15624M46396.ordinal()];
                Object objM34791 = null;
                objM34791 = null;
                objM34791 = null;
                objM34791 = null;
                objM34791 = null;
                objM34791 = null;
                objM34791 = null;
                objM34791 = null;
                objM34791 = null;
                C13173 c13173M34797 = null;
                objM34791 = null;
                if (i != 1) {
                    if (i == 2) {
                        c13173M34796 = this.f16200.m34796();
                        if (enumC20562M45103 == EnumC20562.f66954) {
                            this.f16199.m31848(EnumC20934.f68072);
                            objM34791 = this.f16200.m34790(2, enumC20562M45103.m46393());
                        }
                    } else {
                        if (i != 3 && i != 4) {
                            C18111 c18111 = this.f16198;
                            long j2 = this.f16199.f42722;
                            Object[] objArr = new Object[1];
                            objArr[c] = str;
                            throw C7997.m21056(c18111, j2, "Invalid mnemocode ({0})", objArr);
                        }
                        enumC20562 = enumC20562M45103;
                        c13173 = null;
                        obj = null;
                    }
                    this.f16200.f47345.m50788(j, enumC20562, c13173, obj);
                    return;
                }
                int i2 = C13029.f43466[enumC20562M45103.ordinal()];
                C1033 c1033 = this.f14408;
                switch (i2) {
                    case 1:
                        while (true) {
                            C12842 c12848 = this.f16199;
                            if (c12848.f42721 == EnumC20934.f68096) {
                                EnumC20562 enumC20562M45104 = C19857.m45103(c12848.f42724);
                                if (enumC20562M45104 == null) {
                                    C18111 c18112 = this.f16198;
                                    C12842 c12849 = this.f16199;
                                    throw C7997.m21056(c18112, c12849.f42728, "Unknown bytecode ({0})", new Object[]{c12849.f42724});
                                }
                                this.f16200.f47345.m50788(j, EnumC20562.f66889, new C13173(enumC20562M45104.m46398().intValue()), null);
                                this.f16199.m31840();
                            } else {
                                C14441 c14441 = this.f16200;
                                c14441.f47345.m50788(j, EnumC20562.f66889, c14441.m34789(1), null);
                            }
                            C12842 c128410 = this.f16199;
                            if (c128410.f42721 != EnumC20934.f68072) {
                                return;
                            } else {
                                c128410.m31840();
                            }
                        }
                        break;
                    case 2:
                        while (true) {
                            C14441 c14442 = this.f16200;
                            C22948 c22948 = c14442.f47345;
                            long j3 = this.f16199.f42728;
                            C12842 c128411 = c14442.f16199;
                            String str2 = c128411.f42720;
                            c128411.m31848(EnumC20934.f68096);
                            C6719 c6719M50786 = c22948.m50786(j3, str2);
                            if (c6719M50786.f22647 != -1) {
                                c22948.f74600.mo2150("<try {0}> redeclared", str2);
                            } else {
                                c6719M50786.f22647 = c22948.f74595;
                            }
                            C12842 c128412 = this.f16199;
                            if (c128412.f42721 != EnumC20934.f68072) {
                                return;
                            } else {
                                c128412.m31840();
                            }
                        }
                        break;
                    case 3:
                        while (true) {
                            C14441 c14443 = this.f16200;
                            C22948 c22949 = c14443.f47345;
                            long j4 = this.f16199.f42728;
                            C12842 c128413 = c14443.f16199;
                            String str3 = c128413.f42720;
                            c128413.m31848(EnumC20934.f68096);
                            C6719 c6719M50787 = c22949.m50786(j4, str3);
                            if (c6719M50787.f22648 != -1) {
                                c22949.f74600.mo2150("<endtry {0}> redeclared", str3);
                            } else {
                                c6719M50787.f22648 = c22949.f74595;
                            }
                            C12842 c128414 = this.f16199;
                            if (c128414.f42721 != EnumC20934.f68072) {
                                return;
                            } else {
                                c128414.m31840();
                            }
                        }
                        break;
                    case 4:
                        C14441 c14444 = this.f16200;
                        C22948 c229410 = c14444.f47345;
                        long j5 = this.f16199.f42728;
                        C12842 c128415 = c14444.f16199;
                        String str4 = c128415.f42720;
                        c128415.m31848(enumC20937);
                        C15187 c15187M3881 = c1033.m3881(EnumC13776.f45400, null, false);
                        C6719 c6719M50788 = c229410.m50786(j5, str4);
                        c6719M50788.f14564 = true;
                        int i3 = c229410.f74595;
                        C2588 c2588 = new C2588();
                        c2588.f10172 = j5;
                        c2588.f10174 = c6719M50788;
                        c2588.f10175 = i3;
                        c2588.f10173 = c15187M3881;
                        c229410.f74590.f77846.add(c2588);
                        return;
                    case 5:
                        while (true) {
                            this.f16200.m34793(EnumC20562.f66842);
                            C12842 c128416 = this.f16199;
                            if (c128416.f42721 != EnumC20934.f68072) {
                                return;
                            } else {
                                c128416.m31840();
                            }
                        }
                        break;
                    case 6:
                        while (true) {
                            this.f16200.m34800(EnumC20562.f66842);
                            C12842 c128417 = this.f16199;
                            if (c128417.f42721 != EnumC20934.f68072) {
                                return;
                            } else {
                                c128417.m31840();
                            }
                        }
                        break;
                    case 7:
                        while (true) {
                            this.f16200.m34793(EnumC20562.f66711);
                            C12842 c128418 = this.f16199;
                            if (c128418.f42721 != EnumC20934.f68072) {
                                return;
                            } else {
                                c128418.m31840();
                            }
                        }
                        break;
                    case 8:
                        while (true) {
                            this.f16200.m34800(EnumC20562.f66711);
                            C12842 c128419 = this.f16199;
                            if (c128419.f42721 != EnumC20934.f68072) {
                                return;
                            } else {
                                c128419.m31840();
                            }
                        }
                        break;
                    case 9:
                        C7903 c7903M50794 = this.f16200.f47345.m50793();
                        if (c7903M50794.f25983 != null) {
                            this.f16198.mo2149(this.f16199.f42728, "{0} redeclared", EnumC20562.f66600.m46393());
                        }
                        C24027 c24027 = new C24027();
                        c7903M50794.f25983 = c24027;
                        c7903M50794.m20912(this.f16199.f42728);
                        if (this.f16199.f42721 == EnumC20934.f68171) {
                            return;
                        }
                        while (true) {
                            this.f16200.m34794(c24027);
                            C12842 c128420 = this.f16199;
                            if (c128420.f42721 != EnumC20934.f68072) {
                                return;
                            } else {
                                c128420.m31840();
                            }
                        }
                        break;
                    case 10:
                        C7903 c7903M50795 = this.f16200.f47345.m50793();
                        if (c7903M50795.f25980 != null) {
                            this.f16198.mo2149(this.f16199.f42728, "{0} redeclared", EnumC20562.f66656.m46393());
                        }
                        C24027 c24028 = new C24027();
                        c7903M50795.f25980 = c24028;
                        c7903M50795.m20912(this.f16199.f42728);
                        if (this.f16199.f42721 == EnumC20934.f68171) {
                            return;
                        }
                        while (true) {
                            this.f16200.m34794(c24028);
                            C12842 c128421 = this.f16199;
                            if (c128421.f42721 != EnumC20934.f68072) {
                                return;
                            } else {
                                c128421.m31840();
                            }
                        }
                        break;
                    case 11:
                        C7903 c7903M50796 = this.f16200.f47345.m50793();
                        if (!c7903M50796.m20915()) {
                            this.f16198.mo2149(this.f16199.f42728, "{0} are only eligible in stack_map_frame {1}", EnumC20562.f66918.m46393(), EnumC1965.EARLY_LARVAL.m6342());
                        }
                        if (c7903M50796.f25986 != null) {
                            this.f16198.mo2149(this.f16199.f42728, "{0} redeclared", EnumC20562.f66918.m46393());
                        }
                        C24027 c24029 = new C24027();
                        c7903M50796.f25986 = c24029;
                        c7903M50796.m20912(this.f16199.f42728);
                        C12842 c128422 = this.f16199;
                        if (c128422.f42721 == EnumC20934.f68171) {
                            c128422.m31840();
                            C12842 c128423 = this.f16199;
                            Object[] objArr2 = {EnumC20562.f66700.m46393(), EnumC20562.f66798.m46393()};
                            ArrayList arrayList = new ArrayList(2);
                            int iM51269 = 0;
                            while (iM51269 < 2) {
                                Object obj2 = objArr2[iM51269];
                                iM51269 = C23234.m51269(obj2, arrayList, obj2, iM51269, 1);
                            }
                            c128423.m31842(C0561.unmodifiableList(arrayList), EnumC20934.f68160, EnumC20934.f68173);
                        } else {
                            while (true) {
                                this.f16200.m34801(c24029);
                                C12842 c128424 = this.f16199;
                                if (c128424.f42721 != EnumC20934.f68072) {
                                    c128424.m31848(EnumC20934.f68171);
                                    C12842 c128425 = this.f16199;
                                    Object[] objArr3 = {EnumC20562.f66700.m46393(), EnumC20562.f66798.m46393()};
                                    ArrayList arrayList2 = new ArrayList(2);
                                    int iM512610 = 0;
                                    while (iM512610 < 2) {
                                        Object obj3 = objArr3[iM512610];
                                        iM512610 = C23234.m51269(obj3, arrayList2, obj3, iM512610, 1);
                                    }
                                    c128425.m31842(C0561.unmodifiableList(arrayList2), EnumC20934.f68160, EnumC20934.f68173);
                                } else {
                                    c128424.m31840();
                                }
                            }
                        }
                        EnumC20562 enumC20563 = EnumC20562.f66639;
                        this.f16199.m31840();
                        c7903M50793 = this.f16200.f47345.m50793();
                        if (c7903M50793.m20909()) {
                            if (c7903M50793.m20915()) {
                                C22948 c229411 = this.f16200.f47345;
                                C7903 c7903 = new C7903(c229411.f74600, c229411.f74599.f31849.m45846());
                                c229411.f74583.add(c7903);
                                c7903M50793 = c7903;
                            } else {
                                this.f16198.mo2149(this.f16199.f42728, "A method''s Code attribute already has a StackMapTable attribute", new Object[0]);
                            }
                        }
                        c7903M50793.m20912(this.f16199.f42728);
                        C12842 c128426 = this.f16200.f16199;
                        String str5 = c128426.f42720;
                        c128426.m31848(EnumC20934.f68096);
                        c7903M50793.m20913(str5);
                        return;
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        c7903M50793 = this.f16200.f47345.m50793();
                        if (c7903M50793.m20909()) {
                            if (c7903M50793.m20915()) {
                                C22948 c229412 = this.f16200.f47345;
                                C7903 c7904 = new C7903(c229412.f74600, c229412.f74599.f31849.m45846());
                                c229412.f74583.add(c7904);
                                c7903M50793 = c7904;
                            } else {
                                this.f16198.mo2149(this.f16199.f42728, "A method''s Code attribute already has a StackMapTable attribute", new Object[0]);
                            }
                        }
                        c7903M50793.m20912(this.f16199.f42728);
                        C12842 c128427 = this.f16200.f16199;
                        String str6 = c128427.f42720;
                        c128427.m31848(EnumC20934.f68096);
                        c7903M50793.m20913(str6);
                        return;
                    case 16:
                        C7903 c7903M50797 = this.f16200.f47345.m50793();
                        if (c7903M50797.m20909()) {
                            this.f16198.mo2149(this.f16199.f42728, "A method''s Code attribute already has a StackMapTable attribute", new Object[0]);
                        }
                        c7903M50797.m20912(this.f16199.f42728);
                        return;
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
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
                    case 37:
                    case 38:
                        c13173M34796 = this.f16200.m34796();
                        break;
                    case 39:
                        c13173M34797 = this.f16200.m34796();
                        this.f16199.m31848(EnumC20934.f68072);
                        objM34790 = this.f16200.m34790(1, enumC20562M45103.m46393());
                        C13173 c13174 = c13173M34797;
                        objM34791 = objM34790;
                        c13173M34796 = c13174;
                        break;
                    case 40:
                    case 41:
                        this.f16199.m31848(EnumC20934.f68039);
                        C18111 c18113 = this.f16198;
                        C8609 c8609 = new C8609();
                        c8609.f29722 = null;
                        c8609.f29723 = new ArrayList();
                        c8609.f29720 = new ArrayList();
                        c8609.f29726 = c18113;
                        int i4 = 0;
                        while (true) {
                            int i5 = C19857.f63686;
                            if (i4 < 2048) {
                                int i6 = C13029.f43464[this.f16199.f42721.ordinal()];
                                if (i6 == 1) {
                                    C12842 c128428 = this.f16199;
                                    int i7 = c128428.f42726 * c128428.f42723;
                                    c128428.m31840();
                                    this.f16199.m31848(EnumC20934.f68046);
                                    C13173 c13173M11178 = m11178();
                                    c8609.f29720.add(Integer.valueOf(i7));
                                    c8609.f29723.add(c13173M11178);
                                    i4++;
                                    C12842 c128429 = this.f16199;
                                    if (c128429.f42721 == EnumC20934.f68171) {
                                        c128429.m31840();
                                    }
                                } else if (i6 == 2) {
                                    this.f16199.m31840();
                                    this.f16199.m31848(EnumC20934.f68046);
                                    if (c8609.f29722 != null) {
                                        this.f16198.mo2150("Default statement already declared in this table", new Object[0]);
                                    }
                                    c8609.f29722 = m11178();
                                    C12842 c128430 = this.f16199;
                                    if (c128430.f42721 == EnumC20934.f68171) {
                                        c128430.m31840();
                                    }
                                }
                                C13173 c13175 = c13173M34797;
                                objM34791 = objM34790;
                                c13173M34796 = c13175;
                            } else {
                                this.f16198.mo2150("Switch table is too long {0}", 2048);
                            }
                            break;
                        }
                        this.f16199.m31848(EnumC20934.f68195);
                        objM34790 = c8609;
                        C13173 c13176 = c13173M34797;
                        objM34791 = objM34790;
                        c13173M34796 = c13176;
                        break;
                    case 42:
                        C12842 c128431 = this.f16199;
                        if (c128431.f42721 == EnumC20934.f68154) {
                            iM7616 = c128431.f42726;
                        } else {
                            iM7616 = C2485.m7616(c128431.f42720);
                            if (iM7616 == -1) {
                                throw C7997.m21056(this.f16198, this.f16199.f42728, "Array type code expected", new Object[0]);
                            }
                        }
                        this.f16199.m31840();
                        c13173M34796 = new C13173(iM7616);
                        break;
                    case 43:
                    case 44:
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case 46:
                        z = false;
                        enumC13776 = EnumC13776.f45400;
                        c13173M34796 = c1033.m3881(enumC13776, null, z);
                        break;
                    case 47:
                        c13173M34796 = this.f16200.m34790(1, enumC20562M45103.m46393());
                        break;
                    case 48:
                        c13173M34796 = this.f16200.m34790(2, enumC20562M45103.m46393());
                        break;
                    case 49:
                    case 50:
                    case 51:
                        c13173M34796 = c1033.m3881(null, null, false);
                        break;
                    case 52:
                    case 53:
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        z = false;
                        enumC13776 = EnumC13776.f45408;
                        c13173M34796 = c1033.m3881(enumC13776, null, z);
                        break;
                    case 56:
                        z = false;
                        enumC13776 = EnumC13776.f45431;
                        c13173M34796 = c1033.m3881(enumC13776, null, z);
                        break;
                    case 57:
                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                        EnumC13776 enumC13777 = EnumC13776.f45431;
                        EnumC13776 enumC13778 = EnumC13776.f45428;
                        if (Modifier.isInterface(this.f16200.f47341.f20887)) {
                            enumC13778 = enumC13777;
                            enumC13777 = enumC13778;
                        }
                        c13173M34796 = c1033.m3881(enumC13777, enumC13778, false);
                        break;
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                    case 77:
                    case 78:
                        c13173M34796 = m11178();
                        break;
                    case 79:
                        c13173M34797 = c1033.m3881(EnumC13776.f45428, null, false);
                        this.f16199.m31848(EnumC20934.f68072);
                        objM34790 = this.f16200.m34789(1);
                        C13173 c13177 = c13173M34797;
                        objM34791 = objM34790;
                        c13173M34796 = c13177;
                        break;
                    case 80:
                        z = false;
                        enumC13776 = EnumC13776.f45410;
                        c13173M34796 = c1033.m3881(enumC13776, null, z);
                        break;
                    case 81:
                        c13173M34797 = c1033.m3881(EnumC13776.f45400, null, false);
                        this.f16199.m31848(EnumC20934.f68072);
                        objM34790 = this.f16200.m34789(1);
                        C13173 c13178 = c13173M34797;
                        objM34791 = objM34790;
                        c13173M34796 = c13178;
                        break;
                    case 82:
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                    case 84:
                        enumC20562M45103 = C19857.m45102(Integer.valueOf((enumC20562M45103.m46398().intValue() << 8) | this.f16200.m34789(1).f43854));
                        c13173M34796 = null;
                        break;
                    default:
                        c13173M34796 = null;
                        break;
                }
                enumC20562 = enumC20562M45103;
                c13173 = c13173M34796;
                obj = objM34791;
                this.f16200.f47345.m50788(j, enumC20562, c13173, obj);
                return;
            }
            c12846.m31840();
            C22948 c229413 = this.f16200.f47345;
            C13070 c13070M50787 = c229413.m50787(str);
            if (c13070M50787.f14566) {
                c229413.f74600.mo2149(j, "Label {0} redeclared", str);
            } else {
                c13070M50787.f14566 = true;
                c13070M50787.f43854 = c229413.f74595;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13173 m11178() {
        int i = C13029.f43464[this.f16199.f42721.ordinal()];
        if (i == 1) {
            C12842 c12842 = this.f16199;
            int i2 = c12842.f42726 * c12842.f42723;
            c12842.m31840();
            return new C13173(i2);
        }
        if (i == 3) {
            C12842 c12843 = this.f16199;
            String str = c12843.f42724;
            c12843.m31840();
            C13070 c13070M50787 = this.f16200.f47345.m50787(str);
            c13070M50787.f14564 = true;
            return c13070M50787;
        }
        this.f16198.mo2150("Label expected", new Object[0]);
        throw new C6055();
    }
}
