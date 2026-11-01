package l;

import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ۘۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C3844 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC13018 f14372 = EnumC13018.PUBLIC;

    static {
        String.format("%d.%d.%d%s", 4, 27, 2, "");
        Logger.getLogger(C3844.class.getName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11171(EnumC13018 enumC13018, String str) {
        String str2 = System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        if (str2 == null || !str2.equals("true")) {
            String str3 = System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
            if (str3 == null || !str3.equals("true")) {
                String.format("%d.%d.%d%s", 4, 27, 2, "");
                EnumC13018 enumC13019 = f14372;
                if (enumC13018 == enumC13019) {
                    return;
                }
                throw new C1022("Detected mismatched Protobuf Gencode/Runtime domains when loading " + str + ": gencode " + enumC13018 + ", runtime " + enumC13019 + ". Cross-domain usage of Protobuf is not supported.");
            }
        }
    }
}
