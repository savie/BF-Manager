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

/* JADX INFO: renamed from: l.۬᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC13418 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f44380 = 0;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C1422 f44381;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "AccountDeletionActivity";
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31016(R.layout.MT_Protector);
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        m31017();
        this.f41645.setNavigationOnClickListener(new View.OnClickListener() { // from class: l.ܳۜۘ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC13418.f44380;
                this.f47018.finish();
            }
        });
        AbstractC14883 abstractC14883M1034 = C0091.m1034((Context) this, false);
        View viewM31016 = m31016(R.id.MT_Protector);
        TextView textView = (TextView) m31016(R.id.textView);
        CheckBox checkBox = (CheckBox) m31016(R.id.MT_Protector);
        CheckBox checkBox2 = (CheckBox) m31016(R.id.checkBox2);
        Button button = (Button) m31016(R.id.MT_Protector);
        button.setEnabled(false);
        viewM31016.setVisibility(4);
        new C4950(this, abstractC14883M1034, textView, checkBox, checkBox2, button, viewM31016).m10243();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m32906(ActivityC13418 activityC13418) {
        EditText editText;
        View viewM30995 = activityC13418.m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(activityC13418.f44381.f5866);
        Button button = (Button) viewM30995.findViewById(R.id.button1);
        button.setEnabled(false);
        if (activityC13418.f44381.f5872) {
            viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
            editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
            editText.addTextChangedListener(new C14124(button));
            viewM30995.findViewById(R.id.button2).setOnClickListener(new ViewOnClickListenerC20244(activityC13418, 1));
        } else {
            viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
            editText = (EditText) viewM30995.findViewById(R.id.editText2);
            editText.addTextChangedListener(new C2833(button));
        }
        C8067 c8067BuildDialog = activityC13418.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        button.setOnClickListener(new ViewOnClickListenerC2435(activityC13418, editText, c8067BuildDialog.m21269()));
        C16737.m39290(editText);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32904(final ActivityC13418 activityC13418, EditText editText, final DialogInterfaceC19356 dialogInterfaceC19356, final View view) {
        final String string = editText.getText().toString();
        if (activityC13418.f44381.f5872) {
            if (!string.matches("\\d{6}")) {
                C15829.m37611(R.string.MT_Protector);
                return;
            }
        } else if (string.length() < 7) {
            C15829.m37611(R.string.MT_Protector);
            return;
        } else if (!C1334.m4739(string)) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        C8067 c8067BuildDialog = activityC13418.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21261(activityC13418.f44381.f5870);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֫ۜۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = ActivityC13418.f44380;
                View view2 = view;
                view2.setEnabled(false);
                new C22590(view2, activityC13418, dialogInterfaceC19356, string).m10243();
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }
}
