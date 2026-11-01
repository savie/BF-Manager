package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.editor.TextEditorFunction;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5762 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19749 f19572;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Button f19573;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f19574 = new ArrayList();

    public C5762(Button button, ActivityC19749 activityC19749) {
        this.f19573 = button;
        this.f19572 = activityC19749;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f19573.setEnabled(false);
        m10252(this.f19572, 100);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        String stringNullable;
        ArrayList<Class> arrayList = new ArrayList();
        for (C11986 c11986 : C17132.m40019()) {
            c11986.m29833(arrayList);
            String strM29843 = c11986.m29843();
            String strM29845 = c11986.m29845();
            for (Class cls : arrayList) {
                try {
                    TextEditorFunction textEditorFunction = (TextEditorFunction) cls.newInstance();
                    textEditorFunction.init(c11986.m29831());
                    if (textEditorFunction.isEnabled()) {
                        String name = cls.getName();
                        PluginContext pluginContextM29831 = c11986.m29831();
                        String strName = textEditorFunction.name();
                        this.f19574.add(new C23402(strM29843, strM29845, name, (strName.length() < 3 || strName.charAt(0) != '{' || strName.charAt(strName.length() + (-1)) != '}' || (stringNullable = ((C10659) pluginContextM29831).getStringNullable(strName)) == null) ? strName : stringNullable, new C10946(c11986, textEditorFunction)));
                    }
                } catch (Throwable th) {
                    c11986.m29814(th);
                }
            }
            arrayList.clear();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        ArrayList arrayList = this.f19574;
        boolean zIsEmpty = arrayList.isEmpty();
        final ActivityC19749 activityC19749 = this.f19572;
        if (zIsEmpty) {
            C15829.m37611(R.string.MT_Protector);
            activityC19749.startActivity(new Intent(activityC19749, (Class<?>) ActivityC1609.class));
            return;
        }
        C14230 c14230 = (C14230) this.f19573.getTag(R.id.MT_Protector);
        JSONObject jSONObject = c14230 == null ? new JSONObject() : c14230.mo33245();
        String string = jSONObject.getString(am.av);
        String string2 = jSONObject.getString("b");
        JSONObject jSONObject2 = jSONObject.getJSONObject(am.aF);
        View viewM30995 = activityC19749.m30995(R.layout.MT_Protector);
        final Spinner spinner = (Spinner) viewM30995.findViewById(R.id.spinner);
        final FrameLayout frameLayout = (FrameLayout) viewM30995.findViewById(R.id.MT_Protector);
        spinner.setOnItemSelectedListener(new C17051(this, frameLayout, string, string2, jSONObject2));
        spinner.setAdapter((SpinnerAdapter) new C0733(activityC19749, arrayList));
        if (string != null && string2 != null) {
            String strM5594 = C1679.m5594(string, "/", string2);
            for (int i = 0; i < arrayList.size(); i++) {
                if (strM5594.equals(((C23402) arrayList.get(i)).m51542())) {
                    spinner.setSelection(i);
                    break;
                }
            }
        }
        C8067 c8067BuildDialog = activityC19749.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        Button buttonM44373 = dialogInterfaceC19356M21269.m44373();
        final Button button = this.f19573;
        buttonM44373.setOnClickListener(new View.OnClickListener() { // from class: l.۫ۖۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C23402 c23402 = (C23402) this.f40564.f19574.get(spinner.getSelectedItemPosition());
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(am.av, c23402.f75792);
                jSONObject3.put("b", c23402.f75793);
                Object tag = frameLayout.getTag(R.id.MT_Protector);
                if (tag instanceof PluginView) {
                    PluginView pluginView = (PluginView) tag;
                    try {
                        JSONObject optionsData = ((TextEditorFunction) c23402.m51544().f37218).getOptionsData(pluginView.getPluginUI(), pluginView);
                        if (optionsData == TextEditorFunction.VALIDATION_FAILED) {
                            return;
                        }
                        if (optionsData != null) {
                            jSONObject3.put(am.aF, optionsData);
                        }
                    } catch (Throwable th) {
                        ((C11986) c23402.m51544().f37217).m29814(th);
                        activityC19749.m31002(th, (DialogInterface.OnDismissListener) null);
                        return;
                    }
                }
                C14230 c14231 = new C14230(jSONObject3, c23402.f75795);
                Button button2 = button;
                button2.setTag(R.id.MT_Protector, c14231);
                TextView textView = (TextView) button2.getTag(R.id.MT_Protector);
                textView.setVisibility(0);
                textView.setText(c14231.m34336());
                dialogInterfaceC19356M21269.dismiss();
            }
        });
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f19572.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
        this.f19573.setEnabled(true);
    }
}
