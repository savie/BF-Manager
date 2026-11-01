package l;

import android.app.Person;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 374 */
/* JADX INFO: loaded from: classes.dex */
public final class C1461 {

    /* JADX INFO: renamed from: ۡ᩹ۗ, reason: not valid java name and contains not printable characters */
    public static int f5957;

    /* JADX INFO: renamed from: ֫֫֫, reason: not valid java name and contains not printable characters */
    public static String m5070(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ֫ۜ۠, reason: not valid java name and contains not printable characters */
    public static String m5071(Object obj) {
        return ((String) obj).toLowerCase();
    }

    /* JADX INFO: renamed from: ۖ۠᩻, reason: not valid java name and contains not printable characters */
    public static Iterator m5072(Object obj) {
        return ((List) obj).iterator();
    }

    /* JADX INFO: renamed from: ۖܶۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5073() {
        return C1709.m5692();
    }

    /* JADX INFO: renamed from: ۖܺۧ, reason: not valid java name and contains not printable characters */
    public static void m5074(Object obj) {
        ((C14638) obj).m35142();
    }

    /* JADX INFO: renamed from: ۛ᩻۠, reason: not valid java name and contains not printable characters */
    public static Set m5077(Object obj) {
        return ((InterfaceC15001) obj).mo34148();
    }

    /* JADX INFO: renamed from: ۧ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m5078(Object obj, Object obj2) {
        return ((ArrayList) obj).contains(obj2);
    }

    /* JADX INFO: renamed from: ܺܿۜ, reason: not valid java name and contains not printable characters */
    public static boolean m5079(Object obj) {
        return ((C5202) obj).m14380();
    }

    /* JADX INFO: renamed from: ܽۖܿ, reason: not valid java name and contains not printable characters */
    public static boolean m5080() {
        return false;
    }

    /* JADX INFO: renamed from: ᩳۘ۫, reason: not valid java name and contains not printable characters */
    public static boolean m5081(Object obj) {
        return C14952.m35723((String) obj);
    }

    /* JADX INFO: renamed from: ᩵֨ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m5082(Object obj, Object obj2) {
        return ((C11545) obj).m28814((String) obj2);
    }

    /* JADX INFO: renamed from: ᩵ܿۛ, reason: not valid java name and contains not printable characters */
    public static void m5083(Object obj, Object obj2) {
        ((TextView) obj).setText((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ᩶ۙ۬, reason: not valid java name and contains not printable characters */
    public static void m5084(Object obj, Object obj2, Object obj3) {
        ((C10142) obj).m25768((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ᩸۠۠, reason: not valid java name and contains not printable characters */
    public static void m5085(Object obj) {
        ((ArrayList) obj).clear();
    }

    /* JADX INFO: renamed from: ᩹ۡ۟, reason: not valid java name and contains not printable characters */
    public static int m5086(Object obj) {
        return ((SpannableStringBuilder) obj).length();
    }

    /* JADX INFO: renamed from: ᩻᩸ۘ, reason: not valid java name and contains not printable characters */
    public static int m5087(Object obj) {
        return ((TextView) obj).length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9224 m5076(Person person) {
        CharSequence name = person.getName();
        C16775 c16775M39336 = person.getIcon() != null ? C16775.m39336(person.getIcon()) : null;
        String uri = person.getUri();
        String key = person.getKey();
        boolean zIsBot = person.isBot();
        boolean zIsImportant = person.isImportant();
        C9224 c9224 = new C9224();
        c9224.f31358 = name;
        c9224.f31357 = c16775M39336;
        c9224.f31361 = uri;
        c9224.f31356 = key;
        c9224.f31360 = zIsBot;
        c9224.f31359 = zIsImportant;
        return c9224;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Person m5075(C9224 c9224) {
        Person.Builder name = new Person.Builder().setName(c9224.f31358);
        C16775 c16775 = c9224.f31357;
        return name.setIcon(c16775 != null ? c16775.m39345((Context) null) : null).setUri(c9224.f31361).setKey(c9224.f31356).setBot(c9224.f31360).setImportant(c9224.f31359).build();
    }
}
