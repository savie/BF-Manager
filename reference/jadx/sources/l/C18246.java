package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ܿۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBE1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18246 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14978 f59565;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9757 f59566;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14978 f59567;

    public C18246(C9757 c9757) {
        this.f59566 = c9757;
        C14978 c14978M25432 = c9757.m25432();
        this.f59565 = c14978M25432;
        this.f59567 = c14978M25432.m36040();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9757 m42400() {
        C9757 c9757;
        C14978 c14978;
        C18246 c18246 = this;
        C14978 c14979 = c18246.f59565;
        int size = c14979.size();
        BitSet bitSet = new BitSet(c14979.m37668());
        int i = 0;
        while (true) {
            c9757 = c18246.f59566;
            c14978 = c18246.f59567;
            int i2 = 1;
            if (i >= size) {
                break;
            }
            C22438 c22438M31620get = c14979.m31620get(i);
            if (!bitSet.get(c22438M31620get.mo31292())) {
                C24698 c24698M25433 = c9757.m25433(c22438M31620get.mo31292());
                int size2 = c24698M25433.size();
                int i3 = 0;
                while (i3 < size2) {
                    int i4 = c24698M25433.get(i3);
                    C22438 c22438M36044 = c14979.m36044(i4);
                    if (!bitSet.get(i4) && c22438M36044.m50590().size() <= i2 && c22438M36044.m50591().m40434().m43509() != 55) {
                        C24698 c24698 = new C24698();
                        int i5 = i3 + 1;
                        while (i5 < size2) {
                            int i6 = c24698M25433.get(i5);
                            C22438 c22438M36045 = c14979.m36044(i6);
                            if (c22438M36045.m50590().size() == i2 && c22438M36044.m50596().m37631(c22438M36045.m50596())) {
                                c24698.add(i6);
                                bitSet.set(i6);
                            }
                            i5++;
                            i2 = 1;
                        }
                        int size3 = c24698.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            int i8 = c24698.get(i7);
                            C24698 c24698M25434 = c9757.m25433(c14979.m36044(i8).mo31292());
                            int size4 = c24698M25434.size();
                            int i9 = size3;
                            int i10 = 0;
                            while (i10 < size4) {
                                C14978 c149710 = c14979;
                                C22438 c22438M36046 = c14978.m36044(c24698M25434.get(i10));
                                C24698 c24699 = c24698M25433;
                                C24698 c24698M55045 = c22438M36046.m50590().m55045();
                                int iM55043 = c24698M55045.m55043(i8);
                                c24698M55045.set(iM55043 >= 0 ? iM55043 : -1, i4);
                                int iM50593 = c22438M36046.m50593();
                                if (iM50593 == i8) {
                                    iM50593 = i4;
                                }
                                c24698M55045.mo15005();
                                c14978.m36041(c14978.m37669(c22438M36046.mo31292()), new C22438(c22438M36046.mo31292(), c22438M36046.m50596(), c24698M55045, iM50593));
                                i10++;
                                c14979 = c149710;
                                i4 = i4;
                                c24698M25433 = c24699;
                                size2 = size2;
                                i8 = i8;
                                c24698 = c24698;
                            }
                            i7++;
                            size3 = i9;
                        }
                    }
                    i3++;
                    i2 = 1;
                    c14979 = c14979;
                    c24698M25433 = c24698M25433;
                    size2 = size2;
                }
            }
            i++;
            c18246 = this;
            c14979 = c14979;
        }
        while (true) {
            size--;
            if (size >= 0) {
                if (bitSet.get(c14978.m31620get(size).mo31292())) {
                    c14978.m36041(size, (C22438) null);
                }
            } else {
                c14978.mo31606();
                c14978.mo15005();
                return new C9757(c14978, c9757.m25434());
            }
        }
    }
}
