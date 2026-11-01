package l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC10486 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35925;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35926;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35927;

    public /* synthetic */ ViewOnClickListenerC10486(int i, Object obj, Object obj2) {
        this.f35926 = i;
        this.f35927 = obj;
        this.f35925 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f35926) {
            case 0:
                C8765.m22783((C8765) this.f35927, (C22046) this.f35925, view);
                break;
            default:
                C12935.m32044((AbstractActivityC12483) this.f35927, (ArrayList) this.f35925, null);
                break;
        }
    }
}
