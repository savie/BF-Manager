package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۤۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10005 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3402 f34177;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11083 f34178;

    public C10005(C19883 c19883, int i, int i2) {
        if (c19883 == null) {
            throw new NullPointerException("cf == null");
        }
        this.f34178 = c19883.m45133();
        this.f34177 = new C3402(new C4835(c19883.m45129().m33866(i, i2 + i)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9901 m25279() {
        try {
            AbstractC9901 abstractC9901M25275 = m25275();
            if (this.f34177.available() == 0) {
                return abstractC9901M25275;
            }
            throw new C1537("extra data in attribute", null);
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9424 m25280(EnumC14363 enumC14363) {
        C3402 c3402 = this.f34177;
        try {
            int unsignedByte = c3402.readUnsignedByte();
            C9424 c9424 = new C9424(unsignedByte);
            for (int i = 0; i < unsignedByte; i++) {
                int unsignedShort = c3402.readUnsignedShort();
                C1661 c1661 = new C1661();
                for (int i2 = 0; i2 < unsignedShort; i2++) {
                    c1661.m5566(m25276(enumC14363));
                }
                c1661.mo9637();
                c9424.m24183(i, c1661);
            }
            c9424.mo9637();
            if (c3402.available() == 0) {
                return c9424;
            }
            throw new C1537("extra data in attribute", null);
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1661 m25278(EnumC14363 enumC14363) {
        C3402 c3402 = this.f34177;
        try {
            int unsignedShort = c3402.readUnsignedShort();
            C1661 c1661 = new C1661();
            for (int i = 0; i < unsignedShort; i++) {
                c1661.m5566(m25276(enumC14363));
            }
            c1661.mo9637();
            if (c3402.available() == 0) {
                return c1661;
            }
            throw new C1537("extra data in attribute", null);
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C23535 m25276(EnumC14363 enumC14363) throws IOException {
        m25274(4);
        C3402 c3402 = this.f34177;
        int unsignedShort = c3402.readUnsignedShort();
        int unsignedShort2 = c3402.readUnsignedShort();
        C11083 c11083 = this.f34178;
        C23535 c23535 = new C23535(new C6143(C3320.m9826(((C17432) c11083.get(unsignedShort)).getString())), enumC14363);
        for (int i = 0; i < unsignedShort2; i++) {
            m25274(5);
            c23535.m51860(new C3072((C17432) c11083.get(c3402.readUnsignedShort()), m25275()));
        }
        c23535.mo9637();
        return c23535;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private AbstractC9901 m25275() throws IOException {
        C3402 c3402 = this.f34177;
        int unsignedByte = c3402.readUnsignedByte();
        if (unsignedByte == 64) {
            return new C3549(m25276(EnumC14363.EMBEDDED));
        }
        if (unsignedByte == 70) {
            return (C15316) m25277();
        }
        if (unsignedByte == 83) {
            return C12494.m31036(((C21665) m25277()).mo21658());
        }
        C11083 c11083 = this.f34178;
        if (unsignedByte == 99) {
            String string = ((C17432) c11083.get(c3402.readUnsignedShort())).getString();
            C3320 c3320 = C3320.f12273;
            try {
                return new C6143(string.equals("V") ? C3320.f12280 : C3320.m9826(string));
            } catch (NullPointerException unused) {
                throw new NullPointerException("descriptor == null");
            }
        }
        if (unsignedByte == 101) {
            m25274(4);
            int unsignedShort = c3402.readUnsignedShort();
            return new C6848(new C0498((C17432) c11083.get(c3402.readUnsignedShort()), (C17432) c11083.get(unsignedShort)));
        }
        if (unsignedByte == 115) {
            return m25277();
        }
        if (unsignedByte == 73) {
            return (C21665) m25277();
        }
        if (unsignedByte == 74) {
            return (C7554) m25277();
        }
        if (unsignedByte == 90) {
            return C2614.m8088(((C21665) m25277()).mo21658());
        }
        if (unsignedByte != 91) {
            switch (unsignedByte) {
                case 66:
                    return C5437.m15038(((C21665) m25277()).mo21658());
                case 67:
                    return C13199.m32669(((C21665) m25277()).mo21658());
                case 68:
                    return (C4025) m25277();
                default:
                    throw new C1537("unknown annotation tag: ".concat(C22475.m49983(unsignedByte)), null);
            }
        }
        m25274(2);
        int unsignedShort2 = c3402.readUnsignedShort();
        C4731 c4731 = new C4731(unsignedShort2);
        for (int i = 0; i < unsignedShort2; i++) {
            c4731.mo15257(i, m25275());
        }
        c4731.mo9637();
        return new C13905(c4731);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private AbstractC9901 m25277() throws IOException {
        return this.f34178.get(this.f34177.readUnsignedShort());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25274(int i) {
        if (this.f34177.available() < i) {
            throw new C1537("truncated annotation attribute", null);
        }
    }
}
