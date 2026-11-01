package l;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1H2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13895 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Class[] f45774 = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f45775 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7284 f45776;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f45777;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f45778;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f45779;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f45780;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bundle m33731(C13895 c13895) {
        LinkedHashMap linkedHashMap = c13895.f45779;
        Iterator it = C19710.m44831(c13895.f45778).entrySet().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                return C5155.m14302(new C15083("keys", arrayList), new C15083("values", arrayList2));
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            Bundle bundleMo8703 = ((InterfaceC7284) entry.getValue()).mo8703();
            C13465.m32966(str2, "key");
            if (bundleMo8703 != null) {
                while (true) {
                    if (i >= 29) {
                        throw new IllegalArgumentException("Can't put value with type " + bundleMo8703.getClass() + " into saved state");
                    }
                    Class cls = f45774[i];
                    C13465.m32962(cls);
                    if (cls.isInstance(bundleMo8703)) {
                        break;
                    }
                    i++;
                }
            }
            Object obj = c13895.f45780.get(str2);
            C9186 c9186 = obj instanceof C9186 ? (C9186) obj : null;
            if (c9186 != null) {
                c9186.mo23642(bundleMo8703);
            } else {
                linkedHashMap.put(str2, bundleMo8703);
            }
            InterfaceC20830 interfaceC20830 = (InterfaceC20830) c13895.f45777.get(str2);
            if (interfaceC20830 != null) {
                interfaceC20830.m46858();
            }
        }
    }

    public C13895(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f45779 = linkedHashMap;
        this.f45778 = new LinkedHashMap();
        this.f45780 = new LinkedHashMap();
        this.f45777 = new LinkedHashMap();
        this.f45776 = new InterfaceC7284() { // from class: l.ۗ᩺ۙ
            @Override // l.InterfaceC7284
            /* JADX INFO: renamed from: ۙ */
            public final Bundle mo8703() {
                return C13895.m33731(this.f13030);
            }
        };
        linkedHashMap.putAll(map);
    }

    public C13895() {
        this.f45779 = new LinkedHashMap();
        this.f45778 = new LinkedHashMap();
        this.f45780 = new LinkedHashMap();
        this.f45777 = new LinkedHashMap();
        this.f45776 = new InterfaceC7284() { // from class: l.ۗ᩺ۙ
            @Override // l.InterfaceC7284
            /* JADX INFO: renamed from: ۙ */
            public final Bundle mo8703() {
                return C13895.m33731(this.f13030);
            }
        };
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7284 m33732() {
        return this.f45776;
    }
}
