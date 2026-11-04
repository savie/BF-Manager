package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗ۟ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6IN */
/* JADX INFO: loaded from: classes2.dex */
public class C3254 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Map f10589;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumSet f10591 = EnumSet.noneOf(EnumC1763.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Map f10590 = f10589;

    static {
        int length = EnumC1763.values().length;
        if (length >= 64) {
            throw new C8597(C13645.m33382(length, "Try to reduce flags count to 64 for use one long in EnumSet, now "));
        }
        f10589 = Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10619(EnumC1763 enumC1763) {
        this.f10591.add(enumC1763);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10621(InterfaceC11851 interfaceC11851) {
        m10614(new C17424(0, interfaceC11851));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10618(List list) {
        m10614(new C12130(2, list));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10620(C3254 c3254) {
        this.f10591.addAll(c3254.f10591);
        if (c3254.f10590.isEmpty()) {
            return;
        }
        m10614(new C15932(0, c3254));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean mo10628(EnumC1763 enumC1763) {
        return this.f10591.contains(enumC1763);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo10622(InterfaceC2157 interfaceC2157) {
        return this.f10590.containsKey(interfaceC2157);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC11851 mo10627(InterfaceC2157 interfaceC2157) {
        return (InterfaceC11851) this.f10590.get(interfaceC2157);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List mo10616(C11457 c11457) {
        C24884 c24884 = (C24884) mo10627(c11457);
        if (c24884 == null) {
            return Collections.EMPTY_LIST;
        }
        return C4681.unmodifiableList(c24884.m55414());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo10623(EnumC1763 enumC1763) {
        this.f10591.remove(enumC1763);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10617() {
        this.f10591.clear();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo10624(InterfaceC2157 interfaceC2157) {
        if (this.f10590.isEmpty()) {
            return;
        }
        m10614(new C7678(1, interfaceC2157));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10614(Consumer consumer) {
        synchronized (this) {
            Map map = this.f10590;
            Map map2 = f10589;
            if (map == map2) {
                this.f10590 = new IdentityHashMap(2);
            }
            consumer.accept(this.f10590);
            if (this.f10590.isEmpty()) {
                this.f10590 = map2;
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m10629() {
        if (this.f10590.isEmpty()) {
            return;
        }
        m10614(new C23392());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List mo10626() {
        EnumSet enumSet = this.f10591;
        int size = this.f10590.size() + enumSet.size();
        if (size == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((EnumC1763) it.next()).toString());
        }
        Iterator it2 = this.f10590.values().iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC11851) it2.next()).mo1790());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean mo10625() {
        return this.f10591.isEmpty() && this.f10590.isEmpty();
    }

    public String toString() {
        List listMo10626 = mo10626();
        if (listMo10626.isEmpty()) {
            return "";
        }
        C12884.sort(listMo10626, new C0187(0));
        return "A[" + C4123.m13221(listMo10626, ", ") + ']';
    }
}
