package l;

import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۛ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8XU */
/* JADX INFO: loaded from: classes3.dex */
public final class C6639 extends AbstractC2297 {
    /* JADX WARN: Code duplicated, block: B:57:0x00ff  */
    /* JADX WARN: Switch 'out' block B:36:0x00ad for B:17:0x0059 already processed. Defaulting to fallback option. */
    @Override // l.InterfaceC6772
    /* JADX INFO: renamed from: ۙ */
    public final C1220 mo13215(C5147 c5147, InterfaceC13483 interfaceC13483) {
        C4401 c4401;
        char cCharAt;
        C24539 c24539;
        boolean zEquals;
        boolean z;
        int i;
        char cCharAt2;
        C7186 c7186 = (C7186) interfaceC13483;
        InterfaceC8263 interfaceC8263Mo19759 = c7186.mo19759();
        if (c5147.mo14650() < 4) {
            int iMo14654 = c5147.mo14654();
            int iMo14650 = c5147.mo14650() + c5147.mo14651();
            boolean zM47877 = c7186.mo19760().m47877();
            CharSequence charSequenceM34537 = c5147.getLine().m34537();
            char cCharAt3 = charSequenceM34537.charAt(iMo14654);
            if (cCharAt3 != '*' && cCharAt3 != '+' && cCharAt3 != '-') {
                int length = charSequenceM34537.length();
                int i2 = 0;
                int i3 = iMo14654;
                while (true) {
                    if (i3 < length) {
                        char cCharAt4 = charSequenceM34537.charAt(i3);
                        if (cCharAt4 != ')' && cCharAt4 != '.') {
                            switch (cCharAt4) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                case '8':
                                case '9':
                                    i2++;
                                    if (i2 <= 9) {
                                        i3++;
                                    }
                                    break;
                                default:
                                    break;
                            }
                        } else if (i2 >= 1 && ((i = i3 + 1) >= charSequenceM34537.length() || (cCharAt2 = charSequenceM34537.charAt(i)) == '\t' || cCharAt2 == ' ')) {
                            String string = charSequenceM34537.subSequence(iMo14654, i3).toString();
                            C19450 c19450 = new C19450();
                            c19450.m44933(Integer.valueOf(Integer.parseInt(string)));
                            c19450.m44934(String.valueOf(cCharAt4));
                            c4401 = new C4401(c19450, i);
                        }
                    }
                    c4401 = null;
                }
            } else {
                int i4 = iMo14654 + 1;
                if (i4 >= charSequenceM34537.length() || (cCharAt = charSequenceM34537.charAt(i4)) == '\t' || cCharAt == ' ') {
                    C20721 c20721 = new C20721();
                    c20721.m47388(String.valueOf(cCharAt3));
                    c4401 = new C4401(c20721, i4);
                } else {
                    c4401 = null;
                }
            }
            if (c4401 == null) {
                c24539 = null;
            } else {
                AbstractC7296 abstractC7296 = c4401.f15830;
                int i5 = c4401.f15829;
                int i6 = (i5 - iMo14654) + iMo14650;
                int length2 = charSequenceM34537.length();
                int i7 = i6;
                while (true) {
                    if (i5 >= length2) {
                        z = false;
                    } else {
                        char cCharAt5 = charSequenceM34537.charAt(i5);
                        if (cCharAt5 == '\t') {
                            i7 = (4 - (i7 % 4)) + i7;
                        } else if (cCharAt5 == ' ') {
                            i7++;
                        } else {
                            z = true;
                        }
                        i5++;
                    }
                }
                if (zM47877 || ((!(abstractC7296 instanceof C19450) || ((C19450) abstractC7296).m44937().intValue() == 1) && z)) {
                    if (!z || i7 - i6 > 4) {
                        i7 = i6 + 1;
                    }
                    c24539 = new C24539(abstractC7296, i7);
                } else {
                    c24539 = null;
                }
            }
            if (c24539 != null) {
                AbstractC7296 abstractC7297 = c24539.f79567;
                int i8 = c24539.f79566;
                C21555 c21555 = new C21555(i8 - c5147.mo14651());
                if (interfaceC8263Mo19759 instanceof C14841) {
                    AbstractC7296 abstractC7298 = (AbstractC7296) ((C14841) interfaceC8263Mo19759).mo7447();
                    if ((abstractC7298 instanceof C20721) && (abstractC7297 instanceof C20721)) {
                        zEquals = C17359.equals(((C20721) abstractC7298).m47389(), ((C20721) abstractC7297).m47389());
                    } else {
                        zEquals = ((abstractC7298 instanceof C19450) && (abstractC7297 instanceof C19450)) ? C17359.equals(((C19450) abstractC7298).m44935(), ((C19450) abstractC7297).m44935()) : false;
                    }
                    if (zEquals) {
                        C1220 c1220 = new C1220(c21555);
                        c1220.m4435(i8);
                        return c1220;
                    }
                }
                C14841 c14841 = new C14841(abstractC7297);
                abstractC7297.m19964(true);
                C1220 c1221 = new C1220(c14841, c21555);
                c1221.m4435(i8);
                return c1221;
            }
        }
        return null;
    }
}
