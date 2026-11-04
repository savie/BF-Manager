package l;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩶ܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9ZE */
/* JADX INFO: loaded from: classes.dex */
public class C21448 extends C8023 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static EnumSet f68432 = EnumSet.of(EnumC0565.NTLMSSP_NEGOTIATE_NTLM, EnumC0565.NTLMSSP_NEGOTIATE_UNICODE);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Set f68433;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C8768 f68434;

    public C21448(Set set, C8768 c8768) {
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) set);
        this.f68433 = enumSetCopyOf;
        enumSetCopyOf.addAll(f68432);
        this.f68434 = c8768;
    }
}
