package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.json.JSONObject;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.editor.TextEditorFunction;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ܰܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14671 extends C19147 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C24369 f47963 = new C24369();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2310 f47964;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f47965;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f47966;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f47967;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final JSONObject f47968;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f47969;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f47970;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f47971;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private synchronized C2310 m35297() {
        String stringNullable;
        String string = this.f47968.getString(am.av);
        String string2 = this.f47968.getString("b");
        C18300 c18300M52717 = C23522.m52717(string);
        if (c18300M52717 == null) {
            throw new C13464(C21576.m49059(R.string.MT_Protector, string));
        }
        if (!c18300M52717.m42686()) {
            throw new C13464(C21576.m49059(R.string.MT_Protector, c18300M52717.m42687()));
        }
        if (!c18300M52717.m42673()) {
            throw new C13464(C21576.m49059(R.string.MT_Protector, c18300M52717.m42687()));
        }
        C2310 c2310 = this.f47964;
        if (c2310 != null && c2310.f7473 == c18300M52717 && ((TextEditorFunction) c2310.f7474).getContext() == c18300M52717.m42678()) {
            return this.f47964;
        }
        Class clsM42679 = c18300M52717.m42679(string2);
        if (clsM42679 == null) {
            throw new C13464(C21576.m49059(R.string.MT_Protector, "[" + c18300M52717.m42687() + "] " + string2));
        }
        try {
            TextEditorFunction textEditorFunction = (TextEditorFunction) clsM42679.newInstance();
            textEditorFunction.init(c18300M52717.m42678());
            if (textEditorFunction.isEnabled()) {
                C2310 c2311 = new C2310(c18300M52717, textEditorFunction);
                this.f47964 = c2311;
                return c2311;
            }
            PluginContext pluginContextM42678 = c18300M52717.m42678();
            String strName = textEditorFunction.name();
            if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C20889) pluginContextM42678).getStringNullable(strName)) != null) {
                strName = stringNullable;
            }
            throw new C13464(C21576.m49059(R.string.MT_Protector, "[" + c18300M52717.m42687() + "] " + strName));
        } catch (Exception e) {
            if (e instanceof C13464) {
                throw ((C13464) e);
            }
            c18300M52717.m42654(e);
            throw new C13464(C21576.m49059(R.string.MT_Protector, c18300M52717.m42687()));
        }
    }

    public C14671(JSONObject jSONObject, C2310 c2310) {
        Throwable th;
        boolean zSupportRepeat;
        boolean zSupportEditTextView;
        C13464 e;
        String stringNullable;
        super(34);
        this.f47968 = jSONObject;
        this.f47964 = c2310;
        boolean z = false;
        if (c2310 == null) {
            try {
                c2310 = m35297();
            } catch (C13464 e2) {
                e = e2;
                zSupportRepeat = false;
                zSupportEditTextView = z;
                this.f47965 = e.getMessage();
                this.f47967 = "❌ " + this.f47965;
                this.f47966 = C5448.m16288();
                this.f47971 = C23522.m52716();
                this.f47969 = zSupportEditTextView;
                this.f47970 = zSupportRepeat;
            } catch (Throwable th2) {
                th = th2;
                zSupportRepeat = false;
                zSupportEditTextView = z;
                this.f47965 = th.toString();
                this.f47967 = "❌ " + this.f47965;
                this.f47966 = C5448.m16288();
                this.f47971 = C23522.m52716();
                this.f47969 = zSupportEditTextView;
                this.f47970 = zSupportRepeat;
            }
        }
        C18300 c18300 = (C18300) c2310.f7473;
        TextEditorFunction textEditorFunction = (TextEditorFunction) c2310.f7474;
        zSupportEditTextView = textEditorFunction.supportEditTextView();
        try {
            zSupportRepeat = textEditorFunction.supportRepeat();
            try {
                PluginContext pluginContextM42678 = c18300.m42678();
                String strName = textEditorFunction.name();
                if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C20889) pluginContextM42678).getStringNullable(strName)) != null) {
                    strName = stringNullable;
                }
                this.f47965 = strName;
                this.f47967 = "⚡ [" + c18300.m42687() + "] " + this.f47965;
            } catch (C13464 e3) {
                e = e3;
                this.f47965 = e.getMessage();
                this.f47967 = "❌ " + this.f47965;
            } catch (Throwable th3) {
                th = th3;
                this.f47965 = th.toString();
                this.f47967 = "❌ " + this.f47965;
            }
        } catch (C13464 e4) {
            e = e4;
            z = zSupportEditTextView;
            zSupportRepeat = false;
            zSupportEditTextView = z;
            this.f47965 = e.getMessage();
            this.f47967 = "❌ " + this.f47965;
            this.f47966 = C5448.m16288();
            this.f47971 = C23522.m52716();
            this.f47969 = zSupportEditTextView;
            this.f47970 = zSupportRepeat;
        } catch (Throwable th4) {
            th = th4;
            z = zSupportEditTextView;
            zSupportRepeat = false;
            zSupportEditTextView = z;
            this.f47965 = th.toString();
            this.f47967 = "❌ " + this.f47965;
            this.f47966 = C5448.m16288();
            this.f47971 = C23522.m52716();
            this.f47969 = zSupportEditTextView;
            this.f47970 = zSupportRepeat;
        }
        this.f47966 = C5448.m16288();
        this.f47971 = C23522.m52716();
        this.f47969 = zSupportEditTextView;
        this.f47970 = zSupportRepeat;
    }

    @Override // l.C19147
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String mo35300() {
        m35296();
        return this.f47965;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m35298() {
        m35296();
        return this.f47967;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35296() {
        String stringNullable;
        String strM16288 = C5448.m16288();
        int iM52716 = C23522.m52716();
        if (strM16288.equals(this.f47966) && iM52716 == this.f47971) {
            return;
        }
        C18300 c18300 = null;
        try {
            try {
                C2310 c2310M35297 = m35297();
                C18300 c18301 = (C18300) c2310M35297.f7473;
                try {
                    TextEditorFunction textEditorFunction = (TextEditorFunction) c2310M35297.f7474;
                    this.f47969 = textEditorFunction.supportEditTextView();
                    this.f47970 = textEditorFunction.supportRepeat();
                    PluginContext pluginContextM42678 = c18301.m42678();
                    String strName = textEditorFunction.name();
                    if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C20889) pluginContextM42678).getStringNullable(strName)) != null) {
                        strName = stringNullable;
                    }
                    this.f47965 = strName;
                    this.f47967 = "⚡ [" + c18301.m42687() + "] " + this.f47965;
                } catch (Throwable th) {
                    th = th;
                    c18300 = c18301;
                    String string = th.toString();
                    this.f47967 = string;
                    this.f47965 = string;
                    if (c18300 != null) {
                        c18300.m42654(th);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (C13464 e) {
            String message = e.getMessage();
            this.f47967 = message;
            this.f47965 = message;
        }
        this.f47966 = strM16288;
        this.f47971 = iM52716;
    }

    @Override // l.C19147
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final JSONObject mo35301() {
        return this.f47968;
    }

    @Override // l.C19147
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo35299() {
        if (this.f47971 != C23522.m52716()) {
            m35296();
        }
        return this.f47969;
    }

    @Override // l.C19147
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo11457() {
        if (this.f47971 != C23522.m52716()) {
            m35296();
        }
        return this.f47970;
    }

    @Override // l.C19147
    /* JADX INFO: renamed from: ۙ */
    public final void mo11455(View view, InterfaceC7960 interfaceC7960) {
        C18300 c18300;
        if (interfaceC7960.mo10928() == null) {
            return;
        }
        AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) C3200.m10534(view.getContext());
        if (abstractActivityC17204 == null) {
            C22673.m51160("Cannot get the activity");
            return;
        }
        try {
            try {
                C2310 c2310M35297 = m35297();
                c18300 = (C18300) c2310M35297.f7473;
                try {
                    ((TextEditorFunction) c2310M35297.f7474).doFunction(new C18365(c18300.m42678(), abstractActivityC17204), new C24703(interfaceC7960.mo10928()), this.f47968.getJSONObject(am.aF));
                } catch (Throwable th) {
                    th = th;
                    abstractActivityC17204.m40401(th, (DialogInterface.OnDismissListener) null);
                    if (c18300 != null) {
                        c18300.m42654(th);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                c18300 = null;
            }
        } catch (C13464 e) {
            C22673.m51154((CharSequence) e.getMessage());
        }
    }

    @Override // l.C19147
    /* JADX INFO: renamed from: ۙ */
    public final void mo11456(View view, C23255 c23255) {
        if (!this.f47969) {
            throw new IllegalStateException();
        }
        AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) C3200.m10534(view.getContext());
        if (abstractActivityC17204 == null) {
            C22673.m51160("Cannot get the activity");
            return;
        }
        try {
            C2310 c2310M35297 = m35297();
            ((TextEditorFunction) c2310M35297.f7474).doFunction(new C18365(((C18300) c2310M35297.f7473).m42678(), abstractActivityC17204), new C24703(c23255), this.f47968.getJSONObject(am.aF));
        } catch (C13464 e) {
            C22673.m51154((CharSequence) e.getMessage());
        } catch (Throwable th) {
            abstractActivityC17204.m40401(th, (DialogInterface.OnDismissListener) null);
        }
    }
}
