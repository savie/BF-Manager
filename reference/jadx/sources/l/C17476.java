package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܿܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P4QJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17476 extends AbstractC9011 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C1953 f55606;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14655 f55607;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f55608;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f55609;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C9716 f55610;

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final int mo6315(int i) {
        return i + 12;
    }

    public C17476(C12063 c12063) {
        super(c12063);
        this.f55608 = 0;
        this.f55609 = null;
    }

    public C17476(C12063 c12063, C1953 c1953, C9716 c9716) {
        this(c12063);
        String strM6321 = c1953.m6321();
        if (c9716 != null) {
            StringBuilder sbM23356 = C9023.m23356(strM6321);
            StringBuilder sb = new StringBuilder();
            for (C1953 c1954 : c9716.f32710) {
                sb.append(c1954.m6321());
            }
            sbM23356.append(sb.toString());
            strM6321 = sbM23356.toString();
        }
        this.f55607 = C14655.m35175(strM6321, c12063);
        this.f55606 = c1953;
        this.f55610 = c9716;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17476 m40671(C12063 c12063, C1953 c1953, C9716 c9716) {
        return (C17476) c12063.f40365.m28060(new C17476(c12063, c1953, c9716));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17476 m40674(C12063 c12063) {
        C1953 c1953M6312 = C1953.m6312(this.f55606.m6314(), c12063);
        C9716 c9716 = this.f55610;
        return (C17476) c12063.f40365.m28060(new C17476(c12063, c1953M6312, c9716 != null ? c9716.m24675(c12063) : null));
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6320(C13825 c13825, C6187 c6187) {
        C12063 c12063 = this.f30808;
        this.f55607 = (C14655) c12063.f40354.m44688(c13825.m33642());
        this.f55606 = (C1953) c12063.f40367.m44688(c13825.m33642());
        this.f55610 = (C9716) c6187.m17187(EnumC21004.TYPE_TYPE_LIST, c13825.m33642());
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6319(C4651 c4651) {
        c4651.m12839(this.f55607.f30809);
        c4651.m12839(this.f55606.f30809);
        C9716 c9716 = this.f55610;
        c4651.m12839(c9716 == null ? 0 : c9716.f30807);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C17476 c17476) {
        int iCompareTo = this.f55606.compareTo(c17476.f55606);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        C9716 c9716 = this.f55610;
        if (c9716 == null) {
            return c17476.f55610 == null ? 0 : -1;
        }
        C9716 c9717 = c17476.f55610;
        if (c9717 == null) {
            return 1;
        }
        return c9716.compareTo(c9717);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final String mo6317() {
        return "proto_id_item: " + m40672();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m40672() {
        if (this.f55609 == null) {
            StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
            C9716 c9716 = this.f55610;
            if (c9716 != null) {
                sb.append(c9716.m24674(""));
            }
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            sb.append(this.f55606.m6314());
            this.f55609 = sb.toString();
        }
        return this.f55609;
    }

    public final int hashCode() {
        if (this.f55608 == 0) {
            int iHashCode = this.f55606.hashCode();
            this.f55608 = iHashCode;
            int i = iHashCode * 31;
            C9716 c9716 = this.f55610;
            this.f55608 = i + (c9716 == null ? 0 : c9716.hashCode());
        }
        return this.f55608;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17476.class.equals(obj.getClass())) {
            C17476 c17476 = (C17476) obj;
            if (this.f55606 == c17476.f55606 && this.f55610 == c17476.f55610) {
                return true;
            }
        }
        return false;
    }
}
