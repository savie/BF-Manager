package l;

/* JADX INFO: renamed from: l.֨ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: GISE */
/* JADX INFO: loaded from: classes2.dex */
public final class C1381 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23435 f4928;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC18213 f4929;

    public C1381(InterfaceC18213 interfaceC18213, InterfaceC23435 interfaceC23435) {
        this.f4929 = interfaceC18213;
        this.f4928 = interfaceC23435;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1381.class == obj.getClass()) {
            C1381 c1381 = (C1381) obj;
            if (C17359.equals(this.f4929, c1381.f4929) && C17359.equals(this.f4928, c1381.f4928)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hash(this.f4929, this.f4928);
    }

    public final String toString() {
        return "UsePlace{region=" + this.f4929 + ", block=" + this.f4928 + '}';
    }
}
