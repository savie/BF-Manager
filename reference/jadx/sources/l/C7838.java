package l;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7IR */
/* JADX INFO: loaded from: classes3.dex */
public final class C7838 extends AbstractC21243 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21707 f25784;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21707 f25785;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f25786;

    static {
        C17349 c17349M27749 = AbstractC11000.m27749();
        c17349M27749.m40378((Integer) 1, "builtin:copyLine");
        c17349M27749.m40378((Integer) 2, "builtin:cutLine");
        c17349M27749.m40378((Integer) 3, "builtin:deleteLine");
        c17349M27749.m40378((Integer) 4, "builtin:emptyLine");
        c17349M27749.m40378((Integer) 5, "builtin:replaceLine");
        c17349M27749.m40378((Integer) 6, "builtin:duplicateLine");
        c17349M27749.m40378((Integer) 7, "builtin:caseLow2Up");
        c17349M27749.m40378((Integer) 8, "builtin:caseUp2Low");
        c17349M27749.m40378((Integer) 9, "builtin:increaseIndent");
        c17349M27749.m40378((Integer) 10, "builtin:decreaseIndent");
        c17349M27749.m40378((Integer) 11, "builtin:toggleComment");
        c17349M27749.m40378((Integer) 12, "builtin:shrinkCode");
        c17349M27749.m40378((Integer) 13, "builtin:formatCode");
        c17349M27749.m40378((Integer) 14, "builtin:customize");
        AbstractC11000 abstractC11000Mo32742 = c17349M27749.mo32742();
        f25784 = abstractC11000Mo32742;
        f25785 = abstractC11000Mo32742.mo27750();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static AbstractC23844 m20674() {
        return ((AbstractC11000) f25784).mo27750().keySet();
    }

    @Override // l.AbstractC21243
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo20676() {
        InterfaceC21707 interfaceC21707 = f25784;
        int i = this.f25786;
        String str = (String) interfaceC21707.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        throw new RuntimeException("Unknown action " + i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m20673(String str) {
        return (Integer) f25785.get(str);
    }

    public C7838(int i) {
        this.f25786 = i;
    }

    @Override // l.AbstractC21243
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo20678(C6111 c6111, boolean z, boolean z2, int i, int i2) {
        switch (this.f25786) {
            case 11:
                return !c6111.m16834().isEmpty();
            case 12:
                return c6111.m16943() != null;
            case 13:
                return c6111.m16818() != null;
            default:
                return true;
        }
    }

    @Override // l.AbstractC21243
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14894 mo20679() {
        int i;
        int i2 = this.f25786;
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
                throw new RuntimeException(C8479.m22141(i2, "Unknown action "));
        }
        return new C14894(C16737.m39288(i), this);
    }

    @Override // l.AbstractC21243
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable mo20675(Context context) {
        int i;
        int i2 = this.f25786;
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
        return C16631.m39101(context.getResources(), i, context.getTheme());
    }

    @Override // l.AbstractC21243
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20677(C6111 c6111) {
        int i = this.f25786;
        switch (i) {
            case 1:
                C1877.m6117(c6111);
                return;
            case 2:
                C1877.m6127(c6111);
                return;
            case 3:
                C1877.m6112(c6111);
                return;
            case 4:
                C1877.m6129(c6111);
                return;
            case 5:
                C1877.m6114(c6111);
                return;
            case 6:
                C1877.m6120(c6111);
                return;
            case 7:
                C1877.m6119(c6111, true);
                return;
            case 8:
                C1877.m6119(c6111, false);
                return;
            case 9:
                C1877.m6111(c6111);
                return;
            case 10:
                C1877.m6123(c6111);
                return;
            case 11:
                C1877.m6130(c6111);
                return;
            case 12:
                C1877.m6122(c6111);
                return;
            case 13:
                C1877.m6125(c6111);
                return;
            case 14:
                c6111.getContext().startActivity(new Intent(c6111.getContext(), (Class<?>) ActivityC23361.class));
                return;
            default:
                throw new RuntimeException("Unknown action " + i);
        }
    }
}
