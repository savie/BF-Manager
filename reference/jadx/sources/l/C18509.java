package l;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ܿᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBEC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18509 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f60194;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0610 f60195;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24960 f60196;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final BitSet f60197;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0610 m43098(C24960 c24960) {
        C18509 c18509;
        C18509 c185010;
        C18509 c185011 = new C18509(c24960);
        C24960 c24961 = c185011.f60196;
        int iM55737 = c24961.m55737();
        C0610 c0610 = c185011.f60195;
        if (iM55737 > 0) {
            int iM55751 = c24961.m55751();
            while (iM55751 >= 0) {
                BitSet bitSet = c185011.f60197;
                bitSet.clear(iM55751);
                C7521 c7521M2730 = c0610.m2730(iM55751);
                C19738 c19738 = (C19738) c185011.f60194.get(iM55751);
                ArrayList arrayListM45460 = c19738.m45460();
                int size = arrayListM45460.size();
                if (iM55751 == c24961.m55742()) {
                    c18509 = c185011;
                } else {
                    int i = size - 1;
                    AbstractC5568 abstractC5568 = (AbstractC5568) arrayListM45460.get(i);
                    boolean z = (abstractC5568.mo4993().mo7781().size() == 0 || abstractC5568.m16508() == null) ? false : true;
                    int i2 = 0;
                    C7521 c7521M20588 = c7521M2730;
                    while (i2 < size) {
                        if (z && i2 == i) {
                            c7521M20588.mo15005();
                            c7521M20588 = c7521M20588.m20588();
                        }
                        AbstractC5568 abstractC5569 = (AbstractC5568) arrayListM45460.get(i2);
                        C20946 c20946Mo4991 = abstractC5569.mo4991();
                        if (c20946Mo4991 == null) {
                            C20946 c20946M16508 = abstractC5569.m16508();
                            if (c20946M16508 != null && c7521M20588.get(c20946M16508.m47903()) != null) {
                                c7521M20588.m20589(c7521M20588.get(c20946M16508.m47903()));
                            }
                        } else {
                            C20946 c20946M47888 = c20946Mo4991.m47888();
                            c7521M20588.getClass();
                            if (!c20946M47888.equals(c7521M20588.get(c20946M47888.m47903()))) {
                                C20946 c20946M20585 = c7521M20588.m20585(c20946M47888.m47896());
                                if (c20946M20585 != null) {
                                    c185010 = c185011;
                                    if (c20946M20585.m47903() != c20946M47888.m47903()) {
                                        c7521M20588.m20589(c20946M20585);
                                    }
                                } else {
                                    c185010 = c185011;
                                }
                                c0610.m2728(abstractC5569, c20946M47888);
                                c7521M20588.m20592(c20946M47888);
                            }
                            i2++;
                            c185011 = c185010;
                        }
                        c185010 = c185011;
                        i2++;
                        c185011 = c185010;
                    }
                    c18509 = c185011;
                    c7521M20588.mo15005();
                    C24698 c24698M45469 = c19738.m45469();
                    int size2 = c24698M45469.size();
                    int iM45448 = c19738.m45448();
                    for (int i3 = 0; i3 < size2; i3++) {
                        int i4 = c24698M45469.get(i3);
                        if (c0610.m2729(i4, i4 == iM45448 ? c7521M20588 : c7521M2730)) {
                            bitSet.set(i4);
                        }
                    }
                }
                iM55751 = bitSet.nextSetBit(0);
                c185011 = c18509;
            }
        }
        c0610.mo15005();
        return c0610;
    }

    public C18509(C24960 c24960) {
        ArrayList arrayListM55749 = c24960.m55749();
        this.f60196 = c24960;
        this.f60194 = arrayListM55749;
        this.f60195 = new C0610(c24960);
        this.f60197 = new BitSet(arrayListM55749.size());
    }
}
