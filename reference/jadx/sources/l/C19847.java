package l;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: l.ᩴ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BK7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19847 implements FilenameFilter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f63787;

    public C19847(String str) {
        this.f63787 = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f63787);
    }
}
