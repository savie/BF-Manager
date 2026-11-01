package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: l.ۡۡ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: NA5M */
/* JADX INFO: loaded from: classes3.dex */
public final class C8768 extends AbstractC12068 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final C5079 f30161;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final C5079 f30162;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public String f30163;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f30164;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public String f30165;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public String f30166;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f30167;

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۖ */
    public final String mo4699() {
        return "WebDav";
    }

    public C8768(int i) {
        super(i);
        this.f30163 = "";
        this.f30165 = "";
        this.f30164 = "";
        this.f30166 = "";
        this.f30167 = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8768(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC12068.m29996(jSONObject, "rk", "2");
        AbstractC12068.m29996(jSONObject, "ip", "5");
        AbstractC12068.m29992(jSONObject, "hs", "7");
        AbstractC12068.m29992(jSONObject, "mt", "8");
        this.f30163 = "";
        this.f30165 = "";
        this.f30164 = "";
        this.f30166 = "";
        this.f30167 = false;
        this.f30163 = m22823(jSONObject.getString("1"));
        this.f30165 = jSONObject.getString("3");
        this.f30164 = jSONObject.getString("4");
        this.f30166 = jSONObject.getString("9", "");
        this.f30167 = jSONObject.getBoolean("6");
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final String mo4700() {
        if (TextUtils.isEmpty(this.f30165)) {
            return "adv:" + this.f30163;
        }
        return "adv:" + this.f30165 + "@" + this.f30163;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C5079 m22825() {
        return this.f30167 ? f30161 : f30162;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ᩹ */
    public final JSONObject mo4706() {
        JSONObject jSONObjectMo4706 = super.mo4706();
        jSONObjectMo4706.put("1", this.f30163);
        jSONObjectMo4706.put("3", this.f30165);
        jSONObjectMo4706.put("4", this.f30164);
        jSONObjectMo4706.put("6", this.f30167);
        jSONObjectMo4706.put("9", this.f30166);
        return jSONObjectMo4706;
    }

    @Override // l.AbstractC12068
    public final String getName() {
        return this.f40386;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۨ */
    public final String mo4705() {
        return this.f30163;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final void mo4702(AbstractC12068 abstractC12068) {
        super.mo4702(abstractC12068);
        if (abstractC12068 instanceof C8768) {
            C8768 c8768 = (C8768) abstractC12068;
            this.f30163 = c8768.f30163;
            this.f30165 = c8768.f30165;
            this.f30164 = c8768.f30164;
            this.f30166 = c8768.f30166;
            this.f30167 = c8768.f30167;
        }
    }

    @Override // l.AbstractC12068
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8768.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C8768 c8768 = (C8768) obj;
        return this.f30167 == c8768.f30167 && C13638.equals(this.f30163, c8768.f30163) && C13638.equals(this.f30165, c8768.f30165) && C13638.equals(this.f30164, c8768.f30164) && C13638.equals(this.f30166, c8768.f30166);
    }

    @Override // l.AbstractC12068
    public final int hashCode() {
        return C0589.m2789(C0589.m2789(C0589.m2789(C0589.m2789(super.hashCode() * 31, 31, this.f30163), 31, this.f30165), 31, this.f30164), 31, this.f30166) + (this.f30167 ? 1231 : 1237);
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12233 mo4701(int i) {
        return new C7356(i, clone());
    }

    @Override // l.AbstractC12068
    public final C0690 getIcon() {
        return C0690.f2921;
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۚ */
    public final String mo4704() {
        return C22697.m50267(new StringBuilder("webdav@"), this.f40386, " ");
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final void mo4703(AbstractActivityC12483 abstractActivityC12483) {
        m22820(abstractActivityC12483, this);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m22824(AbstractActivityC12483 abstractActivityC12483) {
        m22820(abstractActivityC12483, new C8768(-1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22820(final AbstractActivityC12483 abstractActivityC12483, C8768 c8768) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText4 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText5 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12562 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12563 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12564 = (C12562) viewM30995.findViewById(R.id.MT_Protector);
        C16301 c16301M38449 = C16301.m38449(abstractActivityC12483, (TextView) viewM30995.findViewById(R.id.MT_Protector), c8768);
        textView.setText(C16737.m39288(c8768.f40385 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" WebDav"));
        editText.setText(c8768.f30163);
        editText2.setText(c8768.f30165);
        editText3.setText(c8768.f30164);
        editText4.setText(c8768.f30166);
        editText5.setText(c8768.f40395);
        editText6.setText(c8768.f40386);
        c12562.setChecked(c8768.f30167);
        c12563.setChecked(c8768.f40396);
        c12564.setChecked(c8768.f40397);
        c12564.setOnCheckedChangeListener(new C4798(1));
        editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3934(1, editText));
        editText.addTextChangedListener(new C18645(c12562));
        AbstractC12068.m29990(editText, editText6, new C13874(2));
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21265(false);
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        C8875.m23019(dialogInterfaceC19356M21269);
        C16737.m39290(editText);
        final C21467 c21467 = new C21467(editText, editText2, editText3, editText4, editText5, editText6, c12562, c12563, c12564, c16301M38449);
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new ViewOnClickListenerC6943(c21467, c8768, dialogInterfaceC19356M21269, 1));
        dialogInterfaceC19356M21269.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.ᩳۡ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8768 c8769 = (C8768) c21467.get();
                if (c8769 == null) {
                    return;
                }
                AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                if (C23810.m52475(abstractActivityC12484, c8769)) {
                    new C8062(abstractActivityC12484, c8769).m10243();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22821(C21467 c21467, C8768 c8768, DialogInterfaceC19356 dialogInterfaceC19356) {
        C8768 c8769 = (C8768) c21467.get();
        if (c8769 == null) {
            return;
        }
        if (c8768.f40385 == -1) {
            C8768 c87610 = new C8768(AbstractC12068.m29986());
            c87610.mo4702(c8769);
            C5717.m15766(c87610);
        } else {
            c8768.mo4702(c8769);
            C5717.m15760();
        }
        dialogInterfaceC19356.dismiss();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m22823(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return "";
        }
        if (!C6851.m18466("http://", strTrim) && !C6851.m18466("https://", strTrim)) {
            strTrim = "http://" + C6851.m18465(strTrim);
        }
        return (strTrim.equalsIgnoreCase("http://") || strTrim.equalsIgnoreCase("https://")) ? "" : C6851.m18457(strTrim);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static CharSequence m22822(CharSequence charSequence) {
        int iIndexOf;
        int iIndexOf2;
        int i;
        int iIndexOf3;
        String str = ((Object) charSequence) + "/";
        String strSubstring = null;
        if (str != null && (iIndexOf2 = str.indexOf("//")) != -1 && (iIndexOf3 = str.indexOf("/", (i = iIndexOf2 + 2))) != -1) {
            strSubstring = str.substring(i, iIndexOf3);
        }
        if (strSubstring != null && (iIndexOf = strSubstring.indexOf(58)) != -1) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        return strSubstring == null ? charSequence : strSubstring;
    }

    static {
        C2256 c2256 = new C2256();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c2256.m6924(20000L, timeUnit);
        c2256.m6933(60000L, timeUnit);
        c2256.m6932(120000L, timeUnit);
        c2256.m6926(new C3168());
        c2256.m6928(new C23587());
        C5079 c5079M6922 = c2256.m6922();
        f30162 = c5079M6922;
        try {
            TrustManager[] trustManagerArr = {new C19351()};
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            C2256 c2256M14172 = c5079M6922.m14172();
            c2256M14172.m6927(new C9520(sSLContext.getSocketFactory()), (X509TrustManager) trustManagerArr[0]);
            c2256M14172.m6930(new C15118());
            f30161 = c2256M14172.m6922();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8768 m22818(EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, C12562 c12562, C12562 c12563, C12562 c12564, C16301 c16301) {
        editText.setText(m22823(editText.getText().toString()));
        if (!AbstractC12068.m29994(editText, R.string.MT_Protector)) {
            return null;
        }
        C8768 c8768 = new C8768(-1);
        c8768.f30163 = editText.getText().toString();
        c8768.f30165 = editText2.getText().toString();
        c8768.f30164 = editText3.getText().toString();
        c8768.f30166 = editText4.getText().toString();
        c8768.f40395 = editText5.getText().toString();
        c8768.f40386 = editText6.length() > 0 ? editText6.getText().toString() : m22822((CharSequence) c8768.f30163).toString();
        c8768.f30167 = c12562.isChecked();
        c8768.f40396 = c12563.isChecked();
        c8768.f40397 = c12564.isChecked();
        c8768.m29999(c16301);
        return c8768;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22819(EditText editText, boolean z) {
        if (z) {
            return;
        }
        editText.setText(m22823(editText.getText().toString()));
    }
}
