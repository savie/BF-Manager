package l;

import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* JADX INFO: renamed from: l.۟۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6JY */
/* JADX INFO: loaded from: classes4.dex */
public final class C7918 extends AbstractC21976 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JsReplyProxyBoundaryInterface f26295;

    @Override // l.AbstractC21976
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo21458(String str) {
        if (C19580.f63136.mo27117()) {
            this.f26295.postMessage(str);
            return;
        }
        throw C19580.m45180();
    }

    public C7918(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f26295 = jsReplyProxyBoundaryInterface;
    }
}
