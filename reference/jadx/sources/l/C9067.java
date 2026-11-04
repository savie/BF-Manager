package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6CU */
/* JADX INFO: loaded from: classes4.dex */
public final class C9067 extends AbstractC0118 implements InterfaceC3297 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC6281 f29469;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC6281 f29470;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6281 m24203() {
        return this.f29469;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24202(C12050 c12050) {
        this.f29469 = c12050;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6281 m24200() {
        return this.f29470;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24199(C12050 c12050) {
        this.f29470 = c12050;
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final void m24201() {
        m1255();
        InterfaceC6281 interfaceC6281 = this.f29469;
        this.f29469 = this.f29470;
        this.f29470 = interfaceC6281;
    }

    @Override // l.InterfaceC18213
    /* JADX INFO: renamed from: ܿ */
    public final List mo19035() {
        List listMo1257 = mo1257();
        ArrayList arrayList = new ArrayList(listMo1257.size() + 2);
        arrayList.addAll(listMo1257);
        InterfaceC6281 interfaceC6281 = this.f29469;
        if (interfaceC6281 != null) {
            arrayList.add(interfaceC6281);
        }
        InterfaceC6281 interfaceC6282 = this.f29470;
        if (interfaceC6282 != null) {
            arrayList.add(interfaceC6282);
        }
        return C4681.unmodifiableList(arrayList);
    }

    @Override // l.AbstractC20255, l.InterfaceC3297
    /* JADX INFO: renamed from: ۧ */
    public final List mo10884() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f29469);
        arrayList.add(this.f29470);
        return C4681.unmodifiableList(arrayList);
    }

    @Override // l.AbstractC20255, l.InterfaceC18213
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19029(InterfaceC6281 interfaceC6281, InterfaceC6281 interfaceC6282) {
        if (interfaceC6281 == this.f29469) {
            this.f29469 = interfaceC6282;
            AbstractC20255.m46530(interfaceC6282, (AbstractC20255) this);
            return true;
        }
        if (interfaceC6281 != this.f29470) {
            return false;
        }
        this.f29470 = interfaceC6282;
        AbstractC20255.m46530(interfaceC6282, (AbstractC20255) this);
        return true;
    }

    @Override // l.AbstractC20255, l.InterfaceC6281
    /* JADX INFO: renamed from: ۙ */
    public final void mo1987(C13476 c13476, InterfaceC3145 interfaceC3145) {
        c13476.m33155(this, interfaceC3145, true);
    }

    @Override // l.InterfaceC6281
    /* JADX INFO: renamed from: ᩻ */
    public final String mo1988() {
        StringBuilder sb = new StringBuilder();
        InterfaceC6281 interfaceC6281 = this.f29469;
        if (interfaceC6281 != null) {
            sb.append(interfaceC6281.mo1988());
        }
        InterfaceC6281 interfaceC6282 = this.f29470;
        if (interfaceC6282 != null) {
            sb.append(interfaceC6282.mo1988());
        }
        return sb.toString();
    }

    public final String toString() {
        return "IF " + mo1257() + " THEN: " + this.f29469 + " ELSE: " + this.f29470;
    }
}
