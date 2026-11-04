package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: l.ۛᩳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: NA5M */
/* JADX INFO: loaded from: classes3.dex */
public final class C6574 extends AbstractC0148 {

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final C24363 f22047;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final C24363 f22048;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f22049;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public String f22050;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public String f22051;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f22052;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public String f22053;

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۤ */
    public final String mo1330() {
        return "WebDav";
    }

    public C6574(int i) {
        super(i);
        this.f22053 = "";
        this.f22051 = "";
        this.f22049 = "";
        this.f22050 = "";
        this.f22052 = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6574(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC0148.m1322(jSONObject, "rk", "2");
        AbstractC0148.m1322(jSONObject, "ip", "5");
        AbstractC0148.m1316(jSONObject, "hs", "7");
        AbstractC0148.m1316(jSONObject, "mt", "8");
        this.f22053 = "";
        this.f22051 = "";
        this.f22049 = "";
        this.f22050 = "";
        this.f22052 = false;
        this.f22053 = m18494(jSONObject.getString("1"));
        this.f22051 = jSONObject.getString("3");
        this.f22049 = jSONObject.getString("4");
        this.f22050 = jSONObject.getString("9", "");
        this.f22052 = jSONObject.getBoolean("6");
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final String mo1325() {
        if (TextUtils.isEmpty(this.f22051)) {
            return "adv:" + this.f22053;
        }
        return "adv:" + this.f22051 + "@" + this.f22053;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C24363 m18496() {
        return this.f22052 ? f22047 : f22048;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ܳ */
    public final JSONObject mo1331() {
        JSONObject jSONObjectMo1331 = super.mo1331();
        jSONObjectMo1331.put("1", this.f22053);
        jSONObjectMo1331.put("3", this.f22051);
        jSONObjectMo1331.put("4", this.f22049);
        jSONObjectMo1331.put("6", this.f22052);
        jSONObjectMo1331.put("9", this.f22050);
        return jSONObjectMo1331;
    }

    @Override // l.AbstractC0148
    public final String getName() {
        return this.f1122;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1333() {
        return this.f22053;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final void mo1327(AbstractC0148 abstractC0148) {
        super.mo1327(abstractC0148);
        if (abstractC0148 instanceof C6574) {
            C6574 c6574 = (C6574) abstractC0148;
            this.f22053 = c6574.f22053;
            this.f22051 = c6574.f22051;
            this.f22049 = c6574.f22049;
            this.f22050 = c6574.f22050;
            this.f22052 = c6574.f22052;
        }
    }

    @Override // l.AbstractC0148
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6574.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C6574 c6574 = (C6574) obj;
        return this.f22052 == c6574.f22052 && C17359.equals(this.f22053, c6574.f22053) && C17359.equals(this.f22051, c6574.f22051) && C17359.equals(this.f22049, c6574.f22049) && C17359.equals(this.f22050, c6574.f22050);
    }

    @Override // l.AbstractC0148
    public final int hashCode() {
        return C24966.m55771(C24966.m55771(C24966.m55771(C24966.m55771(super.hashCode() * 31, 31, this.f22053), 31, this.f22051), 31, this.f22049), 31, this.f22050) + (this.f22052 ? 1231 : 1237);
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18881 mo1326(int i) {
        return new C14776(i, clone());
    }

    @Override // l.AbstractC0148
    public final C20613 getIcon() {
        return C20613.f66071;
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ᩴ */
    public final String mo1332() {
        return C8947.m23910(new StringBuilder("webdav@"), this.f1122, " ");
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final void mo1328(AbstractActivityC17204 abstractActivityC17204) {
        m18490(abstractActivityC17204, this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m18495(AbstractActivityC17204 abstractActivityC17204) {
        m18490(abstractActivityC17204, new C6574(-1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18490(final AbstractActivityC17204 abstractActivityC17204, final C6574 c6574) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        TextView textView = (TextView) viewM40395.findViewById(R.id.title);
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23256 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23257 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23258 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c23259 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C23255 c232510 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1255 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1256 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1257 = (C1255) viewM40395.findViewById(R.id.MT_Protector);
        C18047 c18047M42053 = C18047.m42053(abstractActivityC17204, (TextView) viewM40395.findViewById(R.id.MT_Protector), c6574);
        textView.setText(C21576.m49088(c6574.f1127 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" WebDav"));
        c23255.mo52335((CharSequence) c6574.f22053);
        c23256.mo52335((CharSequence) c6574.f22051);
        c23257.mo52335((CharSequence) c6574.f22049);
        c23258.mo52335((CharSequence) c6574.f22050);
        c23259.mo52335((CharSequence) c6574.f1128);
        c232510.mo52335((CharSequence) c6574.f1122);
        c1255.setChecked(c6574.f22052);
        c1256.setChecked(c6574.f1129);
        c1257.setChecked(c6574.f1123);
        c1257.setOnCheckedChangeListener(new C16555());
        c23255.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.ܺᩳ۫
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                C6574.m18492(c23255, z);
            }
        });
        c23255.m53899(new C3590(c1255));
        AbstractC0148.m1319(c23255, c232510, new C8110(3));
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8012(false);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        C21232.m48398(dialogInterfaceC8327M8016);
        C21576.m49090(c23255);
        final C17760 c17760 = new C17760(c23255, c23256, c23257, c23258, c23259, c232510, c1255, c1256, c1257, c18047M42053);
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ܶᩳ۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6574.m18491(c17760, c6574, dialogInterfaceC8327M8016);
            }
        });
        dialogInterfaceC8327M8016.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.᩹ᩳ۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6574 c6575 = (C6574) c17760.get();
                if (c6575 == null) {
                    return;
                }
                AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                if (C9646.m25162(abstractActivityC17205, c6575)) {
                    new C20744(abstractActivityC17205, c6575).m8197();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18491(C17760 c17760, C6574 c6574, DialogInterfaceC8327 dialogInterfaceC8327) {
        C6574 c6575 = (C6574) c17760.get();
        if (c6575 == null) {
            return;
        }
        if (c6574.f1127 == -1) {
            C6574 c6576 = new C6574(AbstractC0148.m1313());
            c6576.mo1327(c6575);
            C7606.m20787(c6576);
        } else {
            c6574.mo1327(c6575);
            C7606.m20783();
        }
        dialogInterfaceC8327.dismiss();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m18494(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return "";
        }
        int i = C24276.f78588;
        AbstractC21292 abstractC21292 = AbstractC21292.f67895;
        if (!abstractC21292.m48533("http://", strTrim) && !abstractC21292.m48533("https://", strTrim)) {
            strTrim = "https://" + C24276.m54288(strTrim);
        }
        return (strTrim.equalsIgnoreCase("http://") || strTrim.equalsIgnoreCase("https://")) ? "" : C24276.m54284(strTrim);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static CharSequence m18493(CharSequence charSequence) {
        int iIndexOf;
        int iIndexOf2;
        int i;
        int iIndexOf3;
        String str = ((Object) charSequence) + "/";
        int i2 = C24276.f78588;
        String strSubstring = null;
        if (C23654.of(str, "//", "/").noneMatch(new C20954(3)) && (iIndexOf2 = str.indexOf("//")) != -1 && (iIndexOf3 = str.indexOf("/", (i = iIndexOf2 + 2))) != -1) {
            strSubstring = str.substring(i, iIndexOf3);
        }
        if (strSubstring != null && (iIndexOf = strSubstring.indexOf(58)) != -1) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        return strSubstring == null ? charSequence : strSubstring;
    }

    static {
        C6463 c6463 = new C6463();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c6463.m18267(20000L, timeUnit);
        c6463.m18278(60000L, timeUnit);
        c6463.m18276(120000L, timeUnit);
        c6463.m18269(new C17408());
        c6463.m18273(new C12970());
        C24363 c24363M18265 = c6463.m18265();
        f22048 = c24363M18265;
        try {
            TrustManager[] trustManagerArr = {new C12539()};
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            C6463 c6463M54459 = c24363M18265.m54459();
            c6463M54459.m18270(new C16662(sSLContext.getSocketFactory()), (X509TrustManager) trustManagerArr[0]);
            c6463M54459.m18274(new C25220());
            f22047 = c6463M54459.m18265();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6574 m18489(C23255 c23255, C23255 c23256, C23255 c23257, C23255 c23258, C23255 c23259, C23255 c232510, C1255 c1255, C1255 c1256, C1255 c1257, C18047 c18047) {
        c23255.mo52335((CharSequence) m18494(c23255.m54021().toString()));
        if (!AbstractC0148.m1321(c23255, R.string.MT_Protector)) {
            return null;
        }
        C6574 c6574 = new C6574(-1);
        c6574.f22053 = c23255.m54021().toString();
        c6574.f22051 = c23256.m54021().toString();
        c6574.f22049 = c23257.m54021().toString();
        c6574.f22050 = c23258.m54021().toString();
        c6574.f1128 = c23259.m54021().toString();
        c6574.f1122 = c232510.m54099() > 0 ? c232510.m54021().toString() : m18493((CharSequence) c6574.f22053).toString();
        c6574.f22052 = c1255.isChecked();
        c6574.f1129 = c1256.isChecked();
        c6574.f1123 = c1257.isChecked();
        c6574.m1334(c18047);
        return c6574;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18492(C23255 c23255, boolean z) {
        if (z) {
            return;
        }
        c23255.mo52335((CharSequence) m18494(c23255.m54021().toString()));
    }
}
