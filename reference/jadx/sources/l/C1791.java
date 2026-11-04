package l;

import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.֫۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5OE */
/* JADX INFO: loaded from: classes2.dex */
public final class C1791 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] f6118;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[][] f6119;

    public C1791(C4028 c4028) {
        c4028.m12995();
        c4028.m12995();
        c4028.m12995();
        int iM12995 = c4028.m12995();
        this.f6118 = new String[iM12995];
        this.f6119 = new byte[iM12995][];
        for (int i = 0; i < iM12995; i++) {
            int iM12996 = c4028.m12995();
            try {
                this.f6118[i] = new String(c4028.m13001(iM12996), 0, iM12996 - 1, "US-ASCII");
                this.f6119[i] = c4028.m13001(20);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
