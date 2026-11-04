package l;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢ᩶֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC10358 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f32976 = 0;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C19309 f32977;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "AccountDeletionActivity";
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40418(R.layout.MT_Protector);
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC6018(this, 1));
        AbstractC0726 abstractC0726M52413 = C23302.m52413((Context) this, false);
        View viewM40418 = m40418(R.id.MT_Protector);
        TextView textView = (TextView) m40418(R.id.textView);
        CheckBox checkBox = (CheckBox) m40418(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) m40418(R.id.checkBox2);
        Button button = (Button) m40418(R.id.MT_Protector);
        button.setEnabled(false);
        viewM40418.setVisibility(4);
        new C14833(this, abstractC0726M52413, textView, checkBox, checkBox2, button, viewM40418).m8197();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m26639(final ActivityC10358 activityC10358) {
        final EditText editText;
        View viewM40395 = activityC10358.m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.MT_Protector)).setText(activityC10358.f32977.f62394);
        Button button = (Button) viewM40395.findViewById(R.id.button1);
        button.setEnabled(false);
        if (activityC10358.f32977.f62395) {
            viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
            editText = (EditText) viewM40395.findViewById(R.id.MT_Protector);
            editText.addTextChangedListener(new C21547(button));
            viewM40395.findViewById(R.id.button2).setOnClickListener(new ViewOnClickListenerC9884(activityC10358, 1));
        } else {
            viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
            editText = (EditText) viewM40395.findViewById(R.id.editText2);
            editText.addTextChangedListener(new C0664(button));
        }
        C2361 c2361BuildDialog = activityC10358.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        button.setOnClickListener(new View.OnClickListener() { // from class: l.ۛ᩶֫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC10358.m26637(this.f22137, editText, dialogInterfaceC8327M8016, view);
            }
        });
        C21576.m49090(editText);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26637(final ActivityC10358 activityC10358, EditText editText, final DialogInterfaceC8327 dialogInterfaceC8327, final View view) {
        final String string = editText.getText().toString();
        if (activityC10358.f32977.f62395) {
            if (!string.matches("\\d{6}")) {
                C22673.m51152(R.string.MT_Protector);
                return;
            }
        } else if (string.length() < 7) {
            C22673.m51152(R.string.MT_Protector);
            return;
        } else if (!C21766.m49336(string)) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        C2361 c2361BuildDialog = activityC10358.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(activityC10358.f32977.f62393);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩺᩶֫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = ActivityC10358.f32976;
                View view2 = view;
                view2.setEnabled(false);
                new C8122(view2, activityC10358, dialogInterfaceC8327, string).m8197();
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }
}
