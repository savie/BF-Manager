package l;

import java.util.List;

/* JADX INFO: renamed from: l.֡᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1L9 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0707 {
    LEFT(0),
    RIGHT(1);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ boolean f2979 = false;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f2983;

    EnumC0707(int i) {
        this.f2983 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC0707 m3102(int i) {
        if (i == 0) {
            return LEFT;
        }
        if (i == 1) {
            return RIGHT;
        }
        throw new IndexOutOfBoundsException(C8479.m22141(i, "index: "));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC0707 m3106(boolean z) {
        return z ? LEFT : RIGHT;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static EnumC0707 m3105(boolean z) {
        return z ? RIGHT : LEFT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC0707 m3103(List list, Object obj) {
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf != -1) {
            return m3102(iIndexOf);
        }
        return null;
    }

    public int getIndex() {
        return this.f2983;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m3115() {
        return this.f2983 == 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC0707 m3124() {
        return m3115() ? RIGHT : LEFT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC0707 m3114(boolean z) {
        return z ? m3124() : this;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int m3117(int i, int i2) {
        return m3115() ? i : i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object m3110(Object obj, Object obj2) {
        return m3115() ? obj : obj2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object m3120(Object obj, Object obj2) {
        return m3115() ? obj : obj2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m3116(boolean[] zArr) {
        return zArr[this.f2983];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m3109(int[] iArr) {
        return iArr[this.f2983];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object m3113(Object[] objArr) {
        return objArr[this.f2983];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object m3123(Object[] objArr) {
        return objArr[this.f2983];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object m3111(List list) {
        return list.get(this.f2983);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object m3121(List list) {
        return list.get(this.f2983);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object m3112(C12703 c12703) {
        return m3115() ? c12703.f56076 : c12703.f56077;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object m3122(C12703 c12703) {
        return m3115() ? c12703.f56076 : c12703.f56077;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int m3118(InterfaceC19053 interfaceC19053) {
        return m3115() ? interfaceC19053.mo22124() : interfaceC19053.mo22129();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m3107(InterfaceC19053 interfaceC19053) {
        return m3115() ? interfaceC19053.mo22126() : interfaceC19053.mo22123();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int m3119(InterfaceC19759 interfaceC19759) {
        return m3115() ? interfaceC19759.mo23602() : interfaceC19759.mo23598();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m3108(InterfaceC19759 interfaceC19759) {
        return m3115() ? interfaceC19759.mo23600() : interfaceC19759.mo23594();
    }
}
