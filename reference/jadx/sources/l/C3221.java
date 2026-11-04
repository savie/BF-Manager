package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes2.dex */
public final class C3221 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f10498;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f10499;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f10500;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f10501;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f10502;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C15087 f10503;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21646 f10504;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List f10505;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final CharSequence f10506;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence f10507;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6730 f10508;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f10509;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f10510;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List f10511;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f10512;

    public C3221(CharSequence charSequence, CharSequence charSequence2, List list, List list2, int i, int i2, InterfaceC21646 interfaceC21646, C15087 c15087) {
        this.f10506 = charSequence;
        this.f10507 = charSequence2;
        this.f10505 = list;
        this.f10511 = list2;
        this.f10502 = i;
        this.f10512 = i2;
        this.f10504 = interfaceC21646;
        this.f10503 = c15087;
        int length = charSequence.length();
        this.f10500 = length;
        int length2 = charSequence2.length();
        this.f10498 = length2;
        this.f10508 = new C6730(length, length2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21646 m10570() {
        this.f10501 = -1;
        this.f10510 = -1;
        this.f10499 = -1;
        this.f10509 = -1;
        m10569(-1, -1);
        Iterator it = this.f10504.mo3131().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            List list = this.f10511;
            List list2 = this.f10505;
            C6730 c6730 = this.f10508;
            if (zHasNext) {
                C22547 c22547 = (C22547) it.next();
                int i = c22547.f72891;
                int i2 = c22547.f72892;
                int i3 = i - i2;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = i2 + i4;
                    int i6 = c22547.f72894 + i4;
                    int iMo12746 = ((InterfaceC6205) list2.get(i5)).mo12746();
                    int i7 = this.f10502;
                    int iMo12747 = ((InterfaceC6205) list.get(i6)).mo12746();
                    int i8 = this.f10512;
                    int iMo12745 = ((InterfaceC6205) list2.get(i5)).mo12745() - i7;
                    int iMo12748 = ((InterfaceC6205) list.get(i6)).mo12745() - i8;
                    m10567(i5, i6);
                    c6730.m54965(iMo12746 - i7, iMo12747 - i8, iMo12745, iMo12748);
                    m10569(i5, i6);
                }
            } else {
                m10567(list2.size(), list.size());
                return C14932.m35915(c6730.m18810());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10567(int i, int i2) {
        int i3;
        int i4 = this.f10502;
        List list = this.f10505;
        int iMo12745 = i == 0 ? 0 : ((InterfaceC6205) list.get(i - 1)).mo12745() - i4;
        int i5 = this.f10512;
        List list2 = this.f10511;
        int iMo12746 = i2 != 0 ? ((InterfaceC6205) list2.get(i2 - 1)).mo12745() - i5 : 0;
        int iMo12747 = i == list.size() ? this.f10500 : ((InterfaceC6205) list.get(i)).mo12746() - i4;
        int iMo12748 = i2 == list2.size() ? this.f10498 : ((InterfaceC6205) list2.get(i2)).mo12746() - i5;
        int i6 = this.f10501;
        if (i6 == iMo12745 && this.f10510 == iMo12746) {
            m10568(iMo12745, iMo12746, iMo12747, iMo12748);
        } else if (i6 < iMo12745 && (i3 = this.f10510) < iMo12746) {
            m10568(i6, i3, this.f10499, this.f10509);
            m10568(iMo12745, iMo12746, iMo12747, iMo12748);
        } else {
            int i7 = this.f10510;
            int i8 = this.f10499;
            int i9 = this.f10509;
            C15087 c15087 = this.f10503;
            CharSequence charSequence = this.f10507;
            CharSequence charSequence2 = this.f10506;
            C6730 c6730 = this.f10508;
            if (i6 == iMo12745 && i8 == iMo12747) {
                C12850 c12850M42251 = C18137.m42251(charSequence2.subSequence(i6, i8), charSequence.subSequence(i7, i9), charSequence.subSequence(iMo12746, iMo12748), c15087);
                for (C22547 c22547 : ((InterfaceC21646) c12850M42251.f18884).mo3131()) {
                    c6730.m54965(c22547.f72892 + i6, c22547.f72894 + i7, c22547.f72891 + i6, c22547.f72893 + i7);
                }
                for (C22547 c22548 : ((InterfaceC21646) c12850M42251.f18885).mo3131()) {
                    c6730.m54965(c22548.f72892 + i6, c22548.f72894 + iMo12746, c22548.f72891 + i6, c22548.f72893 + iMo12746);
                }
            } else {
                if (i7 != iMo12746 || i9 != iMo12748) {
                    throw new IllegalStateException();
                }
                C12850 c12850M42252 = C18137.m42251(charSequence.subSequence(i7, i9), charSequence2.subSequence(i6, i8), charSequence2.subSequence(iMo12745, iMo12747), c15087);
                for (C22547 c22549 : ((InterfaceC21646) c12850M42252.f18884).mo3131()) {
                    c6730.m54965(c22549.f72894 + i6, c22549.f72892 + i7, c22549.f72893 + i6, c22549.f72891 + i7);
                }
                for (C22547 c225410 : ((InterfaceC21646) c12850M42252.f18885).mo3131()) {
                    c6730.m54965(c225410.f72894 + iMo12745, c225410.f72892 + i7, c225410.f72893 + iMo12745, c225410.f72891 + i7);
                }
            }
        }
        this.f10501 = -1;
        this.f10510 = -1;
        this.f10499 = -1;
        this.f10509 = -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m10569(int i, int i2) {
        int i3 = this.f10502;
        List list = this.f10505;
        int iMo12745 = i == -1 ? 0 : ((InterfaceC6205) list.get(i)).mo12745() - i3;
        int i4 = this.f10512;
        List list2 = this.f10511;
        int iMo12746 = i2 != -1 ? ((InterfaceC6205) list2.get(i2)).mo12745() - i4 : 0;
        int i5 = i + 1;
        int iMo12747 = i5 == list.size() ? this.f10500 : ((InterfaceC6205) list.get(i5)).mo12746() - i3;
        int i6 = i2 + 1;
        int iMo12748 = i6 == list2.size() ? this.f10498 : ((InterfaceC6205) list2.get(i6)).mo12746() - i4;
        this.f10501 = iMo12745;
        this.f10510 = iMo12746;
        this.f10499 = iMo12747;
        this.f10509 = iMo12748;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10568(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        for (C22547 c22547 : C1730.m6133(this.f10506.subSequence(i, i3), this.f10507.subSequence(i2, i4), this.f10503).mo3131()) {
            this.f10508.m54965(c22547.f72892 + i, c22547.f72894 + i2, c22547.f72891 + i, c22547.f72893 + i2);
        }
    }
}
