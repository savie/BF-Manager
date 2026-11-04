package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAX7 */
/* JADX INFO: loaded from: classes4.dex */
public class C18973 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f61513;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f61514;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f61515;

    public C18973(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f61513 = i;
        this.f61515 = C16237.m38538(i, i2, i3);
        this.f61514 = i3;
    }

    public final int getFirst() {
        return this.f61513;
    }

    public final int getLast() {
        return this.f61515;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m44068() {
        return this.f61514;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C10022(this.f61513, this.f61515, this.f61514);
    }

    public boolean isEmpty() {
        int i = this.f61514;
        int i2 = this.f61515;
        int i3 = this.f61513;
        if (i > 0) {
            return i3 > i2;
        }
        return i3 < i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C18973)) {
            return false;
        }
        if (isEmpty() && ((C18973) obj).isEmpty()) {
            return true;
        }
        C18973 c18973 = (C18973) obj;
        return this.f61513 == c18973.f61513 && this.f61515 == c18973.f61515 && this.f61514 == c18973.f61514;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f61513 * 31) + this.f61515) * 31) + this.f61514;
    }

    public String toString() {
        int i = this.f61515;
        int i2 = this.f61513;
        int i3 = this.f61514;
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
