package l;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4475 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f15919 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int f15920 = -1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Set f15921;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1570 f15922;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ListView f15923;

    static {
        HashSet hashSet = new HashSet();
        for (EnumC10297 enumC10297 : EnumC10297.values()) {
            hashSet.add(enumC10297.f35326);
        }
        f15921 = C0561.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m12493(C6111 c6111) {
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        int iM16916 = c6111.m16916();
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC2916M17000, '\n', iM16916 - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC2916M17000, '\n', iM16916);
        if (iIndexOf == -1) {
            iIndexOf = interfaceC2916M17000.length();
        }
        String strTrim = interfaceC2916M17000.subSequence(iLastIndexOf, iIndexOf).toString().trim();
        int iIndexOf2 = strTrim.indexOf(32);
        if (iIndexOf2 != -1) {
            strTrim = strTrim.substring(0, iIndexOf2);
        }
        if (f15921.contains(strTrim)) {
            return strTrim;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0081  */
    public C4475(AbstractActivityC12483 abstractActivityC12483, String str) {
        int i;
        int i2;
        synchronized (C4475.class) {
            Locale locale = C16737.m39277().getResources().getConfiguration().locale;
            String language = locale.getLanguage();
            int iHashCode = language.hashCode();
            i = 1;
            if (iHashCode != 3139) {
                if (iHashCode != 3365) {
                    if (iHashCode != 3651) {
                        if (iHashCode != 3710) {
                            if (iHashCode != 3734) {
                                if (iHashCode == 3886 && language.equals("zh")) {
                                    i2 = "CN".equals(locale.getCountry()) ? 0 : 1;
                                } else {
                                    i2 = 2;
                                }
                            } else if (language.equals("uk")) {
                                i2 = 4;
                            } else {
                                i2 = 2;
                            }
                        } else if (language.equals("tr")) {
                            i2 = 6;
                        } else {
                            i2 = 2;
                        }
                    } else if (language.equals("ru")) {
                        i2 = 3;
                    } else {
                        i2 = 2;
                    }
                } else if (language.equals("in")) {
                    i2 = 5;
                } else {
                    i2 = 2;
                }
            } else if (language.equals("be")) {
                i2 = 7;
            } else {
                i2 = 2;
            }
            if (f15920 != i2) {
                f15919.clear();
                try {
                    InputStream inputStreamOpen = C16737.m39286().open("8");
                    try {
                        C17367 c17367 = new C17367(C19431.m44470(inputStreamOpen, 0));
                        for (int i3 = 0; i3 < i2; i3++) {
                            c17367.skipBytes(c17367.readInt());
                        }
                        byte[] bArrM40451 = c17367.m40451();
                        for (int i4 = 0; i4 < bArrM40451.length; i4++) {
                            bArrM40451[i4] = (byte) ((~bArrM40451[i4]) ^ (i4 * i4));
                        }
                        for (String str2 : new String(bArrM40451, Charset.defaultCharset()).split("\n\n")) {
                            int iIndexOf = str2.indexOf(10);
                            f15919.add(new C2981(str2.substring(0, iIndexOf).trim(), str2.substring(iIndexOf + 1).trim()));
                        }
                        f15920 = i2;
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                    } catch (Throwable th) {
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        C1439 c1439 = (C1439) viewM30995.findViewById(R.id.searchView);
        TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        ListView listView = (ListView) viewM30995.findViewById(R.id.MT_Protector);
        this.f15923 = listView;
        C1570 c1570 = new C1570(this);
        this.f15922 = c1570;
        listView.setAdapter((ListAdapter) c1570);
        listView.setFastScrollEnabled(true);
        C16754.m39314(listView);
        textView.setText(R.string.MT_Protector);
        c1439.m5029(new C14272(this, textView));
        if (!TextUtils.isEmpty(str)) {
            c1439.m5034(false);
            c1439.m5028(str);
            listView.requestFocus();
        }
        int i5 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, null);
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067.m21269();
        if (abstractActivityC12483 instanceof ActivityC15577) {
            dialogInterfaceC19356M21269.m44367(new DialogInterfaceOnDismissListenerC13726(abstractActivityC12483, i));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static CharSequence m12492(String str, CharSequence charSequence, int i) {
        int iM18453 = C6851.m18453(str, charSequence, 0);
        if (iM18453 == -1) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        do {
            spannableString.setSpan(new StyleSpan(1), iM18453, str.length() + iM18453, 33);
            spannableString.setSpan(new ForegroundColorSpan(i), iM18453, str.length() + iM18453, 33);
            iM18453 = C6851.m18453(str, charSequence, str.length() + iM18453);
        } while (iM18453 != -1);
        return spannableString;
    }
}
