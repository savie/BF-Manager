package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩵ܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC20620 extends AbstractC2323 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Runnable f66141;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6868 f66142;

    public RunnableC20620(Runnable runnable, C6868 c6868) {
        this.f66141 = runnable;
        this.f66142 = c6868;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RunnableC20620)) {
            return false;
        }
        RunnableC20620 runnableC20620 = (RunnableC20620) obj;
        return C17359.equals(this.f66141, runnableC20620.f66141) && C17359.equals(this.f66142, runnableC20620.f66142);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f66142) + (C17359.hashCode(this.f66141) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f66141, this.f66142};
        String[] strArrSplit = "action;timing".length() == 0 ? new String[0] : "action;timing".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(RunnableC20620.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f66141.run();
    }
}
