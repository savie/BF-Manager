package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.֡ۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 16SF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0156 implements InterfaceC2017, InterfaceC16497 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1171;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1172;

    public /* synthetic */ C0156(int i, Object obj) {
        this.f1171 = i;
        this.f1172 = obj;
    }

    @Override // l.InterfaceC16497
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo1354(boolean z) {
        ((C11713) this.f1172).m29406(z);
    }

    @Override // l.InterfaceC2017
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo1355(Object obj, Throwable th) {
        switch (this.f1171) {
            case 0:
                C0902.m3642((C0902) this.f1172, th);
                break;
            default:
                ResultCallback resultCallback = (ResultCallback) this.f1172;
                if (resultCallback != null) {
                    if (th != null) {
                        resultCallback.onFailure(C22327.m50390(th));
                    } else {
                        resultCallback.onSuccess();
                    }
                    break;
                }
                break;
        }
    }
}
