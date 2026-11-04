package l;

import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.᩶֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBHS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20946 implements InterfaceC22239, InterfaceC6052, Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f67008 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3046 f67011;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22239 f67012;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f67013;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f67010 = new ConcurrentMapC17249(10000, 0.75f);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f67009 = new C3792();

    @Override // l.InterfaceC22239
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo8409() {
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C20946 m47887(int i, InterfaceC22239 interfaceC22239, C3046 c3046) {
        C14232 c14232 = (C14232) f67009.get();
        c14232.m34549(i, interfaceC22239, c3046);
        ConcurrentMapC17249 concurrentMapC17249 = f67010;
        C20946 c20946M34548 = (C20946) concurrentMapC17249.get(c14232);
        if (c20946M34548 == null) {
            c20946M34548 = c14232.m34548();
            C20946 c20946 = (C20946) concurrentMapC17249.putIfAbsent(c20946M34548, c20946M34548);
            if (c20946 != null) {
                return c20946;
            }
        }
        return c20946M34548;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20946 m47883(int i, InterfaceC22239 interfaceC22239) {
        return m47887(i, interfaceC22239, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20946 m47882(int i, C5085 c5085, C3046 c3046) {
        if (c3046 == null) {
            throw new NullPointerException("local  == null");
        }
        return m47887(i, c5085, c3046);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C20946 m47886(int i, InterfaceC22239 interfaceC22239, C3046 c3046) {
        return m47887(i, interfaceC22239, c3046);
    }

    public C20946(int i, InterfaceC22239 interfaceC22239, C3046 c3046) {
        if (i < 0) {
            throw new IllegalArgumentException("reg < 0");
        }
        if (interfaceC22239 == null) {
            throw new NullPointerException("type == null");
        }
        this.f67013 = i;
        this.f67012 = interfaceC22239;
        this.f67011 = c3046;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20946)) {
            if (!(obj instanceof C14232)) {
                return false;
            }
            C14232 c14232 = (C14232) obj;
            return m47884(c14232.f44963, c14232.f44962, c14232.f44961);
        }
        C20946 c20946 = (C20946) obj;
        return m47884(c20946.f67013, c20946.f67012, c20946.f67011);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m47900(C20946 c20946) {
        return m47902(c20946) && this.f67013 == c20946.f67013;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m47902(C20946 c20946) {
        if (c20946 != null && this.f67012.getType().equals(c20946.f67012.getType())) {
            Object obj = c20946.f67011;
            C3046 c3046 = this.f67011;
            if (c3046 == obj) {
                return true;
            }
            if (c3046 != null && c3046.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m47884(int i, InterfaceC22239 interfaceC22239, C3046 c3046) {
        if (this.f67013 != i || !this.f67012.equals(interfaceC22239)) {
            return false;
        }
        C3046 c3047 = this.f67011;
        if (c3047 != c3046) {
            return c3047 != null && c3047.equals(c3046);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C20946 c20946) {
        int i = c20946.f67013;
        C3046 c3046 = c20946.f67011;
        int i2 = this.f67013;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        if (this == c20946) {
            return 0;
        }
        int iM15367 = this.f67012.getType().compareTo(c20946.f67012.getType());
        if (iM15367 != 0) {
            return iM15367;
        }
        C3046 c3047 = this.f67011;
        if (c3047 == null) {
            return c3046 == null ? 0 : -1;
        }
        if (c3046 == null) {
            return 1;
        }
        return c3047.compareTo(c3046);
    }

    public final int hashCode() {
        C3046 c3046 = this.f67011;
        return ((this.f67012.hashCode() + ((c3046 != null ? c3046.hashCode() : 0) * 31)) * 31) + this.f67013;
    }

    public final String toString() {
        return m47881(false);
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return m47881(true);
    }

    @Override // l.InterfaceC22239
    public final C5085 getType() {
        return this.f67012.getType();
    }

    @Override // l.InterfaceC22239
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC22239 mo8407() {
        return this.f67012.mo8407();
    }

    @Override // l.InterfaceC22239
    /* JADX INFO: renamed from: ᩴ */
    public final int mo8408() {
        return this.f67012.mo8408();
    }

    @Override // l.InterfaceC22239
    /* JADX INFO: renamed from: ֫ */
    public final int mo8406() {
        return this.f67012.mo8406();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m47903() {
        return this.f67013;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final InterfaceC22239 m47898() {
        return this.f67012;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C3046 m47896() {
        return this.f67011;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m47897() {
        return m47901() + this.f67013;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m47901() {
        return this.f67012.getType().m15371();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m47895() {
        return this.f67012.getType().m15366();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m47904() {
        return C13645.m33382(this.f67013, am.aE);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20946 m47894(C20946 c20946) {
        InterfaceC22239 interfaceC22239;
        InterfaceC22239 type;
        if (this != c20946) {
            if (c20946 != null) {
                InterfaceC22239 interfaceC222310 = c20946.f67012;
                int i = c20946.f67013;
                int i2 = this.f67013;
                if (i2 == i) {
                    C3046 c3046 = this.f67011;
                    C3046 c3047 = (c3046 == null || !c3046.equals(c20946.f67011)) ? null : c3046;
                    boolean z = c3047 == c3046;
                    if (z && (type = (interfaceC22239 = this.f67012).getType()) == interfaceC222310.getType()) {
                        if (interfaceC22239.equals(interfaceC222310)) {
                            type = interfaceC22239;
                        }
                        if (type != interfaceC22239 || !z) {
                            if (c3047 == null) {
                                return m47887(i2, type, null);
                            }
                            return m47887(i2, type, c3047);
                        }
                    }
                }
            }
            return null;
        }
        return this;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20946 m47899(int i) {
        return this.f67013 == i ? this : m47887(i, this.f67012, this.f67011);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20946 m47892(InterfaceC22239 interfaceC22239) {
        return m47887(this.f67013, interfaceC22239, this.f67011);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20946 m47890(int i) {
        return i == 0 ? this : m47899(this.f67013 + i);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C20946 m47888() {
        C5085 type;
        InterfaceC22239 interfaceC22239 = this.f67012;
        if (interfaceC22239 instanceof C5085) {
            type = (C5085) interfaceC22239;
        } else {
            type = interfaceC22239.getType();
        }
        if (type.m15365()) {
            type = type.m15370();
        }
        return type == interfaceC22239 ? this : m47887(this.f67013, type, this.f67011);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20946 m47891(C3046 c3046) {
        C3046 c3047 = this.f67011;
        return (c3047 == c3046 || (c3047 != null && c3047.equals(c3046))) ? this : m47887(this.f67013, this.f67012, c3046);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m47893() {
        return (this.f67013 & 1) == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m47881(boolean z) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(m47904());
        sb.append(":");
        C3046 c3046 = this.f67011;
        if (c3046 != null) {
            sb.append(c3046.toString());
        }
        InterfaceC22239 interfaceC22239 = this.f67012;
        C5085 type = interfaceC22239.getType();
        sb.append(type);
        if (type != interfaceC22239) {
            sb.append("=");
            if (z && (interfaceC22239 instanceof C9976)) {
                sb.append(((C9976) interfaceC22239).m25818());
            } else if (z && (interfaceC22239 instanceof AbstractC13487)) {
                sb.append(interfaceC22239.mo1843());
            } else {
                sb.append(interfaceC22239);
            }
        }
        return sb.toString();
    }
}
