package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB7O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC6134 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f20947;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20948;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20949;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20950;

    public /* synthetic */ ViewOnClickListenerC6134(Object obj, Object obj2, View view, int i) {
        this.f20948 = i;
        this.f20950 = obj;
        this.f20949 = obj2;
        this.f20947 = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20948) {
            case 0:
                C9170 c9170 = (C9170) this.f20950;
                C23255 c23255 = (C23255) this.f20949;
                C23255 c23256 = (C23255) this.f20947;
                c9170.m24304();
                C2459.m8293(c9170.f29768, c9170.f29767, c23255, c23256);
                break;
            default:
                Main main = (Main) this.f20950;
                ArrayList arrayList = (ArrayList) this.f20949;
                C5587.m16561(main, arrayList, new RunnableC9840(3, (TextView) this.f20947, arrayList));
                break;
        }
    }
}
