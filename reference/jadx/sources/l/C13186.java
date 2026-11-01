package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.۬ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: CAG8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13186 extends AbstractC12068 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f43887;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f43888;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f43889;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public String f43890;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public String f43891;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public String f43892;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f43893;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f43894;

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۖ */
    public final String mo4699() {
        return "FTPS";
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo29998() {
        return true;
    }

    public C13186(int i) {
        super(i);
        this.f43891 = "";
        this.f43894 = 21;
        this.f43892 = "anonymous";
        this.f43890 = "";
        this.f43889 = a.D;
        this.f43888 = true;
        this.f43893 = true;
        this.f43887 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13186(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC12068.m29996(jSONObject, "rk", "4");
        AbstractC12068.m29996(jSONObject, "ip", "7");
        AbstractC12068.m29992(jSONObject, "hs", "b");
        AbstractC12068.m29992(jSONObject, "mt", am.aF);
        this.f43891 = "";
        this.f43894 = 21;
        this.f43892 = "anonymous";
        this.f43890 = "";
        this.f43889 = a.D;
        this.f43888 = true;
        this.f43893 = true;
        this.f43887 = true;
        this.f43891 = jSONObject.getString("2");
        this.f43894 = jSONObject.getInt("3");
        this.f43892 = jSONObject.getString("5");
        this.f43890 = jSONObject.getString("6");
        this.f43889 = jSONObject.getString("8");
        this.f43888 = jSONObject.getBoolean("9");
        this.f43893 = jSONObject.getBoolean(am.av);
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final String mo4700() {
        if (this.f43894 == 21) {
            return "ftps://" + this.f43892 + "@" + this.f43891;
        }
        return "ftps://" + this.f43892 + "@" + this.f43891 + ":" + this.f43894;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ᩹ */
    public final JSONObject mo4706() {
        JSONObject jSONObjectMo4706 = super.mo4706();
        jSONObjectMo4706.put("2", this.f43891);
        jSONObjectMo4706.put("3", this.f43894);
        jSONObjectMo4706.put("5", this.f43892);
        jSONObjectMo4706.put("6", this.f43890);
        jSONObjectMo4706.put("8", this.f43889);
        jSONObjectMo4706.put("9", this.f43888);
        jSONObjectMo4706.put(am.av, this.f43893);
        return jSONObjectMo4706;
    }

    @Override // l.AbstractC12068
    public final String getName() {
        return this.f40386;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۨ */
    public final String mo4705() {
        String str = "ftps://" + this.f43892 + "@" + this.f43891;
        return str.endsWith("/") ? C20630.m46498(1, 0, str) : str;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final void mo4702(AbstractC12068 abstractC12068) {
        super.mo4702(abstractC12068);
        if (abstractC12068 instanceof C13186) {
            C13186 c13186 = (C13186) abstractC12068;
            this.f43891 = c13186.f43891;
            this.f43894 = c13186.f43894;
            this.f43892 = c13186.f43892;
            this.f43890 = c13186.f43890;
            this.f43889 = c13186.f43889;
            this.f43888 = c13186.f43888;
            this.f43893 = c13186.f43893;
        }
    }

    @Override // l.AbstractC12068
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13186.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C13186 c13186 = (C13186) obj;
        return this.f43894 == c13186.f43894 && this.f43888 == c13186.f43888 && this.f43893 == c13186.f43893 && this.f43887 == c13186.f43887 && C13638.equals(this.f43891, c13186.f43891) && C13638.equals(this.f43892, c13186.f43892) && C13638.equals(this.f43890, c13186.f43890) && C13638.equals(this.f43889, c13186.f43889);
    }

    @Override // l.AbstractC12068
    public final int hashCode() {
        return ((((C0589.m2789(C0589.m2789(C0589.m2789((C0589.m2789(super.hashCode() * 31, 31, this.f43891) + this.f43894) * 31, 31, this.f43892), 31, this.f43890), 31, this.f43889) + (this.f43888 ? 1231 : 1237)) * 31) + (this.f43893 ? 1231 : 1237)) * 31) + (this.f43887 ? 1231 : 1237);
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12233 mo4701(int i) {
        return new C16714(i, clone());
    }

    @Override // l.AbstractC12068
    public final C0690 getIcon() {
        return C0690.f2916;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۚ */
    public final String mo4704() {
        return C22697.m50267(new StringBuilder("ftps@"), this.f40386, " ");
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final void mo4703(AbstractActivityC12483 abstractActivityC12483) {
        m32591(abstractActivityC12483, this);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m32592(AbstractActivityC12483 abstractActivityC12483) {
        m32591(abstractActivityC12483, new C13186(-1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32591(final AbstractActivityC12483 abstractActivityC12483, C13186 c13186) {
        View viewM30995;
        if (abstractActivityC12483.getResources().getBoolean(R.bool.MT_Protector)) {
            viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        } else {
            viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        }
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText4 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText5 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText7 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final RadioButton radioButton = (RadioButton) viewM30995.findViewById(R.id.MT_Protector);
        final RadioButton radioButton2 = (RadioButton) viewM30995.findViewById(R.id.MT_Protector);
        final RadioButton radioButton3 = (RadioButton) viewM30995.findViewById(R.id.radioButton3);
        final RadioButton radioButton4 = (RadioButton) viewM30995.findViewById(R.id.radioButton4);
        C12562 c12562 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12563 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12564 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        C16301 c16301M38449 = C16301.m38449(abstractActivityC12483, (TextView) viewM30995.findViewById(R.id.MT_Protector), c13186);
        View view = viewM30995;
        textView.setText(C16737.m39288(c13186.f40385 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" FTPS"));
        editText.setText(c13186.f43891);
        editText2.setText(String.valueOf(c13186.f43894));
        editText3.setText(c13186.f43892.equals("anonymous") ? "" : c13186.f43892);
        editText4.setText(c13186.f43890);
        editText5.setText(c13186.f40395);
        editText6.setText(c13186.f40386);
        editText7.setText(c13186.f43889);
        radioButton.setChecked(c13186.f43888);
        radioButton2.setChecked(!c13186.f43888);
        radioButton3.setChecked(c13186.f43893);
        radioButton4.setChecked(!c13186.f43893);
        c12562.setChecked(c13186.f40396);
        c12563.setChecked(c13186.f40397);
        c12564.setChecked(c13186.f40387);
        c12563.setOnCheckedChangeListener(new C4798(1));
        AbstractC12068.m29991(editText7, abstractActivityC12483);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ۨܶ֨
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton5 = radioButton;
                if (compoundButton == radioButton5) {
                    radioButton5 = radioButton2;
                }
                if (radioButton5.isChecked() == z) {
                    radioButton5.setChecked(!z);
                }
            }
        };
        radioButton.setOnCheckedChangeListener(onCheckedChangeListener);
        radioButton2.setOnCheckedChangeListener(onCheckedChangeListener);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = new CompoundButton.OnCheckedChangeListener() { // from class: l.ۖܶ֨
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton5 = radioButton3;
                RadioButton radioButton6 = compoundButton == radioButton5 ? radioButton4 : radioButton5;
                if (radioButton6.isChecked() == z) {
                    radioButton6.setChecked(!z);
                    boolean zIsChecked = radioButton5.isChecked();
                    EditText editText8 = editText2;
                    if (zIsChecked) {
                        if (editText8.getText().toString().equals("990")) {
                            editText8.setText("21");
                        }
                    } else if (editText8.getText().toString().equals("21")) {
                        editText8.setText("990");
                    }
                }
            }
        };
        radioButton3.setOnCheckedChangeListener(onCheckedChangeListener2);
        radioButton4.setOnCheckedChangeListener(onCheckedChangeListener2);
        AbstractC12068.m29989(editText, editText6);
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(view);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21265(false);
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        C8875.m23019(dialogInterfaceC19356M21269);
        C16737.m39290(editText);
        final C5424 c5424 = new C5424(editText, editText7, editText2, editText3, editText4, editText5, editText6, radioButton, radioButton3, c12562, c12563, c12564, c16301M38449);
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new ViewOnClickListenerC19700(c5424, c13186, dialogInterfaceC19356M21269));
        dialogInterfaceC19356M21269.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.᩹ܶ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C13186 c13187 = (C13186) c5424.get();
                if (c13187 == null) {
                    return;
                }
                AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                if (C23810.m52475(abstractActivityC12484, c13187)) {
                    new C1190(abstractActivityC12484, c13187).m10243();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13186 m32589(EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, RadioButton radioButton, RadioButton radioButton2, C12562 c12562, C12562 c12563, C12562 c12564, C16301 c16301) {
        int i;
        if (!AbstractC12068.m29997(editText) || !AbstractC12068.m29993(editText2)) {
            return null;
        }
        C13186 c13186 = new C13186(-1);
        c13186.f43891 = editText.getText().toString();
        try {
            i = Integer.parseInt(editText3.getText().toString());
        } catch (NumberFormatException unused) {
            i = 21;
        }
        c13186.f43894 = i;
        c13186.f43892 = AbstractC12068.m29988(editText4, "anonymous");
        c13186.f43890 = editText5.getText().toString();
        c13186.f40395 = editText6.getText().toString();
        c13186.f40386 = AbstractC12068.m29988(editText7, c13186.f43891);
        c13186.f43889 = AbstractC12068.m29988(editText2, a.D);
        c13186.f43888 = radioButton.isChecked();
        c13186.f43893 = radioButton2.isChecked();
        c13186.f40396 = c12562.isChecked();
        c13186.f40397 = c12563.isChecked();
        c13186.f40387 = c12564.isChecked();
        c13186.m29999(c16301);
        return c13186;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32590(C5424 c5424, C13186 c13186, DialogInterfaceC19356 dialogInterfaceC19356) {
        C13186 c13187 = (C13186) c5424.get();
        if (c13187 == null) {
            return;
        }
        if (c13186.f40385 == -1) {
            C13186 c13188 = new C13186(AbstractC12068.m29986());
            c13188.mo4702(c13187);
            C5717.m15766(c13188);
        } else {
            c13186.mo4702(c13187);
            C5717.m15760();
        }
        dialogInterfaceC19356.dismiss();
    }
}
