package l;

import java.net.MalformedURLException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܰܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: ZA2F */
/* JADX INFO: loaded from: classes4.dex */
public class C13899 extends AbstractC4725 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C11201 f45787;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final RunnableC6967 f45788;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15166 f45789;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C18652 f45790;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3543 f45791;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9790 f45792 = new C9790();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13008 f45793;

    public C13899(C3543 c3543) {
        this.f45791 = c3543;
        new HashMap();
        this.f45793 = new C13008(this);
        this.f45788 = new RunnableC6967(this);
        this.f45787 = new C11201(c3543);
        this.f45789 = new C15166();
        this.f45790 = new C18652();
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
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC14834 mo29452() {
        return this.f45789;
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC10601 mo29449() {
        return this.f45791;
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC21183 mo29447() {
        return this.f45792;
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC0721 mo29450() {
        return this.f45788;
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ۘ */
    public final C11201 mo29448() {
        return this.f45787;
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ۬ */
    public final C13008 mo29451() {
        return this.f45793;
    }

    @Override // l.AbstractC4725
    /* JADX INFO: renamed from: ᩺ */
    public final C18652 mo13097() {
        return this.f45790;
    }

    @Override // l.AbstractC4725
    /* JADX INFO: renamed from: ۜ */
    public final void mo13094() {
        super.mo13094();
        this.f45789.m36381();
    }
}
