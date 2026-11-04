package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܽ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7NK */
/* JADX INFO: loaded from: classes5.dex */
public final class C17896 implements InterfaceC8770 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Pattern f58627 = Pattern.compile("^(//+)(?!noinspection|\\$NON-NLS-\\d+\\$)[^\\s/]");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC3726 f58628;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f58629;

    public C17896(String str, AbstractC3726 abstractC3726) {
        this.f58629 = str;
        this.f58628 = abstractC3726;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m41746(InterfaceC20660 interfaceC20660, final int i) {
        int i2;
        String string;
        if (!interfaceC20660.mo18731()) {
            return interfaceC20660.mo18733();
        }
        String strMo18733 = interfaceC20660.mo18733();
        if (interfaceC20660.mo18732() && this.f58628.mo12126()) {
            strMo18733 = C8355.m22488(i, strMo18733);
        }
        final ArrayList<String> arrayList = new ArrayList();
        Iterator itM48706 = C21406.m48706(strMo18733);
        while (true) {
            int i3 = 0;
            if (!itM48706.hasNext()) {
                break;
            }
            if (interfaceC20660.mo18726()) {
                AbstractC21825 abstractC21825M49482 = AbstractC21825.m49482();
                CharSequence charSequence = (CharSequence) itM48706.next();
                abstractC21825M49482.getClass();
                int length = charSequence.length();
                while (i3 < length && abstractC21825M49482.mo4420(charSequence.charAt(i3))) {
                    i3++;
                }
                do {
                    length--;
                    if (length <= i3) {
                        break;
                    }
                } while (abstractC21825M49482.mo4420(charSequence.charAt(length)));
                arrayList.add(charSequence.subSequence(i3, length + 1).toString());
            } else {
                AbstractC21825 abstractC21825M49483 = AbstractC21825.m49482();
                CharSequence charSequence2 = (CharSequence) itM48706.next();
                abstractC21825M49483.getClass();
                int length2 = charSequence2.length() - 1;
                while (true) {
                    if (length2 < 0) {
                        string = "";
                        break;
                    }
                    if (!abstractC21825M49483.mo4420(charSequence2.charAt(length2))) {
                        string = charSequence2.subSequence(0, length2 + 1).toString();
                        break;
                    }
                    length2--;
                }
                arrayList.add(string);
            }
        }
        if (!interfaceC20660.mo18726()) {
            return (String) C2804.m9273(interfaceC20660).orElseGet(new Supplier() { // from class: l.ܺ᩹ܽ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C17896.m41745(this.f55901, arrayList, i);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList();
        for (String strM : arrayList) {
            Matcher matcher = f58627.matcher(strM);
            if (matcher.find()) {
                int length3 = matcher.group(1).length();
                StringBuilder sb = new StringBuilder();
                sb.append(C8399.m22569(length3, "/"));
                sb.append(" ");
                strM = ExternalValue$$ExternalSyntheticOutline0.m(length3, strM, sb);
            }
            if (strM.startsWith("// MOE:")) {
                arrayList2.add(strM);
            } else {
                while (strM.length() + i > 100) {
                    int i4 = 100 - i;
                    while (i4 >= 2 && !AbstractC21825.m49482().mo4420(strM.charAt(i4))) {
                        i4--;
                    }
                    if (i4 <= 2) {
                        break;
                    }
                    arrayList2.add(strM.substring(0, i4));
                    strM = ExternalValue$$ExternalSyntheticOutline0.m(i4, strM, new StringBuilder("//"));
                }
                arrayList2.add(strM);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((String) arrayList2.get(0)).trim());
        String strM22569 = C8399.m22569(i, " ");
        for (i2 = 1; i2 < arrayList2.size(); i2++) {
            sb2.append(this.f58629);
            sb2.append(strM22569);
            sb2.append(((String) arrayList2.get(i2)).trim());
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41745(C17896 c17896, ArrayList arrayList, int i) {
        String str = c17896.f58629;
        Iterator it = arrayList.iterator();
        int i2 = 1;
        if (it.hasNext()) {
            String strTrim = ((String) it.next()).trim();
            if (!strTrim.startsWith("/**")) {
                if (strTrim.startsWith("/*")) {
                    while (true) {
                        if (it.hasNext()) {
                            if (!((String) it.next()).trim().startsWith("*")) {
                            }
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(((String) arrayList.get(0)).trim());
            String strM22569 = C8399.m22569(i + 1, " ");
            while (i2 < arrayList.size()) {
                sb.append(str);
                sb.append(strM22569);
                String strTrim2 = ((String) arrayList.get(i2)).trim();
                if (!strTrim2.startsWith("*")) {
                    sb.append("* ");
                }
                sb.append(strTrim2);
                i2++;
            }
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        int i3 = -1;
        for (int i4 = 1; i4 < arrayList.size(); i4++) {
            int iMo33825 = AbstractC21825.m49482().mo23311().mo33825((CharSequence) arrayList.get(i4));
            if (iMo33825 >= 0 && (i3 == -1 || iMo33825 < i3)) {
                i3 = iMo33825;
            }
        }
        sb2.append((String) arrayList.get(0));
        while (i2 < arrayList.size()) {
            sb2.append(str);
            sb2.append(C8399.m22569(i, " "));
            if (((String) arrayList.get(i2)).length() >= i3) {
                sb2.append(((String) arrayList.get(i2)).substring(i3));
            } else {
                sb2.append((String) arrayList.get(i2));
            }
            i2++;
        }
        return sb2.toString();
    }
}
