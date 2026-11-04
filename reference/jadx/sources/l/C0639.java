package l;

import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.֡ᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 67EL */
/* JADX INFO: loaded from: classes3.dex */
public final class C0639 extends C3622 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21522 f2495;

    public C0639(C16168 c16168, C21522 c21522) {
        this.f12426 = c16168.f12426;
        this.f12427 = c16168.f12427;
        this.f12428 = c16168;
        this.f2495 = c21522;
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
    public final void m2808() {
        char c;
        C21259 c21259M38396;
        C13930 c13930M1601;
        int iM30326;
        boolean z;
        EnumC3185 enumC3185;
        Object objM38388;
        EnumC22268 enumC22268;
        C21259 c21259;
        Object obj;
        C7965 c7965 = this.f12427;
        EnumC5202 enumC5202 = c7965.f26465;
        EnumC5202 enumC5203 = EnumC5202.f18162;
        if (enumC5202 == enumC5203) {
            c7965.m21671();
        }
        C7965 c7966 = this.f12427;
        if (c7966.f26465 == enumC5203) {
            c7966.m21671();
        }
        C7965 c7967 = this.f12427;
        if (c7967.f26465 == EnumC5202.f18334) {
            c7967.m21671();
        }
        while (true) {
            EnumC5202 enumC5204 = this.f12427.f26465;
            EnumC5202 enumC5205 = EnumC5202.f18168;
            if (enumC5204 != enumC5205 && !enumC5204.m15640(EnumC5202.f18310, EnumC5202.f18260, EnumC5202.f18143)) {
                return;
            }
            C7965 c7968 = this.f12427;
            String str = c7968.f26454;
            long j = c7968.f26464;
            c7968.m21671();
            C7965 c7969 = this.f12427;
            if (c7969.f26465 != EnumC5202.f18334) {
                EnumC22268 enumC22268M51907 = C23014.m51907(str);
                if (enumC22268M51907 == null) {
                    throw C10185.m26296(this.f12426, j, "Invalid mnemocode ({0})", new Object[]{str});
                }
                EnumC11079 enumC11079M50328 = enumC22268M51907.m50328();
                C7965 c79610 = this.f12427;
                String strM34865 = C14442.m34865("parseInstr: MnemoCode '", enumC22268M51907.m50326(), "'");
                if (c79610.f12426.m32305()) {
                    long jM4158 = c79610.f12426.m4158(j);
                    c = 0;
                    c79610.m21672(String.format("[%4d,%-2d] ", Long.valueOf(jM4158), Long.valueOf(((C4728) c79610.f12426.m32312()).m14629(jM4158, j))).concat(strM34865));
                } else {
                    c = 0;
                }
                int i = C18538.f60244[enumC11079M50328.ordinal()];
                Object objM38389 = null;
                objM38389 = null;
                objM38389 = null;
                objM38389 = null;
                objM38389 = null;
                objM38389 = null;
                objM38389 = null;
                objM38389 = null;
                objM38389 = null;
                C21259 c21259M38397 = null;
                objM38389 = null;
                if (i != 1) {
                    if (i == 2) {
                        c21259M38396 = this.f12428.m38396();
                        if (enumC22268M51907 == EnumC22268.f71882) {
                            this.f12427.m21679(EnumC5202.f18309);
                            objM38389 = this.f12428.m38388(2, enumC22268M51907.m50326());
                        }
                    } else {
                        if (i != 3 && i != 4) {
                            C1122 c1122 = this.f12426;
                            long j2 = this.f12427.f26450;
                            Object[] objArr = new Object[1];
                            objArr[c] = str;
                            throw C10185.m26296(c1122, j2, "Invalid mnemocode ({0})", objArr);
                        }
                        enumC22268 = enumC22268M51907;
                        c21259 = null;
                        obj = null;
                    }
                    this.f12428.f52488.m1596(j, enumC22268, c21259, obj);
                    return;
                }
                int i2 = C18538.f60245[enumC22268M51907.ordinal()];
                C21522 c21522 = this.f2495;
                switch (i2) {
                    case 1:
                        while (true) {
                            C7965 c79611 = this.f12427;
                            if (c79611.f26465 == EnumC5202.f18168) {
                                EnumC22268 enumC22268M51908 = C23014.m51907(c79611.f26453);
                                if (enumC22268M51908 == null) {
                                    C1122 c1123 = this.f12426;
                                    C7965 c79612 = this.f12427;
                                    throw C10185.m26296(c1123, c79612.f26464, "Unknown bytecode ({0})", new Object[]{c79612.f26453});
                                }
                                this.f12428.f52488.m1596(j, EnumC22268.f72038, new C21259(enumC22268M51908.m50332().intValue()), null);
                                this.f12427.m21671();
                            } else {
                                C16168 c16168 = this.f12428;
                                c16168.f52488.m1596(j, EnumC22268.f72038, c16168.m38387(1), null);
                            }
                            C7965 c79613 = this.f12427;
                            if (c79613.f26465 != EnumC5202.f18309) {
                                return;
                            } else {
                                c79613.m21671();
                            }
                        }
                        break;
                    case 2:
                        while (true) {
                            C16168 c16169 = this.f12428;
                            C0202 c0202 = c16169.f52488;
                            long j3 = this.f12427.f26464;
                            C7965 c79614 = c16169.f12427;
                            String str2 = c79614.f26454;
                            c79614.m21679(EnumC5202.f18168);
                            C18101 c18101M1595 = c0202.m1595(j3, str2);
                            if (c18101M1595.f59239 != -1) {
                                c0202.f1357.mo4160("<try {0}> redeclared", str2);
                            } else {
                                c18101M1595.f59239 = c0202.f1347;
                            }
                            C7965 c79615 = this.f12427;
                            if (c79615.f26465 != EnumC5202.f18309) {
                                return;
                            } else {
                                c79615.m21671();
                            }
                        }
                        break;
                    case 3:
                        while (true) {
                            C16168 c161610 = this.f12428;
                            C0202 c0203 = c161610.f52488;
                            long j4 = this.f12427.f26464;
                            C7965 c79616 = c161610.f12427;
                            String str3 = c79616.f26454;
                            c79616.m21679(EnumC5202.f18168);
                            C18101 c18101M1596 = c0203.m1595(j4, str3);
                            if (c18101M1596.f59238 != -1) {
                                c0203.f1357.mo4160("<endtry {0}> redeclared", str3);
                            } else {
                                c18101M1596.f59238 = c0203.f1347;
                            }
                            C7965 c79617 = this.f12427;
                            if (c79617.f26465 != EnumC5202.f18309) {
                                return;
                            } else {
                                c79617.m21671();
                            }
                        }
                        break;
                    case 4:
                        C16168 c161611 = this.f12428;
                        C0202 c0204 = c161611.f52488;
                        long j5 = this.f12427.f26464;
                        C7965 c79618 = c161611.f12427;
                        String str4 = c79618.f26454;
                        c79618.m21679(enumC5205);
                        C7660 c7660M48929 = c21522.m48929(EnumC3185.f10346, null, false);
                        C18101 c18101M1597 = c0204.m1595(j5, str4);
                        c18101M1597.f67360 = true;
                        int i3 = c0204.f1347;
                        C6343 c6343 = new C6343();
                        c6343.f21471 = j5;
                        c6343.f21469 = c18101M1597;
                        c6343.f21472 = i3;
                        c6343.f21470 = c7660M48929;
                        c0204.f1350.f36349.add(c6343);
                        return;
                    case 5:
                        while (true) {
                            this.f12428.m38390(EnumC22268.f71959);
                            C7965 c79619 = this.f12427;
                            if (c79619.f26465 != EnumC5202.f18309) {
                                return;
                            } else {
                                c79619.m21671();
                            }
                        }
                        break;
                    case 6:
                        while (true) {
                            this.f12428.m38399(EnumC22268.f71959);
                            C7965 c79620 = this.f12427;
                            if (c79620.f26465 != EnumC5202.f18309) {
                                return;
                            } else {
                                c79620.m21671();
                            }
                        }
                        break;
                    case 7:
                        while (true) {
                            this.f12428.m38390(EnumC22268.f72102);
                            C7965 c79621 = this.f12427;
                            if (c79621.f26465 != EnumC5202.f18309) {
                                return;
                            } else {
                                c79621.m21671();
                            }
                        }
                        break;
                    case 8:
                        while (true) {
                            this.f12428.m38399(EnumC22268.f72102);
                            C7965 c79622 = this.f12427;
                            if (c79622.f26465 != EnumC5202.f18309) {
                                return;
                            } else {
                                c79622.m21671();
                            }
                        }
                        break;
                    case 9:
                        C13930 c13930M1602 = this.f12428.f52488.m1601();
                        if (c13930M1602.f44163 != null) {
                            this.f12426.mo4159(this.f12427.f26464, "{0} redeclared", EnumC22268.f72010.m50326());
                        }
                        C11562 c11562 = new C11562();
                        c13930M1602.f44163 = c11562;
                        c13930M1602.m33914(this.f12427.f26464);
                        if (this.f12427.f26465 == EnumC5202.f18144) {
                            return;
                        }
                        while (true) {
                            this.f12428.m38389(c11562);
                            C7965 c79623 = this.f12427;
                            if (c79623.f26465 != EnumC5202.f18309) {
                                return;
                            } else {
                                c79623.m21671();
                            }
                        }
                        break;
                    case 10:
                        C13930 c13930M1603 = this.f12428.f52488.m1601();
                        if (c13930M1603.f44164 != null) {
                            this.f12426.mo4159(this.f12427.f26464, "{0} redeclared", EnumC22268.f71773.m50326());
                        }
                        C11562 c11563 = new C11562();
                        c13930M1603.f44164 = c11563;
                        c13930M1603.m33914(this.f12427.f26464);
                        if (this.f12427.f26465 == EnumC5202.f18144) {
                            return;
                        }
                        while (true) {
                            this.f12428.m38389(c11563);
                            C7965 c79624 = this.f12427;
                            if (c79624.f26465 != EnumC5202.f18309) {
                                return;
                            } else {
                                c79624.m21671();
                            }
                        }
                        break;
                    case 11:
                        C13930 c13930M1604 = this.f12428.f52488.m1601();
                        if (!c13930M1604.m33919()) {
                            this.f12426.mo4159(this.f12427.f26464, "{0} are only eligible in stack_map_frame {1}", EnumC22268.f71806.m50326(), EnumC16110.EARLY_LARVAL.m38277());
                        }
                        if (c13930M1604.f44166 != null) {
                            this.f12426.mo4159(this.f12427.f26464, "{0} redeclared", EnumC22268.f71806.m50326());
                        }
                        C11562 c11564 = new C11562();
                        c13930M1604.f44166 = c11564;
                        c13930M1604.m33914(this.f12427.f26464);
                        C7965 c79625 = this.f12427;
                        if (c79625.f26465 == EnumC5202.f18144) {
                            c79625.m21671();
                            C7965 c79626 = this.f12427;
                            Object[] objArr2 = {EnumC22268.f71915.m50326(), EnumC22268.f71828.m50326()};
                            ArrayList arrayList = new ArrayList(2);
                            int iM9136 = 0;
                            while (iM9136 < 2) {
                                Object obj2 = objArr2[iM9136];
                                iM9136 = C2764.m9136(obj2, arrayList, obj2, iM9136, 1);
                            }
                            c79626.m21673(C4681.unmodifiableList(arrayList), EnumC5202.f18282, EnumC5202.f18145);
                        } else {
                            while (true) {
                                this.f12428.m38398(c11564);
                                C7965 c79627 = this.f12427;
                                if (c79627.f26465 != EnumC5202.f18309) {
                                    c79627.m21679(EnumC5202.f18144);
                                    C7965 c79628 = this.f12427;
                                    Object[] objArr3 = {EnumC22268.f71915.m50326(), EnumC22268.f71828.m50326()};
                                    ArrayList arrayList2 = new ArrayList(2);
                                    int iM9137 = 0;
                                    while (iM9137 < 2) {
                                        Object obj3 = objArr3[iM9137];
                                        iM9137 = C2764.m9136(obj3, arrayList2, obj3, iM9137, 1);
                                    }
                                    c79628.m21673(C4681.unmodifiableList(arrayList2), EnumC5202.f18282, EnumC5202.f18145);
                                } else {
                                    c79627.m21671();
                                }
                            }
                        }
                        EnumC22268 enumC22269 = EnumC22268.f71940;
                        this.f12427.m21671();
                        c13930M1601 = this.f12428.f52488.m1601();
                        if (c13930M1601.m33918()) {
                            if (c13930M1601.m33919()) {
                                C0202 c0205 = this.f12428.f52488;
                                C13930 c13930 = new C13930(c0205.f1357, c0205.f1340.f56482.m51469());
                                c0205.f1353.add(c13930);
                                c13930M1601 = c13930;
                            } else {
                                this.f12426.mo4159(this.f12427.f26464, "A method''s Code attribute already has a StackMapTable attribute", new Object[0]);
                            }
                        }
                        c13930M1601.m33914(this.f12427.f26464);
                        C7965 c79629 = this.f12428.f12427;
                        String str5 = c79629.f26454;
                        c79629.m21679(EnumC5202.f18168);
                        c13930M1601.m33915(str5);
                        return;
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        c13930M1601 = this.f12428.f52488.m1601();
                        if (c13930M1601.m33918()) {
                            if (c13930M1601.m33919()) {
                                C0202 c0206 = this.f12428.f52488;
                                C13930 c13931 = new C13930(c0206.f1357, c0206.f1340.f56482.m51469());
                                c0206.f1353.add(c13931);
                                c13930M1601 = c13931;
                            } else {
                                this.f12426.mo4159(this.f12427.f26464, "A method''s Code attribute already has a StackMapTable attribute", new Object[0]);
                            }
                        }
                        c13930M1601.m33914(this.f12427.f26464);
                        C7965 c796210 = this.f12428.f12427;
                        String str6 = c796210.f26454;
                        c796210.m21679(EnumC5202.f18168);
                        c13930M1601.m33915(str6);
                        return;
                    case 16:
                        C13930 c13930M1605 = this.f12428.f52488.m1601();
                        if (c13930M1605.m33918()) {
                            this.f12426.mo4159(this.f12427.f26464, "A method''s Code attribute already has a StackMapTable attribute", new Object[0]);
                        }
                        c13930M1605.m33914(this.f12427.f26464);
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
                        c21259M38396 = this.f12428.m38396();
                        break;
                    case 39:
                        c21259M38397 = this.f12428.m38396();
                        this.f12427.m21679(EnumC5202.f18309);
                        objM38388 = this.f12428.m38388(1, enumC22268M51907.m50326());
                        C21259 c212510 = c21259M38397;
                        objM38389 = objM38388;
                        c21259M38396 = c212510;
                        break;
                    case 40:
                    case 41:
                        this.f12427.m21679(EnumC5202.f18213);
                        C1122 c1124 = this.f12426;
                        C22071 c22071 = new C22071();
                        c22071.f71159 = null;
                        c22071.f71164 = new ArrayList();
                        c22071.f71166 = new ArrayList();
                        c22071.f71165 = c1124;
                        int i4 = 0;
                        while (true) {
                            int i5 = C23014.f74679;
                            if (i4 < 2048) {
                                int i6 = C18538.f60243[this.f12427.f26465.ordinal()];
                                if (i6 == 1) {
                                    C7965 c79630 = this.f12427;
                                    int i7 = c79630.f26459 * c79630.f26455;
                                    c79630.m21671();
                                    this.f12427.m21679(EnumC5202.f18334);
                                    C21259 c21259M2809 = m2809();
                                    c22071.f71166.add(Integer.valueOf(i7));
                                    c22071.f71164.add(c21259M2809);
                                    i4++;
                                    C7965 c79631 = this.f12427;
                                    if (c79631.f26465 == EnumC5202.f18144) {
                                        c79631.m21671();
                                    }
                                } else if (i6 == 2) {
                                    this.f12427.m21671();
                                    this.f12427.m21679(EnumC5202.f18334);
                                    if (c22071.f71159 != null) {
                                        this.f12426.mo4160("Default statement already declared in this table", new Object[0]);
                                    }
                                    c22071.f71159 = m2809();
                                    C7965 c79632 = this.f12427;
                                    if (c79632.f26465 == EnumC5202.f18144) {
                                        c79632.m21671();
                                    }
                                }
                                C21259 c212511 = c21259M38397;
                                objM38389 = objM38388;
                                c21259M38396 = c212511;
                            } else {
                                this.f12426.mo4160("Switch table is too long {0}", 2048);
                            }
                            break;
                        }
                        this.f12427.m21679(EnumC5202.f18314);
                        objM38388 = c22071;
                        C21259 c212512 = c21259M38397;
                        objM38389 = objM38388;
                        c21259M38396 = c212512;
                        break;
                    case 42:
                        C7965 c79633 = this.f12427;
                        if (c79633.f26465 == EnumC5202.f18162) {
                            iM30326 = c79633.f26459;
                        } else {
                            iM30326 = C12134.m30326(c79633.f26454);
                            if (iM30326 == -1) {
                                throw C10185.m26296(this.f12426, this.f12427.f26464, "Array type code expected", new Object[0]);
                            }
                        }
                        this.f12427.m21671();
                        c21259M38396 = new C21259(iM30326);
                        break;
                    case 43:
                    case 44:
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case 46:
                        z = false;
                        enumC3185 = EnumC3185.f10346;
                        c21259M38396 = c21522.m48929(enumC3185, null, z);
                        break;
                    case 47:
                        c21259M38396 = this.f12428.m38388(1, enumC22268M51907.m50326());
                        break;
                    case 48:
                        c21259M38396 = this.f12428.m38388(2, enumC22268M51907.m50326());
                        break;
                    case 49:
                    case 50:
                    case 51:
                        c21259M38396 = c21522.m48929(null, null, false);
                        break;
                    case 52:
                    case 53:
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        z = false;
                        enumC3185 = EnumC3185.f10352;
                        c21259M38396 = c21522.m48929(enumC3185, null, z);
                        break;
                    case 56:
                        z = false;
                        enumC3185 = EnumC3185.f10340;
                        c21259M38396 = c21522.m48929(enumC3185, null, z);
                        break;
                    case 57:
                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                        EnumC3185 enumC3186 = EnumC3185.f10340;
                        EnumC3185 enumC3187 = EnumC3185.f10369;
                        if (Modifier.isInterface(this.f12428.f52490.f20372)) {
                            enumC3187 = enumC3186;
                            enumC3186 = enumC3187;
                        }
                        c21259M38396 = c21522.m48929(enumC3186, enumC3187, false);
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
                        c21259M38396 = m2809();
                        break;
                    case 79:
                        c21259M38397 = c21522.m48929(EnumC3185.f10369, null, false);
                        this.f12427.m21679(EnumC5202.f18309);
                        objM38388 = this.f12428.m38387(1);
                        C21259 c212513 = c21259M38397;
                        objM38389 = objM38388;
                        c21259M38396 = c212513;
                        break;
                    case 80:
                        z = false;
                        enumC3185 = EnumC3185.f10339;
                        c21259M38396 = c21522.m48929(enumC3185, null, z);
                        break;
                    case 81:
                        c21259M38397 = c21522.m48929(EnumC3185.f10346, null, false);
                        this.f12427.m21679(EnumC5202.f18309);
                        objM38388 = this.f12428.m38387(1);
                        C21259 c212514 = c21259M38397;
                        objM38389 = objM38388;
                        c21259M38396 = c212514;
                        break;
                    case 82:
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                    case 84:
                        enumC22268M51907 = C23014.m51906(Integer.valueOf((enumC22268M51907.m50332().intValue() << 8) | this.f12428.m38387(1).f67820));
                        c21259M38396 = null;
                        break;
                    default:
                        c21259M38396 = null;
                        break;
                }
                enumC22268 = enumC22268M51907;
                c21259 = c21259M38396;
                obj = objM38389;
                this.f12428.f52488.m1596(j, enumC22268, c21259, obj);
                return;
            }
            c7969.m21671();
            C0202 c0207 = this.f12428.f52488;
            C14371 c14371M1594 = c0207.m1594(str);
            if (c14371M1594.f67361) {
                c0207.f1357.mo4159(j, "Label {0} redeclared", str);
            } else {
                c14371M1594.f67361 = true;
                c14371M1594.f67820 = c0207.f1347;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21259 m2809() {
        int i = C18538.f60243[this.f12427.f26465.ordinal()];
        if (i == 1) {
            C7965 c7965 = this.f12427;
            int i2 = c7965.f26459 * c7965.f26455;
            c7965.m21671();
            return new C21259(i2);
        }
        if (i == 3) {
            C7965 c7966 = this.f12427;
            String str = c7966.f26453;
            c7966.m21671();
            C14371 c14371M1594 = this.f12428.f52488.m1594(str);
            c14371M1594.f67360 = true;
            return c14371M1594;
        }
        this.f12426.mo4160("Label expected", new Object[0]);
        throw new C24866();
    }
}
