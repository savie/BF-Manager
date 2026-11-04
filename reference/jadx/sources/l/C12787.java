package l;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7IR */
/* JADX INFO: loaded from: classes4.dex */
public final class C12787 extends AbstractC22484 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23754 f40900;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC23754 f40901;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f40902;

    static {
        C9449 c9449M23395 = AbstractC8704.m23395();
        c9449M23395.m24829((Integer) 1, "builtin:copyLine");
        c9449M23395.m24829((Integer) 2, "builtin:cutLine");
        c9449M23395.m24829((Integer) 3, "builtin:deleteLine");
        c9449M23395.m24829((Integer) 4, "builtin:emptyLine");
        c9449M23395.m24829((Integer) 5, "builtin:replaceLine");
        c9449M23395.m24829((Integer) 6, "builtin:duplicateLine");
        c9449M23395.m24829((Integer) 7, "builtin:caseLow2Up");
        c9449M23395.m24829((Integer) 8, "builtin:caseUp2Low");
        c9449M23395.m24829((Integer) 9, "builtin:increaseIndent");
        c9449M23395.m24829((Integer) 10, "builtin:decreaseIndent");
        c9449M23395.m24829((Integer) 11, "builtin:toggleComment");
        c9449M23395.m24829((Integer) 12, "builtin:shrinkCode");
        c9449M23395.m24829((Integer) 13, "builtin:formatCode");
        c9449M23395.m24829((Integer) 14, "builtin:customize");
        AbstractC8704 abstractC8704Mo14570 = c9449M23395.mo14570();
        f40900 = abstractC8704Mo14570;
        f40901 = abstractC8704Mo14570.mo23396();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static AbstractC8639 m31672() {
        return ((AbstractC8704) f40900).mo23396().keySet();
    }

    @Override // l.AbstractC22484
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo31674() {
        InterfaceC23754 interfaceC23754 = f40900;
        int i = this.f40902;
        String str = (String) interfaceC23754.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        throw new RuntimeException("Unknown action " + i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m31671(String str) {
        return (Integer) f40901.get(str);
    }

    public C12787(int i) {
        this.f40902 = i;
    }

    @Override // l.AbstractC22484
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo30572(C24132 c24132, boolean z, boolean z2, int i, int i2) {
        switch (this.f40902) {
            case 11:
                return !c24132.m54095().isEmpty();
            case 12:
                return c24132.m53989() != null;
            case 13:
                return c24132.m54084() != null;
            default:
                return true;
        }
    }

    @Override // l.AbstractC22484
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10549 mo31676() {
        int i;
        int i2 = this.f40902;
        switch (i2) {
            case 1:
                i = R.string.MT_Protector;
                break;
            case 2:
                i = R.string.MT_Protector;
                break;
            case 3:
                i = R.string.MT_Protector;
                break;
            case 4:
                i = R.string.MT_Protector;
                break;
            case 5:
                i = R.string.MT_Protector;
                break;
            case 6:
                i = R.string.MT_Protector;
                break;
            case 7:
                i = R.string.MT_Protector;
                break;
            case 8:
                i = R.string.MT_Protector;
                break;
            case 9:
                i = R.string.MT_Protector;
                break;
            case 10:
                i = R.string.MT_Protector;
                break;
            case 11:
                i = R.string.MT_Protector;
                break;
            case 12:
                i = R.string.MT_Protector;
                break;
            case 13:
                i = R.string.MT_Protector;
                break;
            case 14:
                i = R.string.MT_Protector;
                break;
            default:
                throw new RuntimeException(C13645.m33382(i2, "Unknown action "));
        }
        return new C10549(C21576.m49088(i), this);
    }

    @Override // l.AbstractC22484
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable mo31673(Context context) {
        int i;
        int i2 = this.f40902;
        switch (i2) {
            case 1:
                i = R.drawable.MT_Protector;
                break;
            case 2:
                i = R.drawable.MT_Protector;
                break;
            case 3:
                i = R.drawable.MT_Protector;
                break;
            case 4:
                i = R.drawable.MT_Protector;
                break;
            case 5:
                i = R.drawable.MT_Protector;
                break;
            case 6:
                i = R.drawable.MT_Protector;
                break;
            case 7:
                i = R.drawable.MT_Protector;
                break;
            case 8:
                i = R.drawable.MT_Protector;
                break;
            case 9:
                i = R.drawable.MT_Protector;
                break;
            case 10:
                i = R.drawable.MT_Protector;
                break;
            case 11:
                i = R.drawable.MT_Protector;
                break;
            case 12:
                i = R.drawable.MT_Protector;
                break;
            case 13:
                i = R.drawable.MT_Protector;
                break;
            case 14:
                i = R.drawable.MT_Protector;
                break;
            default:
                throw new RuntimeException("Unknown action " + i2);
        }
        return C9217.m24392(context.getResources(), i, context.getTheme());
    }

    @Override // l.AbstractC22484
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo31675(C24132 c24132) {
        int i = this.f40902;
        switch (i) {
            case 1:
                C18910.m43902(c24132);
                return;
            case 2:
                C18910.m43916(c24132);
                return;
            case 3:
                C18910.m43907(c24132);
                return;
            case 4:
                C18910.m43901(c24132);
                return;
            case 5:
                C18910.m43918(c24132);
                return;
            case 6:
                C18910.m43905(c24132);
                return;
            case 7:
                C18910.m43900(c24132, true);
                return;
            case 8:
                C18910.m43900(c24132, false);
                return;
            case 9:
                C18910.m43894(c24132);
                return;
            case 10:
                C18910.m43911(c24132);
                return;
            case 11:
                C18910.m43910(c24132);
                return;
            case 12:
                C18910.m43909(c24132);
                return;
            case 13:
                C18910.m43904(c24132);
                return;
            case 14:
                c24132.getContext().startActivity(new Intent(c24132.getContext(), (Class<?>) ActivityC3838.class));
                return;
            default:
                throw new RuntimeException("Unknown action " + i);
        }
    }
}
