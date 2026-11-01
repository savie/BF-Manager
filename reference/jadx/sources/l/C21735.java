package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.framework.UMModuleRegister;

/* JADX INFO: renamed from: l.᩸ᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 27JL */
/* JADX INFO: loaded from: classes5.dex */
public final class C21735 extends AbstractC12068 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public String f70445;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f70446;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f70447;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public String f70448;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public String f70449;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public String f70450;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f70451;

    public C21735(int i) {
        super(i);
        this.f70447 = "";
        this.f70451 = 22;
        this.f70445 = "root";
        this.f70448 = "";
        this.f70450 = "";
        this.f70449 = "";
        this.f70446 = false;
    }

    public C21735(JSONObject jSONObject) {
        super(jSONObject);
        this.f70447 = "";
        this.f70451 = 22;
        this.f70445 = "root";
        this.f70448 = "";
        this.f70450 = "";
        this.f70449 = "";
        this.f70446 = false;
        this.f70447 = jSONObject.getString("1");
        this.f70451 = jSONObject.getInt("2");
        this.f70445 = jSONObject.getString("3");
        this.f70448 = jSONObject.getString("4");
        this.f70450 = jSONObject.getString("5");
        this.f70449 = jSONObject.getString("6", "");
        this.f70446 = jSONObject.getBoolean("7");
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final String mo4700() {
        if (this.f70451 == 22) {
            return "sshj://" + this.f70445 + "@" + this.f70447;
        }
        return "sshj://" + this.f70445 + "@" + this.f70447 + ":" + this.f70451;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ᩹ */
    public final JSONObject mo4706() {
        JSONObject jSONObjectMo4706 = super.mo4706();
        jSONObjectMo4706.put("1", this.f70447);
        jSONObjectMo4706.put("2", this.f70451);
        jSONObjectMo4706.put("3", this.f70445);
        jSONObjectMo4706.put("4", this.f70448);
        jSONObjectMo4706.put("5", this.f70450);
        jSONObjectMo4706.put("6", this.f70449);
        jSONObjectMo4706.put("7", this.f70446);
        return jSONObjectMo4706;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m48498() {
        if (this.f70449.isEmpty()) {
            return null;
        }
        return this.f70449;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۖ */
    public final String mo4699() {
        return C16737.m39288(R.string.MT_Protector);
    }

    @Override // l.AbstractC12068
    public final String getName() {
        return this.f40386;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final void mo4702(AbstractC12068 abstractC12068) {
        super.mo4702(abstractC12068);
        if (abstractC12068 instanceof C21735) {
            C21735 c21735 = (C21735) abstractC12068;
            this.f70447 = c21735.f70447;
            this.f70451 = c21735.f70451;
            this.f70445 = c21735.f70445;
            this.f70448 = c21735.f70448;
            this.f70450 = c21735.f70450;
            this.f70449 = c21735.f70449;
            this.f70446 = c21735.f70446;
        }
    }

    @Override // l.AbstractC12068
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21735.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C21735 c21735 = (C21735) obj;
        return this.f70451 == c21735.f70451 && this.f70446 == c21735.f70446 && C13638.equals(this.f70447, c21735.f70447) && C13638.equals(this.f70445, c21735.f70445) && C13638.equals(this.f70448, c21735.f70448) && C13638.equals(this.f70450, c21735.f70450) && C13638.equals(this.f70449, c21735.f70449);
    }

    @Override // l.AbstractC12068
    public final int hashCode() {
        return C0589.m2789(C0589.m2789(C0589.m2789(C0589.m2789((C0589.m2789(super.hashCode() * 31, 31, this.f70447) + this.f70451) * 31, 31, this.f70445), 31, this.f70448), 31, this.f70450), 31, this.f70449) + (this.f70446 ? 1231 : 1237);
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۨ */
    public final String mo4705() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12233 mo4701(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC12068
    public final C0690 getIcon() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۚ */
    public final String mo4704() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final void mo4703(AbstractActivityC12483 abstractActivityC12483) {
        m48495(abstractActivityC12483, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48494(ActivityC0567 activityC0567) {
        m48495(activityC0567, new C21735(-1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48495(final AbstractActivityC12483 abstractActivityC12483, final C21735 c21735) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText4 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText5 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText7 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12562 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        ((TextInputLayout) viewM30995.findViewById(R.id.MT_Protector)).setEndIconOnClickListener(new View.OnClickListener() { // from class: l.ۨᩳ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final EditText editText8 = editText;
                final EditText editText9 = editText2;
                final EditText editText10 = editText7;
                C4116.m11699(abstractActivityC12483, new InterfaceC17295() { // from class: l.ۘᩳ֨
                    @Override // l.InterfaceC17295
                    public final void accept(Object obj) {
                        C13290 c13290 = (C13290) obj;
                        editText8.setText(c13290.m32769());
                        editText9.setText(String.valueOf(c13290.m32770()));
                        editText10.setText(c13290.m32771());
                    }
                });
            }
        });
        View viewFindViewById = viewM30995.findViewById(R.id.button1);
        final View viewFindViewById2 = viewM30995.findViewById(R.id.MT_Protector);
        final View viewFindViewById3 = viewM30995.findViewById(R.id.textInputLayout4);
        StringBuilder sb = new StringBuilder();
        sb.append(C16737.m39288(c21735.f40385 == -1 ? R.string.MT_Protector : R.string.MT_Protector));
        sb.append(" ");
        sb.append(C16737.m39288(R.string.MT_Protector));
        textView.setText(sb.toString());
        editText.setText(c21735.f70447);
        editText2.setText(String.valueOf(c21735.f70451));
        editText3.setText(c21735.f70445);
        editText4.setText(c21735.f70448);
        editText5.setText(c21735.f70450);
        editText6.setText(c21735.f70449);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ۖᩳ֨
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                View view = viewFindViewById2;
                View view2 = viewFindViewById3;
                if (z) {
                    view.setVisibility(0);
                    view2.setVisibility(8);
                } else {
                    view.setVisibility(8);
                    view2.setVisibility(0);
                }
            }
        };
        onCheckedChangeListener.onCheckedChanged(c12562, c21735.f70446);
        c12562.setChecked(c21735.f70446);
        c12562.setOnCheckedChangeListener(onCheckedChangeListener);
        editText7.setText(c21735.f40386);
        AbstractC12068.m29989(editText, editText7);
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21265(false);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        C8875.m23019(dialogInterfaceC19356M21269);
        if (abstractActivityC12483 instanceof ActivityC0567) {
            ActivityC0567 activityC0567 = (ActivityC0567) abstractActivityC12483;
            C9186 c9186M2665 = activityC0567.m2665();
            C23566 c23566M2668 = activityC0567.m2668();
            c9186M2665.m44958((InterfaceC1423) dialogInterfaceC19356M21269);
            c9186M2665.mo23642((Object) null);
            c9186M2665.m44959(dialogInterfaceC19356M21269, new InterfaceC10597() { // from class: l.ۚᩳ֨
                @Override // l.InterfaceC10597
                /* JADX INFO: renamed from: ۙ */
                public final void mo1473(Object obj) {
                    String str = (String) obj;
                    if (str != null) {
                        new C6918(abstractActivityC12483, str, editText5).m10243();
                    }
                }
            });
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC17445(4, c23566M2668));
        } else {
            viewFindViewById.setEnabled(false);
            viewFindViewById.setAlpha(0.0f);
        }
        C16737.m39290(editText);
        final C22441 c22441 = new C22441(editText, editText3, c12562, editText5, editText4, editText2, editText6, editText7);
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.֨ᩳ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21735.m48497(c22441, c21735, abstractActivityC12483, dialogInterfaceC19356M21269);
            }
        });
        dialogInterfaceC19356M21269.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.۬ᩳ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21735 c21736 = (C21735) c22441.get();
                if (c21736 == null) {
                    return;
                }
                AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                if (C23810.m52475(abstractActivityC12484, c21736)) {
                    new C15386(abstractActivityC12484, c21736).m10243();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21735 m48493(EditText editText, EditText editText2, C12562 c12562, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7) {
        int i;
        if (!AbstractC12068.m29997(editText) || !AbstractC12068.m29994(editText2, R.string.MT_Protector)) {
            return null;
        }
        if (c12562.isChecked()) {
            if (!AbstractC12068.m29994(editText3, R.string.MT_Protector)) {
                return null;
            }
        } else if (!AbstractC12068.m29994(editText4, R.string.MT_Protector)) {
            return null;
        }
        C21735 c21735 = new C21735(-1);
        c21735.f70447 = editText.getText().toString();
        try {
            i = Integer.parseInt(editText5.getText().toString());
        } catch (NumberFormatException unused) {
            i = 22;
        }
        c21735.f70451 = i;
        c21735.f70445 = editText2.getText().toString();
        c21735.f70448 = editText4.getText().toString();
        c21735.f70450 = editText3.getText().toString();
        c21735.f70449 = editText6.getText().toString();
        if (c21735.f70450.length() > 20480) {
            c21735.f70450 = c21735.f70450.substring(0, UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
        }
        c21735.f70446 = c12562.isChecked();
        c21735.f40386 = AbstractC12068.m29988(editText7, c21735.f70447);
        return c21735;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48497(C22441 c22441, C21735 c21735, AbstractActivityC12483 abstractActivityC12483, DialogInterfaceC19356 dialogInterfaceC19356) {
        C21735 c21736 = (C21735) c22441.get();
        if (c21736 == null) {
            return;
        }
        if (c21735.f40385 == -1) {
            C21735 c21737 = new C21735(AbstractC12068.m29986());
            c21737.mo4702(c21736);
            C5717.m15766(c21737);
            if (abstractActivityC12483 instanceof ActivityC0567) {
                ((ActivityC0567) abstractActivityC12483).m2667();
            }
        } else {
            c21735.mo4702(c21736);
            C5717.m15760();
            if (abstractActivityC12483 instanceof ActivityC0567) {
                ((ActivityC0567) abstractActivityC12483).m2666();
            }
        }
        dialogInterfaceC19356.dismiss();
    }
}
