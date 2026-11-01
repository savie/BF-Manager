package l;

/* JADX INFO: renamed from: l.ܰܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M4YN */
/* JADX INFO: loaded from: classes4.dex */
public final class C13929 extends AbstractC9011 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C1953 f45863;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C1953 f45864;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9716 f45865;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C12663 f45866;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C17001 f45867;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f45868;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3489 f45869;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C14655 f45870;

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final int mo6315(int i) {
        return i + 32;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f30807 - ((C13929) obj).f30807;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33766(C12063 c12063) {
        C1953 c1953M6312 = C1953.m6312(this.f45864.m6314(), c12063);
        int i = this.f45868;
        C1953 c1953M6313 = C1953.m6312(this.f45863.m6314(), c12063);
        C9716 c9716 = this.f45865;
        C17001 c17001M39780 = null;
        C9716 c9716M24675 = c9716 != null ? c9716.m24675(c12063) : null;
        C14655 c14655 = this.f45870;
        C14655 c14655M35175 = c14655 != null ? C14655.m35175(c14655.m35176(), c12063) : null;
        C12663 c12663 = this.f45866;
        C12663 c12663M31464 = c12663 != null ? c12663.m31464(c12063) : null;
        C3489 c3489 = this.f45869;
        C3489 c3489M10224 = c3489 != null ? c3489.m10224(c12063) : null;
        C17001 c17001 = this.f45867;
        if (c17001 != null) {
            AbstractC11833[] abstractC11833Arr = c17001.m39781().f75657;
            AbstractC11833[] abstractC11833Arr2 = new AbstractC11833[abstractC11833Arr.length];
            int length = abstractC11833Arr.length;
            for (int i2 = 0; i2 < length; i2++) {
                abstractC11833Arr2[i2] = AbstractC11833.m29515(c12063, abstractC11833Arr[i2]);
            }
            c17001M39780 = C17001.m39780(c12063, new C23352(abstractC11833Arr2));
        }
        C13929 c13929 = new C13929(c12063);
        c13929.f45864 = c1953M6312;
        c13929.f45868 = i;
        c13929.f45863 = c1953M6313;
        c13929.f45865 = c9716M24675;
        c13929.f45870 = c14655M35175;
        c13929.f45866 = c12663M31464;
        c13929.f45869 = c3489M10224;
        c13929.f45867 = c17001M39780;
        if (c3489M10224 != null) {
            c3489M10224.m10230(c13929);
        }
        if (c12663M31464 != null) {
            c12663M31464.m31465(c13929);
        }
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6320(C13825 c13825, C6187 c6187) {
        AbstractC9011 abstractC9011M44688;
        C12063 c12063 = this.f30808;
        this.f45864 = (C1953) c12063.f40367.m44688(c13825.m33642());
        this.f45868 = c13825.m33642();
        C19594 c19594 = c12063.f40367;
        int iM33642 = c13825.m33642();
        AbstractC9011 abstractC9011M44689 = null;
        if (iM33642 == -1) {
            c19594.getClass();
            abstractC9011M44688 = null;
        } else {
            abstractC9011M44688 = c19594.m44688(iM33642);
        }
        this.f45863 = (C1953) abstractC9011M44688;
        this.f45865 = (C9716) c6187.m17187(EnumC21004.TYPE_TYPE_LIST, c13825.m33642());
        C19594 c19595 = c12063.f40354;
        int iM33643 = c13825.m33642();
        if (iM33643 == -1) {
            c19595.getClass();
        } else {
            abstractC9011M44689 = c19595.m44688(iM33643);
        }
        this.f45870 = (C14655) abstractC9011M44689;
        this.f45866 = (C12663) c6187.m17187(EnumC21004.TYPE_ANNOTATIONS_DIRECTORY_ITEM, c13825.m33642());
        this.f45869 = (C3489) c6187.m17187(EnumC21004.TYPE_CLASS_DATA_ITEM, c13825.m33642());
        this.f45867 = (C17001) c6187.m17187(EnumC21004.TYPE_ENCODED_ARRAY_ITEM, c13825.m33642());
        C3489 c3489 = this.f45869;
        if (c3489 != null) {
            c3489.m10230(this);
        }
        C12663 c12663 = this.f45866;
        if (c12663 != null) {
            c12663.m31465(this);
        }
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6319(C4651 c4651) {
        c4651.m12839(this.f45864.f30809);
        c4651.m12839(this.f45868);
        C1953 c1953 = this.f45863;
        c4651.m12839(c1953 == null ? -1 : c1953.f30809);
        C9716 c9716 = this.f45865;
        c4651.m12839(c9716 == null ? 0 : c9716.f30807);
        C14655 c14655 = this.f45870;
        c4651.m12839(c14655 != null ? c14655.f30809 : -1);
        C12663 c12663 = this.f45866;
        c4651.m12839(c12663 == null ? 0 : c12663.f30807);
        C3489 c3489 = this.f45869;
        c4651.m12839(c3489 == null ? 0 : c3489.f30807);
        C17001 c17001 = this.f45867;
        c4651.m12839(c17001 != null ? c17001.f30807 : 0);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final String mo6317() {
        return "class_def_item: " + this.f45864.m6314();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C1953 m33765() {
        return this.f45864;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C3489 m33764() {
        return this.f45869;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17001 m33767() {
        if (this.f45867 == null) {
            this.f45867 = C17001.m39780(this.f30808, new C23352(new AbstractC11833[0]));
        }
        return this.f45867;
    }
}
