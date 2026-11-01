package l;

import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨ܽ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: M74S */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1243 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f5417;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18883 f5418;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f5419;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9160 f5420;

    public /* synthetic */ RunnableC1243(C18883 c18883, C9160 c9160, TextView textView, AbstractActivityC12483 abstractActivityC12483) {
        this.f5418 = c18883;
        this.f5420 = c9160;
        this.f5417 = textView;
        this.f5419 = abstractActivityC12483;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int size = this.f5418.m43559(this.f5420.m23513().toString().trim()).m49696().size();
        AbstractActivityC12483 abstractActivityC12483 = this.f5419;
        this.f5417.setText(size == 0 ? abstractActivityC12483.getString(R.string.MT_Protector) : abstractActivityC12483.getString(R.string.MT_Protector, Integer.valueOf(size)));
    }
}
