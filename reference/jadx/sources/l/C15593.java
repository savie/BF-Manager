package l;

import android.net.Uri;
import java.io.File;

/* JADX INFO: renamed from: l.ܳ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 116O */
/* JADX INFO: loaded from: classes5.dex */
public final class C15593 extends AbstractC2082 {
    public C15593(File file, Uri uri) {
        super(file, uri);
        if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
            return;
        }
        throw new IllegalArgumentException("Unsupported uri authority: " + uri.getAuthority());
    }

    @Override // l.AbstractC2082
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC2082 mo2937(File file, Uri uri) {
        return new C15593(file, uri);
    }

    @Override // l.AbstractC2082
    /* JADX INFO: renamed from: ۟᩷ */
    public final AbstractC2082 mo7165() {
        File parentFile = this.f6914.getParentFile();
        Uri uriM51957 = C23053.m51957(mo42888());
        if (parentFile == null || uriM51957 == null) {
            return null;
        }
        return new C15593(parentFile, uriM51957);
    }

    @Override // l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean mo37325() {
        return C4013.m12986().mo29537();
    }

    @Override // l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo4277() {
        return C4013.m12986().mo29537();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2942(long j) {
        if (j < 0 || !this.f6914.setLastModified(j)) {
            return false;
        }
        C5811 c5811 = this.f6916;
        if (c5811 == null) {
            return true;
        }
        c5811.f19983 = j;
        return true;
    }

    @Override // l.AbstractC2082
    /* JADX INFO: renamed from: ۡ᩷ */
    public final String mo7167() {
        return C23053.m51955(mo42888());
    }
}
