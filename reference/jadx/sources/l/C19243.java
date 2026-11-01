package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩵ۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C7NK */
/* JADX INFO: loaded from: classes5.dex */
public final class C19243 implements InterfaceC13553 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f62179 = Pattern.compile("^(//+)(?!noinspection|\\$NON-NLS-\\d+\\$)[^\\s/]");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC7248 f62180;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f62181;

    public C19243(String str, AbstractC7248 abstractC7248) {
        this.f62181 = str;
        this.f62180 = abstractC7248;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m44198(InterfaceC20608 interfaceC20608, final int i) {
        int i2;
        String string;
        if (!interfaceC20608.mo37429()) {
            return interfaceC20608.mo37426();
        }
        String strMo37426 = interfaceC20608.mo37426();
        if (interfaceC20608.mo37432() && this.f62180.mo19378()) {
            strMo37426 = C11689.m29181(i, strMo37426);
        }
        final ArrayList<String> arrayList = new ArrayList();
        Iterator itM39861 = C17080.m39861(strMo37426);
        while (true) {
            int i3 = 0;
            if (!itM39861.hasNext()) {
                break;
            }
            if (interfaceC20608.mo37428()) {
                AbstractC14384 abstractC14384M34616 = AbstractC14384.m34616();
                CharSequence charSequence = (CharSequence) itM39861.next();
                abstractC14384M34616.getClass();
                int length = charSequence.length();
                while (i3 < length && abstractC14384M34616.mo1772(charSequence.charAt(i3))) {
                    i3++;
                }
                do {
                    length--;
                    if (length <= i3) {
                        break;
                    }
                } while (abstractC14384M34616.mo1772(charSequence.charAt(length)));
                arrayList.add(charSequence.subSequence(i3, length + 1).toString());
            } else {
                AbstractC14384 abstractC14384M34617 = AbstractC14384.m34616();
                CharSequence charSequence2 = (CharSequence) itM39861.next();
                abstractC14384M34617.getClass();
                int length2 = charSequence2.length() - 1;
                while (true) {
                    if (length2 < 0) {
                        string = "";
                        break;
                    }
                    if (!abstractC14384M34617.mo1772(charSequence2.charAt(length2))) {
                        string = charSequence2.subSequence(0, length2 + 1).toString();
                        break;
                    }
                    length2--;
                }
                arrayList.add(string);
            }
        }
        if (!interfaceC20608.mo37428()) {
            return (String) C4379.m12231(interfaceC20608).orElseGet(new Supplier() { // from class: l.۠ۙ᩸
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C19243.m44197(this.f26128, arrayList, i);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList();
        for (String strM1616 : arrayList) {
            Matcher matcher = f62179.matcher(strM1616);
            if (matcher.find()) {
                int length3 = matcher.group(1).length();
                StringBuilder sb = new StringBuilder();
                sb.append(C11249.m28219(length3, "/"));
                sb.append(" ");
                strM1616 = C0242.m1616(length3, strM1616, sb);
            }
            if (strM1616.startsWith("// MOE:")) {
                arrayList2.add(strM1616);
            } else {
                while (strM1616.length() + i > 100) {
                    int i4 = 100 - i;
                    while (i4 >= 2 && !AbstractC14384.m34616().mo1772(strM1616.charAt(i4))) {
                        i4--;
                    }
                    if (i4 <= 2) {
                        break;
                    }
                    arrayList2.add(strM1616.substring(0, i4));
                    strM1616 = C0242.m1616(i4, strM1616, new StringBuilder("//"));
                }
                arrayList2.add(strM1616);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((String) arrayList2.get(0)).trim());
        String strM28219 = C11249.m28219(i, " ");
        for (i2 = 1; i2 < arrayList2.size(); i2++) {
            sb2.append(this.f62181);
            sb2.append(strM28219);
            sb2.append(((String) arrayList2.get(i2)).trim());
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m44197(C19243 c19243, ArrayList arrayList, int i) {
        String str = c19243.f62181;
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
            String strM28219 = C11249.m28219(i + 1, " ");
            while (i2 < arrayList.size()) {
                sb.append(str);
                sb.append(strM28219);
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
            int iMo27211 = AbstractC14384.m34616().mo27209().mo27211((CharSequence) arrayList.get(i4));
            if (iMo27211 >= 0 && (i3 == -1 || iMo27211 < i3)) {
                i3 = iMo27211;
            }
        }
        sb2.append((String) arrayList.get(0));
        while (i2 < arrayList.size()) {
            sb2.append(str);
            sb2.append(C11249.m28219(i, " "));
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
