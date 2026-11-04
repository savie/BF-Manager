package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܳۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GH */
/* JADX INFO: loaded from: classes4.dex */
public final class C15258 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5564 f49895;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f49896;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f49897;

    public C15258(C5564 c5564, int i, int i2) {
        this.f49895 = c5564;
        this.f49896 = i;
        this.f49897 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36610(C2161 c2161, int i) throws IOException {
        this.f49895.getClass();
        int i2 = this.f49896 - this.f49897;
        if (i >= i2) {
            c2161.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
            c2161.m7440(i - i2);
        } else {
            c2161.write(118);
            c2161.m7440(i);
        }
    }
}
