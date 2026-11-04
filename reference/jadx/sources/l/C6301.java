package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: UT8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6301 implements InterfaceC24201 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Locale[] f21370 = new Locale[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Locale[] f21371;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f21372;

    @Override // l.InterfaceC24201
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo13119() {
        return null;
    }

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } else if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else {
            if (strArrSplit.length == 1) {
                new Locale(strArrSplit[0]);
                return;
            }
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    @Override // l.InterfaceC24201
    public final Locale get(int i) {
        if (i < 0) {
            return null;
        }
        Locale[] localeArr = this.f21371;
        if (i < localeArr.length) {
            return localeArr[i];
        }
        return null;
    }

    @Override // l.InterfaceC24201
    public final boolean isEmpty() {
        return this.f21371.length == 0;
    }

    @Override // l.InterfaceC24201
    public final int size() {
        return this.f21371.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6301)) {
            return false;
        }
        Locale[] localeArr = ((C6301) obj).f21371;
        Locale[] localeArr2 = this.f21371;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i = 0; i < localeArr2.length; i++) {
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f21371) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f21371;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    @Override // l.InterfaceC24201
    /* JADX INFO: renamed from: ۙ */
    public final String mo13118() {
        return this.f21372;
    }

    public C6301(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f21371 = f21370;
            this.f21372 = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                throw new NullPointerException(C14442.m34864(i, "list[", "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb.append('-');
                    sb.append(locale2.getCountry());
                }
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f21371 = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f21372 = sb.toString();
    }
}
