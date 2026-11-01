package l;

import com.tencent.connect.auth.a;

/* JADX INFO: renamed from: l.ܳ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC14385 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f47134;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ a f47135;

    public RunnableC14385(a aVar, String str) {
        this.f47135 = aVar;
        this.f47134 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StringBuilder sb = new StringBuilder("-->timeoutUrl: ");
        String str = this.f47134;
        sb.append(str);
        sb.append(" | mRetryUrl: ");
        a aVar = this.f47135;
        sb.append(aVar.f879);
        C23099.m51107("openSDK_LOG.AuthDialog", sb.toString());
        if (str.equals(aVar.f879)) {
            aVar.f884.mo16214(new C8407(9002, "请求页面超时，请稍后重试！", aVar.f879));
            aVar.dismiss();
        }
    }
}
