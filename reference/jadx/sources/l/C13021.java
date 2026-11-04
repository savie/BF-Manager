package l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.۫ۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85AW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13021 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32450(Writer writer, InterfaceC10122 interfaceC10122, C5564 c5564) {
        try {
            C22981 c22981 = new C22981(c5564, interfaceC10122);
            if (writer instanceof C2161) {
                c22981.m51866((C2161) writer);
            } else {
                c22981.m51866(new C2161(writer));
            }
        } catch (Throwable th) {
            throw new IOException(C25272.m56409("An error occurred with the class: ", C1402.m5124(1, 1, interfaceC10122.getType())), th);
        }
    }
}
