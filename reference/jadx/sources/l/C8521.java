package l;

import android.content.Intent;
import com.alipay.sdk.m.t.e;

/* JADX INFO: renamed from: l.ۡ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O945 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8521 implements InterfaceC8395, InterfaceC13320 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29505;

    public /* synthetic */ C8521(Object obj) {
        this.f29505 = obj;
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۨ */
    public /* synthetic */ boolean mo1180() {
        return false;
    }

    @Override // l.InterfaceC8395
    /* JADX INFO: renamed from: ۙ */
    public void mo1796(Intent intent, int i) {
        ActivityC9932 activityC9932 = (ActivityC9932) this.f29505;
        int i2 = ActivityC9932.f33913;
        if (i != -1) {
            activityC9932.finish();
            return;
        }
        Intent intent2 = new Intent(activityC9932, (Class<?>) ServiceC12465.class);
        intent2.putExtra(e.m, intent);
        C10405.m26303(activityC9932, intent2);
        C16737.m39274(new RunnableC11767(3, activityC9932), 100L);
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۙ */
    public void mo1179(AbstractC23903 abstractC23903) {
        C16949 c16949 = (C16949) this.f29505;
        c16949.getClass();
        c16949.m39726((C10164) null, (C22492) abstractC23903);
    }
}
