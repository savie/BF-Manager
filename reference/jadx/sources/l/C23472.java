package l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ۙܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8RT */
/* JADX INFO: loaded from: classes.dex */
public final class C23472 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C11164 f75992;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC20723 f75994;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC14113 f75996;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0166 f75997;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f75995 = new HashMap();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f75993 = new HashMap();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f75998 = true;

    public C23472(InterfaceC0166 interfaceC0166, C11164 c11164) {
        this.f75997 = interfaceC0166;
        this.f75992 = c11164;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23035 m51716(int i) {
        InterfaceC23949 interfaceC23949;
        InterfaceC23949 interfaceC239410;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f75993;
        InterfaceC23035 interfaceC23035 = (InterfaceC23035) map.get(numValueOf);
        if (interfaceC23035 != null) {
            return interfaceC23035;
        }
        Integer numValueOf2 = Integer.valueOf(i);
        HashMap map2 = this.f75995;
        InterfaceC23949 interfaceC239411 = (InterfaceC23949) map2.get(numValueOf2);
        if (interfaceC239411 == null) {
            final InterfaceC20723 interfaceC20723 = this.f75994;
            interfaceC20723.getClass();
            if (i == 0) {
                final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(InterfaceC23035.class);
                interfaceC23949 = new InterfaceC23949() { // from class: l.ܽۙܰ
                    @Override // l.InterfaceC23949
                    public final Object get() {
                        return C1598.m5441(clsAsSubclass, interfaceC20723);
                    }
                };
            } else if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(InterfaceC23035.class);
                        interfaceC239410 = new InterfaceC23949() { // from class: l.ۛۙܰ
                            @Override // l.InterfaceC23949
                            public final Object get() {
                                try {
                                    return (InterfaceC23035) clsAsSubclass2.getConstructor(null).newInstance(null);
                                } catch (Exception e) {
                                    throw new IllegalStateException(e);
                                }
                            }
                        };
                    } else {
                        if (i != 4) {
                            throw new IllegalArgumentException(C8479.m22141(i, "Unrecognized contentType: "));
                        }
                        interfaceC239410 = new InterfaceC23949() { // from class: l.ۧۙܰ
                            @Override // l.InterfaceC23949
                            public final Object get() {
                                return C23472.m51715(this.f36723, interfaceC20723);
                            }
                        };
                    }
                    interfaceC239411 = interfaceC239410;
                } else {
                    final Class clsAsSubclass3 = C11053.class.asSubclass(InterfaceC23035.class);
                    interfaceC23949 = new InterfaceC23949() { // from class: l.ܿۙܰ
                        @Override // l.InterfaceC23949
                        public final Object get() {
                            return C1598.m5441(clsAsSubclass3, interfaceC20723);
                        }
                    };
                }
                map2.put(Integer.valueOf(i), interfaceC239411);
            } else {
                final Class<? extends U> clsAsSubclass4 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(InterfaceC23035.class);
                interfaceC23949 = new InterfaceC23949() { // from class: l.۫ۙܰ
                    @Override // l.InterfaceC23949
                    public final Object get() {
                        return C1598.m5441(clsAsSubclass4, interfaceC20723);
                    }
                };
            }
            interfaceC239411 = interfaceC23949;
            map2.put(Integer.valueOf(i), interfaceC239411);
        }
        InterfaceC23035 interfaceC23036 = (InterfaceC23035) interfaceC239411.get();
        InterfaceC14113 interfaceC14113 = this.f75996;
        if (interfaceC14113 != null) {
            interfaceC23036.mo5446(interfaceC14113);
        }
        interfaceC23036.mo5445(this.f75992);
        interfaceC23036.mo5447(this.f75998);
        interfaceC23036.mo5444();
        map.put(Integer.valueOf(i), interfaceC23036);
        return interfaceC23036;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51720(InterfaceC20723 interfaceC20723) {
        if (interfaceC20723 != this.f75994) {
            this.f75994 = interfaceC20723;
            this.f75995.clear();
            this.f75993.clear();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51721(boolean z) {
        this.f75998 = z;
        this.f75997.mo1322(z);
        Iterator it = this.f75993.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC23035) it.next()).mo5447(z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51718(C11164 c11164) {
        this.f75992 = c11164;
        this.f75997.mo1321(c11164);
        Iterator it = this.f75993.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC23035) it.next()).mo5445(c11164);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51717() {
        this.f75997.mo1320();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51719(InterfaceC14113 interfaceC14113) {
        this.f75996 = interfaceC14113;
        Iterator it = this.f75993.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC23035) it.next()).mo5446(interfaceC14113);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51722() {
        InterfaceC0166 interfaceC0166 = this.f75997;
        if (interfaceC0166 instanceof C18511) {
            ((C18511) interfaceC0166).m42901();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C22267 m51715(C23472 c23472, InterfaceC20723 interfaceC20723) {
        return new C22267(interfaceC20723, c23472.f75997);
    }
}
