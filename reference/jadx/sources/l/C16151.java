package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܺ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16151 extends AbstractC19603 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f52212;

    public C16151(long j, AbstractC20745 abstractC20745, String str) {
        super(str, j, Long.valueOf(j));
        this.f52212 = abstractC20745;
    }

    @Override // l.AbstractC19603
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo2898() throws IOException {
        AbstractC20745 abstractC20745 = this.f52212;
        try {
            return abstractC20745.mo33970();
        } catch (IOException e) {
            String strM46714 = abstractC20745.m46714();
            if (strM46714 != null) {
                return new ByteArrayInputStream(C11212.m28163(strM46714));
            }
            throw e;
        }
    }
}
