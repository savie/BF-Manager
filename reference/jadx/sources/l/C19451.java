package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴ֡۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes5.dex */
public final class C19451 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0060 f62822;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f62823;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1552 f62824;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62825;

    public C19451(C0060 c0060, C1552 c1552, String str, int i) {
        this.f62822 = c0060;
        this.f62824 = c1552;
        this.f62823 = str;
        this.f62825 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44938(long j) throws IOException {
        C0060 c0060 = this.f62822;
        c0060.m992();
        c0060.m1012();
        try {
            this.f62824.f5357 = c0060.m1002(this.f62823, j == 0);
            return C0060.m979(this.f62825, c0060.f943.f2861.m48066());
        } catch (C22172 e) {
            throw new IOException(e.getMessage(), e);
        }
    }
}
