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

/* JADX INFO: renamed from: l.ۨܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12434 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f39972;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f39973;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6469 f39974;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FrameLayout f39975;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f39976;

    public C12434(C6469 c6469, FrameLayout frameLayout, String str, String str2, JSONObject jSONObject) {
        this.f39974 = c6469;
        this.f39975 = frameLayout;
        this.f39972 = str;
        this.f39976 = str2;
        this.f39973 = jSONObject;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        FrameLayout frameLayout = this.f39975;
        frameLayout.removeAllViews();
        frameLayout.setTag(R.id.MT_Protector, null);
        C6469 c6469 = this.f39974;
        C4231 c4231 = (C4231) c6469.f21767.get(i);
        C2310 c2310M13528 = c4231.m13528();
        PluginContext pluginContextM42678 = ((C18300) c2310M13528.f7473).m42678();
        ActivityC5440 activityC5440 = c6469.f21766;
        try {
            PluginView pluginViewBuildOptionsView = ((TextEditorFunction) c2310M13528.f7474).buildOptionsView(new C18365(pluginContextM42678, activityC5440), c4231.m13527(this.f39972, this.f39976) ? this.f39973 : null);
            if (pluginViewBuildOptionsView != null) {
                frameLayout.setTag(R.id.MT_Protector, pluginViewBuildOptionsView);
                frameLayout.addView(((C6128) pluginViewBuildOptionsView).m17689());
            }
        } catch (Throwable th) {
            ((C18300) c2310M13528.f7473).m42654(th);
            activityC5440.m40401(th, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        FrameLayout frameLayout = this.f39975;
        frameLayout.removeAllViews();
        frameLayout.setTag(R.id.MT_Protector, null);
    }
}
