package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ܿ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: V89B */
/* JADX INFO: loaded from: classes5.dex */
public final class C17606 extends AbstractC12068 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f55947;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public String f55948;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f55949;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f55950;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public String f55951;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public String f55952;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public String f55953;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17606(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC12068.m29996(jSONObject, "rk", "6");
        AbstractC12068.m29996(jSONObject, "ip", "7");
        AbstractC12068.m29992(jSONObject, "hs", "8");
        this.f55947 = jSONObject.getInt("1", 0);
        this.f55949 = jSONObject.getString("2");
        this.f55953 = jSONObject.getString("3");
        this.f55948 = jSONObject.getString("4");
        this.f55952 = jSONObject.getString("5");
        this.f55951 = jSONObject.getString("9", "");
        this.f55950 = jSONObject.getBoolean(am.av, false);
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final String mo4700() {
        return AbstractC9141.m23469(this.f55947).mo11852() + "://" + this.f55948 + ":" + this.f55952;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ᩹ */
    public final JSONObject mo4706() {
        JSONObject jSONObjectMo4706 = super.mo4706();
        jSONObjectMo4706.put("1", this.f55947);
        jSONObjectMo4706.put("2", this.f55949);
        jSONObjectMo4706.put("3", this.f55953);
        jSONObjectMo4706.put("4", this.f55948);
        jSONObjectMo4706.put("5", this.f55952);
        jSONObjectMo4706.put("9", this.f55951);
        jSONObjectMo4706.put(am.av, this.f55950);
        return jSONObjectMo4706;
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
    /* JADX INFO: renamed from: ۨ */
    public final String mo4705() {
        return AbstractC9141.m23469(this.f55947).mo11852() + "://" + this.f55952;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final void mo4702(AbstractC12068 abstractC12068) {
        super.mo4702(abstractC12068);
        if (abstractC12068 instanceof C17606) {
            C17606 c17606 = (C17606) abstractC12068;
            this.f55947 = c17606.f55947;
            this.f55949 = c17606.f55949;
            this.f55953 = c17606.f55953;
            this.f55948 = c17606.f55948;
            this.f55952 = c17606.f55952;
            this.f55951 = c17606.f55951;
            this.f55950 = c17606.f55950;
        }
    }

    @Override // l.AbstractC12068
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17606.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C17606 c17606 = (C17606) obj;
        return this.f55947 == c17606.f55947 && C13638.equals(this.f55949, c17606.f55949) && C13638.equals(this.f55953, c17606.f55953) && C13638.equals(this.f55948, c17606.f55948) && C13638.equals(this.f55952, c17606.f55952) && C13638.equals(this.f55951, c17606.f55951) && Boolean.valueOf(this.f55950).equals(Boolean.valueOf(c17606.f55950));
    }

    @Override // l.AbstractC12068
    public final int hashCode() {
        return Boolean.valueOf(this.f55950).hashCode() + C0589.m2789(C0589.m2789(C0589.m2789(C0589.m2789(C0589.m2789(((super.hashCode() * 31) + this.f55947) * 31, 31, this.f55949), 31, this.f55953), 31, this.f55948), 31, this.f55952), 31, this.f55951);
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12233 mo4701(int i) {
        return new C3494(i, clone());
    }

    @Override // l.AbstractC12068
    public final C0690 getIcon() {
        return C0690.f2875;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۚ */
    public final String mo4704() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9141.m23469(this.f55947).mo11852());
        sb.append("@");
        return C22697.m50267(sb, this.f40386, " ");
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final void mo4703(AbstractActivityC12483 abstractActivityC12483) {
        m40928(abstractActivityC12483, this);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m40931(AbstractActivityC12483 abstractActivityC12483) {
        m40928(abstractActivityC12483, new C17606(-1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40928(final AbstractActivityC12483 abstractActivityC12483, C17606 c17606) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText4 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText5 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText7 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12562 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12563 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12564 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        C16301 c16301M38449 = C16301.m38449(abstractActivityC12483, (TextView) viewM30995.findViewById(R.id.MT_Protector), c17606);
        ((TextInputLayout) viewM30995.findViewById(R.id.MT_Protector)).setEndIconOnClickListener(new ViewOnClickListenerC23346(3, abstractActivityC12483));
        StringBuilder sb = new StringBuilder();
        sb.append(C16737.m39288(c17606.f40385 == -1 ? R.string.MT_Protector : R.string.MT_Protector));
        sb.append(" ");
        sb.append(C16737.m39288(R.string.MT_Protector));
        textView.setText(sb.toString());
        editText3.setText(c17606.f55952);
        editText4.setText(c17606.f55948);
        editText5.setText(c17606.f55951);
        editText.setText(c17606.f55949);
        editText2.setText(c17606.f55953);
        editText6.setText(c17606.f40395);
        editText7.setText(c17606.f40386);
        c12563.setChecked(c17606.f40396);
        c12564.setChecked(c17606.f40397);
        c12562.setChecked(c17606.f55950);
        c12564.setOnCheckedChangeListener(new C4798(1));
        AbstractC12068.m29989(editText3, editText7);
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC2702(3, abstractActivityC12483));
        final C21134 c21134 = new C21134(c12562, autoCompleteTextView, (TextInputLayout) viewM30995.findViewById(R.id.MT_Protector), (TextInputLayout) viewM30995.findViewById(R.id.MT_Protector), (TextInputLayout) viewM30995.findViewById(R.id.MT_Protector), abstractActivityC12483, editText, editText2, editText3, editText4, editText7);
        final AbstractC9141[] abstractC9141Arr = {C19724.f63298, C21840.f70901, C13374.f44305, C15491.f50468, C4200.f15260, C8435.f29289};
        autoCompleteTextView.setAdapter(new C0733(abstractActivityC12483, abstractC9141Arr));
        AbstractC9141 abstractC9141M23469 = AbstractC9141.m23469(c17606.f55947);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ܺ᩸֨
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                c21134.accept(abstractC9141Arr[i]);
            }
        });
        autoCompleteTextView.setText((CharSequence) abstractC9141M23469.mo11853(), false);
        autoCompleteTextView.setKeyListener(null);
        c21134.accept(abstractC9141M23469);
        autoCompleteTextView.setPadding(autoCompleteTextView.getPaddingLeft(), autoCompleteTextView.getPaddingTop() + C13932.m33769(6.0f), autoCompleteTextView.getPaddingRight(), autoCompleteTextView.getPaddingBottom());
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21265(false);
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        C8875.m23019(dialogInterfaceC19356M21269);
        C16737.m39290(editText);
        final C20429 c20429 = new C20429(editText3, editText4, editText, editText2, autoCompleteTextView, editText5, editText6, editText7, c12563, c12564, c12562, c16301M38449);
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new ViewOnClickListenerC23278(c20429, c17606, dialogInterfaceC19356M21269, 1));
        dialogInterfaceC19356M21269.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.֡᩸֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C17606 c17607 = (C17606) c20429.get();
                if (c17607 == null) {
                    return;
                }
                AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                if (C23810.m52475(abstractActivityC12484, c17607)) {
                    new C12668(abstractActivityC12484, c17607).m10243();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C17606 m40930(EditText editText, EditText editText2, EditText editText3, EditText editText4, AutoCompleteTextView autoCompleteTextView, EditText editText5, EditText editText6, EditText editText7, C12562 c12562, C12562 c12563, C12562 c12564, C16301 c16301) {
        if (!AbstractC12068.m29994(editText, R.string.MT_Protector) || !AbstractC12068.m29994(editText2, R.string.MT_Protector) || !AbstractC12068.m29994(editText3, R.string.MT_Protector) || !AbstractC12068.m29994(editText4, R.string.MT_Protector)) {
            return null;
        }
        C17606 c17606 = new C17606(-1);
        c17606.f55947 = ((AbstractC9141) autoCompleteTextView.getTag()).mo11849();
        c17606.f55952 = editText.getText().toString();
        c17606.f55948 = editText2.getText().toString();
        c17606.f55951 = editText5.getText().toString();
        c17606.f55949 = editText3.getText().toString();
        c17606.f55953 = editText4.getText().toString();
        c17606.f40395 = editText6.getText().toString();
        c17606.f40386 = AbstractC12068.m29988(editText7, c17606.f55952);
        c17606.f40396 = c12562.isChecked();
        c17606.f40397 = c12563.isChecked();
        c17606.f55950 = c12564.getVisibility() == 0 && c12564.isChecked();
        c17606.m29999(c16301);
        return c17606;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40929(C20429 c20429, C17606 c17606, DialogInterfaceC19356 dialogInterfaceC19356) {
        C17606 c17607 = (C17606) c20429.get();
        if (c17607 == null) {
            return;
        }
        if (c17606.f40385 == -1) {
            C17606 c17608 = new C17606(AbstractC12068.m29986());
            c17608.mo4702(c17607);
            C5717.m15766(c17608);
        } else {
            c17606.mo4702(c17607);
            C5717.m15760();
        }
        dialogInterfaceC19356.dismiss();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m40926(String str, ClientConfiguration clientConfiguration) {
        if (str.toLowerCase().startsWith("https://")) {
            clientConfiguration.m171(Protocol.HTTPS);
            str = str.substring(8);
        } else if (str.toLowerCase().startsWith("http://")) {
            clientConfiguration.m171(Protocol.HTTP);
            str = str.substring(7);
        } else {
            clientConfiguration.m171(Protocol.HTTPS);
        }
        return str.endsWith("/") ? C20630.m46498(1, 0, str) : str;
    }
}
