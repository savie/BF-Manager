package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳ֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R1TU */
/* JADX INFO: loaded from: classes3.dex */
public final class C14183 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34279(C17367 c17367, InterfaceC23355 interfaceC23355) throws IOException {
        C20190.m45649((InterfaceC0433) c17367, 67263238);
        if (c17367.available() < 13) {
            throw new IOException("Bad mapping file");
        }
        c17367.skipBytes((int) (c17367.available() - 8));
        int i = c17367.readInt();
        C20190.m45649((InterfaceC0433) c17367, 67263238);
        c17367.seek(i);
        int i2 = c17367.readInt();
        C14400 c14400 = new C14400(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            c14400.m34667(i3, c17367.m40442());
        }
        c17367.seek(4L);
        while (true) {
            int i4 = c17367.readByte() & 255;
            if (i4 == 0) {
                return;
            }
            if (i4 == 1) {
                interfaceC23355.mo26841((String) c14400.m34666(c17367.readInt()), (String) c14400.m34666(c17367.readInt()));
            } else if (i4 == 2) {
                interfaceC23355.mo26843((String) c14400.m34666(c17367.readInt()), (String) c14400.m34666(c17367.readInt()), (String) c14400.m34666(c17367.readInt()));
            } else if (i4 == 3) {
                interfaceC23355.mo26842((String) c14400.m34666(c17367.readInt()), (String) c14400.m34666(c17367.readInt()), (String) c14400.m34666(c17367.readInt()));
            }
        }
    }
}
