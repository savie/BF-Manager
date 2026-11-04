package l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۖܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7PV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2804 {
    static {
        Pattern pattern = InterfaceC8770.f28517;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15867 m9273(InterfaceC20660 interfaceC20660) {
        if (!interfaceC20660.mo18728()) {
            return C15867.empty();
        }
        Matcher matcher = InterfaceC8770.f28517.matcher(interfaceC20660.mo18733());
        if (!matcher.matches()) {
            return C15867.empty();
        }
        return C15867.of("/* " + matcher.group(1) + "= */");
    }
}
