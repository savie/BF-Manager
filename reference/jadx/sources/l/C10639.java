package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۤۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U8SG */
/* JADX INFO: loaded from: classes3.dex */
public final class C10639 extends IOException {
    public C10639(int i) {
        this(-9223372036854775807L, i, -9223372036854775807L);
    }

    public C10639(long j, int i, long j2) {
        String str;
        StringBuilder sb = new StringBuilder("Illegal clipping: ");
        if (i != 0) {
            if (i == 1) {
                str = "not seekable to start";
            } else if (i != 2) {
                str = "unknown";
            } else {
                C20782.m47568((j == -9223372036854775807L || j2 == -9223372036854775807L) ? false : true);
                str = "start exceeds end. Start time: " + j + ", End time: " + j2;
            }
        } else {
            str = "invalid period count";
        }
        sb.append(str);
        super(sb.toString());
    }
}
