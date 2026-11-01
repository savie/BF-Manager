package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳ᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 86JZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14866 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f48568;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f48569;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2164 f48570;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f48571;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f48572;

    public C14866(C2164 c2164, long j) {
        this.f48570 = c2164;
        this.f48572 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35546() {
        C2164 c2164 = this.f48570;
        if (!C11338.m28415(c2164.f7866)) {
            this.f48572++;
            return c2164.m6729();
        }
        if (this.f48571 == 0) {
            int iM17545 = c2164.f7860.m17545();
            int i = (iM17545 & 127) + 1;
            this.f48571 = i;
            if (i > (((long) c2164.f7866.f38254) * ((long) c2164.f7866.f38251)) - this.f48572) {
                throw new IOException("TGA packet exceeds frame bounds");
            }
            boolean z = (iM17545 & 128) != 0;
            this.f48568 = z;
            if (z) {
                this.f48569 = c2164.m6729();
            }
        }
        this.f48571--;
        this.f48572++;
        return this.f48568 ? this.f48569 : c2164.m6729();
    }
}
