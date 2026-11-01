package l;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩶᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20384 extends AbstractC19603 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f66059;

    /* JADX WARN: Illegal instructions before constructor call */
    public C20384(String str, String str2) {
        byte[] bArrM28163 = C11212.m28163(str2);
        super(str, bArrM28163.length, "link:".concat(str2));
        this.f66059 = bArrM28163;
    }

    @Override // l.AbstractC19603
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo2898() {
        return new ByteArrayInputStream(this.f66059);
    }
}
