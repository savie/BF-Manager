package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.᩷۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20742 implements InterfaceC20892, InterfaceC7486 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f67489;

    public /* synthetic */ C20742(Object obj) {
        this.f67489 = obj;
    }

    @Override // l.InterfaceC20892
    /* JADX INFO: renamed from: ۙ */
    public Object mo1795(Object obj, Throwable th) {
        return C14393.m34625((Throwable) this.f67489, th);
    }

    @Override // l.InterfaceC7486
    /* JADX INFO: renamed from: ܰ */
    public void mo2142(Object obj, Throwable th) {
        ResultCallback resultCallback = (ResultCallback) this.f67489;
        if (resultCallback == null) {
            return;
        }
        if (th == null) {
            resultCallback.onSuccess();
        } else {
            resultCallback.onFailure(C2641.m8151(th));
        }
    }
}
