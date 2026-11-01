package l;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 97B5 */
/* JADX INFO: loaded from: classes3.dex */
public final class SharedPreferencesEditorC8848 implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f30383;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ SharedPreferencesC10259 f30384;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f30385 = new HashMap();

    public SharedPreferencesEditorC8848(SharedPreferencesC10259 sharedPreferencesC10259) {
        this.f30384 = sharedPreferencesC10259;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            remove(str);
            return this;
        }
        this.f30385.put(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            remove(str);
            return this;
        }
        this.f30385.put(str, new HashSet(set));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        this.f30385.put(str, Integer.valueOf(i));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        this.f30385.put(str, Long.valueOf(j));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        this.f30385.put(str, Float.valueOf(f));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        this.f30385.put(str, Boolean.valueOf(z));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f30385.put(str, SharedPreferencesC10259.f34977);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f30383 = true;
        this.f30385.clear();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        SharedPreferencesC10259.m26047(this.f30384, this.f30383, new HashMap(this.f30385));
        return true;
    }
}
