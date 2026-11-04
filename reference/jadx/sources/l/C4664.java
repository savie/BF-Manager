package l;

import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebStorageBoundaryInterface;

/* JADX INFO: renamed from: l.ۙۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56JH */
/* JADX INFO: loaded from: classes3.dex */
public final class C4664 implements WebStorageBoundaryInterface {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WebStorageBoundaryInterface f16472;

    public C4664(WebStorageBoundaryInterface webStorageBoundaryInterface) {
        this.f16472 = webStorageBoundaryInterface;
    }

    @Override // org.chromium.support_lib_boundary.WebStorageBoundaryInterface
    public final void deleteBrowsingData(Executor executor, Runnable runnable) {
        this.f16472.deleteBrowsingData(executor, runnable);
    }

    @Override // org.chromium.support_lib_boundary.WebStorageBoundaryInterface
    public final String deleteBrowsingDataForSite(String str, Executor executor, Runnable runnable) {
        return this.f16472.deleteBrowsingDataForSite(str, executor, runnable);
    }
}
