package l;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 544J */
/* JADX INFO: loaded from: classes5.dex */
public final class C19991 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C13477 f64247 = new C13477();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumSet f64248;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f64249;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C18698 f64250;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19991 m45972(C4747 c4747) {
        C19991 c19991 = (C19991) c4747.m14643(f64247);
        return c19991 == null ? new C19991(c4747) : c19991;
    }

    public C19991(C4747 c4747) {
        C23721 c23721M52973 = C23721.m52973(c4747);
        this.f64249 = "compiler";
        this.f64250 = new C18698(c23721M52973, new C7511());
        EnumSet enumSetOf = EnumSet.of(EnumC6984.MANDATORY);
        this.f64248 = enumSetOf;
        c4747.m14646(f64247, this);
        final C13015 c13015M32421 = C13015.m32421(c4747);
        if (c13015M32421.m32432("onlySyntaxErrorsUnrecoverable")) {
            enumSetOf.add(EnumC6984.RECOVERABLE);
        }
        c13015M32421.m32425(new Runnable() { // from class: l.᩸ᩳۘ
            @Override // java.lang.Runnable
            public final void run() {
                if (c13015M32421.m32432("onlySyntaxErrorsUnrecoverable")) {
                    this.f74611.f64248.add(EnumC6984.RECOVERABLE);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17007 m45974(EnumC6984 enumC6984, C23393 c23393, InterfaceC5075 interfaceC5075, C11040 c11040) {
        C17007 c17007M45976 = m45976((EnumC19876) null, EnumSet.copyOf((Collection) this.f64248), c23393, interfaceC5075, c11040);
        if (enumC6984 != null) {
            c17007M45976.m40092(enumC6984);
        }
        return c17007M45976;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17007 m45975(C15515 c15515) {
        return m45976((EnumC19876) null, EnumSet.noneOf(EnumC6984.class), (C23393) null, (InterfaceC5075) null, c15515);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17007 m45978(EnumC22229 enumC22229, C23393 c23393, InterfaceC5075 interfaceC5075, String str, Object... objArr) {
        return m45976((EnumC19876) null, EnumSet.noneOf(EnumC6984.class), c23393, interfaceC5075, AbstractC13695.m33484(enumC22229, this.f64249, str, objArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17007 m45977(EnumC22229 enumC22229, EnumSet enumSet, C23393 c23393, InterfaceC5075 interfaceC5075, Object... objArr) {
        return m45976((EnumC19876) null, enumSet, c23393, interfaceC5075, AbstractC13695.m33484(enumC22229, this.f64249, "cant.apply.symbols", objArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17007 m45976(EnumC19876 enumC19876, Set set, C23393 c23393, InterfaceC5075 interfaceC5075, AbstractC13695 abstractC13695) {
        return new C17007(this.f64250, AbstractC13695.m33484(abstractC13695.f43444, abstractC13695.f43442, abstractC13695.f43443, C23654.of(abstractC13695.f43441).map(new C2085(3, this)).toArray()), enumC19876, set, c23393, interfaceC5075);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11040 m45973(String str, Object... objArr) {
        return (C11040) AbstractC13695.m33484(EnumC22229.ERROR, this.f64249, str, objArr);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C5821 m45979(String str, Object... objArr) {
        return (C5821) AbstractC13695.m33484(EnumC22229.NOTE, this.f64249, str, objArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17007 m45980(String str, Object... objArr) {
        return m45975((C15515) AbstractC13695.m33484(EnumC22229.FRAGMENT, this.f64249, str, objArr));
    }
}
