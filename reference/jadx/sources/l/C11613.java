package l;

import android.os.Bundle;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1E0 */
/* JADX INFO: loaded from: classes4.dex */
public class C11613 extends AbstractC22611 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22959 f39012;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f39013;

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo28945(byte[] bArr) {
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۬ */
    public final String mo3618() {
        return null;
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo3619() {
        return false;
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo3621() {
        return false;
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ᩹ */
    public final int mo3622() {
        return R.drawable.MT_Protector;
    }

    public C11613() {
        super(R.layout.MT_Protector);
        this.f39012 = C22959.m50800();
        this.f39013 = true;
        m50133("000000-0000-0000-0000-000000000002");
    }

    @Override // l.ComponentCallbacksC22654
    public final void onViewCreated(View view, Bundle bundle) {
        view.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC22904(2, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28943(C11613 c11613) {
        if (c11613.f39012.m50802()) {
            c11613.m50125(new C0965(2));
        }
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۘ */
    public final String mo3615() {
        return C16737.m39288(R.string.MT_Protector);
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ܶ */
    public final String mo3620() {
        return C16737.m39288(R.string.MT_Protector);
    }

    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onResume() {
        View view;
        super.onResume();
        m50125(new C4556());
        if (this.f39013 && this.f39012.m50802() && (view = getView()) != null) {
            view.post(new RunnableC5843(1, this));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28944(C11613 c11613, ActivityC5677 activityC5677) {
        if (c11613.f39013 && activityC5677.m15654()) {
            c11613.f39013 = false;
        }
    }
}
