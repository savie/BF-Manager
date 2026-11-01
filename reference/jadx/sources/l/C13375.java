package l;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.Filter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۬᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes3.dex */
public final class C13375 extends Filter {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4201 f44308;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f44310;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f44311;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f44309 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C0822 f44306 = new C0822();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2945 f44307 = new C2945(2);

    public C13375(C4201 c4201) {
        this.f44308 = c4201;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x010d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0129 A[SYNTHETIC] */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        int i;
        String lowerCase;
        C19576 c19576;
        String lowerCase2;
        int iIndexOf;
        C4201 c4201 = this.f44308;
        ForegroundColorSpan foregroundColorSpan = c4201.f15267;
        ForegroundColorSpan foregroundColorSpan2 = c4201.f15264;
        ViewOnClickListenerC23253 viewOnClickListenerC23253 = c4201.f15262;
        String string = charSequence == null ? "" : charSequence.toString();
        this.f44310 = string.length();
        boolean zStartsWith = string.startsWith("@");
        C0822<SpannableString> c0822 = this.f44306;
        String lowerCase3 = null;
        if (zStartsWith || string.startsWith("?")) {
            int iIndexOf2 = string.indexOf(47);
            boolean z = string.indexOf("android:") == 1;
            C2945 c2945 = this.f44307;
            if (iIndexOf2 == -1) {
                boolean zStartsWith2 = string.startsWith("?");
                int i2 = zStartsWith2 ? 1 : 2;
                if (this.f44309 != i2) {
                    this.f44309 = i2;
                    c0822.clear();
                    InterfaceC6432 interfaceC6432M16369 = viewOnClickListenerC23253.f75434.m16369();
                    if (interfaceC6432M16369 != null) {
                        m32875(interfaceC6432M16369, zStartsWith2);
                    }
                    if (interfaceC6432M16369 == null || !interfaceC6432M16369.mo17616()) {
                        m32875(C13530.m33074(), zStartsWith2);
                    }
                    c0822.sort(c2945);
                }
            } else {
                String strSubstring = z ? string.substring(9, iIndexOf2) : string.substring(1, iIndexOf2);
                int i3 = iIndexOf2 + 1;
                lowerCase3 = string.substring(i3).toLowerCase();
                if (lowerCase3.isEmpty()) {
                    i3 = -1;
                }
                int i4 = z ? 3 : 4;
                if (this.f44309 == i4) {
                    if (!strSubstring.equals(this.f44311)) {
                    }
                    i = i3;
                } else {
                    this.f44309 = i4;
                }
                this.f44311 = strSubstring;
                c0822.clear();
                InterfaceC6432 interfaceC6432M163610 = viewOnClickListenerC23253.f75434.m16369();
                if (z && (interfaceC6432M163610 == null || !interfaceC6432M163610.mo17616())) {
                    interfaceC6432M163610 = C13530.m33074();
                }
                String strConcat = strSubstring.equals("attr") ? "?" : "@";
                if (z) {
                    strConcat = strConcat.concat("android:");
                }
                String strM5594 = C1679.m5594(strConcat, strSubstring, "/");
                int i5 = z ? 1 : 127;
                m32874(interfaceC6432M163610, i5, strM5594);
                if (z) {
                    m32874(viewOnClickListenerC23253.f75434.m16369(), i5, strM5594);
                }
                c0822.sort(c2945);
                i = i3;
            }
            lowerCase = string.toLowerCase();
            c19576 = new C19576();
            for (SpannableString spannableString : c0822) {
                spannableString.removeSpan(foregroundColorSpan2);
                spannableString.removeSpan(foregroundColorSpan);
                lowerCase2 = spannableString.toString().toLowerCase();
                if (lowerCase2.startsWith(lowerCase)) {
                    c19576.m44683(spannableString, 0);
                    spannableString.setSpan(foregroundColorSpan2, 0, lowerCase.length(), 33);
                } else if (i == -1 && (iIndexOf = lowerCase2.indexOf(lowerCase3, i)) != -1) {
                    c19576.m44683(spannableString, iIndexOf);
                    spannableString.setSpan(foregroundColorSpan2, 0, i, 33);
                    spannableString.setSpan(foregroundColorSpan, iIndexOf, lowerCase3.length() + iIndexOf, 33);
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = c19576.m44685();
            filterResults.count = c19576.m44682();
            return filterResults;
        }
        this.f44309 = 0;
        c0822.clear();
        i = -1;
        lowerCase = string.toLowerCase();
        c19576 = new C19576();
        while (r6.hasNext()) {
            spannableString.removeSpan(foregroundColorSpan2);
            spannableString.removeSpan(foregroundColorSpan);
            lowerCase2 = spannableString.toString().toLowerCase();
            if (lowerCase2.startsWith(lowerCase)) {
                c19576.m44683(spannableString, 0);
                spannableString.setSpan(foregroundColorSpan2, 0, lowerCase.length(), 33);
            } else if (i == -1) {
            }
        }
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        filterResults2.values = c19576.m44685();
        filterResults2.count = c19576.m44682();
        return filterResults2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32875(InterfaceC6432 interfaceC6432, boolean z) {
        for (InterfaceC17721 interfaceC17721 : interfaceC6432.mo17615()) {
            boolean z2 = interfaceC17721.mo19106() == 1;
            Iterator it = interfaceC17721.mo19112().iterator();
            while (it.hasNext()) {
                String typeName = ((InterfaceC19133) it.next()).getTypeName();
                C0822 c0822 = this.f44306;
                if (z) {
                    if (typeName.equals("attr")) {
                        if (z2) {
                            c0822.m3417(new SpannableString("?android:attr/"));
                        } else {
                            c0822.m3417(new SpannableString("?attr/"));
                        }
                    }
                } else if (!typeName.equals("attr")) {
                    if (z2) {
                        c0822.m3417(new SpannableString(C16523.m38890("@android:", typeName, "/")));
                    } else {
                        c0822.m3417(new SpannableString(C16523.m38890("@", typeName, "/")));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32874(InterfaceC6432 interfaceC6432, int i, String str) {
        InterfaceC3609 interfaceC3609Mo31753;
        if (interfaceC6432 == null) {
            return;
        }
        for (InterfaceC17721 interfaceC17721 : interfaceC6432.mo17615()) {
            if (interfaceC17721.mo19106() == i) {
                for (InterfaceC19133 interfaceC19133 : interfaceC17721.mo19112()) {
                    if (interfaceC19133.getTypeName().equals(this.f44311)) {
                        int iMo1519 = interfaceC19133.mo1519();
                        for (int i2 = 0; i2 < iMo1519; i2++) {
                            for (InterfaceC12783 interfaceC12783 : interfaceC19133.mo25271()) {
                                if (interfaceC12783.mo31756(i2) && (interfaceC3609Mo31753 = interfaceC12783.mo31753(i2)) != null) {
                                    StringBuilder sbM23356 = C9023.m23356(str);
                                    sbM23356.append(interfaceC3609Mo31753.mo7645());
                                    this.f44306.m3417(new SpannableString(sbM23356.toString()));
                                    break;
                                }
                            }
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults == null) {
            return;
        }
        List list = (List) filterResults.values;
        C4201 c4201 = this.f44308;
        c4201.f15263 = list;
        if (filterResults.count > 0) {
            c4201.notifyDataSetChanged();
        } else {
            c4201.notifyDataSetInvalidated();
        }
    }
}
