package l;

/* JADX INFO: renamed from: l.ۚ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: BAIH */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5362 extends C15404 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo14868(C11731 c11731) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C15404
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return C13638.equals(mo7971(), ((AbstractC5362) obj).mo7971());
        }
        return false;
    }

    @Override // l.C15404
    public final int hashCode() {
        int iHashCode = super.hashCode();
        C11731 c11731Mo7971 = mo7971();
        return (iHashCode * 31) + (c11731Mo7971 != null ? c11731Mo7971.hashCode() : 0);
    }
}
