package l;

import java.util.BitSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۙۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAJX */
/* JADX INFO: loaded from: classes2.dex */
public final class C4822 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet f16867;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14852(C24960 c24960) {
        BitSet bitSet;
        C3046 c3046M47896;
        C3046 c3046M47897;
        C4822 c4822 = new C4822(c24960);
        int iM55737 = c24960.m55737();
        int i = 0;
        while (true) {
            bitSet = c4822.f16867;
            if (i >= iM55737) {
                break;
            }
            AbstractC5568 abstractC5568M55738 = c24960.m55738(i);
            if (abstractC5568M55738 != null && abstractC5568M55738.m16508().mo8408() == 0) {
                bitSet.set(i);
            }
            i++;
        }
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(0);
            if (iNextSetBit < 0) {
                return;
            }
            bitSet.clear(iNextSetBit);
            C14033 c14033 = (C14033) c24960.m55738(iNextSetBit);
            c14033.m34184(c24960);
            C0063 c0063Mo4992 = c14033.mo4992();
            int size = c0063Mo4992.size();
            int i2 = -1;
            C20946 c20946 = null;
            for (int i3 = 0; i3 < size; i3++) {
                C20946 c20946M31619get = c0063Mo4992.m31619get(i3);
                if (c20946M31619get.mo8408() != 0) {
                    i2 = i3;
                    c20946 = c20946M31619get;
                }
            }
            if (c20946 != null) {
                C3046 c3046M47898 = c20946.m47896();
                InterfaceC22239 type = c20946.getType();
                boolean z = true;
                for (int i4 = 0; i4 < size; i4++) {
                    if (i4 != i2) {
                        C20946 c20946M31619get2 = c0063Mo4992.m31619get(i4);
                        if (c20946M31619get2.mo8408() != 0) {
                            z = z && (c3046M47898 == (c3046M47897 = c20946M31619get2.m47896()) || (c3046M47898 != null && c3046M47898.equals(c3046M47897)));
                            type = C2083.m7175(type, c20946M31619get2.getType());
                        }
                    }
                }
                if (type == null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i5 = 0; i5 < size; i5++) {
                        sb.append(c0063Mo4992.m31619get(i5).toString());
                        sb.append(' ');
                    }
                    throw new RuntimeException("Couldn't map types in phi insn:" + ((Object) sb));
                }
                C3046 c3046 = z ? c3046M47898 : null;
                C20946 c20946M16508 = c14033.m16508();
                if (c20946M16508.m47898() != type || (c3046 != (c3046M47896 = c20946M16508.m47896()) && (c3046 == null || !c3046.equals(c3046M47896)))) {
                    c14033.m16504(C20946.m47886(c14033.m16508().m47903(), type, c3046));
                    List listM55752 = c24960.m55752(iNextSetBit);
                    int size2 = listM55752.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        AbstractC5568 abstractC5568 = (AbstractC5568) listM55752.get(i6);
                        C20946 c20946M16509 = abstractC5568.m16508();
                        if (c20946M16509 != null && (abstractC5568 instanceof C14033)) {
                            bitSet.set(c20946M16509.m47903());
                        }
                    }
                }
            }
        }
    }

    public C4822(C24960 c24960) {
        this.f16867 = new BitSet(c24960.m55737());
    }
}
