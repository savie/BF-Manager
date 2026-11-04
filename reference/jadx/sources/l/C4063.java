package l;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: RCE9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4063 implements InterfaceC24201 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LocaleList f13875;

    public C4063(Object obj) {
        this.f13875 = (LocaleList) obj;
    }

    @Override // l.InterfaceC24201
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object mo13119() {
        return this.f13875;
    }

    @Override // l.InterfaceC24201
    public final Locale get(int i) {
        return this.f13875.get(i);
    }

    @Override // l.InterfaceC24201
    public final boolean isEmpty() {
        return this.f13875.isEmpty();
    }

    @Override // l.InterfaceC24201
    public final int size() {
        return this.f13875.size();
    }

    public final boolean equals(Object obj) {
        return this.f13875.equals(((InterfaceC24201) obj).mo13119());
    }

    public final int hashCode() {
        return this.f13875.hashCode();
    }

    public final String toString() {
        return this.f13875.toString();
    }

    @Override // l.InterfaceC24201
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo13118() {
        return this.f13875.toLanguageTags();
    }
}
