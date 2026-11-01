package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.analytics.pro.am;
import com.umeng.commonsdk.framework.UMModuleRegister;

/* JADX INFO: renamed from: l.᩹ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AFL */
/* JADX INFO: loaded from: classes.dex */
public final class C22462 extends AbstractC12068 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f73321;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f73322;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f73323;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f73324;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public String f73325;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public String f73326;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public String f73327;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public String f73328;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public String f73329;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public String f73330;

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۖ */
    public final String mo4699() {
        return "SFTP";
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo29998() {
        return true;
    }

    public C22462(int i) {
        super(i);
        this.f73329 = "";
        this.f73323 = 22;
        this.f73326 = "root";
        this.f73328 = "";
        this.f73325 = "";
        this.f73330 = "";
        this.f73321 = false;
        this.f73324 = a.D;
        this.f73322 = -1;
        this.f73327 = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22462(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC12068.m29996(jSONObject, "rk", "3");
        AbstractC12068.m29996(jSONObject, "ip", "8");
        AbstractC12068.m29992(jSONObject, "hs", am.av);
        AbstractC12068.m29992(jSONObject, "mt", "b");
        this.f73329 = "";
        this.f73323 = 22;
        this.f73326 = "root";
        this.f73328 = "";
        this.f73325 = "";
        this.f73330 = "";
        this.f73321 = false;
        this.f73324 = a.D;
        this.f73322 = -1;
        this.f73327 = "";
        this.f73329 = jSONObject.getString("1");
        this.f73323 = jSONObject.getInt("2");
        this.f73326 = jSONObject.getString("4");
        this.f73328 = jSONObject.getString("5");
        this.f73325 = jSONObject.getString("6");
        this.f73330 = jSONObject.getString(am.aF, "");
        this.f73321 = jSONObject.getBoolean("7");
        this.f73324 = jSONObject.getString("9");
        if (jSONObject.contains("e")) {
            this.f73322 = jSONObject.getInt("e");
            this.f73327 = jSONObject.getString("f", "");
        }
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final String mo4700() {
        if (this.f73323 == 22) {
            return "sftp://" + this.f73326 + "@" + this.f73329;
        }
        return "sftp://" + this.f73326 + "@" + this.f73329 + ":" + this.f73323;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ᩹ */
    public final JSONObject mo4706() {
        JSONObject jSONObjectMo4706 = super.mo4706();
        jSONObjectMo4706.put("1", this.f73329);
        jSONObjectMo4706.put("2", this.f73323);
        jSONObjectMo4706.put("4", this.f73326);
        jSONObjectMo4706.put("5", this.f73328);
        jSONObjectMo4706.put("6", this.f73325);
        jSONObjectMo4706.put(am.aF, this.f73330);
        jSONObjectMo4706.put("7", this.f73321);
        jSONObjectMo4706.put("9", this.f73324);
        int i = this.f73322;
        if (i != -1) {
            jSONObjectMo4706.put("e", i);
            jSONObjectMo4706.put("f", this.f73327);
        }
        return jSONObjectMo4706;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C21735 m49962() {
        C21735 c21735M21853 = C8351.m21853(this.f73322, this.f73327);
        int i = this.f73322;
        int i2 = c21735M21853.f40385;
        if (i != i2) {
            this.f73322 = i2;
        }
        return c21735M21853;
    }

    @Override // l.AbstractC12068
    public final String getName() {
        return this.f40386;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۨ */
    public final String mo4705() {
        String str = "sftp://" + this.f73326 + "@" + this.f73329;
        return str.endsWith("/") ? C20630.m46498(1, 0, str) : str;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final void mo4702(AbstractC12068 abstractC12068) {
        super.mo4702(abstractC12068);
        if (abstractC12068 instanceof C22462) {
            C22462 c22462 = (C22462) abstractC12068;
            this.f73329 = c22462.f73329;
            this.f73323 = c22462.f73323;
            this.f73326 = c22462.f73326;
            this.f73328 = c22462.f73328;
            this.f73325 = c22462.f73325;
            this.f73330 = c22462.f73330;
            this.f73321 = c22462.f73321;
            this.f73324 = c22462.f73324;
            this.f73322 = c22462.f73322;
            this.f73327 = c22462.f73327;
        }
    }

    @Override // l.AbstractC12068
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C22462.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C22462 c22462 = (C22462) obj;
        return this.f73323 == c22462.f73323 && this.f73321 == c22462.f73321 && C13638.equals(this.f73329, c22462.f73329) && C13638.equals(this.f73326, c22462.f73326) && C13638.equals(this.f73328, c22462.f73328) && C13638.equals(this.f73325, c22462.f73325) && C13638.equals(this.f73330, c22462.f73330) && C13638.equals(this.f73324, c22462.f73324) && Integer.valueOf(this.f73322).equals(Integer.valueOf(c22462.f73322)) && C13638.equals(this.f73327, c22462.f73327);
    }

    @Override // l.AbstractC12068
    public final int hashCode() {
        return C13638.hashCode(this.f73327) + ((C0589.m2789((C0589.m2789(C0589.m2789(C0589.m2789(C0589.m2789((C0589.m2789(super.hashCode() * 31, 31, this.f73329) + this.f73323) * 31, 31, this.f73326), 31, this.f73328), 31, this.f73325), 31, this.f73330) + (this.f73321 ? 1231 : 1237)) * 31, 31, this.f73324) + this.f73322) * 31);
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12233 mo4701(int i) {
        return new C18934(i, clone());
    }

    @Override // l.AbstractC12068
    public final C0690 getIcon() {
        return C0690.f2901;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۚ */
    public final String mo4704() {
        return C22697.m50267(new StringBuilder("sftp@"), this.f40386, " ");
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final void mo4703(AbstractActivityC12483 abstractActivityC12483) {
        m49959(abstractActivityC12483, this);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m49961(AbstractActivityC12483 abstractActivityC12483) {
        m49959(abstractActivityC12483, new C22462(-1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49959(final AbstractActivityC12483 abstractActivityC12483, final C22462 c22462) {
        C21735 c21735M15757;
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        C8330 c8330 = (C8330) viewM30995.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText4 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText5 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText7 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final EditText editText8 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText9 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12562 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12563 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12564 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12565 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        ((TextInputLayout) viewM30995.findViewById(R.id.MT_Protector)).setEndIconOnClickListener(new View.OnClickListener() { // from class: l.ۛᩳ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final EditText editText10 = editText;
                final EditText editText11 = editText2;
                final EditText editText12 = editText8;
                C4116.m11699(abstractActivityC12483, new InterfaceC17295() { // from class: l.ۗᩳ֨
                    @Override // l.InterfaceC17295
                    public final void accept(Object obj) {
                        C13290 c13290 = (C13290) obj;
                        editText10.setText(c13290.m32769());
                        editText11.setText(String.valueOf(c13290.m32770()));
                        editText12.setText(c13290.m32771());
                    }
                });
            }
        });
        int i = c22462.f73322;
        if (i != -1) {
            c21735M15757 = C5717.m15757(i);
            if (c21735M15757 == null) {
                c21735M15757 = C5717.m15773(c22462.f73327);
            }
        } else {
            c21735M15757 = null;
        }
        c8330.m21753(c21735M15757);
        c8330.setPadding(c8330.getPaddingLeft(), c8330.getPaddingTop() + C13932.m33769(6.0f), c8330.getPaddingRight(), c8330.getPaddingBottom());
        View viewFindViewById = viewM30995.findViewById(R.id.button1);
        final View viewFindViewById2 = viewM30995.findViewById(R.id.MT_Protector);
        final View viewFindViewById3 = viewM30995.findViewById(R.id.textInputLayout4);
        C16301 c16301M38449 = C16301.m38449(abstractActivityC12483, (TextView) viewM30995.findViewById(R.id.MT_Protector), c22462);
        textView.setText(C16737.m39288(c22462.f40385 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" SFTP"));
        editText.setText(c22462.f73329);
        editText2.setText(String.valueOf(c22462.f73323));
        editText3.setText(c22462.f73326);
        editText4.setText(c22462.f73328);
        editText5.setText(c22462.f73325);
        editText6.setText(c22462.f73330);
        c12563.setChecked(c22462.f40396);
        c12564.setChecked(c22462.f40397);
        c12565.setChecked(c22462.f40387);
        c12564.setOnCheckedChangeListener(new C4798(1));
        AbstractC12068.m29991(editText9, abstractActivityC12483);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ۧᩳ֨
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
        onCheckedChangeListener.onCheckedChanged(c12562, c22462.f73321);
        c12562.setChecked(c22462.f73321);
        c12562.setOnCheckedChangeListener(onCheckedChangeListener);
        editText7.setText(c22462.f40395);
        editText8.setText(c22462.f40386);
        editText9.setText(c22462.f73324);
        AbstractC12068.m29989(editText, editText8);
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21265(false);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        C8875.m23019(dialogInterfaceC19356M21269);
        if (abstractActivityC12483 instanceof Main) {
            Main main = (Main) abstractActivityC12483;
            C9186 c9186M117 = main.m117();
            C23566 c23566M129 = main.m129();
            c9186M117.m44958((InterfaceC1423) dialogInterfaceC19356M21269);
            c9186M117.mo23642((Object) null);
            c9186M117.m44959(dialogInterfaceC19356M21269, new InterfaceC10597() { // from class: l.᩻ᩳ֨
                @Override // l.InterfaceC10597
                /* JADX INFO: renamed from: ۙ */
                public final void mo1473(Object obj) {
                    String str = (String) obj;
                    if (str != null) {
                        new C4822(abstractActivityC12483, str, editText5).m10243();
                    }
                }
            });
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC13894(1, c23566M129));
        } else {
            viewFindViewById.setEnabled(false);
            viewFindViewById.setAlpha(0.0f);
        }
        C16737.m39290(editText);
        final C14680 c14680 = new C14680(editText, editText3, c12562, editText5, editText4, editText9, editText2, editText6, editText7, editText8, c8330, c12563, c12564, c12565, c16301M38449);
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.֫ᩳ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C22462.m49960(c14680, c22462, dialogInterfaceC19356M21269);
            }
        });
        dialogInterfaceC19356M21269.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.ۢᩳ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C22462 c22463 = (C22462) c14680.get();
                if (c22463 == null) {
                    return;
                }
                AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                if (C23810.m52475(abstractActivityC12484, c22463)) {
                    new C5528(abstractActivityC12484, c22463).m10243();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22462 m49958(EditText editText, EditText editText2, C12562 c12562, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, EditText editText8, EditText editText9, C8330 c8330, C12562 c12563, C12562 c12564, C12562 c12565, C16301 c16301) {
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
        if (!AbstractC12068.m29993(editText5)) {
            return null;
        }
        C22462 c22462 = new C22462(-1);
        c22462.f73329 = editText.getText().toString();
        try {
            i = Integer.parseInt(editText6.getText().toString());
        } catch (NumberFormatException unused) {
            i = 22;
        }
        c22462.f73323 = i;
        c22462.f73326 = editText2.getText().toString();
        c22462.f73328 = editText4.getText().toString();
        c22462.f73325 = editText3.getText().toString();
        c22462.f73330 = editText7.getText().toString();
        if (c22462.f73325.length() > 20480) {
            c22462.f73325 = c22462.f73325.substring(0, UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
        }
        c22462.f73321 = c12562.isChecked();
        c22462.f40395 = editText8.getText().toString();
        c22462.f40386 = AbstractC12068.m29988(editText9, c22462.f73329);
        c22462.f73324 = AbstractC12068.m29988(editText5, a.D);
        C21735 c21735M21752 = c8330.m21752();
        if (c21735M21752 != null) {
            c22462.f73322 = c21735M21752.f40385;
            c22462.f73327 = c21735M21752.mo4700();
        }
        c22462.f40396 = c12563.isChecked();
        c22462.f40397 = c12564.isChecked();
        c22462.f40387 = c12565.isChecked();
        c22462.m29999(c16301);
        return c22462;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49960(C14680 c14680, C22462 c22462, DialogInterfaceC19356 dialogInterfaceC19356) {
        C22462 c22463 = (C22462) c14680.get();
        if (c22463 == null) {
            return;
        }
        if (c22462.f40385 == -1) {
            C22462 c22464 = new C22462(AbstractC12068.m29986());
            c22464.mo4702(c22463);
            C5717.m15766(c22464);
        } else {
            c22462.mo4702(c22463);
            C5717.m15760();
        }
        dialogInterfaceC19356.dismiss();
    }
}
