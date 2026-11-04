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

/* JADX INFO: renamed from: l.ۛܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6469 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Button f21765;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5440 f21766;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f21767 = new ArrayList();

    public C6469(Button button, ActivityC5440 activityC5440) {
        this.f21765 = button;
        this.f21766 = activityC5440;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f21765.setEnabled(false);
        m8199(this.f21766, 100);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        String stringNullable;
        ArrayList<Class> arrayList = new ArrayList();
        for (C18300 c18300 : C23522.m52705()) {
            c18300.m42680(arrayList);
            String strM42672 = c18300.m42672();
            String strM42687 = c18300.m42687();
            for (Class cls : arrayList) {
                try {
                    TextEditorFunction textEditorFunction = (TextEditorFunction) cls.newInstance();
                    textEditorFunction.init(c18300.m42678());
                    if (textEditorFunction.isEnabled()) {
                        String name = cls.getName();
                        PluginContext pluginContextM42678 = c18300.m42678();
                        String strName = textEditorFunction.name();
                        this.f21767.add(new C4231(strM42672, strM42687, name, (strName.length() < 3 || strName.charAt(0) != '{' || strName.charAt(strName.length() + (-1)) != '}' || (stringNullable = ((C20889) pluginContextM42678).getStringNullable(strName)) == null) ? strName : stringNullable, new C2310(c18300, textEditorFunction)));
                    }
                } catch (Throwable th) {
                    c18300.m42654(th);
                }
            }
            arrayList.clear();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        ArrayList arrayList = this.f21767;
        boolean zIsEmpty = arrayList.isEmpty();
        final ActivityC5440 activityC5440 = this.f21766;
        if (zIsEmpty) {
            C22673.m51152(R.string.MT_Protector);
            activityC5440.startActivity(new Intent(activityC5440, (Class<?>) ActivityC24268.class));
            return;
        }
        C14671 c14671 = (C14671) this.f21765.getTag(R.id.MT_Protector);
        JSONObject jSONObject = c14671 == null ? new JSONObject() : c14671.mo35301();
        String string = jSONObject.getString(am.av);
        String string2 = jSONObject.getString("b");
        JSONObject jSONObject2 = jSONObject.getJSONObject(am.aF);
        View viewM40395 = activityC5440.m40395(R.layout.MT_Protector);
        final Spinner spinner = (Spinner) viewM40395.findViewById(R.id.spinner);
        final FrameLayout frameLayout = (FrameLayout) viewM40395.findViewById(R.id.MT_Protector);
        spinner.setOnItemSelectedListener(new C12434(this, frameLayout, string, string2, jSONObject2));
        spinner.setAdapter((SpinnerAdapter) new C3054(activityC5440, arrayList));
        if (string != null && string2 != null) {
            String strM46451 = C20196.m46451(string, "/", string2);
            for (int i = 0; i < arrayList.size(); i++) {
                if (strM46451.equals(((C4231) arrayList.get(i)).m13526())) {
                    spinner.setSelection(i);
                    break;
                }
            }
        }
        C2361 c2361BuildDialog = activityC5440.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        Button buttonM22436 = dialogInterfaceC8327M8016.m22436();
        final Button button = this.f21765;
        buttonM22436.setOnClickListener(new View.OnClickListener() { // from class: l.᩵ܳᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4231 c4231 = (C4231) this.f66193.f21767.get(spinner.getSelectedItemPosition());
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(am.av, c4231.f15444);
                jSONObject3.put("b", c4231.f15440);
                Object tag = frameLayout.getTag(R.id.MT_Protector);
                if (tag instanceof PluginView) {
                    PluginView pluginView = (PluginView) tag;
                    try {
                        JSONObject optionsData = ((TextEditorFunction) c4231.m13528().f7474).getOptionsData(pluginView.getPluginUI(), pluginView);
                        if (optionsData == TextEditorFunction.VALIDATION_FAILED) {
                            return;
                        }
                        if (optionsData != null) {
                            jSONObject3.put(am.aF, optionsData);
                        }
                    } catch (Throwable th) {
                        ((C18300) c4231.m13528().f7473).m42654(th);
                        activityC5440.m40401(th, (DialogInterface.OnDismissListener) null);
                        return;
                    }
                }
                C14671 c14672 = new C14671(jSONObject3, c4231.f15441);
                Button button2 = button;
                button2.setTag(R.id.MT_Protector, c14672);
                TextView textView = (TextView) button2.getTag(R.id.MT_Protector);
                textView.setVisibility(0);
                textView.setText(c14672.m35298());
                dialogInterfaceC8327M8016.dismiss();
            }
        });
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f21766.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
        this.f21765.setEnabled(true);
    }
}
