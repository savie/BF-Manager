package l;

/* JADX INFO: renamed from: l.ᩴ᩵۫, reason: contains not printable characters */
/* JADX INFO: compiled from: BAIH */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20042 extends C13352 {
    /* JADX INFO: renamed from: ۙ */
    public void mo5154(C9097 c9097) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C13352
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return C17359.equals(mo5155(), ((AbstractC20042) obj).mo5155());
        }
        return false;
    }

    @Override // l.C13352
    public final int hashCode() {
        int iHashCode = super.hashCode();
        C9097 c9097Mo5155 = mo5155();
        return (iHashCode * 31) + (c9097Mo5155 != null ? c9097Mo5155.hashCode() : 0);
    }
}
