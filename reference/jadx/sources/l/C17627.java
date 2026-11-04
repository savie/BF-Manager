package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4917 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17627 extends AbstractC2297 {
    @Override // l.InterfaceC6772
    /* JADX INFO: renamed from: ۙ */
    public final C1220 mo13215(C5147 c5147, InterfaceC13483 interfaceC13483) {
        int i;
        boolean z;
        boolean z2;
        EnumC13152 enumC13152;
        ArrayList arrayListM47876 = interfaceC13483.mo19760().m47876();
        if (arrayListM47876.isEmpty() || C6790.m18955('|', ((C14228) j$$ExternalSyntheticOutline0.m(arrayListM47876, 1)).m34537(), 0) == -1) {
            return null;
        }
        C14228 line = c5147.getLine();
        CharSequence charSequenceM34537 = line.m34538(c5147.getIndex(), line.m34537().length()).m34537();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z3 = false;
        loop0: while (true) {
            int i3 = 0;
            while (true) {
                if (i2 >= charSequenceM34537.length()) {
                    if (!z3) {
                        break loop0;
                    }
                    break loop0;
                }
                char cCharAt = charSequenceM34537.charAt(i2);
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
                        while (i2 < charSequenceM34537.length() && charSequenceM34537.charAt(i2) == '-') {
                            i2++;
                            i++;
                            z4 = true;
                        }
                        if (z4) {
                            if (i2 >= charSequenceM34537.length() || charSequenceM34537.charAt(i2) != ':') {
                                z2 = false;
                            } else {
                                i2++;
                                i++;
                                z2 = true;
                            }
                            if (z && z2) {
                                enumC13152 = EnumC13152.CENTER;
                            } else if (z) {
                                enumC13152 = EnumC13152.LEFT;
                            } else {
                                enumC13152 = z2 ? EnumC13152.RIGHT : null;
                            }
                            arrayList.add(new C16135(enumC13152, i));
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
        C14228 c14228 = (C14228) j$$ExternalSyntheticOutline0.m(arrayListM47876, 1);
        if (arrayList.size() < C23595.m52834(c14228).size()) {
            return null;
        }
        C1220 c1220 = new C1220(new C23595(arrayList, c14228));
        c1220.m4440(c5147.getIndex());
        c1220.m4438(1);
        return c1220;
    }
}
