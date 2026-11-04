package l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T8RT */
/* JADX INFO: loaded from: classes2.dex */
public final class C3182 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC15670 f10324;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC4365 f10325;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C3509 f10326;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC1603 f10329;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f10328 = new HashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f10330 = new HashMap();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f10327 = true;

    public C3182(InterfaceC1603 interfaceC1603, C3509 c3509) {
        this.f10329 = interfaceC1603;
        this.f10326 = c3509;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2436 m10384(int i) {
        InterfaceC6908 interfaceC6908;
        InterfaceC6908 interfaceC6909;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f10330;
        InterfaceC2436 interfaceC2436 = (InterfaceC2436) map.get(numValueOf);
        if (interfaceC2436 != null) {
            return interfaceC2436;
        }
        Integer numValueOf2 = Integer.valueOf(i);
        HashMap map2 = this.f10328;
        InterfaceC6908 interfaceC69010 = (InterfaceC6908) map2.get(numValueOf2);
        if (interfaceC69010 == null) {
            final InterfaceC15670 interfaceC15670 = this.f10324;
            interfaceC15670.getClass();
            if (i == 0) {
                final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(InterfaceC2436.class);
                interfaceC6908 = new InterfaceC6908() { // from class: l.᩻ۙ᩷
                    @Override // l.InterfaceC6908
                    public final Object get() {
                        return C12131.m30322(clsAsSubclass, interfaceC15670);
                    }
                };
            } else if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(InterfaceC2436.class);
                        interfaceC6909 = new InterfaceC6908() { // from class: l.ܶۙ᩷
                            @Override // l.InterfaceC6908
                            public final Object get() {
                                try {
                                    return (InterfaceC2436) clsAsSubclass2.getConstructor(null).newInstance(null);
                                } catch (Exception e) {
                                    throw new IllegalStateException(e);
                                }
                            }
                        };
                    } else {
                        if (i != 4) {
                            throw new IllegalArgumentException(C13645.m33382(i, "Unrecognized contentType: "));
                        }
                        interfaceC6909 = new InterfaceC6908() { // from class: l.᩹ۙ᩷
                            @Override // l.InterfaceC6908
                            public final Object get() {
                                return C3182.m10383(this.f75539, interfaceC15670);
                            }
                        };
                    }
                    interfaceC69010 = interfaceC6909;
                } else {
                    final Class clsAsSubclass3 = C3103.class.asSubclass(InterfaceC2436.class);
                    interfaceC6908 = new InterfaceC6908() { // from class: l.ܽۙ᩷
                        @Override // l.InterfaceC6908
                        public final Object get() {
                            return C12131.m30322(clsAsSubclass3, interfaceC15670);
                        }
                    };
                }
                map2.put(Integer.valueOf(i), interfaceC69010);
            } else {
                final Class<? extends U> clsAsSubclass4 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(InterfaceC2436.class);
                interfaceC6908 = new InterfaceC6908() { // from class: l.ܺۙ᩷
                    @Override // l.InterfaceC6908
                    public final Object get() {
                        return C12131.m30322(clsAsSubclass4, interfaceC15670);
                    }
                };
            }
            interfaceC69010 = interfaceC6908;
            map2.put(Integer.valueOf(i), interfaceC69010);
        }
        InterfaceC2436 interfaceC2437 = (InterfaceC2436) interfaceC69010.get();
        InterfaceC4365 interfaceC4365 = this.f10325;
        if (interfaceC4365 != null) {
            interfaceC2437.mo8212(interfaceC4365);
        }
        interfaceC2437.mo8211(this.f10326);
        interfaceC2437.mo8213(this.f10327);
        interfaceC2437.mo8210();
        map.put(Integer.valueOf(i), interfaceC2437);
        return interfaceC2437;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10388(InterfaceC15670 interfaceC15670) {
        if (interfaceC15670 != this.f10324) {
            this.f10324 = interfaceC15670;
            this.f10328.clear();
            this.f10330.clear();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10389(boolean z) {
        this.f10327 = z;
        this.f10329.mo5616(z);
        Iterator it = this.f10330.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC2436) it.next()).mo8213(z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10386(C3509 c3509) {
        this.f10326 = c3509;
        this.f10329.mo5615(c3509);
        Iterator it = this.f10330.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC2436) it.next()).mo8211(c3509);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10385() {
        this.f10329.mo5614();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10387(InterfaceC4365 interfaceC4365) {
        this.f10325 = interfaceC4365;
        Iterator it = this.f10330.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC2436) it.next()).mo8212(interfaceC4365);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m10390() {
        InterfaceC1603 interfaceC1603 = this.f10329;
        if (interfaceC1603 instanceof C13644) {
            ((C13644) interfaceC1603).m33380();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C8160 m10383(C3182 c3182, InterfaceC15670 interfaceC15670) {
        return new C8160(interfaceC15670, c3182.f10329);
    }
}
