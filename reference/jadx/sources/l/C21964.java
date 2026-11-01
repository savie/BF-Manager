package l;

import android.content.DialogInterface;
import com.alipay.sdk.app.PayTask;
import com.alipay.sdk.m.y.o;

/* JADX INFO: renamed from: l.᩹֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21964 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f71263;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f71264;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f71265;

    public C21964(AbstractActivityC12483 abstractActivityC12483, int i) {
        this.f71265 = abstractActivityC12483;
        this.f71263 = i;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10245(this.f71265);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C4987 {
        C9186 c9186 = C12792.f42615;
        String[] strArrM31774 = C12792.m31774(this.f71263, 0);
        C20364.f65940 = new RunnableC8017(2, strArrM31774);
        this.f71264 = (String) new PayTask(this.f71265).payV2(strArrM31774[0], true).get(o.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r0.equals("8000") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.equals("6004") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        l.C15829.m37613((java.lang.CharSequence) "支付结果未知");
        r0 = l.C20364.f65940;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        r0.run();
        r0 = l.C7321.f24318;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1157() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f71264
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
            l.C15829.m37613(r0)
            java.lang.Runnable r0 = l.C20364.f65940
            if (r0 == 0) goto L44
            r0.run()
            l.۟۟۠ r0 = l.C7321.f24318
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
            l.C15829.m37613(r0)
            java.lang.Runnable r0 = l.C20364.f65940
            if (r0 == 0) goto L44
            r0.run()
            l.۟۟۠ r0 = l.C7321.f24318
        L44:
            return
        L45:
            java.lang.String r1 = "6002"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4e
            goto L81
        L4e:
            java.lang.String r0 = "网络连接出错"
            l.C15829.m37613(r0)
            return
        L54:
            java.lang.String r1 = "6001"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5d
            goto L81
        L5d:
            java.lang.String r0 = "支付被取消"
            l.C15829.m37613(r0)
            return
        L63:
            java.lang.String r1 = "5000"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6c
            goto L81
        L6c:
            java.lang.String r0 = "重复请求"
            l.C15829.m37613(r0)
            return
        L72:
            java.lang.String r1 = "4000"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b
            goto L81
        L7b:
            java.lang.String r0 = "支付失败"
            l.C15829.m37613(r0)
            return
        L81:
            java.lang.String r0 = "未知错误"
            l.C15829.m37613(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21964.mo1157():void");
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f71265.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
