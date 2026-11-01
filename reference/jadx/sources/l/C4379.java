package l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۙۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7PV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4379 {
    static {
        Pattern pattern = InterfaceC13553.f44725;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11521 m12231(InterfaceC20608 interfaceC20608) {
        if (!interfaceC20608.mo37430()) {
            return C11521.empty();
        }
        Matcher matcher = InterfaceC13553.f44725.matcher(interfaceC20608.mo37426());
        if (!matcher.matches()) {
            return C11521.empty();
        }
        return C11521.of("/* " + matcher.group(1) + "= */");
    }
}
