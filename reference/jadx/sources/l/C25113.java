package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1V2 */
/* JADX INFO: loaded from: classes.dex */
public final class C25113 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f81217 = new HashMap();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f81218;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f81219;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8304 m55987(C24404 c24404, InterfaceC8304 interfaceC8304, C24367 c24367) {
        String str = (String) this.f81217.get(new C3615(interfaceC8304.getName(), AbstractC5107.m15451(interfaceC8304, c24367), false));
        if (str == null) {
            return null;
        }
        return new C1992(c24404, interfaceC8304, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4859 m55986(C24404 c24404, InterfaceC4859 interfaceC4859, C24367 c24367) {
        String str = (String) this.f81217.get(new C3615(interfaceC4859.getName(), AbstractC5107.m15450(interfaceC4859, c24367), true));
        if (str == null) {
            return null;
        }
        return new C11686(c24404, interfaceC4859, str);
    }

    public C25113(String str, String str2) {
        this.f81218 = str;
        this.f81219 = str2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m55990() {
        return this.f81218;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m55984() {
        return this.f81219;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m55985(String str) {
        for (Map.Entry entry : this.f81217.entrySet()) {
            C3615 c3615 = (C3615) entry.getKey();
            if (!c3615.m11731() && c3615.m11732().equals(str)) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m55991(String str) {
        for (Map.Entry entry : this.f81217.entrySet()) {
            C3615 c3615 = (C3615) entry.getKey();
            if (c3615.m11731() && c3615.m11732().equals(str)) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55988(C3615 c3615, String str) {
        this.f81217.put(c3615, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m55989(C3615 c3615) {
        return this.f81217.containsKey(c3615);
    }
}
