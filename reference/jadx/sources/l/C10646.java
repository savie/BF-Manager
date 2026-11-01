package l;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: l.ۧ֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4HK */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10646 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36317;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f36318;

    public /* synthetic */ C10646(int i, Object obj) {
        this.f36317 = i;
        this.f36318 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f36317) {
            case 0:
                AbstractC1472.m5117((AbstractC1472) this.f36318, z);
                break;
            default:
                ((Chip) this.f36318).lambda$new$0(compoundButton, z);
                break;
        }
    }
}
