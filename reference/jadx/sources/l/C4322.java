package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 06PW */
/* JADX INFO: loaded from: classes2.dex */
public final class C4322 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f15664;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20348 f15665;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f15667;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f15668 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object f15666 = new Object();

    public C4322(C20348 c20348) {
        this.f15665 = c20348;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21697 m13817() {
        int i;
        C20348 c20348 = this.f15665;
        int i2 = c20348.readInt();
        int i3 = c20348.readInt();
        if (i2 < 8 || i2 > 65536 || (i2 & 1) != 0 || i3 < 4 || i3 > 256 || (i3 & 1) != 0 || ((i = this.f15664) != 0 && (i != i2 || this.f15667 != i3))) {
            throw new IllegalArgumentException("Invalid text graph configuration");
        }
        this.f15664 = i2;
        this.f15667 = i3;
        return new C21697(m13816(0), i2, i3, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC1339 m13816(int i) {
        AbstractC1339 c17746;
        if (i > 32) {
            throw new IllegalArgumentException("Text graph is too deep");
        }
        C20348 c20348 = this.f15665;
        int i2 = c20348.readInt();
        if (i2 == -1) {
            return null;
        }
        if (i2 >= 0) {
            ArrayList arrayList = this.f15668;
            if (i2 <= arrayList.size()) {
                if (i2 < arrayList.size()) {
                    AbstractC1339 abstractC1339 = (AbstractC1339) arrayList.get(i2);
                    if (abstractC1339 != null) {
                        return abstractC1339;
                    }
                    throw new IllegalArgumentException("Cyclic text graph");
                }
                arrayList.add(null);
                int i3 = c20348.readByte() & 255;
                int i4 = c20348.readInt();
                Object obj = this.f15666;
                if (i3 == 1) {
                    int i5 = c20348.readByte() & 255;
                    if (i4 >= 1 && i4 <= this.f15664 && i5 <= 1) {
                        if (((long) i4) * ((long) (i5 == 1 ? 1 : 2)) <= c20348.available()) {
                            char[] cArr = new char[i4];
                            for (int i6 = 0; i6 < i4; i6++) {
                                cArr[i6] = i5 == 1 ? (char) (c20348.readByte() & 255) : c20348.m46751();
                            }
                            c17746 = new C19238(obj, this.f15664, cArr, 0, i4, null);
                        }
                    }
                    throw new IllegalArgumentException("Invalid text page length");
                }
                if (i3 == 2) {
                    if (i4 < 2 || i4 > this.f15667 || i4 > c20348.available() / 4) {
                        throw new IllegalArgumentException("Invalid text branch size");
                    }
                    AbstractC1339[] abstractC1339Arr = new AbstractC1339[i4];
                    for (int i7 = 0; i7 < i4; i7++) {
                        AbstractC1339 abstractC1339M13816 = m13816(i + 1);
                        abstractC1339Arr[i7] = abstractC1339M13816;
                        if (abstractC1339M13816 == null || (i7 > 0 && abstractC1339M13816.f4791 != abstractC1339Arr[0].f4791)) {
                            throw new IllegalArgumentException("Invalid text branch height");
                        }
                    }
                    c17746 = new C17746(obj, abstractC1339Arr);
                } else {
                    throw new IllegalArgumentException("Invalid text node type");
                }
                arrayList.set(i2, c17746);
                return c17746;
            }
        }
        throw new IllegalArgumentException("Invalid text node identity");
    }
}
