package l;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.֫֫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes2.dex */
public final class C1514 extends AbstractC1886 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f6210;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f6211;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f6212;

    public C1514(AbstractC20745 abstractC20745, String str, String str2) {
        this.f6212 = str;
        this.f6211 = str2;
        this.f6210 = abstractC20745;
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String mo5281() {
        return this.f6212;
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String mo5282() {
        return this.f6211;
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InputStream mo5285() {
        return this.f6210.mo33970();
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C14588 mo5283() throws IOException {
        AbstractC20745 abstractC20745 = this.f6210;
        if (!abstractC20745.mo33971()) {
            throw new IOException("Image source is no longer a regular file");
        }
        return new C14588(this.f6212, Math.max(-1L, abstractC20745.mo33964()), abstractC20745.mo33991());
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final File mo5284() {
        AbstractC20745 abstractC20745 = this.f6210;
        if (!abstractC20745.mo36912()) {
            return null;
        }
        File file = new File(abstractC20745.mo33986());
        if (file.isFile() && file.canRead()) {
            return file;
        }
        return null;
    }
}
