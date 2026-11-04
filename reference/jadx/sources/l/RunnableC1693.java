package l;

import com.tencent.connect.auth.a;

/* JADX INFO: renamed from: l.֫ۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1693 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f5807;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ a f5808;

    public RunnableC1693(a aVar, String str) {
        this.f5808 = aVar;
        this.f5807 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StringBuilder sb = new StringBuilder("-->timeoutUrl: ");
        String str = this.f5807;
        sb.append(str);
        sb.append(" | mRetryUrl: ");
        a aVar = this.f5808;
        sb.append(aVar.f875);
        C21587.m49118("openSDK_LOG.AuthDialog", sb.toString());
        if (str.equals(aVar.f875)) {
            aVar.f874.mo2047(new C1121(9002, "请求页面超时，请稍后重试！", aVar.f875));
            aVar.dismiss();
        }
    }
}
