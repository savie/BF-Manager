package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.۫ۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35MO */
/* JADX INFO: loaded from: classes4.dex */
public final class C12241 extends C11452 implements InterfaceC11016 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f40974;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m30443(Object obj) {
        return ((C10124) obj).f34607.f20097;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C17179 m30445(Object obj) {
        return ((C10124) obj).f34607.f20096;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1428 m30446(InterfaceC8858 interfaceC8858) {
        return ((C5890) interfaceC8858).f20095;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17179 m30447(InterfaceC8858 interfaceC8858) {
        return ((C5890) interfaceC8858).f20096;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5890 m30448(Object obj) {
        return ((C10124) obj).f34607;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3067 m30449(InterfaceC8858 interfaceC8858) {
        return ((C5890) interfaceC8858).f20094;
    }

    @Override // l.InterfaceC16660
    /* JADX INFO: renamed from: ᩹ */
    public final int mo24178(Object obj) {
        return ((C5890) obj).f20097;
    }

    public C12241(C8485 c8485) {
        super(c8485);
        this.f40974 = new ConcurrentMapC13783();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C5890 m30444(InterfaceC8858 interfaceC8858) {
        String string = interfaceC8858.toString();
        ConcurrentMapC13783 concurrentMapC13783 = this.f40974;
        C5890 c5890 = (C5890) concurrentMapC13783.get(string);
        if (c5890 != null) {
            return c5890;
        }
        C8485 c8485 = this.f38553;
        C1428 c1428M50097 = c8485.f51666.m50097(interfaceC8858.mo9700());
        C3067 c3067M24176 = ((C9419) c8485.f51669).m24176(interfaceC8858.getName());
        C23530 c23530 = c8485.f51670;
        c23530.getClass();
        C5890 c5891 = new C5890(c1428M50097, c3067M24176, c23530.m51843(new C12117(interfaceC8858.mo9698(), interfaceC8858.mo9699())));
        C5890 c5892 = (C5890) concurrentMapC13783.putIfAbsent(string, c5891);
        return c5892 == null ? c5891 : c5892;
    }

    @Override // l.InterfaceC16660
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo1279() {
        return new C0245(this.f40974.values());
    }

    @Override // l.InterfaceC16660
    public final int getItemCount() {
        return this.f40974.size();
    }
}
