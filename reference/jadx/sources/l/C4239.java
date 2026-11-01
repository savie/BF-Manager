package l;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۘ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4239 implements InterfaceC20468 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File f15326;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final FileOutputStream f15327;

    public C4239(File file) throws IOException {
        File fileCreateTempFile = File.createTempFile("NanoHTTPD-", "", file);
        this.f15326 = fileCreateTempFile;
        this.f15327 = new FileOutputStream(fileCreateTempFile);
    }

    @Override // l.InterfaceC20468
    public final void delete() throws Exception {
        AbstractC16940.m39647(this.f15327);
        File file = this.f15326;
        if (file.delete()) {
            return;
        }
        throw new Exception("could not delete temporary file: " + file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m11893() {
        return this.f15326.getAbsolutePath();
    }
}
