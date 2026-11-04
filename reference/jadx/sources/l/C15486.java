package l;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.Filter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܳܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15486 extends Filter {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f50410;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13249 f50411;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f50412;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f50409 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C7346 f50413 = new C7346();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19962 f50408 = new C19962();

    public C15486(C13249 c13249) {
        this.f50411 = c13249;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x010d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0129 A[SYNTHETIC] */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        int i;
        String lowerCase;
        C3681 c3681;
        String lowerCase2;
        int iIndexOf;
        C13249 c13249 = this.f50411;
        ForegroundColorSpan foregroundColorSpan = c13249.f42340;
        ForegroundColorSpan foregroundColorSpan2 = c13249.f42337;
        ViewOnClickListenerC2063 viewOnClickListenerC2063 = c13249.f42336;
        String string = charSequence == null ? "" : charSequence.toString();
        this.f50412 = string.length();
        boolean zStartsWith = string.startsWith("@");
        C7346<SpannableString> c7346 = this.f50413;
        String lowerCase3 = null;
        if (zStartsWith || string.startsWith("?")) {
            int iIndexOf2 = string.indexOf(47);
            boolean z = string.indexOf("android:") == 1;
            C19962 c19962 = this.f50408;
            if (iIndexOf2 == -1) {
                boolean zStartsWith2 = string.startsWith("?");
                int i2 = zStartsWith2 ? 1 : 2;
                if (this.f50409 != i2) {
                    this.f50409 = i2;
                    c7346.clear();
                    InterfaceC7206 interfaceC7206M48424 = viewOnClickListenerC2063.f6864.m48424();
                    if (interfaceC7206M48424 != null) {
                        m37048(interfaceC7206M48424, zStartsWith2);
                    }
                    if (interfaceC7206M48424 == null || !interfaceC7206M48424.mo19789()) {
                        m37048(C15407.m36884(), zStartsWith2);
                    }
                    c7346.sort(c19962);
                }
            } else {
                String strSubstring = z ? string.substring(9, iIndexOf2) : string.substring(1, iIndexOf2);
                int i3 = iIndexOf2 + 1;
                lowerCase3 = string.substring(i3).toLowerCase();
                if (lowerCase3.isEmpty()) {
                    i3 = -1;
                }
                int i4 = z ? 3 : 4;
                if (this.f50409 == i4) {
                    if (!strSubstring.equals(this.f50410)) {
                    }
                    i = i3;
                } else {
                    this.f50409 = i4;
                }
                this.f50410 = strSubstring;
                c7346.clear();
                InterfaceC7206 interfaceC7206M48425 = viewOnClickListenerC2063.f6864.m48424();
                if (z && (interfaceC7206M48425 == null || !interfaceC7206M48425.mo19789())) {
                    interfaceC7206M48425 = C15407.m36884();
                }
                String strConcat = strSubstring.equals("attr") ? "?" : "@";
                if (z) {
                    strConcat = strConcat.concat("android:");
                }
                String strM46451 = C20196.m46451(strConcat, strSubstring, "/");
                int i5 = z ? 1 : 127;
                m37047(interfaceC7206M48425, i5, strM46451);
                if (z) {
                    m37047(viewOnClickListenerC2063.f6864.m48424(), i5, strM46451);
                }
                c7346.sort(c19962);
                i = i3;
            }
            lowerCase = string.toLowerCase();
            c3681 = new C3681();
            for (SpannableString spannableString : c7346) {
                spannableString.removeSpan(foregroundColorSpan2);
                spannableString.removeSpan(foregroundColorSpan);
                lowerCase2 = spannableString.toString().toLowerCase();
                if (lowerCase2.startsWith(lowerCase)) {
                    c3681.m11973(spannableString, 0);
                    spannableString.setSpan(foregroundColorSpan2, 0, lowerCase.length(), 33);
                } else if (i == -1 && (iIndexOf = lowerCase2.indexOf(lowerCase3, i)) != -1) {
                    c3681.m11973(spannableString, iIndexOf);
                    spannableString.setSpan(foregroundColorSpan2, 0, i, 33);
                    spannableString.setSpan(foregroundColorSpan, iIndexOf, lowerCase3.length() + iIndexOf, 33);
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = c3681.m11975();
            filterResults.count = c3681.m11972();
            return filterResults;
        }
        this.f50409 = 0;
        c7346.clear();
        i = -1;
        lowerCase = string.toLowerCase();
        c3681 = new C3681();
        while (r6.hasNext()) {
            spannableString.removeSpan(foregroundColorSpan2);
            spannableString.removeSpan(foregroundColorSpan);
            lowerCase2 = spannableString.toString().toLowerCase();
            if (lowerCase2.startsWith(lowerCase)) {
                c3681.m11973(spannableString, 0);
                spannableString.setSpan(foregroundColorSpan2, 0, lowerCase.length(), 33);
            } else if (i == -1) {
            }
        }
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        filterResults2.values = c3681.m11975();
        filterResults2.count = c3681.m11972();
        return filterResults2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37048(InterfaceC7206 interfaceC7206, boolean z) {
        for (InterfaceC10869 interfaceC10869 : interfaceC7206.mo15672()) {
            boolean z2 = interfaceC10869.mo27607() == 1;
            Iterator it = interfaceC10869.mo19822().iterator();
            while (it.hasNext()) {
                String typeName = ((InterfaceC15344) it.next()).getTypeName();
                C7346 c7346 = this.f50413;
                if (z) {
                    if (typeName.equals("attr")) {
                        if (z2) {
                            c7346.m20162(new SpannableString("?android:attr/"));
                        } else {
                            c7346.m20162(new SpannableString("?attr/"));
                        }
                    }
                } else if (!typeName.equals("attr")) {
                    if (z2) {
                        c7346.m20162(new SpannableString(C14442.m34865("@android:", typeName, "/")));
                    } else {
                        c7346.m20162(new SpannableString(C14442.m34865("@", typeName, "/")));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37047(InterfaceC7206 interfaceC7206, int i, String str) {
        InterfaceC8697 interfaceC8697Mo9076;
        if (interfaceC7206 == null) {
            return;
        }
        for (InterfaceC10869 interfaceC10869 : interfaceC7206.mo15672()) {
            if (interfaceC10869.mo27607() == i) {
                for (InterfaceC15344 interfaceC15344 : interfaceC10869.mo19822()) {
                    if (interfaceC15344.getTypeName().equals(this.f50410)) {
                        int iMo4328 = interfaceC15344.mo4328();
                        for (int i2 = 0; i2 < iMo4328; i2++) {
                            for (InterfaceC2731 interfaceC2731 : interfaceC15344.mo33925()) {
                                if (interfaceC2731.mo9075(i2) && (interfaceC8697Mo9076 = interfaceC2731.mo9076(i2)) != null) {
                                    StringBuilder sbM27333 = C10732.m27333(str);
                                    sbM27333.append(interfaceC8697Mo9076.mo18156());
                                    this.f50413.m20162(new SpannableString(sbM27333.toString()));
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
        C13249 c13249 = this.f50411;
        c13249.f42335 = list;
        if (filterResults.count > 0) {
            c13249.notifyDataSetChanged();
        } else {
            c13249.notifyDataSetInvalidated();
        }
    }
}
