package l;

import java.util.EnumSet;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩸ۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A43N */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21514 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23549 f69896;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HashMap f69897;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C22137 f69898;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo46176(C11948 c11948);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo46179(Object... objArr);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2173 m48202(InterfaceC2173 interfaceC2173) {
        C22137 c22137 = this.f69898;
        InterfaceC2173 interfaceC2174 = c22137 == null ? null : c22137.f71657;
        this.f69898 = m48187(interfaceC2173);
        return interfaceC2174;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22137 m48187(InterfaceC2173 interfaceC2173) {
        HashMap map = this.f69897;
        if (interfaceC2173 == null) {
            return C22137.f71655;
        }
        C22137 c22137 = (C22137) map.get(interfaceC2173);
        if (c22137 != null) {
            return c22137;
        }
        C22137 c22138 = new C22137();
        c22138.f71657 = interfaceC2173;
        c22138.f71656 = this;
        map.put(interfaceC2173, c22138);
        return c22138;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22137 m48186() {
        return this.f69898;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48191(String str, Object... objArr) {
        m48197(this.f69896.m51907(str, objArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48197(C5909 c5909) {
        mo46176(this.f69896.m51908(null, this.f69898, null, c5909));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48199(InterfaceC12260 interfaceC12260, C5909 c5909) {
        mo46176(this.f69896.m51908(null, this.f69898, interfaceC12260, c5909));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48193(EnumC0264 enumC0264, InterfaceC12260 interfaceC12260, C5909 c5909) {
        mo46176(this.f69896.m51908(enumC0264, this.f69898, interfaceC12260, c5909));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48188(int i, C5909 c5909) {
        mo46176(this.f69896.m51908(null, this.f69898, i == -1 ? null : new C3086(i), c5909));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48192(EnumC0264 enumC0264, int i, C5909 c5909) {
        mo46176(this.f69896.m51908(enumC0264, this.f69898, i == -1 ? null : new C3086(i), c5909));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48201(C14065 c14065) {
        C23549 c23549 = this.f69896;
        C22137 c22137 = this.f69898;
        c23549.getClass();
        mo46176(c23549.m51909((EnumC0597) null, EnumSet.noneOf(EnumC0264.class), c22137, (InterfaceC12260) null, c14065));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48195(EnumC0597 enumC0597, C14065 c14065) {
        C23549 c23549 = this.f69896;
        c23549.getClass();
        mo46176(c23549.m51909(enumC0597, EnumSet.noneOf(EnumC0264.class), (C22137) null, (InterfaceC12260) null, c14065));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48204(InterfaceC12260 interfaceC12260, C14065 c14065) {
        C23549 c23549 = this.f69896;
        C22137 c22137 = this.f69898;
        c23549.getClass();
        mo46176(c23549.m51909((EnumC0597) null, EnumSet.noneOf(EnumC0264.class), c22137, interfaceC12260, c14065));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48203(EnumC0597 enumC0597, InterfaceC12260 interfaceC12260, C14065 c14065) {
        C23549 c23549 = this.f69896;
        C22137 c22137 = this.f69898;
        c23549.getClass();
        mo46176(c23549.m51909(enumC0597, EnumSet.noneOf(EnumC0264.class), c22137, interfaceC12260, c14065));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48190(int i, C14065 c14065) {
        C23549 c23549 = this.f69896;
        C22137 c22137 = this.f69898;
        C3086 c3086 = i == -1 ? null : new C3086(i);
        c23549.getClass();
        mo46176(c23549.m51909((EnumC0597) null, EnumSet.noneOf(EnumC0264.class), c22137, c3086, c14065));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48200(InterfaceC12260 interfaceC12260, C14065 c14065) {
        C23549 c23549 = this.f69896;
        C22137 c22137 = this.f69898;
        c23549.getClass();
        mo46176(c23549.m51909((EnumC0597) null, EnumSet.of(EnumC0264.MANDATORY), c22137, interfaceC12260, c14065));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48194(EnumC0597 enumC0597, InterfaceC12260 interfaceC12260, C14065 c14065) {
        C23549 c23549 = this.f69896;
        C22137 c22137 = this.f69898;
        c23549.getClass();
        mo46176(c23549.m51909(enumC0597, EnumSet.of(EnumC0264.MANDATORY), c22137, interfaceC12260, c14065));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48198(AbstractC8774 abstractC8774, C9438 c9438) {
        C23549 c23549 = this.f69896;
        C22137 c22137 = this.f69898;
        c23549.getClass();
        mo46176(c23549.m51909((EnumC0597) null, EnumSet.noneOf(EnumC0264.class), c22137, abstractC8774, c9438));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48189(int i, C9438 c9438) {
        C23549 c23549 = this.f69896;
        C22137 c22137 = this.f69898;
        C3086 c3086 = i == -1 ? null : new C3086(i);
        c23549.getClass();
        mo46176(c23549.m51909((EnumC0597) null, EnumSet.noneOf(EnumC0264.class), c22137, c3086, c9438));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48196(InterfaceC2173 interfaceC2173, C9438 c9438) {
        C23549 c23549 = this.f69896;
        C22137 c22137M48187 = m48187(interfaceC2173);
        c23549.getClass();
        mo46176(c23549.m51909((EnumC0597) null, EnumSet.of(EnumC0264.MANDATORY), c22137M48187, (InterfaceC12260) null, c9438));
    }
}
