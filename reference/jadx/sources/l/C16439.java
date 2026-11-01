package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1MI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16439 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f52862;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final CharSequence f52866;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13409 f52867;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f52868;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CharSequence f52870;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52863 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f52865 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f52869 = -1;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C19967 f52864 = null;

    public C16439(InterfaceC13409 interfaceC13409, CharSequence charSequence, CharSequence charSequence2, ArrayList arrayList, ArrayList arrayList2) {
        this.f52866 = charSequence;
        this.f52870 = charSequence2;
        this.f52862 = arrayList;
        this.f52868 = arrayList2;
        this.f52867 = interfaceC13409;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m38705(ArrayList arrayList, CharSequence charSequence, int i) {
        if (i == -1) {
            return 0;
        }
        return i == arrayList.size() ? charSequence.length() : ((InterfaceC2326) arrayList.get(i)).mo7061();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m38707() {
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it = this.f52867.mo11889().iterator();
        boolean z = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.f52868;
            arrayList2 = this.f52862;
            if (!zHasNext) {
                break;
            }
            C20464 c20464 = (C20464) it.next();
            int i = c20464.f66400;
            int i2 = c20464.f66401;
            int i3 = i - i2;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i2 + i4;
                int i6 = c20464.f66399 + i4;
                if (!(arrayList2.get(i5) instanceof C22083) || !(arrayList.get(i6) instanceof C22083)) {
                    if (i5 == 0 ? true : arrayList2.get(i5 - 1) instanceof C22083) {
                        if (i6 == 0 ? true : arrayList.get(i6 - 1) instanceof C22083) {
                            m38706(i5 - 1, i6 - 1, z);
                        }
                    }
                    z = true;
                } else {
                    m38706(i5, i6, z);
                    z = false;
                }
            }
        }
        m38706(arrayList2.size(), arrayList.size(), z);
        C19967 c19967 = this.f52864;
        ArrayList arrayList3 = this.f52863;
        if (c19967 != null) {
            arrayList3.add(c19967.f63930);
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38706(int i, int i2, boolean z) {
        int i3;
        boolean z2;
        int i4 = this.f52865;
        if (i4 > i || (i3 = this.f52869) > i2) {
            return;
        }
        ArrayList arrayList = this.f52862;
        CharSequence charSequence = this.f52866;
        int iM38705 = m38705(arrayList, charSequence, i4);
        ArrayList arrayList2 = this.f52868;
        CharSequence charSequence2 = this.f52870;
        int iM38706 = m38705(arrayList2, charSequence2, i3);
        int iM38707 = m38705(arrayList, charSequence, i);
        int iM38708 = m38705(arrayList2, charSequence2, i2);
        int iMax = Math.max(0, i4 + 1);
        C20464 c20464 = new C20464(iMax, Math.min(i + 1, arrayList.size()), Math.max(0, i3 + 1), Math.min(i2 + 1, arrayList2.size()));
        C20464 c20465 = new C20464(iM38705, iM38707, iM38706, iM38708);
        C0210 c0210 = new C0210(c20464, c20465);
        while (true) {
            if (iMax < c20464.f66400) {
                if (arrayList.get(iMax) instanceof C22083) {
                    iMax++;
                }
            } else {
                int i5 = c20464.f66399;
                while (true) {
                    if (i5 >= c20464.f66402) {
                        z2 = false;
                        break;
                    } else if (arrayList2.get(i5) instanceof C22083) {
                        i5++;
                    }
                }
            }
            z2 = true;
            break;
        }
        int i6 = c20465.f66401;
        int i7 = c20465.f66400;
        CharSequence charSequenceSubSequence = charSequence.subSequence(i6, i7);
        int i8 = c20465.f66399;
        int i9 = c20465.f66402;
        boolean zM33173 = C13571.m33173(charSequenceSubSequence, charSequence2.subSequence(i8, i9));
        C19967 c19967 = new C19967(c0210, z, z2, zM33173);
        if (c20465.m46276()) {
            return;
        }
        C19967 c19968 = this.f52864;
        if (c19968 != null) {
            boolean z3 = c19968.f63931;
            boolean z4 = c19968.f63929;
            boolean z5 = c19968.f63932;
            if ((!z5 && !z) || ((z4 && zM33173) || !z3 || !z2)) {
                C0210 c0211 = c19968.f63930;
                C20464 c20466 = c0211.f1379;
                int i10 = c20466.f66401;
                C20464 c20467 = c0210.f1379;
                C20464 c20468 = new C20464(i10, c20467.f66400, c20466.f66399, c20467.f66402);
                C20464 c20469 = c0211.f1378;
                this.f52864 = new C19967(new C0210(c20468, new C20464(c20469.f66401, i7, c20469.f66399, i9)), z5 || z, z3 || z2, z4 && zM33173);
            } else {
                if (c19968 != null) {
                    this.f52863.add(c19968.f63930);
                }
                this.f52864 = c19967;
            }
        } else {
            if (c19968 != null) {
                this.f52863.add(c19968.f63930);
            }
            this.f52864 = c19967;
        }
        this.f52865 = i;
        this.f52869 = i2;
    }
}
