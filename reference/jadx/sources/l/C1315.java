package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.֨᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: QA0A */
/* JADX INFO: loaded from: classes2.dex */
public final class C1315 extends AbstractC12068 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f5602;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f5603;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public String f5604;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public String f5605;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public String f5606;

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String mo4699() {
        return "SMB";
    }

    public C1315(int i) {
        super(i);
        this.f5606 = "";
        this.f5602 = 445;
        this.f5603 = "";
        this.f5604 = "";
        this.f5605 = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1315(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC12068.m29996(jSONObject, "rk", "7");
        AbstractC12068.m29996(jSONObject, "ip", "6");
        AbstractC12068.m29992(jSONObject, "hs", "8");
        AbstractC12068.m29992(jSONObject, "mt", "9");
        this.f5606 = "";
        this.f5602 = 445;
        this.f5603 = "";
        this.f5604 = "";
        this.f5605 = "";
        this.f5606 = jSONObject.getString("1");
        this.f5602 = jSONObject.getInt("2");
        this.f5603 = jSONObject.getString("3");
        this.f5604 = jSONObject.getString("4");
        this.f5605 = jSONObject.getString("5");
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo4700() {
        StringBuilder sb = new StringBuilder("smb://");
        sb.append(this.f5604);
        if (!TextUtils.isEmpty(this.f5603)) {
            sb.append(":");
            sb.append(this.f5603);
        }
        sb.append("@");
        sb.append(this.f5606);
        if (this.f5602 != 445) {
            sb.append(":");
            sb.append(this.f5602);
        }
        return sb.toString();
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final JSONObject mo4706() {
        JSONObject jSONObjectMo4706 = super.mo4706();
        jSONObjectMo4706.put("1", this.f5606);
        jSONObjectMo4706.put("2", this.f5602);
        jSONObjectMo4706.put("3", this.f5603);
        jSONObjectMo4706.put("4", this.f5604);
        jSONObjectMo4706.put("5", this.f5605);
        return jSONObjectMo4706;
    }

    @Override // l.AbstractC12068
    public final String getName() {
        return this.f40386;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String mo4705() {
        String str = "smb://" + this.f5604 + "@" + this.f5606;
        return str.endsWith("/") ? C20630.m46498(1, 0, str) : str;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4702(AbstractC12068 abstractC12068) {
        super.mo4702(abstractC12068);
        if (abstractC12068 instanceof C1315) {
            C1315 c1315 = (C1315) abstractC12068;
            this.f5606 = c1315.f5606;
            this.f5602 = c1315.f5602;
            this.f5603 = c1315.f5603;
            this.f5604 = c1315.f5604;
            this.f5605 = c1315.f5605;
        }
    }

    @Override // l.AbstractC12068
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1315.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C1315 c1315 = (C1315) obj;
        return this.f5602 == c1315.f5602 && C13638.equals(this.f5606, c1315.f5606) && C13638.equals(this.f5603, c1315.f5603) && C13638.equals(this.f5604, c1315.f5604) && C13638.equals(this.f5605, c1315.f5605);
    }

    @Override // l.AbstractC12068
    public final int hashCode() {
        return C13638.hashCode(this.f5605) + C0589.m2789(C0589.m2789((C0589.m2789(super.hashCode() * 31, 31, this.f5606) + this.f5602) * 31, 31, this.f5603), 31, this.f5604);
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12233 mo4701(int i) {
        return new C17543(i, clone());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19067 m4695(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return C5431.m15009().mo13095();
        }
        if (!str2.equals("guest") || !TextUtils.isEmpty(str3)) {
            C18652 c18652 = new C18652(str, str2, str3, EnumC17946.USER);
            C5431 c5431M15009 = C5431.m15009();
            c5431M15009.getClass();
            return new C11782(c5431M15009, c18652);
        }
        return C5431.m15009().m13096();
    }

    @Override // l.AbstractC12068
    public final C0690 getIcon() {
        return C0690.f2893;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String mo4704() {
        return C22697.m50267(new StringBuilder("smb@"), this.f40386, " ");
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4703(AbstractActivityC12483 abstractActivityC12483) {
        m4697(abstractActivityC12483, this);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m4698(AbstractActivityC12483 abstractActivityC12483) {
        m4697(abstractActivityC12483, new C1315(-1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4697(final AbstractActivityC12483 abstractActivityC12483, C1315 c1315) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText4 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText5 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText7 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12562 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12563 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        ((TextInputLayout) viewM30995.findViewById(R.id.MT_Protector)).setEndIconOnClickListener(new View.OnClickListener() { // from class: l.ܰ᩵֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8372.m21911(abstractActivityC12483, new C5549(editText, editText2, editText7));
            }
        });
        C16301 c16301M38449 = C16301.m38449(abstractActivityC12483, (TextView) viewM30995.findViewById(R.id.MT_Protector), c1315);
        textView.setText(C16737.m39288(c1315.f40385 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" SMB"));
        editText.setText(c1315.f5606);
        editText2.setText(String.valueOf(c1315.f5602));
        editText3.setText(c1315.f5603);
        editText4.setText(c1315.f5604);
        editText5.setText(c1315.f5605);
        editText6.setText(c1315.f40395);
        editText7.setText(c1315.f40386);
        c12562.setChecked(c1315.f40396);
        c12563.setChecked(c1315.f40397);
        c12563.setOnCheckedChangeListener(new C4798(1));
        int i = 2;
        AbstractC12068.m29990(editText, editText7, new C23710(i, editText3));
        AbstractC12068.m29990(editText3, editText7, new C17761(i, editText));
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21265(false);
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        C8875.m23019(dialogInterfaceC19356M21269);
        C16737.m39290(editText);
        final C11900 c11900 = new C11900(editText, editText2, editText3, editText4, editText5, editText6, editText7, c12562, c12563, c16301M38449);
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new ViewOnClickListenerC14204(c11900, c1315, dialogInterfaceC19356M21269, 1));
        dialogInterfaceC19356M21269.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.ۖ᩵֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1315 c1316 = (C1315) c11900.get();
                if (c1316 == null) {
                    return;
                }
                AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                if (C23810.m52475(abstractActivityC12484, c1316)) {
                    new C22483(abstractActivityC12484, c1316, editText4).m10243();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1315 m4694(EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, C12562 c12562, C12562 c12563, C16301 c16301) {
        int i;
        if (!AbstractC12068.m29997(editText)) {
            return null;
        }
        C1315 c1315 = new C1315(-1);
        c1315.f5606 = editText.getText().toString();
        try {
            i = Integer.parseInt(editText2.getText().toString());
        } catch (NumberFormatException unused) {
            i = 445;
        }
        c1315.f5602 = i;
        c1315.f5603 = editText3.getText().toString();
        c1315.f5604 = editText4.getText().toString();
        c1315.f5605 = editText5.getText().toString();
        c1315.f40395 = editText6.getText().toString();
        c1315.f40386 = AbstractC12068.m29988(editText7, TextUtils.isEmpty(c1315.f5603) ? c1315.f5606 : c1315.f5603);
        c1315.f40396 = c12562.isChecked();
        c1315.f40397 = c12563.isChecked();
        c1315.m29999(c16301);
        return c1315;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m4696(C11900 c11900, C1315 c1315, DialogInterfaceC19356 dialogInterfaceC19356) {
        C1315 c1316 = (C1315) c11900.get();
        if (c1316 == null) {
            return;
        }
        if (c1315.f40385 == -1) {
            C1315 c1317 = new C1315(AbstractC12068.m29986());
            c1317.mo4702(c1316);
            C5717.m15766(c1317);
        } else {
            c1315.mo4702(c1316);
            C5717.m15760();
        }
        dialogInterfaceC19356.dismiss();
    }
}
