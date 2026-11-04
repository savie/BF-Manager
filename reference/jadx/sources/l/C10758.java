package l;

/* JADX INFO: renamed from: l.ۤۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BJO */
/* JADX INFO: loaded from: classes4.dex */
public final class C10758 extends AbstractC19709 {
    @Override // l.AbstractC0078
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1133(C15496 c15496, C15496 c15497) {
        if (c15496 == c15497) {
            return false;
        }
        for (C15496 c15496M37093 = c15497.m37093(); c15496M37093 != null; c15496M37093 = c15496M37093.m37093()) {
            if (this.f63447.mo1133(c15496, c15496M37093)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("%s ~ ", this.f63447);
    }
}
