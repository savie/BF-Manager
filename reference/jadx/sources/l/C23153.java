package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩺ᩳ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: W7S0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23153 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f75155;

    public C23153(C15392 c15392) {
        c15392.f50101.getClass();
        this.f75155 = new HashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51146(C6656 c6656) {
        return this.f75155.containsKey(c6656);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m51144(AbstractC8774 abstractC8774) {
        C6924 c6924 = (C6924) this.f75155.get(abstractC8774);
        InterfaceC9042 interfaceC9042 = c6924 == null ? null : c6924.f23293;
        if (interfaceC9042 == null) {
            return null;
        }
        return interfaceC9042.getText();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51145(AbstractC8774 abstractC8774, InterfaceC9042 interfaceC9042) {
        this.f75155.put(abstractC8774, new C6924(interfaceC9042));
    }
}
