package l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: l.֫᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AX2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2186 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final List f7191;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final List m7492() {
        return f7191;
    }

    static {
        try {
            Iterator it = Arrays.asList(new C21342()).iterator();
            C15243.m36590(it, "<this>");
            f7191 = C16539.m39176(new C22507(new C3115(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
