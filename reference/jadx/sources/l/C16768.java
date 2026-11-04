package l;

import android.view.View;
import android.widget.CompoundButton;
import bin.mt.plugin.api.ui.PluginEditText;

/* JADX INFO: renamed from: l.ܺۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16768 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54117;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f54118;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f54119;

    public /* synthetic */ C16768(View view, View view2, int i) {
        this.f54117 = i;
        this.f54119 = view;
        this.f54118 = view2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f54117) {
            case 0:
                C6679.m18696((C1255) this.f54119, (C1255) this.f54118);
                break;
            default:
                C23255 c23255 = (C23255) this.f54119;
                C23255 c23256 = (C23255) this.f54118;
                c23255.m53903(z ? PluginEditText.SYNTAX_REGEX : null, true);
                c23256.m53903(z ? PluginEditText.SYNTAX_REGEX_REPLACEMENT : null, true);
                break;
        }
    }
}
