package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩶۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 861N */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C20190 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45649(InterfaceC0433 interfaceC0433, int i) {
        int i2 = interfaceC0433.readInt();
        if (i2 != i) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45650(C17367 c17367, int i) {
        int iM40462 = c17367.m40462();
        if (iM40462 != i) {
            throw new IOException(String.format("Expected: 0x%04x, got: 0x%04x", Integer.valueOf(i), Integer.valueOf(iM40462)));
        }
    }
}
