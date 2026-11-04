package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1MI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15678 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f50977;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21646 f50978;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f50979;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f50980;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final CharSequence f50981;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f50983 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f50976 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f50982 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C23138 f50975 = null;

    public C15678(InterfaceC21646 interfaceC21646, CharSequence charSequence, CharSequence charSequence2, ArrayList arrayList, ArrayList arrayList2) {
        this.f50981 = charSequence;
        this.f50980 = charSequence2;
        this.f50979 = arrayList;
        this.f50977 = arrayList2;
        this.f50978 = interfaceC21646;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m37446(ArrayList arrayList, CharSequence charSequence, int i) {
        if (i == -1) {
            return 0;
        }
        return i == arrayList.size() ? charSequence.length() : ((InterfaceC6205) arrayList.get(i)).mo12745();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m37448() {
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it = this.f50978.mo3131().iterator();
        boolean z = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.f50977;
            arrayList2 = this.f50979;
            if (!zHasNext) {
                break;
            }
            C22547 c22547 = (C22547) it.next();
            int i = c22547.f72891;
            int i2 = c22547.f72892;
            int i3 = i - i2;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i2 + i4;
                int i6 = c22547.f72894 + i4;
                if (!(arrayList2.get(i5) instanceof C3967) || !(arrayList.get(i6) instanceof C3967)) {
                    if (i5 == 0 ? true : arrayList2.get(i5 - 1) instanceof C3967) {
                        if (i6 == 0 ? true : arrayList.get(i6 - 1) instanceof C3967) {
                            m37447(i5 - 1, i6 - 1, z);
                        }
                    }
                    z = true;
                } else {
                    m37447(i5, i6, z);
                    z = false;
                }
            }
        }
        m37447(arrayList2.size(), arrayList.size(), z);
        C23138 c23138 = this.f50975;
        ArrayList arrayList3 = this.f50983;
        if (c23138 != null) {
            arrayList3.add(c23138.f75015);
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37447(int i, int i2, boolean z) {
        int i3;
        boolean z2;
        int i4 = this.f50976;
        if (i4 > i || (i3 = this.f50982) > i2) {
            return;
        }
        ArrayList arrayList = this.f50979;
        CharSequence charSequence = this.f50981;
        int iM37446 = m37446(arrayList, charSequence, i4);
        ArrayList arrayList2 = this.f50977;
        CharSequence charSequence2 = this.f50980;
        int iM37447 = m37446(arrayList2, charSequence2, i3);
        int iM37448 = m37446(arrayList, charSequence, i);
        int iM37449 = m37446(arrayList2, charSequence2, i2);
        int iMax = Math.max(0, i4 + 1);
        C22547 c22547 = new C22547(iMax, Math.min(i + 1, arrayList.size()), Math.max(0, i3 + 1), Math.min(i2 + 1, arrayList2.size()));
        C22547 c22548 = new C22547(iM37446, iM37448, iM37447, iM37449);
        C20154 c20154 = new C20154(c22547, c22548);
        while (true) {
            if (iMax < c22547.f72891) {
                if (arrayList.get(iMax) instanceof C3967) {
                    iMax++;
                }
            } else {
                int i5 = c22547.f72894;
                while (true) {
                    if (i5 >= c22547.f72893) {
                        z2 = false;
                        break;
                    } else if (arrayList2.get(i5) instanceof C3967) {
                        i5++;
                    }
                }
            }
            z2 = true;
            break;
        }
        int i6 = c22548.f72892;
        int i7 = c22548.f72891;
        CharSequence charSequenceSubSequence = charSequence.subSequence(i6, i7);
        int i8 = c22548.f72894;
        int i9 = c22548.f72893;
        boolean zM20686 = C7569.m20686(charSequenceSubSequence, charSequence2.subSequence(i8, i9));
        C23138 c23138 = new C23138(c20154, z, z2, zM20686);
        if (c22548.m50782()) {
            return;
        }
        C23138 c23139 = this.f50975;
        if (c23139 != null) {
            boolean z3 = c23139.f75016;
            boolean z4 = c23139.f75018;
            boolean z5 = c23139.f75017;
            if ((!z5 && !z) || ((z4 && zM20686) || !z3 || !z2)) {
                C20154 c20155 = c23139.f75015;
                C22547 c22549 = c20155.f64752;
                int i10 = c22549.f72892;
                C22547 c225410 = c20154.f64752;
                C22547 c225411 = new C22547(i10, c225410.f72891, c22549.f72894, c225410.f72893);
                C22547 c225412 = c20155.f64751;
                this.f50975 = new C23138(new C20154(c225411, new C22547(c225412.f72892, i7, c225412.f72894, i9)), z5 || z, z3 || z2, z4 && zM20686);
            } else {
                if (c23139 != null) {
                    this.f50983.add(c23139.f75015);
                }
                this.f50975 = c23138;
            }
        } else {
            if (c23139 != null) {
                this.f50983.add(c23139.f75015);
            }
            this.f50975 = c23138;
        }
        this.f50976 = i;
        this.f50982 = i2;
    }
}
