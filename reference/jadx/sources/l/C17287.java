package l;

import android.widget.CompoundButton;
import bin.mt.plugin.api.ui.PluginEditText;

/* JADX INFO: renamed from: l.ܽۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R98O */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17287 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56313;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56314;

    public /* synthetic */ C17287(int i, Object obj) {
        this.f56313 = i;
        this.f56314 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f56313;
        Object obj = this.f56314;
        switch (i) {
            case 0:
                C23255 c23255 = (C23255) obj;
                int i2 = C23255.f75338;
                c23255.m53903(z ? PluginEditText.SYNTAX_REGEX : null, true);
                break;
            default:
                ApplicationC17729.f58258.edit().putBoolean("apk_signature_info_add_colon", z).apply();
                ((RunnableC21487) obj).run();
                break;
        }
    }
}
