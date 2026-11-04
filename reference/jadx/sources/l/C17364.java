package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 861N */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17364 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40795(InterfaceC15872 interfaceC15872, int i) {
        int i2 = interfaceC15872.readInt();
        if (i2 != i) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40796(C20348 c20348, int i) {
        int iM46749 = c20348.m46749();
        if (iM46749 != i) {
            throw new IOException(String.format("Expected: 0x%04x, got: 0x%04x", Integer.valueOf(i), Integer.valueOf(iM46749)));
        }
    }
}
