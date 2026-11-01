package l;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.editor.TextEditorBaseMenu;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7JF */
/* JADX INFO: loaded from: classes5.dex */
public final class C17715 extends AbstractC21243 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f56242;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f56243;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f56244;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Drawable f56245;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C10946 f56246;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f56247;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f56248;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f56249;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f56250;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private synchronized C10946 m41257() {
        String stringNullable;
        C11986 c11986M40033 = C17132.m40033(this.f56250);
        if (c11986M40033 == null) {
            throw new C22356(C16737.m39264(R.string.MT_Protector, this.f56250));
        }
        if (!c11986M40033.m29822()) {
            throw new C22356(C16737.m39264(R.string.MT_Protector, c11986M40033.m29845()));
        }
        if (!c11986M40033.m29806()) {
            throw new C22356(C16737.m39264(R.string.MT_Protector, c11986M40033.m29845()));
        }
        C10946 c10946 = this.f56246;
        if (c10946 != null && c10946.f37217 == c11986M40033 && ((TextEditorBaseMenu) c10946.f37218).getContext() == c11986M40033.m29831()) {
            return this.f56246;
        }
        Class clsM29812 = this.f56247 ? c11986M40033.m29812(this.f56249) : c11986M40033.m29826(this.f56249);
        if (clsM29812 == null) {
            throw new C22356(C16737.m39264(R.string.MT_Protector, "[" + c11986M40033.m29845() + "] " + this.f56249));
        }
        try {
            TextEditorBaseMenu textEditorBaseMenu = (TextEditorBaseMenu) clsM29812.newInstance();
            textEditorBaseMenu.init(c11986M40033.m29831());
            if (textEditorBaseMenu.isEnabled()) {
                C10946 c10947 = new C10946(c11986M40033, textEditorBaseMenu);
                this.f56246 = c10947;
                return c10947;
            }
            PluginContext pluginContextM29831 = c11986M40033.m29831();
            String strName = textEditorBaseMenu.name();
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

    public C17715(String str, boolean z) {
        this.f56243 = str;
        this.f56247 = z;
        String[] strArrSplit = str.split(":", 3);
        this.f56250 = strArrSplit[1];
        this.f56249 = strArrSplit[2];
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m41262() {
        return this.f56250;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m41261() {
        return this.f56249;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m41258() {
        C11986 c11986;
        Throwable th;
        String stringNullable;
        String strM47596 = C21157.m47596();
        int iM40032 = C17132.m40032();
        if (strM47596.equals(this.f56242) && iM40032 == this.f56248) {
            return;
        }
        this.f56244 = null;
        this.f56245 = null;
        try {
            try {
                C10946 c10946M41257 = m41257();
                c11986 = (C11986) c10946M41257.f37217;
                try {
                    TextEditorBaseMenu textEditorBaseMenu = (TextEditorBaseMenu) c10946M41257.f37218;
                    PluginContext pluginContextM29831 = c11986.m29831();
                    String strName = textEditorBaseMenu.name();
                    if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C10659) pluginContextM29831).getStringNullable(strName)) != null) {
                        strName = stringNullable;
                    }
                    this.f56244 = strName;
                    this.f56245 = textEditorBaseMenu.icon();
                } catch (Throwable th2) {
                    th = th2;
                    if (this.f56244 == null) {
                        this.f56244 = th.toString();
                    }
                    if (c11986 != null) {
                        c11986.m29814(th);
                    }
                }
            } catch (Throwable th3) {
                c11986 = null;
                th = th3;
            }
        } catch (C22356 e) {
            if (this.f56244 == null) {
                this.f56244 = e.getMessage();
            }
        }
        this.f56242 = strM47596;
        this.f56248 = iM40032;
    }

    @Override // l.AbstractC21243
    /* JADX INFO: renamed from: ۙ */
    public final String mo20676() {
        return this.f56243;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m41259() {
        C11986 c11986 = null;
        try {
            C10946 c10946M41257 = m41257();
            C11986 c11987 = (C11986) c10946M41257.f37217;
            try {
                return ((TextEditorBaseMenu) c10946M41257.f37218).isEnabled();
            } catch (Throwable th) {
                th = th;
                c11986 = c11987;
                if (c11986 == null) {
                    return false;
                }
                c11986.m29814(th);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // l.AbstractC21243
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo20678(C6111 c6111, boolean z, boolean z2, int i, int i2) {
        C11986 c11986 = null;
        try {
            C10946 c10946M41257 = m41257();
            C11986 c11987 = (C11986) c10946M41257.f37217;
            try {
                TextEditorBaseMenu textEditorBaseMenu = (TextEditorBaseMenu) c10946M41257.f37218;
                if (textEditorBaseMenu.isEnabled()) {
                    return textEditorBaseMenu.checkVisible(new C5157(c6111));
                }
                return false;
            } catch (Throwable th) {
                th = th;
                c11986 = c11987;
                if (c11986 != null) {
                    c11986.m29814(th);
                }
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // l.AbstractC21243
    /* JADX INFO: renamed from: ܰ */
    public final C14894 mo20679() {
        m41258();
        return new C14894(this.f56244, this);
    }

    @Override // l.AbstractC21243
    /* JADX INFO: renamed from: ۙ */
    public final Drawable mo20675(Context context) {
        m41258();
        Drawable drawable = this.f56245;
        if (drawable != null) {
            drawable.setTintList(C20368.f65987);
        }
        return drawable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41260(View view) {
        AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) C8703.m22527(view.getContext());
        if (abstractActivityC12483 == null) {
            C15829.m37619("Cannot get the activity");
            return;
        }
        C11986 c11986 = null;
        try {
            C10946 c10946M41257 = m41257();
            C11986 c11987 = (C11986) c10946M41257.f37217;
            try {
                ((TextEditorBaseMenu) c10946M41257.f37218).onPluginButtonClick(new C2355(c11987.m29831(), abstractActivityC12483));
            } catch (Throwable th) {
                th = th;
                c11986 = c11987;
                if (c11986 != null) {
                    c11986.m29814(th);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // l.AbstractC21243
    /* JADX INFO: renamed from: ۙ */
    public final void mo20677(C6111 c6111) {
        C11986 c11986;
        AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) C8703.m22527(c6111.getContext());
        if (abstractActivityC12483 == null) {
            C15829.m37619("Cannot get the activity");
            return;
        }
        try {
            try {
                C10946 c10946M41257 = m41257();
                c11986 = (C11986) c10946M41257.f37217;
                try {
                    ((TextEditorBaseMenu) c10946M41257.f37218).onMenuClick(new C2355(c11986.m29831(), abstractActivityC12483), new C5157(c6111));
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
}
