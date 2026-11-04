package l;

import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: l.ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S2ZO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6039 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String f20657;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final String f20658;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20955 f20659;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C6039 f20660;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C6039 f20661;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f20662 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20955 f20663;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f20664;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f20665;

    static {
        InterfaceC20955 interfaceC20955 = C9766.f31483;
        f20659 = interfaceC20955;
        f20658 = Character.toString((char) 8206);
        f20657 = Character.toString((char) 8207);
        f20661 = new C6039(false, 2, interfaceC20955);
        f20660 = new C6039(true, 2, interfaceC20955);
    }

    public C6039(boolean z, int i, InterfaceC20955 interfaceC20955) {
        this.f20664 = z;
        this.f20665 = i;
        this.f20663 = interfaceC20955;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m17519(String str) {
        if (str == null) {
            return null;
        }
        return m17518(str, this.f20663).toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder m17518(CharSequence charSequence, InterfaceC20955 interfaceC20955) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean zMo20597 = ((AbstractC7530) interfaceC20955).mo20597(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = this.f20665 & 2;
        String str2 = "";
        String str3 = f20657;
        String str4 = f20658;
        boolean z = this.f20664;
        if (i != 0) {
            boolean zMo20598 = ((AbstractC7530) (zMo20597 ? C9766.f31486 : C9766.f31484)).mo20597(charSequence.length(), charSequence);
            if (z || !(zMo20598 || new C12004(charSequence).m30189() == 1)) {
                str = (!z || (zMo20598 && new C12004(charSequence).m30189() != -1)) ? "" : str3;
            } else {
                str = str4;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (zMo20597 != z) {
            spannableStringBuilder.append(zMo20597 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zMo20599 = ((AbstractC7530) (zMo20597 ? C9766.f31486 : C9766.f31484)).mo20597(charSequence.length(), charSequence);
        if (!z && (zMo20599 || new C12004(charSequence).m30188() == 1)) {
            str2 = str4;
        } else if (z && (!zMo20599 || new C12004(charSequence).m30188() == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder m17517(CharSequence charSequence) {
        return m17518(charSequence, this.f20663);
    }
}
