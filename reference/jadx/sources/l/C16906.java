package l;

/* JADX INFO: renamed from: l.ܺܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95X4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16906 extends C15634 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f55289;

    public C16906(boolean[] zArr) {
        this.f55289 = zArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:70:0x0109  */
    /* JADX WARN: Code duplicated, block: B:82:0x0128  */
    @Override // l.C15634
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo37386(AbstractC11071 abstractC11071) {
        String str;
        EnumC22260 enumC22260 = abstractC11071.f34921;
        EnumC22260 enumC22261 = EnumC22260.CHECK_CAST;
        if (enumC22260 == enumC22261) {
            C1465 c1465 = (C1465) abstractC11071;
            AbstractC11071 abstractC11072 = c1465.f24464;
            if (abstractC11072.f34921 == enumC22261) {
                C1465 c1466 = (C1465) abstractC11072;
                if (c1465.f5117.equals(c1466.f5117)) {
                    abstractC11071 = c1466;
                }
            }
        }
        super.mo37386(abstractC11071);
        if (abstractC11071.f34921 == enumC22261) {
            C1465 c1467 = (C1465) abstractC11071;
            String str2 = c1467.f5117;
            if (str2.charAt(0) == '[') {
                AbstractC11071 abstractC11073 = c1467.f24464;
                if (abstractC11073.f34921 == EnumC22260.INVOKE_STATIC) {
                    C6686 c6686 = (C6686) abstractC11073;
                    C3177 c3177 = c6686.f22277;
                    if (c3177.m10374().equals("newInstance") && c3177.m10371().equals("Ljava/lang/reflect/Array;")) {
                        if (c3177.m10375().length == 2 && c3177.m10375()[0].equals("Ljava/lang/Class;")) {
                            AbstractC11071 abstractC11074 = c6686.f17809[0];
                            EnumC22260 enumC22262 = abstractC11074.f34921;
                            if (enumC22262 == EnumC22260.CONSTANT) {
                                str = ((C15855) ((C16380) abstractC11074).f53172).f51558;
                            } else if (enumC22262 == EnumC22260.STATIC_FIELD) {
                                C19364 c19364 = (C19364) abstractC11074;
                                String str3 = c19364.f62555;
                                if (str3.startsWith("Ljava/lang/") && c19364.f62553.equals("TYPE")) {
                                    switch (str3) {
                                        case "Ljava/lang/Integer;":
                                            str = "I";
                                            break;
                                        case "Ljava/lang/Boolean;":
                                            str = "Z";
                                            break;
                                        case "Ljava/lang/Double;":
                                            str = "D";
                                            break;
                                        case "Ljava/lang/Character;":
                                            str = "C";
                                            break;
                                        case "Ljava/lang/Float;":
                                            str = "F";
                                            break;
                                        case "Ljava/lang/Byte;":
                                            str = "B";
                                            break;
                                        case "Ljava/lang/Long;":
                                            str = "J";
                                            break;
                                        case "Ljava/lang/Void;":
                                            str = "V";
                                            break;
                                        case "Ljava/lang/Short;":
                                            str = "S";
                                            break;
                                        default:
                                            str = null;
                                            break;
                                    }
                                } else {
                                    str = null;
                                }
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                AbstractC11071 abstractC11075 = c6686.f17809[1];
                                boolean zEquals = c3177.m10375()[1].equals("I");
                                boolean[] zArr = this.f55289;
                                if (zEquals) {
                                    if (str2.equals("[".concat(str))) {
                                        int i = 0;
                                        while (str.charAt(i) == '[') {
                                            i++;
                                        }
                                        zArr[0] = true;
                                        return i > 0 ? new C21602(str.substring(i), i + 1, new AbstractC11071[]{abstractC11075}) : new C1465(EnumC22260.NEW_ARRAY, abstractC11075, str);
                                    }
                                } else if (abstractC11075.f34921 == EnumC22260.FILLED_ARRAY) {
                                    C20856 c20856 = (C20856) abstractC11075;
                                    int length = c20856.f17809.length;
                                    if (str2.length() > length && str2.substring(length).equals(str)) {
                                        int i2 = 0;
                                        while (str.charAt(i2) == '[') {
                                            i2++;
                                        }
                                        zArr[0] = true;
                                        return new C21602(str.substring(i2), i2 + length, c20856.f17809);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return abstractC11071;
    }
}
