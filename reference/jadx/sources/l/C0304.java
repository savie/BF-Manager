package l;

import java.util.logging.Logger;

/* JADX INFO: renamed from: l.֡۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C0304 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC18203 f1634 = EnumC18203.PUBLIC;

    static {
        String.format("%d.%d.%d%s", 4, 27, 2, "");
        Logger.getLogger(C0304.class.getName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1888(EnumC18203 enumC18203, String str) {
        String str2 = System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        if (str2 == null || !str2.equals("true")) {
            String str3 = System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
            if (str3 == null || !str3.equals("true")) {
                String.format("%d.%d.%d%s", 4, 27, 2, "");
                EnumC18203 enumC18204 = f1634;
                if (enumC18203 == enumC18204) {
                    return;
                }
                throw new C21187("Detected mismatched Protobuf Gencode/Runtime domains when loading " + str + ": gencode " + enumC18203 + ", runtime " + enumC18204 + ". Cross-domain usage of Protobuf is not supported.");
            }
        }
    }
}
