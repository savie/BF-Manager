package l;

import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M74S */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC16018 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f51968;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14526 f51969;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f51970;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17771 f51971;

    public /* synthetic */ RunnableC16018(C14526 c14526, C17771 c17771, TextView textView, AbstractActivityC17204 abstractActivityC17204) {
        this.f51969 = c14526;
        this.f51971 = c17771;
        this.f51970 = textView;
        this.f51968 = abstractActivityC17204;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int size = this.f51969.m35044(this.f51971.m41599().toString().trim()).m41129().size();
        AbstractActivityC17204 abstractActivityC17204 = this.f51968;
        this.f51970.setText(size == 0 ? abstractActivityC17204.getString(R.string.MT_Protector) : abstractActivityC17204.getString(R.string.MT_Protector, Integer.valueOf(size)));
    }
}
