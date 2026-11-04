package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܺ۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4QJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16706 extends AbstractC10739 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f53969;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C3282 f53970;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f53971;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C20436 f53972;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C12231 f53973;

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final int mo10821(int i) {
        return i + 12;
    }

    public C16706(C24738 c24738) {
        super(c24738);
        this.f53971 = 0;
        this.f53969 = null;
    }

    public C16706(C24738 c24738, C20436 c20436, C12231 c12231) {
        this(c24738);
        String strM46863 = c20436.m46863();
        if (c12231 != null) {
            StringBuilder sbM27333 = C10732.m27333(strM46863);
            StringBuilder sb = new StringBuilder();
            for (C20436 c20437 : c12231.f39367) {
                sb.append(c20437.m46863());
            }
            sbM27333.append(sb.toString());
            strM46863 = sbM27333.toString();
        }
        this.f53970 = C3282.m10820(strM46863, c24738);
        this.f53972 = c20436;
        this.f53973 = c12231;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16706 m39473(C24738 c24738, C20436 c20436, C12231 c12231) {
        return (C16706) c24738.f80106.m38079(new C16706(c24738, c20436, c12231));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16706 m39475(C24738 c24738) {
        C20436 c20436M46859 = C20436.m46859(this.f53972.m46860(), c24738);
        C12231 c12231 = this.f53973;
        return (C16706) c24738.f80106.m38079(new C16706(c24738, c20436M46859, c12231 != null ? c12231.m30519(c24738) : null));
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10825(C4028 c4028, C17452 c17452) {
        C24738 c24738 = this.f34102;
        this.f53970 = (C3282) c24738.f80094.m49623(c4028.m12995());
        this.f53972 = (C20436) c24738.f80112.m49623(c4028.m12995());
        this.f53973 = (C12231) c17452.m40955(EnumC15214.TYPE_TYPE_LIST, c4028.m12995());
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10826(C24166 c24166) {
        c24166.m54134(this.f53970.f34104);
        c24166.m54134(this.f53972.f34104);
        C12231 c12231 = this.f53973;
        c24166.m54134(c12231 == null ? 0 : c12231.f34103);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C16706 c16706) {
        int iCompareTo = this.f53972.compareTo(c16706.f53972);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        C12231 c12231 = this.f53973;
        if (c12231 == null) {
            return c16706.f53973 == null ? 0 : -1;
        }
        C12231 c12232 = c16706.f53973;
        if (c12232 == null) {
            return 1;
        }
        return c12231.compareTo(c12232);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final String mo10823() {
        return "proto_id_item: " + m39476();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m39476() {
        if (this.f53969 == null) {
            StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
            C12231 c12231 = this.f53973;
            if (c12231 != null) {
                sb.append(c12231.m30518(""));
            }
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            sb.append(this.f53972.m46860());
            this.f53969 = sb.toString();
        }
        return this.f53969;
    }

    public final int hashCode() {
        if (this.f53971 == 0) {
            int iHashCode = this.f53972.hashCode();
            this.f53971 = iHashCode;
            int i = iHashCode * 31;
            C12231 c12231 = this.f53973;
            this.f53971 = i + (c12231 == null ? 0 : c12231.hashCode());
        }
        return this.f53971;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16706.class.equals(obj.getClass())) {
            C16706 c16706 = (C16706) obj;
            if (this.f53972 == c16706.f53972 && this.f53973 == c16706.f53973) {
                return true;
            }
        }
        return false;
    }
}
