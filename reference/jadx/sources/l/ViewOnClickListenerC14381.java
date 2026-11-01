package l;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ܳ۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097X */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC14381 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f47121;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f47122;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f47123;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3246 f47124;

    public /* synthetic */ ViewOnClickListenerC14381(C3246 c3246, EditText editText, EditText editText2, int i) {
        this.f47122 = i;
        this.f47124 = c3246;
        this.f47121 = editText;
        this.f47123 = editText2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f47122) {
            case 0:
                C3246 c3246 = this.f47124;
                c3246.m9718();
                C4388.m12238(c3246.f12072, c3246.f12075, this.f47121, this.f47123);
                break;
            default:
                C3246 c3247 = this.f47124;
                c3247.m9718();
                C4388.m12238(c3247.f12072, c3247.f12075, this.f47121, this.f47123);
                break;
        }
    }
}
