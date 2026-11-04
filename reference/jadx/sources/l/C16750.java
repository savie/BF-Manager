package l;

import com.umeng.analytics.pro.bo;

/* JADX INFO: renamed from: l.ܺۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5FW */
/* JADX INFO: loaded from: classes5.dex */
public final class C16750 extends AbstractC10739 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C17278 f54066;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f54067;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumC3326 f54068;

    public C16750(C24738 c24738) {
        super(c24738);
        this.f54067 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16750 m39525(C24738 c24738) {
        EnumC3326 enumC3326 = this.f54068;
        C17278 c17278 = this.f54066;
        C20436 c20436 = c17278.f56275;
        C3282[] c3282Arr = null;
        C20436 c20436M46859 = c20436 == null ? null : C20436.m46859(c20436.m46860(), c24738);
        C3282[] c3282Arr2 = c17278.f56276;
        if (c3282Arr2 != null) {
            int length = c3282Arr2.length;
            C3282[] c3282Arr3 = new C3282[length];
            for (int i = 0; i < length; i++) {
                c3282Arr3[i] = C3282.m10820(c3282Arr2[i].m10827(), c24738);
            }
            c3282Arr = c3282Arr3;
        }
        C17278 c17279 = new C17278(c20436M46859, c3282Arr, c17278.m40569(c24738));
        C16750 c16750 = new C16750(c24738);
        c16750.f54067 = 0;
        c16750.f54068 = enumC3326;
        c16750.f54066 = c17279;
        return (C16750) c24738.f80115.m38079(c16750);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10825(C4028 c4028, C17452 c17452) {
        this.f54068 = EnumC3326.m10958(c4028.m13000());
        this.f54066 = new C17278(this.f34102, c4028);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final int mo10821(int i) {
        return this.f54066.mo1280(i + 1);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10826(C24166 c24166) {
        c24166.m54138(this.f54068.f10881);
        this.f54066.mo1281(c24166);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final String mo10823() {
        return C4791.m14766(new StringBuilder("annotation_item @0x"), this.f34103);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C16750 c16750) {
        int i = this.f54068.f10881 - c16750.f54068.f10881;
        return i == 0 ? this.f54066.compareTo(c16750.f54066) : i;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C17278 m39526() {
        return this.f54066;
    }

    public final int hashCode() {
        if (this.f54067 == 0) {
            byte b = this.f54068.f10881;
            this.f54067 = b;
            this.f54067 = this.f54066.hashCode() + (b * bo.j);
        }
        return this.f54067;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16750.class.equals(obj.getClass())) {
            C16750 c16750 = (C16750) obj;
            if (this.f54068 == c16750.f54068 && this.f54066.equals(c16750.f54066)) {
                return true;
            }
        }
        return false;
    }
}
