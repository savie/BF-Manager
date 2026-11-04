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
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚ᩸۫, reason: contains not printable characters */
/* JADX INFO: compiled from: YAPP */
/* JADX INFO: loaded from: classes3.dex */
public final class C5938 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m17253(List list, String str, String str2, String str3, boolean z, Map map) {
        SimpleDateFormat simpleDateFormat;
        String strReplace;
        String strM39284;
        int i;
        boolean zIsEmpty = str2.isEmpty();
        C4245 c4245Matcher = (zIsEmpty || !z) ? null : C18415.m42925(str2).matcher((CharSequence) "");
        ArrayList arrayList = new ArrayList(list.size());
        try {
            String string = ApplicationC17729.f58258.getString("rdtp", "yyyy-MM-dd_HH-mm-ss");
            if (string.trim().isEmpty()) {
                string = "yyyy-MM-dd_HH-mm-ss";
            }
            simpleDateFormat = new SimpleDateFormat(string, Locale.ENGLISH);
        } catch (Exception unused) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.ENGLISH);
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        C18415 c18415M42925 = C18415.m42925("\\{([0-9]+)}");
        C18415 c18415M42926 = C18415.m42925("\\{z([0-9]+)}");
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) list.get(i2);
            String name = interfaceC2386.getName();
            long time = interfaceC2386.getTime();
            int size2 = list.size();
            int iLastIndexOf = name.lastIndexOf(46);
            int i3 = size;
            ArrayList arrayList2 = arrayList;
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
            C15632 c15632 = (C15632) map.get(name);
            if (strReplace.contains("{E}")) {
                Long lValueOf = c15632 == null ? null : c15632.f50771;
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(time);
                }
                strReplace = strReplace.replace("{E}", simpleDateFormat2.format(lValueOf));
            }
            C11381 c11381 = c15632 == null ? null : c15632.f50770;
            if (c11381 == null) {
                strM39284 = C16602.m39284(strReplace, "NULL", "NULL", "NULL", "NULL");
            } else {
                strM39284 = C16602.m39284(strReplace, c11381.m28715(), c11381.m28718(), c11381.m28716(), String.valueOf(c11381.m28712()));
            }
            C4245 c4245Matcher2 = c18415M42925.matcher((CharSequence) "");
            while (true) {
                c4245Matcher2.m13568reset((CharSequence) strM39284);
                i = 1;
                if (!c4245Matcher2.find()) {
                    break;
                }
                String strGroup = c4245Matcher2.group(1);
                C17359.requireNonNull(strGroup);
                strM39284 = strM39284.substring(0, c4245Matcher2.start()) + (Integer.parseInt(strGroup) + i2) + strM39284.substring(c4245Matcher2.end());
            }
            C4245 c4245Matcher3 = c18415M42926.matcher((CharSequence) "");
            while (true) {
                c4245Matcher3.m13568reset((CharSequence) strM39284);
                if (!c4245Matcher3.find()) {
                    break;
                }
                String strGroup2 = c4245Matcher3.group(i);
                C17359.requireNonNull(strGroup2);
                int i4 = Integer.parseInt(strGroup2);
                int length = String.valueOf((i4 + size2) - i).length();
                StringBuilder sb = new StringBuilder();
                SimpleDateFormat simpleDateFormat3 = simpleDateFormat2;
                sb.append(strM39284.substring(0, c4245Matcher3.start()));
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
                sb.append(strM39284.substring(c4245Matcher3.end()));
                strM39284 = sb.toString();
                i = 1;
                simpleDateFormat2 = simpleDateFormat3;
            }
            SimpleDateFormat simpleDateFormat4 = simpleDateFormat2;
            if (!zIsEmpty) {
                if (c4245Matcher != null) {
                    String strM11067 = C3369.m11067(strM39284, str3, c4245Matcher, true, false, null, new ArrayList(1));
                    if (strM11067 != null) {
                        strM39284 = strM11067;
                    }
                } else {
                    strM39284 = strM39284.replace(str2, str3);
                }
            }
            arrayList2.add(new C13395(name, strM39284));
            i2++;
            size = i3;
            arrayList = arrayList2;
            simpleDateFormat2 = simpleDateFormat4;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m17252(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(((C13395) it.next()).f42688.toLowerCase());
        }
        while (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                C13395 c13395 = (C13395) it2.next();
                String lowerCase = c13395.f42688.toLowerCase();
                String lowerCase2 = c13395.f42686.toLowerCase();
                if (!hashSet.contains(lowerCase2) || lowerCase.equals(lowerCase2)) {
                    hashSet.remove(lowerCase);
                    hashSet.remove(lowerCase2);
                    arrayList3.add(c13395);
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
    public static void m17255(AbstractActivityC17204 abstractActivityC17204, ArrayList arrayList) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        ListView listView = (ListView) viewM40395.findViewById(R.id.MT_Protector);
        C18597.m43179(listView);
        listView.setAdapter((ListAdapter) new C19131(R.layout.MT_Protector, abstractActivityC17204, arrayList));
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17254(C3700 c3700, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13395 c13395 = (C13395) it.next();
            c13395.f42687 = c3700.m12022(c13395.f42688, c13395.f42686);
        }
    }
}
