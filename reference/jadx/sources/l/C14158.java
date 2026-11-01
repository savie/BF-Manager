package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ܰ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 44QG */
/* JADX INFO: loaded from: classes4.dex */
public final class C14158 extends AbstractC2679 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f46465;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f46466;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f46467;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17684 f46468;

    public C14158(C17684 c17684, int i) {
        this.f46468 = c17684;
        C18825 c18825M42184 = c17684.m41166().m42184(i);
        this.f46466 = c18825M42184.m43453();
        this.f46467 = c18825M42184.m43449();
        this.f46465 = c18825M42184.m43447();
        c18825M42184.m43450();
    }

    @Override // l.InterfaceC3710
    public final int getVisibility() {
        return this.f46466;
    }

    @Override // l.InterfaceC3710
    public final String getType() {
        return this.f46468.m41204(this.f46467);
    }

    @Override // l.InterfaceC3710
    public final Set getElements() {
        C17684 c17684 = this.f46468;
        C18825 c18825M42184 = c17684.m41166().m42184(this.f46465);
        int iM43449 = c18825M42184.m43449();
        int iM43447 = c18825M42184.m43447();
        c18825M42184.m43450();
        return new C4984(this, c17684, iM43447, iM43449);
    }
}
