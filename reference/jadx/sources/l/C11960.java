package l;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۧ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes4.dex */
public final class C11960 extends AbstractC13057 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f38507;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f38508;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f38509;

    public C11960(AbstractC22044 abstractC22044, String str, String str2) {
        this.f38509 = str;
        this.f38508 = str2;
        this.f38507 = abstractC22044;
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۫ */
    public final String mo17426() {
        return this.f38509;
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۤ */
    public final String mo17425() {
        return this.f38508;
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ᩹ */
    public final InputStream mo17428() {
        return this.f38507.mo4290();
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۗ */
    public final C15294 mo17423() throws IOException {
        AbstractC22044 abstractC22044 = this.f38507;
        if (!abstractC22044.mo4304()) {
            throw new IOException("Image source is no longer a regular file");
        }
        return new C15294(this.f38509, Math.max(-1L, abstractC22044.mo4285()), abstractC22044.mo4286());
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ᩷ */
    public final File mo23983() {
        AbstractC22044 abstractC22044 = this.f38507;
        if (!abstractC22044.mo4295()) {
            return null;
        }
        File file = new File(abstractC22044.mo4294());
        if (file.isFile() && file.canRead()) {
            return file;
        }
        return null;
    }
}
