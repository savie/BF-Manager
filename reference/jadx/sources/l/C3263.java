package l;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۗ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3263 extends AbstractC20970 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f10604;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3263(String str, String str2) {
        byte[] bArrM34883 = C14449.m34883(str2);
        super(str, bArrM34883.length, "link:".concat(str2));
        this.f10604 = bArrM34883;
    }

    @Override // l.AbstractC20970
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream mo10654() {
        return new ByteArrayInputStream(this.f10604);
    }
}
