package l;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ܿ۟۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 79A7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17199 extends AbstractC5910 implements RandomAccess {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC5910 f54840;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f54841;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f54842;

    public C17199(AbstractC5910 abstractC5910, int i, int i2) {
        this.f54840 = abstractC5910;
        this.f54842 = i;
        C0265.m1765(i, i2, abstractC5910.mo39302());
        this.f54841 = i2 - i;
    }

    @Override // l.AbstractC20022
    /* JADX INFO: renamed from: ܰ */
    public final int mo39302() {
        return this.f54841;
    }

    @Override // l.AbstractC5910, java.util.List
    public final List subList(int i, int i2) {
        C0265.m1765(i, i2, this.f54841);
        int i3 = this.f54842;
        return new C17199(this.f54840, i + i3, i3 + i2);
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f54841;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C2271.m6967("index: ", i, i2, ", size: "));
        }
        return this.f54840.get(this.f54842 + i);
    }
}
