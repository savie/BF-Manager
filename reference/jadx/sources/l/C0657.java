package l;

import java.net.MalformedURLException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֡᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZA2F */
/* JADX INFO: loaded from: classes3.dex */
public class C0657 extends AbstractC18556 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C21540 f2523;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C10506 f2524;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C19982 f2525;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C8882 f2526;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final RunnableC13904 f2527;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6646 f2528;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21562 f2529 = new C21562();

    public C0657(C21540 c21540) {
        this.f2523 = c21540;
        new HashMap();
        this.f2526 = new C8882(this);
        this.f2527 = new RunnableC13904(this);
        this.f2528 = new C6646(c21540);
        this.f2524 = new C10506();
        this.f2525 = new C19982();
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
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24524 mo2874() {
        return this.f2524;
    }

    @Override // l.InterfaceC23032
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5878 mo2875() {
        return this.f2523;
    }

    @Override // l.InterfaceC23032
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC11843 mo2876() {
        return this.f2529;
    }

    @Override // l.InterfaceC23032
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17810 mo2872() {
        return this.f2527;
    }

    @Override // l.InterfaceC23032
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6646 mo2870() {
        return this.f2528;
    }

    @Override // l.InterfaceC23032
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C8882 mo2871() {
        return this.f2526;
    }

    @Override // l.AbstractC18556
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C19982 mo2877() {
        return this.f2525;
    }

    @Override // l.AbstractC18556
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo2873() {
        super.mo2873();
        this.f2524.m26970();
    }
}
