package l;

/* JADX INFO: renamed from: l.᩵۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19490 extends AbstractC8907 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f62717;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f62718;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f62719;

    public C19490(int i, int i2, boolean z) {
        this.f62718 = i;
        this.f62719 = i2;
        this.f62717 = z;
    }

    @Override // l.AbstractC8907
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo21489(AbstractC19055 abstractC19055, C8472 c8472) {
        if (!this.f62717) {
            c8472 = null;
        }
        return abstractC19055.mo23677(c8472, this.f62718, this.f62719);
    }

    public final int hashCode() {
        return C4758.m13213(C4758.m13217(C4758.m13217(C4758.m13217(0, this.f62718), this.f62719), this.f62717 ? 1 : 0), 3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19490)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C19490 c19490 = (C19490) obj;
        return this.f62718 == c19490.f62718 && this.f62719 == c19490.f62719 && this.f62717 == c19490.f62717;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.f62718);
        sb.append(":");
        return C12441.m30911(this.f62719, "}?", sb);
    }
}
