package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5RS */
/* JADX INFO: loaded from: classes.dex */
public final class C23530 extends C11452 implements InterfaceC9605 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f76195;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4956 m51844(InterfaceC19441 interfaceC19441) {
        return ((C17179) interfaceC19441).f54765;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C3067 m51845(InterfaceC19441 interfaceC19441) {
        return ((C17179) interfaceC19441).f54764;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1428 m51846(InterfaceC19441 interfaceC19441) {
        return ((C17179) interfaceC19441).f54762;
    }

    @Override // l.InterfaceC16660
    /* JADX INFO: renamed from: ᩹ */
    public final int mo24178(Object obj) {
        return ((C17179) obj).f54763;
    }

    public C23530(C8485 c8485) {
        super(c8485);
        this.f76195 = new ConcurrentMapC13783();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17179 m51843(InterfaceC19441 interfaceC19441) {
        String string = interfaceC19441.toString();
        ConcurrentMapC13783 concurrentMapC13783 = this.f76195;
        C17179 c17179 = (C17179) concurrentMapC13783.get(string);
        if (c17179 != null) {
            return c17179;
        }
        C8485 c8485 = this.f38553;
        C9419 c9419 = (C9419) c8485.f51669;
        List<CharSequence> listMo1999 = interfaceC19441.mo1999();
        String strMo1995 = interfaceC19441.mo1995();
        InterfaceC19010 interfaceC19010 = C5370.f18561;
        StringBuilder sb = new StringBuilder(listMo1999.size() + 1);
        sb.append(strMo1995.length() > 1 ? 'L' : strMo1995.charAt(0));
        for (CharSequence charSequence : listMo1999) {
            sb.append(charSequence.length() > 1 ? 'L' : charSequence.charAt(0));
        }
        C17179 c171710 = new C17179(c9419.m24176(sb.toString()), ((C2839) c8485.f51675).m8598(interfaceC19441.mo1999()), c8485.f51666.m50097(interfaceC19441.mo1995()));
        C17179 c171711 = (C17179) concurrentMapC13783.putIfAbsent(string, c171710);
        return c171711 == null ? c171710 : c171711;
    }

    @Override // l.InterfaceC16660
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo1279() {
        return new C10830(this.f76195.values());
    }

    @Override // l.InterfaceC16660
    public final int getItemCount() {
        return this.f76195.size();
    }
}
