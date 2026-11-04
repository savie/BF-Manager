package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۗۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8NU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3356 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C3356 f10962 = new C3356(new C16549[0]);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f10963;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f10964;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f10965;

    static {
        C7116.m19499(0);
    }

    public C3356(C16549... c16549Arr) {
        AbstractC1928 abstractC1928M6615 = AbstractC1928.m6615(c16549Arr);
        this.f10964 = abstractC1928M6615;
        this.f10965 = c16549Arr.length;
        int i = 0;
        while (i < abstractC1928M6615.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < abstractC1928M6615.size(); i3++) {
                if (((C16549) abstractC1928M6615.get(i)).equals(abstractC1928M6615.get(i3))) {
                    C1896.m6516("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16549 m11056(int i) {
        return (C16549) this.f10964.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m11054(C16549 c16549) {
        int iIndexOf = this.f10964.indexOf(c16549);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 m11055() {
        return AbstractC1928.copyOf((Collection) C4583.m14373(this.f10964, new C24966(5)));
    }

    public final int hashCode() {
        if (this.f10963 == 0) {
            this.f10963 = this.f10964.hashCode();
        }
        return this.f10963;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3356.class == obj.getClass()) {
            C3356 c3356 = (C3356) obj;
            if (this.f10965 == c3356.f10965 && this.f10964.equals(c3356.f10964)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f10964.toString();
    }
}
