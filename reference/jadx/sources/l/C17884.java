package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ᩳۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 963I */
/* JADX INFO: loaded from: classes5.dex */
public final class C17884 extends C11452 implements InterfaceC0431 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f56642;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m41507(Object obj) {
        return ((C15063) obj).f49112.f59138;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1428 m41509(InterfaceC18735 interfaceC18735) {
        return ((C18590) interfaceC18735).f59139;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C3067 m41510(InterfaceC18735 interfaceC18735) {
        return ((C18590) interfaceC18735).f59140;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1428 m41511(InterfaceC18735 interfaceC18735) {
        return ((C18590) interfaceC18735).f59141;
    }

    @Override // l.InterfaceC16660
    /* JADX INFO: renamed from: ᩹ */
    public final int mo24178(Object obj) {
        return ((C18590) obj).f59138;
    }

    public C17884(C8485 c8485) {
        super(c8485);
        this.f56642 = new ConcurrentMapC13783();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C18590 m41508(InterfaceC18735 interfaceC18735) {
        ConcurrentMapC13783 concurrentMapC13783 = this.f56642;
        C18590 c18590 = (C18590) concurrentMapC13783.get(interfaceC18735);
        if (c18590 != null) {
            return c18590;
        }
        C8485 c8485 = this.f38553;
        C18590 c18591 = new C18590(c8485.f51666.m50097(interfaceC18735.mo1183()), ((C9419) c8485.f51669).m24176(interfaceC18735.getName()), c8485.f51666.m50097(interfaceC18735.getType()));
        C18590 c18592 = (C18590) concurrentMapC13783.putIfAbsent(c18591, c18591);
        return c18592 == null ? c18591 : c18592;
    }

    @Override // l.InterfaceC16660
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo1279() {
        return new C21412(this.f56642.values());
    }

    @Override // l.InterfaceC16660
    public final int getItemCount() {
        return this.f56642.size();
    }
}
