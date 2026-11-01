package l;

import android.view.KeyEvent;
import android.widget.Button;
import android.widget.CompoundButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8021 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26277;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f26278;

    public /* synthetic */ C8021(KeyEvent.Callback callback, int i) {
        this.f26277 = i;
        this.f26278 = callback;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f26277) {
            case 0:
                ((Button) this.f26278).setText(z ? R.string.MT_Protector : R.string.MT_Protector);
                break;
            default:
                ActivityC23387.m51529((ActivityC23387) this.f26278, compoundButton, z);
                break;
        }
    }
}
