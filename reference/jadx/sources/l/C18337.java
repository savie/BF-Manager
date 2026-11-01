package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import com.umeng.analytics.pro.o;

/* JADX INFO: renamed from: l.ᩳ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes4.dex */
public final class C18337 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12562 f58496;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12562 f58497;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19749 f58498;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TextView f58499;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextView f58500;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final View f58501;

    public C18337(ActivityC19749 activityC19749) {
        this.f58498 = activityC19749;
        View viewM30995 = activityC19749.m30995(R.layout.MT_Protector);
        this.f58501 = viewM30995;
        this.f58500 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        m42582();
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.۬᩹ۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C18337 c18337 = this.f44359;
                C21865 c21865 = new C21865(c18337, c18337.f58498);
                c21865.m47196(R.string.MT_Protector, R.string.MT_Protector);
                c21865.m47198(R.string.MT_Protector);
                c21865.m47192();
                C16737.m39274(new RunnableC3185(4, c21865), 200L);
                EditText editTextM47193 = c21865.m47193(0);
                EditText editTextM47194 = c21865.m47193(1);
                editTextM47193.setInputType(o.a.b);
                editTextM47194.setInputType(o.a.b);
                int i = C7754.f25604;
                editTextM47193.setText(String.valueOf(ApplicationC0716.f2992.getInt("text_function_min_line", 1)));
                editTextM47194.setText(String.valueOf(ApplicationC0716.f2992.getInt("text_function_max_line", 4)));
            }
        });
        this.f58499 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        m42585();
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۘ᩹ۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final C18337 c18337 = this.f15311;
                C8067 c8067BuildDialog = c18337.f58498.buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                int i = C7754.f25604;
                c8067BuildDialog.m21254(R.array.MT_Protector, ApplicationC0716.f2992.getInt("tfgi", 0), new DialogInterface.OnClickListener() { // from class: l.ܶ᩹ۚ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        C18337.m42584(c18337, dialogInterface, i2);
                    }
                });
                c8067BuildDialog.m21269();
            }
        });
        C12562 c12562 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        this.f58496 = c12562;
        int i = C7754.f25604;
        c12562.setChecked(ApplicationC0716.f2992.getBoolean("tfugh", true));
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۜ᩹ۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12562 c12563 = this.f23681.f58496;
                c12563.toggle();
                boolean zIsChecked = c12563.isChecked();
                int i2 = C7754.f25604;
                ApplicationC0716.f2992.edit().putBoolean("tfugh", zIsChecked).apply();
                C7754.m20401();
            }
        });
        C12562 c12563 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        this.f58497 = c12563;
        c12563.setChecked(C16839.m39487());
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.᩺᩹ۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12562 c12564 = this.f75509.f58497;
                c12564.toggle();
                C16839.m39489(c12564.isChecked());
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42584(C18337 c18337, DialogInterface dialogInterface, int i) {
        int i2 = C7754.f25604;
        ApplicationC0716.f2992.edit().mo4065(i, "tfgi").apply();
        C7754.m20401();
        c18337.m42585();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m42582() {
        StringBuilder sb = new StringBuilder();
        int i = C7754.f25604;
        sb.append(ApplicationC0716.f2992.getInt("text_function_min_line", 1));
        sb.append(" - ");
        sb.append(ApplicationC0716.f2992.getInt("text_function_max_line", 4));
        this.f58500.setText(sb.toString());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m42585() {
        String strM39288;
        int i = C7754.f25604;
        int i2 = ApplicationC0716.f2992.getInt("tfgi", 0);
        if (i2 == 0) {
            strM39288 = C16737.m39288(R.string.MT_Protector);
        } else if (i2 == 1) {
            strM39288 = C16737.m39288(R.string.MT_Protector);
        } else {
            strM39288 = i2 != 2 ? null : C16737.m39288(R.string.MT_Protector);
        }
        this.f58499.setText(strM39288);
    }
}
