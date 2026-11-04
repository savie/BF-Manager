package l;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: l.֨ۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1004 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3615;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3616;

    public /* synthetic */ C1004(int i, Object obj) {
        this.f3615 = i;
        this.f3616 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f3615) {
            case 0:
                ((C13132) this.f3616).f41993.m41606(z);
                break;
            default:
                ((Chip) this.f3616).lambda$new$0(compoundButton, z);
                break;
        }
    }
}
