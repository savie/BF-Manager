package l;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.֨ۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: E9ZE */
/* JADX INFO: loaded from: classes3.dex */
public class C1042 extends C6687 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static EnumSet f4843 = EnumSet.of(EnumC3864.NTLMSSP_NEGOTIATE_NTLM, EnumC3864.NTLMSSP_NEGOTIATE_UNICODE);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Set f4844;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C8099 f4845;

    public C1042(Set set, C8099 c8099) {
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) set);
        this.f4844 = enumSetCopyOf;
        enumSetCopyOf.addAll(f4843);
        this.f4845 = c8099;
    }
}
