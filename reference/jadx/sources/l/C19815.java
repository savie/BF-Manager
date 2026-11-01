package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: NAX7 */
/* JADX INFO: loaded from: classes4.dex */
public class C19815 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f63614;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f63615;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f63616;

    public C19815(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f63615 = i;
        this.f63616 = C1238.m4435(i, i2, i3);
        this.f63614 = i3;
    }

    public final int getFirst() {
        return this.f63615;
    }

    public final int getLast() {
        return this.f63616;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m45056() {
        return this.f63614;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0058(this.f63615, this.f63616, this.f63614);
    }

    public boolean isEmpty() {
        int i = this.f63614;
        int i2 = this.f63616;
        int i3 = this.f63615;
        if (i > 0) {
            return i3 > i2;
        }
        return i3 < i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C19815)) {
            return false;
        }
        if (isEmpty() && ((C19815) obj).isEmpty()) {
            return true;
        }
        C19815 c19815 = (C19815) obj;
        return this.f63615 == c19815.f63615 && this.f63616 == c19815.f63616 && this.f63614 == c19815.f63614;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f63615 * 31) + this.f63616) * 31) + this.f63614;
    }

    public String toString() {
        int i = this.f63616;
        int i2 = this.f63615;
        int i3 = this.f63614;
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        if (i3 > 0) {
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
