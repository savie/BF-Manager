package l;

import com.alipay.sdk.m.y.l;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֡ۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 97QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C0192 extends AbstractC19903 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C0559 f1315;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f1316;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f1317;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C10164 f1318;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f1319;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C19949[] f1320;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:102:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:103:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:105:0x0317  */
    /* JADX WARN: Code duplicated, block: B:115:0x0337  */
    /* JADX WARN: Code duplicated, block: B:117:0x0341  */
    /* JADX WARN: Code duplicated, block: B:118:0x0347  */
    /* JADX WARN: Code duplicated, block: B:122:0x036d  */
    /* JADX WARN: Code duplicated, block: B:123:0x038c  */
    /* JADX WARN: Code duplicated, block: B:163:0x048a  */
    /* JADX WARN: Code duplicated, block: B:165:0x048e  */
    /* JADX WARN: Code duplicated, block: B:167:0x049a  */
    /* JADX WARN: Code duplicated, block: B:169:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:171:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:180:0x050b A[LOOP:6: B:143:0x0440->B:180:0x050b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x050e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0509 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.String, l.֡ᩳ۟] */
    /* JADX WARN: Type inference failed for: r7v17 */
    public C0192(String str) throws C18537 {
        int i;
        AbstractC22433<C15716> abstractC22433CopyOf;
        AbstractC23844 abstractC23844;
        boolean z;
        String str2;
        String str3;
        boolean z2;
        String strM39863;
        int length;
        int iM1417;
        int i2;
        int i3;
        AbstractC23844 abstractC23845;
        C15716 c15716;
        int i4;
        String text;
        String text2;
        AbstractC22433 abstractC22433Mo29543;
        ?? r7;
        String str4 = str;
        str.getClass();
        this.f1319 = str4;
        m1248(AbstractC22433.m49799(C17080.m39861(str)));
        AbstractC23844 abstractC23844Of = AbstractC23844.of();
        C6204 c6204 = new C6204();
        c6204.mo14318((Iterable) abstractC23844Of);
        c6204.mo13308((Object) EnumC0573.f2441);
        AbstractC23844 abstractC23844Mo14317 = c6204.mo14317();
        C12343 c12343 = new C12343();
        C14770.m35395(c12343).m35401("--enable-preview", "true");
        int i5 = 0;
        c12343.m30657(InterfaceC13464.class, new C14315(c12343, false, StandardCharsets.UTF_8));
        c12343.m30657(InterfaceC9810.class, new C2047());
        C20414 c20414M46161 = C20414.m46161(c12343);
        c20414M46161.m48202(new C20654(URI.create("Source.java"), EnumC11347.SOURCE, str4));
        C9126 c9126 = new C9126(c20414M46161, null);
        C18213 c18213M42339 = C18213.m42339(c12343);
        char[] charArray = str4.concat("\n//EOF").toCharArray();
        C8929 c8929 = new C8929(c18213M42339, charArray, charArray.length);
        C19512 c19512 = new C19512(c18213M42339, c8929);
        C4793 c4793 = new C4793();
        int length2 = str.length();
        int length3 = 0;
        while (true) {
            c19512.m48505();
            C20330 c20330M48507 = c19512.m48507(i5);
            C21825 c21825 = c20330M48507.f65848;
            i = c20330M48507.f65850;
            int i6 = c20330M48507.f65847;
            EnumC0573 enumC0573 = c20330M48507.f65849;
            if (c21825 != null) {
                final HashMap mapM23218 = c8929.m23218();
                C21825 c21826 = c20330M48507.f65848;
                if (c21826 == null) {
                    abstractC22433Mo29543 = AbstractC22433.of();
                } else {
                    InterfaceC5046 interfaceC5046Stream = C9030.stream(c21826);
                    C13638.requireNonNull(mapM23218);
                    abstractC22433Mo29543 = ((AbstractC22433) interfaceC5046Stream.map(new Function() { // from class: l.۠ܰ᩸
                        @Override // java.util.function.Function
                        /* JADX INFO: renamed from: andThen */
                        public /* synthetic */ Function mo33696andThen(Function function) {
                            return C4277.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (C10340) mapM23218.get((InterfaceC9042) obj);
                        }

                        @Override // java.util.function.Function
                        public /* synthetic */ Function compose(Function function) {
                            return C4277.$default$compose(this, function);
                        }
                    }).collect(AbstractC22433.m49795())).mo29543();
                    i5 = 0;
                }
                AbstractC16706 abstractC16706ListIterator = abstractC22433Mo29543.listIterator(i5);
                while (abstractC16706ListIterator.hasNext()) {
                    C10340 c10340 = (C10340) abstractC16706ListIterator.next();
                    if (length3 < c10340.m26243()) {
                        r7 = 0;
                        c4793.m52163(new C7517(null, null, length3, c10340.m26243()));
                    } else {
                        r7 = 0;
                    }
                    c4793.m52163(new C7517(r7, r7, c10340.m26243(), c10340.m26244().length() + c10340.m26243()));
                    length3 = c10340.m26244().length() + c10340.m26243();
                    abstractC16706ListIterator = abstractC16706ListIterator;
                    c8929 = c8929;
                }
            }
            C8929 c89210 = c8929;
            if (abstractC23844Mo14317.contains(enumC0573)) {
                i = length3;
                if (enumC0573 == EnumC0573.f2441) {
                    break;
                }
                length2 = i6;
                break;
            }
            if (length3 < i6) {
                c4793.m52163(new C7517(null, null, length3, i6));
            }
            c4793.m52163(new C7517(enumC0573 == EnumC0573.f2431 ? "\"" + c20330M48507.mo45897() + "\"" : null, enumC0573, i6, i));
            if (c19512.m48507(0).f65849 == EnumC0573.f2441) {
                break;
            }
            i5 = 0;
            str4 = str;
            length3 = i;
            c8929 = c89210;
        }
        if (i < length2) {
            c4793.m52163(new C7517(null, null, i, length2));
        }
        AbstractC22433 abstractC22433M13309 = c4793.m13309();
        if (C9030.stream(c9126.m23454()).anyMatch(new C16173(2))) {
            abstractC22433CopyOf = AbstractC22433.of((Object) new C15716(0, "", "", 0, 0, true, null));
        } else {
            ArrayList arrayList = new ArrayList();
            AbstractC16706 abstractC16706ListIterator2 = abstractC22433M13309.listIterator(0);
            int length4 = 0;
            int iM1418 = 0;
            int i7 = 0;
            while (abstractC16706ListIterator2.hasNext()) {
                C7517 c7517 = (C7517) abstractC16706ListIterator2.next();
                if (abstractC23844Mo14317.contains(c7517.m20029())) {
                    break;
                }
                String strSubstring = str4.substring(c7517.m20028(), c7517.m20027());
                String strM20026 = c7517.m20029() == EnumC0573.f2431 ? c7517.m20026() : strSubstring;
                char cCharAt = strM20026.charAt(0);
                ArrayList<String> arrayList2 = new ArrayList();
                if (Character.isWhitespace(cCharAt)) {
                    Iterator itM39861 = C17080.m39861(strSubstring);
                    while (itM39861.hasNext()) {
                        String str5 = (String) itM39861.next();
                        String strM39864 = C17080.m39863(str5);
                        if (strM39864 != null) {
                            abstractC23845 = abstractC23844Mo14317;
                            String strSubstring2 = str5.substring(0, str5.length() - strM39864.length());
                            if (!strSubstring2.isEmpty()) {
                                arrayList2.add(strSubstring2);
                            }
                            arrayList2.add(strM39864);
                        } else {
                            abstractC23845 = abstractC23844Mo14317;
                            if (!str5.isEmpty()) {
                                arrayList2.add(str5);
                            }
                        }
                        abstractC23844Mo14317 = abstractC23845;
                    }
                    abstractC23844 = abstractC23844Mo14317;
                    z = false;
                    str2 = null;
                } else {
                    abstractC23844 = abstractC23844Mo14317;
                    if (strM20026.startsWith("'") || strM20026.startsWith("\"")) {
                        arrayList2.add(strSubstring);
                    } else if (strM20026.startsWith("//") || strM20026.startsWith("/*")) {
                        if (strM20026.startsWith("//") && (strSubstring.endsWith("\n") || strSubstring.endsWith("\r"))) {
                            strM39863 = C17080.m39863(strSubstring);
                            strM20026 = strM20026.substring(0, strM20026.length() - strM39863.length());
                            strSubstring = strSubstring.substring(0, strSubstring.length() - strM39863.length());
                        } else {
                            strM39863 = null;
                        }
                        str2 = strM39863;
                        arrayList2.add(strSubstring);
                        z = true;
                    } else if (Character.isJavaIdentifierStart(cCharAt) || Character.isDigit(cCharAt) || (cCharAt == '.' && strM20026.length() > 1 && Character.isDigit(strM20026.charAt(1)))) {
                        arrayList2.add(strM20026);
                    } else {
                        for (char c : strM20026.toCharArray()) {
                            arrayList2.add(String.valueOf(c));
                        }
                    }
                    z = true;
                    str2 = null;
                    str3 = strM20026;
                    z2 = true;
                    if (arrayList2.size() == 1) {
                        if (z) {
                            i3 = i7;
                            i7++;
                        } else {
                            i3 = -1;
                        }
                        arrayList.add(new C15716(i3, strSubstring, str3, length4, iM1418, z2, c7517.m20029()));
                        length = strSubstring.length() + length4;
                        iM1417 = m1417(iM1418, strSubstring);
                    } else {
                        if (arrayList2.size() == 1 && !str3.equals(strSubstring)) {
                            throw new C18537("Unicode escapes not allowed in whitespace or multi-character operators");
                        }
                        for (String str6 : arrayList2) {
                            if (z) {
                                i2 = i7;
                                i7++;
                            } else {
                                i2 = -1;
                            }
                            arrayList.add(new C15716(i2, str6, str6, length4, iM1418, z2, null));
                            length4 += str6.length();
                            iM1418 = m1417(iM1418, strSubstring);
                        }
                        length = length4;
                        iM1417 = iM1418;
                    }
                    if (str2 != null) {
                        arrayList.add(new C15716(-1, str2, str2, length, iM1417, false, null));
                        length4 = str2.length() + length;
                        iM1418 = 0;
                    } else {
                        length4 = length;
                        iM1418 = iM1417;
                    }
                    str4 = str;
                    abstractC23844Mo14317 = abstractC23844;
                }
                str3 = strM20026;
                z2 = false;
                if (arrayList2.size() == 1) {
                    if (z) {
                        i3 = i7;
                        i7++;
                    } else {
                        i3 = -1;
                    }
                    arrayList.add(new C15716(i3, strSubstring, str3, length4, iM1418, z2, c7517.m20029()));
                    length = strSubstring.length() + length4;
                    iM1417 = m1417(iM1418, strSubstring);
                } else {
                    if (arrayList2.size() == 1) {
                    }
                    while (r5.hasNext()) {
                        if (z) {
                            i2 = i7;
                            i7++;
                        } else {
                            i2 = -1;
                        }
                        arrayList.add(new C15716(i2, str6, str6, length4, iM1418, z2, null));
                        length4 += str6.length();
                        iM1418 = m1417(iM1418, strSubstring);
                    }
                    length = length4;
                    iM1417 = iM1418;
                }
                if (str2 != null) {
                    arrayList.add(new C15716(-1, str2, str2, length, iM1417, false, null));
                    length4 = str2.length() + length;
                    iM1418 = 0;
                } else {
                    length4 = length;
                    iM1418 = iM1417;
                }
                str4 = str;
                abstractC23844Mo14317 = abstractC23844;
            }
            arrayList.add(new C15716(i7, "", "", length4, iM1418, true, null));
            abstractC22433CopyOf = AbstractC22433.copyOf((Collection) arrayList);
        }
        this.f1317 = ((C15716) C22808.m50475(abstractC22433CopyOf)).getIndex();
        m1246(abstractC22433CopyOf);
        C13261 c13261M18530 = AbstractC6910.m18530();
        for (C15716 c15717 : abstractC22433CopyOf) {
            c13261M18530.mo32741(Integer.valueOf(c15717.getPosition()), Integer.valueOf(c15717.m37425()));
        }
        c13261M18530.mo32742();
        int i8 = AbstractC22433.f73217;
        C4793 c4794 = new C4793();
        int size = abstractC22433CopyOf.size();
        C4793 c4795 = new C4793();
        int i9 = 0;
        while (i9 < size) {
            while (!((C15716) abstractC22433CopyOf.get(i9)).m37431()) {
                int i10 = i9 + 1;
                C15716 c15718 = (C15716) abstractC22433CopyOf.get(i9);
                c4795.m52163(c15718);
                if (c15718.mo37430() && c15718.getText().matches("\\/\\*[A-Za-z0-9\\s_\\-]+=\\s*\\*\\/")) {
                    while (((C15716) abstractC22433CopyOf.get(i10)).mo37433()) {
                        i10++;
                    }
                }
                i9 = i10;
            }
            int i11 = i9 + 1;
            C15716 c15719 = (C15716) abstractC22433CopyOf.get(i9);
            C4793 c4796 = new C4793();
            while (true) {
                if (i11 < size && !((C15716) abstractC22433CopyOf.get(i11)).m37431()) {
                    if (((C15716) abstractC22433CopyOf.get(i11)).mo37430()) {
                        String text3 = c15719.getText();
                        text3.getClass();
                        switch (text3) {
                            case "(":
                            case ".":
                            case "<":
                                break;
                            default:
                                if (!((C15716) abstractC22433CopyOf.get(i11)).mo37432()) {
                                    c15716 = (C15716) abstractC22433CopyOf.get(i11);
                                    if (!c15716.mo37430()) {
                                    }
                                    i4 = i11 + 1;
                                    C15716 c157110 = (C15716) abstractC22433CopyOf.get(i11);
                                    c4796.m52163(c157110);
                                    text = c157110.getText();
                                    int i12 = C17080.f54498;
                                    if (AbstractC14384.m34620().mo27206(text)) {
                                        i11 = i4;
                                    } else {
                                        i11 = i4;
                                    }
                                    break;
                                } else {
                                    text2 = c15719.getText();
                                    text2.getClass();
                                    if (!text2.equals(l.b)) {
                                        c15716 = (C15716) abstractC22433CopyOf.get(i11);
                                        if (!c15716.mo37430() && c15716.getText().matches("\\/\\*[A-Za-z0-9\\s_\\-]+=\\s*\\*\\/")) {
                                            c4794.m52163(new C19949(c4795.m13309(), c15719, c4796.m13309()));
                                            c4795 = new C4793();
                                            i9 = i11 + 1;
                                            c4795.m52163((C15716) abstractC22433CopyOf.get(i11));
                                            while (((C15716) abstractC22433CopyOf.get(i9)).mo37433()) {
                                                i9++;
                                            }
                                        }
                                        i4 = i11 + 1;
                                        C15716 c157111 = (C15716) abstractC22433CopyOf.get(i11);
                                        c4796.m52163(c157111);
                                        text = c157111.getText();
                                        int i13 = C17080.f54498;
                                        if (AbstractC14384.m34620().mo27206(text)) {
                                            i11 = i4;
                                        } else {
                                            i11 = i4;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                        }
                    } else if (!((C15716) abstractC22433CopyOf.get(i11)).mo37432()) {
                        text2 = c15719.getText();
                        text2.getClass();
                        if (!text2.equals(l.b)) {
                            c15716 = (C15716) abstractC22433CopyOf.get(i11);
                            if (!c15716.mo37430()) {
                            }
                            i4 = i11 + 1;
                            C15716 c157112 = (C15716) abstractC22433CopyOf.get(i11);
                            c4796.m52163(c157112);
                            text = c157112.getText();
                            int i14 = C17080.f54498;
                            if (AbstractC14384.m34620().mo27206(text)) {
                                i11 = i4;
                            } else {
                                i11 = i4;
                            }
                        }
                    } else {
                        c15716 = (C15716) abstractC22433CopyOf.get(i11);
                        if (!c15716.mo37430()) {
                        }
                        i4 = i11 + 1;
                        C15716 c157113 = (C15716) abstractC22433CopyOf.get(i11);
                        c4796.m52163(c157113);
                        text = c157113.getText();
                        int i15 = C17080.f54498;
                        if (AbstractC14384.m34620().mo27206(text)) {
                            i11 = i4;
                        } else {
                            i11 = i4;
                        }
                    }
                }
                c4794.m52163(new C19949(c4795.m13309(), c15719, c4796.m13309()));
                c4795 = new C4793();
                i9 = i11;
                break;
            }
        }
        AbstractC22433 abstractC22433M133010 = c4794.m13309();
        this.f1316 = abstractC22433M133010;
        int i16 = C0559.f2335;
        C16083 c16083 = new C16083();
        AbstractC16706 abstractC16706ListIterator3 = abstractC22433M133010.listIterator(0);
        while (abstractC16706ListIterator3.hasNext()) {
            C19949 c19949 = (C19949) abstractC16706ListIterator3.next();
            InterfaceC20608 interfaceC20608M43373 = C18806.m43373(c19949);
            int position = interfaceC20608M43373.getPosition();
            if (!interfaceC20608M43373.getText().isEmpty()) {
                position += interfaceC20608M43373.length() - 1;
            }
            c16083.m38111(C9548.m24395(Integer.valueOf(C18806.m43374(c19949).getPosition()), Integer.valueOf(position)), c19949);
        }
        this.f1315 = c16083.m38110();
        this.f1320 = new C19949[this.f1317 + 1];
        int i17 = 0;
        AbstractC16706 abstractC16706ListIterator4 = this.f1316.listIterator(0);
        while (abstractC16706ListIterator4.hasNext()) {
            C19949 c199410 = (C19949) abstractC16706ListIterator4.next();
            AbstractC16706 abstractC16706ListIterator5 = c199410.mo37337().listIterator(i17);
            while (abstractC16706ListIterator5.hasNext()) {
                InterfaceC20608 interfaceC20608 = (InterfaceC20608) abstractC16706ListIterator5.next();
                if (interfaceC20608.getIndex() >= 0) {
                    this.f1320[interfaceC20608.getIndex()] = c199410;
                }
            }
            this.f1320[c199410.mo37335().getIndex()] = c199410;
            AbstractC16706 abstractC16706ListIterator6 = c199410.mo37336().listIterator(0);
            while (abstractC16706ListIterator6.hasNext()) {
                InterfaceC20608 interfaceC20609 = (InterfaceC20608) abstractC16706ListIterator6.next();
                if (interfaceC20609.getIndex() >= 0) {
                    this.f1320[interfaceC20609.getIndex()] = c199410;
                }
            }
            i17 = 0;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m1425() {
        return this.f1319;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m1417(int i, String str) {
        Object next;
        Iterator itM39864 = C17080.m39864(str);
        do {
            next = itM39864.next();
        } while (itM39864.hasNext());
        Integer num = (Integer) next;
        if (num.intValue() > 0) {
            return str.length() - num.intValue();
        }
        return str.length() + i;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m1422() {
        return this.f1317;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 m1423(int i) {
        return this.f1320[i];
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 m1419() {
        return this.f1316;
    }

    @Override // l.AbstractC19903
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0559 mo1426() {
        return this.f1315;
    }

    @Override // l.AbstractC19903, l.AbstractC0146
    public final String toString() {
        C23244 c23244M37072 = C15483.m37072(this);
        c23244M37072.m51284(this.f1316, "tokens");
        c23244M37072.m51284((Object) super.toString(), "super");
        return c23244M37072.toString();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m1418(int i) {
        C10164 c10164 = this.f1318;
        Object[] objArr = new Object[0];
        if (c10164 == null) {
            throw new C5458(C11249.m28221("Expected compilation unit to be set.", objArr));
        }
        return c10164.f34726.mo10209(i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m1424(int i) {
        C10164 c10164 = this.f1318;
        Object[] objArr = new Object[0];
        if (c10164 == null) {
            throw new C5458(C11249.m28221("Expected compilation unit to be set.", objArr));
        }
        return c10164.f34726.mo10211(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1421(C10164 c10164) {
        this.f1318 = c10164;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20234 m1420(Collection collection) throws C18537 {
        C9548 c9548M24401;
        C20234 c20234M45738 = C20234.m45738();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C9548 c9548M24403 = ((C9548) it.next()).m24403(AbstractC8177.m21475());
            int iIntValue = ((Integer) c9548M24403.m24407()).intValue();
            String str = this.f1319;
            if (iIntValue > str.length()) {
                throw new C18537(String.format("error: invalid offset (%d) or length (%d); offset + length (%d) > file length (%d)", c9548M24403.m24409(), Integer.valueOf(((Integer) c9548M24403.m24407()).intValue() - ((Integer) c9548M24403.m24409()).intValue()), c9548M24403.m24407(), Integer.valueOf(str.length())));
            }
            if (c9548M24403.m24404()) {
                c9548M24403 = C9548.m24401((Integer) c9548M24403.m24409(), Integer.valueOf(((Integer) c9548M24403.m24409()).intValue() + 1));
            }
            AbstractC1826 abstractC1826Values = this.f1315.mo2655(c9548M24403).mo2654().values();
            if (abstractC1826Values.isEmpty()) {
                c9548M24401 = AbstractC0146.f1197;
            } else {
                c9548M24401 = C9548.m24401(Integer.valueOf(((C19949) abstractC1826Values.iterator().next()).mo37335().getIndex()), Integer.valueOf(((C19949) C22808.m50475(abstractC1826Values)).mo37335().getIndex() + 1));
            }
            c20234M45738.mo26252(c9548M24401);
        }
        return c20234M45738;
    }
}
