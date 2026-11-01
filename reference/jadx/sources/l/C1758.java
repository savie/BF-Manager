package l;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Properties;

/* JADX INFO: renamed from: l.֫ۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: G3L1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1758 extends AbstractC4497 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final EnumC14460 f6891;

    public C1758(C22492 c22492) {
        EnumC14460 enumC14460;
        super(c22492);
        this.f16002 = new EnumMap(EnumC5992.class);
        for (EnumC5992 enumC5992 : EnumC5992.values()) {
            this.f16002.put(enumC5992, new ArrayList());
        }
        InterfaceC2173 interfaceC2173 = c22492.f73422;
        if ((interfaceC2173 == null && c22492.f73415 == null) || (interfaceC2173 != null && interfaceC2173.mo6760() == EnumC11347.CLASS)) {
            enumC14460 = EnumC14460.CLASS;
        } else {
            enumC14460 = EnumC14460.SOURCE;
        }
        this.f6891 = enumC14460;
    }

    @Override // l.AbstractC4497, l.InterfaceC21431
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Properties mo5805() {
        Properties propertiesMo5805 = super.mo5805();
        propertiesMo5805.put("style", this.f6891.f47431);
        propertiesMo5805.put("shape", "ellipse");
        return propertiesMo5805;
    }
}
