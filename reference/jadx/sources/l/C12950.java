package l;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Properties;

/* JADX INFO: renamed from: l.۫۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G3L1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12950 extends AbstractC11458 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC15187 f41510;

    public C12950(C24550 c24550) {
        EnumC15187 enumC15187;
        super(c24550);
        this.f36037 = new EnumMap(EnumC10712.class);
        for (EnumC10712 enumC10712 : EnumC10712.values()) {
            this.f36037.put(enumC10712, new ArrayList());
        }
        InterfaceC15976 interfaceC15976 = c24550.f79575;
        if ((interfaceC15976 == null && c24550.f79584 == null) || (interfaceC15976 != null && interfaceC15976.mo10885() == EnumC17468.CLASS)) {
            enumC15187 = EnumC15187.CLASS;
        } else {
            enumC15187 = EnumC15187.SOURCE;
        }
        this.f41510 = enumC15187;
    }

    @Override // l.AbstractC11458, l.InterfaceC14441
    /* JADX INFO: renamed from: ۙ */
    public final Properties mo25146() {
        Properties propertiesMo25146 = super.mo25146();
        propertiesMo25146.put("style", this.f41510.f49587);
        propertiesMo25146.put("shape", "ellipse");
        return propertiesMo25146;
    }
}
