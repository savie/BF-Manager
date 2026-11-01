package l;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: YAPP */
/* JADX INFO: loaded from: classes2.dex */
public final class C3906 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m11359(ArrayList arrayList, String str, String str2, String str3, boolean z, Map map) {
        SimpleDateFormat simpleDateFormat;
        String strReplace;
        int i;
        boolean zIsEmpty = str2.isEmpty();
        C6222 c6222Matcher = (zIsEmpty || !z) ? null : C14690.m35219(str2).matcher((CharSequence) "");
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        try {
            String string = ApplicationC0716.f2992.getString("rdtp", "yyyy-MM-dd_HH-mm-ss");
            if (string.trim().isEmpty()) {
                string = "yyyy-MM-dd_HH-mm-ss";
            }
            simpleDateFormat = new SimpleDateFormat(string, Locale.ENGLISH);
        } catch (Exception unused) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.ENGLISH);
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        C14690 c14690M35219 = C14690.m35219("\\{([0-9]+)}");
        C14690 c14690M352110 = C14690.m35219("\\{z([0-9]+)}");
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) arrayList.get(i2);
            String name = interfaceC2557.getName();
            long time = interfaceC2557.getTime();
            int size2 = arrayList.size();
            int iLastIndexOf = name.lastIndexOf(46);
            int i3 = size;
            ArrayList arrayList3 = arrayList2;
            if (iLastIndexOf != -1) {
                strReplace = str.contains("{P}") ? str.replace("{P}", name.substring(0, iLastIndexOf)) : str;
                if (strReplace.contains("{S}")) {
                    strReplace = strReplace.replace("{S}", name.substring(iLastIndexOf));
                }
            } else {
                strReplace = str.contains("{P}") ? str.replace("{P}", name) : str;
                if (strReplace.contains("{S}")) {
                    strReplace = strReplace.replace("{S}", "");
                }
            }
            if (strReplace.contains("{T}")) {
                strReplace = strReplace.replace("{T}", simpleDateFormat2.format(Long.valueOf(time)));
            }
            C1084 c1084 = (C1084) map.get(name);
            if (strReplace.contains("{E}")) {
                Long lValueOf = c1084 == null ? null : c1084.f4949;
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(time);
                }
                strReplace = strReplace.replace("{E}", simpleDateFormat2.format(lValueOf));
            }
            C18310 c18310 = c1084 == null ? null : c1084.f4948;
            if (strReplace.contains("{AN}")) {
                strReplace = strReplace.replace("{AN}", c18310 == null ? "NULL" : c18310.m42532());
            }
            if (strReplace.contains("{AP}")) {
                strReplace = strReplace.replace("{AP}", c18310 == null ? "NULL" : c18310.m42535());
            }
            if (strReplace.contains("{AV}")) {
                strReplace = strReplace.replace("{AV}", c18310 == null ? "NULL" : c18310.m42531());
            }
            if (strReplace.contains("{AC}")) {
                strReplace = strReplace.replace("{AC}", c18310 != null ? String.valueOf(c18310.m42528()) : "NULL");
            }
            C6222 c6222Matcher2 = c14690M35219.matcher((CharSequence) "");
            while (true) {
                c6222Matcher2.m17276reset((CharSequence) strReplace);
                i = 1;
                if (!c6222Matcher2.find()) {
                    break;
                }
                String strGroup = c6222Matcher2.group(1);
                C13638.requireNonNull(strGroup);
                strReplace = strReplace.substring(0, c6222Matcher2.start()) + (Integer.parseInt(strGroup) + i2) + strReplace.substring(c6222Matcher2.end());
            }
            C6222 c6222Matcher3 = c14690M352110.matcher((CharSequence) "");
            String strReplace2 = strReplace;
            while (true) {
                c6222Matcher3.m17276reset((CharSequence) strReplace2);
                if (!c6222Matcher3.find()) {
                    break;
                }
                String strGroup2 = c6222Matcher3.group(i);
                C13638.requireNonNull(strGroup2);
                int i4 = Integer.parseInt(strGroup2);
                int length = String.valueOf((i4 + size2) - i).length();
                StringBuilder sb = new StringBuilder();
                SimpleDateFormat simpleDateFormat3 = simpleDateFormat2;
                sb.append(strReplace2.substring(0, c6222Matcher3.start()));
                String strValueOf = String.valueOf(i4 + i2);
                int length2 = length - strValueOf.length();
                if (length2 > 0) {
                    StringBuilder sb2 = new StringBuilder(length);
                    while (length2 > 0) {
                        sb2.append('0');
                        length2--;
                    }
                    sb2.append(strValueOf);
                    strValueOf = sb2.toString();
                }
                sb.append(strValueOf);
                sb.append(strReplace2.substring(c6222Matcher3.end()));
                strReplace2 = sb.toString();
                i = 1;
                simpleDateFormat2 = simpleDateFormat3;
            }
            SimpleDateFormat simpleDateFormat4 = simpleDateFormat2;
            if (!zIsEmpty) {
                if (c6222Matcher != null) {
                    String strM31635 = C12733.m31635(strReplace2, str3, c6222Matcher, true, false, null, new ArrayList(1));
                    if (strM31635 != null) {
                        strReplace2 = strM31635;
                    }
                } else {
                    strReplace2 = strReplace2.replace(str2, str3);
                }
            }
            arrayList3.add(new C13080(name, strReplace2));
            i2++;
            size = i3;
            arrayList2 = arrayList3;
            simpleDateFormat2 = simpleDateFormat4;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m11358(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(((C13080) it.next()).f43578.toLowerCase());
        }
        while (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                C13080 c13080 = (C13080) it2.next();
                String lowerCase = c13080.f43578.toLowerCase();
                String lowerCase2 = c13080.f43576.toLowerCase();
                if (!hashSet.contains(lowerCase2) || lowerCase.equals(lowerCase2)) {
                    hashSet.remove(lowerCase);
                    hashSet.remove(lowerCase2);
                    arrayList3.add(c13080);
                    it2.remove();
                    z = true;
                }
            }
            if (!z) {
                arrayList3.addAll(arrayList2);
                break;
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11360(AbstractActivityC12483 abstractActivityC12483, ArrayList arrayList) {
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        ListView listView = (ListView) viewM30995.findViewById(R.id.MT_Protector);
        C16754.m39314(listView);
        listView.setAdapter((ListAdapter) new C4406(R.layout.MT_Protector, abstractActivityC12483, arrayList));
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11361(C19430 c19430, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13080 c13080 = (C13080) it.next();
            c13080.f43577 = c19430.m44467(c13080.f43578, c13080.f43576);
        }
    }
}
