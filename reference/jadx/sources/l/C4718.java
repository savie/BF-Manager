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

/* JADX INFO: renamed from: l.ۙܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AGE */
/* JADX INFO: loaded from: classes3.dex */
public final class C4718 extends AbstractC12068 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public String f16650;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f16651;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f16652;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f16653;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public String f16654;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public String f16655;

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۖ */
    public final String mo4699() {
        return "FTP";
    }

    public C4718(int i) {
        super(i);
        this.f16654 = "";
        this.f16652 = 21;
        this.f16655 = "anonymous";
        this.f16650 = "";
        this.f16651 = a.D;
        this.f16653 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4718(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC12068.m29996(jSONObject, "rk", "4");
        AbstractC12068.m29996(jSONObject, "ip", "7");
        AbstractC12068.m29992(jSONObject, "hs", am.av);
        AbstractC12068.m29992(jSONObject, "mt", "b");
        this.f16654 = "";
        this.f16652 = 21;
        this.f16655 = "anonymous";
        this.f16650 = "";
        this.f16651 = a.D;
        this.f16653 = true;
        this.f16654 = jSONObject.getString("2");
        this.f16652 = jSONObject.getInt("3");
        this.f16655 = jSONObject.getString("5");
        this.f16650 = jSONObject.getString("6");
        this.f16651 = jSONObject.getString("8");
        this.f16653 = jSONObject.getBoolean("9");
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final String mo4700() {
        if (this.f16652 == 21) {
            return "ftp://" + this.f16655 + "@" + this.f16654;
        }
        return "ftp://" + this.f16655 + "@" + this.f16654 + ":" + this.f16652;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ᩹ */
    public final JSONObject mo4706() {
        JSONObject jSONObjectMo4706 = super.mo4706();
        jSONObjectMo4706.put("2", this.f16654);
        jSONObjectMo4706.put("3", this.f16652);
        jSONObjectMo4706.put("5", this.f16655);
        jSONObjectMo4706.put("6", this.f16650);
        jSONObjectMo4706.put("8", this.f16651);
        jSONObjectMo4706.put("9", this.f16653);
        return jSONObjectMo4706;
    }

    @Override // l.AbstractC12068
    public final String getName() {
        return this.f40386;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۨ */
    public final String mo4705() {
        String str = "ftp://" + this.f16655 + "@" + this.f16654;
        return str.endsWith("/") ? C20630.m46498(1, 0, str) : str;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final void mo4702(AbstractC12068 abstractC12068) {
        super.mo4702(abstractC12068);
        if (abstractC12068 instanceof C4718) {
            C4718 c4718 = (C4718) abstractC12068;
            this.f16654 = c4718.f16654;
            this.f16652 = c4718.f16652;
            this.f16655 = c4718.f16655;
            this.f16650 = c4718.f16650;
            this.f16651 = c4718.f16651;
            this.f16653 = c4718.f16653;
        }
    }

    @Override // l.AbstractC12068
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4718.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C4718 c4718 = (C4718) obj;
        return this.f16652 == c4718.f16652 && this.f16653 == c4718.f16653 && C13638.equals(this.f16654, c4718.f16654) && C13638.equals(this.f16655, c4718.f16655) && C13638.equals(this.f16650, c4718.f16650) && C13638.equals(this.f16651, c4718.f16651);
    }

    @Override // l.AbstractC12068
    public final int hashCode() {
        return C0589.m2789(C0589.m2789(C0589.m2789((C0589.m2789(super.hashCode() * 31, 31, this.f16654) + this.f16652) * 31, 31, this.f16655), 31, this.f16650), 31, this.f16651) + (this.f16653 ? 1231 : 1237);
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12233 mo4701(int i) {
        return new C16714(i, clone());
    }

    @Override // l.AbstractC12068
    public final C0690 getIcon() {
        return C0690.f2930;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۚ */
    public final String mo4704() {
        return C22697.m50267(new StringBuilder("ftp@"), this.f40386, " ");
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final void mo4703(AbstractActivityC12483 abstractActivityC12483) {
        m13078(abstractActivityC12483, this);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m13080(AbstractActivityC12483 abstractActivityC12483) {
        m13078(abstractActivityC12483, new C4718(-1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13078(final AbstractActivityC12483 abstractActivityC12483, final C4718 c4718) {
        View viewM30995;
        if (abstractActivityC12483.getResources().getBoolean(R.bool.MT_Protector)) {
            viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        } else {
            viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        }
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText4 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText5 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText7 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final RadioButton radioButton = (RadioButton) viewM30995.findViewById(R.id.MT_Protector);
        final RadioButton radioButton2 = (RadioButton) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12562 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12563 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12564 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        C16301 c16301M38449 = C16301.m38449(abstractActivityC12483, (TextView) viewM30995.findViewById(R.id.MT_Protector), c4718);
        View view = viewM30995;
        textView.setText(C16737.m39288(c4718.f40385 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" FTP"));
        editText.setText(c4718.f16654);
        editText2.setText(String.valueOf(c4718.f16652));
        editText3.setText(c4718.f16655.equals("anonymous") ? "" : c4718.f16655);
        editText4.setText(c4718.f16650);
        editText5.setText(c4718.f40395);
        editText6.setText(c4718.f40386);
        editText7.setText(c4718.f16651);
        radioButton.setChecked(c4718.f16653);
        radioButton2.setChecked(!c4718.f16653);
        c12562.setChecked(c4718.f40396);
        c12563.setChecked(c4718.f40397);
        c12564.setChecked(c4718.f40387);
        c12563.setOnCheckedChangeListener(new C4798(1));
        AbstractC12068.m29991(editText7, abstractActivityC12483);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ۧ᩺֨
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton3 = radioButton;
                if (compoundButton == radioButton3) {
                    radioButton3 = radioButton2;
                }
                if (radioButton3.isChecked() == z) {
                    radioButton3.setChecked(!z);
                }
            }
        };
        radioButton.setOnCheckedChangeListener(onCheckedChangeListener);
        radioButton2.setOnCheckedChangeListener(onCheckedChangeListener);
        view.findViewById(R.id.MT_Protector).setVisibility(8);
        AbstractC12068.m29989(editText, editText6);
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(view);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21265(false);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        C8875.m23019(dialogInterfaceC19356M21269);
        C16737.m39290(editText);
        final C23999 c23999 = new C23999(editText, editText7, editText2, editText3, editText4, editText5, editText6, radioButton, c12562, c12563, c12564, c16301M38449);
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ܳ᩺֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C4718.m13079(c23999, c4718, dialogInterfaceC19356M21269);
            }
        });
        dialogInterfaceC19356M21269.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.֫᩺֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C4718 c4719 = (C4718) c23999.get();
                if (c4719 == null) {
                    return;
                }
                AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                if (C23810.m52475(abstractActivityC12484, c4719)) {
                    new C9888(abstractActivityC12484, c4719).m10243();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4718 m13077(EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, RadioButton radioButton, C12562 c12562, C12562 c12563, C12562 c12564, C16301 c16301) {
        int i;
        if (!AbstractC12068.m29997(editText) || !AbstractC12068.m29993(editText2)) {
            return null;
        }
        C4718 c4718 = new C4718(-1);
        c4718.f16654 = editText.getText().toString();
        try {
            i = Integer.parseInt(editText3.getText().toString());
        } catch (NumberFormatException unused) {
            i = 21;
        }
        c4718.f16652 = i;
        c4718.f16655 = AbstractC12068.m29988(editText4, "anonymous");
        c4718.f16650 = editText5.getText().toString();
        c4718.f40395 = editText6.getText().toString();
        c4718.f40386 = AbstractC12068.m29988(editText7, c4718.f16654);
        c4718.f16651 = AbstractC12068.m29988(editText2, a.D);
        c4718.f16653 = radioButton.isChecked();
        c4718.f40396 = c12562.isChecked();
        c4718.f40397 = c12563.isChecked();
        c4718.f40387 = c12564.isChecked();
        c4718.m29999(c16301);
        return c4718;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13079(C23999 c23999, C4718 c4718, DialogInterfaceC19356 dialogInterfaceC19356) {
        C4718 c4719 = (C4718) c23999.get();
        if (c4719 == null) {
            return;
        }
        if (c4718.f40385 == -1) {
            C4718 c47110 = new C4718(AbstractC12068.m29986());
            c47110.mo4702(c4719);
            C5717.m15766(c47110);
        } else {
            c4718.mo4702(c4719);
            C5717.m15760();
        }
        dialogInterfaceC19356.dismiss();
    }
}
