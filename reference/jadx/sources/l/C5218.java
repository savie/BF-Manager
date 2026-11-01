package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۚ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes2.dex */
public final class C5218 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18069;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16508 f18070;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f18071;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3806 f18072;

    public C5218(C16508 c16508, C3806 c3806, String str, int i) {
        this.f18070 = c16508;
        this.f18072 = c3806;
        this.f18071 = str;
        this.f18069 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m14399(long j) throws IOException {
        C16508 c16508 = this.f18070;
        c16508.m38799();
        c16508.m38817();
        try {
            this.f18072.f14138 = c16508.m38811(this.f18071, j == 0);
            return C16508.m38786(this.f18069, c16508.f53030.f36944.m4282());
        } catch (C10360 e) {
            throw new IOException(e.getMessage(), e);
        }
    }
}
