package l;

import java.io.IOException;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.᩵᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7IH */
/* JADX INFO: loaded from: classes5.dex */
public class C20787 extends AbstractC14819 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f66590 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final UnaryOperator f66591;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18549 f66592;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC17803 f66593;

    public C20787(C3633 c3633) {
        super(c3633);
        this.f66593 = c3633.m53050();
        c3633.getClass();
        this.f66592 = c3633.m53054();
        this.f66591 = c3633.m53053();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20787) {
            return C17359.equals(this.f66593, ((C20787) obj).f66593);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17803 m47571() {
        return this.f66593;
    }

    public int hashCode() {
        return C17359.hash(this.f66593);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo18549(InterfaceC24329 interfaceC24329, IOException iOException) {
        ((C2142) this.f66593).mo7397().mo29683();
        EnumC16123 enumC16123 = EnumC16123.CONTINUE;
    }

    /* JADX INFO: renamed from: ۙ */
    public EnumC16123 mo18548(InterfaceC24329 interfaceC24329, InterfaceC8665 interfaceC8665) {
        this.f66592.getClass();
        return EnumC16123.CONTINUE;
    }

    public final String toString() {
        return this.f66593.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47572(InterfaceC8665 interfaceC8665) {
        C2142 c2142 = (C2142) this.f66593;
        c2142.mo7399().mo29683();
        c2142.m7398().add(interfaceC8665.size());
    }
}
