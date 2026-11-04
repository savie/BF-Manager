package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.۟ۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7579 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9771 f25042;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25043;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7629 f25044;

    public /* synthetic */ C7579(C9771 c9771, AbstractC7629 abstractC7629, String str) {
        this.f25042 = c9771;
        this.f25044 = abstractC7629;
        this.f25043 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0867 m20757(C24907 c24907, C5515 c5515) {
        Uri uriM24651 = C9352.m24651(c24907.f75794, c5515.f6097);
        C6833.m19049(uriM24651);
        InterfaceC2386 interfaceC2386M25478 = this.f25042.m25478(uriM24651);
        long j = c5515.f6103;
        long j2 = c5515.f6100;
        long size = interfaceC2386M25478.getSize();
        if (j < 0) {
            throw new C8324("HLS resource offset is invalid");
        }
        if (j2 == -1) {
            if (size < j) {
                throw new C8324("HLS resource length is unknown");
            }
            j2 = size - j;
        }
        long j3 = j2;
        if (j3 <= 0 || j > C25227.FOREVER_NS - j3 || (size >= 0 && (j > size || j3 > size - j))) {
            throw new C8324("HLS resource range is invalid");
        }
        return new C0867(uriM24651, C3603.m11683(this.f25044, interfaceC2386M25478, this.f25043), j, j3);
    }
}
