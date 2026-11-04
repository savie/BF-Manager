package l;

import java.util.EnumSet;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܰ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A43N */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14222 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19991 f44939;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HashMap f44940;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C23393 f44941;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo20039(C17007 c17007);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo20041(Object... objArr);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC15976 m34530(InterfaceC15976 interfaceC15976) {
        C23393 c23393 = this.f44941;
        InterfaceC15976 interfaceC15977 = c23393 == null ? null : c23393.f75737;
        this.f44941 = m34515(interfaceC15976);
        return interfaceC15977;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23393 m34515(InterfaceC15976 interfaceC15976) {
        HashMap map = this.f44940;
        if (interfaceC15976 == null) {
            return C23393.f75729;
        }
        C23393 c23393 = (C23393) map.get(interfaceC15976);
        if (c23393 != null) {
            return c23393;
        }
        C23393 c23394 = new C23393();
        c23394.f75737 = interfaceC15976;
        c23394.f75733 = this;
        map.put(interfaceC15976, c23394);
        return c23394;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23393 m34514() {
        return this.f44941;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34519(String str, Object... objArr) {
        m34525(this.f44939.m45973(str, objArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34525(C11040 c11040) {
        mo20039(this.f44939.m45974(null, this.f44941, null, c11040));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34520(InterfaceC5075 interfaceC5075, C11040 c11040) {
        mo20039(this.f44939.m45974(null, this.f44941, interfaceC5075, c11040));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34523(EnumC6984 enumC6984, InterfaceC5075 interfaceC5075, C11040 c11040) {
        mo20039(this.f44939.m45974(enumC6984, this.f44941, interfaceC5075, c11040));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34517(int i, C11040 c11040) {
        mo20039(this.f44939.m45974(null, this.f44941, i == -1 ? null : new C2092(i), c11040));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34522(EnumC6984 enumC6984, int i, C11040 c11040) {
        mo20039(this.f44939.m45974(enumC6984, this.f44941, i == -1 ? null : new C2092(i), c11040));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34529(C25213 c25213) {
        C19991 c19991 = this.f44939;
        C23393 c23393 = this.f44941;
        c19991.getClass();
        mo20039(c19991.m45976((EnumC19876) null, EnumSet.noneOf(EnumC6984.class), c23393, (InterfaceC5075) null, c25213));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34528(EnumC19876 enumC19876, C25213 c25213) {
        C19991 c19991 = this.f44939;
        c19991.getClass();
        mo20039(c19991.m45976(enumC19876, EnumSet.noneOf(EnumC6984.class), (C23393) null, (InterfaceC5075) null, c25213));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34531(InterfaceC5075 interfaceC5075, C25213 c25213) {
        C19991 c19991 = this.f44939;
        C23393 c23393 = this.f44941;
        c19991.getClass();
        mo20039(c19991.m45976((EnumC19876) null, EnumSet.noneOf(EnumC6984.class), c23393, interfaceC5075, c25213));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34532(EnumC19876 enumC19876, InterfaceC5075 interfaceC5075, C25213 c25213) {
        C19991 c19991 = this.f44939;
        C23393 c23393 = this.f44941;
        c19991.getClass();
        mo20039(c19991.m45976(enumC19876, EnumSet.noneOf(EnumC6984.class), c23393, interfaceC5075, c25213));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34518(int i, C25213 c25213) {
        C19991 c19991 = this.f44939;
        C23393 c23393 = this.f44941;
        C2092 c2092 = i == -1 ? null : new C2092(i);
        c19991.getClass();
        mo20039(c19991.m45976((EnumC19876) null, EnumSet.noneOf(EnumC6984.class), c23393, c2092, c25213));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34521(InterfaceC5075 interfaceC5075, C25213 c25213) {
        C19991 c19991 = this.f44939;
        C23393 c23393 = this.f44941;
        c19991.getClass();
        mo20039(c19991.m45976((EnumC19876) null, EnumSet.of(EnumC6984.MANDATORY), c23393, interfaceC5075, c25213));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34527(EnumC19876 enumC19876, InterfaceC5075 interfaceC5075, C25213 c25213) {
        C19991 c19991 = this.f44939;
        C23393 c23393 = this.f44941;
        c19991.getClass();
        mo20039(c19991.m45976(enumC19876, EnumSet.of(EnumC6984.MANDATORY), c23393, interfaceC5075, c25213));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34524(AbstractC8036 abstractC8036, C5821 c5821) {
        C19991 c19991 = this.f44939;
        C23393 c23393 = this.f44941;
        c19991.getClass();
        mo20039(c19991.m45976((EnumC19876) null, EnumSet.noneOf(EnumC6984.class), c23393, abstractC8036, c5821));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34516(int i, C5821 c5821) {
        C19991 c19991 = this.f44939;
        C23393 c23393 = this.f44941;
        C2092 c2092 = i == -1 ? null : new C2092(i);
        c19991.getClass();
        mo20039(c19991.m45976((EnumC19876) null, EnumSet.noneOf(EnumC6984.class), c23393, c2092, c5821));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34526(InterfaceC15976 interfaceC15976, C5821 c5821) {
        C19991 c19991 = this.f44939;
        C23393 c23393M34515 = m34515(interfaceC15976);
        c19991.getClass();
        mo20039(c19991.m45976((EnumC19876) null, EnumSet.of(EnumC6984.MANDATORY), c23393M34515, (InterfaceC5075) null, c5821));
    }
}
