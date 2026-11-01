package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ܺᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBE1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16104 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f52074;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f52075;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f52076;

    public C16104(C9421 c9421, C1163 c1163, InterfaceC6500 interfaceC6500) {
        this.f52075 = c9421;
        this.f52074 = c1163;
        this.f52076 = interfaceC6500;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C9421 m38139() {
        return (C9421) this.f52075;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC22729 m38140() {
        return (C1163) this.f52074;
    }

    public C16104(C17661 c17661) {
        this.f52075 = c17661;
        C5667 c5667M41141 = c17661.m41141();
        this.f52074 = c5667M41141;
        this.f52076 = c5667M41141.m15556();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC6500 m38138() {
        return (InterfaceC6500) this.f52076;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C17661 m38137() {
        C17661 c17661 = (C17661) this.f52075;
        C5667 c5667 = (C5667) this.f52076;
        C5667 c5668 = (C5667) this.f52074;
        int size = c5668.size();
        BitSet bitSet = new BitSet(c5668.m36890());
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= size) {
                break;
            }
            C12018 c12018M15271get = c5668.m15271get(i);
            if (!bitSet.get(c12018M15271get.mo29913())) {
                C4129 c4129M41140 = c17661.m41140(c12018M15271get.mo29913());
                int size2 = c4129M41140.size();
                int i3 = 0;
                while (i3 < size2) {
                    int i4 = c4129M41140.get(i3);
                    C12018 c12018M15553 = c5668.m15553(i4);
                    if (!bitSet.get(i4) && c12018M15553.m29916().size() <= i2 && c12018M15553.m29915().m37181().m31572() != 55) {
                        C4129 c4129 = new C4129();
                        int i5 = i3 + 1;
                        while (i5 < size2) {
                            int i6 = c4129M41140.get(i5);
                            C12018 c12018M15554 = c5668.m15553(i6);
                            if (c12018M15554.m29916().size() == i2 && c12018M15553.m29911().m48688(c12018M15554.m29911())) {
                                c4129.add(i6);
                                bitSet.set(i6);
                            }
                            i5++;
                            i2 = 1;
                        }
                        int size3 = c4129.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            int i8 = c4129.get(i7);
                            C4129 c4129M41141 = c17661.m41140(c5668.m15553(i8).mo29913());
                            int size4 = c4129M41141.size();
                            int i9 = size3;
                            int i10 = 0;
                            while (i10 < size4) {
                                C5667 c5669 = c5668;
                                C12018 c12018M15555 = c5667.m15553(c4129M41141.get(i10));
                                C4129 c41210 = c4129M41140;
                                C4129 c4129M11757 = c12018M15555.m29916().m11757();
                                int iM11755 = c4129M11757.m11755(i8);
                                c4129M11757.set(iM11755 >= 0 ? iM11755 : -1, i4);
                                int iM29918 = c12018M15555.m29918();
                                if (iM29918 == i8) {
                                    iM29918 = i4;
                                }
                                c4129M11757.mo9637();
                                c5667.m15551(c5667.m36887(c12018M15555.mo29913()), new C12018(c12018M15555.mo29913(), c12018M15555.m29911(), c4129M11757, iM29918));
                                i10++;
                                c5668 = c5669;
                                i4 = i4;
                                c4129M41140 = c41210;
                                size2 = size2;
                                i8 = i8;
                                c4129 = c4129;
                            }
                            i7++;
                            size3 = i9;
                        }
                    }
                    i3++;
                    i2 = 1;
                    c5668 = c5668;
                    c4129M41140 = c4129M41140;
                    size2 = size2;
                }
            }
            i++;
            c5668 = c5668;
        }
        while (true) {
            size--;
            if (size >= 0) {
                if (bitSet.get(c5667.m15271get(size).mo29913())) {
                    c5667.m15551(size, (C12018) null);
                }
            } else {
                c5667.mo15262();
                c5667.mo9637();
                return new C17661(c5667, c17661.m41142());
            }
        }
    }
}
