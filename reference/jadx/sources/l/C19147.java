package l;

import android.R;
import android.content.Intent;
import android.view.View;
import android.view.ViewParent;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ᩳܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAVX */
/* JADX INFO: loaded from: classes5.dex */
public class C19147 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C0502 f61961 = new C0502();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C21917 f61962;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C21917 f61963;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16626 f61964;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f61965;

    /* JADX INFO: renamed from: ۙ */
    public String mo11454() {
        return null;
    }

    /* JADX INFO: renamed from: ܳ */
    public boolean mo35299() {
        return this instanceof C3485;
    }

    /* JADX INFO: renamed from: ᩸ */
    public JSONObject mo35301() {
        return null;
    }

    public C19147(int i) {
        this.f61965 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m44387() {
        return this.f61965;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m44388() {
        return this.f61965 == 31;
    }

    /* JADX INFO: renamed from: ᩷ */
    public String mo35300() {
        return m44385(this.f61965);
    }

    /* JADX INFO: renamed from: ۫ */
    public boolean mo11457() {
        int i = this.f61965;
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

    /* JADX INFO: renamed from: ۙ */
    public void mo11456(View view, C23255 c23255) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo11455(View view, InterfaceC7960 interfaceC7960) {
        C24132 c24132Mo10928 = interfaceC7960.mo10928();
        InterfaceC20598 interfaceC20598Mo10930 = interfaceC7960.mo10930();
        if (c24132Mo10928 == null || interfaceC20598Mo10930 == null) {
            return;
        }
        if (!c24132Mo10928.hasFocus()) {
            c24132Mo10928.requestFocus();
        }
        int i = this.f61965;
        int iM36517 = 0;
        switch (i) {
            case 1:
                C18910.m43902(c24132Mo10928);
                return;
            case 2:
                C18910.m43916(c24132Mo10928);
                return;
            case 3:
                C18910.m43907(c24132Mo10928);
                return;
            case 4:
                C18910.m43901(c24132Mo10928);
                return;
            case 5:
                C18910.m43918(c24132Mo10928);
                return;
            case 6:
                C18910.m43905(c24132Mo10928);
                return;
            case 7:
                C18910.m43900(c24132Mo10928, true);
                return;
            case 8:
                C18910.m43900(c24132Mo10928, false);
                return;
            case 9:
                C18910.m43894(c24132Mo10928);
                return;
            case 10:
                C18910.m43911(c24132Mo10928);
                return;
            case 11:
                C18910.m43910(c24132Mo10928);
                return;
            case 12:
                interfaceC20598Mo10930.mo13072();
                return;
            case 13:
                c24132Mo10928.m54086();
                return;
            case 14:
                c24132Mo10928.m54019();
                return;
            case 15:
                interfaceC7960.mo10929();
                return;
            case 16:
                C18910.m43906(c24132Mo10928, false);
                return;
            case 17:
                C18910.m43912(c24132Mo10928, false);
                return;
            case 18:
                c24132Mo10928.onKeyDown(21, null);
                return;
            case 19:
                c24132Mo10928.onKeyDown(22, null);
                return;
            case 20:
                c24132Mo10928.onKeyDown(19, null);
                return;
            case 21:
                c24132Mo10928.onKeyDown(20, null);
                return;
            case 22:
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent instanceof C4147) {
                        iM36517 = ((C4147) parent).m36517();
                        ApplicationC17729 applicationC17729 = C21576.f68934;
                        applicationC17729.startActivity(new Intent(applicationC17729, (Class<?>) ActivityC5440.class).addFlags(268435456).putExtra("pageIndex", iM36517));
                        return;
                    }
                }
                ApplicationC17729 applicationC177210 = C21576.f68934;
                applicationC177210.startActivity(new Intent(applicationC177210, (Class<?>) ActivityC5440.class).addFlags(268435456).putExtra("pageIndex", iM36517));
                return;
            case 23:
                C18910.m43908(c24132Mo10928, false);
                return;
            case 24:
                C18910.m43917(c24132Mo10928, false);
                return;
            case 25:
                c24132Mo10928.m53874();
                return;
            case 26:
                c24132Mo10928.m53991();
                return;
            case 27:
            default:
                throw new RuntimeException(C13645.m33382(i, "Unsupported type "));
            case 28:
                c24132Mo10928.mo52324(R.id.copy);
                return;
            case 29:
                c24132Mo10928.mo52324(R.id.cut);
                return;
            case 30:
                c24132Mo10928.mo52324(R.id.paste);
                return;
            case 31:
                C16626 c16626 = this.f61964;
                if (c16626 == null) {
                    throw new RuntimeException("bindingFunction == null");
                }
                if (c16626.f53761.mo11457()) {
                    new RunnableC18401(this, view, interfaceC7960).run();
                    return;
                } else {
                    this.f61964.f53761.mo11455(view, interfaceC7960);
                    C21576.m49069(new RunnableC21385(), 200L);
                    return;
                }
            case 32:
                C18910.m43904(c24132Mo10928);
                return;
            case 33:
                C18910.m43909(c24132Mo10928);
                return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44386(boolean z) {
        int i = this.f61965;
        if (i < 0 || i >= 35) {
            return false;
        }
        return z || i != 31;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC5723 m44384(int i) {
        if (i == 0) {
            return C3485.f12037;
        }
        if (i == 27) {
            return C16163.f52468;
        }
        if (i == 34) {
            return C14671.f47963;
        }
        return f61961;
    }

    static {
        int[] iArr = {31, 0, 34, 27, 28, 29, 30, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 32, 33, 12, 13, 14, 15, 16, 17, 23, 24, 18, 19, 20, 21, 25, 26, 22};
        f61963 = C22663.m51058(C14763.m35499(iArr));
        f61962 = C22663.m51058(new C14763(iArr, 0));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m44385(int i) {
        switch (i) {
            case 0:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 1:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 2:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 3:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 4:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 5:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 6:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 7:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 8:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 9:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 10:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 11:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 12:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 13:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 14:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 15:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 16:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 17:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 18:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 19:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 20:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 21:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 22:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 23:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 24:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 25:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 26:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 27:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 28:
                return C21576.m49088(R.string.copy);
            case 29:
                return C21576.m49088(R.string.cut);
            case 30:
                return C21576.m49088(R.string.paste);
            case 31:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 32:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 33:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            case 34:
                return C21576.m49088(bin.mt.plus.R.string.MT_Protector);
            default:
                return i + "???";
        }
    }
}
