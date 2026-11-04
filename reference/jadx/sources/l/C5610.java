package l;

import android.webkit.ValueCallback;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6IY */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5610 implements ValueCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6356 f19441;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16796 f19442;

    public /* synthetic */ C5610(C6356 c6356, C16796 c16796) {
        this.f19441 = c6356;
        this.f19442 = c16796;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        C6356.m18073(this.f19441, this.f19442, (Map) obj);
    }
}
