package l;

import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 544J */
/* JADX INFO: loaded from: classes5.dex */
public class C17007 implements InterfaceC12993 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC20162 f55559;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Set f55560;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C11786 f55561;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23393 f55562;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5075 f55563;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC13695 f55564;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC19876 f55565;

    public C17007(InterfaceC20162 interfaceC20162, AbstractC13695 abstractC13695, EnumC19876 enumC19876, Set set, C23393 c23393, InterfaceC5075 interfaceC5075) {
        if (c23393 == null && interfaceC5075 != null && interfaceC5075.mo7191() != -1) {
            throw new IllegalArgumentException();
        }
        this.f55559 = interfaceC20162;
        this.f55564 = abstractC13695;
        this.f55565 = enumC19876;
        this.f55560 = set;
        this.f55562 = c23393;
        this.f55563 = interfaceC5075;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC22229 m40089() {
        return this.f55564.f43444;
    }

    /* JADX INFO: renamed from: ᩻ */
    public C14769 mo32825() {
        return C14769.m35543();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m40090() {
        return this.f55560.contains(EnumC6984.MANDATORY);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC19876 m40082() {
        return this.f55565;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15976 m40086() {
        C23393 c23393 = this.f55562;
        if (c23393 == null) {
            return null;
        }
        return c23393.f75737;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23393 m40091() {
        return this.f55562;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m40084() {
        InterfaceC5075 interfaceC5075 = this.f55563;
        if (interfaceC5075 == null) {
            return -1;
        }
        return interfaceC5075.mo7189();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m40087() {
        InterfaceC5075 interfaceC5075 = this.f55563;
        if (interfaceC5075 == null) {
            return -1;
        }
        return interfaceC5075.mo7191();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m40088() {
        InterfaceC5075 interfaceC5075 = this.f55563;
        if (interfaceC5075 == null) {
            return -1;
        }
        return interfaceC5075.mo7190(this.f55562.f75732);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC5075 m40093() {
        return this.f55563;
    }

    @Override // l.InterfaceC12993
    public final long getLineNumber() {
        if (this.f55561 == null) {
            this.f55561 = new C11786(this);
        }
        return this.f55561.m29625();
    }

    @Override // l.InterfaceC12993
    public final long getColumnNumber() {
        if (this.f55561 == null) {
            this.f55561 = new C11786(this);
        }
        return this.f55561.m29624();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object[] m40085() {
        return this.f55564.f43441;
    }

    public final String toString() {
        return this.f55559.mo12290(this, Locale.getDefault());
    }

    @Override // l.InterfaceC12993
    /* JADX INFO: renamed from: ۙ */
    public final EnumC15230 mo32404() {
        int iOrdinal = this.f55564.f43444.ordinal();
        if (iOrdinal == 1) {
            return EnumC15230.NOTE;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return EnumC15230.ERROR;
            }
            return EnumC15230.OTHER;
        }
        if (this.f55560.contains(EnumC6984.MANDATORY)) {
            return EnumC15230.MANDATORY_WARNING;
        }
        return EnumC15230.WARNING;
    }

    @Override // l.InterfaceC12993
    /* JADX INFO: renamed from: ᩷ */
    public final String mo32405() {
        return this.f55564.m33485();
    }

    @Override // l.InterfaceC12993
    /* JADX INFO: renamed from: ۙ */
    public final String mo32403(Locale locale) {
        return this.f55559.mo43485(this, locale);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40092(EnumC6984 enumC6984) {
        Set set = this.f55560;
        set.add(enumC6984);
        if (this.f55564.f43444 == EnumC22229.ERROR) {
            int iOrdinal = enumC6984.ordinal();
            if (iOrdinal == 1) {
                set.add(EnumC6984.RECOVERABLE);
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                set.remove(EnumC6984.RECOVERABLE);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40083(EnumC6984 enumC6984) {
        return this.f55560.contains(enumC6984);
    }
}
