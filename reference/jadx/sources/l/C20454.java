package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.style.ForegroundColorSpan;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7JK */
/* JADX INFO: loaded from: classes5.dex */
public class C20454 extends AbstractC21243 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21707 f66381;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21707 f66382;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f66383;

    static {
        C17349 c17349M27749 = AbstractC11000.m27749();
        c17349M27749.m40378((Integer) 1, "builtin:selectText");
        c17349M27749.m40378((Integer) 2, "builtin:selectAll");
        c17349M27749.m40378((Integer) 3, "builtin:cut");
        c17349M27749.m40378((Integer) 4, "builtin:copy");
        c17349M27749.m40378((Integer) 5, "builtin:paste");
        c17349M27749.m40378((Integer) 6, "builtin:delete");
        c17349M27749.m40378((Integer) 7, "builtin:search");
        c17349M27749.m40378((Integer) 8, "builtin:rangeSearch");
        c17349M27749.m40378((Integer) 9, "builtin:shareText");
        c17349M27749.m40378((Integer) 10, "builtin:openLink");
        c17349M27749.m40378((Integer) 11, "builtin:translate");
        c17349M27749.m40378((Integer) 12, "builtin:systemTranslate");
        c17349M27749.m40378((Integer) 13, "builtin:toggleComment");
        c17349M27749.m40378((Integer) 14, "builtin:function");
        c17349M27749.m40378((Integer) 15, "builtin:customize");
        AbstractC11000 abstractC11000Mo32742 = c17349M27749.mo32742();
        f66381 = abstractC11000Mo32742;
        f66382 = abstractC11000Mo32742.mo27750();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static AbstractC23844 m46256() {
        return ((AbstractC11000) f66381).mo27750().keySet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46258(int i) {
        return (String) f66381.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m46257(String str) {
        return (Integer) f66382.get(str);
    }

    public C20454(int i) {
        this.f66383 = i;
    }

    /* JADX INFO: renamed from: ᩹ */
    public int mo38337() {
        int i = this.f66383;
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

    @Override // l.AbstractC21243
    /* JADX INFO: renamed from: ۙ */
    public final String mo20676() {
        int i = this.f66383;
        String strM46258 = m46258(i);
        if (strM46258 != null) {
            return strM46258;
        }
        throw new RuntimeException("Unknown action " + i);
    }

    @Override // l.AbstractC21243
    /* JADX INFO: renamed from: ۙ */
    public boolean mo20678(C6111 c6111, boolean z, boolean z2, int i, int i2) {
        int i3 = this.f66383;
        switch (i3) {
            case 1:
                return !z2 && i == i2;
            case 2:
                return (i == 0 && i2 == c6111.m16842()) ? false : true;
            case 3:
            case 6:
                return z && i != i2;
            case 4:
            case 9:
                return i != i2;
            case 5:
                return z && c6111.m17068();
            case 7:
                return i != i2 && c6111.m17010();
            case 8:
                return i != i2 && c6111.m17010() && c6111.m16929();
            case 10:
                if (i == i2 || i2 - i > 2048) {
                    return false;
                }
                C3329 c3329Mo2399 = c6111.m17000().mo2399();
                try {
                    boolean zM32848 = C13351.m32848(c3329Mo2399, i, i2);
                    c3329Mo2399.close();
                    return zM32848;
                } catch (Throwable th) {
                    try {
                        c3329Mo2399.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 11:
                return (i == i2 || c6111.m16830() == null) ? false : true;
            case 12:
                return i != i2 && C22466.m49974();
            case 13:
                return z && !c6111.m16834().isEmpty();
            case 14:
                return false;
            case 15:
                return true;
            default:
                throw new RuntimeException(C8479.m22141(i3, "Unknown action "));
        }
    }

    @Override // l.AbstractC21243
    /* JADX INFO: renamed from: ܰ */
    public final C14894 mo20679() {
        C14894 c14894 = new C14894(C16737.m39288(mo38337()), this);
        if (this.f66383 == 14) {
            c14894.setSpan(new ForegroundColorSpan(C20368.f65970), 0, c14894.length(), 17);
        }
        return c14894;
    }

    /* JADX INFO: renamed from: ۚ */
    public int mo38336() {
        int i = this.f66383;
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

    @Override // l.AbstractC21243
    /* JADX INFO: renamed from: ۙ */
    public final Drawable mo20675(Context context) {
        Drawable drawableM39101 = C16631.m39101(context.getResources(), mo38336(), context.getTheme());
        if (this.f66383 != 14) {
            return drawableM39101;
        }
        Drawable drawableMutate = C7603.m20139(drawableM39101).mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(C20368.f65970));
        return drawableMutate;
    }

    @Override // l.AbstractC21243
    /* JADX INFO: renamed from: ۙ */
    public void mo20677(C6111 c6111) {
        int i = this.f66383;
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
                c6111.m17064(mo38337());
                return;
            case 14:
            default:
                throw new RuntimeException(C8479.m22141(i, "Unknown action "));
        }
    }
}
