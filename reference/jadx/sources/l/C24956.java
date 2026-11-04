package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩻ۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85TO */
/* JADX INFO: loaded from: classes.dex */
public final class C24956 extends AbstractC10739 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C16004 f80795;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C16004[] f80796;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C23464[] f80797;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C13548[] f80798;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C4072 f80799;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C5520[] f80800;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C5520[] f80801;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16004[] f80802;

    public C24956(C24738 c24738) {
        super(c24738);
        this.f80799 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24956 m55715(C24738 c24738) {
        C13548[] c13548Arr;
        C16004[] c16004Arr;
        C5520[] c5520Arr;
        C16004[] c16004Arr2;
        C5520[] c5520Arr2;
        C23464[] c23464Arr;
        C13548[] c13548Arr2 = this.f80798;
        int i = 0;
        if (c13548Arr2 != null) {
            c13548Arr = new C13548[c13548Arr2.length];
            int length = c13548Arr2.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                c13548Arr[i3] = c13548Arr2[i2].m33265(c24738);
                i2++;
                i3++;
            }
        } else {
            c13548Arr = null;
        }
        C16004[] c16004Arr3 = this.f80802;
        if (c16004Arr3 != null) {
            c16004Arr = new C16004[c16004Arr3.length];
            int length2 = c16004Arr3.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length2) {
                c16004Arr[i5] = c16004Arr3[i4].m38138(c24738);
                i4++;
                i5++;
            }
        } else {
            c16004Arr = null;
        }
        C5520[] c5520Arr3 = this.f80801;
        if (c5520Arr3 != null) {
            c5520Arr = new C5520[c5520Arr3.length];
            int length3 = c5520Arr3.length;
            int i6 = 0;
            int i7 = 0;
            while (i6 < length3) {
                c5520Arr[i7] = c5520Arr3[i6].m16436(c24738);
                i6++;
                i7++;
            }
        } else {
            c5520Arr = null;
        }
        C16004[] c16004Arr4 = this.f80796;
        if (c16004Arr4 != null) {
            c16004Arr2 = new C16004[c16004Arr4.length];
            int length4 = c16004Arr4.length;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length4) {
                c16004Arr2[i9] = c16004Arr4[i8].m38138(c24738);
                i8++;
                i9++;
            }
        } else {
            c16004Arr2 = null;
        }
        C5520[] c5520Arr4 = this.f80800;
        if (c5520Arr4 != null) {
            c5520Arr2 = new C5520[c5520Arr4.length];
            int length5 = c5520Arr4.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length5) {
                c5520Arr2[i11] = c5520Arr4[i10].m16436(c24738);
                i10++;
                i11++;
            }
        } else {
            c5520Arr2 = null;
        }
        C23464[] c23464Arr2 = this.f80797;
        if (c23464Arr2 != null) {
            c23464Arr = new C23464[c23464Arr2.length];
            int length6 = c23464Arr2.length;
            int i12 = 0;
            while (i < length6) {
                c23464Arr[i12] = c23464Arr2[i].m52668(c24738);
                i++;
                i12++;
            }
        } else {
            c23464Arr = null;
        }
        C16004 c16004 = this.f80795;
        C16004 c16004M38138 = c16004 == null ? null : c16004.m38138(c24738);
        C24956 c24956 = new C24956(c24738);
        c24956.f80799 = null;
        c24956.f80795 = c16004M38138;
        c24956.f80798 = c13548Arr;
        c24956.f80802 = c16004Arr;
        c24956.f80801 = c5520Arr;
        c24956.f80796 = c16004Arr2;
        c24956.f80800 = c5520Arr2;
        c24956.f80797 = c23464Arr;
        return (C24956) c24738.f80096.m38079(c24956);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10825(C4028 c4028, C17452 c17452) {
        C24738 c24738;
        this.f80795 = (C16004) c17452.m40955(EnumC15214.TYPE_ANNOTATION_SET_ITEM, c4028.m12995());
        int iM12995 = c4028.m12995();
        this.f80798 = new C13548[iM12995];
        this.f80802 = new C16004[iM12995];
        int iM12996 = c4028.m12995();
        this.f80801 = new C5520[iM12996];
        this.f80796 = new C16004[iM12996];
        int iM12997 = c4028.m12995();
        this.f80800 = new C5520[iM12997];
        this.f80797 = new C23464[iM12997];
        int i = 0;
        while (true) {
            int length = this.f80802.length;
            c24738 = this.f34102;
            if (i >= length) {
                break;
            }
            try {
                this.f80798[i] = (C13548) c24738.f80101.m49623(c4028.m12995());
                this.f80802[i] = (C16004) c17452.m40951(EnumC15214.TYPE_ANNOTATION_SET_ITEM, c4028.m12995());
                i++;
            } catch (Exception e) {
                throw C14468.m34931("Error occured while reading FieldAnnotation at index " + i, e);
            }
        }
        for (int i2 = 0; i2 < this.f80796.length; i2++) {
            try {
                this.f80801[i2] = (C5520) c24738.f80108.m49623(c4028.m12995());
                this.f80796[i2] = (C16004) c17452.m40951(EnumC15214.TYPE_ANNOTATION_SET_ITEM, c4028.m12995());
            } catch (Exception e2) {
                throw C14468.m34931("Error occured while reading MethodAnnotation at index " + i2, e2);
            }
        }
        for (int i3 = 0; i3 < this.f80797.length; i3++) {
            try {
                this.f80800[i3] = (C5520) c24738.f80108.m49623(c4028.m12995());
                this.f80797[i3] = (C23464) c17452.m40951(EnumC15214.TYPE_ANNOTATION_SET_REF_LIST, c4028.m12995());
            } catch (Exception e3) {
                throw C14468.m34931("Error occured while reading ParameterAnnotation at index " + i3, e3);
            }
        }
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final int mo10821(int i) {
        int i2 = i + 16;
        C16004[] c16004Arr = this.f80802;
        int length = c16004Arr == null ? 0 : c16004Arr.length;
        C16004[] c16004Arr2 = this.f80796;
        int length2 = length + (c16004Arr2 == null ? 0 : c16004Arr2.length);
        C23464[] c23464Arr = this.f80797;
        return C12669.m31441(length2, c23464Arr != null ? c23464Arr.length : 0, 8, i2);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10826(C24166 c24166) {
        C16004 c16004 = this.f80795;
        c24166.m54134(c16004 == null ? 0 : c16004.f34103);
        C16004[] c16004Arr = this.f80802;
        c24166.m54134(c16004Arr == null ? 0 : c16004Arr.length);
        C16004[] c16004Arr2 = this.f80796;
        c24166.m54134(c16004Arr2 == null ? 0 : c16004Arr2.length);
        C23464[] c23464Arr = this.f80797;
        c24166.m54134(c23464Arr == null ? 0 : c23464Arr.length);
        if (this.f80802 != null) {
            for (int i = 0; i < this.f80802.length; i++) {
                c24166.m54134(this.f80798[i].f34104);
                c24166.m54134(this.f80802[i].f34103);
            }
        }
        if (this.f80796 != null) {
            for (int i2 = 0; i2 < this.f80796.length; i2++) {
                c24166.m54134(this.f80801[i2].f34104);
                c24166.m54134(this.f80796[i2].f34103);
            }
        }
        if (this.f80797 != null) {
            for (int i3 = 0; i3 < this.f80797.length; i3++) {
                c24166.m54134(this.f80800[i3].f34104);
                c24166.m54134(this.f80797[i3].f34103);
            }
        }
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final String mo10823() {
        if (this.f80799 == null) {
            return C4791.m14766(new StringBuilder("annotation_directory_item @0x"), this.f34103);
        }
        return "annotation_directory_item @0x" + Integer.toHexString(this.f34103) + " (" + this.f80799.m13151() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C24956 c24956) {
        if (!m55713()) {
            if (c24956.m55713()) {
                return -1;
            }
            return this.f80799.f34103 - c24956.f80799.f34103;
        }
        if (c24956.m55713()) {
            return this.f80795.compareTo(c24956.f80795);
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private boolean m55713() {
        if (this.f80795 == null) {
            return false;
        }
        C16004[] c16004Arr = this.f80802;
        if (c16004Arr != null && c16004Arr.length != 0) {
            return false;
        }
        C16004[] c16004Arr2 = this.f80796;
        if (c16004Arr2 != null && c16004Arr2.length != 0) {
            return false;
        }
        C23464[] c23464Arr = this.f80797;
        return c23464Arr == null || c23464Arr.length == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55716(C4072 c4072) {
        this.f80799 = c4072;
    }

    public final int hashCode() {
        if (!m55713()) {
            return super.hashCode();
        }
        return this.f80795.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C24956.class.equals(obj.getClass()) && compareTo((C24956) obj) == 0;
    }
}
