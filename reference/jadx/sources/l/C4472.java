package l;

import com.alipay.sdk.m.y.l;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۘ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C4472 extends AbstractC6490 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f15988;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f15989;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C19113 f15990;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C7894 f15991;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C24610[] f15992;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f15993;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:102:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:103:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:105:0x0321  */
    /* JADX WARN: Code duplicated, block: B:115:0x0342  */
    /* JADX WARN: Code duplicated, block: B:117:0x034c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0352  */
    /* JADX WARN: Code duplicated, block: B:122:0x0378  */
    /* JADX WARN: Code duplicated, block: B:123:0x0397  */
    /* JADX WARN: Code duplicated, block: B:163:0x0494  */
    /* JADX WARN: Code duplicated, block: B:165:0x0498  */
    /* JADX WARN: Code duplicated, block: B:167:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:169:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:171:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:180:0x0515 A[LOOP:6: B:143:0x044a->B:180:0x0515, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x0518 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0513 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.String, l.ۜ᩺ۘ] */
    /* JADX WARN: Type inference failed for: r7v17 */
    public C4472(String str) throws C25356 {
        int i;
        AbstractC1928<C6710> abstractC1928CopyOf;
        AbstractC8639 abstractC8639;
        boolean z;
        boolean z2;
        String strM48702;
        boolean z3;
        String str2;
        String str3;
        boolean z4;
        String str4;
        int iM14164;
        int length;
        int i2;
        int i3;
        AbstractC8639 abstractC86310;
        C6710 c6710;
        int i4;
        String text;
        String text2;
        AbstractC1928 abstractC1928Mo6620;
        ?? r7;
        String str5 = str;
        str.getClass();
        this.f15989 = str5;
        m54504(AbstractC1928.m6614(C21406.m48706(str)));
        AbstractC8639 abstractC8639Of = AbstractC8639.of();
        C9384 c9384 = new C9384();
        c9384.mo19803((Iterable) abstractC8639Of);
        c9384.mo24710((Object) EnumC7466.f24635);
        AbstractC8639 abstractC8639Mo24709 = c9384.mo24709();
        C4747 c4747 = new C4747();
        C13015.m32421(c4747).m32426("--enable-preview", "true");
        int i5 = 0;
        c4747.m14644(InterfaceC16722.class, new C2026(c4747, false, StandardCharsets.UTF_8));
        c4747.m14644(InterfaceC1807.class, new C5536());
        C7312 c7312M20023 = C7312.m20023(c4747);
        c7312M20023.m34530(new C12675(URI.create("Source.java"), EnumC17468.SOURCE, str5));
        C10294 c10294 = new C10294(c7312M20023, null);
        C21637 c21637M49171 = C21637.m49171(c4747);
        char[] charArray = str5.concat("\n//EOF").toCharArray();
        C17305 c17305 = new C17305(c21637M49171, charArray, charArray.length);
        C16559 c16559 = new C16559(c21637M49171, c17305);
        C22811 c22811 = new C22811();
        int length2 = str.length();
        int length3 = 0;
        while (true) {
            c16559.m35902();
            C8957 c8957M35905 = c16559.m35905(i5);
            C14769 c14769 = c8957M35905.f29211;
            i = c8957M35905.f29213;
            int i6 = c8957M35905.f29214;
            EnumC7466 enumC7466 = c8957M35905.f29212;
            if (c14769 != null) {
                final HashMap mapM40630 = c17305.m40630();
                C14769 c147610 = c8957M35905.f29211;
                if (c147610 == null) {
                    abstractC1928Mo6620 = AbstractC1928.of();
                } else {
                    InterfaceC20670 interfaceC20670Stream = C1170.stream(c147610);
                    C17359.requireNonNull(mapM40630);
                    abstractC1928Mo6620 = ((AbstractC1928) interfaceC20670Stream.map(new Function() { // from class: l.᩻ۗܽ
                        @Override // java.util.function.Function
                        /* JADX INFO: renamed from: andThen */
                        public /* synthetic */ Function mo10608andThen(Function function) {
                            return C24247.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (C15813) mapM40630.get((InterfaceC19399) obj);
                        }

                        @Override // java.util.function.Function
                        public /* synthetic */ Function compose(Function function) {
                            return C24247.$default$compose(this, function);
                        }
                    }).collect(AbstractC1928.m6611())).mo6620();
                    i5 = 0;
                }
                AbstractC14956 abstractC14956ListIterator = abstractC1928Mo6620.listIterator(i5);
                while (abstractC14956ListIterator.hasNext()) {
                    C15813 c15813 = (C15813) abstractC14956ListIterator.next();
                    if (length3 < c15813.m37739()) {
                        r7 = 0;
                        c22811.m19807(new C23273(null, null, length3, c15813.m37739()));
                    } else {
                        r7 = 0;
                    }
                    c22811.m19807(new C23273(r7, r7, c15813.m37739(), c15813.m37740().length() + c15813.m37739()));
                    length3 = c15813.m37740().length() + c15813.m37739();
                    abstractC14956ListIterator = abstractC14956ListIterator;
                    c17305 = c17305;
                }
            }
            C17305 c17306 = c17305;
            if (abstractC8639Mo24709.contains(enumC7466)) {
                i = length3;
                if (enumC7466 == EnumC7466.f24635) {
                    break;
                }
                length2 = i6;
                break;
            }
            if (length3 < i6) {
                c22811.m19807(new C23273(null, null, length3, i6));
            }
            c22811.m19807(new C23273(enumC7466 == EnumC7466.f24628 ? "\"" + c8957M35905.mo23943() + "\"" : null, enumC7466, i6, i));
            if (c16559.m35905(0).f29212 == EnumC7466.f24635) {
                break;
            }
            i5 = 0;
            str5 = str;
            length3 = i;
            c17305 = c17306;
        }
        if (i < length2) {
            c22811.m19807(new C23273(null, null, i, length2));
        }
        AbstractC1928 abstractC1928M51441 = c22811.m51441();
        if (C1170.stream(c10294.m26550()).anyMatch(new C20880())) {
            abstractC1928CopyOf = AbstractC1928.of((Object) new C6710(0, "", "", 0, 0, true, null));
        } else {
            ArrayList arrayList = new ArrayList();
            int iM14165 = 0;
            AbstractC14956 abstractC14956ListIterator2 = abstractC1928M51441.listIterator(0);
            int length4 = 0;
            int i7 = 0;
            while (abstractC14956ListIterator2.hasNext()) {
                C23273 c23273 = (C23273) abstractC14956ListIterator2.next();
                if (abstractC8639Mo24709.contains(c23273.m52386())) {
                    break;
                }
                String strSubstring = str5.substring(c23273.m52385(), c23273.m52384());
                String strM52387 = c23273.m52386() == EnumC7466.f24628 ? c23273.m52387() : strSubstring;
                char cCharAt = strM52387.charAt(0);
                ArrayList<String> arrayList2 = new ArrayList();
                if (Character.isWhitespace(cCharAt)) {
                    Iterator itM48706 = C21406.m48706(strSubstring);
                    while (itM48706.hasNext()) {
                        String str6 = (String) itM48706.next();
                        String strM48703 = C21406.m48702(str6);
                        if (strM48703 != null) {
                            abstractC86310 = abstractC8639Mo24709;
                            String strSubstring2 = str6.substring(0, str6.length() - strM48703.length());
                            if (!strSubstring2.isEmpty()) {
                                arrayList2.add(strSubstring2);
                            }
                            arrayList2.add(strM48703);
                        } else {
                            abstractC86310 = abstractC8639Mo24709;
                            if (!str6.isEmpty()) {
                                arrayList2.add(str6);
                            }
                        }
                        abstractC8639Mo24709 = abstractC86310;
                    }
                    abstractC8639 = abstractC8639Mo24709;
                    z = false;
                    z2 = false;
                } else {
                    abstractC8639 = abstractC8639Mo24709;
                    if (strM52387.startsWith("'") || strM52387.startsWith("\"")) {
                        arrayList2.add(strSubstring);
                    } else {
                        if (strM52387.startsWith("//") || strM52387.startsWith("/*")) {
                            if (strM52387.startsWith("//") && (strSubstring.endsWith("\n") || strSubstring.endsWith("\r"))) {
                                strM48702 = C21406.m48702(strSubstring);
                                strM52387 = strM52387.substring(0, strM52387.length() - strM48702.length());
                                strSubstring = strSubstring.substring(0, strSubstring.length() - strM48702.length());
                            } else {
                                strM48702 = null;
                            }
                            arrayList2.add(strSubstring);
                            z3 = true;
                            str2 = strSubstring;
                            str3 = strM52387;
                            z4 = false;
                        } else if (Character.isJavaIdentifierStart(cCharAt) || Character.isDigit(cCharAt) || (cCharAt == '.' && strM52387.length() > 1 && Character.isDigit(strM52387.charAt(1)))) {
                            arrayList2.add(strM52387);
                        } else {
                            for (char c : strM52387.toCharArray()) {
                                arrayList2.add(String.valueOf(c));
                            }
                        }
                        if (arrayList2.size() == 1) {
                            if (z3) {
                                i3 = i7 + 1;
                            } else {
                                i3 = i7;
                                i7 = -1;
                            }
                            int i8 = i3;
                            String str7 = str2;
                            arrayList.add(new C6710(i7, str2, str3, length4, iM14165, z4, c23273.m52386()));
                            length = str7.length() + length4;
                            iM14164 = m14164(iM14165, str7);
                            i7 = i8;
                        } else {
                            str4 = str2;
                            if (arrayList2.size() == 1 && !str3.equals(str4)) {
                                throw new C25356("Unicode escapes not allowed in whitespace or multi-character operators");
                            }
                            for (String str8 : arrayList2) {
                                if (z3) {
                                    i2 = i7;
                                    i7++;
                                } else {
                                    i2 = -1;
                                }
                                arrayList.add(new C6710(i2, str8, str8, length4, iM14165, z4, null));
                                length4 += str8.length();
                                iM14165 = m14164(iM14165, str4);
                            }
                            iM14164 = iM14165;
                            length = length4;
                        }
                        if (strM48702 != null) {
                            arrayList.add(new C6710(-1, strM48702, strM48702, length, iM14164, false, null));
                            length4 = strM48702.length() + length;
                            iM14165 = 0;
                        } else {
                            length4 = length;
                            iM14165 = iM14164;
                        }
                        str5 = str;
                        abstractC8639Mo24709 = abstractC8639;
                    }
                    z = true;
                    z2 = true;
                }
                z4 = z2;
                str2 = strSubstring;
                z3 = z;
                strM48702 = null;
                str3 = strM52387;
                if (arrayList2.size() == 1) {
                    if (z3) {
                        i3 = i7 + 1;
                    } else {
                        i3 = i7;
                        i7 = -1;
                    }
                    int i9 = i3;
                    String str9 = str2;
                    arrayList.add(new C6710(i7, str2, str3, length4, iM14165, z4, c23273.m52386()));
                    length = str9.length() + length4;
                    iM14164 = m14164(iM14165, str9);
                    i7 = i9;
                } else {
                    str4 = str2;
                    if (arrayList2.size() == 1) {
                    }
                    while (r6.hasNext()) {
                        if (z3) {
                            i2 = i7;
                            i7++;
                        } else {
                            i2 = -1;
                        }
                        arrayList.add(new C6710(i2, str8, str8, length4, iM14165, z4, null));
                        length4 += str8.length();
                        iM14165 = m14164(iM14165, str4);
                    }
                    iM14164 = iM14165;
                    length = length4;
                }
                if (strM48702 != null) {
                    arrayList.add(new C6710(-1, strM48702, strM48702, length, iM14164, false, null));
                    length4 = strM48702.length() + length;
                    iM14165 = 0;
                } else {
                    length4 = length;
                    iM14165 = iM14164;
                }
                str5 = str;
                abstractC8639Mo24709 = abstractC8639;
            }
            arrayList.add(new C6710(i7, "", "", length4, iM14165, true, null));
            abstractC1928CopyOf = AbstractC1928.copyOf((Collection) arrayList);
        }
        this.f15993 = ((C6710) C16625.m39339(abstractC1928CopyOf)).getIndex();
        m54502(abstractC1928CopyOf);
        C25049 c25049M41247 = AbstractC17589.m41247();
        for (C6710 c6711 : abstractC1928CopyOf) {
            c25049M41247.mo14569(Integer.valueOf(c6711.getPosition()), Integer.valueOf(c6711.m18729()));
        }
        c25049M41247.mo14570();
        int i10 = AbstractC1928.f6477;
        C22811 c22812 = new C22811();
        int size = abstractC1928CopyOf.size();
        C22811 c22813 = new C22811();
        int i11 = 0;
        while (i11 < size) {
            while (!((C6710) abstractC1928CopyOf.get(i11)).m18727()) {
                int i12 = i11 + 1;
                C6710 c6712 = (C6710) abstractC1928CopyOf.get(i11);
                c22813.m19807(c6712);
                if (c6712.mo18728() && c6712.getText().matches("\\/\\*[A-Za-z0-9\\s_\\-]+=\\s*\\*\\/")) {
                    while (((C6710) abstractC1928CopyOf.get(i12)).mo18730()) {
                        i12++;
                    }
                }
                i11 = i12;
            }
            int i13 = i11 + 1;
            C6710 c6713 = (C6710) abstractC1928CopyOf.get(i11);
            C22811 c22814 = new C22811();
            while (true) {
                if (i13 < size && !((C6710) abstractC1928CopyOf.get(i13)).m18727()) {
                    if (((C6710) abstractC1928CopyOf.get(i13)).mo18728()) {
                        String text3 = c6713.getText();
                        text3.getClass();
                        switch (text3) {
                            case "(":
                            case ".":
                            case "<":
                                break;
                            default:
                                if (!((C6710) abstractC1928CopyOf.get(i13)).mo18732()) {
                                    c6710 = (C6710) abstractC1928CopyOf.get(i13);
                                    if (!c6710.mo18728()) {
                                    }
                                    i4 = i13 + 1;
                                    C6710 c6714 = (C6710) abstractC1928CopyOf.get(i13);
                                    c22814.m19807(c6714);
                                    text = c6714.getText();
                                    int i14 = C21406.f68189;
                                    if (AbstractC21825.m49481().mo23313(text)) {
                                        i13 = i4;
                                    } else {
                                        i13 = i4;
                                    }
                                    break;
                                } else {
                                    text2 = c6713.getText();
                                    text2.getClass();
                                    if (!text2.equals(l.b)) {
                                        c6710 = (C6710) abstractC1928CopyOf.get(i13);
                                        if (!c6710.mo18728() && c6710.getText().matches("\\/\\*[A-Za-z0-9\\s_\\-]+=\\s*\\*\\/")) {
                                            c22812.m19807(new C24610(c22813.m51441(), c6713, c22814.m51441()));
                                            c22813 = new C22811();
                                            i11 = i13 + 1;
                                            c22813.m19807((C6710) abstractC1928CopyOf.get(i13));
                                            while (((C6710) abstractC1928CopyOf.get(i11)).mo18730()) {
                                                i11++;
                                            }
                                        }
                                        i4 = i13 + 1;
                                        C6710 c6715 = (C6710) abstractC1928CopyOf.get(i13);
                                        c22814.m19807(c6715);
                                        text = c6715.getText();
                                        int i15 = C21406.f68189;
                                        if (AbstractC21825.m49481().mo23313(text)) {
                                            i13 = i4;
                                        } else {
                                            i13 = i4;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                        }
                    } else if (!((C6710) abstractC1928CopyOf.get(i13)).mo18732()) {
                        text2 = c6713.getText();
                        text2.getClass();
                        if (!text2.equals(l.b)) {
                            c6710 = (C6710) abstractC1928CopyOf.get(i13);
                            if (!c6710.mo18728()) {
                            }
                            i4 = i13 + 1;
                            C6710 c6716 = (C6710) abstractC1928CopyOf.get(i13);
                            c22814.m19807(c6716);
                            text = c6716.getText();
                            int i16 = C21406.f68189;
                            if (AbstractC21825.m49481().mo23313(text)) {
                                i13 = i4;
                            } else {
                                i13 = i4;
                            }
                        }
                    } else {
                        c6710 = (C6710) abstractC1928CopyOf.get(i13);
                        if (!c6710.mo18728()) {
                        }
                        i4 = i13 + 1;
                        C6710 c6717 = (C6710) abstractC1928CopyOf.get(i13);
                        c22814.m19807(c6717);
                        text = c6717.getText();
                        int i17 = C21406.f68189;
                        if (AbstractC21825.m49481().mo23313(text)) {
                            i13 = i4;
                        } else {
                            i13 = i4;
                        }
                    }
                }
                c22812.m19807(new C24610(c22813.m51441(), c6713, c22814.m51441()));
                c22813 = new C22811();
                i11 = i13;
                break;
            }
        }
        AbstractC1928 abstractC1928M51442 = c22812.m51441();
        this.f15988 = abstractC1928M51442;
        int i18 = C7894.f26241;
        C18335 c18335 = new C18335();
        AbstractC14956 abstractC14956ListIterator3 = abstractC1928M51442.listIterator(0);
        while (abstractC14956ListIterator3.hasNext()) {
            C24610 c24610 = (C24610) abstractC14956ListIterator3.next();
            InterfaceC20660 interfaceC20660M28627 = C11338.m28627(c24610);
            int position = interfaceC20660M28627.getPosition();
            if (!interfaceC20660M28627.getText().isEmpty()) {
                position += interfaceC20660M28627.length() - 1;
            }
            c18335.m42789(C2346.m7908(Integer.valueOf(C11338.m28628(c24610).getPosition()), Integer.valueOf(position)), c24610);
        }
        this.f15991 = c18335.m42788();
        this.f15992 = new C24610[this.f15993 + 1];
        int i19 = 0;
        AbstractC14956 abstractC14956ListIterator4 = this.f15988.listIterator(0);
        while (abstractC14956ListIterator4.hasNext()) {
            C24610 c24611 = (C24610) abstractC14956ListIterator4.next();
            AbstractC14956 abstractC14956ListIterator5 = c24611.mo30932().listIterator(i19);
            while (abstractC14956ListIterator5.hasNext()) {
                InterfaceC20660 interfaceC20660 = (InterfaceC20660) abstractC14956ListIterator5.next();
                if (interfaceC20660.getIndex() >= 0) {
                    this.f15992[interfaceC20660.getIndex()] = c24611;
                }
            }
            this.f15992[c24611.mo30930().getIndex()] = c24611;
            AbstractC14956 abstractC14956ListIterator6 = c24611.mo30931().listIterator(0);
            while (abstractC14956ListIterator6.hasNext()) {
                InterfaceC20660 interfaceC20661 = (InterfaceC20660) abstractC14956ListIterator6.next();
                if (interfaceC20661.getIndex() >= 0) {
                    this.f15992[interfaceC20661.getIndex()] = c24611;
                }
            }
            i19 = 0;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m14168() {
        return this.f15989;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m14164(int i, String str) {
        Object next;
        Iterator itM48704 = C21406.m48704(str);
        do {
            next = itM48704.next();
        } while (itM48704.hasNext());
        Integer num = (Integer) next;
        if (num.intValue() > 0) {
            return str.length() - num.intValue();
        }
        return str.length() + i;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m14169() {
        return this.f15993;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12455 m14170(int i) {
        return this.f15992[i];
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 m14173() {
        return this.f15988;
    }

    @Override // l.AbstractC6490
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7894 mo14171() {
        return this.f15991;
    }

    @Override // l.AbstractC6490, l.AbstractC24390
    public final String toString() {
        C3179 c3179M46714 = C20333.m46714(this);
        c3179M46714.m10379(this.f15988, "tokens");
        c3179M46714.m10379((Object) super.toString(), "super");
        return c3179M46714.toString();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m14172(int i) {
        C19113 c19113 = this.f15990;
        Object[] objArr = new Object[0];
        if (c19113 == null) {
            throw new C13377(C8399.m22571("Expected compilation unit to be set.", objArr));
        }
        return c19113.f61853.mo6321(i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m14167(int i) {
        C19113 c19113 = this.f15990;
        Object[] objArr = new Object[0];
        if (c19113 == null) {
            throw new C13377(C8399.m22571("Expected compilation unit to be set.", objArr));
        }
        return c19113.f61853.mo6322(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14166(C19113 c19113) {
        this.f15990 = c19113;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24654 m14165(Collection collection) throws C25356 {
        C2346 c2346M7914;
        C24654 c24654M55012 = C24654.m55012();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C2346 c2346M7916 = ((C2346) it.next()).m7916(AbstractC6468.m18293());
            int iIntValue = ((Integer) c2346M7916.m7920()).intValue();
            String str = this.f15989;
            if (iIntValue > str.length()) {
                throw new C25356(String.format("error: invalid offset (%d) or length (%d); offset + length (%d) > file length (%d)", c2346M7916.m7922(), Integer.valueOf(((Integer) c2346M7916.m7920()).intValue() - ((Integer) c2346M7916.m7922()).intValue()), c2346M7916.m7920(), Integer.valueOf(str.length())));
            }
            if (c2346M7916.m7917()) {
                c2346M7916 = C2346.m7914((Integer) c2346M7916.m7922(), Integer.valueOf(((Integer) c2346M7916.m7922()).intValue() + 1));
            }
            AbstractC4911 abstractC4911Values = this.f15991.mo21438(c2346M7916).mo21437().values();
            if (abstractC4911Values.isEmpty()) {
                c2346M7914 = AbstractC24390.f79112;
            } else {
                c2346M7914 = C2346.m7914(Integer.valueOf(((C24610) abstractC4911Values.iterator().next()).mo30930().getIndex()), Integer.valueOf(((C24610) C16625.m39339(abstractC4911Values)).mo30930().getIndex() + 1));
            }
            c24654M55012.mo12238(c2346M7914);
        }
        return c24654M55012;
    }
}
