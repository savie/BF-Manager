package l;

import android.system.ErrnoException;
import android.system.Os;
import java.io.File;

/* JADX INFO: renamed from: l.ۗۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 19BY */
/* JADX INFO: loaded from: classes2.dex */
public final class C3186 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f10377;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final File f10378;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f10379;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f10380;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final File f10381;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f10382;

    public C3186(int i, String str, String str2, File file) {
        this.f10380 = i;
        this.f10379 = str;
        this.f10377 = str2;
        this.f10378 = file;
        this.f10381 = new File(file, "bash");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10402() {
        File file = this.f10381;
        return file.exists() && file.canExecute();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final File m10403() {
        boolean z = C20340.f65260;
        File file = this.f10378;
        if (z) {
            AbstractC22044 abstractC22044M35191 = C14584.m35191(C20340.f65258);
            if (abstractC22044M35191.mo2934()) {
                if (!abstractC22044M35191.m49860() || !C17359.equals(abstractC22044M35191.m49852(), file.getAbsolutePath())) {
                    abstractC22044M35191.mo4296();
                } else {
                    return C20340.f65258;
                }
            }
            try {
                Os.symlink(file.getAbsolutePath(), C20340.f65258.getAbsolutePath());
                return C20340.f65258;
            } catch (ErrnoException unused) {
            }
        }
        return file;
    }
}
