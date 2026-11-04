package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: FIQP */
/* JADX INFO: loaded from: classes3.dex */
public final class C7651 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0193 f25216;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C0939 f25217;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f25218;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f25219 = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20865(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        if (i4 == 0 && i5 == 0) {
            return;
        }
        ArrayList arrayList = this.f25219;
        if (arrayList.size() >= 100000) {
            C9141 c9141 = (C9141) C18011.m41990(arrayList, 1);
            this.f25218 = c9141.f29709;
            i7 = c9141.f29708;
            i8 = c9141.f29711;
            i9 = i4 + c9141.f29713;
            i10 = i5 + c9141.f29710;
            i6 = 4;
        } else {
            i6 = i;
            i7 = i2;
            i8 = i3;
            i9 = i4;
            i10 = i5;
        }
        if (i9 == 0) {
            i6 = 3;
        } else if (i10 == 0) {
            i6 = 2;
        }
        if (arrayList.isEmpty()) {
            i11 = i7;
            i12 = i8;
        } else {
            C9141 c9142 = (C9141) j$$ExternalSyntheticOutline0.m(arrayList, 1);
            int i13 = c9142.f29712;
            int i14 = c9142.f29710;
            i12 = c9142.f29711;
            int i15 = c9142.f29713;
            int i16 = c9142.f29708;
            if (i13 == i6 && i16 + i15 == i7 && i12 + i14 == i8 && (i6 == 0 || i6 == 2 || i6 == 3 || (i15 == i14 && i9 == i10))) {
                C2764.m9138(arrayList, 1);
                this.f25218 = c9142.f29709;
                i9 += i15;
                i10 += i14;
                i11 = i16;
            } else {
                i11 = i7;
                i12 = i8;
            }
        }
        arrayList.add(new C9141(i6, i11, i12, i9, i10, this.f25218, i6));
        this.f25218 += (long) Math.max(i9, i10);
    }
}
