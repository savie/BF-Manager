package l;

import android.R;
import android.content.Intent;
import android.view.View;
import android.view.ViewParent;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܰۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAVX */
/* JADX INFO: loaded from: classes3.dex */
public class C13607 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C16958 f44883;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C16958 f44884;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C2939 f44885 = new C2939();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21159 f44886;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f44887;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public JSONObject mo33245() {
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String mo33246() {
        return null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean mo33253() {
        return this instanceof C16346;
    }

    public C13607(int i) {
        this.f44887 = i;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m33250() {
        return this.f44887 == 31;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m33251() {
        return this.f44887;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String mo33252() {
        return m33243(this.f44887);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean mo33244() {
        int i = this.f44887;
        switch (i) {
            case 1:
            case 4:
            case 5:
            case 7:
            case 8:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 29:
            case 31:
            case 32:
            case 33:
                return false;
            case 2:
            case 3:
            case 6:
            case 9:
            case 10:
            case 13:
            case 14:
            case 18:
            case 19:
            case 20:
            case 21:
            case 30:
                return true;
            case 27:
            default:
                throw new IllegalArgumentException("type=" + i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo33248(View view, C10948 c10948) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo33247(View view, InterfaceC4433 interfaceC4433) {
        C6111 c6111Mo11315 = interfaceC4433.mo11315();
        InterfaceC19851 interfaceC19851Mo11317 = interfaceC4433.mo11317();
        if (c6111Mo11315 == null || interfaceC19851Mo11317 == null) {
            return;
        }
        if (!c6111Mo11315.hasFocus()) {
            c6111Mo11315.requestFocus();
        }
        int i = this.f44887;
        int iM44426 = 0;
        switch (i) {
            case 1:
                C1877.m6117(c6111Mo11315);
                return;
            case 2:
                C1877.m6127(c6111Mo11315);
                return;
            case 3:
                C1877.m6112(c6111Mo11315);
                return;
            case 4:
                C1877.m6129(c6111Mo11315);
                return;
            case 5:
                C1877.m6114(c6111Mo11315);
                return;
            case 6:
                C1877.m6120(c6111Mo11315);
                return;
            case 7:
                C1877.m6119(c6111Mo11315, true);
                return;
            case 8:
                C1877.m6119(c6111Mo11315, false);
                return;
            case 9:
                C1877.m6111(c6111Mo11315);
                return;
            case 10:
                C1877.m6123(c6111Mo11315);
                return;
            case 11:
                C1877.m6130(c6111Mo11315);
                return;
            case 12:
                interfaceC19851Mo11317.mo41933();
                return;
            case 13:
                c6111Mo11315.m16821();
                return;
            case 14:
                c6111Mo11315.m16967();
                return;
            case 15:
                interfaceC4433.mo11316();
                return;
            case 16:
                C1877.m6121(c6111Mo11315, false);
                return;
            case 17:
                C1877.m6124(c6111Mo11315, false);
                return;
            case 18:
                c6111Mo11315.onKeyDown(21, null);
                return;
            case 19:
                c6111Mo11315.onKeyDown(22, null);
                return;
            case 20:
                c6111Mo11315.onKeyDown(19, null);
                return;
            case 21:
                c6111Mo11315.onKeyDown(20, null);
                return;
            case 22:
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent instanceof C13708) {
                        iM44426 = ((C13708) parent).m44426();
                        ApplicationC0716 applicationC0716 = C16737.f53614;
                        applicationC0716.startActivity(new Intent(applicationC0716, (Class<?>) ActivityC19749.class).addFlags(268435456).putExtra("pageIndex", iM44426));
                        return;
                    }
                }
                ApplicationC0716 applicationC0717 = C16737.f53614;
                applicationC0717.startActivity(new Intent(applicationC0717, (Class<?>) ActivityC19749.class).addFlags(268435456).putExtra("pageIndex", iM44426));
                return;
            case 23:
                C1877.m6113(c6111Mo11315, false);
                return;
            case 24:
                C1877.m6128(c6111Mo11315, false);
                return;
            case 25:
                c6111Mo11315.m16975();
                return;
            case 26:
                c6111Mo11315.m16838();
                return;
            case 27:
            default:
                throw new RuntimeException(C8479.m22141(i, "Unsupported type "));
            case 28:
                c6111Mo11315.m17006(R.id.copy);
                return;
            case 29:
                c6111Mo11315.m17006(R.id.cut);
                return;
            case 30:
                c6111Mo11315.m17006(R.id.paste);
                return;
            case 31:
                C21159 c21159 = this.f44886;
                if (c21159 == null) {
                    throw new RuntimeException("bindingFunction == null");
                }
                if (c21159.f68906.mo33244()) {
                    new RunnableC9291(this, view, interfaceC4433).run();
                    return;
                } else {
                    this.f44886.f68906.mo33247(view, interfaceC4433);
                    C16737.m39274(new RunnableC1528(), 200L);
                    return;
                }
            case 32:
                C1877.m6125(c6111Mo11315);
                return;
            case 33:
                C1877.m6122(c6111Mo11315);
                return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33249(boolean z) {
        int i = this.f44887;
        if (i < 0 || i >= 35) {
            return false;
        }
        return z || i != 31;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC7879 m33242(int i) {
        if (i == 0) {
            return C16346.f52632;
        }
        if (i == 27) {
            return C19874.f63721;
        }
        if (i == 34) {
            return C14230.f46622;
        }
        return f44885;
    }

    static {
        int[] iArr = {31, 0, 34, 27, 28, 29, 30, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 32, 33, 12, 13, 14, 15, 16, 17, 23, 24, 18, 19, 20, 21, 25, 26, 22};
        f44883 = C17663.m41143(C15070.m36102(iArr));
        f44884 = C17663.m41143(new C15070(iArr, 0));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m33243(int i) {
        switch (i) {
            case 0:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 1:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 2:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 3:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 4:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 5:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 6:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 7:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 8:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 9:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 10:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 11:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 12:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 13:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 14:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 15:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 16:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 17:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 18:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 19:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 20:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 21:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 22:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 23:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 24:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 25:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 26:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 27:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 28:
                return C16737.m39288(R.string.copy);
            case 29:
                return C16737.m39288(R.string.cut);
            case 30:
                return C16737.m39288(R.string.paste);
            case 31:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 32:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 33:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            case 34:
                return C16737.m39288(bin.mt.plus.R.string.MT_Protector);
            default:
                return i + "???";
        }
    }
}
