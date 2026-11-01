package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C1V2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21588 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f70046 = new HashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f70047;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f70048;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18735 m48302(C11992 c11992, InterfaceC18735 interfaceC18735, C20178 c20178) {
        String str = (String) this.f70046.get(new C9014(interfaceC18735.getName(), AbstractC11836.m29530(interfaceC18735, c20178), false));
        if (str == null) {
            return null;
        }
        return new C23000(c11992, interfaceC18735, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8858 m48301(C11992 c11992, InterfaceC8858 interfaceC8858, C20178 c20178) {
        String str = (String) this.f70046.get(new C9014(interfaceC8858.getName(), AbstractC11836.m29529(interfaceC8858, c20178), true));
        if (str == null) {
            return null;
        }
        return new C15239(c11992, interfaceC8858, str);
    }

    public C21588(String str, String str2) {
        this.f70047 = str;
        this.f70048 = str2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m48305() {
        return this.f70047;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m48299() {
        return this.f70048;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m48300(String str) {
        for (Map.Entry entry : this.f70046.entrySet()) {
            C9014 c9014 = (C9014) entry.getKey();
            if (!c9014.m23332() && c9014.m23333().equals(str)) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m48306(String str) {
        for (Map.Entry entry : this.f70046.entrySet()) {
            C9014 c9014 = (C9014) entry.getKey();
            if (c9014.m23332() && c9014.m23333().equals(str)) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48303(C9014 c9014, String str) {
        this.f70046.put(c9014, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48304(C9014 c9014) {
        return this.f70046.containsKey(c9014);
    }
}
