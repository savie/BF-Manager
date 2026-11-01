package l;

import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17026 {
    public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
    public static final int DISPATCH_MODE_STOP = 0;
    public WindowInsets mDispachedInsets;
    public final int mDispatchMode;

    public void onEnd(C5259 c5259) {
    }

    public void onPrepare(C5259 c5259) {
    }

    public abstract C15844 onProgress(C15844 c15844, List list);

    public C12088 onStart(C5259 c5259, C12088 c12088) {
        return c12088;
    }

    public AbstractC17026(int i) {
        this.mDispatchMode = i;
    }

    public final int getDispatchMode() {
        return this.mDispatchMode;
    }
}
