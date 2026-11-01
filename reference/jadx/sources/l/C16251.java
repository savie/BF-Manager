package l;

import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ܺ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBHS */
/* JADX INFO: loaded from: classes5.dex */
public final class C16251 implements InterfaceC4919, InterfaceC19653, Comparable {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f52405 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC4919 f52407;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C19073 f52408;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f52409;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC13783 f52406 = new ConcurrentMapC13783(10000, 0.75f);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f52404 = new C7784();

    @Override // l.InterfaceC4919
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo9847() {
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C16251 m38385(int i, InterfaceC4919 interfaceC4919, C19073 c19073) {
        C21189 c21189 = (C21189) f52404.get();
        c21189.m47644(i, interfaceC4919, c19073);
        ConcurrentMapC13783 concurrentMapC13783 = f52406;
        C16251 c16251M47643 = (C16251) concurrentMapC13783.get(c21189);
        if (c16251M47643 == null) {
            c16251M47643 = c21189.m47643();
            C16251 c16251 = (C16251) concurrentMapC13783.putIfAbsent(c16251M47643, c16251M47643);
            if (c16251 != null) {
                return c16251;
            }
        }
        return c16251M47643;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16251 m38381(int i, InterfaceC4919 interfaceC4919) {
        return m38385(i, interfaceC4919, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16251 m38380(int i, C3320 c3320, C19073 c19073) {
        if (c19073 == null) {
            throw new NullPointerException("local  == null");
        }
        return m38385(i, c3320, c19073);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C16251 m38384(int i, InterfaceC4919 interfaceC4919, C19073 c19073) {
        return m38385(i, interfaceC4919, c19073);
    }

    public C16251(int i, InterfaceC4919 interfaceC4919, C19073 c19073) {
        if (i < 0) {
            throw new IllegalArgumentException("reg < 0");
        }
        if (interfaceC4919 == null) {
            throw new NullPointerException("type == null");
        }
        this.f52409 = i;
        this.f52407 = interfaceC4919;
        this.f52408 = c19073;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16251)) {
            if (!(obj instanceof C21189)) {
                return false;
            }
            C21189 c21189 = (C21189) obj;
            return m38382(c21189.f68974, c21189.f68973, c21189.f68972);
        }
        C16251 c16251 = (C16251) obj;
        return m38382(c16251.f52409, c16251.f52407, c16251.f52408);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m38398(C16251 c16251) {
        return m38387(c16251) && this.f52409 == c16251.f52409;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m38387(C16251 c16251) {
        if (c16251 != null && this.f52407.getType().equals(c16251.f52407.getType())) {
            Object obj = c16251.f52408;
            C19073 c19073 = this.f52408;
            if (c19073 == obj) {
                return true;
            }
            if (c19073 != null && c19073.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m38382(int i, InterfaceC4919 interfaceC4919, C19073 c19073) {
        if (this.f52409 != i || !this.f52407.equals(interfaceC4919)) {
            return false;
        }
        C19073 c19074 = this.f52408;
        if (c19074 != c19073) {
            return c19074 != null && c19074.equals(c19073);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C16251 c16251) {
        int i = c16251.f52409;
        C19073 c19073 = c16251.f52408;
        int i2 = this.f52409;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        if (this == c16251) {
            return 0;
        }
        int iM9832 = this.f52407.getType().compareTo(c16251.f52407.getType());
        if (iM9832 != 0) {
            return iM9832;
        }
        C19073 c19074 = this.f52408;
        if (c19074 == null) {
            return c19073 == null ? 0 : -1;
        }
        if (c19073 == null) {
            return 1;
        }
        return c19074.compareTo(c19073);
    }

    public final int hashCode() {
        C19073 c19073 = this.f52408;
        return ((this.f52407.hashCode() + ((c19073 != null ? c19073.hashCode() : 0) * 31)) * 31) + this.f52409;
    }

    public final String toString() {
        return m38379(false);
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return m38379(true);
    }

    @Override // l.InterfaceC4919
    public final C3320 getType() {
        return this.f52407.getType();
    }

    @Override // l.InterfaceC4919
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC4919 mo9835() {
        return this.f52407.mo9835();
    }

    @Override // l.InterfaceC4919
    /* JADX INFO: renamed from: ۚ */
    public final int mo9834() {
        return this.f52407.mo9834();
    }

    @Override // l.InterfaceC4919
    /* JADX INFO: renamed from: ۘ */
    public final int mo9831() {
        return this.f52407.mo9831();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m38400() {
        return this.f52409;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final InterfaceC4919 m38401() {
        return this.f52407;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C19073 m38386() {
        return this.f52408;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m38399() {
        return m38396() + this.f52409;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m38396() {
        return this.f52407.getType().m9830();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m38393() {
        return this.f52407.getType().m9846();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String m38392() {
        return C8479.m22141(this.f52409, am.aE);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16251 m38395(C16251 c16251) {
        InterfaceC4919 interfaceC4919;
        InterfaceC4919 type;
        if (this != c16251) {
            if (c16251 != null) {
                InterfaceC4919 interfaceC49110 = c16251.f52407;
                int i = c16251.f52409;
                int i2 = this.f52409;
                if (i2 == i) {
                    C19073 c19073 = this.f52408;
                    C19073 c19074 = (c19073 == null || !c19073.equals(c16251.f52408)) ? null : c19073;
                    boolean z = c19074 == c19073;
                    if (z && (type = (interfaceC4919 = this.f52407).getType()) == interfaceC49110.getType()) {
                        if (interfaceC4919.equals(interfaceC49110)) {
                            type = interfaceC4919;
                        }
                        if (type != interfaceC4919 || !z) {
                            if (c19074 == null) {
                                return m38385(i2, type, null);
                            }
                            return m38385(i2, type, c19074);
                        }
                    }
                }
            }
            return null;
        }
        return this;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16251 m38397(int i) {
        return this.f52409 == i ? this : m38385(i, this.f52407, this.f52408);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16251 m38390(InterfaceC4919 interfaceC4919) {
        return m38385(this.f52409, interfaceC4919, this.f52408);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16251 m38389(int i) {
        return i == 0 ? this : m38397(this.f52409 + i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16251 m38402() {
        C3320 type;
        InterfaceC4919 interfaceC4919 = this.f52407;
        if (interfaceC4919 instanceof C3320) {
            type = (C3320) interfaceC4919;
        } else {
            type = interfaceC4919.getType();
        }
        if (type.m9842()) {
            type = type.m9837();
        }
        return type == interfaceC4919 ? this : m38385(this.f52409, type, this.f52408);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16251 m38391(C19073 c19073) {
        C19073 c19074 = this.f52408;
        return (c19074 == c19073 || (c19074 != null && c19074.equals(c19073))) ? this : m38385(this.f52409, this.f52407, c19073);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m38394() {
        return (this.f52409 & 1) == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m38379(boolean z) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(m38392());
        sb.append(":");
        C19073 c19073 = this.f52408;
        if (c19073 != null) {
            sb.append(c19073.toString());
        }
        InterfaceC4919 interfaceC4919 = this.f52407;
        C3320 type = interfaceC4919.getType();
        sb.append(type);
        if (type != interfaceC4919) {
            sb.append("=");
            if (z && (interfaceC4919 instanceof C17432)) {
                sb.append(((C17432) interfaceC4919).m40637());
            } else if (z && (interfaceC4919 instanceof AbstractC9901)) {
                sb.append(interfaceC4919.mo2376());
            } else {
                sb.append(interfaceC4919);
            }
        }
        return sb.toString();
    }
}
