package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܿۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes4.dex */
public final class C18031 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f59031 = -1;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0132 f59032;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f59033;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f59034;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C1074 f59035;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C18031(C0132 c0132) {
        this.f59032 = c0132;
        int length = ((String) c0132.f1095).length();
        if (length < 0) {
            throw new IllegalArgumentException(C14442.m34864(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f59033 = length;
        this.f59034 = length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m42035() {
        int i = this.f59034;
        if (i < 0) {
            this.f59031 = 0;
            this.f59035 = null;
            return;
        }
        C0132 c0132 = this.f59032;
        if (i <= ((String) c0132.f1095).length()) {
            C21914 c21914 = (C21914) ((C21935) c0132.f1094).mo3124(c0132.f1095, Integer.valueOf(this.f59034));
            if (c21914 == null) {
                this.f59035 = new C1074(this.f59033, C10746.m27408(c0132.f1095), 1);
                this.f59034 = -1;
            } else {
                int iIntValue = ((Number) c21914.m49600()).intValue();
                int iIntValue2 = ((Number) c21914.m49602()).intValue();
                this.f59035 = iIntValue <= Integer.MIN_VALUE ? C1074.f3854 : new C1074(this.f59033, iIntValue - 1, 1);
                int i2 = iIntValue + iIntValue2;
                this.f59033 = i2;
                this.f59034 = i2 + (iIntValue2 == 0 ? 1 : 0);
            }
        } else {
            this.f59035 = new C1074(this.f59033, C10746.m27408(c0132.f1095), 1);
            this.f59034 = -1;
        }
        this.f59031 = 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f59031 == -1) {
            m42035();
        }
        if (this.f59031 == 0) {
            throw new NoSuchElementException();
        }
        C1074 c1074 = this.f59035;
        C15243.m36587((Object) c1074, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f59035 = null;
        this.f59031 = -1;
        return c1074;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f59031 == -1) {
            m42035();
        }
        return this.f59031 == 1;
    }
}
