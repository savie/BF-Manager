package l;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: l.ۡ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: YAMC */
/* JADX INFO: loaded from: classes3.dex */
public final class C9210 {
    public volatile AtomicReferenceArray array;

    public C9210(int i) {
        this.array = new AtomicReferenceArray(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23698() {
        return this.array.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m23699(int i) {
        AtomicReferenceArray atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23700(int i, C2152 c2152) {
        AtomicReferenceArray atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, c2152);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, c2152);
        this.array = atomicReferenceArray2;
    }
}
