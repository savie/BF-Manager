package l;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Properties;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.ۧ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G3L1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11458 extends AbstractC6239 implements InterfaceC14441 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumMap f36037;

    @Override // l.InterfaceC14441
    /* JADX INFO: renamed from: ۙ */
    public final Properties mo25147(InterfaceC14441 interfaceC14441, InterfaceC24139 interfaceC24139) {
        Properties properties = new Properties();
        properties.put(AnnotatedPrivateKey.LABEL, interfaceC24139);
        return properties;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC11458) && ((C24550) this.f21176).equals(((AbstractC11458) obj).f21176);
    }

    public final int hashCode() {
        return ((C24550) this.f21176).hashCode();
    }

    @Override // l.AbstractC6239
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC24139[] mo17870() {
        return EnumC10712.values();
    }

    @Override // l.AbstractC6239
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo17868(InterfaceC24139 interfaceC24139) {
        return (Collection) this.f36037.get(interfaceC24139);
    }

    @Override // l.InterfaceC14441
    /* JADX INFO: renamed from: ۙ */
    public Properties mo25146() {
        Properties properties = new Properties();
        properties.put(AnnotatedPrivateKey.LABEL, ("\"" + toString() + "\"").replaceAll("\n", ""));
        return properties;
    }

    @Override // l.AbstractC6239
    public final String toString() {
        return ((C24550) this.f21176).f79577.toString();
    }
}
