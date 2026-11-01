package l;

/* JADX INFO: renamed from: l.ۧܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 95X4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11128 extends C0647 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f37763;

    public C11128(boolean[] zArr) {
        this.f37763 = zArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:70:0x0109  */
    /* JADX WARN: Code duplicated, block: B:82:0x0128  */
    @Override // l.C0647
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo2942(AbstractC7124 abstractC7124) {
        String str;
        EnumC9947 enumC9947 = abstractC7124.f23823;
        EnumC9947 enumC9948 = EnumC9947.CHECK_CAST;
        if (enumC9947 == enumC9948) {
            C14886 c14886 = (C14886) abstractC7124;
            AbstractC7124 abstractC7125 = c14886.f25764;
            if (abstractC7125.f23823 == enumC9948) {
                C14886 c14887 = (C14886) abstractC7125;
                if (c14886.f48643.equals(c14887.f48643)) {
                    abstractC7124 = c14887;
                }
            }
        }
        super.mo2942(abstractC7124);
        if (abstractC7124.f23823 == enumC9948) {
            C14886 c14888 = (C14886) abstractC7124;
            String str2 = c14888.f48643;
            if (str2.charAt(0) == '[') {
                AbstractC7124 abstractC7126 = c14888.f25764;
                if (abstractC7126.f23823 == EnumC9947.INVOKE_STATIC) {
                    C13475 c13475 = (C13475) abstractC7126;
                    C3097 c3097 = c13475.f44541;
                    if (c3097.m9295().equals("newInstance") && c3097.m9294().equals("Ljava/lang/reflect/Array;")) {
                        if (c3097.m9291().length == 2 && c3097.m9291()[0].equals("Ljava/lang/Class;")) {
                            AbstractC7124 abstractC7127 = c13475.f29544[0];
                            EnumC9947 enumC9949 = abstractC7127.f23823;
                            if (enumC9949 == EnumC9947.CONSTANT) {
                                str = ((C1686) ((C14760) abstractC7127).f48276).f6677;
                            } else if (enumC9949 == EnumC9947.STATIC_FIELD) {
                                C6418 c6418 = (C6418) abstractC7127;
                                String str3 = c6418.f21736;
                                if (str3.startsWith("Ljava/lang/") && c6418.f21735.equals("TYPE")) {
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
                                AbstractC7124 abstractC7128 = c13475.f29544[1];
                                boolean zEquals = c3097.m9291()[1].equals("I");
                                boolean[] zArr = this.f37763;
                                if (zEquals) {
                                    if (str2.equals("[".concat(str))) {
                                        int i = 0;
                                        while (str.charAt(i) == '[') {
                                            i++;
                                        }
                                        zArr[0] = true;
                                        return i > 0 ? new C21941(str.substring(i), i + 1, new AbstractC7124[]{abstractC7128}) : new C14886(EnumC9947.NEW_ARRAY, abstractC7128, str);
                                    }
                                } else if (abstractC7128.f23823 == EnumC9947.FILLED_ARRAY) {
                                    C3469 c3469 = (C3469) abstractC7128;
                                    int length = c3469.f29544.length;
                                    if (str2.length() > length && str2.substring(length).equals(str)) {
                                        int i2 = 0;
                                        while (str.charAt(i2) == '[') {
                                            i2++;
                                        }
                                        zArr[0] = true;
                                        return new C21941(str.substring(i2), i2 + length, c3469.f29544);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return abstractC7124;
    }
}
