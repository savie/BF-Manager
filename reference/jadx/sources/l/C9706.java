package l;

import android.view.View;
import com.alipay.sdk.app.H5PayActivity;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.ۡ᩺ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q151 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9706 implements InterfaceC14181, InterfaceC11838, InterfaceC17544, InterfaceC21620, InterfaceC4501, InterfaceC22491 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31341;

    public /* synthetic */ C9706(Object obj) {
        this.f31341 = obj;
    }

    @Override // l.InterfaceC22491
    public C3977 onApplyWindowInsets(View view, C3977 c3977) {
        return H5PayActivity.a((View) this.f31341, view, c3977);
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public void mo1209(int i) {
        ((C8744) this.f31341).m45194(i);
    }

    @Override // l.InterfaceC11838
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo25302(long j, long j2) {
        C17059.m40189((C17059) this.f31341, j, j2);
    }

    @Override // l.InterfaceC21620
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo25303(InterfaceC14906 interfaceC14906) {
        ((ConcurrentLinkedQueue) this.f31341).add(interfaceC14906);
    }

    @Override // l.InterfaceC14181
    /* JADX INFO: renamed from: ۙ */
    public int mo9795(int i, int i2) {
        return (i < 28 || i > 31) ? i2 : ((InterfaceC14181) this.f31341).mo9795(i, i2);
    }

    @Override // l.InterfaceC4501
    /* JADX INFO: renamed from: ۙ */
    public int mo12193(String str, boolean z) {
        return ((Set) this.f31341).contains(str) ? 2 : 1;
    }
}
