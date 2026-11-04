package l;

import java.io.IOError;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۘۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z40Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C3881 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m12509(InterfaceC19637 interfaceC19637) {
        AbstractC8036 abstractC8036 = (AbstractC8036) interfaceC19637;
        abstractC8036.getClass();
        return C11239.m28342(abstractC8036);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m12510(InterfaceC17573 interfaceC17573, C7704 c7704) {
        try {
            return c7704.m20985().mo43139().mo7621(false).subSequence(m12509((InterfaceC19637) interfaceC17573), C11239.m28320((AbstractC8036) interfaceC17573, ((C19113) c7704.m20985()).f61860)).toString();
        } catch (IOException e) {
            throw new IOError(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC3058 m12512(InterfaceC20557 interfaceC20557) {
        Cloneable cloneableMo47123 = interfaceC20557.mo47123();
        if (cloneableMo47123 instanceof InterfaceC3403) {
            return ((InterfaceC3403) cloneableMo47123).mo11141();
        }
        return ((InterfaceC19811) cloneableMo47123).getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m12511(InterfaceC22049 interfaceC22049) {
        EnumC21461 enumC21461Mo2285 = ((AbstractC8036) interfaceC22049).mo2285();
        if (enumC21461Mo2285 == EnumC21461.f68452) {
            return "=";
        }
        boolean z = interfaceC22049 instanceof InterfaceC0661;
        if (z) {
            enumC21461Mo2285 = enumC21461Mo2285.m48823();
        }
        new C9526(null, true);
        String strM24923 = C9526.m24923(enumC21461Mo2285);
        return z ? strM24923.concat("=") : strM24923;
    }
}
