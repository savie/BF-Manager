package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܿۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86CQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18017 extends AbstractC20255 implements InterfaceC3297 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Map f58978;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C12050 f58979;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC18213 f58980;

    public C18017(InterfaceC18213 interfaceC18213, C12050 c12050) {
        super(interfaceC18213);
        this.f58978 = Collections.EMPTY_MAP;
        this.f58979 = c12050;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41997(C12971 c12971) {
        this.f58978 = new LinkedHashMap(c12971.m32376());
        for (C19684 c19684 : c12971.m32377()) {
            InterfaceC18213 interfaceC18213M45364 = c19684.m45364();
            if (interfaceC18213M45364 != null) {
                if (c19684.m45376()) {
                    this.f58980 = interfaceC18213M45364;
                } else {
                    this.f58978.put(c19684, interfaceC18213M45364);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6281 m41998() {
        return this.f58979;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Map m41996() {
        return this.f58978;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC18213 m41999() {
        return this.f58980;
    }

    @Override // l.InterfaceC18213
    /* JADX INFO: renamed from: ܿ */
    public final List mo19035() {
        ArrayList arrayList = new ArrayList(this.f58978.size() + 2);
        arrayList.add(this.f58979);
        arrayList.addAll(this.f58978.values());
        InterfaceC18213 interfaceC18213 = this.f58980;
        if (interfaceC18213 != null) {
            arrayList.add(interfaceC18213);
        }
        return C4681.unmodifiableList(arrayList);
    }

    @Override // l.AbstractC20255, l.InterfaceC6281
    /* JADX INFO: renamed from: ۙ */
    public final void mo1987(C13476 c13476, InterfaceC3145 interfaceC3145) {
        c13476.m33157(this, interfaceC3145);
    }

    @Override // l.InterfaceC6281
    /* JADX INFO: renamed from: ᩻ */
    public final String mo1988() {
        return this.f58979.mo1988();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Try: ");
        sb.append(this.f58979);
        if (!this.f58978.isEmpty()) {
            sb.append(" catches: ");
            sb.append(C4123.m13221(this.f58978.values(), ", "));
        }
        if (this.f58980 != null) {
            sb.append(" finally: ");
            sb.append(this.f58980);
        }
        return sb.toString();
    }
}
