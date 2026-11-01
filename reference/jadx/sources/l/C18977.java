package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06PW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18977 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f61429;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17367 f61431;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f61432;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f61428 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f61430 = new Object();

    public C18977(C17367 c17367) {
        this.f61431 = c17367;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14744 m43677() {
        int i;
        C17367 c17367 = this.f61431;
        int i2 = c17367.readInt();
        int i3 = c17367.readInt();
        if (i2 < 8 || i2 > 65536 || (i2 & 1) != 0 || i3 < 4 || i3 > 256 || (i3 & 1) != 0 || ((i = this.f61429) != 0 && (i != i2 || this.f61432 != i3))) {
            throw new IllegalArgumentException("Invalid text graph configuration");
        }
        this.f61429 = i2;
        this.f61432 = i3;
        return new C14744(m43676(0), i2, i3, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC0631 m43676(int i) {
        AbstractC0631 c1337;
        if (i > 32) {
            throw new IllegalArgumentException("Text graph is too deep");
        }
        C17367 c17367 = this.f61431;
        int i2 = c17367.readInt();
        if (i2 == -1) {
            return null;
        }
        if (i2 >= 0) {
            ArrayList arrayList = this.f61428;
            if (i2 <= arrayList.size()) {
                if (i2 < arrayList.size()) {
                    AbstractC0631 abstractC0631 = (AbstractC0631) arrayList.get(i2);
                    if (abstractC0631 != null) {
                        return abstractC0631;
                    }
                    throw new IllegalArgumentException("Cyclic text graph");
                }
                arrayList.add(null);
                int i3 = c17367.readByte() & 255;
                int i4 = c17367.readInt();
                Object obj = this.f61430;
                if (i3 == 1) {
                    int i5 = c17367.readByte() & 255;
                    if (i4 >= 1 && i4 <= this.f61429 && i5 <= 1) {
                        if (((long) i4) * ((long) (i5 == 1 ? 1 : 2)) <= c17367.available()) {
                            char[] cArr = new char[i4];
                            for (int i6 = 0; i6 < i4; i6++) {
                                cArr[i6] = i5 == 1 ? (char) (c17367.readByte() & 255) : c17367.m40443();
                            }
                            c1337 = new C16155(obj, this.f61429, cArr, 0, i4, null);
                        }
                    }
                    throw new IllegalArgumentException("Invalid text page length");
                }
                if (i3 == 2) {
                    if (i4 < 2 || i4 > this.f61432 || i4 > c17367.available() / 4) {
                        throw new IllegalArgumentException("Invalid text branch size");
                    }
                    AbstractC0631[] abstractC0631Arr = new AbstractC0631[i4];
                    for (int i7 = 0; i7 < i4; i7++) {
                        AbstractC0631 abstractC0631M43676 = m43676(i + 1);
                        abstractC0631Arr[i7] = abstractC0631M43676;
                        if (abstractC0631M43676 == null || (i7 > 0 && abstractC0631M43676.f2724 != abstractC0631Arr[0].f2724)) {
                            throw new IllegalArgumentException("Invalid text branch height");
                        }
                    }
                    c1337 = new C1337(obj, abstractC0631Arr);
                } else {
                    throw new IllegalArgumentException("Invalid text node type");
                }
                arrayList.set(i2, c1337);
                return c1337;
            }
        }
        throw new IllegalArgumentException("Invalid text node identity");
    }
}
