package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L8NY */
/* JADX INFO: loaded from: classes5.dex */
public final class C21038 implements InterfaceC24393 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f67247;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long[] f67248;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long[] f67249;

    public C21038(ArrayList arrayList) {
        this.f67247 = C4681.unmodifiableList(new ArrayList(arrayList));
        this.f67249 = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            C17308 c17308 = (C17308) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.f67249;
            jArr[i2] = c17308.f56369;
            jArr[i2 + 1] = c17308.f56370;
        }
        long[] jArr2 = this.f67249;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f67248 = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۙ */
    public final int mo21768(long j) {
        long[] jArr = this.f67248;
        int iM19472 = C7116.m19472(jArr, j, false);
        if (iM19472 < jArr.length) {
            return iM19472;
        }
        return -1;
    }

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۙ */
    public final int mo21767() {
        return this.f67248.length;
    }

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۙ */
    public final long mo21769(int i) {
        C20782.m47565(i >= 0);
        long[] jArr = this.f67248;
        C20782.m47565(i < jArr.length);
        return jArr[i];
    }

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۤ */
    public final List mo21771(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.f67247;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = this.f67249;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                C17308 c17308 = (C17308) list.get(i);
                C2137 c2137 = c17308.f56368;
                if (c2137.f7048 == -3.4028235E38f) {
                    arrayList2.add(c17308);
                } else {
                    arrayList.add(c2137);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new C14324(0));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            C5866 c5866M7381 = ((C17308) arrayList2.get(i3)).f56368.m7381();
            c5866M7381.m17075((-1) - i3, 1);
            arrayList.add(c5866M7381.m17073());
        }
        return arrayList;
    }
}
