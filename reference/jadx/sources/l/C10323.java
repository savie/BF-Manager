package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J8EC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5304 f32927;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8614 f32928;

    public C10323(C8614 c8614) {
        this.f32928 = c8614;
        C5304 c5304 = new C5304(c8614.m23233());
        c5304.m15924();
        c5304.m15926();
        this.f32927 = c5304;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26597(C19274 c19274) {
        String name = c19274.getName();
        C5304 c5304 = this.f32927;
        c5304.m15916(name, (ViewOnLongClickListenerC9293) null);
        c5304.m15907(R.string.MT_Protector, c19274.m44620().getName());
        if (c19274.getSize() != -1) {
            c5304.m15922(c19274.getSize()).m49281(8);
        }
        c5304.m15909(c19274.m44621());
        c5304.m15920();
        C10060.m26010(c5304.m15927(), this.f32928, c19274);
    }
}
