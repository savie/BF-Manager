package l;

import android.content.DialogInterface;
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

/* JADX INFO: renamed from: l.᩺᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SC */
/* JADX INFO: loaded from: classes.dex */
public final class C24538 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Set f79561;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20808 f79564;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ListView f79565;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final ArrayList f79563 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int f79562 = -1;

    static {
        HashSet hashSet = new HashSet();
        for (EnumC22631 enumC22631 : EnumC22631.values()) {
            hashSet.add(enumC22631.f73509);
        }
        f79561 = C4681.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m54820(C24132 c24132) {
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        int iM53968 = c24132.m53968();
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC19106M54021, '\n', iM53968 - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC19106M54021, '\n', iM53968);
        if (iIndexOf == -1) {
            iIndexOf = interfaceC19106M54021.length();
        }
        String strTrim = interfaceC19106M54021.subSequence(iLastIndexOf, iIndexOf).toString().trim();
        int iIndexOf2 = strTrim.indexOf(32);
        if (iIndexOf2 != -1) {
            strTrim = strTrim.substring(0, iIndexOf2);
        }
        if (f79561.contains(strTrim)) {
            return strTrim;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0081  */
    public C24538(final AbstractActivityC17204 abstractActivityC17204, String str) {
        int i;
        synchronized (C24538.class) {
            Locale locale = C21576.m49084().getResources().getConfiguration().locale;
            String language = locale.getLanguage();
            int iHashCode = language.hashCode();
            if (iHashCode != 3139) {
                if (iHashCode != 3365) {
                    if (iHashCode != 3651) {
                        if (iHashCode != 3710) {
                            if (iHashCode != 3734) {
                                if (iHashCode == 3886 && language.equals("zh")) {
                                    i = "CN".equals(locale.getCountry()) ? 0 : 1;
                                } else {
                                    i = 2;
                                }
                            } else if (language.equals("uk")) {
                                i = 4;
                            } else {
                                i = 2;
                            }
                        } else if (language.equals("tr")) {
                            i = 6;
                        } else {
                            i = 2;
                        }
                    } else if (language.equals("ru")) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                } else if (language.equals("in")) {
                    i = 5;
                } else {
                    i = 2;
                }
            } else if (language.equals("be")) {
                i = 7;
            } else {
                i = 2;
            }
            if (f79562 != i) {
                f79563.clear();
                try {
                    InputStream inputStreamOpen = C21576.m49086().open("8");
                    try {
                        C20348 c20348 = new C20348(C20244.m46522(inputStreamOpen, 0));
                        for (int i2 = 0; i2 < i; i2++) {
                            c20348.skipBytes(c20348.readInt());
                        }
                        byte[] bArrM46748 = c20348.m46748();
                        for (int i3 = 0; i3 < bArrM46748.length; i3++) {
                            bArrM46748[i3] = (byte) ((~bArrM46748[i3]) ^ (i3 * i3));
                        }
                        for (String str2 : new String(bArrM46748, Charset.defaultCharset()).split("\n\n")) {
                            int iIndexOf = str2.indexOf(10);
                            f79563.add(new C6638(str2.substring(0, iIndexOf).trim(), str2.substring(iIndexOf + 1).trim()));
                        }
                        f79562 = i;
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
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        C7308 c7308 = (C7308) viewM40395.findViewById(R.id.searchView);
        TextView textView = (TextView) viewM40395.findViewById(R.id.title);
        ListView listView = (ListView) viewM40395.findViewById(R.id.MT_Protector);
        this.f79565 = listView;
        C20808 c20808 = new C20808(this);
        this.f79564 = c20808;
        listView.setAdapter((ListAdapter) c20808);
        listView.setFastScrollEnabled(true);
        C18597.m43179(listView);
        textView.setText(R.string.MT_Protector);
        c7308.m20007(new C3654(this, textView));
        if (!TextUtils.isEmpty(str)) {
            c7308.m20013(false);
            c7308.m20006(str);
            listView.requestFocus();
        }
        int i4 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, null);
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361.m8016();
        if (abstractActivityC17204 instanceof ActivityC6682) {
            dialogInterfaceC8327M8016.m22426(new DialogInterface.OnDismissListener() { // from class: l.᩹᩶ۧ
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    abstractActivityC17204.finish();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static CharSequence m54819(String str, CharSequence charSequence, int i) {
        int i2 = C24276.f78588;
        AbstractC21292 abstractC21292 = AbstractC21292.f67895;
        int iMo13267 = abstractC21292.mo13267(charSequence, str, 0);
        if (iMo13267 == -1) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        do {
            spannableString.setSpan(new StyleSpan(1), iMo13267, str.length() + iMo13267, 33);
            spannableString.setSpan(new ForegroundColorSpan(i), iMo13267, str.length() + iMo13267, 33);
            iMo13267 = abstractC21292.mo13267(charSequence, str, str.length() + iMo13267);
        } while (iMo13267 != -1);
        return spannableString;
    }
}
