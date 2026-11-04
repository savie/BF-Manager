package l;

import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.ۡᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9568 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30965;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f30966;

    public /* synthetic */ C9568(int i, Object obj) {
        this.f30965 = i;
        this.f30966 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f30965) {
            case 0:
                ActivityC7135.m19679((ActivityC7135) this.f30966, z);
                break;
            case 1:
                RunnableC21487 runnableC21487 = (RunnableC21487) this.f30966;
                ApplicationC17729.f58258.edit().putBoolean("apk_signature_info_upper_case", z).apply();
                runnableC21487.run();
                break;
            case 2:
                ((C23255) this.f30966).setVisibility(z ? 0 : 8);
                break;
            default:
                ((ViewOnClickListenerC13657) this.f30966).m33438();
                break;
        }
    }
}
