package l;

import android.content.DialogInterface;
import com.alipay.sdk.app.PayTask;
import com.alipay.sdk.m.y.o;

/* JADX INFO: renamed from: l.ۡ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9720 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f31358;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31359;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f31360;

    public C9720(AbstractActivityC17204 abstractActivityC17204, int i) {
        this.f31360 = abstractActivityC17204;
        this.f31359 = i;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8190(this.f31360);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C4866 {
        C17930 c17930 = C7484.f24760;
        String[] strArrM20533 = C7484.m20533(this.f31359, 0);
        C3076.f9994 = new RunnableC1518(0, strArrM20533);
        this.f31358 = (String) new PayTask(this.f31360).payV2(strArrM20533[0], true).get(o.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r0.equals("8000") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.equals("6004") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        l.C22673.m51154((java.lang.CharSequence) "支付结果未知");
        r0 = l.C3076.f9994;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        r0.run();
        r0 = l.C11471.f36082;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1134() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f31358
            if (r0 == 0) goto L81
            int r1 = r0.hashCode()
            switch(r1) {
                case 1596796: goto L72;
                case 1626587: goto L63;
                case 1656379: goto L54;
                case 1656380: goto L45;
                case 1656382: goto L2d;
                case 1715960: goto L24;
                case 1745751: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto L81
        Ld:
            java.lang.String r1 = "9000"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L81
            java.lang.String r0 = "支付成功"
            l.C22673.m51154(r0)
            java.lang.Runnable r0 = l.C3076.f9994
            if (r0 == 0) goto L44
            r0.run()
            l.ۧ۟᩵ r0 = l.C11471.f36082
            return
        L24:
            java.lang.String r1 = "8000"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L81
        L2d:
            java.lang.String r1 = "6004"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L81
        L36:
            java.lang.String r0 = "支付结果未知"
            l.C22673.m51154(r0)
            java.lang.Runnable r0 = l.C3076.f9994
            if (r0 == 0) goto L44
            r0.run()
            l.ۧ۟᩵ r0 = l.C11471.f36082
        L44:
            return
        L45:
            java.lang.String r1 = "6002"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4e
            goto L81
        L4e:
            java.lang.String r0 = "网络连接出错"
            l.C22673.m51154(r0)
            return
        L54:
            java.lang.String r1 = "6001"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5d
            goto L81
        L5d:
            java.lang.String r0 = "支付被取消"
            l.C22673.m51154(r0)
            return
        L63:
            java.lang.String r1 = "5000"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6c
            goto L81
        L6c:
            java.lang.String r0 = "重复请求"
            l.C22673.m51154(r0)
            return
        L72:
            java.lang.String r1 = "4000"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b
            goto L81
        L7b:
            java.lang.String r0 = "支付失败"
            l.C22673.m51154(r0)
            return
        L81:
            java.lang.String r0 = "未知错误"
            l.C22673.m51154(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9720.mo1134():void");
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f31360.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
