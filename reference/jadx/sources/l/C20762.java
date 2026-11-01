package l;

/* JADX INFO: renamed from: l.᩷ۡ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: N7UA */
/* JADX INFO: loaded from: classes4.dex */
public final class C20762 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f67561;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f67562;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f67563;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f67564;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f67565;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f67566;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20762 m46761(int i, AbstractC12068 abstractC12068) {
        if (abstractC12068 instanceof C8768) {
            return new C20762(i, (C8768) abstractC12068);
        }
        throw new RuntimeException();
    }

    public C20762(int i, C8768 c8768) {
        this.f67566 = i;
        this.f67561 = c8768.f30163;
        this.f67563 = c8768.f30165;
        this.f67562 = c8768.f30164;
        this.f67564 = c8768.f30166;
        this.f67565 = c8768.f30167;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20762.class == obj.getClass()) {
            C20762 c20762 = (C20762) obj;
            if (this.f67566 == c20762.f67566 && this.f67565 == c20762.f67565 && this.f67561.equals(c20762.f67561) && this.f67563.equals(c20762.f67563) && this.f67562.equals(c20762.f67562) && this.f67564.equals(c20762.f67564)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13958.m33812(C13958.m33812(C13958.m33812(C13958.m33812(this.f67566 * 31, 31, this.f67561), 31, this.f67563), 31, this.f67562), 31, this.f67564) + (this.f67565 ? 1231 : 1237);
    }
}
