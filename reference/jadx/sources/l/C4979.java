package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۙܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B8MR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4979 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f17313;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f17314;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f17317;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f17318;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C8839 f17311 = new C8839();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C7348 f17310 = new C7348();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C14059[] f17316 = new C14059[5];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f17315 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f17312 = -1;

    public C4979(int i) {
        this.f17317 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m15186() {
        this.f17315.clear();
        this.f17312 = -1;
        this.f17313 = 0;
        this.f17314 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15185(float f, int i) {
        C14059 c14059;
        int i2 = this.f17312;
        ArrayList arrayList = this.f17315;
        if (i2 != 1) {
            Collections.sort(arrayList, f17311);
            this.f17312 = 1;
        }
        int i3 = this.f17318;
        C14059[] c14059Arr = this.f17316;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f17318 = i4;
            c14059 = c14059Arr[i4];
        } else {
            c14059 = new C14059(0);
        }
        int i5 = this.f17313;
        this.f17313 = i5 + 1;
        c14059.f44514 = i5;
        c14059.f44515 = i;
        c14059.f44516 = f;
        arrayList.add(c14059);
        this.f17314 += i;
        while (true) {
            int i6 = this.f17314;
            int i7 = this.f17317;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            C14059 c140510 = (C14059) arrayList.get(0);
            int i9 = c140510.f44515;
            if (i9 <= i8) {
                this.f17314 -= i9;
                arrayList.remove(0);
                int i10 = this.f17318;
                if (i10 < 5) {
                    this.f17318 = i10 + 1;
                    c14059Arr[i10] = c140510;
                }
            } else {
                c140510.f44515 = i9 - i8;
                this.f17314 -= i8;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m15184() {
        int i = this.f17312;
        ArrayList arrayList = this.f17315;
        if (i != 0) {
            Collections.sort(arrayList, f17310);
            this.f17312 = 0;
        }
        float f = this.f17314 * 0.5f;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C14059 c14059 = (C14059) arrayList.get(i3);
            i2 += c14059.f44515;
            if (i2 >= f) {
                return c14059.f44516;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((C14059) j$$ExternalSyntheticOutline0.m(arrayList, 1)).f44516;
    }
}
