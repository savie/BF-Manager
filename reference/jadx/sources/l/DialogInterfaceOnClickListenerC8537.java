package l;

import android.content.DialogInterface;
import android.widget.BaseAdapter;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۡ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC8537 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29545;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29546;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29547;

    public /* synthetic */ DialogInterfaceOnClickListenerC8537(int i, Object obj, Object obj2) {
        this.f29546 = i;
        this.f29547 = obj;
        this.f29545 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f29546) {
            case 0:
                C11835 c11835 = (C11835) this.f29547;
                BaseAdapter baseAdapter = (BaseAdapter) this.f29545;
                synchronized (c11835) {
                    c11835.f39735.clear();
                    break;
                }
                baseAdapter.notifyDataSetChanged();
                return;
            default:
                Callable callable = (Callable) this.f29547;
                AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) this.f29545;
                try {
                    callable.call();
                    return;
                } catch (Exception e) {
                    abstractActivityC12483.m31002(e, (DialogInterface.OnDismissListener) null);
                    return;
                }
        }
    }
}
