package l;

import android.system.ErrnoException;
import android.system.Os;
import java.io.File;

/* JADX INFO: renamed from: l.ۗ᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19BY */
/* JADX INFO: loaded from: classes2.dex */
public final class C3478 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f12766;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f12767;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f12768;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final File f12769;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final File f12770;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f12771;

    public C3478(int i, String str, String str2, File file) {
        this.f12768 = i;
        this.f12771 = str;
        this.f12767 = str2;
        this.f12769 = file;
        this.f12770 = new File(file, "bash");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10207() {
        File file = this.f12770;
        return file.exists() && file.canExecute();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final File m10208() {
        boolean z = C4744.f16694;
        File file = this.f12769;
        if (z) {
            AbstractC20745 abstractC20745M15311 = C5553.m15311(C4744.f16692);
            if (abstractC20745M15311.mo33975()) {
                if (!abstractC20745M15311.m46723() || !C13638.equals(abstractC20745M15311.m46714(), file.getAbsolutePath())) {
                    abstractC20745M15311.mo24647();
                } else {
                    return C4744.f16692;
                }
            }
            try {
                Os.symlink(file.getAbsolutePath(), C4744.f16692.getAbsolutePath());
                return C4744.f16692;
            } catch (ErrnoException unused) {
            }
        }
        return file;
    }
}
