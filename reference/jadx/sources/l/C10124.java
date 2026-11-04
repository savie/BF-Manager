package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۢ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ID */
/* JADX INFO: loaded from: classes4.dex */
public final class C10124 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1176 f32406;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20567 f32407;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10124(C1176 c1176, AbstractActivityC17204 abstractActivityC17204, C20567 c20567) {
        super(abstractActivityC17204, -1);
        this.f32406 = c1176;
        this.f32407 = c20567;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        m22951();
        String strM22914 = m22914();
        if (strM22914.isEmpty()) {
            return;
        }
        C20567 c20567 = this.f32407;
        if (strM22914.equals(c20567.f65866)) {
            return;
        }
        try {
            c20567.f65865.m49879(strM22914);
        } catch (IOException unused) {
        }
        C1176 c1176 = this.f32406;
        c1176.f4308 = c1176.f4310.m30840();
        c1176.f4311.notifyDataSetChanged();
    }
}
