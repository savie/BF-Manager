package l;

import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: l.ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S2ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class C18000 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20823 f57552;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f57553 = 0;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final String f57554;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C18000 f57555;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final String f57556;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C18000 f57557;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20823 f57558;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f57559;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f57560;

    static {
        InterfaceC20823 interfaceC20823 = C12357.f41277;
        f57552 = interfaceC20823;
        f57556 = Character.toString((char) 8206);
        f57554 = Character.toString((char) 8207);
        f57555 = new C18000(false, 2, interfaceC20823);
        f57557 = new C18000(true, 2, interfaceC20823);
    }

    public C18000(boolean z, int i, InterfaceC20823 interfaceC20823) {
        this.f57559 = z;
        this.f57560 = i;
        this.f57558 = interfaceC20823;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m41914(String str) {
        if (str == null) {
            return null;
        }
        return m41913(str, this.f57558).toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder m41913(CharSequence charSequence, InterfaceC20823 interfaceC20823) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean zMo2079 = ((AbstractC0361) interfaceC20823).mo2079(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = this.f57560 & 2;
        String str2 = "";
        String str3 = f57554;
        String str4 = f57556;
        boolean z = this.f57559;
        if (i != 0) {
            boolean zMo20710 = ((AbstractC0361) (zMo2079 ? C12357.f41276 : C12357.f41278)).mo2079(charSequence.length(), charSequence);
            if (z || !(zMo20710 || new C21528(charSequence).m48251() == 1)) {
                str = (!z || (zMo20710 && new C21528(charSequence).m48251() != -1)) ? "" : str3;
            } else {
                str = str4;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (zMo2079 != z) {
            spannableStringBuilder.append(zMo2079 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zMo20711 = ((AbstractC0361) (zMo2079 ? C12357.f41276 : C12357.f41278)).mo2079(charSequence.length(), charSequence);
        if (!z && (zMo20711 || new C21528(charSequence).m48250() == 1)) {
            str2 = str4;
        } else if (z && (!zMo20711 || new C21528(charSequence).m48250() == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder m41912(CharSequence charSequence) {
        return m41913(charSequence, this.f57558);
    }
}
