package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.style.ForegroundColorSpan;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7JK */
/* JADX INFO: loaded from: classes5.dex */
public class C15880 extends AbstractC22484 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23754 f51637;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC23754 f51638;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f51639;

    static {
        C9449 c9449M23395 = AbstractC8704.m23395();
        c9449M23395.m24829((Integer) 1, "builtin:selectText");
        c9449M23395.m24829((Integer) 2, "builtin:selectAll");
        c9449M23395.m24829((Integer) 3, "builtin:cut");
        c9449M23395.m24829((Integer) 4, "builtin:copy");
        c9449M23395.m24829((Integer) 5, "builtin:paste");
        c9449M23395.m24829((Integer) 6, "builtin:delete");
        c9449M23395.m24829((Integer) 7, "builtin:search");
        c9449M23395.m24829((Integer) 8, "builtin:rangeSearch");
        c9449M23395.m24829((Integer) 9, "builtin:shareText");
        c9449M23395.m24829((Integer) 10, "builtin:openLink");
        c9449M23395.m24829((Integer) 11, "builtin:translate");
        c9449M23395.m24829((Integer) 12, "builtin:systemTranslate");
        c9449M23395.m24829((Integer) 13, "builtin:toggleComment");
        c9449M23395.m24829((Integer) 14, "builtin:function");
        c9449M23395.m24829((Integer) 15, "builtin:customize");
        AbstractC8704 abstractC8704Mo14570 = c9449M23395.mo14570();
        f51637 = abstractC8704Mo14570;
        f51638 = abstractC8704Mo14570.mo23396();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static AbstractC8639 m37854() {
        return ((AbstractC8704) f51637).mo23396().keySet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m37853(int i) {
        return (String) f51637.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m37852(String str) {
        return (Integer) f51638.get(str);
    }

    public C15880(int i) {
        this.f51639 = i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int mo37855() {
        int i = this.f51639;
        switch (i) {
            case 1:
                return R.string.MT_Protector;
            case 2:
                return android.R.string.selectAll;
            case 3:
                return android.R.string.cut;
            case 4:
                return android.R.string.copy;
            case 5:
                return android.R.string.paste;
            case 6:
                return R.string.MT_Protector;
            case 7:
                return R.string.MT_Protector;
            case 8:
                return R.string.MT_Protector;
            case 9:
                return R.string.MT_Protector;
            case 10:
                return R.string.MT_Protector;
            case 11:
                return R.string.MT_Protector;
            case 12:
                return R.string.MT_Protector;
            case 13:
                return R.string.MT_Protector;
            case 14:
                return R.string.MT_Protector;
            case 15:
                return R.string.MT_Protector;
            default:
                throw new RuntimeException("Unknown action " + i);
        }
    }

    @Override // l.AbstractC22484
    /* JADX INFO: renamed from: ۙ */
    public final String mo31674() {
        int i = this.f51639;
        String strM37853 = m37853(i);
        if (strM37853 != null) {
            return strM37853;
        }
        throw new RuntimeException("Unknown action " + i);
    }

    @Override // l.AbstractC22484
    /* JADX INFO: renamed from: ۙ */
    public boolean mo30572(C24132 c24132, boolean z, boolean z2, int i, int i2) {
        int i3 = this.f51639;
        switch (i3) {
            case 1:
                return !z2 && i == i2;
            case 2:
                return (i == 0 && i2 == c24132.m54099()) ? false : true;
            case 3:
            case 6:
                return z && i != i2;
            case 4:
            case 9:
                return i != i2;
            case 5:
                return z && c24132.m54100();
            case 7:
                return i != i2 && c24132.m53887();
            case 8:
                return i != i2 && c24132.m53887() && c24132.m54045();
            case 10:
                if (i == i2 || i2 - i > 2048) {
                    return false;
                }
                C15508 c15508Mo15350 = c24132.m54021().mo15350();
                try {
                    boolean zM16564 = C5590.m16564(c15508Mo15350, i, i2);
                    c15508Mo15350.close();
                    return zM16564;
                } catch (Throwable th) {
                    try {
                        c15508Mo15350.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 11:
                return (i == i2 || c24132.m54005() == null) ? false : true;
            case 12:
                return i != i2 && C21036.m48079();
            case 13:
                return z && !c24132.m54095().isEmpty();
            case 14:
                return false;
            case 15:
                return true;
            default:
                throw new RuntimeException(C13645.m33382(i3, "Unknown action "));
        }
    }

    @Override // l.AbstractC22484
    /* JADX INFO: renamed from: ᩷ */
    public final C10549 mo31676() {
        C10549 c10549 = new C10549(C21576.m49088(mo37855()), this);
        if (this.f51639 == 14) {
            c10549.setSpan(new ForegroundColorSpan(C3296.f10738), 0, c10549.length(), 17);
        }
        return c10549;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int mo37856() {
        int i = this.f51639;
        switch (i) {
            case 1:
                return R.drawable.MT_Protector;
            case 2:
                return R.drawable.MT_Protector;
            case 3:
                return R.drawable.MT_Protector;
            case 4:
                return R.drawable.MT_Protector;
            case 5:
                return R.drawable.MT_Protector;
            case 6:
                return R.drawable.MT_Protector;
            case 7:
                return R.drawable.MT_Protector;
            case 8:
                return R.drawable.MT_Protector;
            case 9:
                return R.drawable.MT_Protector;
            case 10:
                return R.drawable.MT_Protector;
            case 11:
            case 12:
                return R.drawable.MT_Protector;
            case 13:
                return R.drawable.MT_Protector;
            case 14:
                return R.drawable.MT_Protector;
            case 15:
                return R.drawable.MT_Protector;
            default:
                throw new RuntimeException("Unknown action " + i);
        }
    }

    @Override // l.AbstractC22484
    /* JADX INFO: renamed from: ۙ */
    public final Drawable mo31673(Context context) {
        Drawable drawableM24392 = C9217.m24392(context.getResources(), mo37856(), context.getTheme());
        if (this.f51639 != 14) {
            return drawableM24392;
        }
        Drawable drawableMutate = C0597.m2697(drawableM24392).mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(C3296.f10738));
        return drawableMutate;
    }

    @Override // l.AbstractC22484
    /* JADX INFO: renamed from: ۙ */
    public void mo31675(C24132 c24132) {
        int i = this.f51639;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
                c24132.mo52343(mo37855());
                return;
            case 14:
            default:
                throw new RuntimeException(C13645.m33382(i, "Unknown action "));
        }
    }
}
