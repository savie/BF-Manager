package l;

import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨ᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 544J */
/* JADX INFO: loaded from: classes4.dex */
public class C11948 implements InterfaceC14749 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C4891 f40067;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC0597 f40068;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC17615 f40069;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12260 f40070;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Set f40071;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16493 f40072;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22137 f40073;

    public C11948(InterfaceC17615 interfaceC17615, AbstractC16493 abstractC16493, EnumC0597 enumC0597, Set set, C22137 c22137, InterfaceC12260 interfaceC12260) {
        if (c22137 == null && interfaceC12260 != null && interfaceC12260.mo9278() != -1) {
            throw new IllegalArgumentException();
        }
        this.f40069 = interfaceC17615;
        this.f40072 = abstractC16493;
        this.f40068 = enumC0597;
        this.f40071 = set;
        this.f40073 = c22137;
        this.f40070 = interfaceC12260;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final EnumC17198 m29767() {
        return this.f40072.f52996;
    }

    /* JADX INFO: renamed from: ᩺ */
    public C21825 mo5589() {
        return C21825.m48588();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m29768() {
        return this.f40071.contains(EnumC0264.MANDATORY);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC0597 m29757() {
        return this.f40068;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2173 m29762() {
        C22137 c22137 = this.f40073;
        if (c22137 == null) {
            return null;
        }
        return c22137.f71657;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C22137 m29761() {
        return this.f40073;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m29764() {
        InterfaceC12260 interfaceC12260 = this.f40070;
        if (interfaceC12260 == null) {
            return -1;
        }
        return interfaceC12260.mo9279();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m29755() {
        InterfaceC12260 interfaceC12260 = this.f40070;
        if (interfaceC12260 == null) {
            return -1;
        }
        return interfaceC12260.mo9278();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m29769() {
        InterfaceC12260 interfaceC12260 = this.f40070;
        if (interfaceC12260 == null) {
            return -1;
        }
        return interfaceC12260.mo9277(this.f40073.f71660);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12260 m29756() {
        return this.f40070;
    }

    @Override // l.InterfaceC14749
    public final long getLineNumber() {
        if (this.f40067 == null) {
            this.f40067 = new C4891(this);
        }
        return this.f40067.m13613();
    }

    @Override // l.InterfaceC14749
    public final long getColumnNumber() {
        if (this.f40067 == null) {
            this.f40067 = new C4891(this);
        }
        return this.f40067.m13612();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object[] m29763() {
        return this.f40072.f52997;
    }

    public final String toString() {
        return this.f40069.mo36374(this, Locale.getDefault());
    }

    @Override // l.InterfaceC14749
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC23921 mo29759() {
        int iOrdinal = this.f40072.f52996.ordinal();
        if (iOrdinal == 1) {
            return EnumC23921.NOTE;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return EnumC23921.ERROR;
            }
            return EnumC23921.OTHER;
        }
        if (this.f40071.contains(EnumC0264.MANDATORY)) {
            return EnumC23921.MANDATORY_WARNING;
        }
        return EnumC23921.WARNING;
    }

    @Override // l.InterfaceC14749
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String mo29765() {
        return this.f40072.m38768();
    }

    @Override // l.InterfaceC14749
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo29758(Locale locale) {
        return this.f40069.mo15112(this, locale);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29766(EnumC0264 enumC0264) {
        Set set = this.f40071;
        set.add(enumC0264);
        if (this.f40072.f52996 == EnumC17198.ERROR) {
            int iOrdinal = enumC0264.ordinal();
            if (iOrdinal == 1) {
                set.add(EnumC0264.RECOVERABLE);
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                set.remove(EnumC0264.RECOVERABLE);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29760(EnumC0264 enumC0264) {
        return this.f40071.contains(enumC0264);
    }
}
