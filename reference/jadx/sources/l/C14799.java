package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܰᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8IQX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14799 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f48414;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f48415;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f48416;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f48417;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List f48418;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f48419;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f48420;

    public C14799(long j, long j2, int i, int i2, List list, boolean z, boolean z2) {
        this.f48415 = j;
        this.f48414 = j2;
        this.f48420 = i;
        this.f48419 = i2;
        this.f48418 = list;
        this.f48417 = z;
        this.f48416 = z2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m35636() {
        boolean z = this.f48417;
        List list = this.f48418;
        if (!z) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C4359 c4359 = (C4359) list.get(size);
                arrayList.add(new C4359(c4359.f15740, c4359.f15739, c4359.f15738, c4359.f15737));
            } else {
                return C4681.unmodifiableList(arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m35637() {
        return this.f48418.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4359 m35634() {
        C14799 c14799 = this;
        if (c14799.f48416) {
            throw new IllegalStateException("Reset has no edit coordinates");
        }
        List list = c14799.f48418;
        int i = 1;
        int i2 = 0;
        if (list.isEmpty()) {
            return new C4359(0, 0, 0, 1);
        }
        int i3 = c14799.f48420;
        long j = i3;
        int iMin = i3;
        int iMin2 = iMin;
        while (i2 < list.size()) {
            boolean z = c14799.f48417;
            C4359 c4359 = (C4359) list.get(z ? (list.size() - i) - i2 : i2);
            int i4 = z ? c4359.f15739 : c4359.f15738;
            int i5 = c4359.f15737;
            int i6 = c4359.f15740;
            long j2 = i5;
            long j3 = ((long) i4) * j2;
            long j4 = ((long) (z ? c4359.f15738 : c4359.f15739)) * j2;
            iMin = Math.min(iMin, i6);
            iMin2 = (int) Math.min(iMin2, (j - ((long) i6)) - j3);
            j += j4 - j3;
            i2++;
            i = 1;
            c14799 = this;
            list = list;
        }
        return new C4359(iMin, (i3 - iMin) - iMin2, (this.f48419 - iMin) - iMin2, 1);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m35638() {
        return (((long) this.f48418.size()) * 40) + 64;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14799 m35635(int i, int i2, long j, long j2, boolean z) {
        return new C14799(j, j2, i, i2, this.f48418, this.f48417 ^ z, this.f48416);
    }
}
