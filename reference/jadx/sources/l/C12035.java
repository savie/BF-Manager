package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۨ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94EC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12035 implements InterfaceC6070 {
    @Override // l.InterfaceC6070
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC13810 mo17581(File file) {
        int i = C14556.f45862;
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return C14556.m35107(new FileInputStream(file));
    }

    @Override // l.InterfaceC6070
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC7099 mo17580(File file) {
        try {
            return C14556.m35109(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return C14556.m35109(file);
        }
    }

    @Override // l.InterfaceC6070
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC7099 mo17578(File file) {
        try {
            return C14556.m35104(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return C14556.m35104(file);
        }
    }

    @Override // l.InterfaceC6070
    /* JADX INFO: renamed from: ۫ */
    public final void mo17579(File file) throws IOException {
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + file);
    }

    @Override // l.InterfaceC6070
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo17582(File file) {
        return file.exists();
    }

    @Override // l.InterfaceC6070
    /* JADX INFO: renamed from: ᩸ */
    public final long mo17583(File file) {
        return file.length();
    }

    @Override // l.InterfaceC6070
    /* JADX INFO: renamed from: ۙ */
    public final void mo17577(File file, File file2) throws IOException {
        mo17579(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("failed to rename " + file + " to " + file2);
    }

    @Override // l.InterfaceC6070
    /* JADX INFO: renamed from: ۙ */
    public final void mo17576(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                mo17576(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete " + file2);
            }
        }
    }
}
