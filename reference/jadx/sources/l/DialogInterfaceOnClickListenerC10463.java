package l;

import android.content.DialogInterface;
import android.widget.BaseAdapter;

/* JADX INFO: renamed from: l.ۢ᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC10463 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f33304;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f33305;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f33306;

    public /* synthetic */ DialogInterfaceOnClickListenerC10463(int i, Object obj, Object obj2) {
        this.f33304 = i;
        this.f33306 = obj;
        this.f33305 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f33304) {
            case 0:
                C7941 c7941 = (C7941) this.f33306;
                int[] iArr = (int[]) this.f33305;
                c7941.getClass();
                c7941.m21621(iArr[0], false, false);
                return;
            case 1:
                C22829 c22829 = (C22829) this.f33306;
                BaseAdapter baseAdapter = (BaseAdapter) this.f33305;
                synchronized (c22829) {
                    c22829.f73990.clear();
                    break;
                }
                baseAdapter.notifyDataSetChanged();
                return;
            default:
                ((C25350) this.f33306).m24164((ActivityC0848) this.f33305);
                return;
        }
    }
}
