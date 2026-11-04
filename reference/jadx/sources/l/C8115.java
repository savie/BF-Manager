package l;

import java.net.MalformedURLException;

/* JADX INFO: renamed from: l.۟᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 99VK */
/* JADX INFO: loaded from: classes4.dex */
public final class C8115 implements InterfaceC23032 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC24546 f26782;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C8882 f26783;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC18556 f26784;

    public C8115(AbstractC18556 abstractC18556, InterfaceC24546 interfaceC24546) {
        this.f26784 = abstractC18556;
        this.f26782 = interfaceC24546;
    }

    @Override // l.InterfaceC23032
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24546 mo22000() {
        return this.f26782;
    }

    @Override // l.InterfaceC23032
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean mo22001() {
        InterfaceC24546 interfaceC24546M26519;
        InterfaceC24546 interfaceC24546 = this.f26782;
        if (!(interfaceC24546 instanceof InterfaceC10285) || (interfaceC24546M26519 = ((InterfaceC10285) interfaceC24546).m26519()) == null) {
            return false;
        }
        this.f26782 = interfaceC24546M26519;
        return true;
    }

    @Override // l.InterfaceC23032
    public final C12523 get(String str) throws C20048 {
        try {
            return new C12523(str, this);
        } catch (MalformedURLException e) {
            throw new C20048(C25272.m56409("Invalid URL ", str), e);
        }
    }

    @Override // l.InterfaceC23032
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC5878 mo2875() {
        return ((C0657) this.f26784).mo2875();
    }

    @Override // l.InterfaceC23032
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC11843 mo2876() {
        return ((C0657) this.f26784).mo2876();
    }

    @Override // l.InterfaceC23032
    /* JADX INFO: renamed from: ۚ */
    public final C8882 mo2871() {
        if (this.f26783 == null) {
            this.f26783 = new C8882(this);
        }
        return this.f26783;
    }

    @Override // l.InterfaceC23032
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC23032 mo22002() {
        return this.f26784.mo22002();
    }

    @Override // l.InterfaceC23032
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC17810 mo2872() {
        return ((C0657) this.f26784).mo2872();
    }

    @Override // l.InterfaceC23032
    /* JADX INFO: renamed from: ֫ */
    public final C6646 mo2870() {
        return ((C0657) this.f26784).mo2870();
    }

    @Override // l.InterfaceC23032
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC24524 mo2874() {
        return ((C0657) this.f26784).mo2874();
    }
}
