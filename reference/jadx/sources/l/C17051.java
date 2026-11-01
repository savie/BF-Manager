package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import bin.mt.json.JSONObject;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.editor.TextEditorFunction;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17051 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FrameLayout f54449;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f54450;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5762 f54451;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f54452;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f54453;

    public C17051(C5762 c5762, FrameLayout frameLayout, String str, String str2, JSONObject jSONObject) {
        this.f54451 = c5762;
        this.f54449 = frameLayout;
        this.f54452 = str;
        this.f54453 = str2;
        this.f54450 = jSONObject;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        FrameLayout frameLayout = this.f54449;
        frameLayout.removeAllViews();
        frameLayout.setTag(R.id.MT_Protector, null);
        C5762 c5762 = this.f54451;
        C23402 c23402 = (C23402) c5762.f19574.get(i);
        C10946 c10946M51544 = c23402.m51544();
        PluginContext pluginContextM29831 = ((C11986) c10946M51544.f37217).m29831();
        ActivityC19749 activityC19749 = c5762.f19572;
        try {
            PluginView pluginViewBuildOptionsView = ((TextEditorFunction) c10946M51544.f37218).buildOptionsView(new C2355(pluginContextM29831, activityC19749), c23402.m51543(this.f54452, this.f54453) ? this.f54450 : null);
            if (pluginViewBuildOptionsView != null) {
                frameLayout.setTag(R.id.MT_Protector, pluginViewBuildOptionsView);
                frameLayout.addView(((C3247) pluginViewBuildOptionsView).m9720());
            }
        } catch (Throwable th) {
            ((C11986) c10946M51544.f37217).m29814(th);
            activityC19749.m31002(th, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        FrameLayout frameLayout = this.f54449;
        frameLayout.removeAllViews();
        frameLayout.setTag(R.id.MT_Protector, null);
    }
}
