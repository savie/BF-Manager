package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۖۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86JZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2628 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f8426;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f8427;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8594 f8428;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f8429;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f8430;

    public C2628(C8594 c8594, long j) {
        this.f8428 = c8594;
        this.f8429 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m8769() {
        C8594 c8594 = this.f8428;
        if (!C1137.m4205(c8594.f28091)) {
            this.f8429++;
            return c8594.m23094();
        }
        if (this.f8427 == 0) {
            int iM26042 = c8594.f28089.m26042();
            int i = (iM26042 & 127) + 1;
            this.f8427 = i;
            if (i > (((long) c8594.f28091.f4230) * ((long) c8594.f28091.f4220)) - this.f8429) {
                throw new IOException("TGA packet exceeds frame bounds");
            }
            boolean z = (iM26042 & 128) != 0;
            this.f8430 = z;
            if (z) {
                this.f8426 = c8594.m23094();
            }
        }
        this.f8427--;
        this.f8429++;
        return this.f8430 ? this.f8426 : c8594.m23094();
    }
}
