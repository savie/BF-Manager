package l;

import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: renamed from: l.۟۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7749 {
    public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
    public static final int DISPATCH_MODE_STOP = 0;
    public WindowInsets mDispachedInsets;
    public final int mDispatchMode;

    public void onEnd(C22623 c22623) {
    }

    public void onPrepare(C22623 c22623) {
    }

    public abstract C3977 onProgress(C3977 c3977, List list);

    public C0291 onStart(C22623 c22623, C0291 c0291) {
        return c0291;
    }

    public AbstractC7749(int i) {
        this.mDispatchMode = i;
    }

    public final int getDispatchMode() {
        return this.mDispatchMode;
    }
}
