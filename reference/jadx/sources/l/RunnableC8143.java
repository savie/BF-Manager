package l;

import com.google.android.material.timepicker.MaterialTimePicker;

/* JADX INFO: renamed from: l.۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8143 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26857;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f26858;

    public /* synthetic */ RunnableC8143(int i, Object obj) {
        this.f26857 = i;
        this.f26858 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f26857;
        Object obj = this.f26858;
        switch (i) {
            case 0:
                ((ActivityC5577) obj).invalidateOptionsMenu();
                break;
            case 1:
                C4506.m14223((C4506) obj);
                break;
            case 2:
                C18467.m43019((C18467) obj);
                break;
            case 3:
                ((MaterialTimePicker) obj).lambda$onViewCreated$0();
                break;
            default:
                int i2 = AbstractC22830.f73994;
                ((AbstractC22830) obj).m51484();
                break;
        }
    }
}
