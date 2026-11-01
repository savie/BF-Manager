package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩷ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes4.dex */
public final class C20995 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f68360;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16057 f68361;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f68362;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f68363 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C16287 f68364;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C20995(C16057 c16057) {
        this.f68361 = c16057;
        int length = ((String) c16057.f51950).length();
        if (length < 0) {
            throw new IllegalArgumentException(C2271.m6966(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f68362 = length;
        this.f68360 = length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m47158() {
        int i = this.f68360;
        if (i < 0) {
            this.f68363 = 0;
            this.f68364 = null;
            return;
        }
        C16057 c16057 = this.f68361;
        if (i <= ((String) c16057.f51950).length()) {
            C15083 c15083 = (C15083) ((C9707) c16057.f51949).mo3208(c16057.f51950, Integer.valueOf(this.f68360));
            if (c15083 == null) {
                this.f68364 = new C16287(this.f68362, C3355.m10010(c16057.f51950), 1);
                this.f68360 = -1;
            } else {
                int iIntValue = ((Number) c15083.m36157()).intValue();
                int iIntValue2 = ((Number) c15083.m36159()).intValue();
                this.f68364 = iIntValue <= Integer.MIN_VALUE ? C16287.f52462 : new C16287(this.f68362, iIntValue - 1, 1);
                int i2 = iIntValue + iIntValue2;
                this.f68362 = i2;
                this.f68360 = i2 + (iIntValue2 == 0 ? 1 : 0);
            }
        } else {
            this.f68364 = new C16287(this.f68362, C3355.m10010(c16057.f51950), 1);
            this.f68360 = -1;
        }
        this.f68363 = 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f68363 == -1) {
            m47158();
        }
        if (this.f68363 == 0) {
            throw new NoSuchElementException();
        }
        C16287 c16287 = this.f68364;
        C13465.m32963((Object) c16287, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f68364 = null;
        this.f68363 = -1;
        return c16287;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f68363 == -1) {
            m47158();
        }
        return this.f68363 == 1;
    }
}
