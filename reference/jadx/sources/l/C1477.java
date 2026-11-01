package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.֫֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1477 extends C9240 {
    public final /* synthetic */ C14179 d;

    public C1477(C14179 c14179) {
        this.d = c14179;
    }

    @Override // l.C9240
    public final String b(InterfaceC21233 interfaceC21233, InterfaceC11002 interfaceC11002, long j, EnumC4069 enumC4069, Locale locale) {
        return this.d.a(j, enumC4069);
    }

    @Override // l.C9240
    public final String c(InterfaceC11002 interfaceC11002, long j, EnumC4069 enumC4069, Locale locale) {
        return this.d.a(j, enumC4069);
    }

    @Override // l.C9240
    public final Iterator d(InterfaceC21233 interfaceC21233, InterfaceC11002 interfaceC11002, EnumC4069 enumC4069, Locale locale) {
        List list = (List) ((HashMap) this.d.b).get(enumC4069);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override // l.C9240
    public final Iterator e(InterfaceC11002 interfaceC11002, EnumC4069 enumC4069, Locale locale) {
        List list = (List) ((HashMap) this.d.b).get(enumC4069);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
