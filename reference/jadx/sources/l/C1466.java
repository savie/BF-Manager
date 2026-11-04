package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1TU */
/* JADX INFO: loaded from: classes2.dex */
public final class C1466 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5239(C20348 c20348, InterfaceC10414 interfaceC10414) throws IOException {
        C17364.m40795((InterfaceC15872) c20348, 67263238);
        if (c20348.available() < 13) {
            throw new IOException("Bad mapping file");
        }
        c20348.skipBytes((int) (c20348.available() - 8));
        int i = c20348.readInt();
        C17364.m40795((InterfaceC15872) c20348, 67263238);
        c20348.seek(i);
        int i2 = c20348.readInt();
        C16330 c16330 = new C16330(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            c16330.m38763(i3, c20348.m46756());
        }
        c20348.seek(4L);
        while (true) {
            int i4 = c20348.readByte() & 255;
            if (i4 == 0) {
                return;
            }
            if (i4 == 1) {
                interfaceC10414.mo26724((String) c16330.m38762(c20348.readInt()), (String) c16330.m38762(c20348.readInt()));
            } else if (i4 == 2) {
                interfaceC10414.mo26726((String) c16330.m38762(c20348.readInt()), (String) c16330.m38762(c20348.readInt()), (String) c16330.m38762(c20348.readInt()));
            } else if (i4 == 3) {
                interfaceC10414.mo26725((String) c16330.m38762(c20348.readInt()), (String) c16330.m38762(c20348.readInt()), (String) c16330.m38762(c20348.readInt()));
            }
        }
    }
}
