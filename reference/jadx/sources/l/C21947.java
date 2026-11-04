package l;

/* JADX INFO: renamed from: l.᩷ۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BJO */
/* JADX INFO: loaded from: classes.dex */
public final class C21947 extends AbstractC19709 {
    @Override // l.AbstractC0078
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1133(C15496 c15496, C15496 c15497) {
        if (c15496 == c15497) {
            return false;
        }
        for (C15496 c15496Mo37068 = c15497.mo37068(); c15496Mo37068 != null; c15496Mo37068 = c15496Mo37068.mo37068()) {
            if (this.f63447.mo1133(c15496, c15496Mo37068)) {
                return true;
            }
            if (c15496Mo37068 == c15496) {
                return false;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("%s ", this.f63447);
    }
}
