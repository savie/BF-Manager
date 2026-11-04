package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 91K6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0751 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC18650 f2742;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C0751 f2744;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C6718 f2746;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C10445 f2747;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f2749;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f2750;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f2743 = null;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f2748 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f2745 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3103(int i, C18059 c18059, ArrayList arrayList) {
        HashSet hashSet = this.f2743;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C23281.m52398(((C0751) it.next()).f2747, i, arrayList, c18059);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet m3101() {
        return this.f2743;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m3110() {
        HashSet hashSet = this.f2743;
        return hashSet != null && hashSet.size() > 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m3111() {
        HashSet hashSet = this.f2743;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0751) it.next()).m3115().m3100()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3102(int i) {
        this.f2749 = i;
        this.f2750 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m3114() {
        if (this.f2750) {
            return this.f2749;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m3116() {
        this.f2750 = false;
        this.f2749 = 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m3107() {
        return this.f2750;
    }

    public C0751(C10445 c10445, EnumC18650 enumC18650) {
        this.f2747 = c10445;
        this.f2742 = enumC18650;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6718 m3113() {
        return this.f2746;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m3112() {
        C6718 c6718 = this.f2746;
        if (c6718 == null) {
            this.f2746 = new C6718(EnumC12683.UNRESTRICTED);
        } else {
            c6718.m18754();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m3108() {
        C0751 c0751;
        if (this.f2747.m26870() == 8) {
            return 0;
        }
        if (this.f2745 > -1 && (c0751 = this.f2744) != null && c0751.f2747.m26870() == 8) {
            return this.f2745;
        }
        return this.f2748;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3109() {
        HashSet hashSet;
        C0751 c0751 = this.f2744;
        if (c0751 != null && (hashSet = c0751.f2743) != null) {
            hashSet.remove(this);
            if (this.f2744.f2743.size() == 0) {
                this.f2744.f2743 = null;
            }
        }
        this.f2743 = null;
        this.f2744 = null;
        this.f2748 = 0;
        this.f2745 = -1;
        this.f2750 = false;
        this.f2749 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3106(C0751 c0751, int i, int i2, boolean z) {
        if (c0751 == null) {
            m3109();
            return true;
        }
        if (!z && !m3105(c0751)) {
            return false;
        }
        this.f2744 = c0751;
        if (c0751.f2743 == null) {
            c0751.f2743 = new HashSet();
        }
        HashSet hashSet = this.f2744.f2743;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i > 0) {
            this.f2748 = i;
        } else {
            this.f2748 = 0;
        }
        this.f2745 = i2;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3104(C0751 c0751, int i) {
        m3106(c0751, i, -1, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m3100() {
        return this.f2744 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3105(C0751 c0751) {
        if (c0751 == null) {
            return false;
        }
        C10445 c10445 = c0751.f2747;
        EnumC18650 enumC18650 = c0751.f2742;
        EnumC18650 enumC18651 = this.f2742;
        if (enumC18650 == enumC18651) {
            return enumC18651 != EnumC18650.BASELINE || (c10445.m26849() && this.f2747.m26849());
        }
        switch (C21634.f69076[enumC18651.ordinal()]) {
            case 1:
                return (enumC18650 == EnumC18650.BASELINE || enumC18650 == EnumC18650.CENTER_X || enumC18650 == EnumC18650.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = enumC18650 == EnumC18650.LEFT || enumC18650 == EnumC18650.RIGHT;
                if (c10445 instanceof C7463) {
                    return z || enumC18650 == EnumC18650.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = enumC18650 == EnumC18650.TOP || enumC18650 == EnumC18650.BOTTOM;
                if (c10445 instanceof C7463) {
                    return z2 || enumC18650 == EnumC18650.CENTER_Y;
                }
                return z2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(enumC18651.name());
        }
    }

    public final String toString() {
        return this.f2747.m26841() + ":" + this.f2742.toString();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0751 m3115() {
        int[] iArr = C21634.f69076;
        EnumC18650 enumC18650 = this.f2742;
        int i = iArr[enumC18650.ordinal()];
        C10445 c10445 = this.f2747;
        switch (i) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return c10445.f33248;
            case 3:
                return c10445.f33212;
            case 4:
                return c10445.f33216;
            case 5:
                return c10445.f33197;
            default:
                throw new AssertionError(enumC18650.name());
        }
    }
}
