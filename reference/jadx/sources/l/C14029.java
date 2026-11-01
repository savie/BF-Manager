package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܰ᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8NY */
/* JADX INFO: loaded from: classes4.dex */
public final class C14029 implements InterfaceC9753 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long[] f46135;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List f46136;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long[] f46137;

    public C14029(ArrayList arrayList) {
        this.f46136 = C0561.unmodifiableList(new ArrayList(arrayList));
        this.f46137 = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            C12287 c12287 = (C12287) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.f46137;
            jArr[i2] = c12287.f41093;
            jArr[i2 + 1] = c12287.f41094;
        }
        long[] jArr2 = this.f46137;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f46135 = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۙ */
    public final int mo15244(long j) {
        long[] jArr = this.f46135;
        int iM41825 = C17983.m41825(jArr, j, false);
        if (iM41825 < jArr.length) {
            return iM41825;
        }
        return -1;
    }

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۙ */
    public final int mo15243() {
        return this.f46135.length;
    }

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۙ */
    public final long mo15245(int i) {
        C2023.m6507(i >= 0);
        long[] jArr = this.f46135;
        C2023.m6507(i < jArr.length);
        return jArr[i];
    }

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۨ */
    public final List mo15247(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.f46136;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = this.f46137;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                C12287 c12287 = (C12287) list.get(i);
                C0612 c0612 = c12287.f41092;
                if (c0612.f2654 == -3.4028235E38f) {
                    arrayList2.add(c12287);
                } else {
                    arrayList.add(c0612);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new C4855(0));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            C20369 c20369M2814 = ((C12287) arrayList2.get(i3)).f41092.m2814();
            c20369M2814.m45998((-1) - i3, 1);
            arrayList.add(c20369M2814.m45996());
        }
        return arrayList;
    }
}
