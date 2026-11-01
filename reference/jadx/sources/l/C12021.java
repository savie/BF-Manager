package l;

import java.io.IOException;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ۨ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B7IH */
/* JADX INFO: loaded from: classes4.dex */
public class C12021 extends AbstractC13432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f40264 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final UnaryOperator f40265;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9427 f40266;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21898 f40267;

    public C12021(C14138 c14138) {
        super(c14138);
        this.f40266 = c14138.m13761();
        c14138.getClass();
        this.f40267 = c14138.m13762();
        this.f40265 = c14138.m13765();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12021) {
            return C13638.equals(this.f40266, ((C12021) obj).f40266);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9427 m29920() {
        return this.f40266;
    }

    public int hashCode() {
        return C13638.hash(this.f40266);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo15561(InterfaceC3800 interfaceC3800, IOException iOException) {
        ((C10838) this.f40266).mo24187().mo34603();
        EnumC11563 enumC11563 = EnumC11563.CONTINUE;
    }

    /* JADX INFO: renamed from: ۙ */
    public EnumC11563 mo15560(InterfaceC3800 interfaceC3800, InterfaceC20735 interfaceC20735) {
        this.f40267.getClass();
        return EnumC11563.CONTINUE;
    }

    public final String toString() {
        return this.f40266.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29921(InterfaceC20735 interfaceC20735) {
        C10838 c10838 = (C10838) this.f40266;
        c10838.mo24188().mo34603();
        c10838.m27161().add(interfaceC20735.size());
    }
}
