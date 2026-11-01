package l;

import android.text.TextWatcher;
import android.view.ViewParent;
import android.widget.EditText;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۫֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG9 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12068 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f40385;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f40386;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f40387;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f40388;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public HashMap f40389;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f40390;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f40391;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f40392;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f40393;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f40394;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f40395;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f40396;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f40397;

    public abstract C0690 getIcon();

    public abstract String getName();

    /* JADX INFO: renamed from: ۖ */
    public abstract String mo4699();

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo4700();

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC12233 mo4701(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo4703(AbstractActivityC12483 abstractActivityC12483);

    /* JADX INFO: renamed from: ۚ */
    public abstract String mo4704();

    /* JADX INFO: renamed from: ۨ */
    public abstract String mo4705();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean mo29998() {
        return this instanceof C4718;
    }

    public AbstractC12068(int i) {
        this.f40386 = "";
        this.f40395 = "";
        this.f40396 = false;
        this.f40397 = true;
        this.f40393 = true;
        this.f40388 = true;
        this.f40392 = true;
        this.f40394 = "10MB";
        this.f40391 = m29987("10MB");
        this.f40390 = 10;
        this.f40387 = false;
        this.f40389 = new HashMap();
        this.f40385 = i;
    }

    public AbstractC12068(JSONObject jSONObject) {
        this.f40386 = "";
        this.f40395 = "";
        this.f40396 = false;
        this.f40397 = true;
        this.f40393 = true;
        this.f40388 = true;
        this.f40392 = true;
        this.f40394 = "10MB";
        this.f40391 = m29987("10MB");
        this.f40390 = 10;
        this.f40387 = false;
        this.f40389 = new HashMap();
        this.f40385 = jSONObject.getInt("id");
        this.f40386 = jSONObject.getString("rk");
        this.f40395 = jSONObject.getString("ip");
        if (jSONObject.contains("hs")) {
            this.f40396 = jSONObject.getBoolean("hs");
        }
        if (jSONObject.contains("mt")) {
            this.f40397 = jSONObject.getBoolean("mt");
        }
        if (jSONObject.contains("fg")) {
            this.f40393 = jSONObject.getBoolean("fg");
        }
        if (jSONObject.contains("lt")) {
            this.f40388 = jSONObject.getBoolean("lt");
        }
        if (jSONObject.contains("ow")) {
            this.f40392 = jSONObject.getBoolean("ow");
        }
        if (jSONObject.contains("il")) {
            String string = jSONObject.getString("il");
            this.f40394 = string;
            this.f40391 = m29987(string);
        }
        if (jSONObject.contains("tl")) {
            this.f40390 = jSONObject.getInt("tl");
        }
        if (mo29998() && jSONObject.contains("sp")) {
            this.f40387 = jSONObject.getBoolean("sp");
        }
        if (jSONObject.contains("sm")) {
            JSONArray jSONArray = jSONObject.getJSONArray("sm");
            int size = jSONArray.size();
            for (int i = 0; i < size; i += 2) {
                this.f40389.put(jSONArray.getString(i), Integer.valueOf(jSONArray.getInt(i + 1)));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo4702(AbstractC12068 abstractC12068) {
        this.f40386 = abstractC12068.f40386;
        this.f40395 = abstractC12068.f40395;
        this.f40396 = abstractC12068.f40396;
        this.f40397 = abstractC12068.f40397;
        this.f40387 = abstractC12068.f40387;
        HashMap map = this.f40389;
        map.clear();
        map.putAll(abstractC12068.f40389);
        m29999(abstractC12068);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29999(AbstractC12068 abstractC12068) {
        this.f40393 = abstractC12068.f40393;
        this.f40388 = abstractC12068.f40388;
        this.f40392 = abstractC12068.f40392;
        String str = abstractC12068.f40394;
        this.f40394 = str;
        this.f40390 = abstractC12068.f40390;
        this.f40391 = m29987(str);
    }

    /* JADX INFO: renamed from: ᩹ */
    public JSONObject mo4706() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f40385);
        jSONObject.put("rk", this.f40386);
        jSONObject.put("ip", this.f40395);
        jSONObject.put("hs", this.f40396);
        jSONObject.put("mt", this.f40397);
        jSONObject.put("fg", this.f40393);
        jSONObject.put("lt", this.f40388);
        jSONObject.put("ow", this.f40392);
        jSONObject.put("il", this.f40394);
        jSONObject.put("tl", this.f40390);
        if (mo29998()) {
            jSONObject.put("sp", this.f40387);
        }
        HashMap map = this.f40389;
        if (!map.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : map.entrySet()) {
                jSONArray.add((String) entry.getKey());
                jSONArray.add(((Integer) entry.getValue()).intValue());
            }
            jSONObject.put("sm", jSONArray);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29988(EditText editText, String str) {
        return editText.length() > 0 ? editText.getText().toString() : str;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static int m29986() {
        return C5717.m15771();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29993(EditText editText) {
        if (editText.length() <= 0) {
            return true;
        }
        try {
            Charset.forName(editText.getText().toString());
            return true;
        } catch (Exception unused) {
            C15829.m37611(R.string.MT_Protector);
            editText.requestFocus();
            return false;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m29997(EditText editText) {
        if (!m29994(editText, R.string.MT_Protector)) {
            return false;
        }
        String string = editText.getText().toString();
        int iIndexOf = string.indexOf("://");
        if (iIndexOf != -1) {
            editText.getText().delete(0, iIndexOf + 3);
            string = editText.getText().toString();
        }
        int iIndexOf2 = string.indexOf(47, iIndexOf);
        if (iIndexOf2 <= 0) {
            return true;
        }
        m29995(editText, R.string.MT_Protector);
        editText.setSelection(iIndexOf2, editText.length());
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29994(EditText editText, int i) {
        if (editText.length() != 0) {
            return true;
        }
        m29995(editText, i);
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m29995(EditText editText, int i) {
        TextInputLayout textInputLayout;
        editText.requestFocus();
        ViewParent parent = editText.getParent();
        while (true) {
            if (parent == null) {
                textInputLayout = null;
                break;
            } else {
                if (parent instanceof TextInputLayout) {
                    textInputLayout = (TextInputLayout) parent;
                    break;
                }
                parent = parent.getParent();
            }
        }
        C13638.requireNonNull(textInputLayout);
        textInputLayout.setErrorEnabled(true);
        textInputLayout.setError(C16737.m39283(i));
        if (textInputLayout.getTag() instanceof TextWatcher) {
            return;
        }
        C17711 c17711 = new C17711(textInputLayout);
        textInputLayout.setTag(c17711);
        editText.addTextChangedListener(c17711);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29991(EditText editText, AbstractActivityC12483 abstractActivityC12483) {
        TextInputLayout textInputLayout;
        for (ViewParent parent = editText.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                textInputLayout = (TextInputLayout) parent;
                C13638.requireNonNull(textInputLayout);
                textInputLayout.setEndIconMode(-1);
                textInputLayout.setEndIconDrawable(R.drawable.MT_Protector);
                textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC0922(editText, abstractActivityC12483));
            }
        }
        textInputLayout = null;
        C13638.requireNonNull(textInputLayout);
        textInputLayout.setEndIconMode(-1);
        textInputLayout.setEndIconDrawable(R.drawable.MT_Protector);
        textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC0922(editText, abstractActivityC12483));
    }

    @Override // 
    public final AbstractC12068 clone() {
        try {
            return (AbstractC12068) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC12068 abstractC12068 = (AbstractC12068) obj;
            if (this.f40385 == abstractC12068.f40385 && C13638.equals(this.f40386, abstractC12068.f40386) && C13638.equals(this.f40395, abstractC12068.f40395) && this.f40396 == abstractC12068.f40396 && this.f40397 == abstractC12068.f40397 && this.f40387 == abstractC12068.f40387 && this.f40393 == abstractC12068.f40393 && this.f40388 == abstractC12068.f40388 && this.f40392 == abstractC12068.f40392 && this.f40391 == abstractC12068.f40391 && this.f40390 == abstractC12068.f40390) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iM2789 = (((((((((C0589.m2789(C0589.m2789(this.f40385 * 31, 31, this.f40386), 31, this.f40395) + (this.f40396 ? 1231 : 1237)) * 31) + (this.f40397 ? 1231 : 1237)) * 31) + (this.f40387 ? 1231 : 1237)) * 31) + (this.f40393 ? 1231 : 1237)) * 31) + (this.f40388 ? 1231 : 1237)) * 31;
        int i = this.f40392 ? 1231 : 1237;
        long j = this.f40391;
        return ((((iM2789 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f40390;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29989(EditText editText, EditText editText2) {
        m29990(editText, editText2, new C14554(3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m29987(String str) {
        long j;
        long j2 = str.endsWith("KB") ? ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS : 1048576L;
        try {
            j = Integer.parseInt(str.substring(0, str.length() - 2));
        } catch (NumberFormatException unused) {
            j = 10;
        }
        return j2 * j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29990(EditText editText, EditText editText2, Function function) {
        editText2.setHint(((CharSequence) function.apply(editText.getText())).toString());
        editText.addTextChangedListener(new C18417(editText2, function));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29992(JSONObject jSONObject, String str, String str2) {
        if (jSONObject.contains(str) || !jSONObject.contains(str2)) {
            return;
        }
        jSONObject.put(str, jSONObject.getBoolean(str2));
        jSONObject.remove(str2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m29996(JSONObject jSONObject, String str, String str2) {
        if (jSONObject.contains(str) || !jSONObject.contains(str2)) {
            return;
        }
        jSONObject.put(str, jSONObject.getString(str2));
        jSONObject.remove(str2);
    }
}
