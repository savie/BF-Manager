package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩷᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GH */
/* JADX INFO: loaded from: classes4.dex */
public final class C21129 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20424 f68801;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f68802;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f68803;

    public C21129(C20424 c20424, int i, int i2) {
        this.f68801 = c20424;
        this.f68802 = i;
        this.f68803 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47551(C12283 c12283, int i) throws IOException {
        this.f68801.getClass();
        int i2 = this.f68802 - this.f68803;
        if (i >= i2) {
            c12283.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
            c12283.m30529(i - i2);
        } else {
            c12283.write(118);
            c12283.m30529(i);
        }
    }
}
