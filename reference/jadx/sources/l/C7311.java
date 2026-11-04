package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۜᩳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36FV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7311 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f24064;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8802 f24065 = new C8802(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f24063 = new HashMap();

    public C7311(C6129 c6129) {
        this.f24064 = c6129.m17721();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20019(C17467 c17467, Object obj, boolean z) {
        if (!z) {
            ((C8802) C11392.computeIfAbsent(this.f24063, c17467.m40972(), new C9547())).m23630(obj, c17467);
            return;
        }
        this.f24065.m23630(obj, c17467);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20020(C24927 c24927) {
        this.f24063.remove(c24927);
        this.f24065.m23631(c24927);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4043 m20017(C24927 c24927, Object obj, boolean z) {
        InterfaceC4043 interfaceC4043M23633;
        if (!this.f24064) {
            return null;
        }
        C1610 c1610Mo8527 = c24927.mo8527();
        C8802 c8802 = this.f24065;
        boolean zM23632 = c8802.m23632(obj);
        if (zM23632 && !z) {
            return null;
        }
        while (c24927 != null) {
            C8802 c8803 = (C8802) this.f24063.get(c24927);
            if (c8803 != null && (interfaceC4043M23633 = c8803.m23633(obj)) != null) {
                if (zM23632) {
                    return null;
                }
                return interfaceC4043M23633;
            }
            C1345 c1345M4973 = c24927.m55571().m4973();
            if (c1345M4973 == null) {
                break;
            }
            c24927 = c1610Mo8527.m5671(c1345M4973);
        }
        if (z) {
            return c8802.m23633(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4043 m20018(C24927 c24927, C23195 c23195) {
        EnumC12006 enumC12006Mo5558;
        if (!this.f24064 || (enumC12006Mo5558 = c23195.getType().mo5558()) == null) {
            return null;
        }
        long jM52122 = c23195.m52122();
        switch (C2836.f9340[enumC12006Mo5558.ordinal()]) {
            case 1:
                return m20017(c24927, (Object) Boolean.valueOf(jM52122 == 1), false);
            case 2:
                return m20017(c24927, Character.valueOf((char) jM52122), Math.abs(jM52122) > 10);
            case 3:
                return m20017(c24927, Byte.valueOf((byte) jM52122), Math.abs(jM52122) > 10);
            case 4:
                return m20017(c24927, Short.valueOf((short) jM52122), Math.abs(jM52122) > 100);
            case 5:
                return m20017(c24927, Integer.valueOf((int) jM52122), Math.abs(jM52122) > 100);
            case 6:
                return m20017(c24927, Long.valueOf(jM52122), Math.abs(jM52122) > 1000);
            case 7:
                float fIntBitsToFloat = Float.intBitsToFloat((int) jM52122);
                return m20017(c24927, Float.valueOf(fIntBitsToFloat), Float.compare(fIntBitsToFloat, 0.0f) == 0);
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble(jM52122);
                return m20017(c24927, Double.valueOf(dLongBitsToDouble), Double.compare(dLongBitsToDouble, 0.0d) == 0);
            default:
                return null;
        }
    }
}
