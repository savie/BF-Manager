package l;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.editor.TextEditorBaseMenu;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7JF */
/* JADX INFO: loaded from: classes5.dex */
public final class C19500 extends AbstractC22484 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f62941;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Drawable f62942;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f62943;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f62944;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f62945;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f62946;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C2310 f62947;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f62948;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f62949;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized C2310 m45018() {
        String stringNullable;
        C18300 c18300M52717 = C23522.m52717(this.f62946);
        if (c18300M52717 == null) {
            throw new C13464(C21576.m49059(R.string.MT_Protector, this.f62946));
        }
        if (!c18300M52717.m42686()) {
            throw new C13464(C21576.m49059(R.string.MT_Protector, c18300M52717.m42687()));
        }
        if (!c18300M52717.m42673()) {
            throw new C13464(C21576.m49059(R.string.MT_Protector, c18300M52717.m42687()));
        }
        C2310 c2310 = this.f62947;
        if (c2310 != null && c2310.f7473 == c18300M52717 && ((TextEditorBaseMenu) c2310.f7474).getContext() == c18300M52717.m42678()) {
            return this.f62947;
        }
        Class clsM42652 = this.f62944 ? c18300M52717.m42652(this.f62948) : c18300M52717.m42662(this.f62948);
        if (clsM42652 == null) {
            throw new C13464(C21576.m49059(R.string.MT_Protector, "[" + c18300M52717.m42687() + "] " + this.f62948));
        }
        try {
            TextEditorBaseMenu textEditorBaseMenu = (TextEditorBaseMenu) clsM42652.newInstance();
            textEditorBaseMenu.init(c18300M52717.m42678());
            if (textEditorBaseMenu.isEnabled()) {
                C2310 c2311 = new C2310(c18300M52717, textEditorBaseMenu);
                this.f62947 = c2311;
                return c2311;
            }
            PluginContext pluginContextM42678 = c18300M52717.m42678();
            String strName = textEditorBaseMenu.name();
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

    public C19500(String str, boolean z) {
        this.f62949 = str;
        this.f62944 = z;
        String[] strArrSplit = str.split(":", 3);
        this.f62946 = strArrSplit[1];
        this.f62948 = strArrSplit[2];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m45022() {
        return this.f62946;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m45023() {
        return this.f62948;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m45019() {
        C18300 c18300;
        Throwable th;
        String stringNullable;
        String strM16288 = C5448.m16288();
        int iM52716 = C23522.m52716();
        if (strM16288.equals(this.f62945) && iM52716 == this.f62943) {
            return;
        }
        this.f62941 = null;
        this.f62942 = null;
        try {
            try {
                C2310 c2310M45018 = m45018();
                c18300 = (C18300) c2310M45018.f7473;
                try {
                    TextEditorBaseMenu textEditorBaseMenu = (TextEditorBaseMenu) c2310M45018.f7474;
                    PluginContext pluginContextM42678 = c18300.m42678();
                    String strName = textEditorBaseMenu.name();
                    if (strName.length() >= 3 && strName.charAt(0) == '{' && strName.charAt(strName.length() - 1) == '}' && (stringNullable = ((C20889) pluginContextM42678).getStringNullable(strName)) != null) {
                        strName = stringNullable;
                    }
                    this.f62941 = strName;
                    this.f62942 = textEditorBaseMenu.icon();
                } catch (Throwable th2) {
                    th = th2;
                    if (this.f62941 == null) {
                        this.f62941 = th.toString();
                    }
                    if (c18300 != null) {
                        c18300.m42654(th);
                    }
                }
            } catch (Throwable th3) {
                c18300 = null;
                th = th3;
            }
        } catch (C13464 e) {
            if (this.f62941 == null) {
                this.f62941 = e.getMessage();
            }
        }
        this.f62945 = strM16288;
        this.f62943 = iM52716;
    }

    @Override // l.AbstractC22484
    /* JADX INFO: renamed from: ۙ */
    public final String mo31674() {
        return this.f62949;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m45021() {
        C18300 c18300 = null;
        try {
            C2310 c2310M45018 = m45018();
            C18300 c18301 = (C18300) c2310M45018.f7473;
            try {
                return ((TextEditorBaseMenu) c2310M45018.f7474).isEnabled();
            } catch (Throwable th) {
                th = th;
                c18300 = c18301;
                if (c18300 == null) {
                    return false;
                }
                c18300.m42654(th);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // l.AbstractC22484
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo30572(C24132 c24132, boolean z, boolean z2, int i, int i2) {
        C18300 c18300 = null;
        try {
            C2310 c2310M45018 = m45018();
            C18300 c18301 = (C18300) c2310M45018.f7473;
            try {
                TextEditorBaseMenu textEditorBaseMenu = (TextEditorBaseMenu) c2310M45018.f7474;
                if (textEditorBaseMenu.isEnabled()) {
                    return textEditorBaseMenu.checkVisible(new C24703(c24132));
                }
                return false;
            } catch (Throwable th) {
                th = th;
                c18300 = c18301;
                if (c18300 != null) {
                    c18300.m42654(th);
                }
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // l.AbstractC22484
    /* JADX INFO: renamed from: ᩷ */
    public final C10549 mo31676() {
        m45019();
        return new C10549(this.f62941, this);
    }

    @Override // l.AbstractC22484
    /* JADX INFO: renamed from: ۙ */
    public final Drawable mo31673(Context context) {
        m45019();
        Drawable drawable = this.f62942;
        if (drawable != null) {
            drawable.setTintList(C3296.f10740);
        }
        return drawable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45020(View view) {
        AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) C3200.m10534(view.getContext());
        if (abstractActivityC17204 == null) {
            C22673.m51160("Cannot get the activity");
            return;
        }
        C18300 c18300 = null;
        try {
            C2310 c2310M45018 = m45018();
            C18300 c18301 = (C18300) c2310M45018.f7473;
            try {
                ((TextEditorBaseMenu) c2310M45018.f7474).onPluginButtonClick(new C18365(c18301.m42678(), abstractActivityC17204));
            } catch (Throwable th) {
                th = th;
                c18300 = c18301;
                if (c18300 != null) {
                    c18300.m42654(th);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // l.AbstractC22484
    /* JADX INFO: renamed from: ۙ */
    public final void mo31675(C24132 c24132) {
        C18300 c18300;
        AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) C3200.m10534(c24132.getContext());
        if (abstractActivityC17204 == null) {
            C22673.m51160("Cannot get the activity");
            return;
        }
        try {
            try {
                C2310 c2310M45018 = m45018();
                c18300 = (C18300) c2310M45018.f7473;
                try {
                    ((TextEditorBaseMenu) c2310M45018.f7474).onMenuClick(new C18365(c18300.m42678(), abstractActivityC17204), new C24703(c24132));
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
}
