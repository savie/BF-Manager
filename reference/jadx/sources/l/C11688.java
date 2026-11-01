package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۨۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 94EC */
/* JADX INFO: loaded from: classes4.dex */
public final class C11688 implements InterfaceC2514 {
    @Override // l.InterfaceC2514
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC10008 mo7707(File file) {
        int i = C0834.f3466;
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return C0834.m3435(new FileInputStream(file));
    }

    @Override // l.InterfaceC2514
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC8597 mo7710(File file) {
        try {
            return C0834.m3438(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return C0834.m3438(file);
        }
    }

    @Override // l.InterfaceC2514
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC8597 mo7708(File file) {
        try {
            return C0834.m3433(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return C0834.m3433(file);
        }
    }

    @Override // l.InterfaceC2514
    /* JADX INFO: renamed from: ֨ */
    public final void mo7703(File file) throws IOException {
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + file);
    }

    @Override // l.InterfaceC2514
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo7709(File file) {
        return file.exists();
    }

    @Override // l.InterfaceC2514
    /* JADX INFO: renamed from: ۖ */
    public final long mo7704(File file) {
        return file.length();
    }

    @Override // l.InterfaceC2514
    /* JADX INFO: renamed from: ۙ */
    public final void mo7706(File file, File file2) throws IOException {
        mo7703(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("failed to rename " + file + " to " + file2);
    }

    @Override // l.InterfaceC2514
    /* JADX INFO: renamed from: ۙ */
    public final void mo7705(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                mo7705(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete " + file2);
            }
        }
    }
}
