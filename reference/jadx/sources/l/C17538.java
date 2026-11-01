package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 4917 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17538 extends AbstractC15175 {
    @Override // l.InterfaceC17996
    /* JADX INFO: renamed from: ۙ */
    public final C3822 mo3830(C8057 c8057, InterfaceC18702 interfaceC18702) {
        int i;
        boolean z;
        boolean z2;
        EnumC21066 enumC21066;
        ArrayList arrayListM7586 = interfaceC18702.mo41745().m7586();
        if (arrayListM7586.isEmpty() || C22851.m50576('|', ((C11647) C19084.m43861(arrayListM7586, 1)).m29102(), 0) == -1) {
            return null;
        }
        C11647 line = c8057.getLine();
        CharSequence charSequenceM29102 = line.m29103(c8057.getIndex(), line.m29102().length()).m29102();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z3 = false;
        loop0: while (true) {
            int i3 = 0;
            while (true) {
                if (i2 >= charSequenceM29102.length()) {
                    if (!z3) {
                        break loop0;
                    }
                    break loop0;
                }
                char cCharAt = charSequenceM29102.charAt(i2);
                if (cCharAt == '\t' || cCharAt == ' ') {
                    i2++;
                } else if (cCharAt == '-' || cCharAt == ':') {
                    if (i3 != 0 || arrayList.isEmpty()) {
                        if (cCharAt == ':') {
                            i2++;
                            i = 1;
                            z = true;
                        } else {
                            i = 0;
                            z = false;
                        }
                        boolean z4 = false;
                        while (i2 < charSequenceM29102.length() && charSequenceM29102.charAt(i2) == '-') {
                            i2++;
                            i++;
                            z4 = true;
                        }
                        if (z4) {
                            if (i2 >= charSequenceM29102.length() || charSequenceM29102.charAt(i2) != ':') {
                                z2 = false;
                            } else {
                                i2++;
                                i++;
                                z2 = true;
                            }
                            if (z && z2) {
                                enumC21066 = EnumC21066.CENTER;
                            } else if (z) {
                                enumC21066 = EnumC21066.LEFT;
                            } else {
                                enumC21066 = z2 ? EnumC21066.RIGHT : null;
                            }
                            arrayList.add(new C6249(enumC21066, i));
                        }
                    }
                } else if (cCharAt == '|') {
                    i2++;
                    i3++;
                    if (i3 <= 1) {
                        z3 = true;
                    }
                }
                arrayList = null;
                break loop0;
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        C11647 c11647 = (C11647) C19084.m43861(arrayListM7586, 1);
        if (arrayList.size() < C11189.m28129(c11647).size()) {
            return null;
        }
        C3822 c3822 = new C3822(new C11189(arrayList, c11647));
        c3822.m11116(c8057.getIndex());
        c3822.m11114(1);
        return c3822;
    }
}
