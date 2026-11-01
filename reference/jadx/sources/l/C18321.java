package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P3JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18321 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C18321 f58451;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC15542 f58452;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC17428 f58453;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18321 m42557(InterfaceC15542 interfaceC15542, C8753 c8753) {
        C18321 c18321 = new C18321(null, interfaceC15542);
        if (c18321.f58453 == c8753) {
            return c18321;
        }
        try {
            new C15500().m43758(c18321, c8753);
            return null;
        } catch (C21849 e) {
            return e.f70919;
        }
    }

    public C18321(C18321 c18321, InterfaceC17428 interfaceC17428) {
        if (interfaceC17428.mo1801() == EnumC12490.COMPILATION_UNIT) {
            this.f58452 = (InterfaceC15542) interfaceC17428;
            this.f58451 = null;
        } else {
            this.f58452 = c18321.f58452;
            this.f58451 = c18321;
        }
        this.f58453 = interfaceC17428;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15542 m42560() {
        return this.f58452;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17428 m42559() {
        return this.f58453;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C23261(this);
    }
}
