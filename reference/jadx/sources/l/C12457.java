package l;

import java.io.IOError;
import java.io.IOException;

/* JADX INFO: renamed from: l.۫ܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Z40Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C12457 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m30932(InterfaceC17428 interfaceC17428) {
        AbstractC8774 abstractC8774 = (AbstractC8774) interfaceC17428;
        abstractC8774.getClass();
        return C3128.m9453(abstractC8774);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30934(InterfaceC4727 interfaceC4727, C18321 c18321) {
        try {
            return c18321.m42560().mo25897().mo10164(false).subSequence(m30932((InterfaceC17428) interfaceC4727), C3128.m9435((AbstractC8774) interfaceC4727, ((C10164) c18321.m42560()).f34724)).toString();
        } catch (IOException e) {
            throw new IOError(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC22510 m30935(InterfaceC5433 interfaceC5433) {
        Cloneable cloneableMo15014 = interfaceC5433.mo15014();
        if (cloneableMo15014 instanceof InterfaceC2610) {
            return ((InterfaceC2610) cloneableMo15014).mo8084();
        }
        return ((InterfaceC17657) cloneableMo15014).getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30933(InterfaceC0723 interfaceC0723) {
        EnumC18651 enumC18651Mo1803 = ((AbstractC8774) interfaceC0723).mo1803();
        if (enumC18651Mo1803 == EnumC18651.f60510) {
            return "=";
        }
        boolean z = interfaceC0723 instanceof InterfaceC21891;
        if (z) {
            enumC18651Mo1803 = enumC18651Mo1803.m43134();
        }
        new C15830(null, true);
        String strM37623 = C15830.m37623(enumC18651Mo1803);
        return z ? strM37623.concat("=") : strM37623;
    }
}
