package l;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Properties;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.ۙ۟۟, reason: contains not printable characters */
/* JADX INFO: compiled from: G3L1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4497 extends AbstractC6614 implements InterfaceC21431 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumMap f16002;

    @Override // l.InterfaceC21431
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Properties mo12538(InterfaceC21431 interfaceC21431, InterfaceC22843 interfaceC22843) {
        Properties properties = new Properties();
        properties.put(AnnotatedPrivateKey.LABEL, interfaceC22843);
        return properties;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC4497) && ((C22492) this.f22269).equals(((AbstractC4497) obj).f22269);
    }

    public final int hashCode() {
        return ((C22492) this.f22269).hashCode();
    }

    @Override // l.AbstractC6614
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC22843[] mo3681() {
        return EnumC5992.values();
    }

    @Override // l.AbstractC6614
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo3679(InterfaceC22843 interfaceC22843) {
        return (Collection) this.f16002.get(interfaceC22843);
    }

    /* JADX INFO: renamed from: ۙ */
    public Properties mo5805() {
        Properties properties = new Properties();
        properties.put(AnnotatedPrivateKey.LABEL, ("\"" + toString() + "\"").replaceAll("\n", ""));
        return properties;
    }

    @Override // l.AbstractC6614
    public final String toString() {
        return ((C22492) this.f22269).f73419.toString();
    }
}
