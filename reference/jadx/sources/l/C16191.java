package l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ܺ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 85AW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16191 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38283(Writer writer, InterfaceC22762 interfaceC22762, C20424 c20424) {
        try {
            C10153 c10153 = new C10153(c20424, interfaceC22762);
            if (writer instanceof C12283) {
                c10153.m25796((C12283) writer);
            } else {
                c10153.m25796(new C12283(writer));
            }
        } catch (Throwable th) {
            throw new IOException(C0252.m1693("An error occurred with the class: ", C20630.m46498(1, 1, interfaceC22762.getType())), th);
        }
    }
}
