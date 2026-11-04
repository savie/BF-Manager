package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 76DY */
/* JADX INFO: loaded from: classes.dex */
public final class C23844 extends AbstractC6683 {
    @Override // l.AbstractC6683, l.InterfaceC14892
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo7323(C2551 c2551, InterfaceC18213 interfaceC18213) {
        C21943 c21943M19032;
        if ((interfaceC18213 instanceof C6831) && (c21943M19032 = ((C6831) interfaceC18213).m19032()) != null && !c21943M19032.mo17865(EnumC1763.ALLOW_MULTIPLE_INSNS_LOOP_COND) && ((ArrayList) c21943M19032.mo1986()).size() != 1) {
            c2551.m31136("Incorrect condition in loop: " + c21943M19032);
        }
        return true;
    }
}
