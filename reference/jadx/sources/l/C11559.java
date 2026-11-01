package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.ۨ۟۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11559 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11601 f38856;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f38857;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC9677 f38858;

    public /* synthetic */ C11559(C11601 c11601, AbstractC9677 abstractC9677, String str) {
        this.f38856 = c11601;
        this.f38858 = abstractC9677;
        this.f38857 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22142 m28861(C16325 c16325, C15620 c15620) {
        Uri uriM50741 = C22923.m50741(c16325.f36441, c15620.f63674);
        C6619.m17963(uriM50741);
        InterfaceC2557 interfaceC2557M28931 = this.f38856.m28931(uriM50741);
        long j = c15620.f63682;
        long j2 = c15620.f63679;
        long size = interfaceC2557M28931.getSize();
        if (j < 0) {
            throw new C3796("HLS resource offset is invalid");
        }
        if (j2 == -1) {
            if (size < j) {
                throw new C3796("HLS resource length is unknown");
            }
            j2 = size - j;
        }
        long j3 = j2;
        if (j3 <= 0 || j > C17492.FOREVER_NS - j3 || (size >= 0 && (j > size || j3 > size - j))) {
            throw new C3796("HLS resource range is invalid");
        }
        return new C22142(uriM50741, C4085.m11620(this.f38858, interfaceC2557M28931, this.f38857), j, j3);
    }
}
