package l;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: l.᩺֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: U2CZ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC23938 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f77494;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f77495;

    public /* synthetic */ ViewOnClickListenerC23938(KeyEvent.Callback callback, int i) {
        this.f77494 = i;
        this.f77495 = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f77494) {
            case 0:
                C14240.m34561((C14240) this.f77495);
                break;
            default:
                ((ActivityC6167) this.f77495).m17769();
                break;
        }
    }
}
