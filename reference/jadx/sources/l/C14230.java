package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.json.JSONObject;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.editor.TextEditorFunction;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ܳۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14230 extends C13607 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C10702 f46622 = new C10702();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f46623;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C10946 f46624;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f46625;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f46626;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f46627;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f46628;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final JSONObject f46629;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f46630;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private synchronized C10946 m34335() {
        String stringNullable;
        String string = this.f46629.getString(am.av);
        String string2 = this.f46629.getString("b");
        C11986 c11986M40033 = C17132.m40033(string);
        if (c11986M40033 == null) {
            throw new C22356(C16737.m39264(R.string.MT_Protector, string));
        }
        if (!c11986M40033.m29822()) {
            throw new C22356(C16737.m39264(R.string.MT_Protector, c11986M40033.m29845()));
        }
        if (!c11986M40033.m29806()) {
            throw new C22356(C16737.m39264(R.string.MT_Protector, c11986M40033.m29845()));
        }
        C10946 c10946 = this.f46624;
        if (c10946 != null && c10946.f37217 == c11986M40033 && ((TextEditorFunction) c10946.f37218).getContext() == c11986M40033.m29831()) {
            return this.f46624;
        }
        Class clsM29832 = c11986M40033.m29832(string2);
        if (clsM29832 == null) {
            throw new C22356(C16737.m39264(R.string.MT_Protector, "[" + c11986M40033.m29845() + "] " + string2));
        }
        try {
            TextEditorFunction textEditorFunction = (TextEditorFunction) clsM29832.newInstance();
            textEditorFunction.init(c11986M40033.m29831());
            if (textEditorFunction.isEnabled()) {
                C10946 c10947 = new C10946(c11986M40033, textEditorFunction);
                this.f46624 = c10947;
                return c10947;
            }
            PluginContext pluginContextM29831 = c11986M40033.m29831();
            String strName = textEditorFunction.name();
            if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C10659) pluginContextM29831).getStringNullable(strName)) != null) {
                strName = stringNullable;
            }
            throw new C22356(C16737.m39264(R.string.MT_Protector, "[" + c11986M40033.m29845() + "] " + strName));
        } catch (Exception e) {
            if (e instanceof C22356) {
                throw ((C22356) e);
            }
            c11986M40033.m29814(e);
            throw new C22356(C16737.m39264(R.string.MT_Protector, c11986M40033.m29845()));
        }
    }

    public C14230(JSONObject jSONObject, C10946 c10946) {
        Throwable th;
        boolean zSupportRepeat;
        boolean zSupportEditTextView;
        C22356 e;
        String stringNullable;
        super(34);
        this.f46629 = jSONObject;
        this.f46624 = c10946;
        boolean z = false;
        if (c10946 == null) {
            try {
                c10946 = m34335();
            } catch (C22356 e2) {
                e = e2;
                zSupportRepeat = false;
                zSupportEditTextView = z;
                this.f46626 = e.getMessage();
                this.f46623 = "❌ " + this.f46626;
                this.f46625 = C21157.m47596();
                this.f46630 = C17132.m40032();
                this.f46627 = zSupportEditTextView;
                this.f46628 = zSupportRepeat;
            } catch (Throwable th2) {
                th = th2;
                zSupportRepeat = false;
                zSupportEditTextView = z;
                this.f46626 = th.toString();
                this.f46623 = "❌ " + this.f46626;
                this.f46625 = C21157.m47596();
                this.f46630 = C17132.m40032();
                this.f46627 = zSupportEditTextView;
                this.f46628 = zSupportRepeat;
            }
        }
        C11986 c11986 = (C11986) c10946.f37217;
        TextEditorFunction textEditorFunction = (TextEditorFunction) c10946.f37218;
        zSupportEditTextView = textEditorFunction.supportEditTextView();
        try {
            zSupportRepeat = textEditorFunction.supportRepeat();
            try {
                PluginContext pluginContextM29831 = c11986.m29831();
                String strName = textEditorFunction.name();
                if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C10659) pluginContextM29831).getStringNullable(strName)) != null) {
                    strName = stringNullable;
                }
                this.f46626 = strName;
                this.f46623 = "⚡ [" + c11986.m29845() + "] " + this.f46626;
            } catch (C22356 e3) {
                e = e3;
                this.f46626 = e.getMessage();
                this.f46623 = "❌ " + this.f46626;
            } catch (Throwable th3) {
                th = th3;
                this.f46626 = th.toString();
                this.f46623 = "❌ " + this.f46626;
            }
        } catch (C22356 e4) {
            e = e4;
            z = zSupportEditTextView;
            zSupportRepeat = false;
            zSupportEditTextView = z;
            this.f46626 = e.getMessage();
            this.f46623 = "❌ " + this.f46626;
            this.f46625 = C21157.m47596();
            this.f46630 = C17132.m40032();
            this.f46627 = zSupportEditTextView;
            this.f46628 = zSupportRepeat;
        } catch (Throwable th4) {
            th = th4;
            z = zSupportEditTextView;
            zSupportRepeat = false;
            zSupportEditTextView = z;
            this.f46626 = th.toString();
            this.f46623 = "❌ " + this.f46626;
            this.f46625 = C21157.m47596();
            this.f46630 = C17132.m40032();
            this.f46627 = zSupportEditTextView;
            this.f46628 = zSupportRepeat;
        }
        this.f46625 = C21157.m47596();
        this.f46630 = C17132.m40032();
        this.f46627 = zSupportEditTextView;
        this.f46628 = zSupportRepeat;
    }

    @Override // l.C13607
    /* JADX INFO: renamed from: ܰ */
    public final String mo33252() {
        m34334();
        return this.f46626;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m34336() {
        m34334();
        return this.f46623;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m34334() {
        String stringNullable;
        String strM47596 = C21157.m47596();
        int iM40032 = C17132.m40032();
        if (strM47596.equals(this.f46625) && iM40032 == this.f46630) {
            return;
        }
        C11986 c11986 = null;
        try {
            try {
                C10946 c10946M34335 = m34335();
                C11986 c11987 = (C11986) c10946M34335.f37217;
                try {
                    TextEditorFunction textEditorFunction = (TextEditorFunction) c10946M34335.f37218;
                    this.f46627 = textEditorFunction.supportEditTextView();
                    this.f46628 = textEditorFunction.supportRepeat();
                    PluginContext pluginContextM29831 = c11987.m29831();
                    String strName = textEditorFunction.name();
                    if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C10659) pluginContextM29831).getStringNullable(strName)) != null) {
                        strName = stringNullable;
                    }
                    this.f46626 = strName;
                    this.f46623 = "⚡ [" + c11987.m29845() + "] " + this.f46626;
                } catch (Throwable th) {
                    th = th;
                    c11986 = c11987;
                    String string = th.toString();
                    this.f46623 = string;
                    this.f46626 = string;
                    if (c11986 != null) {
                        c11986.m29814(th);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (C22356 e) {
            String message = e.getMessage();
            this.f46623 = message;
            this.f46626 = message;
        }
        this.f46625 = strM47596;
        this.f46630 = iM40032;
    }

    @Override // l.C13607
    /* JADX INFO: renamed from: ۖ */
    public final JSONObject mo33245() {
        return this.f46629;
    }

    @Override // l.C13607
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo33253() {
        if (this.f46630 != C17132.m40032()) {
            m34334();
        }
        return this.f46627;
    }

    @Override // l.C13607
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo33244() {
        if (this.f46630 != C17132.m40032()) {
            m34334();
        }
        return this.f46628;
    }

    @Override // l.C13607
    /* JADX INFO: renamed from: ۙ */
    public final void mo33247(View view, InterfaceC4433 interfaceC4433) {
        C11986 c11986;
        if (interfaceC4433.mo11315() == null) {
            return;
        }
        AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) C8703.m22527(view.getContext());
        if (abstractActivityC12483 == null) {
            C15829.m37619("Cannot get the activity");
            return;
        }
        try {
            try {
                C10946 c10946M34335 = m34335();
                c11986 = (C11986) c10946M34335.f37217;
                try {
                    ((TextEditorFunction) c10946M34335.f37218).doFunction(new C2355(c11986.m29831(), abstractActivityC12483), new C5157(interfaceC4433.mo11315()), this.f46629.getJSONObject(am.aF));
                } catch (Throwable th) {
                    th = th;
                    abstractActivityC12483.m31002(th, (DialogInterface.OnDismissListener) null);
                    if (c11986 != null) {
                        c11986.m29814(th);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                c11986 = null;
            }
        } catch (C22356 e) {
            C15829.m37613((CharSequence) e.getMessage());
        }
    }

    @Override // l.C13607
    /* JADX INFO: renamed from: ۙ */
    public final void mo33248(View view, C10948 c10948) {
        if (!this.f46627) {
            throw new IllegalStateException();
        }
        AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) C8703.m22527(view.getContext());
        if (abstractActivityC12483 == null) {
            C15829.m37619("Cannot get the activity");
            return;
        }
        try {
            C10946 c10946M34335 = m34335();
            ((TextEditorFunction) c10946M34335.f37218).doFunction(new C2355(((C11986) c10946M34335.f37217).m29831(), abstractActivityC12483), new C5157(c10948), this.f46629.getJSONObject(am.aF));
        } catch (C22356 e) {
            C15829.m37613((CharSequence) e.getMessage());
        } catch (Throwable th) {
            abstractActivityC12483.m31002(th, (DialogInterface.OnDismissListener) null);
        }
    }
}
