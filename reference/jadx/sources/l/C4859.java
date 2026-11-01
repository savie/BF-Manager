package l;

import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۙ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8XU */
/* JADX INFO: loaded from: classes3.dex */
public final class C4859 extends AbstractC15175 {
    /* JADX WARN: Code duplicated, block: B:57:0x00ff  */
    /* JADX WARN: Switch 'out' block B:36:0x00ad for B:17:0x0059 already processed. Defaulting to fallback option. */
    @Override // l.InterfaceC17996
    /* JADX INFO: renamed from: ۙ */
    public final C3822 mo3830(C8057 c8057, InterfaceC18702 interfaceC18702) {
        C11916 c11916;
        char cCharAt;
        C14033 c14033;
        boolean zEquals;
        boolean z;
        int i;
        char cCharAt2;
        C17934 c17934 = (C17934) interfaceC18702;
        InterfaceC21524 interfaceC21524Mo41744 = c17934.mo41744();
        if (c8057.mo21201() < 4) {
            int iMo21197 = c8057.mo21197();
            int iMo21201 = c8057.mo21201() + c8057.mo21202();
            boolean zM7582 = c17934.mo41745().m7582();
            CharSequence charSequenceM29102 = c8057.getLine().m29102();
            char cCharAt3 = charSequenceM29102.charAt(iMo21197);
            if (cCharAt3 != '*' && cCharAt3 != '+' && cCharAt3 != '-') {
                int length = charSequenceM29102.length();
                int i2 = 0;
                int i3 = iMo21197;
                while (true) {
                    if (i3 < length) {
                        char cCharAt4 = charSequenceM29102.charAt(i3);
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
                        } else if (i2 >= 1 && ((i = i3 + 1) >= charSequenceM29102.length() || (cCharAt2 = charSequenceM29102.charAt(i)) == '\t' || cCharAt2 == ' ')) {
                            String string = charSequenceM29102.subSequence(iMo21197, i3).toString();
                            C20778 c20778 = new C20778();
                            c20778.m46766(Integer.valueOf(Integer.parseInt(string)));
                            c20778.m46767(String.valueOf(cCharAt4));
                            c11916 = new C11916(c20778, i);
                        }
                    }
                    c11916 = null;
                }
            } else {
                int i4 = iMo21197 + 1;
                if (i4 >= charSequenceM29102.length() || (cCharAt = charSequenceM29102.charAt(i4)) == '\t' || cCharAt == ' ') {
                    C9799 c9799 = new C9799();
                    c9799.m24905(String.valueOf(cCharAt3));
                    c11916 = new C11916(c9799, i4);
                } else {
                    c11916 = null;
                }
            }
            if (c11916 == null) {
                c14033 = null;
            } else {
                AbstractC18661 abstractC18661 = c11916.f40010;
                int i5 = c11916.f40009;
                int i6 = (i5 - iMo21197) + iMo21201;
                int length2 = charSequenceM29102.length();
                int i7 = i6;
                while (true) {
                    if (i5 >= length2) {
                        z = false;
                    } else {
                        char cCharAt5 = charSequenceM29102.charAt(i5);
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
                if (zM7582 || ((!(abstractC18661 instanceof C20778) || ((C20778) abstractC18661).m46770().intValue() == 1) && z)) {
                    if (!z || i7 - i6 > 4) {
                        i7 = i6 + 1;
                    }
                    c14033 = new C14033(abstractC18661, i7);
                } else {
                    c14033 = null;
                }
            }
            if (c14033 != null) {
                AbstractC18661 abstractC18662 = c14033.f46144;
                int i8 = c14033.f46143;
                C5565 c5565 = new C5565(i8 - c8057.mo21202());
                if (interfaceC21524Mo41744 instanceof C2742) {
                    AbstractC18661 abstractC18663 = (AbstractC18661) ((C2742) interfaceC21524Mo41744).mo1823();
                    if ((abstractC18663 instanceof C9799) && (abstractC18662 instanceof C9799)) {
                        zEquals = C13638.equals(((C9799) abstractC18663).m24906(), ((C9799) abstractC18662).m24906());
                    } else {
                        zEquals = ((abstractC18663 instanceof C20778) && (abstractC18662 instanceof C20778)) ? C13638.equals(((C20778) abstractC18663).m46768(), ((C20778) abstractC18662).m46768()) : false;
                    }
                    if (zEquals) {
                        C3822 c3822 = new C3822(c5565);
                        c3822.m11111(i8);
                        return c3822;
                    }
                }
                C2742 c2742 = new C2742(abstractC18662);
                abstractC18662.m43149(true);
                C3822 c3823 = new C3822(c2742, c5565);
                c3823.m11111(i8);
                return c3823;
            }
        }
        return null;
    }
}
