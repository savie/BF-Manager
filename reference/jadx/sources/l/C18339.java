package l;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩳ᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C18339 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20456 f58507;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f58506 = new LinkedHashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f58508 = new LinkedHashMap();

    public C18339(C20456 c20456) {
        this.f58507 = c20456;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42590(C11990 c11990) {
        this.f58506.put(c11990.f40190, c11990);
        Iterator it = c11990.f40189.iterator();
        while (it.hasNext()) {
            this.f58508.put(C20456.m46261((InterfaceC3800) it.next()), c11990);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42595(C11990 c11990) {
        LinkedHashMap linkedHashMap = this.f58508;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((Map.Entry) it.next()).getValue() == c11990) {
                it.remove();
            }
        }
        Iterator it2 = c11990.f40189.iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(C20456.m46261((InterfaceC3800) it2.next()), c11990);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11990 m42588(String str) {
        return (C11990) this.f58506.get(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11990 m42594(InterfaceC3800 interfaceC3800) {
        while (interfaceC3800 != null) {
            C11990 c11990 = (C11990) this.f58508.get(interfaceC3800);
            if (c11990 != null) {
                return c11990;
            }
            interfaceC3800 = interfaceC3800.getParent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42589() {
        this.f58506.clear();
        this.f58508.clear();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m42592() {
        return this.f58506.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42591(InterfaceC3800 interfaceC3800) {
        return C20456.m46266(this.f58507, this.f58508.keySet(), interfaceC3800);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Set m42587() {
        return C0561.unmodifiableSet((Set) C9030.stream(this.f58506.values()).collect(C1890.toSet()));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Set m42593() {
        return C0561.unmodifiableSet((Set) C9030.stream(this.f58506.entrySet()).filter(new C15518()).map(new C21867()).collect(C1890.toSet()));
    }
}
