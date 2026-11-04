package l;

import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.ᩴܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19879 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63950;

    public /* synthetic */ C19879(int i) {
        this.f63950 = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f63950) {
            case 0:
                int i = ActivityC7135.f23493;
                C6421.m18184(ApplicationC17729.f58258, "vpapn", z);
                break;
            default:
                int i2 = ServiceC10702.f33975;
                C22637.m51034(z);
                break;
        }
    }
}
