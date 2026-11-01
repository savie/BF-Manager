package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.᩻ۨܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8NU */
/* JADX INFO: loaded from: classes.dex */
public final class C23679 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C23679 f76611 = new C23679(new C17216[0]);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f76612;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f76613;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f76614;

    static {
        C17983.m41806(0);
    }

    public C23679(C17216... c17216Arr) {
        AbstractC22433 abstractC22433M49800 = AbstractC22433.m49800(c17216Arr);
        this.f76613 = abstractC22433M49800;
        this.f76614 = c17216Arr.length;
        int i = 0;
        while (i < abstractC22433M49800.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < abstractC22433M49800.size(); i3++) {
                if (((C17216) abstractC22433M49800.get(i)).equals(abstractC22433M49800.get(i3))) {
                    C0303.m1854("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17216 m52136(int i) {
        return (C17216) this.f76613.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m52135(C17216 c17216) {
        int iIndexOf = this.f76613.indexOf(c17216);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 m52137() {
        return AbstractC22433.copyOf((Collection) C3051.m9144(this.f76613, new C15037(6)));
    }

    public final int hashCode() {
        if (this.f76612 == 0) {
            this.f76612 = this.f76613.hashCode();
        }
        return this.f76612;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C23679.class == obj.getClass()) {
            C23679 c23679 = (C23679) obj;
            if (this.f76614 == c23679.f76614 && this.f76613.equals(c23679.f76613)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f76613.toString();
    }
}
