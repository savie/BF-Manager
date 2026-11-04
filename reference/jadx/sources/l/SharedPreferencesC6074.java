package l;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۛ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97B5 */
/* JADX INFO: loaded from: classes3.dex */
public final class SharedPreferencesC6074 implements SharedPreferences {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Object f20792 = new Object();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f20795 = new Object();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f20794 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f20793 = new LinkedHashSet();

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        Map mapUnmodifiableMap;
        synchronized (this.f20795) {
            HashMap map = new HashMap(this.f20794.size());
            for (Map.Entry entry : this.f20794.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Set) {
                    value = new HashSet((Set) value);
                }
                map.put(str, value);
            }
            mapUnmodifiableMap = C4681.unmodifiableMap(map);
        }
        return mapUnmodifiableMap;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        synchronized (this.f20795) {
            Object obj = this.f20794.get(str);
            if (obj instanceof String) {
                str2 = (String) obj;
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        synchronized (this.f20795) {
            Object obj = this.f20794.get(str);
            if (!(obj instanceof Set)) {
                return set;
            }
            return new HashSet((Set) obj);
        }
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        synchronized (this.f20795) {
            Object obj = this.f20794.get(str);
            if (obj instanceof Integer) {
                i = ((Integer) obj).intValue();
            }
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        synchronized (this.f20795) {
            Object obj = this.f20794.get(str);
            if (obj instanceof Long) {
                j = ((Long) obj).longValue();
            }
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        synchronized (this.f20795) {
            Object obj = this.f20794.get(str);
            if (obj instanceof Float) {
                f = ((Float) obj).floatValue();
            }
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        synchronized (this.f20795) {
            Object obj = this.f20794.get(str);
            if (obj instanceof Boolean) {
                z = ((Boolean) obj).booleanValue();
            }
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        boolean zContainsKey;
        synchronized (this.f20795) {
            zContainsKey = this.f20794.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC12039(this);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f20795) {
            this.f20793.add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f20795) {
            this.f20793.remove(onSharedPreferenceChangeListener);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17586(SharedPreferencesC6074 sharedPreferencesC6074, boolean z, HashMap map) {
        ArrayList<String> arrayList = new ArrayList();
        synchronized (sharedPreferencesC6074.f20795) {
            if (z) {
                if (!sharedPreferencesC6074.f20794.isEmpty()) {
                    arrayList.addAll(sharedPreferencesC6074.f20794.keySet());
                    sharedPreferencesC6074.f20794.clear();
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != f20792) {
                    if (value instanceof Set) {
                        value = new HashSet((Set) value);
                    }
                    if (!C17359.equals(sharedPreferencesC6074.f20794.put(str, value), value)) {
                        arrayList.add(str);
                    }
                } else if (sharedPreferencesC6074.f20794.containsKey(str)) {
                    sharedPreferencesC6074.f20794.remove(str);
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty() && !sharedPreferencesC6074.f20793.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(sharedPreferencesC6074.f20793);
                for (String str2 : arrayList) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((SharedPreferences.OnSharedPreferenceChangeListener) it.next()).onSharedPreferenceChanged(sharedPreferencesC6074, str2);
                    }
                }
            }
        }
    }
}
