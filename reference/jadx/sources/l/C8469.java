package l;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۠᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBAU */
/* JADX INFO: loaded from: classes3.dex */
public final class C8469 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7971 f29369;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f29370;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17661 f29371;

    public C8469(C17661 c17661, int[] iArr, C7971 c7971) {
        if (iArr == null) {
            throw new NullPointerException("order == null");
        }
        if (c7971 == null) {
            throw new NullPointerException("addresses == null");
        }
        this.f29371 = c17661;
        this.f29370 = iArr;
        this.f29369 = c7971;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m22121() {
        C5667 c5667M41141 = this.f29371.m41141();
        int size = c5667M41141.size();
        for (int i = 0; i < size; i++) {
            if (c5667M41141.m15271get(i).m29914().mo6700().size() != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashSet m22122() {
        HashSet hashSet = new HashSet(20);
        C5667 c5667M41141 = this.f29371.m41141();
        int size = c5667M41141.size();
        for (int i = 0; i < size; i++) {
            InterfaceC14093 interfaceC14093Mo6700 = c5667M41141.m15271get(i).m29914().mo6700();
            int size2 = interfaceC14093Mo6700.size();
            for (int i2 = 0; i2 < size2; i2++) {
                hashSet.add(interfaceC14093Mo6700.getType(i2));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7265 m22120() {
        int[] iArr;
        C8677 c8677;
        C8469 c8469 = this;
        int[] iArr2 = c8469.f29370;
        int length = iArr2.length;
        C5667 c5667M41141 = c8469.f29371.m41141();
        ArrayList arrayList = new ArrayList(length);
        C8677 c8678 = C8677.f29876;
        C12018 c12018 = null;
        C12018 c12019 = null;
        int i = 0;
        while (true) {
            C7971 c7971 = c8469.f29369;
            if (i < length) {
                C12018 c12018M15553 = c5667M41141.m15553(iArr2[i]);
                if (c12018M15553.m29917()) {
                    C4129 c4129M29916 = c12018M15553.m29916();
                    int size = c4129M29916.size();
                    int iM29918 = c12018M15553.m29918();
                    InterfaceC14093 interfaceC14093Mo6700 = c12018M15553.m29914().mo6700();
                    int size2 = interfaceC14093Mo6700.size();
                    if (size2 == 0) {
                        c8677 = C8677.f29876;
                        iArr = iArr2;
                    } else if ((iM29918 != -1 || size == size2) && (iM29918 == -1 || (size == size2 + 1 && iM29918 == c4129M29916.get(size2)))) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            if (interfaceC14093Mo6700.getType(i2).equals(C3320.f12289)) {
                                size2 = i2 + 1;
                                break;
                            }
                        }
                        C8677 c8679 = new C8677(size2);
                        int i3 = 0;
                        while (i3 < size2) {
                            c8679.m22502(i3, new C6143(interfaceC14093Mo6700.getType(i3)), c7971.m21027(c4129M29916.get(i3)).m38698());
                            i3++;
                            iArr2 = iArr2;
                        }
                        iArr = iArr2;
                        c8679.mo9637();
                        c8677 = c8679;
                    } else {
                        throw new RuntimeException("shouldn't happen: weird successors list");
                    }
                    if (c8678.size() != 0) {
                        if (c8678.equals(c8677)) {
                            if (c12018 == null) {
                                throw new NullPointerException("start == null");
                            }
                            if (c7971.m21028(c12018M15553).m38698() - c7971.m21030(c12018).m38698() <= 65535) {
                                c12019 = c12018M15553;
                            }
                        }
                        if (c8678.size() != 0) {
                            arrayList.add(new C10088(c7971.m21030(c12018).m38698(), c7971.m21028(c12019).m38698(), c8678));
                        }
                        c12018 = c12018M15553;
                        c12019 = c12018;
                        c8678 = c8677;
                    } else {
                        c12018 = c12018M15553;
                        c12019 = c12018;
                        c8678 = c8677;
                    }
                } else {
                    iArr = iArr2;
                }
                i++;
                c8469 = this;
                iArr2 = iArr;
            } else {
                if (c8678.size() != 0) {
                    arrayList.add(new C10088(c7971.m21030(c12018).m38698(), c7971.m21028(c12019).m38698(), c8678));
                }
                int size3 = arrayList.size();
                if (size3 != 0) {
                    C7265 c7265 = new C7265(size3);
                    for (int i4 = 0; i4 < size3; i4++) {
                        c7265.m15258(i4, (C10088) arrayList.get(i4));
                    }
                    c7265.mo9637();
                    return c7265;
                }
                return C7265.f24181;
            }
        }
    }
}
