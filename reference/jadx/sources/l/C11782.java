package l;

import java.net.MalformedURLException;

/* JADX INFO: renamed from: l.ۨܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 99VK */
/* JADX INFO: loaded from: classes4.dex */
public final class C11782 implements InterfaceC19067 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C13008 f39575;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC23901 f39576;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC4725 f39577;

    public C11782(AbstractC4725 abstractC4725, InterfaceC23901 interfaceC23901) {
        this.f39577 = abstractC4725;
        this.f39576 = interfaceC23901;
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo13092() {
        InterfaceC23901 interfaceC23901M29045;
        InterfaceC23901 interfaceC23901 = this.f39576;
        if (!(interfaceC23901 instanceof InterfaceC11638) || (interfaceC23901M29045 = ((InterfaceC11638) interfaceC23901).m29045()) == null) {
            return false;
        }
        this.f39576 = interfaceC23901M29045;
        return true;
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC23901 mo13093() {
        return this.f39576;
    }

    @Override // l.InterfaceC19067
    public final C17241 get(String str) throws C8484 {
        try {
            return new C17241(str, this);
        } catch (MalformedURLException e) {
            throw new C8484(C0252.m1693("Invalid URL ", str), e);
        }
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10601 mo29449() {
        return ((C13899) this.f39577).mo29449();
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21183 mo29447() {
        return ((C13899) this.f39577).mo29447();
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C13008 mo29451() {
        if (this.f39575 == null) {
            this.f39575 = new C13008(this);
        }
        return this.f39575;
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC19067 mo13095() {
        return this.f39577.mo13095();
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0721 mo29450() {
        return ((C13899) this.f39577).mo29450();
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C11201 mo29448() {
        return ((C13899) this.f39577).mo29448();
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC14834 mo29452() {
        return ((C13899) this.f39577).mo29452();
    }
}
