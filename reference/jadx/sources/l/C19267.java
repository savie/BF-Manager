package l;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩵ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: RCE9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19267 implements InterfaceC7978 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LocaleList f62214;

    public C19267(Object obj) {
        this.f62214 = (LocaleList) obj;
    }

    @Override // l.InterfaceC7978
    /* JADX INFO: renamed from: ܰ */
    public final Object mo21043() {
        return this.f62214;
    }

    @Override // l.InterfaceC7978
    public final Locale get(int i) {
        return this.f62214.get(i);
    }

    @Override // l.InterfaceC7978
    public final boolean isEmpty() {
        return this.f62214.isEmpty();
    }

    @Override // l.InterfaceC7978
    public final int size() {
        return this.f62214.size();
    }

    public final boolean equals(Object obj) {
        return this.f62214.equals(((InterfaceC7978) obj).mo21043());
    }

    public final int hashCode() {
        return this.f62214.hashCode();
    }

    public final String toString() {
        return this.f62214.toString();
    }

    @Override // l.InterfaceC7978
    /* JADX INFO: renamed from: ۙ */
    public final String mo21042() {
        return this.f62214.toLanguageTags();
    }
}
