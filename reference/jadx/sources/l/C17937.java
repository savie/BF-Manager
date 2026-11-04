package l;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܽ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes5.dex */
public final class C17937 implements InterfaceC19429 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File f58762;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final FileOutputStream f58763;

    public C17937(File file) throws IOException {
        File fileCreateTempFile = File.createTempFile("NanoHTTPD-", "", file);
        this.f58762 = fileCreateTempFile;
        this.f58763 = new FileOutputStream(fileCreateTempFile);
    }

    @Override // l.InterfaceC19429
    public final void delete() throws Exception {
        AbstractC1530.m5432(this.f58763);
        File file = this.f58762;
        if (file.delete()) {
            return;
        }
        throw new Exception("could not delete temporary file: " + file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m41874() {
        return this.f58762.getAbsolutePath();
    }
}
