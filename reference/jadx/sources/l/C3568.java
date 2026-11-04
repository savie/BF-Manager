package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗܿ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: KAG4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3568 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f12216;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f12217;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f12218;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f12219;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f12220;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f12221;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f12222;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f12223;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f12224;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f12225;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3568 m11613(int i, AbstractC0148 abstractC0148) {
        if (abstractC0148 instanceof C13263) {
            return new C3568(i, (C13263) abstractC0148);
        }
        throw new RuntimeException();
    }

    public C3568(int i, C13263 c13263) {
        this.f12220 = i;
        this.f12224 = c13263.f42380;
        this.f12218 = c13263.f42372;
        this.f12216 = c13263.f42376;
        boolean z = c13263.f42377;
        this.f12222 = z;
        if (z) {
            this.f12221 = c13263.f42379;
            this.f12223 = c13263.f42378;
        } else {
            this.f12221 = c13263.f42374;
            this.f12223 = "";
        }
        this.f12217 = c13263.f42373;
        int i2 = c13263.f42381;
        this.f12225 = i2;
        if (i2 != -1) {
            this.f12219 = c13263.f42375;
        } else {
            this.f12219 = "";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23794 m11614(int i, String str) {
        C23794 c23794M20802 = C7606.m20802(i);
        if (c23794M20802 == null) {
            c23794M20802 = C7606.m20798(str);
        }
        if (c23794M20802 != null) {
            return c23794M20802;
        }
        if (str.startsWith("sshj://")) {
            str = str.substring(7);
        }
        throw new C3090(C21576.m49059(R.string.MT_Protector, str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3568.class == obj.getClass()) {
            C3568 c3568 = (C3568) obj;
            if (this.f12220 == c3568.f12220 && this.f12218 == c3568.f12218 && this.f12222 == c3568.f12222 && this.f12224.equals(c3568.f12224) && this.f12216.equals(c3568.f12216) && this.f12221.equals(c3568.f12221) && this.f12223.equals(c3568.f12223) && this.f12217.equals(c3568.f12217) && this.f12225 == c3568.f12225 && this.f12219.equals(c3568.f12219)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hash(Integer.valueOf(this.f12220), this.f12224, Integer.valueOf(this.f12218), this.f12216, this.f12221, this.f12223, Boolean.valueOf(this.f12222), this.f12217, Integer.valueOf(this.f12225), this.f12219);
    }
}
